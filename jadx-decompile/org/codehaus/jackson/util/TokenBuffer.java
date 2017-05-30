package org.codehaus.jackson.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.Base64Variant;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonGenerator$Feature;
import org.codehaus.jackson.JsonLocation;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonParser$Feature;
import org.codehaus.jackson.JsonParser$NumberType;
import org.codehaus.jackson.JsonStreamContext;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.SerializableString;
import org.codehaus.jackson.impl.JsonParserMinimalBase;
import org.codehaus.jackson.impl.JsonReadContext;
import org.codehaus.jackson.impl.JsonWriteContext;
import org.codehaus.jackson.io.SerializedString;

public class TokenBuffer extends JsonGenerator {
    protected static final int DEFAULT_PARSER_FEATURES = JsonParser$Feature.collectDefaults();
    protected int _appendOffset;
    protected boolean _closed;
    protected Segment _first;
    protected int _generatorFeatures = DEFAULT_PARSER_FEATURES;
    protected Segment _last;
    protected ObjectCodec _objectCodec;
    protected JsonWriteContext _writeContext = JsonWriteContext.createRootContext();

    protected static final class Parser extends JsonParserMinimalBase {
        protected transient ByteArrayBuilder _byteBuilder;
        protected boolean _closed;
        protected ObjectCodec _codec;
        protected JsonLocation _location = null;
        protected JsonReadContext _parsingContext;
        protected Segment _segment;
        protected int _segmentPtr;

        public Parser(Segment segment, ObjectCodec objectCodec) {
            super(0);
            this._segment = segment;
            this._segmentPtr = -1;
            this._codec = objectCodec;
            this._parsingContext = JsonReadContext.createRootContext(-1, -1);
        }

        protected final void _checkIsNumber() {
            if (this._currToken == null || !this._currToken.isNumeric()) {
                throw _constructError("Current token (" + this._currToken + ") not numeric, can not use numeric value accessors");
            }
        }

        protected final Object _currentObject() {
            return this._segment.get(this._segmentPtr);
        }

        protected void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2;
                char charAt;
                while (true) {
                    i2 = i + 1;
                    charAt = str.charAt(i);
                    if (i2 < length) {
                        if (charAt > l.c) {
                            break;
                        }
                        i = i2;
                    } else {
                        return;
                    }
                }
                int decodeBase64Char = base64Variant.decodeBase64Char(charAt);
                if (decodeBase64Char < 0) {
                    _reportInvalidBase64(base64Variant, charAt, 0, null);
                }
                if (i2 >= length) {
                    _reportBase64EOF();
                }
                i = i2 + 1;
                char charAt2 = str.charAt(i2);
                int decodeBase64Char2 = base64Variant.decodeBase64Char(charAt2);
                if (decodeBase64Char2 < 0) {
                    _reportInvalidBase64(base64Variant, charAt2, 1, null);
                }
                i2 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (i >= length) {
                    if (base64Variant.usesPadding()) {
                        _reportBase64EOF();
                    } else {
                        byteArrayBuilder.append(i2 >> 4);
                        return;
                    }
                }
                decodeBase64Char = i + 1;
                charAt = str.charAt(i);
                decodeBase64Char2 = base64Variant.decodeBase64Char(charAt);
                char charAt3;
                if (decodeBase64Char2 < 0) {
                    if (decodeBase64Char2 != -2) {
                        _reportInvalidBase64(base64Variant, charAt, 2, null);
                    }
                    if (decodeBase64Char >= length) {
                        _reportBase64EOF();
                    }
                    i = decodeBase64Char + 1;
                    charAt3 = str.charAt(decodeBase64Char);
                    if (!base64Variant.usesPaddingChar(charAt3)) {
                        _reportInvalidBase64(base64Variant, charAt3, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                    }
                    byteArrayBuilder.append(i2 >> 4);
                } else {
                    i2 = (i2 << 6) | decodeBase64Char2;
                    if (decodeBase64Char >= length) {
                        if (base64Variant.usesPadding()) {
                            _reportBase64EOF();
                        } else {
                            byteArrayBuilder.appendTwoBytes(i2 >> 2);
                            return;
                        }
                    }
                    i = decodeBase64Char + 1;
                    charAt3 = str.charAt(decodeBase64Char);
                    decodeBase64Char2 = base64Variant.decodeBase64Char(charAt3);
                    if (decodeBase64Char2 < 0) {
                        if (decodeBase64Char2 != -2) {
                            _reportInvalidBase64(base64Variant, charAt3, 3, null);
                        }
                        byteArrayBuilder.appendTwoBytes(i2 >> 2);
                    } else {
                        byteArrayBuilder.appendThreeBytes((i2 << 6) | decodeBase64Char2);
                    }
                }
            }
        }

        protected void _handleEOF() {
            _throwInternal();
        }

        protected void _reportBase64EOF() {
            throw _constructError("Unexpected end-of-String in base64 content");
        }

        protected void _reportInvalidBase64(Base64Variant base64Variant, char c, int i, String str) {
            r0 = c <= l.c ? "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units" : base64Variant.usesPaddingChar(c) ? "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character" : (!Character.isDefined(c) || Character.isISOControl(c)) ? "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content" : "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
            if (str != null) {
                r0 = r0 + ": " + str;
            }
            throw _constructError(r0);
        }

        public void close() {
            if (!this._closed) {
                this._closed = true;
            }
        }

        public BigInteger getBigIntegerValue() {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigInteger) {
                return (BigInteger) numberValue;
            }
            switch (getNumberType()) {
                case BIG_DECIMAL:
                    return ((BigDecimal) numberValue).toBigInteger();
                default:
                    return BigInteger.valueOf(numberValue.longValue());
            }
        }

        public byte[] getBinaryValue(Base64Variant base64Variant) {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof byte[]) {
                    return (byte[]) _currentObject;
                }
            }
            if (this._currToken != JsonToken.VALUE_STRING) {
                throw _constructError("Current token (" + this._currToken + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary");
            }
            String text = getText();
            if (text == null) {
                return null;
            }
            ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
            if (byteArrayBuilder == null) {
                byteArrayBuilder = new ByteArrayBuilder(100);
                this._byteBuilder = byteArrayBuilder;
            }
            _decodeBase64(text, byteArrayBuilder, base64Variant);
            return byteArrayBuilder.toByteArray();
        }

        public ObjectCodec getCodec() {
            return this._codec;
        }

        public JsonLocation getCurrentLocation() {
            return this._location == null ? JsonLocation.NA : this._location;
        }

        public String getCurrentName() {
            return this._parsingContext.getCurrentName();
        }

        public BigDecimal getDecimalValue() {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigDecimal) {
                return (BigDecimal) numberValue;
            }
            switch (getNumberType()) {
                case INT:
                case LONG:
                    return BigDecimal.valueOf(numberValue.longValue());
                case BIG_INTEGER:
                    return new BigDecimal((BigInteger) numberValue);
                default:
                    return BigDecimal.valueOf(numberValue.doubleValue());
            }
        }

        public double getDoubleValue() {
            return getNumberValue().doubleValue();
        }

        public Object getEmbeddedObject() {
            return this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT ? _currentObject() : null;
        }

        public float getFloatValue() {
            return getNumberValue().floatValue();
        }

        public int getIntValue() {
            return this._currToken == JsonToken.VALUE_NUMBER_INT ? ((Number) _currentObject()).intValue() : getNumberValue().intValue();
        }

        public long getLongValue() {
            return getNumberValue().longValue();
        }

        public JsonParser$NumberType getNumberType() {
            Number numberValue = getNumberValue();
            return numberValue instanceof Integer ? JsonParser$NumberType.INT : numberValue instanceof Long ? JsonParser$NumberType.LONG : numberValue instanceof Double ? JsonParser$NumberType.DOUBLE : numberValue instanceof BigDecimal ? JsonParser$NumberType.BIG_DECIMAL : numberValue instanceof Float ? JsonParser$NumberType.FLOAT : numberValue instanceof BigInteger ? JsonParser$NumberType.BIG_INTEGER : null;
        }

        public final Number getNumberValue() {
            _checkIsNumber();
            return (Number) _currentObject();
        }

        public JsonStreamContext getParsingContext() {
            return this._parsingContext;
        }

        public String getText() {
            Object _currentObject;
            if (this._currToken == JsonToken.VALUE_STRING || this._currToken == JsonToken.FIELD_NAME) {
                _currentObject = _currentObject();
                if (_currentObject instanceof String) {
                    return (String) _currentObject;
                }
                return _currentObject == null ? null : _currentObject.toString();
            } else if (this._currToken == null) {
                return null;
            } else {
                switch (this._currToken) {
                    case VALUE_NUMBER_INT:
                    case VALUE_NUMBER_FLOAT:
                        _currentObject = _currentObject();
                        return _currentObject != null ? _currentObject.toString() : null;
                    default:
                        return this._currToken.asString();
                }
            }
        }

        public char[] getTextCharacters() {
            String text = getText();
            return text == null ? null : text.toCharArray();
        }

        public int getTextLength() {
            String text = getText();
            return text == null ? 0 : text.length();
        }

        public int getTextOffset() {
            return 0;
        }

        public JsonLocation getTokenLocation() {
            return getCurrentLocation();
        }

        public boolean hasTextCharacters() {
            return false;
        }

        public boolean isClosed() {
            return this._closed;
        }

        public JsonToken nextToken() {
            if (this._closed || this._segment == null) {
                return null;
            }
            int i = this._segmentPtr + 1;
            this._segmentPtr = i;
            if (i >= 16) {
                this._segmentPtr = 0;
                this._segment = this._segment.next();
                if (this._segment == null) {
                    return null;
                }
            }
            this._currToken = this._segment.type(this._segmentPtr);
            if (this._currToken == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                this._parsingContext.setCurrentName(_currentObject instanceof String ? (String) _currentObject : _currentObject.toString());
            } else if (this._currToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(-1, -1);
            } else if (this._currToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(-1, -1);
            } else if (this._currToken == JsonToken.END_OBJECT || this._currToken == JsonToken.END_ARRAY) {
                this._parsingContext = this._parsingContext.getParent();
                if (this._parsingContext == null) {
                    this._parsingContext = JsonReadContext.createRootContext(-1, -1);
                }
            }
            return this._currToken;
        }

        public JsonToken peekNextToken() {
            if (this._closed) {
                return null;
            }
            Segment next;
            Segment segment = this._segment;
            int i = this._segmentPtr + 1;
            if (i >= 16) {
                next = segment == null ? null : segment.next();
                i = 0;
            } else {
                next = segment;
            }
            return next != null ? next.type(i) : null;
        }

        public void setCodec(ObjectCodec objectCodec) {
            this._codec = objectCodec;
        }

        public void setLocation(JsonLocation jsonLocation) {
            this._location = jsonLocation;
        }
    }

    protected static final class Segment {
        public static final int TOKENS_PER_SEGMENT = 16;
        private static final JsonToken[] TOKEN_TYPES_BY_INDEX = new JsonToken[16];
        protected Segment _next;
        protected long _tokenTypes;
        protected final Object[] _tokens = new Object[16];

        static {
            Object values = JsonToken.values();
            System.arraycopy(values, 1, TOKEN_TYPES_BY_INDEX, 1, Math.min(15, values.length - 1));
        }

        public Segment append(int i, JsonToken jsonToken) {
            if (i < 16) {
                set(i, jsonToken);
                return null;
            }
            this._next = new Segment();
            this._next.set(0, jsonToken);
            return this._next;
        }

        public Segment append(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                set(i, jsonToken, obj);
                return null;
            }
            this._next = new Segment();
            this._next.set(0, jsonToken, obj);
            return this._next;
        }

        public Object get(int i) {
            return this._tokens[i];
        }

        public Segment next() {
            return this._next;
        }

        public void set(int i, JsonToken jsonToken) {
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
        }

        public void set(int i, JsonToken jsonToken, Object obj) {
            this._tokens[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
        }

        public JsonToken type(int i) {
            long j = this._tokenTypes;
            if (i > 0) {
                j >>= i << 2;
            }
            return TOKEN_TYPES_BY_INDEX[((int) j) & 15];
        }
    }

    public TokenBuffer(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendOffset = 0;
    }

    protected final void _append(JsonToken jsonToken) {
        Segment append = this._last.append(this._appendOffset, jsonToken);
        if (append == null) {
            this._appendOffset++;
            return;
        }
        this._last = append;
        this._appendOffset = 1;
    }

    protected final void _append(JsonToken jsonToken, Object obj) {
        Segment append = this._last.append(this._appendOffset, jsonToken, obj);
        if (append == null) {
            this._appendOffset++;
            return;
        }
        this._last = append;
        this._appendOffset = 1;
    }

    protected void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public JsonParser asParser() {
        return asParser(this._objectCodec);
    }

    public JsonParser asParser(JsonParser jsonParser) {
        JsonParser parser = new Parser(this._first, jsonParser.getCodec());
        parser.setLocation(jsonParser.getTokenLocation());
        return parser;
    }

    public JsonParser asParser(ObjectCodec objectCodec) {
        return new Parser(this._first, objectCodec);
    }

    public void close() {
        this._closed = true;
    }

    public void copyCurrentEvent(JsonParser jsonParser) {
        switch (jsonParser.getCurrentToken()) {
            case START_OBJECT:
                writeStartObject();
                return;
            case END_OBJECT:
                writeEndObject();
                return;
            case START_ARRAY:
                writeStartArray();
                return;
            case END_ARRAY:
                writeEndArray();
                return;
            case FIELD_NAME:
                writeFieldName(jsonParser.getCurrentName());
                return;
            case VALUE_STRING:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case VALUE_NUMBER_INT:
                switch (jsonParser.getNumberType()) {
                    case INT:
                        writeNumber(jsonParser.getIntValue());
                        return;
                    case BIG_INTEGER:
                        writeNumber(jsonParser.getBigIntegerValue());
                        return;
                    default:
                        writeNumber(jsonParser.getLongValue());
                        return;
                }
            case VALUE_NUMBER_FLOAT:
                switch (jsonParser.getNumberType()) {
                    case BIG_DECIMAL:
                        writeNumber(jsonParser.getDecimalValue());
                        return;
                    case FLOAT:
                        writeNumber(jsonParser.getFloatValue());
                        return;
                    default:
                        writeNumber(jsonParser.getDoubleValue());
                        return;
                }
            case VALUE_TRUE:
                writeBoolean(true);
                return;
            case VALUE_FALSE:
                writeBoolean(false);
                return;
            case VALUE_NULL:
                writeNull();
                return;
            case VALUE_EMBEDDED_OBJECT:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: should never end up through this code path");
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            writeFieldName(jsonParser.getCurrentName());
            currentToken = jsonParser.nextToken();
        }
        switch (currentToken) {
            case START_OBJECT:
                writeStartObject();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    copyCurrentStructure(jsonParser);
                }
                writeEndObject();
                return;
            case START_ARRAY:
                writeStartArray();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    copyCurrentStructure(jsonParser);
                }
                writeEndArray();
                return;
            default:
                copyCurrentEvent(jsonParser);
                return;
        }
    }

    public JsonGenerator disable(JsonGenerator$Feature jsonGenerator$Feature) {
        this._generatorFeatures &= jsonGenerator$Feature.getMask() ^ -1;
        return this;
    }

    public JsonGenerator enable(JsonGenerator$Feature jsonGenerator$Feature) {
        this._generatorFeatures |= jsonGenerator$Feature.getMask();
        return this;
    }

    public void flush() {
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    public boolean isClosed() {
        return this._closed;
    }

    public boolean isEnabled(JsonGenerator$Feature jsonGenerator$Feature) {
        return (this._generatorFeatures & jsonGenerator$Feature.getMask()) != 0;
    }

    public void serialize(JsonGenerator jsonGenerator) {
        int i = -1;
        Segment segment = this._first;
        while (true) {
            int i2;
            Segment segment2;
            i++;
            if (i >= 16) {
                Segment next = segment.next();
                if (next != null) {
                    i2 = 0;
                    segment2 = next;
                } else {
                    return;
                }
            }
            segment2 = segment;
            i2 = i;
            JsonToken type = segment2.type(i2);
            if (type != null) {
                Object obj;
                switch (type) {
                    case START_OBJECT:
                        jsonGenerator.writeStartObject();
                        break;
                    case END_OBJECT:
                        jsonGenerator.writeEndObject();
                        break;
                    case START_ARRAY:
                        jsonGenerator.writeStartArray();
                        break;
                    case END_ARRAY:
                        jsonGenerator.writeEndArray();
                        break;
                    case FIELD_NAME:
                        obj = segment2.get(i2);
                        if (!(obj instanceof SerializableString)) {
                            jsonGenerator.writeFieldName((String) obj);
                            break;
                        } else {
                            jsonGenerator.writeFieldName((SerializableString) obj);
                            break;
                        }
                    case VALUE_STRING:
                        obj = segment2.get(i2);
                        if (!(obj instanceof SerializableString)) {
                            jsonGenerator.writeString((String) obj);
                            break;
                        } else {
                            jsonGenerator.writeString((SerializableString) obj);
                            break;
                        }
                    case VALUE_NUMBER_INT:
                        Number number = (Number) segment2.get(i2);
                        if (!(number instanceof BigInteger)) {
                            if (!(number instanceof Long)) {
                                jsonGenerator.writeNumber(number.intValue());
                                break;
                            } else {
                                jsonGenerator.writeNumber(number.longValue());
                                break;
                            }
                        }
                        jsonGenerator.writeNumber((BigInteger) number);
                        break;
                    case VALUE_NUMBER_FLOAT:
                        obj = segment2.get(i2);
                        if (obj instanceof BigDecimal) {
                            jsonGenerator.writeNumber((BigDecimal) obj);
                            break;
                        } else if (obj instanceof Float) {
                            jsonGenerator.writeNumber(((Float) obj).floatValue());
                            break;
                        } else if (obj instanceof Double) {
                            jsonGenerator.writeNumber(((Double) obj).doubleValue());
                            break;
                        } else if (obj == null) {
                            jsonGenerator.writeNull();
                            break;
                        } else if (obj instanceof String) {
                            jsonGenerator.writeNumber((String) obj);
                            break;
                        } else {
                            throw new JsonGenerationException("Unrecognized value type for VALUE_NUMBER_FLOAT: " + obj.getClass().getName() + ", can not serialize");
                        }
                    case VALUE_TRUE:
                        jsonGenerator.writeBoolean(true);
                        break;
                    case VALUE_FALSE:
                        jsonGenerator.writeBoolean(false);
                        break;
                    case VALUE_NULL:
                        jsonGenerator.writeNull();
                        break;
                    case VALUE_EMBEDDED_OBJECT:
                        jsonGenerator.writeObject(segment2.get(i2));
                        break;
                    default:
                        throw new RuntimeException("Internal error: should never end up through this code path");
                }
                i = i2;
                segment = segment2;
            } else {
                return;
            }
        }
    }

    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[TokenBuffer: ");
        JsonParser asParser = asParser();
        int i = 0;
        while (true) {
            try {
                JsonToken nextToken = asParser.nextToken();
                if (nextToken == null) {
                    break;
                }
                if (i < 100) {
                    if (i > 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(nextToken.toString());
                }
                i++;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            stringBuilder.append(" ... (truncated ").append(i - 100).append(" entries)");
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public JsonGenerator useDefaultPrettyPrinter() {
        return this;
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        writeObject(obj);
    }

    public void writeBoolean(boolean z) {
        _append(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    public final void writeEndArray() {
        _append(JsonToken.END_ARRAY);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    public final void writeEndObject() {
        _append(JsonToken.END_OBJECT);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    public final void writeFieldName(String str) {
        _append(JsonToken.FIELD_NAME, str);
        this._writeContext.writeFieldName(str);
    }

    public void writeFieldName(SerializableString serializableString) {
        _append(JsonToken.FIELD_NAME, serializableString);
        this._writeContext.writeFieldName(serializableString.getValue());
    }

    public void writeFieldName(SerializedString serializedString) {
        _append(JsonToken.FIELD_NAME, serializedString);
        this._writeContext.writeFieldName(serializedString.getValue());
    }

    public void writeNull() {
        _append(JsonToken.VALUE_NULL);
    }

    public void writeNumber(double d) {
        _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public void writeNumber(float f) {
        _append(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    public void writeNumber(int i) {
        _append(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    public void writeNumber(long j) {
        _append(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    public void writeNumber(String str) {
        _append(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    public void writeNumber(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            writeNull();
        } else {
            _append(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public void writeNumber(BigInteger bigInteger) {
        if (bigInteger == null) {
            writeNull();
        } else {
            _append(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public void writeObject(Object obj) {
        _append(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    public void writeRaw(char c) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(String str) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(String str, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(char[] cArr, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRawUTF8String(byte[] bArr, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(String str) {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(String str, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(char[] cArr, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public final void writeStartArray() {
        _append(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    public final void writeStartObject() {
        _append(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext();
    }

    public void writeString(String str) {
        if (str == null) {
            writeNull();
        } else {
            _append(JsonToken.VALUE_STRING, str);
        }
    }

    public void writeString(SerializableString serializableString) {
        if (serializableString == null) {
            writeNull();
        } else {
            _append(JsonToken.VALUE_STRING, serializableString);
        }
    }

    public void writeString(char[] cArr, int i, int i2) {
        writeString(new String(cArr, i, i2));
    }

    public void writeTree(JsonNode jsonNode) {
        _append(JsonToken.VALUE_EMBEDDED_OBJECT, jsonNode);
    }

    public void writeUTF8String(byte[] bArr, int i, int i2) {
        _reportUnsupportedOperation();
    }
}
