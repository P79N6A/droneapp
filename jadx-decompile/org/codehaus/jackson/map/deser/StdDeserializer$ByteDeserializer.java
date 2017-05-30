package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.StdDeserializer.PrimitiveOrWrapperDeserializer;

@JacksonStdImpl
public final class StdDeserializer$ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
    public StdDeserializer$ByteDeserializer(Class<Byte> cls, Byte b) {
        super(cls, b);
    }

    public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        if (_parseIntPrimitive >= -128 && _parseIntPrimitive <= 127) {
            return Byte.valueOf((byte) _parseIntPrimitive);
        }
        throw deserializationContext.weirdStringException(this._valueClass, "overflow, value can not be represented as 8-bit value");
    }
}
