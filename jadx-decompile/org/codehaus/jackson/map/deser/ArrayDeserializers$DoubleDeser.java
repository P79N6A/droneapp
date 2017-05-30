package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.ArrayDeserializers.ArrayDeser;
import org.codehaus.jackson.map.util.ArrayBuilders.DoubleBuilder;

@JacksonStdImpl
final class ArrayDeserializers$DoubleDeser extends ArrayDeser<double[]> {
    public ArrayDeserializers$DoubleDeser() {
        super(double[].class);
    }

    private final double[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (deserializationContext.isEnabled(Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
        }
        throw deserializationContext.mappingException(this._valueClass);
    }

    public double[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        DoubleBuilder doubleBuilder = deserializationContext.getArrayBuilders().getDoubleBuilder();
        Object obj = (double[]) doubleBuilder.resetAndStart();
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            int i2;
            double _parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
            if (i >= obj.length) {
                i2 = 0;
                obj = (double[]) doubleBuilder.appendCompletedChunk(obj, i);
            } else {
                i2 = i;
            }
            i = i2 + 1;
            obj[i2] = _parseDoublePrimitive;
        }
        return (double[]) doubleBuilder.completeAndClearBuffer(obj, i);
    }
}
