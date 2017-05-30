package org.codehaus.jackson.map.deser;

import java.lang.reflect.Method;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.util.ClassUtil;

protected class EnumDeserializer$FactoryBasedDeserializer extends StdScalarDeserializer<Object> {
    protected final Class<?> _enumClass;
    protected final Method _factory;

    public EnumDeserializer$FactoryBasedDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod) {
        super(Enum.class);
        this._enumClass = cls;
        this._factory = annotatedMethod.getAnnotated();
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() != JsonToken.VALUE_STRING) {
            throw deserializationContext.mappingException(this._enumClass);
        }
        String text = jsonParser.getText();
        try {
            return this._factory.invoke(this._enumClass, new Object[]{text});
        } catch (Throwable e) {
            ClassUtil.unwrapAndThrowAsIAE(e);
            return null;
        }
    }
}
