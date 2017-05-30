package org.codehaus.jackson;

import java.io.Closeable;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.type.TypeReference;

public abstract class JsonParser implements Closeable, Versioned {
    private static final int MAX_BYTE_I = 127;
    private static final int MAX_SHORT_I = 32767;
    private static final int MIN_BYTE_I = -128;
    private static final int MIN_SHORT_I = -32768;
    protected JsonToken _currToken;
    protected int _features;
    protected JsonToken _lastClearedToken;

    protected JsonParser() {
    }

    protected JsonParser(int i) {
        this._features = i;
    }

    protected JsonParseException _constructError(String str) {
        return new JsonParseException(str, getCurrentLocation());
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public void clearCurrentToken() {
        if (this._currToken != null) {
            this._lastClearedToken = this._currToken;
            this._currToken = null;
        }
    }

    public abstract void close();

    public JsonParser configure(Feature feature, boolean z) {
        if (z) {
            enableFeature(feature);
        } else {
            disableFeature(feature);
        }
        return this;
    }

    public JsonParser disable(Feature feature) {
        this._features &= feature.getMask() ^ -1;
        return this;
    }

    public void disableFeature(Feature feature) {
        disable(feature);
    }

    public JsonParser enable(Feature feature) {
        this._features |= feature.getMask();
        return this;
    }

    public void enableFeature(Feature feature) {
        enable(feature);
    }

    public abstract BigInteger getBigIntegerValue();

    public byte[] getBinaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(Base64Variant base64Variant);

    public boolean getBooleanValue() {
        if (this._currToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (this._currToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException("Current token (" + this._currToken + ") not of boolean type", getCurrentLocation());
    }

    public byte getByteValue() {
        int intValue = getIntValue();
        if (intValue >= MIN_BYTE_I && intValue <= 127) {
            return (byte) intValue;
        }
        throw _constructError("Numeric value (" + getText() + ") out of range of Java byte");
    }

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName();

    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public Object getEmbeddedObject() {
        return null;
    }

    public abstract float getFloatValue();

    public Object getInputSource() {
        return null;
    }

    public abstract int getIntValue();

    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    public abstract long getLongValue();

    public abstract NumberType getNumberType();

    public abstract Number getNumberValue();

    public abstract JsonStreamContext getParsingContext();

    public short getShortValue() {
        int intValue = getIntValue();
        if (intValue >= MIN_SHORT_I && intValue <= MAX_SHORT_I) {
            return (short) intValue;
        }
        throw _constructError("Numeric value (" + getText() + ") out of range of Java short");
    }

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    public abstract JsonLocation getTokenLocation();

    public boolean getValueAsBoolean() {
        return getValueAsBoolean(false);
    }

    public boolean getValueAsBoolean(boolean z) {
        return z;
    }

    public double getValueAsDouble() {
        return getValueAsDouble(0.0d);
    }

    public double getValueAsDouble(double d) {
        return d;
    }

    public int getValueAsInt() {
        return getValueAsInt(0);
    }

    public int getValueAsInt(int i) {
        return i;
    }

    public long getValueAsLong() {
        return (long) getValueAsInt(0);
    }

    public long getValueAsLong(long j) {
        return j;
    }

    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    public boolean hasTextCharacters() {
        return false;
    }

    public abstract boolean isClosed();

    public boolean isEnabled(Feature feature) {
        return (this._features & feature.getMask()) != 0;
    }

    public boolean isExpectedStartArrayToken() {
        return getCurrentToken() == JsonToken.START_ARRAY;
    }

    public final boolean isFeatureEnabled(Feature feature) {
        return isEnabled(feature);
    }

    public abstract JsonToken nextToken();

    public JsonToken nextValue() {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }

    public <T> T readValueAs(Class<T> cls) {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readValue(this, cls);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
    }

    public <T> T readValueAs(TypeReference<?> typeReference) {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readValue(this, typeReference);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
    }

    public JsonNode readValueAsTree() {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readTree(this);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into JsonNode tree");
    }

    public int releaseBuffered(OutputStream outputStream) {
        return -1;
    }

    public int releaseBuffered(Writer writer) {
        return -1;
    }

    public abstract void setCodec(ObjectCodec objectCodec);

    public void setFeature(Feature feature, boolean z) {
        configure(feature, z);
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + formatSchema.getSchemaType() + "'");
    }

    public abstract JsonParser skipChildren();

    public Version version() {
        return Version.unknownVersion();
    }
}
