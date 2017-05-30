package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.StdDeserializer.PrimitiveOrWrapperDeserializer;

@JacksonStdImpl
public final class StdDeserializer$CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
    public StdDeserializer$CharacterDeserializer(Class<Character> cls, Character ch) {
        super(cls, ch);
    }

    public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            int intValue = jsonParser.getIntValue();
            if (intValue >= 0 && intValue <= 65535) {
                return Character.valueOf((char) intValue);
            }
        } else if (currentToken == JsonToken.VALUE_STRING) {
            String text = jsonParser.getText();
            if (text.length() == 1) {
                return Character.valueOf(text.charAt(0));
            }
        }
        throw deserializationContext.mappingException(this._valueClass);
    }
}
