package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.util.TokenBuffer;

@JacksonStdImpl
public class StdDeserializer$TokenBufferDeserializer extends StdScalarDeserializer<TokenBuffer> {
    public StdDeserializer$TokenBufferDeserializer() {
        super(TokenBuffer.class);
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser.getCodec());
        tokenBuffer.copyCurrentStructure(jsonParser);
        return tokenBuffer;
    }
}
