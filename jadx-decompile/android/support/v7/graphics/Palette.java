package android.support.v7.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.os.AsyncTaskCompat;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.TimingLogger;
import com.tencent.open.yyb.TitleBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class Palette {
    private static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
    private static final Filter DEFAULT_FILTER = new Filter() {
        private static final float BLACK_MAX_LIGHTNESS = 0.05f;
        private static final float WHITE_MIN_LIGHTNESS = 0.95f;

        private boolean isBlack(float[] fArr) {
            return fArr[2] <= BLACK_MAX_LIGHTNESS;
        }

        private boolean isNearRedILine(float[] fArr) {
            return fArr[0] >= TitleBar.SHAREBTN_RIGHT_MARGIN && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean isWhite(float[] fArr) {
            return fArr[2] >= WHITE_MIN_LIGHTNESS;
        }

        public boolean isAllowed(int i, float[] fArr) {
            return (isWhite(fArr) || isBlack(fArr) || isNearRedILine(fArr)) ? false : true;
        }
    };
    private static final int DEFAULT_RESIZE_BITMAP_AREA = 25600;
    private static final String LOG_TAG = "Palette";
    private static final boolean LOG_TIMINGS = false;
    private static final float MIN_CONTRAST_BODY_TEXT = 4.5f;
    private static final float MIN_CONTRAST_TITLE_TEXT = 3.0f;
    private final int mMaxPopulation;
    private final Map<Target, Swatch> mSelectedSwatches;
    private final List<Swatch> mSwatches;
    private final List<Target> mTargets;
    private final SparseBooleanArray mUsedColors;

    public interface Filter {
        boolean isAllowed(int i, float[] fArr);
    }

    public static final class Builder {
        private final Bitmap mBitmap;
        private final List<Filter> mFilters = new ArrayList();
        private int mMaxColors = 16;
        private Rect mRegion;
        private int mResizeArea = Palette.DEFAULT_RESIZE_BITMAP_AREA;
        private int mResizeMaxDimension = -1;
        private final List<Swatch> mSwatches;
        private final List<Target> mTargets = new ArrayList();

        public Builder(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.mFilters.add(Palette.DEFAULT_FILTER);
            this.mBitmap = bitmap;
            this.mSwatches = null;
            this.mTargets.add(Target.LIGHT_VIBRANT);
            this.mTargets.add(Target.VIBRANT);
            this.mTargets.add(Target.DARK_VIBRANT);
            this.mTargets.add(Target.LIGHT_MUTED);
            this.mTargets.add(Target.MUTED);
            this.mTargets.add(Target.DARK_MUTED);
        }

        public Builder(List<Swatch> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("List of Swatches is not valid");
            }
            this.mFilters.add(Palette.DEFAULT_FILTER);
            this.mSwatches = list;
            this.mBitmap = null;
        }

        private int[] getPixelsFromBitmap(Bitmap bitmap) {
            int i = 0;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Object obj = new int[(width * height)];
            bitmap.getPixels(obj, 0, width, 0, 0, width, height);
            if (this.mRegion == null) {
                return obj;
            }
            int width2 = this.mRegion.width();
            int height2 = this.mRegion.height();
            Object obj2 = new int[(width2 * height2)];
            while (i < height2) {
                System.arraycopy(obj, ((this.mRegion.top + i) * width) + this.mRegion.left, obj2, i * width2, width2);
                i++;
            }
            return obj2;
        }

        private Bitmap scaleBitmapDown(Bitmap bitmap) {
            double d = -1.0d;
            int width;
            if (this.mResizeArea > 0) {
                width = bitmap.getWidth() * bitmap.getHeight();
                if (width > this.mResizeArea) {
                    d = ((double) this.mResizeArea) / ((double) width);
                }
            } else if (this.mResizeMaxDimension > 0) {
                width = Math.max(bitmap.getWidth(), bitmap.getHeight());
                if (width > this.mResizeMaxDimension) {
                    d = ((double) this.mResizeMaxDimension) / ((double) width);
                }
            }
            return d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d), (int) Math.ceil(d * ((double) bitmap.getHeight())), false);
        }

        @NonNull
        public Builder addFilter(Filter filter) {
            if (filter != null) {
                this.mFilters.add(filter);
            }
            return this;
        }

        @NonNull
        public Builder addTarget(@NonNull Target target) {
            if (!this.mTargets.contains(target)) {
                this.mTargets.add(target);
            }
            return this;
        }

        @NonNull
        public Builder clearFilters() {
            this.mFilters.clear();
            return this;
        }

        @NonNull
        public Builder clearRegion() {
            this.mRegion = null;
            return this;
        }

        @NonNull
        public Builder clearTargets() {
            if (this.mTargets != null) {
                this.mTargets.clear();
            }
            return this;
        }

        @NonNull
        public AsyncTask<Bitmap, Void, Palette> generate(final PaletteAsyncListener paletteAsyncListener) {
            if (paletteAsyncListener == null) {
                throw new IllegalArgumentException("listener can not be null");
            }
            return AsyncTaskCompat.executeParallel(new AsyncTask<Bitmap, Void, Palette>() {
                protected Palette doInBackground(Bitmap... bitmapArr) {
                    try {
                        return Builder.this.generate();
                    } catch (Throwable e) {
                        Log.e(Palette.LOG_TAG, "Exception thrown during async generate", e);
                        return null;
                    }
                }

                protected void onPostExecute(Palette palette) {
                    paletteAsyncListener.onGenerated(palette);
                }
            }, new Bitmap[]{this.mBitmap});
        }

        @NonNull
        public Palette generate() {
            List quantizedColors;
            TimingLogger timingLogger = null;
            if (this.mBitmap != null) {
                Bitmap scaleBitmapDown = scaleBitmapDown(this.mBitmap);
                if (timingLogger != null) {
                    timingLogger.addSplit("Processed Bitmap");
                }
                Rect rect = this.mRegion;
                if (!(scaleBitmapDown == this.mBitmap || rect == null)) {
                    double width = ((double) scaleBitmapDown.getWidth()) / ((double) this.mBitmap.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), scaleBitmapDown.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(width * ((double) rect.bottom)), scaleBitmapDown.getHeight());
                }
                ColorCutQuantizer colorCutQuantizer = new ColorCutQuantizer(getPixelsFromBitmap(scaleBitmapDown), this.mMaxColors, this.mFilters.isEmpty() ? timingLogger : (Filter[]) this.mFilters.toArray(new Filter[this.mFilters.size()]));
                if (scaleBitmapDown != this.mBitmap) {
                    scaleBitmapDown.recycle();
                }
                quantizedColors = colorCutQuantizer.getQuantizedColors();
                if (timingLogger != null) {
                    timingLogger.addSplit("Color quantization completed");
                }
            } else {
                quantizedColors = this.mSwatches;
            }
            Palette palette = new Palette(quantizedColors, this.mTargets);
            palette.generate();
            if (timingLogger != null) {
                timingLogger.addSplit("Created Palette");
                timingLogger.dumpToLog();
            }
            return palette;
        }

        @NonNull
        public Builder maximumColorCount(int i) {
            this.mMaxColors = i;
            return this;
        }

        @NonNull
        public Builder resizeBitmapArea(int i) {
            this.mResizeArea = i;
            this.mResizeMaxDimension = -1;
            return this;
        }

        @Deprecated
        @NonNull
        public Builder resizeBitmapSize(int i) {
            this.mResizeMaxDimension = i;
            this.mResizeArea = -1;
            return this;
        }

        @NonNull
        public Builder setRegion(int i, int i2, int i3, int i4) {
            if (this.mBitmap != null) {
                if (this.mRegion == null) {
                    this.mRegion = new Rect();
                }
                this.mRegion.set(0, 0, this.mBitmap.getWidth(), this.mBitmap.getHeight());
                if (!this.mRegion.intersect(i, i2, i3, i4)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }
    }

    public interface PaletteAsyncListener {
        void onGenerated(Palette palette);
    }

    public static final class Swatch {
        private final int mBlue;
        private int mBodyTextColor;
        private boolean mGeneratedTextColors;
        private final int mGreen;
        private float[] mHsl;
        private final int mPopulation;
        private final int mRed;
        private final int mRgb;
        private int mTitleTextColor;

        public Swatch(@ColorInt int i, int i2) {
            this.mRed = Color.red(i);
            this.mGreen = Color.green(i);
            this.mBlue = Color.blue(i);
            this.mRgb = i;
            this.mPopulation = i2;
        }

        Swatch(int i, int i2, int i3, int i4) {
            this.mRed = i;
            this.mGreen = i2;
            this.mBlue = i3;
            this.mRgb = Color.rgb(i, i2, i3);
            this.mPopulation = i4;
        }

        Swatch(float[] fArr, int i) {
            this(ColorUtils.HSLToColor(fArr), i);
            this.mHsl = fArr;
        }

        private void ensureTextColorsGenerated() {
            if (!this.mGeneratedTextColors) {
                int calculateMinimumAlpha = ColorUtils.calculateMinimumAlpha(-1, this.mRgb, Palette.MIN_CONTRAST_BODY_TEXT);
                int calculateMinimumAlpha2 = ColorUtils.calculateMinimumAlpha(-1, this.mRgb, 3.0f);
                if (calculateMinimumAlpha == -1 || calculateMinimumAlpha2 == -1) {
                    int calculateMinimumAlpha3 = ColorUtils.calculateMinimumAlpha(ViewCompat.MEASURED_STATE_MASK, this.mRgb, Palette.MIN_CONTRAST_BODY_TEXT);
                    int calculateMinimumAlpha4 = ColorUtils.calculateMinimumAlpha(ViewCompat.MEASURED_STATE_MASK, this.mRgb, 3.0f);
                    if (calculateMinimumAlpha3 == -1 || calculateMinimumAlpha3 == -1) {
                        this.mBodyTextColor = calculateMinimumAlpha != -1 ? ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha) : ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha3);
                        this.mTitleTextColor = calculateMinimumAlpha2 != -1 ? ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2) : ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha4);
                        this.mGeneratedTextColors = true;
                        return;
                    }
                    this.mBodyTextColor = ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha3);
                    this.mTitleTextColor = ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha4);
                    this.mGeneratedTextColors = true;
                    return;
                }
                this.mBodyTextColor = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                this.mTitleTextColor = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                this.mGeneratedTextColors = true;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Swatch swatch = (Swatch) obj;
            return this.mPopulation == swatch.mPopulation && this.mRgb == swatch.mRgb;
        }

        @ColorInt
        public int getBodyTextColor() {
            ensureTextColorsGenerated();
            return this.mBodyTextColor;
        }

        public float[] getHsl() {
            if (this.mHsl == null) {
                this.mHsl = new float[3];
            }
            ColorUtils.RGBToHSL(this.mRed, this.mGreen, this.mBlue, this.mHsl);
            return this.mHsl;
        }

        public int getPopulation() {
            return this.mPopulation;
        }

        @ColorInt
        public int getRgb() {
            return this.mRgb;
        }

        @ColorInt
        public int getTitleTextColor() {
            ensureTextColorsGenerated();
            return this.mTitleTextColor;
        }

        public int hashCode() {
            return (this.mRgb * 31) + this.mPopulation;
        }

        public String toString() {
            return new StringBuilder(getClass().getSimpleName()).append(" [RGB: #").append(Integer.toHexString(getRgb())).append(']').append(" [HSL: ").append(Arrays.toString(getHsl())).append(']').append(" [Population: ").append(this.mPopulation).append(']').append(" [Title Text: #").append(Integer.toHexString(getTitleTextColor())).append(']').append(" [Body Text: #").append(Integer.toHexString(getBodyTextColor())).append(']').toString();
        }
    }

    private Palette(List<Swatch> list, List<Target> list2) {
        this.mSwatches = list;
        this.mTargets = list2;
        this.mUsedColors = new SparseBooleanArray();
        this.mSelectedSwatches = new ArrayMap();
        this.mMaxPopulation = findMaxPopulation();
    }

    private static float[] copyHslValues(Swatch swatch) {
        Object obj = new float[3];
        System.arraycopy(swatch.getHsl(), 0, obj, 0, 3);
        return obj;
    }

    private int findMaxPopulation() {
        int size = this.mSwatches.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(((Swatch) this.mSwatches.get(i2)).getPopulation(), i);
        }
        return i;
    }

    public static Builder from(Bitmap bitmap) {
        return new Builder(bitmap);
    }

    public static Palette from(List<Swatch> list) {
        return new Builder((List) list).generate();
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap) {
        return from(bitmap).generate();
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap, int i) {
        return from(bitmap).maximumColorCount(i).generate();
    }

    private void generate() {
        int size = this.mTargets.size();
        for (int i = 0; i < size; i++) {
            Target target = (Target) this.mTargets.get(i);
            target.normalizeWeights();
            this.mSelectedSwatches.put(target, generateScoredTarget(target));
        }
        this.mUsedColors.clear();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, int i, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).maximumColorCount(i).generate(paletteAsyncListener);
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).generate(paletteAsyncListener);
    }

    private float generateScore(Swatch swatch, Target target) {
        float f = 0.0f;
        float[] hsl = swatch.getHsl();
        float saturationWeight = target.getSaturationWeight() > 0.0f ? target.getSaturationWeight() * (1.0f - Math.abs(hsl[1] - target.getTargetSaturation())) : 0.0f;
        float abs = target.getLightnessWeight() > 0.0f ? (1.0f - Math.abs(hsl[2] - target.getTargetLightness())) * target.getLightnessWeight() : 0.0f;
        if (target.getPopulationWeight() > 0.0f) {
            f = target.getPopulationWeight() * (((float) swatch.getPopulation()) / ((float) this.mMaxPopulation));
        }
        return (saturationWeight + abs) + f;
    }

    private Swatch generateScoredTarget(Target target) {
        Swatch maxScoredSwatchForTarget = getMaxScoredSwatchForTarget(target);
        if (maxScoredSwatchForTarget != null && target.isExclusive()) {
            this.mUsedColors.append(maxScoredSwatchForTarget.getRgb(), true);
        }
        return maxScoredSwatchForTarget;
    }

    private Swatch getMaxScoredSwatchForTarget(Target target) {
        float f = 0.0f;
        Swatch swatch = null;
        int size = this.mSwatches.size();
        int i = 0;
        while (i < size) {
            float f2;
            Swatch swatch2 = (Swatch) this.mSwatches.get(i);
            if (shouldBeScoredForTarget(swatch2, target)) {
                float generateScore = generateScore(swatch2, target);
                if (swatch == null || generateScore > f) {
                    f2 = generateScore;
                    i++;
                    f = f2;
                    swatch = swatch2;
                }
            }
            swatch2 = swatch;
            f2 = f;
            i++;
            f = f2;
            swatch = swatch2;
        }
        return swatch;
    }

    private boolean shouldBeScoredForTarget(Swatch swatch, Target target) {
        float[] hsl = swatch.getHsl();
        return hsl[1] >= target.getMinimumSaturation() && hsl[1] <= target.getMaximumSaturation() && hsl[2] >= target.getMinimumLightness() && hsl[2] <= target.getMaximumLightness() && !this.mUsedColors.get(swatch.getRgb());
    }

    @ColorInt
    public int getColorForTarget(@NonNull Target target, @ColorInt int i) {
        Swatch swatchForTarget = getSwatchForTarget(target);
        return swatchForTarget != null ? swatchForTarget.getRgb() : i;
    }

    @ColorInt
    public int getDarkMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.DARK_MUTED, i);
    }

    @Nullable
    public Swatch getDarkMutedSwatch() {
        return getSwatchForTarget(Target.DARK_MUTED);
    }

    @ColorInt
    public int getDarkVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.DARK_VIBRANT, i);
    }

    @Nullable
    public Swatch getDarkVibrantSwatch() {
        return getSwatchForTarget(Target.DARK_VIBRANT);
    }

    @ColorInt
    public int getLightMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.LIGHT_MUTED, i);
    }

    @Nullable
    public Swatch getLightMutedSwatch() {
        return getSwatchForTarget(Target.LIGHT_MUTED);
    }

    @ColorInt
    public int getLightVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.LIGHT_VIBRANT, i);
    }

    @Nullable
    public Swatch getLightVibrantSwatch() {
        return getSwatchForTarget(Target.LIGHT_VIBRANT);
    }

    @ColorInt
    public int getMutedColor(@ColorInt int i) {
        return getColorForTarget(Target.MUTED, i);
    }

    @Nullable
    public Swatch getMutedSwatch() {
        return getSwatchForTarget(Target.MUTED);
    }

    @Nullable
    public Swatch getSwatchForTarget(@NonNull Target target) {
        return (Swatch) this.mSelectedSwatches.get(target);
    }

    @NonNull
    public List<Swatch> getSwatches() {
        return Collections.unmodifiableList(this.mSwatches);
    }

    @NonNull
    public List<Target> getTargets() {
        return Collections.unmodifiableList(this.mTargets);
    }

    @ColorInt
    public int getVibrantColor(@ColorInt int i) {
        return getColorForTarget(Target.VIBRANT, i);
    }

    @Nullable
    public Swatch getVibrantSwatch() {
        return getSwatchForTarget(Target.VIBRANT);
    }
}
