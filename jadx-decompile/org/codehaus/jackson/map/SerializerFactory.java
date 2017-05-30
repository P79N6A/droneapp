package org.codehaus.jackson.map;

import org.codehaus.jackson.map.ser.BeanSerializerModifier;
import org.codehaus.jackson.type.JavaType;

public abstract class SerializerFactory {
    public abstract JsonSerializer<Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, BeanProperty beanProperty);

    public abstract JsonSerializer<Object> createSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanProperty beanProperty);

    @Deprecated
    public final JsonSerializer<Object> createSerializer(JavaType javaType, SerializationConfig serializationConfig) {
        try {
            return createSerializer(serializationConfig, javaType, null);
        } catch (JsonMappingException e) {
            throw new RuntimeJsonMappingException(e);
        }
    }

    public abstract TypeSerializer createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanProperty beanProperty);

    @Deprecated
    public final TypeSerializer createTypeSerializer(JavaType javaType, SerializationConfig serializationConfig) {
        try {
            return createTypeSerializer(serializationConfig, javaType, null);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public abstract Config getConfig();

    public final SerializerFactory withAdditionalKeySerializers(Serializers serializers) {
        return withConfig(getConfig().withAdditionalKeySerializers(serializers));
    }

    public final SerializerFactory withAdditionalSerializers(Serializers serializers) {
        return withConfig(getConfig().withAdditionalSerializers(serializers));
    }

    public abstract SerializerFactory withConfig(Config config);

    public final SerializerFactory withSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        return withConfig(getConfig().withSerializerModifier(beanSerializerModifier));
    }
}
