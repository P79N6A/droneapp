package org.codehaus.jackson.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.JsonParser$NumberType;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.io.IOContext;
import org.codehaus.jackson.io.NumberInput;

public abstract class JsonNumericParserBase extends JsonParserBase {
    static final BigDecimal BD_MAX_INT = new BigDecimal(Long.MAX_VALUE);
    static final BigDecimal BD_MAX_LONG = new BigDecimal(Long.MAX_VALUE);
    static final BigDecimal BD_MIN_INT = new BigDecimal(Long.MIN_VALUE);
    static final BigDecimal BD_MIN_LONG = new BigDecimal(Long.MIN_VALUE);
    protected static final char CHAR_NULL = '\u0000';
    protected static final int INT_0 = 48;
    protected static final int INT_1 = 49;
    protected static final int INT_2 = 50;
    protected static final int INT_3 = 51;
    protected static final int INT_4 = 52;
    protected static final int INT_5 = 53;
    protected static final int INT_6 = 54;
    protected static final int INT_7 = 55;
    protected static final int INT_8 = 56;
    protected static final int INT_9 = 57;
    protected static final int INT_DECIMAL_POINT = 46;
    protected static final int INT_E = 69;
    protected static final int INT_MINUS = 45;
    protected static final int INT_PLUS = 43;
    protected static final int INT_e = 101;
    static final double MAX_INT_D = 2.147483647E9d;
    static final long MAX_INT_L = 2147483647L;
    static final double MAX_LONG_D = 9.223372036854776E18d;
    static final double MIN_INT_D = -2.147483648E9d;
    static final long MIN_INT_L = -2147483648L;
    static final double MIN_LONG_D = -9.223372036854776E18d;
    protected static final int NR_BIGDECIMAL = 16;
    protected static final int NR_BIGINT = 4;
    protected static final int NR_DOUBLE = 8;
    protected static final int NR_INT = 1;
    protected static final int NR_LONG = 2;
    protected static final int NR_UNKNOWN = 0;
    protected int _expLength;
    protected int _fractLength;
    protected int _intLength;
    protected int _numTypesValid = 0;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected int _numberInt;
    protected long _numberLong;
    protected boolean _numberNegative;

    protected JsonNumericParserBase(IOContext iOContext, int i) {
        super(iOContext, i);
    }

    private final void _parseSlowFloatValue(int i) {
        if (i == 16) {
            try {
                this._numberBigDecimal = this._textBuffer.contentsAsDecimal();
                this._numTypesValid = 16;
                return;
            } catch (Throwable e) {
                _wrapError("Malformed numeric value '" + this._textBuffer.contentsAsString() + "'", e);
                return;
            }
        }
        this._numberDouble = this._textBuffer.contentsAsDouble();
        this._numTypesValid = 8;
    }

    private final void _parseSlowIntValue(int i, char[] cArr, int i2, int i3) {
        String contentsAsString = this._textBuffer.contentsAsString();
        try {
            if (NumberInput.inLongRange(cArr, i2, i3, this._numberNegative)) {
                this._numberLong = Long.parseLong(contentsAsString);
                this._numTypesValid = 2;
                return;
            }
            this._numberBigInt = new BigInteger(contentsAsString);
            this._numTypesValid = 4;
        } catch (Throwable e) {
            _wrapError("Malformed numeric value '" + contentsAsString + "'", e);
        }
    }

    protected void _parseNumericValue(int i) {
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            char[] textBuffer = this._textBuffer.getTextBuffer();
            int textOffset = this._textBuffer.getTextOffset();
            int i2 = this._intLength;
            if (this._numberNegative) {
                textOffset++;
            }
            if (i2 <= 9) {
                textOffset = NumberInput.parseInt(textBuffer, textOffset, i2);
                if (this._numberNegative) {
                    textOffset = -textOffset;
                }
                this._numberInt = textOffset;
                this._numTypesValid = 1;
            } else if (i2 <= 18) {
                long parseLong = NumberInput.parseLong(textBuffer, textOffset, i2);
                if (this._numberNegative) {
                    parseLong = -parseLong;
                }
                if (i2 == 10) {
                    if (this._numberNegative) {
                        if (parseLong >= MIN_INT_L) {
                            this._numberInt = (int) parseLong;
                            this._numTypesValid = 1;
                            return;
                        }
                    } else if (parseLong <= MAX_INT_L) {
                        this._numberInt = (int) parseLong;
                        this._numTypesValid = 1;
                        return;
                    }
                }
                this._numberLong = parseLong;
                this._numTypesValid = 2;
            } else {
                _parseSlowIntValue(i, textBuffer, textOffset, i2);
            }
        } else if (this._currToken == JsonToken.VALUE_NUMBER_FLOAT) {
            _parseSlowFloatValue(i);
        } else {
            _reportError("Current token (" + this._currToken + ") not numeric, can not use numeric value accessors");
        }
    }

    protected void convertNumberToBigDecimal() {
        if ((this._numTypesValid & 8) != 0) {
            this._numberBigDecimal = new BigDecimal(getText());
        } else if ((this._numTypesValid & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(this._numberBigInt);
        } else if ((this._numTypesValid & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((this._numTypesValid & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf((long) this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    protected void convertNumberToBigInteger() {
        if ((this._numTypesValid & 16) != 0) {
            this._numberBigInt = this._numberBigDecimal.toBigInteger();
        } else if ((this._numTypesValid & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((this._numTypesValid & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf((long) this._numberInt);
        } else if ((this._numTypesValid & 8) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 4;
    }

    protected void convertNumberToDouble() {
        if ((this._numTypesValid & 16) != 0) {
            this._numberDouble = this._numberBigDecimal.doubleValue();
        } else if ((this._numTypesValid & 4) != 0) {
            this._numberDouble = this._numberBigInt.doubleValue();
        } else if ((this._numTypesValid & 2) != 0) {
            this._numberDouble = (double) this._numberLong;
        } else if ((this._numTypesValid & 1) != 0) {
            this._numberDouble = (double) this._numberInt;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 8;
    }

    protected void convertNumberToInt() {
        if ((this._numTypesValid & 2) != 0) {
            int i = (int) this._numberLong;
            if (((long) i) != this._numberLong) {
                _reportError("Numeric value (" + getText() + ") out of range of int");
            }
            this._numberInt = i;
        } else if ((this._numTypesValid & 4) != 0) {
            this._numberInt = this._numberBigInt.intValue();
        } else if ((this._numTypesValid & 8) != 0) {
            if (this._numberDouble < MIN_INT_D || this._numberDouble > MAX_INT_D) {
                reportOverflowInt();
            }
            this._numberInt = (int) this._numberDouble;
        } else if ((this._numTypesValid & 16) != 0) {
            if (BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    protected void convertNumberToLong() {
        if ((this._numTypesValid & 1) != 0) {
            this._numberLong = (long) this._numberInt;
        } else if ((this._numTypesValid & 4) != 0) {
            this._numberLong = this._numberBigInt.longValue();
        } else if ((this._numTypesValid & 8) != 0) {
            if (this._numberDouble < MIN_LONG_D || this._numberDouble > MAX_LONG_D) {
                reportOverflowLong();
            }
            this._numberLong = (long) this._numberDouble;
        } else if ((this._numTypesValid & 16) != 0) {
            if (BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    public BigInteger getBigIntegerValue() {
        if ((this._numTypesValid & 4) == 0) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return this._numberBigInt;
    }

    public BigDecimal getDecimalValue() {
        if ((this._numTypesValid & 16) == 0) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return this._numberBigDecimal;
    }

    public double getDoubleValue() {
        if ((this._numTypesValid & 8) == 0) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    public float getFloatValue() {
        return (float) getDoubleValue();
    }

    public int getIntValue() {
        if ((this._numTypesValid & 1) == 0) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(1);
            }
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public long getLongValue() {
        if ((this._numTypesValid & 2) == 0) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    public JsonParser$NumberType getNumberType() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        return this._currToken == JsonToken.VALUE_NUMBER_INT ? (this._numTypesValid & 1) != 0 ? JsonParser$NumberType.INT : (this._numTypesValid & 2) != 0 ? JsonParser$NumberType.LONG : JsonParser$NumberType.BIG_INTEGER : (this._numTypesValid & 16) != 0 ? JsonParser$NumberType.BIG_DECIMAL : JsonParser$NumberType.DOUBLE;
    }

    public Number getNumberValue() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            return (this._numTypesValid & 1) != 0 ? Integer.valueOf(this._numberInt) : (this._numTypesValid & 2) != 0 ? Long.valueOf(this._numberLong) : (this._numTypesValid & 4) != 0 ? this._numberBigInt : this._numberBigDecimal;
        } else {
            if ((this._numTypesValid & 16) != 0) {
                return this._numberBigDecimal;
            }
            if ((this._numTypesValid & 8) == 0) {
                _throwInternal();
            }
            return Double.valueOf(this._numberDouble);
        }
    }

    protected void reportInvalidNumber(String str) {
        _reportError("Invalid numeric value: " + str);
    }

    protected void reportOverflowInt() {
        _reportError("Numeric value (" + getText() + ") out of range of int (" + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + ")");
    }

    protected void reportOverflowLong() {
        _reportError("Numeric value (" + getText() + ") out of range of long (" + Long.MIN_VALUE + " - " + Long.MAX_VALUE + ")");
    }

    protected void reportUnexpectedNumberChar(int i, String str) {
        String str2 = "Unexpected character (" + JsonParserMinimalBase._getCharDesc(i) + ") in numeric value";
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        _reportError(str2);
    }

    protected final JsonToken reset(boolean z, int i, int i2, int i3) {
        return (i2 >= 1 || i3 >= 1) ? resetFloat(z, i, i2, i3) : resetInt(z, i);
    }

    protected final JsonToken resetAsNaN(String str, double d) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    protected final JsonToken resetFloat(boolean z, int i, int i2, int i3) {
        this._numberNegative = z;
        this._intLength = i;
        this._fractLength = i2;
        this._expLength = i3;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    protected final JsonToken resetInt(boolean z, int i) {
        this._numberNegative = z;
        this._intLength = i;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }
}
