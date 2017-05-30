package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.ArrayDeserializers.ArrayDeser;
import org.codehaus.jackson.map.util.ObjectBuffer;

@JacksonStdImpl
final class ArrayDeserializers$StringDeser extends ArrayDeser<String[]> {
    public ArrayDeserializers$StringDeser() {
        super(String[].class);
    }

    private final String[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (deserializationContext.isEnabled(Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            String[] strArr = new String[1];
            strArr[0] = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return strArr;
        }
        throw deserializationContext.mappingException(this._valueClass);
    }

    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken != JsonToken.END_ARRAY) {
                int i2;
                String text = nextToken == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                if (i >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i2 = 0;
                } else {
                    i2 = i;
                }
                i = i2 + 1;
                resetAndStart[i2] = text;
            } else {
                String[] strArr = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i, String.class);
                deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                return strArr;
            }
        }
    }
}
