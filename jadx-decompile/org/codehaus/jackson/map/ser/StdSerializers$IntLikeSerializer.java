package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class StdSerializers$IntLikeSerializer extends ScalarSerializerBase<Number> {
    static final StdSerializers$IntLikeSerializer instance = new StdSerializers$IntLikeSerializer();

    public StdSerializers$IntLikeSerializer() {
        super(Number.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("integer", true);
    }

    public void serialize(Number number, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(number.intValue());
    }
}
