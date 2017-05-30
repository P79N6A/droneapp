package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import java.sql.Time;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class StdSerializers$SqlTimeSerializer extends ScalarSerializerBase<Time> {
    public StdSerializers$SqlTimeSerializer() {
        super(Time.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string", true);
    }

    public void serialize(Time time, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeString(time.toString());
    }
}
