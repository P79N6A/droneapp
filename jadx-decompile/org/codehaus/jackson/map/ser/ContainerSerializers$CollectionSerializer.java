package org.codehaus.jackson.map.ser;

import java.util.Collection;
import java.util.Iterator;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.impl.PropertySerializerMap;
import org.codehaus.jackson.type.JavaType;

@JacksonStdImpl
public class ContainerSerializers$CollectionSerializer extends ContainerSerializers$AsArraySerializer<Collection<?>> {
    @Deprecated
    public ContainerSerializers$CollectionSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        this(javaType, z, typeSerializer, beanProperty, null);
    }

    public ContainerSerializers$CollectionSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty, JsonSerializer<Object> jsonSerializer) {
        super(Collection.class, javaType, z, typeSerializer, beanProperty, jsonSerializer);
    }

    public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new ContainerSerializers$CollectionSerializer(this._elementType, this._staticTyping, typeSerializer, this._property);
    }

    public void serializeContents(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._elementSerializer != null) {
            serializeContentsUsing(collection, jsonGenerator, serializerProvider, this._elementSerializer);
            return;
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            int i = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    Class cls = next.getClass();
                    JsonSerializer serializerFor = propertySerializerMap.serializerFor(cls);
                    if (serializerFor == null) {
                        JsonSerializer _findAndAddDynamic;
                        if (this._elementType.hasGenericTypes()) {
                            _findAndAddDynamic = _findAndAddDynamic(propertySerializerMap, this._elementType.forcedNarrowBy(cls), serializerProvider);
                        } else {
                            try {
                                _findAndAddDynamic = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                            } catch (Throwable e) {
                                wrapAndThrow(serializerProvider, e, collection, i);
                                return;
                            }
                        }
                        JsonSerializer jsonSerializer = _findAndAddDynamic;
                        propertySerializerMap = this._dynamicSerializers;
                        serializerFor = jsonSerializer;
                    }
                    if (typeSerializer == null) {
                        serializerFor.serialize(next, jsonGenerator, serializerProvider);
                    } else {
                        serializerFor.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                    }
                }
                i++;
            } while (it.hasNext());
        }
    }

    public void serializeContentsUsing(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) {
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            int i = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } catch (Throwable e) {
                        wrapAndThrow(serializerProvider, e, collection, i);
                    }
                } else if (typeSerializer == null) {
                    jsonSerializer.serialize(next, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                }
                i++;
            } while (it.hasNext());
        }
    }
}
