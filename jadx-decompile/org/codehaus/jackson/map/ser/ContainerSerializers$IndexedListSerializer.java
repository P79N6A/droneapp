package org.codehaus.jackson.map.ser;

import java.util.List;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.impl.PropertySerializerMap;
import org.codehaus.jackson.type.JavaType;

@JacksonStdImpl
public class ContainerSerializers$IndexedListSerializer extends ContainerSerializers$AsArraySerializer<List<?>> {
    public ContainerSerializers$IndexedListSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty, JsonSerializer<Object> jsonSerializer) {
        super(List.class, javaType, z, typeSerializer, beanProperty, jsonSerializer);
    }

    public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new ContainerSerializers$IndexedListSerializer(this._elementType, this._staticTyping, typeSerializer, this._property, this._elementSerializer);
    }

    public void serializeContents(List<?> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._elementSerializer != null) {
            serializeContentsUsing(list, jsonGenerator, serializerProvider, this._elementSerializer);
        } else if (this._valueTypeSerializer != null) {
            serializeTypedContents(list, jsonGenerator, serializerProvider);
        } else {
            int size = list.size();
            if (size != 0) {
                int i = 0;
                try {
                    PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
                    while (i < size) {
                        Object obj = list.get(i);
                        if (obj == null) {
                            serializerProvider.defaultSerializeNull(jsonGenerator);
                        } else {
                            Class cls = obj.getClass();
                            JsonSerializer serializerFor = propertySerializerMap.serializerFor(cls);
                            if (serializerFor == null) {
                                JsonSerializer _findAndAddDynamic = this._elementType.hasGenericTypes() ? _findAndAddDynamic(propertySerializerMap, this._elementType.forcedNarrowBy(cls), serializerProvider) : _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                                propertySerializerMap = this._dynamicSerializers;
                                serializerFor = _findAndAddDynamic;
                            }
                            serializerFor.serialize(obj, jsonGenerator, serializerProvider);
                        }
                        i++;
                    }
                } catch (Throwable e) {
                    wrapAndThrow(serializerProvider, e, list, i);
                }
            }
        }
    }

    public void serializeContentsUsing(List<?> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) {
        int size = list.size();
        if (size != 0) {
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj == null) {
                    try {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } catch (Throwable e) {
                        wrapAndThrow(serializerProvider, e, list, i);
                    }
                } else if (typeSerializer == null) {
                    jsonSerializer.serialize(obj, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        }
    }

    public void serializeTypedContents(List<?> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int size = list.size();
        if (size != 0) {
            int i = 0;
            try {
                TypeSerializer typeSerializer = this._valueTypeSerializer;
                PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
                while (i < size) {
                    Object obj = list.get(i);
                    if (obj == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        Class cls = obj.getClass();
                        JsonSerializer serializerFor = propertySerializerMap.serializerFor(cls);
                        if (serializerFor == null) {
                            JsonSerializer _findAndAddDynamic = this._elementType.hasGenericTypes() ? _findAndAddDynamic(propertySerializerMap, this._elementType.forcedNarrowBy(cls), serializerProvider) : _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                            propertySerializerMap = this._dynamicSerializers;
                            serializerFor = _findAndAddDynamic;
                        }
                        serializerFor.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                    }
                    i++;
                }
            } catch (Throwable e) {
                wrapAndThrow(serializerProvider, e, list, i);
            }
        }
    }
}
