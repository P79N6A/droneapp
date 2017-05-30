package com.google.zxing.oned;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Enumeration;
import java.util.Hashtable;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public abstract class OneDReader implements Reader {
    protected static final int INTEGER_MATH_SHIFT = 8;
    protected static final int PATTERN_MATCH_RESULT_SCALE_FACTOR = 256;

    private Result doDecode(BinaryBitmap binaryBitmap, Hashtable hashtable) {
        Object obj;
        int max;
        int i;
        BitArray bitArray;
        Hashtable hashtable2;
        int i2;
        int i3;
        int i4;
        int i5;
        Hashtable hashtable3;
        Enumeration keys;
        Object nextElement;
        Result decodeRow;
        int width = binaryBitmap.getWidth();
        int height = binaryBitmap.getHeight();
        BitArray bitArray2 = new BitArray(width);
        int i6 = height >> 1;
        if (hashtable != null) {
            if (hashtable.containsKey(DecodeHintType.TRY_HARDER)) {
                obj = 1;
                max = Math.max(1, height >> (obj == null ? 8 : 5));
                i = obj == null ? height : 15;
                bitArray = bitArray2;
                hashtable2 = hashtable;
                for (i2 = 0; i2 < i; i2++) {
                    i3 = (i2 + 1) >> 1;
                    if (((i2 & 1) != 0 ? 1 : null) == null) {
                        i3 = -i3;
                    }
                    i4 = i6 + (i3 * max);
                    if (i4 < 0 || i4 >= height) {
                        break;
                    }
                    try {
                        bitArray = binaryBitmap.getBlackRow(i4, bitArray);
                        i5 = 0;
                        while (i5 < 2) {
                            if (i5 == 1) {
                                bitArray.reverse();
                                if (hashtable2 != null && hashtable2.containsKey(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) {
                                    hashtable3 = new Hashtable();
                                    keys = hashtable2.keys();
                                    while (keys.hasMoreElements()) {
                                        nextElement = keys.nextElement();
                                        if (!nextElement.equals(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) {
                                            hashtable3.put(nextElement, hashtable2.get(nextElement));
                                        }
                                    }
                                    hashtable2 = hashtable3;
                                }
                            }
                            try {
                                decodeRow = decodeRow(i4, bitArray, hashtable2);
                                if (i5 == 1) {
                                    decodeRow.putMetadata(ResultMetadataType.ORIENTATION, new Integer(Opcodes.GETFIELD));
                                    ResultPoint[] resultPoints = decodeRow.getResultPoints();
                                    resultPoints[0] = new ResultPoint((((float) width) - resultPoints[0].getX()) - 1.0f, resultPoints[0].getY());
                                    resultPoints[1] = new ResultPoint((((float) width) - resultPoints[1].getX()) - 1.0f, resultPoints[1].getY());
                                }
                                return decodeRow;
                            } catch (ReaderException e) {
                                i5++;
                            }
                        }
                        continue;
                    } catch (NotFoundException e2) {
                    }
                }
                throw NotFoundException.getNotFoundInstance();
            }
        }
        obj = null;
        if (obj == null) {
        }
        max = Math.max(1, height >> (obj == null ? 8 : 5));
        if (obj == null) {
        }
        bitArray = bitArray2;
        hashtable2 = hashtable;
        for (i2 = 0; i2 < i; i2++) {
            i3 = (i2 + 1) >> 1;
            if ((i2 & 1) != 0) {
            }
            if (((i2 & 1) != 0 ? 1 : null) == null) {
                i3 = -i3;
            }
            i4 = i6 + (i3 * max);
            bitArray = binaryBitmap.getBlackRow(i4, bitArray);
            i5 = 0;
            while (i5 < 2) {
                if (i5 == 1) {
                    bitArray.reverse();
                    hashtable3 = new Hashtable();
                    keys = hashtable2.keys();
                    while (keys.hasMoreElements()) {
                        nextElement = keys.nextElement();
                        if (!nextElement.equals(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) {
                            hashtable3.put(nextElement, hashtable2.get(nextElement));
                        }
                    }
                    hashtable2 = hashtable3;
                }
                decodeRow = decodeRow(i4, bitArray, hashtable2);
                if (i5 == 1) {
                    decodeRow.putMetadata(ResultMetadataType.ORIENTATION, new Integer(Opcodes.GETFIELD));
                    ResultPoint[] resultPoints2 = decodeRow.getResultPoints();
                    resultPoints2[0] = new ResultPoint((((float) width) - resultPoints2[0].getX()) - 1.0f, resultPoints2[0].getY());
                    resultPoints2[1] = new ResultPoint((((float) width) - resultPoints2[1].getX()) - 1.0f, resultPoints2[1].getY());
                }
                return decodeRow;
            }
            continue;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    protected static int patternMatchVariance(int[] iArr, int[] iArr2, int i) {
        int i2;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        for (i2 = 0; i2 < length; i2++) {
            i4 += iArr[i2];
            i3 += iArr2[i2];
        }
        if (i4 < i3) {
            return Integer.MAX_VALUE;
        }
        int i5 = (i4 << 8) / i3;
        int i6 = (i * i5) >> 8;
        i3 = 0;
        for (i2 = 0; i2 < length; i2++) {
            int i7 = iArr[i2] << 8;
            int i8 = iArr2[i2] * i5;
            i7 = i7 > i8 ? i7 - i8 : i8 - i7;
            if (i7 > i6) {
                return Integer.MAX_VALUE;
            }
            i3 += i7;
        }
        return i3 / i4;
    }

    protected static void recordPattern(BitArray bitArray, int i, int[] iArr) {
        int i2;
        int length = iArr.length;
        for (i2 = 0; i2 < length; i2++) {
            iArr[i2] = 0;
        }
        int size = bitArray.getSize();
        if (i >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i3;
        int i4 = !bitArray.get(i) ? 1 : 0;
        i2 = 0;
        while (i < size) {
            if ((bitArray.get(i) ^ i4) != 0) {
                iArr[i2] = iArr[i2] + 1;
                i3 = i4;
            } else {
                i3 = i2 + 1;
                if (i3 == length) {
                    break;
                }
                iArr[i3] = 1;
                int i5 = i3;
                i3 = i4 == 0 ? 1 : 0;
                i2 = i5;
            }
            i++;
            i4 = i3;
        }
        i3 = i2;
        if (i3 == length) {
            return;
        }
        if (i3 != length - 1 || i != size) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    protected static void recordPatternInReverse(BitArray bitArray, int i, int[] iArr) {
        int length = iArr.length;
        boolean z = bitArray.get(i);
        while (i > 0 && length >= 0) {
            i--;
            if (bitArray.get(i) != z) {
                length--;
                z = !z;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        recordPattern(bitArray, i + 1, iArr);
    }

    public Result decode(BinaryBitmap binaryBitmap) {
        return decode(binaryBitmap, null);
    }

    public Result decode(BinaryBitmap binaryBitmap, Hashtable hashtable) {
        try {
            return doDecode(binaryBitmap, hashtable);
        } catch (NotFoundException e) {
            Object obj = (hashtable == null || !hashtable.containsKey(DecodeHintType.TRY_HARDER)) ? null : 1;
            if (obj == null || !binaryBitmap.isRotateSupported()) {
                throw e;
            }
            BinaryBitmap rotateCounterClockwise = binaryBitmap.rotateCounterClockwise();
            Result doDecode = doDecode(rotateCounterClockwise, hashtable);
            Hashtable resultMetadata = doDecode.getResultMetadata();
            int intValue = (resultMetadata == null || !resultMetadata.containsKey(ResultMetadataType.ORIENTATION)) ? 270 : (((Integer) resultMetadata.get(ResultMetadataType.ORIENTATION)).intValue() + 270) % 360;
            doDecode.putMetadata(ResultMetadataType.ORIENTATION, new Integer(intValue));
            ResultPoint[] resultPoints = doDecode.getResultPoints();
            int height = rotateCounterClockwise.getHeight();
            for (intValue = 0; intValue < resultPoints.length; intValue++) {
                resultPoints[intValue] = new ResultPoint((((float) height) - resultPoints[intValue].getY()) - 1.0f, resultPoints[intValue].getX());
            }
            return doDecode;
        }
    }

    public abstract Result decodeRow(int i, BitArray bitArray, Hashtable hashtable);

    public void reset() {
    }
}
