package org.codehaus.jackson.map.deser;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.deser.StdDeserializer.1;

@JacksonStdImpl
public final class StdDeserializer$NumberDeserializer extends StdScalarDeserializer<Number> {
    public StdDeserializer$NumberDeserializer() {
        super(Number.class);
    }

    public Number deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return deserializationContext.isEnabled(Feature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.getBigIntegerValue() : jsonParser.getNumberValue();
        } else {
            if (currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
                return deserializationContext.isEnabled(Feature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.getDecimalValue() : Double.valueOf(jsonParser.getDoubleValue());
            } else {
                if (currentToken == JsonToken.VALUE_STRING) {
                    String trim = jsonParser.getText().trim();
                    try {
                        if (trim.indexOf(46) >= 0) {
                            return deserializationContext.isEnabled(Feature.USE_BIG_DECIMAL_FOR_FLOATS) ? new BigDecimal(trim) : new Double(trim);
                        } else {
                            if (deserializationContext.isEnabled(Feature.USE_BIG_INTEGER_FOR_INTS)) {
                                return new BigInteger(trim);
                            }
                            long parseLong = Long.parseLong(trim);
                            return (parseLong > 2147483647L || parseLong < -2147483648L) ? Long.valueOf(parseLong) : Integer.valueOf((int) parseLong);
                        }
                    } catch (IllegalArgumentException e) {
                        throw deserializationContext.weirdStringException(this._valueClass, "not a valid number");
                    }
                }
                throw deserializationContext.mappingException(this._valueClass);
            }
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        switch (1.$SwitchMap$org$codehaus$jackson$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return deserialize(jsonParser, deserializationContext);
            default:
                return typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
        }
    }
}
