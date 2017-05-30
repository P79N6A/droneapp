package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.ArraySerializers.AsArraySerializer;

@JacksonStdImpl
public final class ArraySerializers$BooleanArraySerializer extends AsArraySerializer<boolean[]> {
    public ArraySerializers$BooleanArraySerializer() {
        super(boolean[].class, null, null);
    }

    public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return this;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put("items", createSchemaNode("boolean"));
        return createSchemaNode;
    }

    public void serializeContents(boolean[] zArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        for (boolean writeBoolean : zArr) {
            jsonGenerator.writeBoolean(writeBoolean);
        }
    }
}
