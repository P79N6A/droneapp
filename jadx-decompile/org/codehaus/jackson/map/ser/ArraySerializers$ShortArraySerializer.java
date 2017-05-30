package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.ArraySerializers.AsArraySerializer;

@JacksonStdImpl
public final class ArraySerializers$ShortArraySerializer extends AsArraySerializer<short[]> {
    public ArraySerializers$ShortArraySerializer() {
        this(null);
    }

    public ArraySerializers$ShortArraySerializer(TypeSerializer typeSerializer) {
        super(short[].class, typeSerializer, null);
    }

    public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new ArraySerializers$ShortArraySerializer(typeSerializer);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put("items", createSchemaNode("integer"));
        return createSchemaNode;
    }

    public void serializeContents(short[] sArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        for (int writeNumber : sArr) {
            jsonGenerator.writeNumber(writeNumber);
        }
    }
}
