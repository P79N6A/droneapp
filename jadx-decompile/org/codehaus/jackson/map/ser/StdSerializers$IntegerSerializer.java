package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.StdSerializers.NonTypedScalarSerializer;

@JacksonStdImpl
public final class StdSerializers$IntegerSerializer extends NonTypedScalarSerializer<Integer> {
    public StdSerializers$IntegerSerializer() {
        super(Integer.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("integer", true);
    }

    public void serialize(Integer num, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(num.intValue());
    }
}
