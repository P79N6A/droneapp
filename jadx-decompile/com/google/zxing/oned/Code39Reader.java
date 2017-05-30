package com.google.zxing.oned;

import android.support.v7.media.MediaRouter.GlobalMediaRouter.CallbackHandler;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Hashtable;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.codehaus.jackson.smile.SmileConstants;

public final class Code39Reader extends OneDReader {
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%";
    private static final int ASTERISK_ENCODING = CHARACTER_ENCODINGS[39];
    static final int[] CHARACTER_ENCODINGS = new int[]{52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, TiffUtil.TIFF_TAG_ORIENTATION, 82, 7, CallbackHandler.MSG_ROUTE_SELECTED, 70, 22, 385, 193, 448, 145, 400, JfifUtil.MARKER_RST0, 133, 388, SmileConstants.MIN_BUFFER_FOR_POSSIBLE_SHORT_STRING, 148, Opcodes.JSR, Opcodes.IF_ICMPGE, 138, 42};
    private final boolean extendedMode;
    private final boolean usingCheckDigit;

    public Code39Reader() {
        this.usingCheckDigit = false;
        this.extendedMode = false;
    }

    public Code39Reader(boolean z) {
        this.usingCheckDigit = z;
        this.extendedMode = false;
    }

    public Code39Reader(boolean z, boolean z2) {
        this.usingCheckDigit = z;
        this.extendedMode = z2;
    }

    private static String decodeExtended(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        StringBuffer stringBuffer2 = new StringBuffer(length);
        int i = 0;
        while (i < length) {
            int i2;
            char charAt = stringBuffer.charAt(i);
            if (charAt == SignatureVisitor.EXTENDS || charAt == '$' || charAt == '%' || charAt == '/') {
                char charAt2 = stringBuffer.charAt(i + 1);
                switch (charAt) {
                    case '$':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            charAt = (char) (charAt2 - 64);
                            break;
                        }
                        throw FormatException.getFormatInstance();
                        break;
                    case '%':
                        if (charAt2 < 'A' || charAt2 > 'E') {
                            if (charAt2 >= 'F' && charAt2 <= 'W') {
                                charAt = (char) (charAt2 - 11);
                                break;
                            }
                            throw FormatException.getFormatInstance();
                        }
                        charAt = (char) (charAt2 - 38);
                        break;
                        break;
                    case '+':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            charAt = (char) (charAt2 + 32);
                            break;
                        }
                        throw FormatException.getFormatInstance();
                        break;
                    case '/':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            charAt = (char) (charAt2 - 32);
                            break;
                        } else if (charAt2 == 'Z') {
                            charAt = ':';
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    default:
                        charAt = '\u0000';
                        break;
                }
                stringBuffer2.append(charAt);
                i2 = i + 1;
            } else {
                stringBuffer2.append(charAt);
                i2 = i;
            }
            i = i2 + 1;
        }
        return stringBuffer2.toString();
    }

    private static int[] findAsteriskPattern(BitArray bitArray) {
        int size = bitArray.getSize();
        int i = 0;
        while (i < size && !bitArray.get(i)) {
            i++;
        }
        int[] iArr = new int[9];
        int length = iArr.length;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            if ((bitArray.get(i2) ^ i3) != 0) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else if (toNarrowWidePattern(iArr) == ASTERISK_ENCODING && bitArray.isRange(Math.max(0, i - ((i2 - i) / 2)), i, false)) {
                    return new int[]{i, i2};
                } else {
                    i += iArr[0] + iArr[1];
                    for (int i5 = 2; i5 < length; i5++) {
                        iArr[i5 - 2] = iArr[i5];
                    }
                    iArr[length - 2] = 0;
                    iArr[length - 1] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                i3 = i3 == 0 ? 1 : 0;
            }
            i2++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static char patternToChar(int i) {
        for (int i2 = 0; i2 < CHARACTER_ENCODINGS.length; i2++) {
            if (CHARACTER_ENCODINGS[i2] == i) {
                return ALPHABET[i2];
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int toNarrowWidePattern(int[] iArr) {
        int i;
        int i2 = 0;
        while (true) {
            int i3;
            int i4 = Integer.MAX_VALUE;
            for (int i5 : iArr) {
                if (i5 < i4 && i5 > r0) {
                    i4 = i5;
                }
            }
            i2 = 0;
            int i52 = 0;
            i = 0;
            for (i3 = 0; i3 < r7; i3++) {
                int i6 = iArr[i3];
                if (iArr[i3] > i4) {
                    i2 |= 1 << ((r7 - 1) - i3);
                    i++;
                    i52 += i6;
                }
            }
            if (i == 3) {
                break;
            } else if (i <= 3) {
                return -1;
            } else {
                i2 = i4;
            }
        }
        int i7 = i;
        for (i = 0; i < r7 && i7 > 0; i++) {
            i3 = iArr[i];
            if (iArr[i] > i4) {
                i7--;
                if ((i3 << 1) >= i52) {
                    return -1;
                }
            }
        }
        return i2;
    }

    public Result decodeRow(int i, BitArray bitArray, Hashtable hashtable) {
        int toNarrowWidePattern;
        int i2;
        int i3 = findAsteriskPattern(bitArray)[1];
        int size = bitArray.getSize();
        while (i3 < size && !bitArray.get(i3)) {
            i3++;
        }
        StringBuffer stringBuffer = new StringBuffer(20);
        int[] iArr = new int[9];
        while (true) {
            OneDReader.recordPattern(bitArray, i3, iArr);
            toNarrowWidePattern = toNarrowWidePattern(iArr);
            if (toNarrowWidePattern < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char patternToChar = patternToChar(toNarrowWidePattern);
            stringBuffer.append(patternToChar);
            i2 = i3;
            for (int i4 : iArr) {
                i2 += i4;
            }
            toNarrowWidePattern = i2;
            while (toNarrowWidePattern < size && !bitArray.get(toNarrowWidePattern)) {
                toNarrowWidePattern++;
            }
            if (patternToChar == '*') {
                break;
            }
            i3 = toNarrowWidePattern;
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        int i5 = 0;
        for (int i42 : iArr) {
            i5 += i42;
        }
        i2 = (toNarrowWidePattern - i3) - i5;
        if (toNarrowWidePattern == size || i2 / 2 >= i5) {
            if (this.usingCheckDigit) {
                size = stringBuffer.length() - 1;
                i5 = 0;
                for (i2 = 0; i2 < size; i2++) {
                    i5 += ALPHABET_STRING.indexOf(stringBuffer.charAt(i2));
                }
                if (stringBuffer.charAt(size) != ALPHABET[i5 % 43]) {
                    throw ChecksumException.getChecksumInstance();
                }
                stringBuffer.deleteCharAt(size);
            }
            if (stringBuffer.length() == 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            float f = ((float) (i3 + toNarrowWidePattern)) / 2.0f;
            return new Result(this.extendedMode ? decodeExtended(stringBuffer) : stringBuffer.toString(), null, new ResultPoint[]{new ResultPoint(((float) (r5[1] + r5[0])) / 2.0f, (float) i), new ResultPoint(f, (float) i)}, BarcodeFormat.CODE_39);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
