package org.codehaus.jackson.map.ser;

import java.util.EnumSet;
import java.util.Iterator;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.type.JavaType;

public final class ContainerSerializers {

    public static class EnumSetSerializer extends AsArraySerializer<EnumSet<? extends Enum<?>>> {
        public EnumSetSerializer(JavaType javaType, BeanProperty beanProperty) {
            super(EnumSet.class, javaType, true, null, beanProperty);
        }

        public ContainerSerializerBase<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return this;
        }

        public void serializeContents(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            JsonSerializer jsonSerializer = this._elementSerializer;
            Iterator it = enumSet.iterator();
            JsonSerializer jsonSerializer2 = jsonSerializer;
            while (it.hasNext()) {
                Enum enumR = (Enum) it.next();
                if (jsonSerializer2 == null) {
                    jsonSerializer2 = serializerProvider.findValueSerializer(enumR.getDeclaringClass(), this._property);
                }
                jsonSerializer2.serialize(enumR, jsonGenerator, serializerProvider);
            }
        }
    }

    private ContainerSerializers() {
    }

    public static ContainerSerializerBase<?> collectionSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty, JsonSerializer<Object> jsonSerializer) {
        return new CollectionSerializer(javaType, z, typeSerializer, beanProperty, jsonSerializer);
    }

    public static JsonSerializer<?> enumSetSerializer(JavaType javaType, BeanProperty beanProperty) {
        return new EnumSetSerializer(javaType, beanProperty);
    }

    public static ContainerSerializerBase<?> indexedListSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty, JsonSerializer<Object> jsonSerializer) {
        return new IndexedListSerializer(javaType, z, typeSerializer, beanProperty, jsonSerializer);
    }

    public static ContainerSerializerBase<?> iterableSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        return new IterableSerializer(javaType, z, typeSerializer, beanProperty);
    }

    public static ContainerSerializerBase<?> iteratorSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        return new IteratorSerializer(javaType, z, typeSerializer, beanProperty);
    }
}
