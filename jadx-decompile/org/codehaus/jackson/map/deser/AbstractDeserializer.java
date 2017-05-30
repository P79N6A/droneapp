package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.type.JavaType;

public class AbstractDeserializer extends JsonDeserializer<Object> {
    protected final JavaType _baseType;

    public AbstractDeserializer(JavaType javaType) {
        this._baseType = javaType;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        throw deserializationContext.instantiationException(this._baseType.getRawClass(), "abstract types can only be instantiated with additional type information");
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        switch (jsonParser.getCurrentToken()) {
            case VALUE_STRING:
                return jsonParser.getText();
            case VALUE_NUMBER_INT:
                return deserializationContext.isEnabled(Feature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.getBigIntegerValue() : Integer.valueOf(jsonParser.getIntValue());
            case VALUE_NUMBER_FLOAT:
                return deserializationContext.isEnabled(Feature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.getDecimalValue() : Double.valueOf(jsonParser.getDoubleValue());
            case VALUE_TRUE:
                return Boolean.TRUE;
            case VALUE_FALSE:
                return Boolean.FALSE;
            case VALUE_EMBEDDED_OBJECT:
                return jsonParser.getEmbeddedObject();
            case VALUE_NULL:
                return null;
            case START_ARRAY:
                return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
            default:
                return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
        }
    }
}