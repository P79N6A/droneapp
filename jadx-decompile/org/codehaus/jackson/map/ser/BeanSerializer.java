package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonMappingException.Reference;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ResolvableSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.schema.SchemaAware;
import org.codehaus.jackson.type.JavaType;

public class BeanSerializer extends SerializerBase<Object> implements ResolvableSerializer, SchemaAware {
    protected static final BeanPropertyWriter[] NO_PROPS = new BeanPropertyWriter[0];
    protected final AnyGetterWriter _anyGetterWriter;
    protected final BeanPropertyWriter[] _filteredProps;
    protected final Object _propertyFilterId;
    protected final BeanPropertyWriter[] _props;

    public BeanSerializer(Class<?> cls, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2, AnyGetterWriter anyGetterWriter, Object obj) {
        super(cls);
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        this._anyGetterWriter = anyGetterWriter;
        this._propertyFilterId = obj;
    }

    protected BeanSerializer(BeanSerializer beanSerializer) {
        this(beanSerializer._handledType, beanSerializer._props, beanSerializer._filteredProps, beanSerializer._anyGetterWriter, beanSerializer._propertyFilterId);
    }

    public BeanSerializer(JavaType javaType, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2, AnyGetterWriter anyGetterWriter, Object obj) {
        super(javaType);
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        this._anyGetterWriter = anyGetterWriter;
        this._propertyFilterId = obj;
    }

    public static BeanSerializer createDummy(Class<?> cls) {
        return new BeanSerializer((Class) cls, NO_PROPS, null, null, null);
    }

    protected BeanPropertyFilter findFilter(SerializerProvider serializerProvider) {
        Object obj = this._propertyFilterId;
        FilterProvider filterProvider = serializerProvider.getFilterProvider();
        if (filterProvider == null) {
            throw new JsonMappingException("Can not resolve BeanPropertyFilter with id '" + obj + "'; no FilterProvider configured");
        }
        BeanPropertyFilter findFilter = filterProvider.findFilter(obj);
        if (findFilter != null) {
            return findFilter;
        }
        throw new JsonMappingException("No filter configured with id '" + obj + "' (type " + obj.getClass().getName() + ")");
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("object", true);
        JsonNode objectNode = createSchemaNode.objectNode();
        for (Object obj : this._props) {
            Type genericPropertyType;
            JavaType serializationType = obj.getSerializationType();
            if (serializationType == null) {
                genericPropertyType = obj.getGenericPropertyType();
            } else {
                Object rawClass = serializationType.getRawClass();
            }
            JsonSerializer serializer = obj.getSerializer();
            if (serializer == null) {
                Class rawSerializationType = obj.getRawSerializationType();
                if (rawSerializationType == null) {
                    rawSerializationType = obj.getPropertyType();
                }
                serializer = serializerProvider.findValueSerializer(rawSerializationType, obj);
            }
            objectNode.put(obj.getName(), serializer instanceof SchemaAware ? ((SchemaAware) serializer).getSchema(serializerProvider, genericPropertyType) : JsonSchema.getDefaultSchemaNode());
        }
        createSchemaNode.put("properties", objectNode);
        return createSchemaNode;
    }

    public void resolve(SerializerProvider serializerProvider) {
        int length = this._filteredProps == null ? 0 : this._filteredProps.length;
        int length2 = this._props.length;
        for (int i = 0; i < length2; i++) {
            Object obj = this._props[i];
            if (!obj.hasSerializer()) {
                JavaType serializationType = obj.getSerializationType();
                if (serializationType == null) {
                    serializationType = serializerProvider.constructType(obj.getGenericPropertyType());
                    if (!serializationType.isFinal()) {
                        if (serializationType.isContainerType() || serializationType.containedTypeCount() > 0) {
                            obj.setNonTrivialBaseType(serializationType);
                        }
                    }
                }
                JsonSerializer findValueSerializer = serializerProvider.findValueSerializer(serializationType, obj);
                if (serializationType.isContainerType()) {
                    TypeSerializer typeSerializer = (TypeSerializer) serializationType.getContentType().getTypeHandler();
                    if (typeSerializer != null && (findValueSerializer instanceof ContainerSerializerBase)) {
                        findValueSerializer = ((ContainerSerializerBase) findValueSerializer).withValueTypeSerializer(typeSerializer);
                    }
                }
                this._props[i] = obj.withSerializer(findValueSerializer);
                if (i < length) {
                    BeanPropertyWriter beanPropertyWriter = this._filteredProps[i];
                    if (beanPropertyWriter != null) {
                        this._filteredProps[i] = beanPropertyWriter.withSerializer(findValueSerializer);
                    }
                }
            }
        }
        if (this._anyGetterWriter != null) {
            this._anyGetterWriter.resolve(serializerProvider);
        }
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject();
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    protected void serializeFields(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || serializerProvider.getSerializationView() == null) ? this._props : this._filteredProps;
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
                }
                i++;
            }
            if (this._anyGetterWriter != null) {
                this._anyGetterWriter.getAndSerialize(obj, jsonGenerator, serializerProvider);
            }
        } catch (Throwable e) {
            wrapAndThrow(serializerProvider, e, obj, i == beanPropertyWriterArr.length ? "[anySetter]" : beanPropertyWriterArr[i].getName());
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException("Infinite recursion (StackOverflowError)");
            jsonMappingException.prependPath(new Reference(obj, i == beanPropertyWriterArr.length ? "[anySetter]" : beanPropertyWriterArr[i].getName()));
            throw jsonMappingException;
        }
    }

    protected void serializeFieldsFiltered(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || serializerProvider.getSerializationView() == null) ? this._props : this._filteredProps;
        BeanPropertyFilter findFilter = findFilter(serializerProvider);
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    findFilter.serializeAsField(obj, jsonGenerator, serializerProvider, beanPropertyWriter);
                }
                i++;
            }
            if (this._anyGetterWriter != null) {
                this._anyGetterWriter.getAndSerialize(obj, jsonGenerator, serializerProvider);
            }
        } catch (Throwable e) {
            wrapAndThrow(serializerProvider, e, obj, i == beanPropertyWriterArr.length ? "[anySetter]" : beanPropertyWriterArr[i].getName());
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException("Infinite recursion (StackOverflowError)");
            jsonMappingException.prependPath(new Reference(obj, i == beanPropertyWriterArr.length ? "[anySetter]" : beanPropertyWriterArr[i].getName()));
            throw jsonMappingException;
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForObject(obj, jsonGenerator);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffixForObject(obj, jsonGenerator);
    }

    public String toString() {
        return "BeanSerializer for " + handledType().getName();
    }
}
