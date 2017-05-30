package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.StdDeserializer.PrimitiveOrWrapperDeserializer;

@JacksonStdImpl
public final class StdDeserializer$BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
    public StdDeserializer$BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
        super(cls, bool);
    }

    public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseBoolean(jsonParser, deserializationContext);
    }

    public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return _parseBoolean(jsonParser, deserializationContext);
    }
}
