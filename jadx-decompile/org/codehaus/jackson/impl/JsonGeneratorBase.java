package org.codehaus.jackson.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonGenerator.Feature;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.Version;
import org.codehaus.jackson.util.DefaultPrettyPrinter;
import org.codehaus.jackson.util.VersionUtil;

public abstract class JsonGeneratorBase extends JsonGenerator {
    protected boolean _cfgNumbersAsStrings;
    protected boolean _closed;
    protected int _features;
    protected ObjectCodec _objectCodec;
    protected JsonWriteContext _writeContext = JsonWriteContext.createRootContext();

    protected JsonGeneratorBase(int i, ObjectCodec objectCodec) {
        this._features = i;
        this._objectCodec = objectCodec;
        this._cfgNumbersAsStrings = isEnabled(Feature.WRITE_NUMBERS_AS_STRINGS);
    }

    protected void _cantHappen() {
        throw new RuntimeException("Internal error: should never end up through this code path");
    }

    protected abstract void _releaseBuffers();

    protected void _reportError(String str) {
        throw new JsonGenerationException(str);
    }

    protected void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Operation not supported by generator of type " + getClass().getName());
    }

    protected final void _throwInternal() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    protected abstract void _verifyValueWrite(String str);

    @Deprecated
    protected void _writeEndArray() {
    }

    @Deprecated
    protected void _writeEndObject() {
    }

    protected void _writeSimpleObject(Object obj) {
        if (obj == null) {
            writeNull();
        } else if (obj instanceof String) {
            writeString((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    writeNumber(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    writeNumber(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    writeNumber(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    writeNumber(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    writeNumber((int) number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    writeNumber((int) number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    writeNumber((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    writeNumber((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    writeNumber(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    writeNumber(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                writeBinary((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                writeBoolean(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                writeBoolean(((AtomicBoolean) obj).get());
                return;
            }
            throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
        }
    }

    @Deprecated
    protected void _writeStartArray() {
    }

    @Deprecated
    protected void _writeStartObject() {
    }

    public void close() {
        this._closed = true;
    }

    public final void copyCurrentEvent(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null) {
            _reportError("No current event to copy");
        }
        switch (1.$SwitchMap$org$codehaus$jackson$JsonToken[currentToken.ordinal()]) {
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.getCurrentName());
                return;
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                switch (1.$SwitchMap$org$codehaus$jackson$JsonParser$NumberType[jsonParser.getNumberType().ordinal()]) {
                    case 1:
                        writeNumber(jsonParser.getIntValue());
                        return;
                    case 2:
                        writeNumber(jsonParser.getBigIntegerValue());
                        return;
                    default:
                        writeNumber(jsonParser.getLongValue());
                        return;
                }
            case 8:
                switch (1.$SwitchMap$org$codehaus$jackson$JsonParser$NumberType[jsonParser.getNumberType().ordinal()]) {
                    case 3:
                        writeNumber(jsonParser.getDecimalValue());
                        return;
                    case 4:
                        writeNumber(jsonParser.getFloatValue());
                        return;
                    default:
                        writeNumber(jsonParser.getDoubleValue());
                        return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                _cantHappen();
                return;
        }
    }

    public final void copyCurrentStructure(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            writeFieldName(jsonParser.getCurrentName());
            currentToken = jsonParser.nextToken();
        }
        switch (1.$SwitchMap$org$codehaus$jackson$JsonToken[currentToken.ordinal()]) {
            case 1:
                writeStartObject();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    copyCurrentStructure(jsonParser);
                }
                writeEndObject();
                return;
            case 3:
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

    public JsonGenerator disable(Feature feature) {
        this._features &= feature.getMask() ^ -1;
        if (feature == Feature.WRITE_NUMBERS_AS_STRINGS) {
            this._cfgNumbersAsStrings = false;
        } else if (feature == Feature.ESCAPE_NON_ASCII) {
            setHighestNonEscapedChar(0);
        }
        return this;
    }

    public JsonGenerator enable(Feature feature) {
        this._features |= feature.getMask();
        if (feature == Feature.WRITE_NUMBERS_AS_STRINGS) {
            this._cfgNumbersAsStrings = true;
        } else if (feature == Feature.ESCAPE_NON_ASCII) {
            setHighestNonEscapedChar(127);
        }
        return this;
    }

    public abstract void flush();

    public final ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    public boolean isClosed() {
        return this._closed;
    }

    public final boolean isEnabled(Feature feature) {
        return (this._features & feature.getMask()) != 0;
    }

    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public JsonGenerator useDefaultPrettyPrinter() {
        return setPrettyPrinter(new DefaultPrettyPrinter());
    }

    public Version version() {
        return VersionUtil.versionFor(getClass());
    }

    public void writeEndArray() {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not an ARRAY but " + this._writeContext.getTypeDesc());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            _writeEndArray();
        }
        this._writeContext = this._writeContext.getParent();
    }

    public void writeEndObject() {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not an object but " + this._writeContext.getTypeDesc());
        }
        this._writeContext = this._writeContext.getParent();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            _writeEndObject();
        }
    }

    public void writeObject(Object obj) {
        if (obj == null) {
            writeNull();
        } else if (this._objectCodec != null) {
            this._objectCodec.writeValue(this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    public void writeRawValue(String str) {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    public void writeRawValue(String str, int i, int i2) {
        _verifyValueWrite("write raw value");
        writeRaw(str, i, i2);
    }

    public void writeRawValue(char[] cArr, int i, int i2) {
        _verifyValueWrite("write raw value");
        writeRaw(cArr, i, i2);
    }

    public void writeStartArray() {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartArray(this);
        } else {
            _writeStartArray();
        }
    }

    public void writeStartObject() {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartObject(this);
        } else {
            _writeStartObject();
        }
    }

    public void writeTree(JsonNode jsonNode) {
        if (jsonNode == null) {
            writeNull();
        } else if (this._objectCodec == null) {
            throw new IllegalStateException("No ObjectCodec defined for the generator, can not serialize JsonNode-based trees");
        } else {
            this._objectCodec.writeTree(this, jsonNode);
        }
    }
}
