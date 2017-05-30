package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.ArrayDeserializers.ArrayDeser;
import org.codehaus.jackson.map.util.ArrayBuilders.FloatBuilder;

@JacksonStdImpl
final class ArrayDeserializers$FloatDeser extends ArrayDeser<float[]> {
    public ArrayDeserializers$FloatDeser() {
        super(float[].class);
    }

    private final float[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (deserializationContext.isEnabled(Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
        }
        throw deserializationContext.mappingException(this._valueClass);
    }

    public float[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        FloatBuilder floatBuilder = deserializationContext.getArrayBuilders().getFloatBuilder();
        Object obj = (float[]) floatBuilder.resetAndStart();
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            int i2;
            float _parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
            if (i >= obj.length) {
                i2 = 0;
                obj = (float[]) floatBuilder.appendCompletedChunk(obj, i);
            } else {
                i2 = i;
            }
            i = i2 + 1;
            obj[i2] = _parseFloatPrimitive;
        }
        return (float[]) floatBuilder.completeAndClearBuffer(obj, i);
    }
}
