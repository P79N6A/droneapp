package org.codehaus.jackson.impl;

import com.fimi.soul.drone.c.a.a.m;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.Base64Variant;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonGenerator$Feature;
import org.codehaus.jackson.JsonStreamContext;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.SerializableString;
import org.codehaus.jackson.io.CharacterEscapes;
import org.codehaus.jackson.io.IOContext;
import org.codehaus.jackson.io.NumberOutput;
import org.codehaus.jackson.io.SerializedString;
import org.codehaus.jackson.util.CharTypes;

public class Utf8Generator extends JsonGeneratorBase {
    private static final byte BYTE_0 = (byte) 48;
    private static final byte BYTE_BACKSLASH = (byte) 92;
    private static final byte BYTE_COLON = (byte) 58;
    private static final byte BYTE_COMMA = (byte) 44;
    private static final byte BYTE_LBRACKET = (byte) 91;
    private static final byte BYTE_LCURLY = (byte) 123;
    private static final byte BYTE_QUOTE = (byte) 34;
    private static final byte BYTE_RBRACKET = (byte) 93;
    private static final byte BYTE_RCURLY = (byte) 125;
    private static final byte BYTE_SPACE = (byte) 32;
    private static final byte BYTE_u = (byte) 117;
    private static final byte[] FALSE_BYTES = new byte[]{(byte) 102, (byte) 97, (byte) 108, m.b, (byte) 101};
    static final byte[] HEX_CHARS = CharTypes.copyHexBytes();
    private static final int MAX_BYTES_TO_BUFFER = 512;
    private static final byte[] NULL_BYTES = new byte[]{(byte) 110, BYTE_u, (byte) 108, (byte) 108};
    protected static final int SURR1_FIRST = 55296;
    protected static final int SURR1_LAST = 56319;
    protected static final int SURR2_FIRST = 56320;
    protected static final int SURR2_LAST = 57343;
    private static final byte[] TRUE_BYTES = new byte[]{(byte) 116, (byte) 114, BYTE_u, (byte) 101};
    protected static final int[] sOutputEscapes = CharTypes.get7BitOutputEscapes();
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected CharacterEscapes _characterEscapes;
    protected byte[] _entityBuffer;
    protected final IOContext _ioContext;
    protected int _maximumNonEscapedChar;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected int[] _outputEscapes = sOutputEscapes;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail = 0;

    public Utf8Generator(IOContext iOContext, int i, ObjectCodec objectCodec, OutputStream outputStream) {
        super(i, objectCodec);
        this._ioContext = iOContext;
        this._outputStream = outputStream;
        this._bufferRecyclable = true;
        this._outputBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputEnd = this._outputBuffer.length;
        this._outputMaxContiguous = this._outputEnd >> 3;
        this._charBuffer = iOContext.allocConcatBuffer();
        this._charBufferLength = this._charBuffer.length;
        if (isEnabled(JsonGenerator$Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    public Utf8Generator(IOContext iOContext, int i, ObjectCodec objectCodec, OutputStream outputStream, byte[] bArr, int i2, boolean z) {
        super(i, objectCodec);
        this._ioContext = iOContext;
        this._outputStream = outputStream;
        this._bufferRecyclable = z;
        this._outputTail = i2;
        this._outputBuffer = bArr;
        this._outputEnd = this._outputBuffer.length;
        this._outputMaxContiguous = this._outputEnd >> 3;
        this._charBuffer = iOContext.allocConcatBuffer();
        this._charBufferLength = this._charBuffer.length;
        if (isEnabled(JsonGenerator$Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    private int _handleLongCustomEscape(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        int length = bArr2.length;
        if (i + length > i2) {
            this._outputTail = i;
            _flushBuffer();
            i4 = this._outputTail;
            if (length > bArr.length) {
                this._outputStream.write(bArr2, 0, length);
                return i4;
            }
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        } else {
            i4 = i;
        }
        if ((i3 * 6) + i4 <= i2) {
            return i4;
        }
        _flushBuffer();
        return this._outputTail;
    }

    private final int _outputMultiByteChar(int i, int i2) {
        byte[] bArr = this._outputBuffer;
        if (i < SURR1_FIRST || i > SURR2_LAST) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            i3 = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i3;
        }
        i3 = i2 + 1;
        bArr[i2] = BYTE_BACKSLASH;
        i4 = i3 + 1;
        bArr[i3] = BYTE_u;
        i3 = i4 + 1;
        bArr[i4] = HEX_CHARS[(i >> 12) & 15];
        i4 = i3 + 1;
        bArr[i3] = HEX_CHARS[(i >> 8) & 15];
        int i5 = i4 + 1;
        bArr[i4] = HEX_CHARS[(i >> 4) & 15];
        i3 = i5 + 1;
        bArr[i5] = HEX_CHARS[i & 15];
        return i3;
    }

    private final int _outputRawMultiByteChar(int i, char[] cArr, int i2, int i3) {
        if (i < SURR1_FIRST || i > SURR2_LAST) {
            byte[] bArr = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr[i4] = (byte) ((i >> 12) | 224);
            i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr[i4] = (byte) (((i >> 6) & 63) | 128);
            i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 >= i3) {
            _reportError("Split surrogate on writeRaw() input (last character)");
        }
        _outputSurrogates(i, cArr[i2]);
        return i2 + 1;
    }

    private final void _writeBytes(byte[] bArr) {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > 512) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail = length + this._outputTail;
    }

    private final void _writeBytes(byte[] bArr, int i, int i2) {
        if (this._outputTail + i2 > this._outputEnd) {
            _flushBuffer();
            if (i2 > 512) {
                this._outputStream.write(bArr, i, i2);
                return;
            }
        }
        System.arraycopy(bArr, i, this._outputBuffer, this._outputTail, i2);
        this._outputTail += i2;
    }

    private int _writeCustomEscape(byte[] bArr, int i, SerializableString serializableString, int i2) {
        Object asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = asUnquotedUTF8.length;
        if (length > 6) {
            return _handleLongCustomEscape(bArr, i, this._outputEnd, asUnquotedUTF8, i2);
        }
        System.arraycopy(asUnquotedUTF8, 0, bArr, i, length);
        return length + i;
    }

    private final void _writeCustomStringSegment2(char[] cArr, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        char c = this._maximumNonEscapedChar <= 0 ? '￿' : this._maximumNonEscapedChar;
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i < i2) {
            int i4 = i + 1;
            char c2 = cArr[i];
            int i5;
            SerializableString escapeSequence;
            if (c2 <= '') {
                if (iArr[c2] == 0) {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) c2;
                    i3 = i5;
                    i = i4;
                } else {
                    i5 = iArr[c2];
                    if (i5 > 0) {
                        int i6 = i3 + 1;
                        bArr[i3] = BYTE_BACKSLASH;
                        i3 = i6 + 1;
                        bArr[i6] = (byte) i5;
                        i = i4;
                    } else if (i5 == -2) {
                        escapeSequence = characterEscapes.getEscapeSequence(c2);
                        if (escapeSequence == null) {
                            throw new JsonGenerationException("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c2) + ", although was supposed to have one");
                        }
                        i3 = _writeCustomEscape(bArr, i3, escapeSequence, i2 - i4);
                        i = i4;
                    } else {
                        i3 = _writeGenericEscape(c2, i3);
                        i = i4;
                    }
                }
            } else if (c2 > c) {
                i3 = _writeGenericEscape(c2, i3);
                i = i4;
            } else {
                escapeSequence = characterEscapes.getEscapeSequence(c2);
                if (escapeSequence != null) {
                    i3 = _writeCustomEscape(bArr, i3, escapeSequence, i2 - i4);
                    i = i4;
                } else {
                    if (c2 <= '߿') {
                        i5 = i3 + 1;
                        bArr[i3] = (byte) ((c2 >> 6) | 192);
                        i3 = i5 + 1;
                        bArr[i5] = (byte) ((c2 & 63) | 128);
                    } else {
                        i3 = _outputMultiByteChar(c2, i3);
                    }
                    i = i4;
                }
            }
        }
        this._outputTail = i3;
    }

    private int _writeGenericEscape(int i, int i2) {
        byte[] bArr = this._outputBuffer;
        int i3 = i2 + 1;
        bArr[i2] = BYTE_BACKSLASH;
        int i4 = i3 + 1;
        bArr[i3] = BYTE_u;
        int i5;
        if (i > 255) {
            i5 = (i >> 8) & 255;
            int i6 = i4 + 1;
            bArr[i4] = HEX_CHARS[i5 >> 4];
            i3 = i6 + 1;
            bArr[i6] = HEX_CHARS[i5 & 15];
            i &= 255;
        } else {
            i5 = i4 + 1;
            bArr[i4] = BYTE_0;
            i3 = i5 + 1;
            bArr[i5] = BYTE_0;
        }
        i4 = i3 + 1;
        bArr[i3] = HEX_CHARS[i >> 4];
        i3 = i4 + 1;
        bArr[i4] = HEX_CHARS[i & 15];
        return i3;
    }

    private final void _writeLongString(String str) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        _writeStringSegments(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
    }

    private final void _writeLongString(char[] cArr, int i, int i2) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) 34;
        _writeStringSegments(this._charBuffer, 0, i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) 34;
    }

    private final void _writeNull() {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    private final void _writeQuotedInt(int i) {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = (byte) 34;
        this._outputTail = NumberOutput.outputInt(i, this._outputBuffer, this._outputTail);
        bArr = this._outputBuffer;
        i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = (byte) 34;
    }

    private final void _writeQuotedLong(long j) {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        this._outputTail = NumberOutput.outputLong(j, this._outputBuffer, this._outputTail);
        bArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
    }

    private final void _writeQuotedRaw(Object obj) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        writeRaw(obj.toString());
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
    }

    private final void _writeSegmentedRaw(char[] cArr, int i, int i2) {
        int i3 = this._outputEnd;
        byte[] bArr = this._outputBuffer;
        int i4 = i;
        while (i4 < i2) {
            while (true) {
                char c = cArr[i4];
                if (c >= '') {
                    break;
                }
                if (this._outputTail >= i3) {
                    _flushBuffer();
                }
                int i5 = this._outputTail;
                this._outputTail = i5 + 1;
                bArr[i5] = (byte) c;
                i4++;
                if (i4 >= i2) {
                    return;
                }
            }
            if (this._outputTail + 3 >= this._outputEnd) {
                _flushBuffer();
            }
            i = i4 + 1;
            char c2 = cArr[i4];
            if (c2 < 'ࠀ') {
                int i6 = this._outputTail;
                this._outputTail = i6 + 1;
                bArr[i6] = (byte) ((c2 >> 6) | 192);
                i6 = this._outputTail;
                this._outputTail = i6 + 1;
                bArr[i6] = (byte) ((c2 & 63) | 128);
            } else {
                _outputRawMultiByteChar(c2, cArr, i, i2);
            }
            i4 = i;
        }
    }

    private final void _writeStringSegment(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i3) {
            char c = cArr[i];
            if (c > '' || iArr[c] != 0) {
                break;
            }
            int i5 = i4 + 1;
            bArr[i4] = (byte) c;
            i++;
            i4 = i5;
        }
        this._outputTail = i4;
        if (i >= i3) {
            return;
        }
        if (this._characterEscapes != null) {
            _writeCustomStringSegment2(cArr, i, i3);
        } else if (this._maximumNonEscapedChar == 0) {
            _writeStringSegment2(cArr, i, i3);
        } else {
            _writeStringSegmentASCII2(cArr, i, i3);
        }
    }

    private final void _writeStringSegment2(char[] cArr, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            int i5;
            if (c > '') {
                if (c <= '߿') {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    i3 = i5 + 1;
                    bArr[i5] = (byte) ((c & 63) | 128);
                } else {
                    i3 = _outputMultiByteChar(c, i3);
                }
                i = i4;
            } else if (iArr[c] == 0) {
                i5 = i3 + 1;
                bArr[i3] = (byte) c;
                i3 = i5;
                i = i4;
            } else {
                i5 = iArr[c];
                if (i5 > 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = BYTE_BACKSLASH;
                    i3 = i6 + 1;
                    bArr[i6] = (byte) i5;
                    i = i4;
                } else {
                    i3 = _writeGenericEscape(c, i3);
                    i = i4;
                }
            }
        }
        this._outputTail = i3;
    }

    private final void _writeStringSegmentASCII2(char[] cArr, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        char c = this._maximumNonEscapedChar;
        while (i < i2) {
            int i4 = i + 1;
            char c2 = cArr[i];
            int i5;
            if (c2 <= '') {
                if (iArr[c2] == 0) {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) c2;
                    i3 = i5;
                    i = i4;
                } else {
                    i5 = iArr[c2];
                    if (i5 > 0) {
                        int i6 = i3 + 1;
                        bArr[i3] = BYTE_BACKSLASH;
                        i3 = i6 + 1;
                        bArr[i6] = (byte) i5;
                        i = i4;
                    } else {
                        i3 = _writeGenericEscape(c2, i3);
                        i = i4;
                    }
                }
            } else if (c2 > c) {
                i3 = _writeGenericEscape(c2, i3);
                i = i4;
            } else {
                if (c2 <= '߿') {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) ((c2 >> 6) | 192);
                    i3 = i5 + 1;
                    bArr[i5] = (byte) ((c2 & 63) | 128);
                } else {
                    i3 = _outputMultiByteChar(c2, i3);
                }
                i = i4;
            }
        }
        this._outputTail = i3;
    }

    private final void _writeStringSegments(String str) {
        int length = str.length();
        char[] cArr = this._charBuffer;
        int i = length;
        length = 0;
        while (i > 0) {
            int min = Math.min(this._outputMaxContiguous, i);
            str.getChars(length, length + min, cArr, 0);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, 0, min);
            length += min;
            i -= min;
        }
    }

    private final void _writeStringSegments(char[] cArr, int i, int i2) {
        do {
            int min = Math.min(this._outputMaxContiguous, i2);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private final void _writeUTF8Segment(byte[] bArr, int i, int i2) {
        int[] iArr = this._outputEscapes;
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b < (byte) 0 || iArr[b] == 0) {
                i4 = i5;
            } else {
                _writeUTF8Segment2(bArr, i, i2);
                return;
            }
        }
        if (this._outputTail + i2 > this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(bArr, i, this._outputBuffer, this._outputTail, i2);
        this._outputTail += i2;
    }

    private final void _writeUTF8Segment2(byte[] bArr, int i, int i2) {
        int i3 = this._outputTail;
        if ((i2 * 6) + i3 > this._outputEnd) {
            _flushBuffer();
            i3 = this._outputTail;
        }
        byte[] bArr2 = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = i2 + i;
        while (i < i4) {
            int i5 = i + 1;
            byte b = bArr[i];
            int i6;
            if (b < (byte) 0 || iArr[b] == 0) {
                i6 = i3 + 1;
                bArr2[i3] = b;
                i3 = i6;
                i = i5;
            } else {
                i6 = iArr[b];
                if (i6 > 0) {
                    int i7 = i3 + 1;
                    bArr2[i3] = BYTE_BACKSLASH;
                    i3 = i7 + 1;
                    bArr2[i7] = (byte) i6;
                } else {
                    i3 = _writeGenericEscape(b, i3);
                }
                i = i5;
            }
        }
        this._outputTail = i3;
    }

    private final void _writeUTF8Segments(byte[] bArr, int i, int i2) {
        do {
            int min = Math.min(this._outputMaxContiguous, i2);
            _writeUTF8Segment(bArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    protected final int _decodeSurrogate(int i, int i2) {
        if (i2 < SURR2_FIRST || i2 > SURR2_LAST) {
            _reportError("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2));
        }
        return (65536 + ((i - SURR1_FIRST) << 10)) + (i2 - SURR2_FIRST);
    }

    protected final void _flushBuffer() {
        int i = this._outputTail;
        if (i > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i);
        }
    }

    protected final void _outputSurrogates(int i, int i2) {
        int _decodeSurrogate = _decodeSurrogate(i, i2);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) ((_decodeSurrogate >> 18) | 240);
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) (((_decodeSurrogate >> 12) & 63) | 128);
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) (((_decodeSurrogate >> 6) & 63) | 128);
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) ((_decodeSurrogate & 63) | 128);
    }

    protected void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    protected final void _verifyPrettyValueWrite(String str, int i) {
        switch (i) {
            case 0:
                if (this._writeContext.inArray()) {
                    this._cfgPrettyPrinter.beforeArrayValues(this);
                    return;
                } else if (this._writeContext.inObject()) {
                    this._cfgPrettyPrinter.beforeObjectEntries(this);
                    return;
                } else {
                    return;
                }
            case 1:
                this._cfgPrettyPrinter.writeArrayValueSeparator(this);
                return;
            case 2:
                this._cfgPrettyPrinter.writeObjectFieldValueSeparator(this);
                return;
            case 3:
                this._cfgPrettyPrinter.writeRootValueSeparator(this);
                return;
            default:
                _cantHappen();
                return;
        }
    }

    protected final void _verifyValueWrite(String str) {
        int writeValue = this._writeContext.writeValue();
        if (writeValue == 5) {
            _reportError("Can not " + str + ", expecting field name");
        }
        if (this._cfgPrettyPrinter == null) {
            byte b;
            switch (writeValue) {
                case 1:
                    b = BYTE_COMMA;
                    break;
                case 2:
                    b = (byte) 58;
                    break;
                case 3:
                    b = (byte) 32;
                    break;
                default:
                    return;
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            this._outputBuffer[this._outputTail] = b;
            this._outputTail++;
            return;
        }
        _verifyPrettyValueWrite(str, writeValue);
    }

    protected void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        int i3 = i2 - 3;
        int i4 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i <= i3) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i5 = i + 1;
            int i6 = bArr[i] << 8;
            int i7 = i5 + 1;
            i = i7 + 1;
            this._outputTail = base64Variant.encodeBase64Chunk((((bArr[i5] & 255) | i6) << 8) | (bArr[i7] & 255), this._outputBuffer, this._outputTail);
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                i5 = this._outputTail;
                this._outputTail = i5 + 1;
                bArr2[i5] = BYTE_BACKSLASH;
                bArr2 = this._outputBuffer;
                i5 = this._outputTail;
                this._outputTail = i5 + 1;
                bArr2[i5] = (byte) 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        i3 = i2 - i;
        if (i3 > 0) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            i4 = i + 1;
            maxLineLength = bArr[i] << 16;
            if (i3 == 2) {
                i5 = i4 + 1;
                maxLineLength |= (bArr[i4] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(maxLineLength, i3, this._outputBuffer, this._outputTail);
        }
    }

    protected final void _writeFieldName(String str) {
        if (isEnabled(JsonGenerator$Feature.QUOTE_FIELD_NAMES)) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            int length = str.length();
            if (length <= this._charBufferLength) {
                str.getChars(0, length, this._charBuffer, 0);
                if (length <= this._outputMaxContiguous) {
                    if (this._outputTail + length > this._outputEnd) {
                        _flushBuffer();
                    }
                    _writeStringSegment(this._charBuffer, 0, length);
                } else {
                    _writeStringSegments(this._charBuffer, 0, length);
                }
            } else {
                _writeStringSegments(str);
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            bArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            return;
        }
        _writeStringSegments(str);
    }

    protected final void _writeFieldName(SerializableString serializableString) {
        Object asQuotedUTF8 = serializableString.asQuotedUTF8();
        if (isEnabled(JsonGenerator$Feature.QUOTE_FIELD_NAMES)) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            int length = asQuotedUTF8.length;
            byte[] bArr2;
            if ((this._outputTail + length) + 1 < this._outputEnd) {
                System.arraycopy(asQuotedUTF8, 0, this._outputBuffer, this._outputTail, length);
                this._outputTail += length;
                bArr2 = this._outputBuffer;
                length = this._outputTail;
                this._outputTail = length + 1;
                bArr2[length] = (byte) 34;
                return;
            }
            _writeBytes(asQuotedUTF8);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            bArr2 = this._outputBuffer;
            length = this._outputTail;
            this._outputTail = length + 1;
            bArr2[length] = (byte) 34;
            return;
        }
        _writeBytes(asQuotedUTF8);
    }

    protected final void _writePPFieldName(String str, boolean z) {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (isEnabled(JsonGenerator$Feature.QUOTE_FIELD_NAMES)) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            int length = str.length();
            if (length <= this._charBufferLength) {
                str.getChars(0, length, this._charBuffer, 0);
                if (length <= this._outputMaxContiguous) {
                    if (this._outputTail + length > this._outputEnd) {
                        _flushBuffer();
                    }
                    _writeStringSegment(this._charBuffer, 0, length);
                } else {
                    _writeStringSegments(this._charBuffer, 0, length);
                }
            } else {
                _writeStringSegments(str);
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            bArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            return;
        }
        _writeStringSegments(str);
    }

    protected final void _writePPFieldName(SerializableString serializableString, boolean z) {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        boolean isEnabled = isEnabled(JsonGenerator$Feature.QUOTE_FIELD_NAMES);
        if (isEnabled) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
        }
        _writeBytes(serializableString.asQuotedUTF8());
        if (isEnabled) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr2[i2] = (byte) 34;
        }
    }

    public void close() {
        super.close();
        if (this._outputBuffer != null && isEnabled(JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    }
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        if (this._outputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator$Feature.AUTO_CLOSE_TARGET)) {
                this._outputStream.close();
            } else if (isEnabled(JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM)) {
                this._outputStream.flush();
            }
        }
        _releaseBuffers();
    }

    public final void flush() {
        _flushBuffer();
        if (this._outputStream != null && isEnabled(JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM)) {
            this._outputStream.flush();
        }
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public int getHighestEscapedChar() {
        return this._maximumNonEscapedChar;
    }

    public Object getOutputTarget() {
        return this._outputStream;
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        if (characterEscapes == null) {
            this._outputEscapes = sOutputEscapes;
        } else {
            this._outputEscapes = characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }

    public JsonGenerator setHighestNonEscapedChar(int i) {
        if (i < 0) {
            i = 0;
        }
        this._maximumNonEscapedChar = i;
        return this;
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        _verifyValueWrite("write binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
        _writeBinary(base64Variant, bArr, i, i + i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr2 = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
    }

    public void writeBoolean(boolean z) {
        _verifyValueWrite("write boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        Object obj = z ? TRUE_BYTES : FALSE_BYTES;
        int length = obj.length;
        System.arraycopy(obj, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    public final void writeEndArray() {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not an ARRAY but " + this._writeContext.getTypeDesc());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = BYTE_RBRACKET;
        }
        this._writeContext = this._writeContext.getParent();
    }

    public final void writeEndObject() {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not an object but " + this._writeContext.getTypeDesc());
        }
        this._writeContext = this._writeContext.getParent();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = BYTE_RCURLY;
    }

    public final void writeFieldName(String str) {
        boolean z = true;
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (this._cfgPrettyPrinter != null) {
            if (writeFieldName != 1) {
                z = false;
            }
            _writePPFieldName(str, z);
            return;
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            writeFieldName = this._outputTail;
            this._outputTail = writeFieldName + 1;
            bArr[writeFieldName] = BYTE_COMMA;
        }
        _writeFieldName(str);
    }

    public final void writeFieldName(SerializableString serializableString) {
        boolean z = true;
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (this._cfgPrettyPrinter != null) {
            if (writeFieldName != 1) {
                z = false;
            }
            _writePPFieldName(serializableString, z);
            return;
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            writeFieldName = this._outputTail;
            this._outputTail = writeFieldName + 1;
            bArr[writeFieldName] = BYTE_COMMA;
        }
        _writeFieldName(serializableString);
    }

    public final void writeFieldName(SerializedString serializedString) {
        boolean z = true;
        int writeFieldName = this._writeContext.writeFieldName(serializedString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (this._cfgPrettyPrinter != null) {
            if (writeFieldName != 1) {
                z = false;
            }
            _writePPFieldName((SerializableString) serializedString, z);
            return;
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            writeFieldName = this._outputTail;
            this._outputTail = writeFieldName + 1;
            bArr[writeFieldName] = BYTE_COMMA;
        }
        _writeFieldName((SerializableString) serializedString);
    }

    public void writeNull() {
        _verifyValueWrite("write null value");
        _writeNull();
    }

    public void writeNumber(double d) {
        if (this._cfgNumbersAsStrings || ((Double.isNaN(d) || Double.isInfinite(d)) && isEnabled(JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            writeString(String.valueOf(d));
            return;
        }
        _verifyValueWrite("write number");
        writeRaw(String.valueOf(d));
    }

    public void writeNumber(float f) {
        if (this._cfgNumbersAsStrings || ((Float.isNaN(f) || Float.isInfinite(f)) && isEnabled(JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            writeString(String.valueOf(f));
            return;
        }
        _verifyValueWrite("write number");
        writeRaw(String.valueOf(f));
    }

    public void writeNumber(int i) {
        _verifyValueWrite("write number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i);
        } else {
            this._outputTail = NumberOutput.outputInt(i, this._outputBuffer, this._outputTail);
        }
    }

    public void writeNumber(long j) {
        _verifyValueWrite("write number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j, this._outputBuffer, this._outputTail);
    }

    public void writeNumber(String str) {
        _verifyValueWrite("write number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    public void writeNumber(BigDecimal bigDecimal) {
        _verifyValueWrite("write number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigDecimal);
        } else {
            writeRaw(bigDecimal.toString());
        }
    }

    public void writeNumber(BigInteger bigInteger) {
        _verifyValueWrite("write number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger);
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    public void writeRaw(char c) {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i;
        if (c <= '') {
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 'ࠀ') {
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) ((c >> 6) | 192);
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) ((c & 63) | 128);
        } else {
            _outputRawMultiByteChar(c, null, 0, 0);
        }
    }

    public void writeRaw(String str) {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            char[] cArr = this._charBuffer;
            int length2 = cArr.length;
            if (length < length2) {
                length2 = length;
            }
            str.getChars(i, i + length2, cArr, 0);
            writeRaw(cArr, 0, length2);
            i += length2;
            length -= length2;
        }
    }

    public void writeRaw(String str, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            char[] cArr = this._charBuffer;
            int length = cArr.length;
            if (i3 < length) {
                length = i3;
            }
            str.getChars(i, i + length, cArr, 0);
            writeRaw(cArr, 0, length);
            i += length;
            i3 -= length;
        }
    }

    public final void writeRaw(char[] cArr, int i, int i2) {
        int i3 = (i2 + i2) + i2;
        if (this._outputTail + i3 > this._outputEnd) {
            if (this._outputEnd < i3) {
                _writeSegmentedRaw(cArr, i, i2);
                return;
            }
            _flushBuffer();
        }
        int i4 = i2 + i;
        i3 = i;
        while (i3 < i4) {
            while (true) {
                char c = cArr[i3];
                if (c > '') {
                    break;
                }
                byte[] bArr = this._outputBuffer;
                int i5 = this._outputTail;
                this._outputTail = i5 + 1;
                bArr[i5] = (byte) c;
                i3++;
                if (i3 >= i4) {
                    return;
                }
            }
            i = i3 + 1;
            char c2 = cArr[i3];
            if (c2 < 'ࠀ') {
                byte[] bArr2 = this._outputBuffer;
                int i6 = this._outputTail;
                this._outputTail = i6 + 1;
                bArr2[i6] = (byte) ((c2 >> 6) | 192);
                bArr2 = this._outputBuffer;
                i6 = this._outputTail;
                this._outputTail = i6 + 1;
                bArr2[i6] = (byte) ((c2 & 63) | 128);
            } else {
                _outputRawMultiByteChar(c2, cArr, i, i4);
            }
            i3 = i;
        }
    }

    public void writeRawUTF8String(byte[] bArr, int i, int i2) {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
        _writeBytes(bArr, i, i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr2 = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
    }

    public final void writeStartArray() {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = BYTE_LBRACKET;
    }

    public final void writeStartObject() {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = BYTE_LCURLY;
    }

    public void writeString(String str) {
        _verifyValueWrite("write text value");
        if (str == null) {
            _writeNull();
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeLongString(str);
            return;
        }
        str.getChars(0, length, this._charBuffer, 0);
        if (length > this._outputMaxContiguous) {
            _writeLongString(this._charBuffer, 0, length);
            return;
        }
        if ((this._outputTail + length) + 2 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        _writeStringSegment(this._charBuffer, 0, length);
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = (byte) 34;
    }

    public final void writeString(SerializableString serializableString) {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        _writeBytes(serializableString.asQuotedUTF8());
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
    }

    public void writeString(char[] cArr, int i, int i2) {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) 34;
        if (i2 <= this._outputMaxContiguous) {
            if (this._outputTail + i2 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i, i2);
        } else {
            _writeStringSegments(cArr, i, i2);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) 34;
    }

    public final void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }

    public void writeUTF8String(byte[] bArr, int i, int i2) {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
        if (i2 <= this._outputMaxContiguous) {
            _writeUTF8Segment(bArr, i, i2);
        } else {
            _writeUTF8Segments(bArr, i, i2);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr2 = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
    }
}
