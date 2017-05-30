package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.StdSerializers.NonTypedScalarSerializer;

@JacksonStdImpl
public final class StdSerializers$DoubleSerializer extends NonTypedScalarSerializer<Double> {
    static final StdSerializers$DoubleSerializer instance = new StdSerializers$DoubleSerializer();

    public StdSerializers$DoubleSerializer() {
        super(Double.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("number", true);
    }

    public void serialize(Double d, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(d.doubleValue());
    }
}
