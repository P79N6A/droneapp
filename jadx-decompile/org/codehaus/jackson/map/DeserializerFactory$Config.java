package org.codehaus.jackson.map;

import org.codehaus.jackson.map.deser.BeanDeserializerModifier;

public abstract class DeserializerFactory$Config {
    public abstract Iterable<AbstractTypeResolver> abstractTypeResolvers();

    public abstract Iterable<BeanDeserializerModifier> deserializerModifiers();

    public abstract Iterable<Deserializers> deserializers();

    public abstract boolean hasAbstractTypeResolvers();

    public abstract boolean hasDeserializerModifiers();

    public abstract boolean hasDeserializers();

    public abstract boolean hasKeyDeserializers();

    public abstract Iterable<KeyDeserializers> keyDeserializers();

    public abstract DeserializerFactory$Config withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver);

    public abstract DeserializerFactory$Config withAdditionalDeserializers(Deserializers deserializers);

    public abstract DeserializerFactory$Config withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers);

    public abstract DeserializerFactory$Config withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier);
}
