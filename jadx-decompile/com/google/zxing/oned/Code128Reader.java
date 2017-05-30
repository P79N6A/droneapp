package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Hashtable;

public final class Code128Reader extends OneDReader {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int[][] CODE_PATTERNS = new int[][]{new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final int MAX_AVG_VARIANCE = 64;
    private static final int MAX_INDIVIDUAL_VARIANCE = 179;

    private static int decodeCode(BitArray bitArray, int[] iArr, int i) {
        OneDReader.recordPattern(bitArray, i, iArr);
        int i2 = 64;
        int i3 = -1;
        for (int i4 = 0; i4 < CODE_PATTERNS.length; i4++) {
            int patternMatchVariance = OneDReader.patternMatchVariance(iArr, CODE_PATTERNS[i4], 179);
            if (patternMatchVariance < i2) {
                i3 = i4;
                i2 = patternMatchVariance;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int[] findStartPattern(BitArray bitArray) {
        int size = bitArray.getSize();
        int i = 0;
        while (i < size && !bitArray.get(i)) {
            i++;
        }
        int[] iArr = new int[6];
        int length = iArr.length;
        int i2 = i;
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i2 < size) {
            int i6;
            int i7;
            if ((bitArray.get(i2) ^ i3) != 0) {
                iArr[i5] = iArr[i5] + 1;
                i6 = i3;
                i7 = i5;
            } else {
                if (i5 == length - 1) {
                    int i8 = 64;
                    i = -1;
                    i7 = 103;
                    while (i7 <= 105) {
                        i6 = OneDReader.patternMatchVariance(iArr, CODE_PATTERNS[i7], 179);
                        if (i6 < i8) {
                            i = i7;
                        } else {
                            i6 = i8;
                        }
                        i7++;
                        i8 = i6;
                    }
                    if (i < 0 || !bitArray.isRange(Math.max(0, i4 - ((i2 - i4) / 2)), i4, false)) {
                        i = (iArr[0] + iArr[1]) + i4;
                        for (i7 = 2; i7 < length; i7++) {
                            iArr[i7 - 2] = iArr[i7];
                        }
                        iArr[length - 2] = 0;
                        iArr[length - 1] = 0;
                        i7 = i5 - 1;
                    } else {
                        return new int[]{i4, i2, i};
                    }
                }
                i7 = i5 + 1;
                i = i4;
                iArr[i7] = 1;
                if (i3 == 0) {
                    i6 = 1;
                } else {
                    boolean z = false;
                }
                i4 = i;
            }
            i2++;
            i3 = i6;
            i5 = i7;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decodeRow(int i, BitArray bitArray, Hashtable hashtable) {
        int i2;
        int[] findStartPattern = findStartPattern(bitArray);
        int i3 = findStartPattern[2];
        switch (i3) {
            case 103:
                i2 = 101;
                break;
            case 104:
                i2 = 100;
                break;
            case 105:
                i2 = 99;
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        StringBuffer stringBuffer = new StringBuffer(20);
        int i4 = findStartPattern[0];
        int i5 = findStartPattern[1];
        int[] iArr = new int[6];
        Object obj = 1;
        Object obj2 = null;
        Object obj3 = null;
        int i6 = i2;
        i2 = 0;
        int i7 = i3;
        i3 = 0;
        int i8 = 0;
        int i9 = i4;
        while (obj3 == null) {
            Object obj4 = null;
            int decodeCode = decodeCode(bitArray, iArr, i5);
            if (decodeCode != 106) {
                obj = 1;
            }
            if (decodeCode != 106) {
                i2++;
                i7 += i2 * decodeCode;
            }
            i9 = i5;
            for (int i10 : iArr) {
                i9 += i10;
            }
            switch (decodeCode) {
                case 103:
                case 104:
                case 105:
                    throw FormatException.getFormatInstance();
                default:
                    Object obj5;
                    Object obj6;
                    Object obj7;
                    switch (i6) {
                        case 99:
                            if (decodeCode >= 100) {
                                obj6 = decodeCode != 106 ? null : obj;
                                switch (decodeCode) {
                                    case 100:
                                        obj7 = obj6;
                                        i3 = 100;
                                        obj5 = obj3;
                                        obj3 = null;
                                        obj4 = obj7;
                                        break;
                                    case 101:
                                        obj7 = obj6;
                                        i3 = 101;
                                        obj5 = obj3;
                                        obj3 = null;
                                        obj4 = obj7;
                                        break;
                                    case 102:
                                        obj7 = obj6;
                                        i3 = i6;
                                        obj5 = obj3;
                                        obj3 = null;
                                        obj4 = obj7;
                                        break;
                                    case 106:
                                        obj7 = obj6;
                                        i3 = i6;
                                        i6 = 1;
                                        obj3 = null;
                                        obj4 = obj7;
                                        break;
                                    default:
                                        obj7 = obj6;
                                        i3 = i6;
                                        obj5 = obj3;
                                        obj3 = null;
                                        obj4 = obj7;
                                        break;
                                }
                            }
                            if (decodeCode < 10) {
                                stringBuffer.append('0');
                            }
                            stringBuffer.append(decodeCode);
                            i3 = i6;
                            obj5 = obj3;
                            obj3 = null;
                            obj4 = obj;
                            break;
                        case 100:
                            if (decodeCode >= 96) {
                                obj6 = decodeCode != 106 ? null : obj;
                                switch (decodeCode) {
                                    case 98:
                                        obj4 = 1;
                                        i6 = 99;
                                        break;
                                    case 99:
                                        i6 = 99;
                                        break;
                                    case 101:
                                        i6 = 101;
                                        break;
                                    case 106:
                                        obj3 = 1;
                                        break;
                                }
                                obj7 = obj6;
                                i3 = i6;
                                obj5 = obj3;
                                obj3 = obj4;
                                obj4 = obj7;
                                break;
                            }
                            stringBuffer.append((char) (decodeCode + 32));
                            i3 = i6;
                            obj5 = obj3;
                            obj3 = null;
                            obj4 = obj;
                            break;
                        case 101:
                            if (decodeCode >= 64) {
                                if (decodeCode >= 96) {
                                    int i11;
                                    if (decodeCode != 106) {
                                        obj = null;
                                    }
                                    switch (decodeCode) {
                                        case 96:
                                        case 97:
                                        case 101:
                                        case 102:
                                            obj6 = null;
                                            obj4 = obj3;
                                            i11 = i6;
                                            break;
                                        case 98:
                                            obj6 = 1;
                                            obj7 = obj3;
                                            i11 = 100;
                                            obj4 = obj7;
                                            break;
                                        case 99:
                                            obj4 = obj3;
                                            i11 = 99;
                                            obj6 = null;
                                            break;
                                        case 100:
                                            obj4 = obj3;
                                            i11 = 100;
                                            obj6 = null;
                                            break;
                                        case 106:
                                            i11 = i6;
                                            obj6 = null;
                                            i4 = 1;
                                            break;
                                        default:
                                            obj6 = null;
                                            obj4 = obj3;
                                            i11 = i6;
                                            break;
                                    }
                                    obj5 = obj4;
                                    obj4 = obj;
                                    obj7 = obj6;
                                    i3 = i11;
                                    obj3 = obj7;
                                    break;
                                }
                                stringBuffer.append((char) (decodeCode - 64));
                                i3 = i6;
                                obj5 = obj3;
                                obj3 = null;
                                obj4 = obj;
                                break;
                            }
                            stringBuffer.append((char) (decodeCode + 32));
                            i3 = i6;
                            obj5 = obj3;
                            obj3 = null;
                            obj4 = obj;
                            break;
                        default:
                            i3 = i6;
                            obj5 = obj3;
                            obj3 = null;
                            obj4 = obj;
                            break;
                    }
                    if (obj2 != null) {
                        switch (i3) {
                            case 99:
                                i3 = 100;
                                break;
                            case 100:
                                i3 = 101;
                                break;
                            case 101:
                                i3 = 99;
                                break;
                            default:
                                break;
                        }
                    }
                    obj = obj4;
                    obj2 = obj3;
                    obj3 = obj5;
                    i6 = i3;
                    i3 = i8;
                    i8 = decodeCode;
                    int i12 = i5;
                    i5 = i9;
                    i9 = i12;
            }
        }
        i4 = bitArray.getSize();
        while (i5 < i4 && bitArray.get(i5)) {
            i5++;
        }
        if (!bitArray.isRange(i5, Math.min(i4, ((i5 - i9) / 2) + i5), false)) {
            throw NotFoundException.getNotFoundInstance();
        } else if ((i7 - (i2 * i3)) % 103 != i3) {
            throw ChecksumException.getChecksumInstance();
        } else {
            i2 = stringBuffer.length();
            if (i2 > 0 && r9 != null) {
                if (i6 == 99) {
                    stringBuffer.delete(i2 - 2, i2);
                } else {
                    stringBuffer.delete(i2 - 1, i2);
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            if (stringBuffer2.length() == 0) {
                throw FormatException.getFormatInstance();
            }
            float f = ((float) (i5 + i9)) / 2.0f;
            return new Result(stringBuffer2, null, new ResultPoint[]{new ResultPoint(((float) (findStartPattern[1] + findStartPattern[0])) / 2.0f, (float) i), new ResultPoint(f, (float) i)}, BarcodeFormat.CODE_128);
        }
    }
}
