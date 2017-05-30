package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class ArraySerializers$ByteArraySerializer extends SerializerBase<byte[]> {
    public ArraySerializers$ByteArraySerializer() {
        super(byte[].class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put("items", createSchemaNode("string"));
        return createSchemaNode;
    }

    public void serialize(byte[] bArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeBinary(bArr);
    }

    public void serializeWithType(byte[] bArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForScalar(bArr, jsonGenerator);
        jsonGenerator.writeBinary(bArr);
        typeSerializer.writeTypeSuffixForScalar(bArr, jsonGenerator);
    }
}
