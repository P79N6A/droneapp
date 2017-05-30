package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public final class StdDeserializer$ClassDeserializer extends StdScalarDeserializer<Class<?>> {
    public StdDeserializer$ClassDeserializer() {
        super(Class.class);
    }

    public Class<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
            String text = jsonParser.getText();
            if (text.indexOf(46) < 0) {
                if ("int".equals(text)) {
                    return Integer.TYPE;
                }
                if ("long".equals(text)) {
                    return Long.TYPE;
                }
                if ("float".equals(text)) {
                    return Float.TYPE;
                }
                if ("double".equals(text)) {
                    return Double.TYPE;
                }
                if ("boolean".equals(text)) {
                    return Boolean.TYPE;
                }
                if ("byte".equals(text)) {
                    return Byte.TYPE;
                }
                if ("char".equals(text)) {
                    return Character.TYPE;
                }
                if ("short".equals(text)) {
                    return Short.TYPE;
                }
                if ("void".equals(text)) {
                    return Void.TYPE;
                }
            }
            try {
                return Class.forName(jsonParser.getText());
            } catch (Throwable e) {
                throw deserializationContext.instantiationException(this._valueClass, e);
            }
        }
        throw deserializationContext.mappingException(this._valueClass);
    }
}
