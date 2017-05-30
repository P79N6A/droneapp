package org.codehaus.jackson.map.ser;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;

public class StdSerializers {

    protected static abstract class NonTypedScalarSerializer<T> extends ScalarSerializerBase<T> {
        protected NonTypedScalarSerializer(Class<T> cls) {
            super(cls);
        }

        public final void serializeWithType(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            serialize(t, jsonGenerator, serializerProvider);
        }
    }

    protected StdSerializers() {
    }
}
