package org.codehaus.jackson.map.deser;

import java.util.HashMap;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializerFactory;
import org.codehaus.jackson.map.DeserializerFactory.Config;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.type.ClassKey;
import org.codehaus.jackson.type.JavaType;

@Deprecated
public class CustomDeserializerFactory extends BeanDeserializerFactory {
    protected HashMap<ClassKey, JsonDeserializer<Object>> _directClassMappings;
    protected HashMap<ClassKey, Class<?>> _mixInAnnotations;

    public CustomDeserializerFactory() {
        this(null);
    }

    protected CustomDeserializerFactory(Config config) {
        super(config);
        this._directClassMappings = null;
    }

    public void addMixInAnnotationMapping(Class<?> cls, Class<?> cls2) {
        if (this._mixInAnnotations == null) {
            this._mixInAnnotations = new HashMap();
        }
        this._mixInAnnotations.put(new ClassKey(cls), cls2);
    }

    public <T> void addSpecificMapping(Class<T> cls, JsonDeserializer<? extends T> jsonDeserializer) {
        ClassKey classKey = new ClassKey(cls);
        if (this._directClassMappings == null) {
            this._directClassMappings = new HashMap();
        }
        this._directClassMappings.put(classKey, jsonDeserializer);
    }

    public JsonDeserializer<?> createArrayDeserializer(DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, ArrayType arrayType, BeanProperty beanProperty) {
        ClassKey classKey = new ClassKey(arrayType.getRawClass());
        if (this._directClassMappings != null) {
            JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) this._directClassMappings.get(classKey);
            if (jsonDeserializer != null) {
                return jsonDeserializer;
            }
        }
        return super.createArrayDeserializer(deserializationConfig, deserializerProvider, arrayType, beanProperty);
    }

    public JsonDeserializer<Object> createBeanDeserializer(DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, JavaType javaType, BeanProperty beanProperty) {
        ClassKey classKey = new ClassKey(javaType.getRawClass());
        if (this._directClassMappings != null) {
            JsonDeserializer<Object> jsonDeserializer = (JsonDeserializer) this._directClassMappings.get(classKey);
            if (jsonDeserializer != null) {
                return jsonDeserializer;
            }
        }
        return super.createBeanDeserializer(deserializationConfig, deserializerProvider, javaType, beanProperty);
    }

    public JsonDeserializer<?> createEnumDeserializer(DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, JavaType javaType, BeanProperty beanProperty) {
        if (this._directClassMappings != null) {
            JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) this._directClassMappings.get(new ClassKey(javaType.getRawClass()));
            if (jsonDeserializer != null) {
                return jsonDeserializer;
            }
        }
        return super.createEnumDeserializer(deserializationConfig, deserializerProvider, javaType, beanProperty);
    }

    public DeserializerFactory withConfig(Config config) {
        if (getClass() == CustomDeserializerFactory.class) {
            return new CustomDeserializerFactory(config);
        }
        throw new IllegalStateException("Subtype of CustomDeserializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalDeserializers': can not instantiate subtype with " + "additional deserializer definitions");
    }
}
