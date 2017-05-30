package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import java.util.Date;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class StdSerializers$UtilDateSerializer extends ScalarSerializerBase<Date> {
    public static final StdSerializers$UtilDateSerializer instance = new StdSerializers$UtilDateSerializer();

    public StdSerializers$UtilDateSerializer() {
        super(Date.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode(serializerProvider.isEnabled(Feature.WRITE_DATES_AS_TIMESTAMPS) ? "number" : "string", true);
    }

    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serializerProvider.defaultSerializeDateValue(date, jsonGenerator);
    }
}
