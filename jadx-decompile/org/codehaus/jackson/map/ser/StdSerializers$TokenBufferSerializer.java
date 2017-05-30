package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.util.TokenBuffer;

@JacksonStdImpl
public final class StdSerializers$TokenBufferSerializer extends SerializerBase<TokenBuffer> {
    public StdSerializers$TokenBufferSerializer() {
        super(TokenBuffer.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("any", true);
    }

    public void serialize(TokenBuffer tokenBuffer, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        tokenBuffer.serialize(jsonGenerator);
    }

    public final void serializeWithType(TokenBuffer tokenBuffer, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForScalar(tokenBuffer, jsonGenerator);
        serialize(tokenBuffer, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForScalar(tokenBuffer, jsonGenerator);
    }
}
