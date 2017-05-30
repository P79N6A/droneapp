package org.codehaus.jackson.io;

import java.lang.ref.SoftReference;
import org.codehaus.jackson.util.ByteArrayBuilder;
import org.codehaus.jackson.util.CharTypes;
import org.codehaus.jackson.util.TextBuffer;

public final class JsonStringEncoder {
    private static final byte[] HEX_BYTES = CharTypes.copyHexBytes();
    private static final char[] HEX_CHARS = CharTypes.copyHexChars();
    private static final int INT_0 = 48;
    private static final int INT_BACKSLASH = 92;
    private static final int INT_U = 117;
    private static final int SURR1_FIRST = 55296;
    private static final int SURR1_LAST = 56319;
    private static final int SURR2_FIRST = 56320;
    private static final int SURR2_LAST = 57343;
    protected static final ThreadLocal<SoftReference<JsonStringEncoder>> _threadEncoder = new ThreadLocal();
    protected ByteArrayBuilder _byteBuilder;
    protected final char[] _quoteBuffer = new char[6];
    protected TextBuffer _textBuffer;

    public JsonStringEncoder() {
        this._quoteBuffer[0] = l.f;
        this._quoteBuffer[2] = '0';
        this._quoteBuffer[3] = '0';
    }

    private int _appendByteEscape(int i, int i2, ByteArrayBuilder byteArrayBuilder, int i3) {
        byteArrayBuilder.setCurrentSegmentLength(i3);
        byteArrayBuilder.append(92);
        if (i2 < 0) {
            byteArrayBuilder.append(117);
            if (i > 255) {
                int i4 = i >> 8;
                byteArrayBuilder.append(HEX_BYTES[i4 >> 4]);
                byteArrayBuilder.append(HEX_BYTES[i4 & 15]);
                i &= 255;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            byteArrayBuilder.append(HEX_BYTES[i >> 4]);
            byteArrayBuilder.append(HEX_BYTES[i & 15]);
        } else {
            byteArrayBuilder.append((byte) i2);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private int _appendSingleEscape(int i, char[] cArr) {
        if (i < 0) {
            int i2 = -(i + 1);
            cArr[1] = 'u';
            cArr[4] = HEX_CHARS[i2 >> 4];
            cArr[5] = HEX_CHARS[i2 & 15];
            return 6;
        }
        cArr[1] = (char) i;
        return 2;
    }

    private int _convertSurrogate(int i, int i2) {
        if (i2 >= SURR2_FIRST && i2 <= SURR2_LAST) {
            return (65536 + ((i - SURR1_FIRST) << 10)) + (i2 - SURR2_FIRST);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    private void _throwIllegalSurrogate(int i) {
        if (i > 1114111) {
            throw new IllegalArgumentException("Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627");
        } else if (i < SURR1_FIRST) {
            throw new IllegalArgumentException("Illegal character point (0x" + Integer.toHexString(i) + ") to output");
        } else if (i <= SURR1_LAST) {
            throw new IllegalArgumentException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        } else {
            throw new IllegalArgumentException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        }
    }

    public static JsonStringEncoder getInstance() {
        SoftReference softReference = (SoftReference) _threadEncoder.get();
        JsonStringEncoder jsonStringEncoder = softReference == null ? null : (JsonStringEncoder) softReference.get();
        if (jsonStringEncoder != null) {
            return jsonStringEncoder;
        }
        jsonStringEncoder = new JsonStringEncoder();
        _threadEncoder.set(new SoftReference(jsonStringEncoder));
        return jsonStringEncoder;
    }

    public byte[] encodeAsUTF8(String str) {
        int i;
        ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
        if (byteArrayBuilder == null) {
            byteArrayBuilder = new ByteArrayBuilder(null);
            this._byteBuilder = byteArrayBuilder;
        }
        int length = str.length();
        byte[] resetAndGetFirstSegment = byteArrayBuilder.resetAndGetFirstSegment();
        int length2 = resetAndGetFirstSegment.length;
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (i3 < length) {
            int i4;
            int i5 = i3 + 1;
            i3 = str.charAt(i3);
            int i6 = length2;
            byte[] bArr = resetAndGetFirstSegment;
            int i7 = i2;
            i2 = i6;
            while (i3 <= 127) {
                if (i7 >= i2) {
                    bArr = byteArrayBuilder.finishCurrentSegment();
                    i2 = bArr.length;
                    i7 = 0;
                }
                i4 = i7 + 1;
                bArr[i7] = (byte) i3;
                if (i5 >= length) {
                    i = i4;
                    break loop0;
                }
                i7 = i5 + 1;
                i3 = str.charAt(i5);
                i5 = i7;
                i7 = i4;
            }
            if (i7 >= i2) {
                bArr = byteArrayBuilder.finishCurrentSegment();
                i2 = bArr.length;
                i4 = 0;
            } else {
                i4 = i7;
            }
            if (i3 < 2048) {
                i7 = i4 + 1;
                bArr[i4] = (byte) ((i3 >> 6) | 192);
                i4 = i3;
                i3 = i5;
            } else if (i3 < SURR1_FIRST || i3 > SURR2_LAST) {
                i7 = i4 + 1;
                bArr[i4] = (byte) ((i3 >> 12) | 224);
                if (i7 >= i2) {
                    bArr = byteArrayBuilder.finishCurrentSegment();
                    i2 = bArr.length;
                    i7 = 0;
                }
                i4 = i7 + 1;
                bArr[i7] = (byte) (((i3 >> 6) & 63) | 128);
                i7 = i4;
                i4 = i3;
                i3 = i5;
            } else {
                if (i3 > SURR1_LAST) {
                    _throwIllegalSurrogate(i3);
                }
                if (i5 >= length) {
                    _throwIllegalSurrogate(i3);
                }
                int i8 = i5 + 1;
                i3 = _convertSurrogate(i3, str.charAt(i5));
                if (i3 > 1114111) {
                    _throwIllegalSurrogate(i3);
                }
                i7 = i4 + 1;
                bArr[i4] = (byte) ((i3 >> 18) | 240);
                if (i7 >= i2) {
                    bArr = byteArrayBuilder.finishCurrentSegment();
                    i2 = bArr.length;
                    i7 = 0;
                }
                i4 = i7 + 1;
                bArr[i7] = (byte) (((i3 >> 12) & 63) | 128);
                if (i4 >= i2) {
                    bArr = byteArrayBuilder.finishCurrentSegment();
                    i2 = bArr.length;
                    i7 = 0;
                } else {
                    i7 = i4;
                }
                i4 = i7 + 1;
                bArr[i7] = (byte) (((i3 >> 6) & 63) | 128);
                i7 = i4;
                i4 = i3;
                i3 = i8;
            }
            if (i7 >= i2) {
                bArr = byteArrayBuilder.finishCurrentSegment();
                i2 = bArr.length;
                i7 = 0;
            }
            i5 = i7 + 1;
            bArr[i7] = (byte) ((i4 & 63) | 128);
            resetAndGetFirstSegment = bArr;
            length2 = i2;
            i2 = i5;
        }
        i = i2;
        return this._byteBuilder.completeAndCoalesce(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] quoteAsString(java.lang.String r12) {
        /*
        r11 = this;
        r5 = 0;
        r0 = r11._textBuffer;
        if (r0 != 0) goto L_0x000d;
    L_0x0005:
        r0 = new org.codehaus.jackson.util.TextBuffer;
        r1 = 0;
        r0.<init>(r1);
        r11._textBuffer = r0;
    L_0x000d:
        r3 = r0.emptyAndGetCurrentSegment();
        r6 = org.codehaus.jackson.util.CharTypes.get7BitOutputEscapes();
        r7 = r6.length;
        r8 = r12.length();
        r1 = r5;
        r2 = r5;
    L_0x001c:
        if (r2 >= r8) goto L_0x0061;
    L_0x001e:
        r9 = r12.charAt(r2);
        if (r9 >= r7) goto L_0x0051;
    L_0x0024:
        r4 = r6[r9];
        if (r4 == 0) goto L_0x0051;
    L_0x0028:
        r4 = r2 + 1;
        r2 = r12.charAt(r2);
        r2 = r6[r2];
        r9 = r11._quoteBuffer;
        r2 = r11._appendSingleEscape(r2, r9);
        r9 = r1 + r2;
        r10 = r3.length;
        if (r9 <= r10) goto L_0x0069;
    L_0x003b:
        r9 = r3.length;
        r9 = r9 - r1;
        if (r9 <= 0) goto L_0x0044;
    L_0x003f:
        r10 = r11._quoteBuffer;
        java.lang.System.arraycopy(r10, r5, r3, r1, r9);
    L_0x0044:
        r3 = r0.finishCurrentSegment();
        r2 = r2 - r9;
        r10 = r11._quoteBuffer;
        java.lang.System.arraycopy(r10, r9, r3, r1, r2);
        r1 = r1 + r2;
    L_0x004f:
        r2 = r4;
        goto L_0x001c;
    L_0x0051:
        r4 = r3.length;
        if (r1 < r4) goto L_0x0070;
    L_0x0054:
        r3 = r0.finishCurrentSegment();
        r4 = r5;
    L_0x0059:
        r1 = r4 + 1;
        r3[r4] = r9;
        r2 = r2 + 1;
        if (r2 < r8) goto L_0x001e;
    L_0x0061:
        r0.setCurrentLength(r1);
        r0 = r0.contentsAsArray();
        return r0;
    L_0x0069:
        r9 = r11._quoteBuffer;
        java.lang.System.arraycopy(r9, r5, r3, r1, r2);
        r1 = r1 + r2;
        goto L_0x004f;
    L_0x0070:
        r4 = r1;
        goto L_0x0059;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.jackson.io.JsonStringEncoder.quoteAsString(java.lang.String):char[]");
    }

    public byte[] quoteAsUTF8(String str) {
        ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
        if (byteArrayBuilder == null) {
            byteArrayBuilder = new ByteArrayBuilder(null);
            this._byteBuilder = byteArrayBuilder;
        }
        int length = str.length();
        byte[] resetAndGetFirstSegment = byteArrayBuilder.resetAndGetFirstSegment();
        int i = 0;
        int i2 = 0;
        loop0:
        while (i2 < length) {
            char charAt;
            int i3;
            int[] iArr = CharTypes.get7BitOutputEscapes();
            while (true) {
                charAt = str.charAt(i2);
                if (charAt <= '' && iArr[charAt] == 0) {
                    if (i >= resetAndGetFirstSegment.length) {
                        resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                        i3 = 0;
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    resetAndGetFirstSegment[i3] = (byte) charAt;
                    i2++;
                    if (i2 >= length) {
                        break loop0;
                    }
                }
            }
            if (i >= resetAndGetFirstSegment.length) {
                resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                i = 0;
            }
            i3 = i2 + 1;
            charAt = str.charAt(i2);
            if (charAt <= '') {
                i = _appendByteEscape(charAt, iArr[charAt], byteArrayBuilder, i);
                resetAndGetFirstSegment = byteArrayBuilder.getCurrentSegment();
                i2 = i3;
            } else {
                byte[] bArr;
                int i4;
                int i5;
                if (charAt <= '߿') {
                    i2 = i + 1;
                    resetAndGetFirstSegment[i] = (byte) ((charAt >> 6) | 192);
                    bArr = resetAndGetFirstSegment;
                    i4 = (charAt & 63) | 128;
                } else if (charAt < '?' || charAt > '?') {
                    i2 = i + 1;
                    resetAndGetFirstSegment[i] = (byte) ((charAt >> 12) | 224);
                    if (i2 >= resetAndGetFirstSegment.length) {
                        resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                        i = 0;
                    } else {
                        i = i2;
                    }
                    i2 = i + 1;
                    resetAndGetFirstSegment[i] = (byte) (((charAt >> 6) & 63) | 128);
                    bArr = resetAndGetFirstSegment;
                    i4 = (charAt & 63) | 128;
                } else {
                    if (charAt > '?') {
                        _throwIllegalSurrogate(charAt);
                    }
                    if (i3 >= length) {
                        _throwIllegalSurrogate(charAt);
                    }
                    i5 = i3 + 1;
                    i3 = _convertSurrogate(charAt, str.charAt(i3));
                    if (i3 > 1114111) {
                        _throwIllegalSurrogate(i3);
                    }
                    i2 = i + 1;
                    resetAndGetFirstSegment[i] = (byte) ((i3 >> 18) | 240);
                    if (i2 >= resetAndGetFirstSegment.length) {
                        resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                        i = 0;
                    } else {
                        i = i2;
                    }
                    i2 = i + 1;
                    resetAndGetFirstSegment[i] = (byte) (((i3 >> 12) & 63) | 128);
                    if (i2 >= resetAndGetFirstSegment.length) {
                        resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                        i = 0;
                    } else {
                        i = i2;
                    }
                    i2 = i + 1;
                    resetAndGetFirstSegment[i] = (byte) (((i3 >> 6) & 63) | 128);
                    i3 = i5;
                    byte[] bArr2 = resetAndGetFirstSegment;
                    i4 = (i3 & 63) | 128;
                    bArr = bArr2;
                }
                if (i2 >= bArr.length) {
                    bArr = byteArrayBuilder.finishCurrentSegment();
                    i2 = 0;
                }
                i5 = i2 + 1;
                bArr[i2] = (byte) i4;
                resetAndGetFirstSegment = bArr;
                i2 = i3;
                i = i5;
            }
        }
        return this._byteBuilder.completeAndCoalesce(i);
    }
}
