package org.codehaus.jackson;

public enum JsonParser$Feature {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    INTERN_FIELD_NAMES(true),
    CANONICALIZE_FIELD_NAMES(true);
    
    final boolean _defaultState;

    private JsonParser$Feature(boolean z) {
        this._defaultState = z;
    }

    public static int collectDefaults() {
        int i = 0;
        for (JsonParser$Feature jsonParser$Feature : values()) {
            if (jsonParser$Feature.enabledByDefault()) {
                i |= jsonParser$Feature.getMask();
            }
        }
        return i;
    }

    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i) {
        return (getMask() & i) != 0;
    }

    public int getMask() {
        return 1 << ordinal();
    }
}
