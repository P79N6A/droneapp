package org.codehaus.jackson.map.ser;

import org.codehaus.jackson.map.SerializerFactory$Config;
import org.codehaus.jackson.map.Serializers;
import org.codehaus.jackson.map.util.ArrayBuilders;

public class BeanSerializerFactory$ConfigImpl extends SerializerFactory$Config {
    protected static final BeanSerializerModifier[] NO_MODIFIERS = new BeanSerializerModifier[0];
    protected static final Serializers[] NO_SERIALIZERS = new Serializers[0];
    protected final Serializers[] _additionalKeySerializers;
    protected final Serializers[] _additionalSerializers;
    protected final BeanSerializerModifier[] _modifiers;

    public BeanSerializerFactory$ConfigImpl() {
        this(null, null, null);
    }

    protected BeanSerializerFactory$ConfigImpl(Serializers[] serializersArr, Serializers[] serializersArr2, BeanSerializerModifier[] beanSerializerModifierArr) {
        if (serializersArr == null) {
            serializersArr = NO_SERIALIZERS;
        }
        this._additionalSerializers = serializersArr;
        if (serializersArr2 == null) {
            serializersArr2 = NO_SERIALIZERS;
        }
        this._additionalKeySerializers = serializersArr2;
        if (beanSerializerModifierArr == null) {
            beanSerializerModifierArr = NO_MODIFIERS;
        }
        this._modifiers = beanSerializerModifierArr;
    }

    public boolean hasKeySerializers() {
        return this._additionalKeySerializers.length > 0;
    }

    public boolean hasSerializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasSerializers() {
        return this._additionalSerializers.length > 0;
    }

    public Iterable<Serializers> keySerializers() {
        return ArrayBuilders.arrayAsIterable(this._additionalKeySerializers);
    }

    public Iterable<BeanSerializerModifier> serializerModifiers() {
        return ArrayBuilders.arrayAsIterable(this._modifiers);
    }

    public Iterable<Serializers> serializers() {
        return ArrayBuilders.arrayAsIterable(this._additionalSerializers);
    }

    public SerializerFactory$Config withAdditionalKeySerializers(Serializers serializers) {
        if (serializers == null) {
            throw new IllegalArgumentException("Can not pass null Serializers");
        }
        return new BeanSerializerFactory$ConfigImpl(this._additionalSerializers, (Serializers[]) ArrayBuilders.insertInListNoDup(this._additionalKeySerializers, serializers), this._modifiers);
    }

    public SerializerFactory$Config withAdditionalSerializers(Serializers serializers) {
        if (serializers != null) {
            return new BeanSerializerFactory$ConfigImpl((Serializers[]) ArrayBuilders.insertInListNoDup(this._additionalSerializers, serializers), this._additionalKeySerializers, this._modifiers);
        }
        throw new IllegalArgumentException("Can not pass null Serializers");
    }

    public SerializerFactory$Config withSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        if (beanSerializerModifier == null) {
            throw new IllegalArgumentException("Can not pass null modifier");
        }
        return new BeanSerializerFactory$ConfigImpl(this._additionalSerializers, this._additionalKeySerializers, (BeanSerializerModifier[]) ArrayBuilders.insertInListNoDup(this._modifiers, beanSerializerModifier));
    }
}
