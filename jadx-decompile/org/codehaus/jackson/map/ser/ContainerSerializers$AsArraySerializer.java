package org.codehaus.jackson.map.ser;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ResolvableSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.ser.impl.PropertySerializerMap;
import org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.schema.SchemaAware;
import org.codehaus.jackson.type.JavaType;

public abstract class ContainerSerializers$AsArraySerializer<T> extends ContainerSerializerBase<T> implements ResolvableSerializer {
    protected PropertySerializerMap _dynamicSerializers;
    protected JsonSerializer<Object> _elementSerializer;
    protected final JavaType _elementType;
    protected final BeanProperty _property;
    protected final boolean _staticTyping;
    protected final TypeSerializer _valueTypeSerializer;

    @Deprecated
    protected ContainerSerializers$AsArraySerializer(Class<?> cls, JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        this(cls, javaType, z, typeSerializer, beanProperty, null);
    }

    protected ContainerSerializers$AsArraySerializer(Class<?> cls, JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty, JsonSerializer<Object> jsonSerializer) {
        boolean z2 = false;
        super(cls, false);
        this._elementType = javaType;
        if (z || (javaType != null && javaType.isFinal())) {
            z2 = true;
        }
        this._staticTyping = z2;
        this._valueTypeSerializer = typeSerializer;
        this._property = beanProperty;
        this._elementSerializer = jsonSerializer;
        this._dynamicSerializers = PropertySerializerMap.emptyMap();
    }

    protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSerializer = propertySerializerMap.findAndAddSerializer(cls, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSerializer.map) {
            this._dynamicSerializers = findAndAddSerializer.map;
        }
        return findAndAddSerializer.serializer;
    }

    protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSerializer = propertySerializerMap.findAndAddSerializer(javaType, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSerializer.map) {
            this._dynamicSerializers = findAndAddSerializer.map;
        }
        return findAndAddSerializer.serializer;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JavaType contentType;
        JsonNode createSchemaNode = createSchemaNode("array", true);
        if (type != null) {
            contentType = serializerProvider.constructType(type).getContentType();
            if (contentType == null && (type instanceof ParameterizedType)) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    contentType = serializerProvider.constructType(actualTypeArguments[0]);
                }
            }
        } else {
            contentType = null;
        }
        if (contentType == null && this._elementType != null) {
            contentType = this._elementType;
        }
        if (contentType != null) {
            JsonNode schema;
            if (contentType.getRawClass() != Object.class) {
                JsonSerializer findValueSerializer = serializerProvider.findValueSerializer(contentType, this._property);
                if (findValueSerializer instanceof SchemaAware) {
                    schema = ((SchemaAware) findValueSerializer).getSchema(serializerProvider, null);
                    if (schema == null) {
                        schema = JsonSchema.getDefaultSchemaNode();
                    }
                    createSchemaNode.put("items", schema);
                }
            }
            schema = null;
            if (schema == null) {
                schema = JsonSchema.getDefaultSchemaNode();
            }
            createSchemaNode.put("items", schema);
        }
        return createSchemaNode;
    }

    public void resolve(SerializerProvider serializerProvider) {
        if (this._staticTyping && this._elementType != null && this._elementSerializer == null) {
            this._elementSerializer = serializerProvider.findValueSerializer(this._elementType, this._property);
        }
    }

    public final void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartArray();
        serializeContents(t, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    protected abstract void serializeContents(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public final void serializeWithType(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForArray(t, jsonGenerator);
        serializeContents(t, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForArray(t, jsonGenerator);
    }
}
