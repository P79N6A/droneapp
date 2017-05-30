package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.ArrayDeserializers.ArrayDeser;
import org.codehaus.jackson.map.util.ArrayBuilders.LongBuilder;

@JacksonStdImpl
final class ArrayDeserializers$LongDeser extends ArrayDeser<long[]> {
    public ArrayDeserializers$LongDeser() {
        super(long[].class);
    }

    private final long[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (deserializationContext.isEnabled(Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
        }
        throw deserializationContext.mappingException(this._valueClass);
    }

    public long[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        LongBuilder longBuilder = deserializationContext.getArrayBuilders().getLongBuilder();
        Object obj = (long[]) longBuilder.resetAndStart();
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            int i2;
            long _parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
            if (i >= obj.length) {
                i2 = 0;
                obj = (long[]) longBuilder.appendCompletedChunk(obj, i);
            } else {
                i2 = i;
            }
            i = i2 + 1;
            obj[i2] = _parseLongPrimitive;
        }
        return (long[]) longBuilder.completeAndClearBuffer(obj, i);
    }
}
