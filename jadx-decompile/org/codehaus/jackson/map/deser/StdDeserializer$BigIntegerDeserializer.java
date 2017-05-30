package org.codehaus.jackson.map.deser;

import java.math.BigInteger;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.StdDeserializer.1;

@JacksonStdImpl
public class StdDeserializer$BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
    public StdDeserializer$BigIntegerDeserializer() {
        super(BigInteger.class);
    }

    public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            switch (1.$SwitchMap$org$codehaus$jackson$JsonParser$NumberType[jsonParser.getNumberType().ordinal()]) {
                case 1:
                case 2:
                    return BigInteger.valueOf(jsonParser.getLongValue());
            }
        } else if (currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return jsonParser.getDecimalValue().toBigInteger();
        } else {
            if (currentToken != JsonToken.VALUE_STRING) {
                throw deserializationContext.mappingException(this._valueClass);
            }
        }
        String trim = jsonParser.getText().trim();
        if (trim.length() == 0) {
            return null;
        }
        try {
            return new BigInteger(trim);
        } catch (IllegalArgumentException e) {
            throw deserializationContext.weirdStringException(this._valueClass, "not a valid representation");
        }
    }
}
