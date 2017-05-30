package org.codehaus.jackson;

public enum JsonGenerator$Feature {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    WRITE_NUMBERS_AS_STRINGS(false),
    FLUSH_PASSED_TO_STREAM(true),
    ESCAPE_NON_ASCII(false);
    
    final boolean _defaultState;
    final int _mask;

    private JsonGenerator$Feature(boolean z) {
        this._defaultState = z;
        this._mask = 1 << ordinal();
    }

    public static int collectDefaults() {
        int i = 0;
        for (JsonGenerator$Feature jsonGenerator$Feature : values()) {
            if (jsonGenerator$Feature.enabledByDefault()) {
                i |= jsonGenerator$Feature.getMask();
            }
        }
        return i;
    }

    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public int getMask() {
        return this._mask;
    }
}
