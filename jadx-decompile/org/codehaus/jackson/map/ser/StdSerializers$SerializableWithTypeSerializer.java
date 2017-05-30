package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonSerializableWithType;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.schema.JsonSerializableSchema;

@JacksonStdImpl
public final class StdSerializers$SerializableWithTypeSerializer extends SerializerBase<JsonSerializableWithType> {
    protected static final StdSerializers$SerializableWithTypeSerializer instance = new StdSerializers$SerializableWithTypeSerializer();

    private StdSerializers$SerializableWithTypeSerializer() {
        super(JsonSerializableWithType.class);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        String schemaObjectPropertiesDefinition;
        String str = null;
        JsonNode createObjectNode = createObjectNode();
        String str2 = "any";
        if (type != null) {
            Class rawClass = TypeFactory.rawClass(type);
            if (rawClass.isAnnotationPresent(JsonSerializableSchema.class)) {
                JsonSerializableSchema jsonSerializableSchema = (JsonSerializableSchema) rawClass.getAnnotation(JsonSerializableSchema.class);
                String schemaType = jsonSerializableSchema.schemaType();
                schemaObjectPropertiesDefinition = !"##irrelevant".equals(jsonSerializableSchema.schemaObjectPropertiesDefinition()) ? jsonSerializableSchema.schemaObjectPropertiesDefinition() : null;
                if ("##irrelevant".equals(jsonSerializableSchema.schemaItemDefinition())) {
                    str2 = schemaType;
                } else {
                    str = jsonSerializableSchema.schemaItemDefinition();
                    str2 = schemaType;
                }
                createObjectNode.put("type", str2);
                if (schemaObjectPropertiesDefinition != null) {
                    try {
                        createObjectNode.put("properties", (JsonNode) new ObjectMapper().readValue(schemaObjectPropertiesDefinition, JsonNode.class));
                    } catch (Throwable e) {
                        throw new IllegalStateException(e);
                    }
                }
                if (str != null) {
                    try {
                        createObjectNode.put("items", (JsonNode) new ObjectMapper().readValue(str, JsonNode.class));
                    } catch (Throwable e2) {
                        throw new IllegalStateException(e2);
                    }
                }
                return createObjectNode;
            }
        }
        schemaObjectPropertiesDefinition = null;
        createObjectNode.put("type", str2);
        if (schemaObjectPropertiesDefinition != null) {
            createObjectNode.put("properties", (JsonNode) new ObjectMapper().readValue(schemaObjectPropertiesDefinition, JsonNode.class));
        }
        if (str != null) {
            createObjectNode.put("items", (JsonNode) new ObjectMapper().readValue(str, JsonNode.class));
        }
        return createObjectNode;
    }

    public void serialize(JsonSerializableWithType jsonSerializableWithType, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonSerializableWithType.serialize(jsonGenerator, serializerProvider);
    }

    public final void serializeWithType(JsonSerializableWithType jsonSerializableWithType, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonSerializableWithType.serializeWithType(jsonGenerator, serializerProvider, typeSerializer);
    }
}
