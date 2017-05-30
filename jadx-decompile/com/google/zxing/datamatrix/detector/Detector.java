package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.Collections;
import com.google.zxing.common.Comparator;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public final class Detector {
    private static final Integer[] INTEGERS = new Integer[]{new Integer(0), new Integer(1), new Integer(2), new Integer(3), new Integer(4)};
    private final BitMatrix image;
    private final WhiteRectangleDetector rectangleDetector;

    static class AnonymousClass1 {
    }

    private static class ResultPointsAndTransitions {
        private final ResultPoint from;
        private final ResultPoint to;
        private final int transitions;

        private ResultPointsAndTransitions(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
            this.from = resultPoint;
            this.to = resultPoint2;
            this.transitions = i;
        }

        ResultPointsAndTransitions(ResultPoint resultPoint, ResultPoint resultPoint2, int i, AnonymousClass1 anonymousClass1) {
            this(resultPoint, resultPoint2, i);
        }

        public ResultPoint getFrom() {
            return this.from;
        }

        public ResultPoint getTo() {
            return this.to;
        }

        public int getTransitions() {
            return this.transitions;
        }

        public String toString() {
            return new StringBuffer().append(this.from).append("/").append(this.to).append('/').append(this.transitions).toString();
        }
    }

    private static class ResultPointsAndTransitionsComparator implements Comparator {
        private ResultPointsAndTransitionsComparator() {
        }

        ResultPointsAndTransitionsComparator(AnonymousClass1 anonymousClass1) {
            this();
        }

        public int compare(Object obj, Object obj2) {
            return ((ResultPointsAndTransitions) obj).getTransitions() - ((ResultPointsAndTransitions) obj2).getTransitions();
        }
    }

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
        this.rectangleDetector = new WhiteRectangleDetector(bitMatrix);
    }

    private ResultPoint correctTopRight(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float distance = ((float) distance(resultPoint, resultPoint2)) / ((float) i);
        int distance2 = distance(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint((((resultPoint4.getX() - resultPoint3.getX()) / ((float) distance2)) * distance) + resultPoint4.getX(), (distance * ((resultPoint4.getY() - resultPoint3.getY()) / ((float) distance2))) + resultPoint4.getY());
        float distance3 = ((float) distance(resultPoint, resultPoint2)) / ((float) i);
        int distance4 = distance(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint((((resultPoint4.getX() - resultPoint2.getX()) / ((float) distance4)) * distance3) + resultPoint4.getX(), (distance3 * ((resultPoint4.getY() - resultPoint2.getY()) / ((float) distance4))) + resultPoint4.getY());
        return !isValid(resultPoint5) ? isValid(resultPoint6) ? resultPoint6 : null : !isValid(resultPoint6) ? resultPoint5 : Math.abs(transitionsBetween(resultPoint3, resultPoint5).getTransitions() - transitionsBetween(resultPoint2, resultPoint5).getTransitions()) <= Math.abs(transitionsBetween(resultPoint3, resultPoint6).getTransitions() - transitionsBetween(resultPoint2, resultPoint6).getTransitions()) ? resultPoint5 : resultPoint6;
    }

    private static int distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return round((float) Math.sqrt((double) (((resultPoint.getX() - resultPoint2.getX()) * (resultPoint.getX() - resultPoint2.getX())) + ((resultPoint.getY() - resultPoint2.getY()) * (resultPoint.getY() - resultPoint2.getY())))));
    }

    private static void increment(Hashtable hashtable, ResultPoint resultPoint) {
        Integer num = (Integer) hashtable.get(resultPoint);
        hashtable.put(resultPoint, num == null ? INTEGERS[1] : INTEGERS[num.intValue() + 1]);
    }

    private boolean isValid(ResultPoint resultPoint) {
        return resultPoint.getX() >= 0.0f && resultPoint.getX() < ((float) this.image.width) && resultPoint.getY() > 0.0f && resultPoint.getY() < ((float) this.image.height);
    }

    private static int round(float f) {
        return (int) (0.5f + f);
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, 0.5f, 0.5f, ((float) i) - 0.5f, 0.5f, ((float) i) - 0.5f, ((float) i) - 0.5f, 0.5f, ((float) i) - 0.5f, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private ResultPointsAndTransitions transitionsBetween(ResultPoint resultPoint, ResultPoint resultPoint2) {
        int x = (int) resultPoint.getX();
        int y = (int) resultPoint.getY();
        int x2 = (int) resultPoint2.getX();
        int y2 = (int) resultPoint2.getY();
        Object obj = Math.abs(y2 - y) > Math.abs(x2 - x) ? 1 : null;
        if (obj == null) {
            int i = y2;
            y2 = x2;
            x2 = i;
            int i2 = y;
            y = x;
            x = i2;
        }
        int abs = Math.abs(y2 - y);
        int abs2 = Math.abs(x2 - x);
        int i3 = (-abs) >> 1;
        int i4 = x < x2 ? 1 : -1;
        int i5 = y < y2 ? 1 : -1;
        int i6 = 0;
        boolean z = this.image.get(obj != null ? x : y, obj != null ? y : x);
        int i7 = x;
        int i8 = i3;
        while (y != y2) {
            boolean z2 = this.image.get(obj != null ? i7 : y, obj != null ? y : i7);
            if (z2 != z) {
                i6++;
                z = z2;
            }
            x = i8 + abs2;
            if (x > 0) {
                if (i7 == x2) {
                    x2 = i6;
                    break;
                }
                i7 += i4;
                x -= abs;
            }
            y += i5;
            i8 = x;
        }
        x2 = i6;
        return new ResultPointsAndTransitions(resultPoint, resultPoint2, x2, null);
    }

    public DetectorResult detect() {
        ResultPoint[] detect = this.rectangleDetector.detect();
        ResultPoint resultPoint = detect[0];
        ResultPoint resultPoint2 = detect[1];
        ResultPoint resultPoint3 = detect[2];
        ResultPoint resultPoint4 = detect[3];
        Vector vector = new Vector(4);
        vector.addElement(transitionsBetween(resultPoint, resultPoint2));
        vector.addElement(transitionsBetween(resultPoint, resultPoint3));
        vector.addElement(transitionsBetween(resultPoint2, resultPoint4));
        vector.addElement(transitionsBetween(resultPoint3, resultPoint4));
        Collections.insertionSort(vector, new ResultPointsAndTransitionsComparator(null));
        ResultPointsAndTransitions resultPointsAndTransitions = (ResultPointsAndTransitions) vector.elementAt(0);
        ResultPointsAndTransitions resultPointsAndTransitions2 = (ResultPointsAndTransitions) vector.elementAt(1);
        Hashtable hashtable = new Hashtable();
        increment(hashtable, resultPointsAndTransitions.getFrom());
        increment(hashtable, resultPointsAndTransitions.getTo());
        increment(hashtable, resultPointsAndTransitions2.getFrom());
        increment(hashtable, resultPointsAndTransitions2.getTo());
        ResultPoint resultPoint5 = null;
        ResultPoint resultPoint6 = null;
        ResultPoint resultPoint7 = null;
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            ResultPoint resultPoint8;
            ResultPoint resultPoint9 = (ResultPoint) keys.nextElement();
            if (((Integer) hashtable.get(resultPoint9)).intValue() == 2) {
                resultPoint8 = resultPoint9;
                resultPoint9 = resultPoint7;
                resultPoint7 = resultPoint5;
            } else if (resultPoint5 == null) {
                resultPoint8 = resultPoint6;
                ResultPoint resultPoint10 = resultPoint7;
                resultPoint7 = resultPoint9;
                resultPoint9 = resultPoint10;
            } else {
                resultPoint8 = resultPoint6;
                resultPoint7 = resultPoint5;
            }
            resultPoint6 = resultPoint8;
            resultPoint5 = resultPoint7;
            resultPoint7 = resultPoint9;
        }
        if (resultPoint5 == null || resultPoint6 == null || resultPoint7 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        detect = new ResultPoint[]{resultPoint5, resultPoint6, resultPoint7};
        ResultPoint.orderBestPatterns(detect);
        resultPoint7 = detect[0];
        resultPoint8 = detect[1];
        resultPoint6 = detect[2];
        resultPoint5 = !hashtable.containsKey(resultPoint) ? resultPoint : !hashtable.containsKey(resultPoint2) ? resultPoint2 : !hashtable.containsKey(resultPoint3) ? resultPoint3 : resultPoint4;
        int min = Math.min(transitionsBetween(resultPoint6, resultPoint5).getTransitions(), transitionsBetween(resultPoint7, resultPoint5).getTransitions());
        if ((min & 1) == 1) {
            min++;
        }
        resultPoint4 = correctTopRight(resultPoint8, resultPoint7, resultPoint6, resultPoint5, min + 2);
        if (resultPoint4 == null) {
            resultPoint4 = resultPoint5;
        }
        int max = Math.max(transitionsBetween(resultPoint6, resultPoint4).getTransitions(), transitionsBetween(resultPoint7, resultPoint4).getTransitions()) + 1;
        if ((max & 1) == 1) {
            max++;
        }
        return new DetectorResult(sampleGrid(this.image, resultPoint6, resultPoint8, resultPoint7, resultPoint4, max), new ResultPoint[]{resultPoint6, resultPoint8, resultPoint7, resultPoint4});
    }
}
