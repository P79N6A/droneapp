package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.StdDeserializer.PrimitiveOrWrapperDeserializer;

@JacksonStdImpl
public final class StdDeserializer$IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
    public StdDeserializer$IntegerDeserializer(Class<Integer> cls, Integer num) {
        super(cls, num);
    }

    public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseInteger(jsonParser, deserializationContext);
    }

    public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return _parseInteger(jsonParser, deserializationContext);
    }
}
