package org.codehaus.jackson.map;

import org.codehaus.jackson.map.ser.BeanSerializerModifier;

public abstract class SerializerFactory$Config {
    public abstract boolean hasKeySerializers();

    public abstract boolean hasSerializerModifiers();

    public abstract boolean hasSerializers();

    public abstract Iterable<Serializers> keySerializers();

    public abstract Iterable<BeanSerializerModifier> serializerModifiers();

    public abstract Iterable<Serializers> serializers();

    public abstract SerializerFactory$Config withAdditionalKeySerializers(Serializers serializers);

    public abstract SerializerFactory$Config withAdditionalSerializers(Serializers serializers);

    public abstract SerializerFactory$Config withSerializerModifier(BeanSerializerModifier beanSerializerModifier);
}
