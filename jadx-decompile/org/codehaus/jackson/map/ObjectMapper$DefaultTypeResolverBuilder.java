package org.codehaus.jackson.map;

import java.util.Collection;
import org.codehaus.jackson.map.jsontype.NamedType;
import org.codehaus.jackson.map.jsontype.impl.StdTypeResolverBuilder;
import org.codehaus.jackson.type.JavaType;

public class ObjectMapper$DefaultTypeResolverBuilder extends StdTypeResolverBuilder {
    protected final ObjectMapper$DefaultTyping _appliesFor;

    public ObjectMapper$DefaultTypeResolverBuilder(ObjectMapper$DefaultTyping objectMapper$DefaultTyping) {
        this._appliesFor = objectMapper$DefaultTyping;
    }

    public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection, BeanProperty beanProperty) {
        return useForType(javaType) ? super.buildTypeDeserializer(deserializationConfig, javaType, collection, beanProperty) : null;
    }

    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection, BeanProperty beanProperty) {
        return useForType(javaType) ? super.buildTypeSerializer(serializationConfig, javaType, collection, beanProperty) : null;
    }

    public boolean useForType(JavaType javaType) {
        boolean z = false;
        switch (ObjectMapper$2.$SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping[this._appliesFor.ordinal()]) {
            case 1:
                if (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                if (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
                return !javaType.isFinal();
            default:
                return javaType.getRawClass() == Object.class;
        }
        if (javaType.getRawClass() == Object.class || !javaType.isConcrete()) {
            z = true;
        }
        return z;
    }
}
