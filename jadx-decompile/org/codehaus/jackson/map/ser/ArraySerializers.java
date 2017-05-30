package org.codehaus.jackson.map.ser;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;

public final class ArraySerializers {

    public static abstract class AsArraySerializer<T> extends ContainerSerializerBase<T> {
        protected final BeanProperty _property;
        protected final TypeSerializer _valueTypeSerializer;

        protected AsArraySerializer(Class<T> cls, TypeSerializer typeSerializer, BeanProperty beanProperty) {
            super(cls);
            this._valueTypeSerializer = typeSerializer;
            this._property = beanProperty;
        }

        public final void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.writeStartArray();
            serializeContents(t, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
        }

        protected abstract void serializeContents(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

        public final void serializeWithType(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            typeSerializer.writeTypePrefixForArray(t, jsonGenerator);
            serializeContents(t, jsonGenerator, serializerProvider);
            typeSerializer.writeTypeSuffixForArray(t, jsonGenerator);
        }
    }

    private ArraySerializers() {
    }
}
