package org.codehaus.jackson.map.deser;

import java.util.HashMap;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.type.JavaType;

public class ArrayDeserializers {
    static final ArrayDeserializers instance = new ArrayDeserializers();
    HashMap<JavaType, JsonDeserializer<Object>> _allDeserializers = new HashMap();

    static abstract class ArrayDeser<T> extends StdDeserializer<T> {
        protected ArrayDeser(Class<T> cls) {
            super((Class) cls);
        }

        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
            return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
        }
    }

    private ArrayDeserializers() {
        add(Boolean.TYPE, new BooleanDeser());
        add(Byte.TYPE, new ByteDeser());
        add(Short.TYPE, new ShortDeser());
        add(Integer.TYPE, new IntDeser());
        add(Long.TYPE, new LongDeser());
        add(Float.TYPE, new FloatDeser());
        add(Double.TYPE, new DoubleDeser());
        add(String.class, new StringDeser());
        add(Character.TYPE, new CharDeser());
    }

    private void add(Class<?> cls, JsonDeserializer<?> jsonDeserializer) {
        this._allDeserializers.put(TypeFactory.defaultInstance().constructType(cls), jsonDeserializer);
    }

    public static HashMap<JavaType, JsonDeserializer<Object>> getAll() {
        return instance._allDeserializers;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }
}
