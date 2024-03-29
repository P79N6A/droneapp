package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.Collections;
import com.google.zxing.common.Comparator;
import java.util.Hashtable;
import java.util.Vector;
import org.codehaus.jackson.smile.SmileConstants;

public class FinderPatternFinder {
    private static final int CENTER_QUORUM = 2;
    private static final int INTEGER_MATH_SHIFT = 8;
    protected static final int MAX_MODULES = 57;
    protected static final int MIN_SKIP = 3;
    private final int[] crossCheckStateCount;
    private boolean hasSkipped;
    private final BitMatrix image;
    private final Vector possibleCenters;
    private final ResultPointCallback resultPointCallback;

    private static class CenterComparator implements Comparator {
        private final float average;

        public CenterComparator(float f) {
            this.average = f;
        }

        public int compare(Object obj, Object obj2) {
            if (((FinderPattern) obj2).getCount() != ((FinderPattern) obj).getCount()) {
                return ((FinderPattern) obj2).getCount() - ((FinderPattern) obj).getCount();
            }
            float abs = Math.abs(((FinderPattern) obj2).getEstimatedModuleSize() - this.average);
            float abs2 = Math.abs(((FinderPattern) obj).getEstimatedModuleSize() - this.average);
            return abs < abs2 ? 1 : abs == abs2 ? 0 : -1;
        }
    }

    private static class FurthestFromAverageComparator implements Comparator {
        private final float average;

        public FurthestFromAverageComparator(float f) {
            this.average = f;
        }

        public int compare(Object obj, Object obj2) {
            float abs = Math.abs(((FinderPattern) obj2).getEstimatedModuleSize() - this.average);
            float abs2 = Math.abs(((FinderPattern) obj).getEstimatedModuleSize() - this.average);
            return abs < abs2 ? -1 : abs == abs2 ? 0 : 1;
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.image = bitMatrix;
        this.possibleCenters = new Vector();
        this.crossCheckStateCount = new int[5];
        this.resultPointCallback = resultPointCallback;
    }

    private static float centerFromEnd(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    private float crossCheckHorizontal(int i, int i2, int i3, int i4) {
        BitMatrix bitMatrix = this.image;
        int width = bitMatrix.getWidth();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i5 = i;
        while (i5 >= 0 && bitMatrix.get(i5, i2)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bitMatrix.get(i5, i2) && crossCheckStateCount[1] <= i3) {
            crossCheckStateCount[1] = crossCheckStateCount[1] + 1;
            i5--;
        }
        if (i5 < 0 || crossCheckStateCount[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && bitMatrix.get(i5, i2) && crossCheckStateCount[0] <= i3) {
            crossCheckStateCount[0] = crossCheckStateCount[0] + 1;
            i5--;
        }
        if (crossCheckStateCount[0] > i3) {
            return Float.NaN;
        }
        i5 = i + 1;
        while (i5 < width && bitMatrix.get(i5, i2)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i5++;
        }
        if (i5 == width) {
            return Float.NaN;
        }
        while (i5 < width && !bitMatrix.get(i5, i2) && crossCheckStateCount[3] < i3) {
            crossCheckStateCount[3] = crossCheckStateCount[3] + 1;
            i5++;
        }
        if (i5 == width || crossCheckStateCount[3] >= i3) {
            return Float.NaN;
        }
        while (i5 < width && bitMatrix.get(i5, i2) && crossCheckStateCount[4] < i3) {
            crossCheckStateCount[4] = crossCheckStateCount[4] + 1;
            i5++;
        }
        return (crossCheckStateCount[4] >= i3 || Math.abs(((((crossCheckStateCount[0] + crossCheckStateCount[1]) + crossCheckStateCount[2]) + crossCheckStateCount[3]) + crossCheckStateCount[4]) - i4) * 5 >= i4 || !foundPatternCross(crossCheckStateCount)) ? Float.NaN : centerFromEnd(crossCheckStateCount, i5);
    }

    private float crossCheckVertical(int i, int i2, int i3, int i4) {
        BitMatrix bitMatrix = this.image;
        int height = bitMatrix.getHeight();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i5 = i;
        while (i5 >= 0 && bitMatrix.get(i2, i5)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bitMatrix.get(i2, i5) && crossCheckStateCount[1] <= i3) {
            crossCheckStateCount[1] = crossCheckStateCount[1] + 1;
            i5--;
        }
        if (i5 < 0 || crossCheckStateCount[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && bitMatrix.get(i2, i5) && crossCheckStateCount[0] <= i3) {
            crossCheckStateCount[0] = crossCheckStateCount[0] + 1;
            i5--;
        }
        if (crossCheckStateCount[0] > i3) {
            return Float.NaN;
        }
        i5 = i + 1;
        while (i5 < height && bitMatrix.get(i2, i5)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i5++;
        }
        if (i5 == height) {
            return Float.NaN;
        }
        while (i5 < height && !bitMatrix.get(i2, i5) && crossCheckStateCount[3] < i3) {
            crossCheckStateCount[3] = crossCheckStateCount[3] + 1;
            i5++;
        }
        if (i5 == height || crossCheckStateCount[3] >= i3) {
            return Float.NaN;
        }
        while (i5 < height && bitMatrix.get(i2, i5) && crossCheckStateCount[4] < i3) {
            crossCheckStateCount[4] = crossCheckStateCount[4] + 1;
            i5++;
        }
        return (crossCheckStateCount[4] >= i3 || Math.abs(((((crossCheckStateCount[0] + crossCheckStateCount[1]) + crossCheckStateCount[2]) + crossCheckStateCount[3]) + crossCheckStateCount[4]) - i4) * 5 >= i4 * 2 || !foundPatternCross(crossCheckStateCount)) ? Float.NaN : centerFromEnd(crossCheckStateCount, i5);
    }

    private int findRowSkip() {
        int size = this.possibleCenters.size();
        if (size <= 1) {
            return 0;
        }
        FinderPattern finderPattern = null;
        int i = 0;
        while (i < size) {
            FinderPattern finderPattern2 = (FinderPattern) this.possibleCenters.elementAt(i);
            if (finderPattern2.getCount() < 2) {
                finderPattern2 = finderPattern;
            } else if (finderPattern != null) {
                this.hasSkipped = true;
                return ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
            }
            i++;
            finderPattern = finderPattern2;
        }
        return 0;
    }

    protected static boolean foundPatternCross(int[] iArr) {
        int i;
        boolean z = true;
        int i2 = 0;
        for (i = 0; i < 5; i++) {
            int i3 = iArr[i];
            if (i3 == 0) {
                return false;
            }
            i2 += i3;
        }
        if (i2 < 7) {
            return false;
        }
        i = (i2 << 8) / 7;
        i2 = i / 2;
        if (Math.abs(i - (iArr[0] << 8)) >= i2 || Math.abs(i - (iArr[1] << 8)) >= i2 || Math.abs((i * 3) - (iArr[2] << 8)) >= i2 * 3 || Math.abs(i - (iArr[3] << 8)) >= i2 || Math.abs(i - (iArr[4] << 8)) >= i2) {
            z = false;
        }
        return z;
    }

    private int[] getCrossCheckStateCount() {
        this.crossCheckStateCount[0] = 0;
        this.crossCheckStateCount[1] = 0;
        this.crossCheckStateCount[2] = 0;
        this.crossCheckStateCount[3] = 0;
        this.crossCheckStateCount[4] = 0;
        return this.crossCheckStateCount;
    }

    private boolean haveMultiplyConfirmedCenters() {
        float f = 0.0f;
        int size = this.possibleCenters.size();
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        while (i < size) {
            float estimatedModuleSize;
            int i3;
            FinderPattern finderPattern = (FinderPattern) this.possibleCenters.elementAt(i);
            if (finderPattern.getCount() >= 2) {
                estimatedModuleSize = finderPattern.getEstimatedModuleSize() + f2;
                i3 = i2 + 1;
            } else {
                estimatedModuleSize = f2;
                i3 = i2;
            }
            i++;
            i2 = i3;
            f2 = estimatedModuleSize;
        }
        if (i2 < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (i2 = 0; i2 < size; i2++) {
            f += Math.abs(((FinderPattern) this.possibleCenters.elementAt(i2)).getEstimatedModuleSize() - f3);
        }
        return f <= 0.05f * f2;
    }

    private FinderPattern[] selectBestPatterns() {
        float f = 0.0f;
        int size = this.possibleCenters.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i;
        if (size > 3) {
            float estimatedModuleSize;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (i = 0; i < size; i++) {
                estimatedModuleSize = ((FinderPattern) this.possibleCenters.elementAt(i)).getEstimatedModuleSize();
                f3 += estimatedModuleSize;
                f2 += estimatedModuleSize * estimatedModuleSize;
            }
            f3 /= (float) size;
            estimatedModuleSize = (float) Math.sqrt((double) ((f2 / ((float) size)) - (f3 * f3)));
            Collections.insertionSort(this.possibleCenters, new FurthestFromAverageComparator(f3));
            f2 = Math.max(0.2f * f3, estimatedModuleSize);
            i = 0;
            while (i < this.possibleCenters.size() && this.possibleCenters.size() > 3) {
                if (Math.abs(((FinderPattern) this.possibleCenters.elementAt(i)).getEstimatedModuleSize() - f3) > f2) {
                    this.possibleCenters.removeElementAt(i);
                    i--;
                }
                i++;
            }
        }
        if (this.possibleCenters.size() > 3) {
            for (i = 0; i < this.possibleCenters.size(); i++) {
                f += ((FinderPattern) this.possibleCenters.elementAt(i)).getEstimatedModuleSize();
            }
            Collections.insertionSort(this.possibleCenters, new CenterComparator(f / ((float) this.possibleCenters.size())));
            this.possibleCenters.setSize(3);
        }
        return new FinderPattern[]{(FinderPattern) this.possibleCenters.elementAt(0), (FinderPattern) this.possibleCenters.elementAt(1), (FinderPattern) this.possibleCenters.elementAt(2)};
    }

    FinderPatternInfo find(Hashtable hashtable) {
        int i = (hashtable == null || !hashtable.containsKey(DecodeHintType.TRY_HARDER)) ? 0 : 1;
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i2 = (height * 3) / SmileConstants.TOKEN_MISC_LONG_TEXT_UNICODE;
        i = (i2 < 3 || i != 0) ? 3 : i2;
        int[] iArr = new int[5];
        int i3 = i - 1;
        boolean z = false;
        int i4 = i;
        while (i3 < height && !r6) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            i2 = 0;
            i = 0;
            while (i2 < width) {
                if (this.image.get(i2, i3)) {
                    if ((i & 1) == 1) {
                        i++;
                    }
                    iArr[i] = iArr[i] + 1;
                } else if ((i & 1) != 0) {
                    iArr[i] = iArr[i] + 1;
                } else if (i != 4) {
                    i++;
                    iArr[i] = iArr[i] + 1;
                } else if (!foundPatternCross(iArr)) {
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = iArr[4];
                    iArr[3] = 1;
                    iArr[4] = 0;
                    i = 3;
                } else if (handlePossibleCenter(iArr, i3, i2)) {
                    boolean haveMultiplyConfirmedCenters;
                    if (this.hasSkipped) {
                        haveMultiplyConfirmedCenters = haveMultiplyConfirmedCenters();
                    } else {
                        i = findRowSkip();
                        if (i > iArr[2]) {
                            i2 = i3 + ((i - iArr[2]) - 2);
                            i = width - 1;
                        } else {
                            i = i2;
                            i2 = i3;
                        }
                        i3 = i2;
                        i2 = i;
                        haveMultiplyConfirmedCenters = z;
                    }
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    iArr[3] = 0;
                    iArr[4] = 0;
                    z = haveMultiplyConfirmedCenters;
                    i4 = 2;
                    i = 0;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = iArr[4];
                    iArr[3] = 1;
                    iArr[4] = 0;
                    i = 3;
                }
                i2++;
            }
            if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i3, width)) {
                i4 = iArr[0];
                if (this.hasSkipped) {
                    z = haveMultiplyConfirmedCenters();
                }
            }
            i3 += i4;
        }
        ResultPoint[] selectBestPatterns = selectBestPatterns();
        ResultPoint.orderBestPatterns(selectBestPatterns);
        return new FinderPatternInfo(selectBestPatterns);
    }

    protected BitMatrix getImage() {
        return this.image;
    }

    protected Vector getPossibleCenters() {
        return this.possibleCenters;
    }

    protected boolean handlePossibleCenter(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = (((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4];
        float centerFromEnd = centerFromEnd(iArr, i2);
        float crossCheckVertical = crossCheckVertical(i, (int) centerFromEnd, iArr[2], i4);
        if (!Float.isNaN(crossCheckVertical)) {
            float crossCheckHorizontal = crossCheckHorizontal((int) centerFromEnd, (int) crossCheckVertical, iArr[2], i4);
            if (!Float.isNaN(crossCheckHorizontal)) {
                float f = ((float) i4) / 7.0f;
                int size = this.possibleCenters.size();
                for (int i5 = 0; i5 < size; i5++) {
                    FinderPattern finderPattern = (FinderPattern) this.possibleCenters.elementAt(i5);
                    if (finderPattern.aboutEquals(f, crossCheckVertical, crossCheckHorizontal)) {
                        finderPattern.incrementCount();
                        i3 = 1;
                        break;
                    }
                }
                if (i3 == 0) {
                    ResultPoint finderPattern2 = new FinderPattern(crossCheckHorizontal, crossCheckVertical, f);
                    this.possibleCenters.addElement(finderPattern2);
                    if (this.resultPointCallback != null) {
                        this.resultPointCallback.foundPossibleResultPoint(finderPattern2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
