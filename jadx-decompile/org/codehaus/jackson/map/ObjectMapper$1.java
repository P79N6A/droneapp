package org.codehaus.jackson.map;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.Module.SetupContext;
import org.codehaus.jackson.map.deser.BeanDeserializerModifier;
import org.codehaus.jackson.map.ser.BeanSerializerModifier;
import org.codehaus.jackson.map.type.TypeModifier;

class ObjectMapper$1 implements SetupContext {
    final /* synthetic */ ObjectMapper this$0;
    final /* synthetic */ ObjectMapper val$mapper;

    ObjectMapper$1(ObjectMapper objectMapper, ObjectMapper objectMapper2) {
        this.this$0 = objectMapper;
        this.val$mapper = objectMapper2;
    }

    public void addAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        this.val$mapper._deserializerProvider = this.val$mapper._deserializerProvider.withAbstractTypeResolver(abstractTypeResolver);
    }

    public void addBeanDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        this.val$mapper._deserializerProvider = this.val$mapper._deserializerProvider.withDeserializerModifier(beanDeserializerModifier);
    }

    public void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        this.val$mapper._serializerFactory = this.val$mapper._serializerFactory.withSerializerModifier(beanSerializerModifier);
    }

    public void addDeserializers(Deserializers deserializers) {
        this.val$mapper._deserializerProvider = this.val$mapper._deserializerProvider.withAdditionalDeserializers(deserializers);
    }

    public void addKeyDeserializers(KeyDeserializers keyDeserializers) {
        this.val$mapper._deserializerProvider = this.val$mapper._deserializerProvider.withAdditionalKeyDeserializers(keyDeserializers);
    }

    public void addKeySerializers(Serializers serializers) {
        this.val$mapper._serializerFactory = this.val$mapper._serializerFactory.withAdditionalKeySerializers(serializers);
    }

    public void addSerializers(Serializers serializers) {
        this.val$mapper._serializerFactory = this.val$mapper._serializerFactory.withAdditionalSerializers(serializers);
    }

    public void addTypeModifier(TypeModifier typeModifier) {
        this.val$mapper.setTypeFactory(this.val$mapper._typeFactory.withModifier(typeModifier));
    }

    public void appendAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this.val$mapper._deserializationConfig.appendAnnotationIntrospector(annotationIntrospector);
        this.val$mapper._serializationConfig.appendAnnotationIntrospector(annotationIntrospector);
    }

    public DeserializationConfig getDeserializationConfig() {
        return this.val$mapper.getDeserializationConfig();
    }

    public Version getMapperVersion() {
        return this.this$0.version();
    }

    public SerializationConfig getSerializationConfig() {
        return this.val$mapper.getSerializationConfig();
    }

    public void insertAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this.val$mapper._deserializationConfig.insertAnnotationIntrospector(annotationIntrospector);
        this.val$mapper._serializationConfig.insertAnnotationIntrospector(annotationIntrospector);
    }

    public void setMixInAnnotations(Class<?> cls, Class<?> cls2) {
        this.val$mapper._deserializationConfig.addMixInAnnotations(cls, cls2);
        this.val$mapper._serializationConfig.addMixInAnnotations(cls, cls2);
    }
}
