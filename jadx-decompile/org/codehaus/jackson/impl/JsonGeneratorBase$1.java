package org.codehaus.jackson.impl;

import org.codehaus.jackson.JsonParser$NumberType;
import org.codehaus.jackson.JsonToken;

/* synthetic */ class JsonGeneratorBase$1 {
    static final /* synthetic */ int[] $SwitchMap$org$codehaus$jackson$JsonParser$NumberType = new int[JsonParser$NumberType.values().length];
    static final /* synthetic */ int[] $SwitchMap$org$codehaus$jackson$JsonToken = new int[JsonToken.values().length];

    static {
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonParser$NumberType[JsonParser$NumberType.INT.ordinal()] = 1;
        } catch (NoSuchFieldError e13) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonParser$NumberType[JsonParser$NumberType.BIG_INTEGER.ordinal()] = 2;
        } catch (NoSuchFieldError e14) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonParser$NumberType[JsonParser$NumberType.BIG_DECIMAL.ordinal()] = 3;
        } catch (NoSuchFieldError e15) {
        }
        try {
            $SwitchMap$org$codehaus$jackson$JsonParser$NumberType[JsonParser$NumberType.FLOAT.ordinal()] = 4;
        } catch (NoSuchFieldError e16) {
        }
    }
}