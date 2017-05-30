package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import java.util.Calendar;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class StdSerializers$CalendarSerializer extends ScalarSerializerBase<Calendar> {
    public static final StdSerializers$CalendarSerializer instance = new StdSerializers$CalendarSerializer();

    public StdSerializers$CalendarSerializer() {
        super(Calendar.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode(serializerProvider.isEnabled(Feature.WRITE_DATES_AS_TIMESTAMPS) ? "number" : "string", true);
    }

    public void serialize(Calendar calendar, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serializerProvider.defaultSerializeDateValue(calendar.getTimeInMillis(), jsonGenerator);
    }
}
