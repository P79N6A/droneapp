package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import java.sql.Date;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class StdSerializers$SqlDateSerializer extends ScalarSerializerBase<Date> {
    public StdSerializers$SqlDateSerializer() {
        super(Date.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string", true);
    }

    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeString(date.toString());
    }
}
