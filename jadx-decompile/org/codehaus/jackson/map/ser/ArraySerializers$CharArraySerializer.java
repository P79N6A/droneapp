package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class ArraySerializers$CharArraySerializer extends SerializerBase<char[]> {
    public ArraySerializers$CharArraySerializer() {
        super(char[].class);
    }

    private final void _writeArrayContents(JsonGenerator jsonGenerator, char[] cArr) {
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            jsonGenerator.writeString(cArr, i, 1);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        JsonNode createSchemaNode2 = createSchemaNode("string");
        createSchemaNode2.put("type", "string");
        createSchemaNode.put("items", createSchemaNode2);
        return createSchemaNode;
    }

    public void serialize(char[] cArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (serializerProvider.isEnabled(Feature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
            jsonGenerator.writeStartArray();
            _writeArrayContents(jsonGenerator, cArr);
            jsonGenerator.writeEndArray();
            return;
        }
        jsonGenerator.writeString(cArr, 0, cArr.length);
    }

    public void serializeWithType(char[] cArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        if (serializerProvider.isEnabled(Feature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
            typeSerializer.writeTypePrefixForArray(cArr, jsonGenerator);
            _writeArrayContents(jsonGenerator, cArr);
            typeSerializer.writeTypeSuffixForArray(cArr, jsonGenerator);
            return;
        }
        typeSerializer.writeTypePrefixForScalar(cArr, jsonGenerator);
        jsonGenerator.writeString(cArr, 0, cArr.length);
        typeSerializer.writeTypeSuffixForScalar(cArr, jsonGenerator);
    }
}
