package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.StdDeserializer.PrimitiveOrWrapperDeserializer;

@JacksonStdImpl
public final class StdDeserializer$FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
    public StdDeserializer$FloatDeserializer(Class<Float> cls, Float f) {
        super(cls, f);
    }

    public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseFloat(jsonParser, deserializationContext);
    }
}
