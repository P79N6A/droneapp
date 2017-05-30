package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.ArraySerializers.AsArraySerializer;

@JacksonStdImpl
public final class ArraySerializers$FloatArraySerializer extends AsArraySerializer<float[]> {
    public ArraySerializers$FloatArraySerializer() {
        this(null);
    }

    public ArraySerializers$FloatArraySerializer(TypeSerializer typeSerializer) {
        super(float[].class, typeSerializer, null);
    }

    public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new ArraySerializers$FloatArraySerializer(typeSerializer);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put("items", createSchemaNode("number"));
        return createSchemaNode;
    }

    public void serializeContents(float[] fArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        for (float writeNumber : fArr) {
            jsonGenerator.writeNumber(writeNumber);
        }
    }
}
