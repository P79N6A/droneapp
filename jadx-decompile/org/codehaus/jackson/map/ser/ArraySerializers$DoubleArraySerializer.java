package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.ArraySerializers.AsArraySerializer;

@JacksonStdImpl
public final class ArraySerializers$DoubleArraySerializer extends AsArraySerializer<double[]> {
    public ArraySerializers$DoubleArraySerializer() {
        super(double[].class, null, null);
    }

    public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return this;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put("items", createSchemaNode("number"));
        return createSchemaNode;
    }

    public void serializeContents(double[] dArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        for (double writeNumber : dArr) {
            jsonGenerator.writeNumber(writeNumber);
        }
    }
}
