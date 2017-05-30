package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

public final class WhiteRectangleDetector {
    private static final int CORR = 1;
    private static final int INIT_SIZE = 40;
    private final int height;
    private final BitMatrix image;
    private final int width;

    public WhiteRectangleDetector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
        this.height = bitMatrix.getHeight();
        this.width = bitMatrix.getWidth();
    }

    private ResultPoint[] centerEdges(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        float x = resultPoint.getX();
        float y = resultPoint.getY();
        float x2 = resultPoint2.getX();
        float y2 = resultPoint2.getY();
        float x3 = resultPoint3.getX();
        float y3 = resultPoint3.getY();
        float x4 = resultPoint4.getX();
        float y4 = resultPoint4.getY();
        if (x < ((float) (this.width / 2))) {
            return new ResultPoint[]{new ResultPoint(x4 - 1.0f, y4 + 1.0f), new ResultPoint(x2 + 1.0f, y2 + 1.0f), new ResultPoint(x3 - 1.0f, y3 - 1.0f), new ResultPoint(x + 1.0f, y - 1.0f)};
        }
        return new ResultPoint[]{new ResultPoint(x4 + 1.0f, y4 + 1.0f), new ResultPoint(x2 + 1.0f, y2 - 1.0f), new ResultPoint(x3 - 1.0f, y3 + 1.0f), new ResultPoint(x - 1.0f, y - 1.0f)};
    }

    private boolean containsBlackPoint(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.image.get(i, i3)) {
                    return true;
                }
                i++;
            }
        } else {
            while (i <= i2) {
                if (this.image.get(i3, i)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private static int distanceL2(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return round((float) Math.sqrt((double) ((f5 * f5) + (f6 * f6))));
    }

    private ResultPoint getBlackPointOnSegment(float f, float f2, float f3, float f4) {
        int distanceL2 = distanceL2(f, f2, f3, f4);
        float f5 = (f3 - f) / ((float) distanceL2);
        float f6 = (f4 - f2) / ((float) distanceL2);
        for (int i = 0; i < distanceL2; i++) {
            int round = round((((float) i) * f5) + f);
            int round2 = round((((float) i) * f6) + f2);
            if (this.image.get(round, round2)) {
                return new ResultPoint((float) round, (float) round2);
            }
        }
        return null;
    }

    private static int round(float f) {
        return (int) (0.5f + f);
    }

    public ResultPoint[] detect() {
        int i;
        boolean z = false;
        int i2 = 1;
        int i3 = (this.width - 40) >> 1;
        int i4 = (this.width + 40) >> 1;
        int i5 = (this.height - 40) >> 1;
        int i6 = (this.height + 40) >> 1;
        boolean z2 = false;
        int i7 = 1;
        while (i7 != 0) {
            boolean z3 = true;
            boolean z4 = false;
            while (z3 && i4 < this.width) {
                z3 = containsBlackPoint(i5, i6, i4, false);
                if (z3) {
                    i4++;
                    z4 = true;
                }
            }
            if (i4 >= this.width) {
                z = true;
                i = i4;
                i4 = i6;
                i6 = i3;
                i3 = i5;
                break;
            }
            z3 = true;
            while (z3 && i6 < this.height) {
                z3 = containsBlackPoint(i3, i4, i6, true);
                if (z3) {
                    i6++;
                    z4 = true;
                }
            }
            if (i6 >= this.height) {
                z = true;
                i = i4;
                i4 = i6;
                i6 = i3;
                i3 = i5;
                break;
            }
            z3 = true;
            while (z3 && i3 >= 0) {
                z3 = containsBlackPoint(i5, i6, i3, false);
                if (z3) {
                    i3--;
                    z4 = true;
                }
            }
            if (i3 < 0) {
                z = true;
                i = i4;
                i4 = i6;
                i6 = i3;
                i3 = i5;
                break;
            }
            i7 = z4;
            z4 = true;
            while (z4 && i5 >= 0) {
                z4 = containsBlackPoint(i3, i4, i5, true);
                if (z4) {
                    i5--;
                    i7 = 1;
                }
            }
            if (i5 < 0) {
                z = true;
                i = i4;
                i4 = i6;
                i6 = i3;
                i3 = i5;
                break;
            } else if (i7 != 0) {
                z2 = true;
            }
        }
        i = i4;
        i4 = i6;
        i6 = i3;
        i3 = i5;
        if (z || !r0) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i8;
        ResultPoint resultPoint;
        i7 = i - i6;
        ResultPoint resultPoint2 = null;
        for (i8 = 1; i8 < i7; i8++) {
            resultPoint2 = getBlackPointOnSegment((float) i6, (float) (i4 - i8), (float) (i6 + i8), (float) i4);
            if (resultPoint2 != null) {
                resultPoint = resultPoint2;
                break;
            }
        }
        resultPoint = resultPoint2;
        if (resultPoint == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint resultPoint3;
        resultPoint2 = null;
        for (i8 = 1; i8 < i7; i8++) {
            resultPoint2 = getBlackPointOnSegment((float) i6, (float) (i3 + i8), (float) (i6 + i8), (float) i3);
            if (resultPoint2 != null) {
                resultPoint3 = resultPoint2;
                break;
            }
        }
        resultPoint3 = resultPoint2;
        if (resultPoint3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint resultPoint4;
        resultPoint2 = null;
        for (i8 = 1; i8 < i7; i8++) {
            resultPoint2 = getBlackPointOnSegment((float) i, (float) (i3 + i8), (float) (i - i8), (float) i3);
            if (resultPoint2 != null) {
                resultPoint4 = resultPoint2;
                break;
            }
        }
        resultPoint4 = resultPoint2;
        if (resultPoint4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        resultPoint2 = null;
        while (i2 < i7) {
            resultPoint2 = getBlackPointOnSegment((float) i, (float) (i4 - i2), (float) (i - i2), (float) i4);
            if (resultPoint2 != null) {
                break;
            }
            i2++;
        }
        if (resultPoint2 != null) {
            return centerEdges(resultPoint2, resultPoint, resultPoint4, resultPoint3);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
