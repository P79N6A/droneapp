package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.ArrayDeserializers.ArrayDeser;
import org.codehaus.jackson.map.util.ArrayBuilders.BooleanBuilder;

@JacksonStdImpl
final class ArrayDeserializers$BooleanDeser extends ArrayDeser<boolean[]> {
    public ArrayDeserializers$BooleanDeser() {
        super(boolean[].class);
    }

    private final boolean[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (deserializationContext.isEnabled(Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
        }
        throw deserializationContext.mappingException(this._valueClass);
    }

    public boolean[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        BooleanBuilder booleanBuilder = deserializationContext.getArrayBuilders().getBooleanBuilder();
        Object obj = (boolean[]) booleanBuilder.resetAndStart();
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            int i2;
            boolean _parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
            if (i >= obj.length) {
                i2 = 0;
                obj = (boolean[]) booleanBuilder.appendCompletedChunk(obj, i);
            } else {
                i2 = i;
            }
            i = i2 + 1;
            obj[i2] = _parseBooleanPrimitive;
        }
        return (boolean[]) booleanBuilder.completeAndClearBuffer(obj, i);
    }
}
