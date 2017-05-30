package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.StdDeserializer.PrimitiveOrWrapperDeserializer;

@JacksonStdImpl
public final class StdDeserializer$ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
    public StdDeserializer$ShortDeserializer(Class<Short> cls, Short sh) {
        super(cls, sh);
    }

    public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseShort(jsonParser, deserializationContext);
    }
}
