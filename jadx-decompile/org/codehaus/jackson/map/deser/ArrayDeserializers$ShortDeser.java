package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.ArrayDeserializers.ArrayDeser;
import org.codehaus.jackson.map.util.ArrayBuilders.ShortBuilder;

@JacksonStdImpl
final class ArrayDeserializers$ShortDeser extends ArrayDeser<short[]> {
    public ArrayDeserializers$ShortDeser() {
        super(short[].class);
    }

    private final short[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (deserializationContext.isEnabled(Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
        }
        throw deserializationContext.mappingException(this._valueClass);
    }

    public short[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        ShortBuilder shortBuilder = deserializationContext.getArrayBuilders().getShortBuilder();
        Object obj = (short[]) shortBuilder.resetAndStart();
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            int i2;
            short _parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
            if (i >= obj.length) {
                i2 = 0;
                obj = (short[]) shortBuilder.appendCompletedChunk(obj, i);
            } else {
                i2 = i;
            }
            i = i2 + 1;
            obj[i2] = _parseShortPrimitive;
        }
        return (short[]) shortBuilder.completeAndClearBuffer(obj, i);
    }
}
