package org.codehaus.jackson.map.deser;

import com.tencent.mm.sdk.message.RMsgInfoDB;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.AbstractTypeResolver;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.AnnotationIntrospector.ReferenceProperty;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.BeanProperty.Std;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializerFactory;
import org.codehaus.jackson.map.DeserializerFactory.Config;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.Deserializers;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.KeyDeserializers;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.SettableBeanProperty.FieldProperty;
import org.codehaus.jackson.map.deser.SettableBeanProperty.MethodProperty;
import org.codehaus.jackson.map.deser.SettableBeanProperty.SetterlessProperty;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.introspect.AnnotatedConstructor;
import org.codehaus.jackson.map.introspect.AnnotatedField;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.AnnotatedParameter;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.introspect.VisibilityChecker;
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.type.CollectionLikeType;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.map.type.MapLikeType;
import org.codehaus.jackson.map.type.MapType;
import org.codehaus.jackson.map.util.ArrayBuilders;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.type.JavaType;

public class BeanDeserializerFactory extends BasicDeserializerFactory {
    private static final Class<?>[] INIT_CAUSE_PARAMS = new Class[]{Throwable.class};
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(null);
    protected final Config _factoryConfig;

    @Deprecated
    public BeanDeserializerFactory() {
        this(null);
    }

    public BeanDeserializerFactory(Config config) {
        if (config == null) {
            config = new ConfigImpl();
        }
        this._factoryConfig = config;
    }

    protected void _addDeserializerConstructors(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorContainer creatorContainer) {
        for (AnnotatedConstructor annotatedConstructor : basicBeanDescription.getConstructors()) {
            int parameterCount = annotatedConstructor.getParameterCount();
            if (parameterCount >= 1) {
                boolean hasCreatorAnnotation = annotationIntrospector.hasCreatorAnnotation(annotatedConstructor);
                boolean isCreatorVisible = visibilityChecker.isCreatorVisible(annotatedConstructor);
                String findPropertyNameForParam;
                AnnotatedParameter parameter;
                if (parameterCount == 1) {
                    findPropertyNameForParam = annotationIntrospector.findPropertyNameForParam(annotatedConstructor.getParameter(0));
                    if (findPropertyNameForParam == null || findPropertyNameForParam.length() == 0) {
                        Class parameterClass = annotatedConstructor.getParameterClass(0);
                        if (parameterClass == String.class) {
                            if (hasCreatorAnnotation || isCreatorVisible) {
                                creatorContainer.addStringConstructor(annotatedConstructor);
                            }
                        } else if (parameterClass == Integer.TYPE || parameterClass == Integer.class) {
                            if (hasCreatorAnnotation || isCreatorVisible) {
                                creatorContainer.addIntConstructor(annotatedConstructor);
                            }
                        } else if (parameterClass == Long.TYPE || parameterClass == Long.class) {
                            if (hasCreatorAnnotation || isCreatorVisible) {
                                creatorContainer.addLongConstructor(annotatedConstructor);
                            }
                        } else if (hasCreatorAnnotation) {
                            creatorContainer.addDelegatingConstructor(annotatedConstructor);
                        }
                    } else {
                        creatorContainer.addPropertyConstructor(annotatedConstructor, new SettableBeanProperty[]{constructCreatorProperty(deserializationConfig, basicBeanDescription, findPropertyNameForParam, 0, parameter)});
                    }
                } else if (hasCreatorAnnotation || isCreatorVisible) {
                    SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[parameterCount];
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (i < parameterCount) {
                        parameter = annotatedConstructor.getParameter(i);
                        findPropertyNameForParam = parameter == null ? null : annotationIntrospector.findPropertyNameForParam(parameter);
                        int i4 = (findPropertyNameForParam == null || findPropertyNameForParam.length() == 0) ? 1 : 0;
                        int i5 = i3 | i4;
                        int i6 = i2 | (i5 == 0 ? 1 : 0);
                        if (i5 == 0 || (i6 == 0 && !hasCreatorAnnotation)) {
                            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationConfig, basicBeanDescription, findPropertyNameForParam, i, parameter);
                            i++;
                            i3 = i5;
                            i2 = i6;
                        } else {
                            throw new IllegalArgumentException("Argument #" + i + " of constructor " + annotatedConstructor + " has no property name annotation; must have name when multiple-paramater constructor annotated as Creator");
                        }
                    }
                    if (i2 != 0) {
                        creatorContainer.addPropertyConstructor(annotatedConstructor, settableBeanPropertyArr);
                    }
                }
            }
        }
    }

    protected void _addDeserializerFactoryMethods(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorContainer creatorContainer) {
        for (AnnotatedMethod annotatedMethod : basicBeanDescription.getFactoryMethods()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount >= 1) {
                boolean hasCreatorAnnotation = annotationIntrospector.hasCreatorAnnotation(annotatedMethod);
                if (parameterCount == 1) {
                    String findPropertyNameForParam = annotationIntrospector.findPropertyNameForParam(annotatedMethod.getParameter(0));
                    if (findPropertyNameForParam == null || findPropertyNameForParam.length() == 0) {
                        Class parameterClass = annotatedMethod.getParameterClass(0);
                        if (parameterClass == String.class) {
                            if (hasCreatorAnnotation || visibilityChecker.isCreatorVisible(annotatedMethod)) {
                                creatorContainer.addStringFactory(annotatedMethod);
                            }
                        } else if (parameterClass == Integer.TYPE || parameterClass == Integer.class) {
                            if (hasCreatorAnnotation || visibilityChecker.isCreatorVisible(annotatedMethod)) {
                                creatorContainer.addIntFactory(annotatedMethod);
                            }
                        } else if (parameterClass == Long.TYPE || parameterClass == Long.class) {
                            if (hasCreatorAnnotation || visibilityChecker.isCreatorVisible(annotatedMethod)) {
                                creatorContainer.addLongFactory(annotatedMethod);
                            }
                        } else if (annotationIntrospector.hasCreatorAnnotation(annotatedMethod)) {
                            creatorContainer.addDelegatingFactory(annotatedMethod);
                        }
                    }
                } else if (!annotationIntrospector.hasCreatorAnnotation(annotatedMethod)) {
                    continue;
                }
                SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[parameterCount];
                for (int i = 0; i < parameterCount; i++) {
                    AnnotatedParameter parameter = annotatedMethod.getParameter(i);
                    String findPropertyNameForParam2 = annotationIntrospector.findPropertyNameForParam(parameter);
                    if (findPropertyNameForParam2 == null || findPropertyNameForParam2.length() == 0) {
                        throw new IllegalArgumentException("Argument #" + i + " of factory method " + annotatedMethod + " has no property name annotation; must have when multiple-paramater static method annotated as Creator");
                    }
                    settableBeanPropertyArr[i] = constructCreatorProperty(deserializationConfig, basicBeanDescription, findPropertyNameForParam2, i, parameter);
                }
                creatorContainer.addPropertyFactory(annotatedMethod, settableBeanPropertyArr);
            }
        }
    }

    protected JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, BeanProperty beanProperty, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findArrayDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findArrayDeserializer2 = findArrayDeserializer.findArrayDeserializer(arrayType, deserializationConfig, deserializerProvider, beanProperty, typeDeserializer, jsonDeserializer);
            if (findArrayDeserializer2 != null) {
                return findArrayDeserializer2;
            }
        }
        return null;
    }

    protected JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, BasicBeanDescription basicBeanDescription, BeanProperty beanProperty) {
        for (Deserializers findBeanDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<Object> findBeanDeserializer2 = findBeanDeserializer.findBeanDeserializer(javaType, deserializationConfig, deserializerProvider, basicBeanDescription, beanProperty);
            if (findBeanDeserializer2 != null) {
                return findBeanDeserializer2;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, BasicBeanDescription basicBeanDescription, BeanProperty beanProperty, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findCollectionDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionDeserializer2 = findCollectionDeserializer.findCollectionDeserializer(collectionType, deserializationConfig, deserializerProvider, basicBeanDescription, beanProperty, typeDeserializer, jsonDeserializer);
            if (findCollectionDeserializer2 != null) {
                return findCollectionDeserializer2;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, BasicBeanDescription basicBeanDescription, BeanProperty beanProperty, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findCollectionLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionLikeDeserializer2 = findCollectionLikeDeserializer.findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, deserializerProvider, basicBeanDescription, beanProperty, typeDeserializer, jsonDeserializer);
            if (findCollectionLikeDeserializer2 != null) {
                return findCollectionLikeDeserializer2;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription, BeanProperty beanProperty) {
        for (Deserializers findEnumDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findEnumDeserializer2 = findEnumDeserializer.findEnumDeserializer(cls, deserializationConfig, basicBeanDescription, beanProperty);
            if (findEnumDeserializer2 != null) {
                return findEnumDeserializer2;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, BasicBeanDescription basicBeanDescription, BeanProperty beanProperty, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findMapDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapDeserializer2 = findMapDeserializer.findMapDeserializer(mapType, deserializationConfig, deserializerProvider, basicBeanDescription, beanProperty, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapDeserializer2 != null) {
                return findMapDeserializer2;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, BasicBeanDescription basicBeanDescription, BeanProperty beanProperty, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findMapLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapLikeDeserializer2 = findMapLikeDeserializer.findMapLikeDeserializer(mapLikeType, deserializationConfig, deserializerProvider, basicBeanDescription, beanProperty, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapLikeDeserializer2 != null) {
                return findMapLikeDeserializer2;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, BeanProperty beanProperty) {
        for (Deserializers findTreeNodeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findTreeNodeDeserializer2 = findTreeNodeDeserializer.findTreeNodeDeserializer(cls, deserializationConfig, beanProperty);
            if (findTreeNodeDeserializer2 != null) {
                return findTreeNodeDeserializer2;
            }
        }
        return null;
    }

    protected JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) {
        JavaType findTypeMapping;
        Class rawClass = javaType.getRawClass();
        if (this._factoryConfig.hasAbstractTypeResolvers()) {
            for (AbstractTypeResolver findTypeMapping2 : this._factoryConfig.abstractTypeResolvers()) {
                findTypeMapping = findTypeMapping2.findTypeMapping(deserializationConfig, javaType);
                if (findTypeMapping != null && findTypeMapping.getRawClass() != rawClass) {
                    return findTypeMapping;
                }
            }
        }
        AbstractTypeResolver findTypeMapping22 = deserializationConfig.getAbstractTypeResolver();
        if (findTypeMapping22 != null) {
            findTypeMapping = findTypeMapping22.findTypeMapping(deserializationConfig, javaType);
            if (!(findTypeMapping == null || findTypeMapping.getRawClass() == rawClass)) {
                return findTypeMapping;
            }
        }
        return null;
    }

    protected void addBeanProps(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        VisibilityChecker defaultVisibilityChecker = deserializationConfig.getDefaultVisibilityChecker();
        if (!deserializationConfig.isEnabled(Feature.AUTO_DETECT_SETTERS)) {
            defaultVisibilityChecker = defaultVisibilityChecker.withSetterVisibility(Visibility.NONE);
        }
        if (!deserializationConfig.isEnabled(Feature.AUTO_DETECT_FIELDS)) {
            defaultVisibilityChecker = defaultVisibilityChecker.withFieldVisibility(Visibility.NONE);
        }
        VisibilityChecker findAutoDetectVisibility = deserializationConfig.getAnnotationIntrospector().findAutoDetectVisibility(basicBeanDescription.getClassInfo(), defaultVisibilityChecker);
        Map findSetters = basicBeanDescription.findSetters(findAutoDetectVisibility);
        AnnotatedMethod findAnySetter = basicBeanDescription.findAnySetter();
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        Boolean findIgnoreUnknownProperties = annotationIntrospector.findIgnoreUnknownProperties(basicBeanDescription.getClassInfo());
        if (findIgnoreUnknownProperties != null) {
            beanDeserializerBuilder.setIgnoreUnknownProperties(findIgnoreUnknownProperties.booleanValue());
        }
        HashSet arrayToSet = ArrayBuilders.arrayToSet(annotationIntrospector.findPropertiesToIgnore(basicBeanDescription.getClassInfo()));
        Iterator it = arrayToSet.iterator();
        while (it.hasNext()) {
            beanDeserializerBuilder.addIgnorable((String) it.next());
        }
        AnnotatedClass classInfo = basicBeanDescription.getClassInfo();
        for (AnnotatedMethod okNameForSetter : classInfo.ignoredMemberMethods()) {
            AnnotatedMethod okNameForSetter2;
            String okNameForSetter3 = basicBeanDescription.okNameForSetter(okNameForSetter2);
            if (okNameForSetter3 != null) {
                beanDeserializerBuilder.addIgnorable(okNameForSetter3);
            }
        }
        for (AnnotatedField name : classInfo.ignoredFields()) {
            AnnotatedField name2;
            beanDeserializerBuilder.addIgnorable(name2.getName());
        }
        Map hashMap = new HashMap();
        for (Entry entry : findSetters.entrySet()) {
            SettableBeanProperty constructSettableProperty;
            String str = (String) entry.getKey();
            if (!arrayToSet.contains(str)) {
                okNameForSetter2 = (AnnotatedMethod) entry.getValue();
                if (isIgnorableType(deserializationConfig, basicBeanDescription, okNameForSetter2.getParameterClass(0), hashMap)) {
                    beanDeserializerBuilder.addIgnorable(str);
                } else {
                    constructSettableProperty = constructSettableProperty(deserializationConfig, basicBeanDescription, str, okNameForSetter2);
                    if (constructSettableProperty != null) {
                        beanDeserializerBuilder.addProperty(constructSettableProperty);
                    }
                }
            }
        }
        if (findAnySetter != null) {
            beanDeserializerBuilder.setAnySetter(constructAnySetter(deserializationConfig, basicBeanDescription, findAnySetter));
        }
        Object hashSet = new HashSet(findSetters.keySet());
        for (Entry entry2 : basicBeanDescription.findDeserializableFields(findAutoDetectVisibility, hashSet).entrySet()) {
            str = (String) entry2.getKey();
            if (!(arrayToSet.contains(str) || beanDeserializerBuilder.hasProperty(str))) {
                name2 = (AnnotatedField) entry2.getValue();
                if (isIgnorableType(deserializationConfig, basicBeanDescription, name2.getRawType(), hashMap)) {
                    beanDeserializerBuilder.addIgnorable(str);
                } else {
                    constructSettableProperty = constructSettableProperty(deserializationConfig, basicBeanDescription, str, name2);
                    if (constructSettableProperty != null) {
                        beanDeserializerBuilder.addProperty(constructSettableProperty);
                        hashSet.add(str);
                    }
                }
            }
        }
        if (deserializationConfig.isEnabled(Feature.USE_GETTERS_AS_SETTERS)) {
            for (Entry entry22 : basicBeanDescription.findGetters(findAutoDetectVisibility, hashSet).entrySet()) {
                AnnotatedMethod annotatedMethod = (AnnotatedMethod) entry22.getValue();
                Class rawType = annotatedMethod.getRawType();
                if (Collection.class.isAssignableFrom(rawType) || Map.class.isAssignableFrom(rawType)) {
                    okNameForSetter3 = (String) entry22.getKey();
                    if (!(arrayToSet.contains(okNameForSetter3) || beanDeserializerBuilder.hasProperty(okNameForSetter3))) {
                        beanDeserializerBuilder.addProperty(constructSetterlessProperty(deserializationConfig, basicBeanDescription, okNameForSetter3, annotatedMethod));
                        hashSet.add(okNameForSetter3);
                    }
                }
            }
        }
    }

    protected void addReferenceProperties(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        Map findBackReferenceProperties = basicBeanDescription.findBackReferenceProperties();
        if (findBackReferenceProperties != null) {
            for (Entry entry : findBackReferenceProperties.entrySet()) {
                String str = (String) entry.getKey();
                AnnotatedMember annotatedMember = (AnnotatedMember) entry.getValue();
                if (annotatedMember instanceof AnnotatedMethod) {
                    beanDeserializerBuilder.addBackReferenceProperty(str, constructSettableProperty(deserializationConfig, basicBeanDescription, annotatedMember.getName(), (AnnotatedMethod) annotatedMember));
                } else {
                    beanDeserializerBuilder.addBackReferenceProperty(str, constructSettableProperty(deserializationConfig, basicBeanDescription, annotatedMember.getName(), (AnnotatedField) annotatedMember));
                }
            }
        }
    }

    public JsonDeserializer<Object> buildBeanDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BasicBeanDescription basicBeanDescription, BeanProperty beanProperty) {
        if (javaType.isAbstract()) {
            return new AbstractDeserializer(javaType);
        }
        BeanDeserializerBuilder beanDeserializerBuilder;
        BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(basicBeanDescription);
        constructBeanDeserializerBuilder.setCreators(findDeserializerCreators(deserializationConfig, basicBeanDescription));
        addBeanProps(deserializationConfig, basicBeanDescription, constructBeanDeserializerBuilder);
        addReferenceProperties(deserializationConfig, basicBeanDescription, constructBeanDeserializerBuilder);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            beanDeserializerBuilder = constructBeanDeserializerBuilder;
            for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                beanDeserializerBuilder = updateBuilder.updateBuilder(deserializationConfig, basicBeanDescription, beanDeserializerBuilder);
            }
        } else {
            beanDeserializerBuilder = constructBeanDeserializerBuilder;
        }
        JsonDeserializer<Object> build = beanDeserializerBuilder.build(beanProperty);
        if (!this._factoryConfig.hasDeserializerModifiers()) {
            return build;
        }
        JsonDeserializer<Object> jsonDeserializer = build;
        for (BeanDeserializerModifier updateBuilder2 : this._factoryConfig.deserializerModifiers()) {
            jsonDeserializer = updateBuilder2.modifyDeserializer(deserializationConfig, basicBeanDescription, jsonDeserializer);
        }
        return jsonDeserializer;
    }

    public JsonDeserializer<Object> buildThrowableDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BasicBeanDescription basicBeanDescription, BeanProperty beanProperty) {
        BeanDeserializerBuilder beanDeserializerBuilder;
        BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(basicBeanDescription);
        constructBeanDeserializerBuilder.setCreators(findDeserializerCreators(deserializationConfig, basicBeanDescription));
        addBeanProps(deserializationConfig, basicBeanDescription, constructBeanDeserializerBuilder);
        AnnotatedMethod findMethod = basicBeanDescription.findMethod("initCause", INIT_CAUSE_PARAMS);
        if (findMethod != null) {
            SettableBeanProperty constructSettableProperty = constructSettableProperty(deserializationConfig, basicBeanDescription, "cause", findMethod);
            if (constructSettableProperty != null) {
                constructBeanDeserializerBuilder.addProperty(constructSettableProperty);
            }
        }
        constructBeanDeserializerBuilder.addIgnorable("localizedMessage");
        constructBeanDeserializerBuilder.addIgnorable(RMsgInfoDB.TABLE);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            beanDeserializerBuilder = constructBeanDeserializerBuilder;
            for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                beanDeserializerBuilder = updateBuilder.updateBuilder(deserializationConfig, basicBeanDescription, beanDeserializerBuilder);
            }
        } else {
            beanDeserializerBuilder = constructBeanDeserializerBuilder;
        }
        JsonDeserializer<Object> build = beanDeserializerBuilder.build(beanProperty);
        if (build instanceof BeanDeserializer) {
            build = new ThrowableDeserializer((BeanDeserializer) build);
        }
        if (!this._factoryConfig.hasDeserializerModifiers()) {
            return build;
        }
        JsonDeserializer<Object> jsonDeserializer = build;
        for (BeanDeserializerModifier updateBuilder2 : this._factoryConfig.deserializerModifiers()) {
            jsonDeserializer = updateBuilder2.modifyDeserializer(deserializationConfig, basicBeanDescription, jsonDeserializer);
        }
        return jsonDeserializer;
    }

    protected SettableAnyProperty constructAnySetter(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription, AnnotatedMethod annotatedMethod) {
        if (deserializationConfig.isEnabled(Feature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            annotatedMethod.fixAccess();
        }
        JavaType resolveType = basicBeanDescription.bindingsForBeanType().resolveType(annotatedMethod.getParameterType(1));
        BeanProperty std = new Std(annotatedMethod.getName(), resolveType, basicBeanDescription.getClassAnnotations(), annotatedMethod);
        JavaType resolveType2 = resolveType(deserializationConfig, basicBeanDescription, resolveType, annotatedMethod, std);
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationConfig, annotatedMethod, std);
        if (findDeserializerFromAnnotation == null) {
            return new SettableAnyProperty(std, annotatedMethod, modifyTypeByAnnotation(deserializationConfig, annotatedMethod, resolveType2, std.getName()));
        }
        SettableAnyProperty settableAnyProperty = new SettableAnyProperty(std, annotatedMethod, resolveType2);
        settableAnyProperty.setValueDeserializer(findDeserializerFromAnnotation);
        return settableAnyProperty;
    }

    protected BeanDeserializerBuilder constructBeanDeserializerBuilder(BasicBeanDescription basicBeanDescription) {
        return new BeanDeserializerBuilder(basicBeanDescription);
    }

    protected SettableBeanProperty constructSettableProperty(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription, String str, AnnotatedField annotatedField) {
        if (deserializationConfig.isEnabled(Feature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            annotatedField.fixAccess();
        }
        JavaType resolveType = basicBeanDescription.bindingsForBeanType().resolveType(annotatedField.getGenericType());
        BeanProperty std = new Std(str, resolveType, basicBeanDescription.getClassAnnotations(), annotatedField);
        JavaType resolveType2 = resolveType(deserializationConfig, basicBeanDescription, resolveType, annotatedField, std);
        if (resolveType2 != resolveType) {
            std = std.withType(resolveType2);
        }
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationConfig, annotatedField, std);
        JavaType modifyTypeByAnnotation = modifyTypeByAnnotation(deserializationConfig, annotatedField, resolveType2, str);
        SettableBeanProperty fieldProperty = new FieldProperty(str, modifyTypeByAnnotation, (TypeDeserializer) modifyTypeByAnnotation.getTypeHandler(), basicBeanDescription.getClassAnnotations(), annotatedField);
        if (findDeserializerFromAnnotation != null) {
            fieldProperty.setValueDeserializer(findDeserializerFromAnnotation);
        }
        ReferenceProperty findReferenceType = deserializationConfig.getAnnotationIntrospector().findReferenceType(annotatedField);
        if (findReferenceType != null && findReferenceType.isManagedReference()) {
            fieldProperty.setManagedReferenceName(findReferenceType.getName());
        }
        return fieldProperty;
    }

    protected SettableBeanProperty constructSettableProperty(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription, String str, AnnotatedMethod annotatedMethod) {
        if (deserializationConfig.isEnabled(Feature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            annotatedMethod.fixAccess();
        }
        JavaType resolveType = basicBeanDescription.bindingsForBeanType().resolveType(annotatedMethod.getParameterType(0));
        BeanProperty std = new Std(str, resolveType, basicBeanDescription.getClassAnnotations(), annotatedMethod);
        JavaType resolveType2 = resolveType(deserializationConfig, basicBeanDescription, resolveType, annotatedMethod, std);
        if (resolveType2 != resolveType) {
            std = std.withType(resolveType2);
        }
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationConfig, annotatedMethod, std);
        JavaType modifyTypeByAnnotation = modifyTypeByAnnotation(deserializationConfig, annotatedMethod, resolveType2, str);
        SettableBeanProperty methodProperty = new MethodProperty(str, modifyTypeByAnnotation, (TypeDeserializer) modifyTypeByAnnotation.getTypeHandler(), basicBeanDescription.getClassAnnotations(), annotatedMethod);
        if (findDeserializerFromAnnotation != null) {
            methodProperty.setValueDeserializer(findDeserializerFromAnnotation);
        }
        ReferenceProperty findReferenceType = deserializationConfig.getAnnotationIntrospector().findReferenceType(annotatedMethod);
        if (findReferenceType != null && findReferenceType.isManagedReference()) {
            methodProperty.setManagedReferenceName(findReferenceType.getName());
        }
        return methodProperty;
    }

    protected SettableBeanProperty constructSetterlessProperty(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription, String str, AnnotatedMethod annotatedMethod) {
        if (deserializationConfig.isEnabled(Feature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            annotatedMethod.fixAccess();
        }
        JavaType type = annotatedMethod.getType(basicBeanDescription.bindingsForBeanType());
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationConfig, annotatedMethod, new Std(str, type, basicBeanDescription.getClassAnnotations(), annotatedMethod));
        JavaType modifyTypeByAnnotation = modifyTypeByAnnotation(deserializationConfig, annotatedMethod, type, str);
        SettableBeanProperty setterlessProperty = new SetterlessProperty(str, modifyTypeByAnnotation, (TypeDeserializer) modifyTypeByAnnotation.getTypeHandler(), basicBeanDescription.getClassAnnotations(), annotatedMethod);
        if (findDeserializerFromAnnotation != null) {
            setterlessProperty.setValueDeserializer(findDeserializerFromAnnotation);
        }
        return setterlessProperty;
    }

    public JsonDeserializer<Object> createBeanDeserializer(DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, JavaType javaType, BeanProperty beanProperty) {
        if (javaType.isAbstract()) {
            javaType = mapAbstractType(deserializationConfig, javaType);
        }
        BasicBeanDescription basicBeanDescription = (BasicBeanDescription) deserializationConfig.introspect(javaType);
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationConfig, basicBeanDescription.getClassInfo(), beanProperty);
        if (findDeserializerFromAnnotation != null) {
            return findDeserializerFromAnnotation;
        }
        BasicBeanDescription basicBeanDescription2;
        JavaType modifyTypeByAnnotation = modifyTypeByAnnotation(deserializationConfig, basicBeanDescription.getClassInfo(), javaType, null);
        if (modifyTypeByAnnotation.getRawClass() != javaType.getRawClass()) {
            basicBeanDescription2 = (BasicBeanDescription) deserializationConfig.introspect(modifyTypeByAnnotation);
        } else {
            basicBeanDescription2 = basicBeanDescription;
            modifyTypeByAnnotation = javaType;
        }
        JsonDeserializer<Object> _findCustomBeanDeserializer = _findCustomBeanDeserializer(modifyTypeByAnnotation, deserializationConfig, deserializerProvider, basicBeanDescription2, beanProperty);
        if (_findCustomBeanDeserializer != null) {
            return _findCustomBeanDeserializer;
        }
        if (modifyTypeByAnnotation.isThrowable()) {
            return buildThrowableDeserializer(deserializationConfig, modifyTypeByAnnotation, basicBeanDescription2, beanProperty);
        }
        if (modifyTypeByAnnotation.isAbstract()) {
            JavaType materializeAbstractType = materializeAbstractType(deserializationConfig, basicBeanDescription2);
            if (materializeAbstractType != null) {
                return buildBeanDeserializer(deserializationConfig, materializeAbstractType, (BasicBeanDescription) deserializationConfig.introspect(materializeAbstractType), beanProperty);
            }
        }
        _findCustomBeanDeserializer = findStdBeanDeserializer(deserializationConfig, deserializerProvider, modifyTypeByAnnotation, beanProperty);
        return _findCustomBeanDeserializer == null ? !isPotentialBeanType(modifyTypeByAnnotation.getRawClass()) ? null : buildBeanDeserializer(deserializationConfig, modifyTypeByAnnotation, basicBeanDescription2, beanProperty) : _findCustomBeanDeserializer;
    }

    public KeyDeserializer createKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanProperty beanProperty) {
        if (this._factoryConfig.hasKeyDeserializers()) {
            BasicBeanDescription basicBeanDescription = (BasicBeanDescription) deserializationConfig.introspectClassAnnotations(javaType.getRawClass());
            for (KeyDeserializers findKeyDeserializer : this._factoryConfig.keyDeserializers()) {
                KeyDeserializer findKeyDeserializer2 = findKeyDeserializer.findKeyDeserializer(javaType, deserializationConfig, basicBeanDescription, beanProperty);
                if (findKeyDeserializer2 != null) {
                    return findKeyDeserializer2;
                }
            }
        }
        return null;
    }

    protected CreatorContainer findDeserializerCreators(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription) {
        boolean isEnabled = deserializationConfig.isEnabled(Feature.CAN_OVERRIDE_ACCESS_MODIFIERS);
        CreatorContainer creatorContainer = new CreatorContainer(basicBeanDescription, isEnabled);
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        if (basicBeanDescription.getType().isConcrete()) {
            Object findDefaultConstructor = basicBeanDescription.findDefaultConstructor();
            if (findDefaultConstructor != null) {
                if (isEnabled) {
                    ClassUtil.checkAndFixAccess(findDefaultConstructor);
                }
                creatorContainer.setDefaultConstructor(findDefaultConstructor);
            }
        }
        VisibilityChecker defaultVisibilityChecker = deserializationConfig.getDefaultVisibilityChecker();
        if (!deserializationConfig.isEnabled(Feature.AUTO_DETECT_CREATORS)) {
            defaultVisibilityChecker = defaultVisibilityChecker.withCreatorVisibility(Visibility.NONE);
        }
        VisibilityChecker findAutoDetectVisibility = deserializationConfig.getAnnotationIntrospector().findAutoDetectVisibility(basicBeanDescription.getClassInfo(), defaultVisibilityChecker);
        _addDeserializerConstructors(deserializationConfig, basicBeanDescription, findAutoDetectVisibility, annotationIntrospector, creatorContainer);
        _addDeserializerFactoryMethods(deserializationConfig, basicBeanDescription, findAutoDetectVisibility, annotationIntrospector, creatorContainer);
        return creatorContainer;
    }

    public final Config getConfig() {
        return this._factoryConfig;
    }

    protected boolean isIgnorableType(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean bool = (Boolean) map.get(cls);
        if (bool == null) {
            bool = deserializationConfig.getAnnotationIntrospector().isIgnorableType(((BasicBeanDescription) deserializationConfig.introspectClassAnnotations(cls)).getClassInfo());
            if (bool == null) {
                bool = Boolean.FALSE;
            }
        }
        return bool.booleanValue();
    }

    protected boolean isPotentialBeanType(Class<?> cls) {
        String canBeABeanType = ClassUtil.canBeABeanType(cls);
        if (canBeABeanType != null) {
            throw new IllegalArgumentException("Can not deserialize Class " + cls.getName() + " (of type " + canBeABeanType + ") as a Bean");
        } else if (ClassUtil.isProxyType(cls)) {
            throw new IllegalArgumentException("Can not deserialize Proxy class " + cls.getName() + " as a Bean");
        } else {
            canBeABeanType = ClassUtil.isLocalType(cls);
            if (canBeABeanType == null) {
                return true;
            }
            throw new IllegalArgumentException("Can not deserialize Class " + cls.getName() + " (of type " + canBeABeanType + ") as a Bean");
        }
    }

    protected JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        JavaType _mapAbstractType2;
        while (true) {
            _mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (_mapAbstractType2 == null) {
                return javaType;
            }
            Class rawClass = javaType.getRawClass();
            Class rawClass2 = _mapAbstractType2.getRawClass();
            if (rawClass != rawClass2 && rawClass.isAssignableFrom(rawClass2)) {
                javaType = _mapAbstractType2;
            }
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + _mapAbstractType2 + ": latter is not a subtype of former");
    }

    protected JavaType materializeAbstractType(DeserializationConfig deserializationConfig, BasicBeanDescription basicBeanDescription) {
        AbstractTypeResolver abstractTypeResolver = deserializationConfig.getAbstractTypeResolver();
        if (abstractTypeResolver == null && !this._factoryConfig.hasAbstractTypeResolvers()) {
            return null;
        }
        JavaType type = basicBeanDescription.getType();
        if (deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, basicBeanDescription.getClassInfo(), type) != null) {
            return null;
        }
        JavaType resolveAbstractType;
        if (abstractTypeResolver != null) {
            resolveAbstractType = abstractTypeResolver.resolveAbstractType(deserializationConfig, type);
            if (resolveAbstractType != null) {
                return resolveAbstractType;
            }
        }
        for (AbstractTypeResolver abstractTypeResolver2 : this._factoryConfig.abstractTypeResolvers()) {
            resolveAbstractType = abstractTypeResolver2.resolveAbstractType(deserializationConfig, type);
            if (resolveAbstractType != null) {
                return resolveAbstractType;
            }
        }
        return null;
    }

    public DeserializerFactory withConfig(Config config) {
        if (this._factoryConfig == config) {
            return this;
        }
        if (getClass() == BeanDeserializerFactory.class) {
            return new BeanDeserializerFactory(config);
        }
        throw new IllegalStateException("Subtype of BeanDeserializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalDeserializers': can not instantiate subtype with " + "additional deserializer definitions");
    }
}
