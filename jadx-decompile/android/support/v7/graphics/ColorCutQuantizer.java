package android.support.v7.graphics;

import android.graphics.Color;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.graphics.Palette.Filter;
import android.support.v7.graphics.Palette.Swatch;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

final class ColorCutQuantizer {
    private static final int COMPONENT_BLUE = -1;
    private static final int COMPONENT_GREEN = -2;
    private static final int COMPONENT_RED = -3;
    private static final String LOG_TAG = "ColorCutQuantizer";
    private static final boolean LOG_TIMINGS = false;
    private static final int QUANTIZE_WORD_MASK = 31;
    private static final int QUANTIZE_WORD_WIDTH = 5;
    private static final Comparator<Vbox> VBOX_COMPARATOR_VOLUME = new Comparator<Vbox>() {
        public int compare(Vbox vbox, Vbox vbox2) {
            return vbox2.getVolume() - vbox.getVolume();
        }
    };
    final int[] mColors;
    final Filter[] mFilters;
    final int[] mHistogram;
    final List<Swatch> mQuantizedColors;
    private final float[] mTempHsl = new float[3];
    final TimingLogger mTimingLogger = null;

    private class Vbox {
        private int mLowerIndex;
        private int mMaxBlue;
        private int mMaxGreen;
        private int mMaxRed;
        private int mMinBlue;
        private int mMinGreen;
        private int mMinRed;
        private int mPopulation;
        private int mUpperIndex;

        Vbox(int i, int i2) {
            this.mLowerIndex = i;
            this.mUpperIndex = i2;
            fitBox();
        }

        final boolean canSplit() {
            return getColorCount() > 1;
        }

        final int findSplitPoint() {
            int longestColorDimension = getLongestColorDimension();
            int[] iArr = ColorCutQuantizer.this.mColors;
            int[] iArr2 = ColorCutQuantizer.this.mHistogram;
            ColorCutQuantizer.modifySignificantOctet(iArr, longestColorDimension, this.mLowerIndex, this.mUpperIndex);
            Arrays.sort(iArr, this.mLowerIndex, this.mUpperIndex + 1);
            ColorCutQuantizer.modifySignificantOctet(iArr, longestColorDimension, this.mLowerIndex, this.mUpperIndex);
            int i = this.mPopulation / 2;
            longestColorDimension = 0;
            for (int i2 = this.mLowerIndex; i2 <= this.mUpperIndex; i2++) {
                longestColorDimension += iArr2[iArr[i2]];
                if (longestColorDimension >= i) {
                    return i2;
                }
            }
            return this.mLowerIndex;
        }

        final void fitBox() {
            int[] iArr = ColorCutQuantizer.this.mColors;
            int[] iArr2 = ColorCutQuantizer.this.mHistogram;
            int i = Integer.MIN_VALUE;
            int i2 = 0;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = this.mLowerIndex; i8 <= this.mUpperIndex; i8++) {
                int i9 = iArr[i8];
                i2 += iArr2[i9];
                int access$000 = ColorCutQuantizer.quantizedRed(i9);
                int access$100 = ColorCutQuantizer.quantizedGreen(i9);
                i9 = ColorCutQuantizer.quantizedBlue(i9);
                if (access$000 > i3) {
                    i3 = access$000;
                }
                if (access$000 < i6) {
                    i6 = access$000;
                }
                if (access$100 > i7) {
                    i7 = access$100;
                }
                if (access$100 < i5) {
                    i5 = access$100;
                }
                if (i9 > i) {
                    i = i9;
                }
                if (i9 < i4) {
                    i4 = i9;
                }
            }
            this.mMinRed = i6;
            this.mMaxRed = i3;
            this.mMinGreen = i5;
            this.mMaxGreen = i7;
            this.mMinBlue = i4;
            this.mMaxBlue = i;
            this.mPopulation = i2;
        }

        final Swatch getAverageColor() {
            int i = 0;
            int[] iArr = ColorCutQuantizer.this.mColors;
            int[] iArr2 = ColorCutQuantizer.this.mHistogram;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.mLowerIndex; i5 <= this.mUpperIndex; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i += i7;
                i4 += ColorCutQuantizer.quantizedRed(i6) * i7;
                i3 += ColorCutQuantizer.quantizedGreen(i6) * i7;
                i2 += ColorCutQuantizer.quantizedBlue(i6) * i7;
            }
            return new Swatch(ColorCutQuantizer.approximateToRgb888(Math.round(((float) i4) / ((float) i)), Math.round(((float) i3) / ((float) i)), Math.round(((float) i2) / ((float) i))), i);
        }

        final int getColorCount() {
            return (this.mUpperIndex + 1) - this.mLowerIndex;
        }

        final int getLongestColorDimension() {
            int i = this.mMaxRed - this.mMinRed;
            int i2 = this.mMaxGreen - this.mMinGreen;
            int i3 = this.mMaxBlue - this.mMinBlue;
            return (i < i2 || i < i3) ? (i2 < i || i2 < i3) ? -1 : -2 : -3;
        }

        final int getVolume() {
            return (((this.mMaxRed - this.mMinRed) + 1) * ((this.mMaxGreen - this.mMinGreen) + 1)) * ((this.mMaxBlue - this.mMinBlue) + 1);
        }

        final Vbox splitBox() {
            if (canSplit()) {
                int findSplitPoint = findSplitPoint();
                Vbox vbox = new Vbox(findSplitPoint + 1, this.mUpperIndex);
                this.mUpperIndex = findSplitPoint;
                fitBox();
                return vbox;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    ColorCutQuantizer(int[] iArr, int i, Filter[] filterArr) {
        int i2;
        int quantizeFromRgb888;
        int i3 = 0;
        this.mFilters = filterArr;
        int[] iArr2 = new int[32768];
        this.mHistogram = iArr2;
        for (i2 = 0; i2 < iArr.length; i2++) {
            quantizeFromRgb888 = quantizeFromRgb888(iArr[i2]);
            iArr[i2] = quantizeFromRgb888;
            iArr2[quantizeFromRgb888] = iArr2[quantizeFromRgb888] + 1;
        }
        i2 = 0;
        quantizeFromRgb888 = 0;
        while (i2 < iArr2.length) {
            if (iArr2[i2] > 0 && shouldIgnoreColor(i2)) {
                iArr2[i2] = 0;
            }
            if (iArr2[i2] > 0) {
                quantizeFromRgb888++;
            }
            i2++;
        }
        int[] iArr3 = new int[quantizeFromRgb888];
        this.mColors = iArr3;
        int i4 = 0;
        for (i2 = 0; i2 < iArr2.length; i2++) {
            if (iArr2[i2] > 0) {
                int i5 = i4 + 1;
                iArr3[i4] = i2;
                i4 = i5;
            }
        }
        if (quantizeFromRgb888 <= i) {
            this.mQuantizedColors = new ArrayList();
            i2 = iArr3.length;
            while (i3 < i2) {
                quantizeFromRgb888 = iArr3[i3];
                this.mQuantizedColors.add(new Swatch(approximateToRgb888(quantizeFromRgb888), iArr2[quantizeFromRgb888]));
                i3++;
            }
            return;
        }
        this.mQuantizedColors = quantizePixels(i);
    }

    private static int approximateToRgb888(int i) {
        return approximateToRgb888(quantizedRed(i), quantizedGreen(i), quantizedBlue(i));
    }

    private static int approximateToRgb888(int i, int i2, int i3) {
        return Color.rgb(modifyWordWidth(i, 5, 8), modifyWordWidth(i2, 5, 8), modifyWordWidth(i3, 5, 8));
    }

    private List<Swatch> generateAverageColors(Collection<Vbox> collection) {
        List arrayList = new ArrayList(collection.size());
        for (Vbox averageColor : collection) {
            Swatch averageColor2 = averageColor.getAverageColor();
            if (!shouldIgnoreColor(averageColor2)) {
                arrayList.add(averageColor2);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void modifySignificantOctet(int[] r3, int r4, int r5, int r6) {
        /*
        switch(r4) {
            case -3: goto L_0x0003;
            case -2: goto L_0x0004;
            case -1: goto L_0x001f;
            default: goto L_0x0003;
        };
    L_0x0003:
        return;
    L_0x0004:
        if (r5 > r6) goto L_0x0003;
    L_0x0006:
        r0 = r3[r5];
        r1 = quantizedGreen(r0);
        r1 = r1 << 10;
        r2 = quantizedRed(r0);
        r2 = r2 << 5;
        r1 = r1 | r2;
        r0 = quantizedBlue(r0);
        r0 = r0 | r1;
        r3[r5] = r0;
        r5 = r5 + 1;
        goto L_0x0004;
    L_0x001f:
        if (r5 > r6) goto L_0x0003;
    L_0x0021:
        r0 = r3[r5];
        r1 = quantizedBlue(r0);
        r1 = r1 << 10;
        r2 = quantizedGreen(r0);
        r2 = r2 << 5;
        r1 = r1 | r2;
        r0 = quantizedRed(r0);
        r0 = r0 | r1;
        r3[r5] = r0;
        r5 = r5 + 1;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.graphics.ColorCutQuantizer.modifySignificantOctet(int[], int, int, int):void");
    }

    private static int modifyWordWidth(int i, int i2, int i3) {
        return (i3 > i2 ? (((1 << i3) - 1) * i) / ((1 << i2) - 1) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private static int quantizeFromRgb888(int i) {
        return ((modifyWordWidth(Color.red(i), 8, 5) << 10) | (modifyWordWidth(Color.green(i), 8, 5) << 5)) | modifyWordWidth(Color.blue(i), 8, 5);
    }

    private List<Swatch> quantizePixels(int i) {
        Collection priorityQueue = new PriorityQueue(i, VBOX_COMPARATOR_VOLUME);
        priorityQueue.offer(new Vbox(0, this.mColors.length - 1));
        splitBoxes(priorityQueue, i);
        return generateAverageColors(priorityQueue);
    }

    private static int quantizedBlue(int i) {
        return i & 31;
    }

    private static int quantizedGreen(int i) {
        return (i >> 5) & 31;
    }

    private static int quantizedRed(int i) {
        return (i >> 10) & 31;
    }

    private boolean shouldIgnoreColor(int i) {
        int approximateToRgb888 = approximateToRgb888(i);
        ColorUtils.colorToHSL(approximateToRgb888, this.mTempHsl);
        return shouldIgnoreColor(approximateToRgb888, this.mTempHsl);
    }

    private boolean shouldIgnoreColor(int i, float[] fArr) {
        if (this.mFilters == null || this.mFilters.length <= 0) {
            return false;
        }
        for (Filter isAllowed : this.mFilters) {
            if (!isAllowed.isAllowed(i, fArr)) {
                return true;
            }
        }
        return false;
    }

    private boolean shouldIgnoreColor(Swatch swatch) {
        return shouldIgnoreColor(swatch.getRgb(), swatch.getHsl());
    }

    private void splitBoxes(PriorityQueue<Vbox> priorityQueue, int i) {
        while (priorityQueue.size() < i) {
            Vbox vbox = (Vbox) priorityQueue.poll();
            if (vbox != null && vbox.canSplit()) {
                priorityQueue.offer(vbox.splitBox());
                priorityQueue.offer(vbox);
            } else {
                return;
            }
        }
    }

    List<Swatch> getQuantizedColors() {
        return this.mQuantizedColors;
    }
}
