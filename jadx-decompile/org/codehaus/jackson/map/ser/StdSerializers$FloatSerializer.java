package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class StdSerializers$FloatSerializer extends ScalarSerializerBase<Float> {
    static final StdSerializers$FloatSerializer instance = new StdSerializers$FloatSerializer();

    public StdSerializers$FloatSerializer() {
        super(Float.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("number", true);
    }

    public void serialize(Float f, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(f.floatValue());
    }
}
