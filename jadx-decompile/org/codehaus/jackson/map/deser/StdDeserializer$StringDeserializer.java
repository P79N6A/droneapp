package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.Base64Variants;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class StdDeserializer$StringDeserializer extends StdScalarDeserializer<String> {
    public StdDeserializer$StringDeserializer() {
        super(String.class);
    }

    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_STRING) {
            return jsonParser.getText();
        }
        if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            Object embeddedObject = jsonParser.getEmbeddedObject();
            return embeddedObject == null ? null : embeddedObject instanceof byte[] ? Base64Variants.getDefaultVariant().encode((byte[]) embeddedObject, false) : embeddedObject.toString();
        } else if (currentToken.isScalarValue()) {
            return jsonParser.getText();
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    public String deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return deserialize(jsonParser, deserializationContext);
    }
}
