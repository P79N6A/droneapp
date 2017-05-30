package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.ArraySerializers.AsArraySerializer;

@JacksonStdImpl
public final class ArraySerializers$LongArraySerializer extends AsArraySerializer<long[]> {
    public ArraySerializers$LongArraySerializer() {
        this(null);
    }

    public ArraySerializers$LongArraySerializer(TypeSerializer typeSerializer) {
        super(long[].class, typeSerializer, null);
    }

    public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new ArraySerializers$LongArraySerializer(typeSerializer);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put("items", createSchemaNode("number", true));
        return createSchemaNode;
    }

    public void serializeContents(long[] jArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        for (long writeNumber : jArr) {
            jsonGenerator.writeNumber(writeNumber);
        }
    }
}
