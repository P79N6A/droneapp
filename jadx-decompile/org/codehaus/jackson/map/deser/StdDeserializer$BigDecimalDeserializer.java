package org.codehaus.jackson.map.deser;

import java.math.BigDecimal;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public class StdDeserializer$BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
    public StdDeserializer$BigDecimalDeserializer() {
        super(BigDecimal.class);
    }

    public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return jsonParser.getDecimalValue();
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return null;
            }
            try {
                return new BigDecimal(trim);
            } catch (IllegalArgumentException e) {
                throw deserializationContext.weirdStringException(this._valueClass, "not a valid representation");
            }
        }
        throw deserializationContext.mappingException(this._valueClass);
    }
}
