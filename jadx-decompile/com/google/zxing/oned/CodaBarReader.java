package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Hashtable;

public final class CodaBarReader extends OneDReader {
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    private static final String ALPHABET_STRING = "0123456789-$:/.+ABCDTN";
    private static final int[] CHARACTER_ENCODINGS = new int[]{3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 37, 81, 84, 21, 26, 41, 11, 14, 26, 41};
    private static final char[] STARTEND_ENCODING = new char[]{'E', '*', 'A', 'B', 'C', 'D', 'T', 'N'};
    private static final int minCharacterLength = 6;

    private static boolean arrayContains(char[] cArr, char c) {
        if (cArr == null) {
            return false;
        }
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    private static int[] findAsteriskPattern(BitArray bitArray) {
        int size = bitArray.getSize();
        int i = 0;
        while (i < size && !bitArray.get(i)) {
            i++;
        }
        int[] iArr = new int[7];
        int length = iArr.length;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int i5;
            if ((bitArray.get(i2) ^ i3) != 0) {
                iArr[i4] = iArr[i4] + 1;
                i5 = i3;
                i3 = i4;
                i4 = i;
                i = i5;
            } else {
                if (i4 == length - 1) {
                    try {
                        if (arrayContains(STARTEND_ENCODING, toNarrowWidePattern(iArr)) && bitArray.isRange(Math.max(0, i - ((i2 - i) / 2)), i, false)) {
                            return new int[]{i, i2};
                        }
                    } catch (IllegalArgumentException e) {
                    }
                    i += iArr[0] + iArr[1];
                    for (int i6 = 2; i6 < length; i6++) {
                        iArr[i6 - 2] = iArr[i6];
                    }
                    iArr[length - 2] = 0;
                    iArr[length - 1] = 0;
                    i4--;
                } else {
                    i4++;
                }
                iArr[i4] = 1;
                i5 = i3 ^ 1;
                i3 = i4;
                i4 = i;
                i = i5;
            }
            i2++;
            i5 = i;
            i = i4;
            i4 = i3;
            i3 = i5;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static char toNarrowWidePattern(int[] iArr) {
        int i;
        int length = iArr.length;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (i = 0; i < length; i++) {
            if (iArr[i] < i2) {
                i2 = iArr[i];
            }
            if (iArr[i] > i3) {
                i3 = iArr[i];
            }
        }
        do {
            i = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (iArr[i5] > i3) {
                    i |= 1 << ((length - 1) - i5);
                    i4++;
                }
            }
            if (i4 == 2 || i4 == 3) {
                for (i4 = 0; i4 < CHARACTER_ENCODINGS.length; i4++) {
                    if (CHARACTER_ENCODINGS[i4] == i) {
                        return ALPHABET[i4];
                    }
                }
            }
            i3--;
        } while (i3 > i2);
        return '!';
    }

    public Result decodeRow(int i, BitArray bitArray, Hashtable hashtable) {
        int i2;
        int i3;
        int[] findAsteriskPattern = findAsteriskPattern(bitArray);
        findAsteriskPattern[1] = 0;
        int i4 = findAsteriskPattern[1];
        int size = bitArray.getSize();
        while (i4 < size && !bitArray.get(i4)) {
            i4++;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int[] iArr = new int[]{0, 0, 0, 0, 0, 0, 0};
            OneDReader.recordPattern(bitArray, i4, iArr);
            char toNarrowWidePattern = toNarrowWidePattern(iArr);
            if (toNarrowWidePattern == '!') {
                throw NotFoundException.getNotFoundInstance();
            }
            stringBuffer.append(toNarrowWidePattern);
            i2 = i4;
            for (int i5 : iArr) {
                i2 += i5;
            }
            i3 = i2;
            while (i3 < size && !bitArray.get(i3)) {
                i3++;
            }
            if (i3 >= size) {
                break;
            }
            i4 = i3;
        }
        int i52 = 0;
        for (int i6 : iArr) {
            i52 += i6;
        }
        i2 = (i3 - i4) - i52;
        if (i3 != size && i2 / 2 < i52) {
            throw NotFoundException.getNotFoundInstance();
        } else if (stringBuffer.length() < 2) {
            throw NotFoundException.getNotFoundInstance();
        } else {
            char charAt = stringBuffer.charAt(0);
            if (arrayContains(STARTEND_ENCODING, charAt)) {
                i2 = 1;
                while (i2 < stringBuffer.length()) {
                    if (stringBuffer.charAt(i2) == charAt && i2 + 1 != stringBuffer.length()) {
                        stringBuffer.delete(i2 + 1, stringBuffer.length() - 1);
                        i2 = stringBuffer.length();
                    }
                    i2++;
                }
                if (stringBuffer.length() > 6) {
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                    stringBuffer.deleteCharAt(0);
                    float f = ((float) (findAsteriskPattern[1] + findAsteriskPattern[0])) / 2.0f;
                    float f2 = ((float) (i4 + i3)) / 2.0f;
                    return new Result(stringBuffer.toString(), null, new ResultPoint[]{new ResultPoint(f, (float) i), new ResultPoint(f2, (float) i)}, BarcodeFormat.CODABAR);
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
