package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.ArraySerializers.AsArraySerializer;

@JacksonStdImpl
public final class ArraySerializers$IntArraySerializer extends AsArraySerializer<int[]> {
    public ArraySerializers$IntArraySerializer() {
        super(int[].class, null, null);
    }

    public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return this;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put("items", createSchemaNode("integer"));
        return createSchemaNode;
    }

    public void serializeContents(int[] iArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        for (int writeNumber : iArr) {
            jsonGenerator.writeNumber(writeNumber);
        }
    }
}
