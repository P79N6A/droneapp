package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.map.AbstractTypeResolver;
import org.codehaus.jackson.map.DeserializerFactory$Config;
import org.codehaus.jackson.map.Deserializers;
import org.codehaus.jackson.map.KeyDeserializers;
import org.codehaus.jackson.map.util.ArrayBuilders;

public class BeanDeserializerFactory$ConfigImpl extends DeserializerFactory$Config {
    protected static final AbstractTypeResolver[] NO_ABSTRACT_TYPE_RESOLVERS = new AbstractTypeResolver[0];
    protected static final KeyDeserializers[] NO_KEY_DESERIALIZERS = new KeyDeserializers[0];
    protected static final BeanDeserializerModifier[] NO_MODIFIERS = new BeanDeserializerModifier[0];
    protected final AbstractTypeResolver[] _abstractTypeResolvers;
    protected final Deserializers[] _additionalDeserializers;
    protected final KeyDeserializers[] _additionalKeyDeserializers;
    protected final BeanDeserializerModifier[] _modifiers;

    public BeanDeserializerFactory$ConfigImpl() {
        this(null, null, null, null);
    }

    protected BeanDeserializerFactory$ConfigImpl(Deserializers[] deserializersArr, KeyDeserializers[] keyDeserializersArr, BeanDeserializerModifier[] beanDeserializerModifierArr, AbstractTypeResolver[] abstractTypeResolverArr) {
        if (deserializersArr == null) {
            deserializersArr = BeanDeserializerFactory.access$000();
        }
        this._additionalDeserializers = deserializersArr;
        if (keyDeserializersArr == null) {
            keyDeserializersArr = NO_KEY_DESERIALIZERS;
        }
        this._additionalKeyDeserializers = keyDeserializersArr;
        if (beanDeserializerModifierArr == null) {
            beanDeserializerModifierArr = NO_MODIFIERS;
        }
        this._modifiers = beanDeserializerModifierArr;
        if (abstractTypeResolverArr == null) {
            abstractTypeResolverArr = NO_ABSTRACT_TYPE_RESOLVERS;
        }
        this._abstractTypeResolvers = abstractTypeResolverArr;
    }

    public Iterable<AbstractTypeResolver> abstractTypeResolvers() {
        return ArrayBuilders.arrayAsIterable(this._abstractTypeResolvers);
    }

    public Iterable<BeanDeserializerModifier> deserializerModifiers() {
        return ArrayBuilders.arrayAsIterable(this._modifiers);
    }

    public Iterable<Deserializers> deserializers() {
        return ArrayBuilders.arrayAsIterable(this._additionalDeserializers);
    }

    public boolean hasAbstractTypeResolvers() {
        return this._abstractTypeResolvers.length > 0;
    }

    public boolean hasDeserializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasDeserializers() {
        return this._additionalDeserializers.length > 0;
    }

    public boolean hasKeyDeserializers() {
        return this._additionalKeyDeserializers.length > 0;
    }

    public Iterable<KeyDeserializers> keyDeserializers() {
        return ArrayBuilders.arrayAsIterable(this._additionalKeyDeserializers);
    }

    public DeserializerFactory$Config withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        if (abstractTypeResolver == null) {
            throw new IllegalArgumentException("Can not pass null resolver");
        }
        return new BeanDeserializerFactory$ConfigImpl(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, (AbstractTypeResolver[]) ArrayBuilders.insertInListNoDup(this._abstractTypeResolvers, abstractTypeResolver));
    }

    public DeserializerFactory$Config withAdditionalDeserializers(Deserializers deserializers) {
        if (deserializers != null) {
            return new BeanDeserializerFactory$ConfigImpl((Deserializers[]) ArrayBuilders.insertInListNoDup(this._additionalDeserializers, deserializers), this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers);
        }
        throw new IllegalArgumentException("Can not pass null Deserializers");
    }

    public DeserializerFactory$Config withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers) {
        if (keyDeserializers == null) {
            throw new IllegalArgumentException("Can not pass null KeyDeserializers");
        }
        return new BeanDeserializerFactory$ConfigImpl(this._additionalDeserializers, (KeyDeserializers[]) ArrayBuilders.insertInListNoDup(this._additionalKeyDeserializers, keyDeserializers), this._modifiers, this._abstractTypeResolvers);
    }

    public DeserializerFactory$Config withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        if (beanDeserializerModifier == null) {
            throw new IllegalArgumentException("Can not pass null modifier");
        }
        return new BeanDeserializerFactory$ConfigImpl(this._additionalDeserializers, this._additionalKeyDeserializers, (BeanDeserializerModifier[]) ArrayBuilders.insertInListNoDup(this._modifiers, beanDeserializerModifier), this._abstractTypeResolvers);
    }
}
