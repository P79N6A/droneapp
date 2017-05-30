package org.codehaus.jackson.map.deser;

import com.google.android.gms.cast.MediaQueueItem;
import java.sql.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonParser$NumberType;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.io.NumberInput;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ResolvableDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.type.JavaType;

public abstract class StdDeserializer<T> extends JsonDeserializer<T> {
    protected final Class<?> _valueClass;

    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$codehaus$jackson$JsonParser$NumberType = new int[JsonParser$NumberType.values().length];
        static final /* synthetic */ int[] $SwitchMap$org$codehaus$jackson$JsonToken = new int[JsonToken.values().length];

        static {
            try {
                $SwitchMap$org$codehaus$jackson$JsonParser$NumberType[JsonParser$NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$codehaus$jackson$JsonParser$NumberType[JsonParser$NumberType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public static final class AtomicBooleanDeserializer extends StdScalarDeserializer<AtomicBoolean> {
        public AtomicBooleanDeserializer() {
            super(AtomicBoolean.class);
        }

        public AtomicBoolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new AtomicBoolean(_parseBooleanPrimitive(jsonParser, deserializationContext));
        }
    }

    public static class AtomicReferenceDeserializer extends StdScalarDeserializer<AtomicReference<?>> implements ResolvableDeserializer {
        protected final BeanProperty _property;
        protected final JavaType _referencedType;
        protected JsonDeserializer<?> _valueDeserializer;

        public AtomicReferenceDeserializer(JavaType javaType, BeanProperty beanProperty) {
            super(AtomicReference.class);
            this._referencedType = javaType;
            this._property = beanProperty;
        }

        public AtomicReference<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new AtomicReference(this._valueDeserializer.deserialize(jsonParser, deserializationContext));
        }

        public void resolve(DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider) {
            this._valueDeserializer = deserializerProvider.findValueDeserializer(deserializationConfig, this._referencedType, this._property);
        }
    }

    protected static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        final T _nullValue;

        protected PrimitiveOrWrapperDeserializer(Class<T> cls, T t) {
            super(cls);
            this._nullValue = t;
        }

        public final T getNullValue() {
            return this._nullValue;
        }
    }

    public static class SqlDateDeserializer extends StdScalarDeserializer<Date> {
        public SqlDateDeserializer() {
            super(Date.class);
        }

        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            java.util.Date _parseDate = _parseDate(jsonParser, deserializationContext);
            return _parseDate == null ? null : new Date(_parseDate.getTime());
        }
    }

    public static class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
        public StackTraceElementDeserializer() {
            super(StackTraceElement.class);
        }

        public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                String str = "";
                String str2 = "";
                String str3 = "";
                int i = -1;
                while (true) {
                    JsonToken nextValue = jsonParser.nextValue();
                    if (nextValue == JsonToken.END_OBJECT) {
                        return new StackTraceElement(str, str2, str3, i);
                    }
                    String currentName = jsonParser.getCurrentName();
                    if ("className".equals(currentName)) {
                        str = jsonParser.getText();
                    } else if ("fileName".equals(currentName)) {
                        str3 = jsonParser.getText();
                    } else if ("lineNumber".equals(currentName)) {
                        if (nextValue.isNumeric()) {
                            i = jsonParser.getIntValue();
                        } else {
                            throw JsonMappingException.from(jsonParser, "Non-numeric token (" + nextValue + ") for property 'lineNumber'");
                        }
                    } else if ("methodName".equals(currentName)) {
                        str2 = jsonParser.getText();
                    } else if (!"nativeMethod".equals(currentName)) {
                        handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, currentName);
                    }
                }
            } else {
                throw deserializationContext.mappingException(this._valueClass);
            }
        }
    }

    protected StdDeserializer(Class<?> cls) {
        this._valueClass = cls;
    }

    protected StdDeserializer(JavaType javaType) {
        this._valueClass = javaType == null ? null : javaType.getRawClass();
    }

    protected static final double parseDouble(String str) {
        return NumberInput.NASTY_SMALL_DOUBLE.equals(str) ? Double.MIN_NORMAL : Double.parseDouble(str);
    }

    protected final Boolean _parseBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return jsonParser.getIntValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
        } else {
            if (currentToken == JsonToken.VALUE_STRING) {
                String trim = jsonParser.getText().trim();
                if ("true".equals(trim)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(trim) || trim.length() == 0) {
                    return Boolean.FALSE;
                }
                throw deserializationContext.weirdStringException(this._valueClass, "only \"true\" or \"false\" recognized");
            }
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    protected final boolean _parseBooleanPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        if (currentToken == JsonToken.VALUE_NULL) {
            return false;
        }
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return jsonParser.getIntValue() != 0;
        } else {
            if (currentToken == JsonToken.VALUE_STRING) {
                String trim = jsonParser.getText().trim();
                if ("true".equals(trim)) {
                    return true;
                }
                if ("false".equals(trim) || trim.length() == 0) {
                    return Boolean.FALSE.booleanValue();
                }
                throw deserializationContext.weirdStringException(this._valueClass, "only \"true\" or \"false\" recognized");
            }
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    protected java.util.Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        try {
            if (currentToken == JsonToken.VALUE_NUMBER_INT) {
                return new java.util.Date(jsonParser.getLongValue());
            }
            if (currentToken == JsonToken.VALUE_STRING) {
                String trim = jsonParser.getText().trim();
                return trim.length() == 0 ? null : deserializationContext.parseDate(trim);
            } else {
                throw deserializationContext.mappingException(this._valueClass);
            }
        } catch (IllegalArgumentException e) {
            throw deserializationContext.weirdStringException(this._valueClass, "not a valid representation (error: " + e.getMessage() + ")");
        }
    }

    protected final Double _parseDouble(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return Double.valueOf(jsonParser.getDoubleValue());
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return null;
            }
            switch (trim.charAt(0)) {
                case '-':
                    if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                        return Double.valueOf(Double.NEGATIVE_INFINITY);
                    }
                case 'I':
                    if ("Infinity".equals(trim) || "INF".equals(trim)) {
                        return Double.valueOf(MediaQueueItem.b);
                    }
                case 'N':
                    if ("NaN".equals(trim)) {
                        return Double.valueOf(Double.NaN);
                    }
                    break;
            }
            try {
                return Double.valueOf(parseDouble(trim));
            } catch (IllegalArgumentException e) {
                throw deserializationContext.weirdStringException(this._valueClass, "not a valid Double value");
            }
        } else if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    protected final double _parseDoublePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return jsonParser.getDoubleValue();
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return 0.0d;
            }
            switch (trim.charAt(0)) {
                case '-':
                    if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                        return Double.NEGATIVE_INFINITY;
                    }
                case 'I':
                    if ("Infinity".equals(trim) || "INF".equals(trim)) {
                        return MediaQueueItem.b;
                    }
                case 'N':
                    if ("NaN".equals(trim)) {
                        return Double.NaN;
                    }
                    break;
            }
            try {
                return parseDouble(trim);
            } catch (IllegalArgumentException e) {
                throw deserializationContext.weirdStringException(this._valueClass, "not a valid double value");
            }
        } else if (currentToken == JsonToken.VALUE_NULL) {
            return 0.0d;
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    protected final Float _parseFloat(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return Float.valueOf(jsonParser.getFloatValue());
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return null;
            }
            switch (trim.charAt(0)) {
                case '-':
                    if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                        return Float.valueOf(Float.NEGATIVE_INFINITY);
                    }
                case 'I':
                    if ("Infinity".equals(trim) || "INF".equals(trim)) {
                        return Float.valueOf(Float.POSITIVE_INFINITY);
                    }
                case 'N':
                    if ("NaN".equals(trim)) {
                        return Float.valueOf(Float.NaN);
                    }
                    break;
            }
            try {
                return Float.valueOf(Float.parseFloat(trim));
            } catch (IllegalArgumentException e) {
                throw deserializationContext.weirdStringException(this._valueClass, "not a valid Float value");
            }
        } else if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    protected final float _parseFloatPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return jsonParser.getFloatValue();
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return 0.0f;
            }
            switch (trim.charAt(0)) {
                case '-':
                    if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                        return Float.NEGATIVE_INFINITY;
                    }
                case 'I':
                    if ("Infinity".equals(trim) || "INF".equals(trim)) {
                        return Float.POSITIVE_INFINITY;
                    }
                case 'N':
                    if ("NaN".equals(trim)) {
                        return Float.NaN;
                    }
                    break;
            }
            try {
                return Float.parseFloat(trim);
            } catch (IllegalArgumentException e) {
                throw deserializationContext.weirdStringException(this._valueClass, "not a valid float value");
            }
        } else if (currentToken == JsonToken.VALUE_NULL) {
            return 0.0f;
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    protected final int _parseIntPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return jsonParser.getIntValue();
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            try {
                int length = trim.length();
                if (length <= 9) {
                    return length != 0 ? NumberInput.parseInt(trim) : 0;
                } else {
                    long parseLong = Long.parseLong(trim);
                    if (parseLong >= -2147483648L && parseLong <= 2147483647L) {
                        return (int) parseLong;
                    }
                    throw deserializationContext.weirdStringException(this._valueClass, "Overflow: numeric value (" + trim + ") out of range of int (" + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + ")");
                }
            } catch (IllegalArgumentException e) {
                throw deserializationContext.weirdStringException(this._valueClass, "not a valid int value");
            }
        } else if (currentToken == JsonToken.VALUE_NULL) {
            return 0;
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    protected final Integer _parseInteger(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return Integer.valueOf(jsonParser.getIntValue());
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            try {
                int length = trim.length();
                if (length <= 9) {
                    return length != 0 ? Integer.valueOf(NumberInput.parseInt(trim)) : null;
                } else {
                    long parseLong = Long.parseLong(trim);
                    if (parseLong >= -2147483648L && parseLong <= 2147483647L) {
                        return Integer.valueOf((int) parseLong);
                    }
                    throw deserializationContext.weirdStringException(this._valueClass, "Overflow: numeric value (" + trim + ") out of range of Integer (" + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + ")");
                }
            } catch (IllegalArgumentException e) {
                throw deserializationContext.weirdStringException(this._valueClass, "not a valid Integer value");
            }
        } else if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    protected final Long _parseLong(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return Long.valueOf(jsonParser.getLongValue());
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return null;
            }
            try {
                return Long.valueOf(NumberInput.parseLong(trim));
            } catch (IllegalArgumentException e) {
                throw deserializationContext.weirdStringException(this._valueClass, "not a valid Long value");
            }
        } else if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    protected final long _parseLongPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return jsonParser.getLongValue();
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return 0;
            }
            try {
                return NumberInput.parseLong(trim);
            } catch (IllegalArgumentException e) {
                throw deserializationContext.weirdStringException(this._valueClass, "not a valid long value");
            }
        } else if (currentToken == JsonToken.VALUE_NULL) {
            return 0;
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    protected final Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return Short.valueOf(jsonParser.getShortValue());
        }
        int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        if (_parseIntPrimitive >= -32768 && _parseIntPrimitive <= 32767) {
            return Short.valueOf((short) _parseIntPrimitive);
        }
        throw deserializationContext.weirdStringException(this._valueClass, "overflow, value can not be represented as 16-bit value");
    }

    protected final short _parseShortPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        if (_parseIntPrimitive >= -32768 && _parseIntPrimitive <= 32767) {
            return (short) _parseIntPrimitive;
        }
        throw deserializationContext.weirdStringException(this._valueClass, "overflow, value can not be represented as 16-bit value");
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    protected JsonDeserializer<Object> findDeserializer(DeserializationConfig deserializationConfig, DeserializerProvider deserializerProvider, JavaType javaType, BeanProperty beanProperty) {
        return deserializerProvider.findValueDeserializer(deserializationConfig, javaType, beanProperty);
    }

    public Class<?> getValueClass() {
        return this._valueClass;
    }

    public JavaType getValueType() {
        return null;
    }

    protected void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        if (obj == null) {
            obj = getValueClass();
        }
        if (!deserializationContext.handleUnknownProperty(jsonParser, this, obj, str)) {
            reportUnknownProperty(deserializationContext, obj, str);
            jsonParser.skipChildren();
        }
    }

    protected boolean isDefaultSerializer(JsonDeserializer<?> jsonDeserializer) {
        return (jsonDeserializer == null || jsonDeserializer.getClass().getAnnotation(JacksonStdImpl.class) == null) ? false : true;
    }

    protected void reportUnknownProperty(DeserializationContext deserializationContext, Object obj, String str) {
        if (deserializationContext.isEnabled(Feature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw deserializationContext.unknownFieldException(obj, str);
        }
    }
}
