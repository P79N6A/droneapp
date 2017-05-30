package org.codehaus.jackson.map.ser;

import java.util.Iterator;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.type.JavaType;

@JacksonStdImpl
public class ContainerSerializers$IteratorSerializer extends ContainerSerializers$AsArraySerializer<Iterator<?>> {
    public ContainerSerializers$IteratorSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(Iterator.class, javaType, z, typeSerializer, beanProperty);
    }

    public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new ContainerSerializers$IteratorSerializer(this._elementType, this._staticTyping, typeSerializer, this._property);
    }

    public void serializeContents(Iterator<?> it, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Class cls = null;
        if (it.hasNext()) {
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            JsonSerializer jsonSerializer = null;
            do {
                Object next = it.next();
                if (next == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    JsonSerializer jsonSerializer2;
                    Class cls2 = next.getClass();
                    if (cls2 == cls) {
                        jsonSerializer2 = jsonSerializer;
                    } else {
                        jsonSerializer = serializerProvider.findValueSerializer(cls2, this._property);
                        cls = cls2;
                        jsonSerializer2 = jsonSerializer;
                    }
                    if (typeSerializer == null) {
                        jsonSerializer2.serialize(next, jsonGenerator, serializerProvider);
                    } else {
                        jsonSerializer2.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                    }
                }
            } while (it.hasNext());
        }
    }
}
