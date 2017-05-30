package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.StdDeserializer.PrimitiveOrWrapperDeserializer;

@JacksonStdImpl
public final class StdDeserializer$DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
    public StdDeserializer$DoubleDeserializer(Class<Double> cls, Double d) {
        super(cls, d);
    }

    public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseDouble(jsonParser, deserializationContext);
    }

    public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return _parseDouble(jsonParser, deserializationContext);
    }
}
