package com.google.zxing.oned;

import com.facebook.imageutils.TiffUtil;
import com.google.android.gms.wallet.e;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Hashtable;

public final class Code93Reader extends OneDReader {
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    private static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final int ASTERISK_ENCODING = CHARACTER_ENCODINGS[47];
    private static final int[] CHARACTER_ENCODINGS = new int[]{276, 328, 324, 322, 296, 292, 290, 336, TiffUtil.TIFF_TAG_ORIENTATION, 266, 424, 420, 418, e.j, e.i, 394, 360, 356, 354, 308, 282, 344, it.a.a.e.r, 326, 300, 278, 436, 434, 428, 422, e.l, e.n, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, it.a.a.e.s};

    private static void checkChecksums(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        checkOneChecksum(stringBuffer, length - 2, 20);
        checkOneChecksum(stringBuffer, length - 1, 15);
    }

    private static void checkOneChecksum(StringBuffer stringBuffer, int i, int i2) {
        int i3 = 1;
        int i4 = i - 1;
        int i5 = 0;
        while (i4 >= 0) {
            int indexOf = (ALPHABET_STRING.indexOf(stringBuffer.charAt(i4)) * i3) + i5;
            i5 = i3 + 1;
            if (i5 > i2) {
                i5 = 1;
            }
            i4--;
            i3 = i5;
            i5 = indexOf;
        }
        if (stringBuffer.charAt(i) != ALPHABET[i5 % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    private static String decodeExtended(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        StringBuffer stringBuffer2 = new StringBuffer(length);
        int i = 0;
        while (i < length) {
            int i2;
            char charAt = stringBuffer.charAt(i);
            if (charAt < 'a' || charAt > 'd') {
                stringBuffer2.append(charAt);
                i2 = i;
            } else {
                char charAt2 = stringBuffer.charAt(i + 1);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            charAt = (char) (charAt2 - 64);
                            break;
                        }
                        throw FormatException.getFormatInstance();
                    case 'b':
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
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            charAt = (char) (charAt2 - 32);
                            break;
                        } else if (charAt2 == 'Z') {
                            charAt = ':';
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            charAt = (char) (charAt2 + 32);
                            break;
                        }
                        throw FormatException.getFormatInstance();
                    default:
                        charAt = '\u0000';
                        break;
                }
                stringBuffer2.append(charAt);
                i2 = i + 1;
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
        int[] iArr = new int[6];
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i; i4 < size; i4++) {
            if ((bitArray.get(i4) ^ i2) != 0) {
                iArr[i3] = iArr[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (toPattern(iArr) == ASTERISK_ENCODING) {
                    return new int[]{i, i4};
                } else {
                    i += iArr[0] + iArr[1];
                    for (int i5 = 2; i5 < length; i5++) {
                        iArr[i5 - 2] = iArr[i5];
                    }
                    iArr[length - 2] = 0;
                    iArr[length - 1] = 0;
                    i3--;
                }
                iArr[i3] = 1;
                i2 = i2 == 0 ? 1 : 0;
            }
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

    private static int toPattern(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i++;
            i2 = iArr[i] + i2;
        }
        i = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = ((iArr[i3] << 8) * 9) / i2;
            int i5 = i4 >> 8;
            int i6 = (i4 & 255) > 127 ? i5 + 1 : i5;
            if (i6 < 1 || i6 > 4) {
                return -1;
            }
            if ((i3 & 1) == 0) {
                i5 = 0;
                while (i5 < i6) {
                    i5++;
                    i = (i << 1) | 1;
                }
            } else {
                i <<= i6;
            }
        }
        return i;
    }

    public Result decodeRow(int i, BitArray bitArray, Hashtable hashtable) {
        int[] findAsteriskPattern = findAsteriskPattern(bitArray);
        int i2 = findAsteriskPattern[1];
        int size = bitArray.getSize();
        while (i2 < size && !bitArray.get(i2)) {
            i2++;
        }
        StringBuffer stringBuffer = new StringBuffer(20);
        int[] iArr = new int[6];
        while (true) {
            OneDReader.recordPattern(bitArray, i2, iArr);
            int toPattern = toPattern(iArr);
            if (toPattern < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char patternToChar = patternToChar(toPattern);
            stringBuffer.append(patternToChar);
            int i3 = i2;
            for (int i4 : iArr) {
                i3 += i4;
            }
            toPattern = i3;
            while (toPattern < size && !bitArray.get(toPattern)) {
                toPattern++;
            }
            if (patternToChar == '*') {
                break;
            }
            i2 = toPattern;
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        if (toPattern == size || !bitArray.get(toPattern)) {
            throw NotFoundException.getNotFoundInstance();
        } else if (stringBuffer.length() < 2) {
            throw NotFoundException.getNotFoundInstance();
        } else {
            checkChecksums(stringBuffer);
            stringBuffer.setLength(stringBuffer.length() - 2);
            String decodeExtended = decodeExtended(stringBuffer);
            size = findAsteriskPattern[1];
            float f = ((float) (i2 + toPattern)) / 2.0f;
            return new Result(decodeExtended, null, new ResultPoint[]{new ResultPoint(((float) (findAsteriskPattern[0] + size)) / 2.0f, (float) i), new ResultPoint(f, (float) i)}, BarcodeFormat.CODE_93);
        }
    }
}
