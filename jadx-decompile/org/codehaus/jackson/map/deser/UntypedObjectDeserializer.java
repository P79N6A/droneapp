package org.codehaus.jackson.map.deser;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.util.ObjectBuffer;

@JacksonStdImpl
public class UntypedObjectDeserializer extends StdDeserializer<Object> {
    public UntypedObjectDeserializer() {
        super(Object.class);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        switch (1.$SwitchMap$org$codehaus$jackson$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
                return jsonParser.getText();
            case 2:
                return deserializationContext.isEnabled(Feature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.getBigIntegerValue() : jsonParser.getNumberValue();
            case 3:
                return deserializationContext.isEnabled(Feature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.getDecimalValue() : Double.valueOf(jsonParser.getDoubleValue());
            case 4:
                return Boolean.TRUE;
            case 5:
                return Boolean.FALSE;
            case 6:
                return jsonParser.getEmbeddedObject();
            case 7:
                return null;
            case 8:
                return mapArray(jsonParser, deserializationContext);
            case 9:
            case 10:
                return mapObject(jsonParser, deserializationContext);
            default:
                throw deserializationContext.mappingException(Object.class);
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        switch (1.$SwitchMap$org$codehaus$jackson$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
                return jsonParser.getText();
            case 2:
                return deserializationContext.isEnabled(Feature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.getBigIntegerValue() : Integer.valueOf(jsonParser.getIntValue());
            case 3:
                return deserializationContext.isEnabled(Feature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.getDecimalValue() : Double.valueOf(jsonParser.getDoubleValue());
            case 4:
                return Boolean.TRUE;
            case 5:
                return Boolean.FALSE;
            case 6:
                return jsonParser.getEmbeddedObject();
            case 7:
                return null;
            case 8:
            case 9:
            case 10:
                return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
            default:
                throw deserializationContext.mappingException(Object.class);
        }
    }

    protected List<Object> mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            return new ArrayList(4);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int i = 0;
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i2 = 0;
        do {
            int i3;
            Object deserialize = deserialize(jsonParser, deserializationContext);
            i2++;
            if (i >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                i3 = 0;
            } else {
                i3 = i;
            }
            i = i3 + 1;
            resetAndStart[i3] = deserialize;
        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
        List<Object> arrayList = new ArrayList((i2 + (i2 >> 3)) + 1);
        leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i, arrayList);
        return arrayList;
    }

    protected Map<String, Object> mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        if (currentToken != JsonToken.FIELD_NAME) {
            return new LinkedHashMap(4);
        }
        String text = jsonParser.getText();
        jsonParser.nextToken();
        Object deserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.FIELD_NAME) {
            Map linkedHashMap = new LinkedHashMap(4);
            linkedHashMap.put(text, deserialize);
            return linkedHashMap;
        }
        String text2 = jsonParser.getText();
        jsonParser.nextToken();
        Object deserialize2 = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.FIELD_NAME) {
            linkedHashMap = new LinkedHashMap(4);
            linkedHashMap.put(text, deserialize);
            linkedHashMap.put(text2, deserialize2);
            return linkedHashMap;
        }
        linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(text, deserialize);
        linkedHashMap.put(text2, deserialize2);
        do {
            text = jsonParser.getText();
            jsonParser.nextToken();
            linkedHashMap.put(text, deserialize(jsonParser, deserializationContext));
        } while (jsonParser.nextToken() != JsonToken.END_OBJECT);
        return linkedHashMap;
    }
}
