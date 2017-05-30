package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.annotate.JsonCachable;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.util.ClassUtil;

@JsonCachable
public class EnumDeserializer extends StdScalarDeserializer<Enum<?>> {
    final EnumResolver<?> _resolver;

    public EnumDeserializer(EnumResolver<?> enumResolver) {
        super(Enum.class);
        this._resolver = enumResolver;
    }

    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        if (annotatedMethod.getParameterType(0) != String.class) {
            throw new IllegalArgumentException("Parameter #0 type for factory method (" + annotatedMethod + ") not suitable, must be java.lang.String");
        }
        if (deserializationConfig.isEnabled(Feature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember());
        }
        return new FactoryBasedDeserializer(cls, annotatedMethod);
    }

    public Enum<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Enum<?> findEnum;
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_STRING) {
            findEnum = this._resolver.findEnum(jsonParser.getText());
            if (findEnum == null) {
                throw deserializationContext.weirdStringException(this._resolver.getEnumClass(), "value not one of declared Enum instance names");
            }
        } else if (currentToken != JsonToken.VALUE_NUMBER_INT) {
            throw deserializationContext.mappingException(this._resolver.getEnumClass());
        } else if (deserializationContext.isEnabled(Feature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
            throw deserializationContext.mappingException("Not allowed to deserialize Enum value out of JSON number (disable DeserializationConfig.Feature.FAIL_ON_NUMBERS_FOR_ENUMS to allow)");
        } else {
            findEnum = this._resolver.getEnum(jsonParser.getIntValue());
            if (findEnum == null) {
                throw deserializationContext.weirdNumberException(this._resolver.getEnumClass(), "index value outside legal index range [0.." + this._resolver.lastValidIndex() + "]");
            }
        }
        return findEnum;
    }
}
