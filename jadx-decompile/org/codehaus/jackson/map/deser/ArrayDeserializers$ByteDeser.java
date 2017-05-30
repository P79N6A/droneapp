package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.ArrayDeserializers.ArrayDeser;
import org.codehaus.jackson.map.util.ArrayBuilders.ByteBuilder;

@JacksonStdImpl
final class ArrayDeserializers$ByteDeser extends ArrayDeser<byte[]> {
    public ArrayDeserializers$ByteDeser() {
        super(byte[].class);
    }

    private final byte[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (deserializationContext.isEnabled(Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            byte byteValue;
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
                byteValue = jsonParser.getByteValue();
            } else if (currentToken != JsonToken.VALUE_NULL) {
                throw deserializationContext.mappingException(this._valueClass.getComponentType());
            } else {
                byteValue = (byte) 0;
            }
            return new byte[]{byteValue};
        }
        throw deserializationContext.mappingException(this._valueClass);
    }

    public byte[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_STRING) {
            return jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
        }
        if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            Object embeddedObject = jsonParser.getEmbeddedObject();
            if (embeddedObject == null) {
                return null;
            }
            if (embeddedObject instanceof byte[]) {
                return (byte[]) embeddedObject;
            }
        }
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        ByteBuilder byteBuilder = deserializationContext.getArrayBuilders().getByteBuilder();
        Object obj = (byte[]) byteBuilder.resetAndStart();
        int i = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                return (byte[]) byteBuilder.completeAndClearBuffer(obj, i);
            }
            byte byteValue;
            int i2;
            if (nextToken == JsonToken.VALUE_NUMBER_INT || nextToken == JsonToken.VALUE_NUMBER_FLOAT) {
                byteValue = jsonParser.getByteValue();
            } else if (nextToken != JsonToken.VALUE_NULL) {
                throw deserializationContext.mappingException(this._valueClass.getComponentType());
            } else {
                byteValue = (byte) 0;
            }
            if (i >= obj.length) {
                i2 = 0;
                obj = (byte[]) byteBuilder.appendCompletedChunk(obj, i);
            } else {
                i2 = i;
            }
            i = i2 + 1;
            obj[i2] = byteValue;
        }
    }
}
