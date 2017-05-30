package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.StdDeserializer.PrimitiveOrWrapperDeserializer;

@JacksonStdImpl
public final class StdDeserializer$LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
    public StdDeserializer$LongDeserializer(Class<Long> cls, Long l) {
        super(cls, l);
    }

    public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseLong(jsonParser, deserializationContext);
    }
}
