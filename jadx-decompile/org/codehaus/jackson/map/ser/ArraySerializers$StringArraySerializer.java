package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ResolvableSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.ArraySerializers.AsArraySerializer;

@JacksonStdImpl
public final class ArraySerializers$StringArraySerializer extends AsArraySerializer<String[]> implements ResolvableSerializer {
    protected JsonSerializer<Object> _elementSerializer;

    public ArraySerializers$StringArraySerializer(BeanProperty beanProperty) {
        super(String[].class, null, beanProperty);
    }

    private void serializeContentsSlow(String[] strArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i] == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            } else {
                jsonSerializer.serialize(strArr[i], jsonGenerator, serializerProvider);
            }
        }
    }

    public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return this;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put("items", createSchemaNode("string"));
        return createSchemaNode;
    }

    public void resolve(SerializerProvider serializerProvider) {
        JsonSerializer findValueSerializer = serializerProvider.findValueSerializer(String.class, this._property);
        if (findValueSerializer != null && findValueSerializer.getClass().getAnnotation(JacksonStdImpl.class) == null) {
            this._elementSerializer = findValueSerializer;
        }
    }

    public void serializeContents(String[] strArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int length = strArr.length;
        if (length != 0) {
            if (this._elementSerializer != null) {
                serializeContentsSlow(strArr, jsonGenerator, serializerProvider, this._elementSerializer);
                return;
            }
            for (int i = 0; i < length; i++) {
                if (strArr[i] == null) {
                    jsonGenerator.writeNull();
                } else {
                    jsonGenerator.writeString(strArr[i]);
                }
            }
        }
    }
}
