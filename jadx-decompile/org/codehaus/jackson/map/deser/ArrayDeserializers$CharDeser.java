package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.Base64Variants;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.ArrayDeserializers.ArrayDeser;

@JacksonStdImpl
final class ArrayDeserializers$CharDeser extends ArrayDeser<char[]> {
    public ArrayDeserializers$CharDeser() {
        super(char[].class);
    }

    public char[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        Object obj;
        if (currentToken == JsonToken.VALUE_STRING) {
            Object textCharacters = jsonParser.getTextCharacters();
            int textOffset = jsonParser.getTextOffset();
            int textLength = jsonParser.getTextLength();
            obj = new char[textLength];
            System.arraycopy(textCharacters, textOffset, obj, 0, textLength);
            return obj;
        } else if (jsonParser.isExpectedStartArrayToken()) {
            StringBuilder stringBuilder = new StringBuilder(64);
            while (true) {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY) {
                    return stringBuilder.toString().toCharArray();
                }
                if (nextToken != JsonToken.VALUE_STRING) {
                    throw deserializationContext.mappingException(Character.TYPE);
                }
                String text = jsonParser.getText();
                if (text.length() != 1) {
                    throw JsonMappingException.from(jsonParser, "Can not convert a JSON String of length " + text.length() + " into a char element of char array");
                }
                stringBuilder.append(text.charAt(0));
            }
        } else {
            if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                obj = jsonParser.getEmbeddedObject();
                if (obj == null) {
                    return null;
                }
                if (obj instanceof char[]) {
                    return (char[]) obj;
                }
                if (obj instanceof String) {
                    return ((String) obj).toCharArray();
                }
                if (obj instanceof byte[]) {
                    return Base64Variants.getDefaultVariant().encode((byte[]) obj, false).toCharArray();
                }
            }
            throw deserializationContext.mappingException(this._valueClass);
        }
    }
}
