package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class StdSerializers$NumberSerializer extends ScalarSerializerBase<Number> {
    public static final StdSerializers$NumberSerializer instance = new StdSerializers$NumberSerializer();

    public StdSerializers$NumberSerializer() {
        super(Number.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("number", true);
    }

    public void serialize(Number number, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (number instanceof BigDecimal) {
            jsonGenerator.writeNumber((BigDecimal) number);
        } else if (number instanceof BigInteger) {
            jsonGenerator.writeNumber((BigInteger) number);
        } else if (number instanceof Integer) {
            jsonGenerator.writeNumber(number.intValue());
        } else if (number instanceof Long) {
            jsonGenerator.writeNumber(number.longValue());
        } else if (number instanceof Double) {
            jsonGenerator.writeNumber(number.doubleValue());
        } else if (number instanceof Float) {
            jsonGenerator.writeNumber(number.floatValue());
        } else if ((number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.writeNumber(number.intValue());
        } else {
            jsonGenerator.writeNumber(number.toString());
        }
    }
}
