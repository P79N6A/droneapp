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
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class Palette
{
  private static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
  private static final Filter DEFAULT_FILTER = new Filter()
  {
    private static final float BLACK_MAX_LIGHTNESS = 0.05F;
    private static final float WHITE_MIN_LIGHTNESS = 0.95F;
    
    private boolean isBlack(float[] paramAnonymousArrayOfFloat)
    {
      return paramAnonymousArrayOfFloat[2] <= 0.05F;
    }
    
    private boolean isNearRedILine(float[] paramAnonymousArrayOfFloat)
    {
      return (paramAnonymousArrayOfFloat[0] >= 10.0F) && (paramAnonymousArrayOfFloat[0] <= 37.0F) && (paramAnonymousArrayOfFloat[1] <= 0.82F);
    }
    
    private boolean isWhite(float[] paramAnonymousArrayOfFloat)
    {
      return paramAnonymousArrayOfFloat[2] >= 0.95F;
    }
    
    public boolean isAllowed(int paramAnonymousInt, float[] paramAnonymousArrayOfFloat)
    {
      return (!isWhite(paramAnonymousArrayOfFloat)) && (!isBlack(paramAnonymousArrayOfFloat)) && (!isNearRedILine(paramAnonymousArrayOfFloat));
    }
  };
  private static final int DEFAULT_RESIZE_BITMAP_AREA = 25600;
  private static final String LOG_TAG = "Palette";
  private static final boolean LOG_TIMINGS = false;
  private static final float MIN_CONTRAST_BODY_TEXT = 4.5F;
  private static final float MIN_CONTRAST_TITLE_TEXT = 3.0F;
  private final int mMaxPopulation;
  private final Map<Target, Swatch> mSelectedSwatches;
  private final List<Swatch> mSwatches;
  private final List<Target> mTargets;
  private final SparseBooleanArray mUsedColors;
  
  private Palette(List<Swatch> paramList, List<Target> paramList1)
  {
    this.mSwatches = paramList;
    this.mTargets = paramList1;
    this.mUsedColors = new SparseBooleanArray();
    this.mSelectedSwatches = new ArrayMap();
    this.mMaxPopulation = findMaxPopulation();
  }
  
  private static float[] copyHslValues(Swatch paramSwatch)
  {
    float[] arrayOfFloat = new float[3];
    System.arraycopy(paramSwatch.getHsl(), 0, arrayOfFloat, 0, 3);
    return arrayOfFloat;
  }
  
  private int findMaxPopulation()
  {
    int k = this.mSwatches.size();
    int i = 0;
    int j = 0;
    while (i < k)
    {
      j = Math.max(((Swatch)this.mSwatches.get(i)).getPopulation(), j);
      i += 1;
    }
    return j;
  }
  
  public static Builder from(Bitmap paramBitmap)
  {
    return new Builder(paramBitmap);
  }
  
  public static Palette from(List<Swatch> paramList)
  {
    return new Builder(paramList).generate();
  }
  
  @Deprecated
  public static Palette generate(Bitmap paramBitmap)
  {
    return from(paramBitmap).generate();
  }
  
  @Deprecated
  public static Palette generate(Bitmap paramBitmap, int paramInt)
  {
    return from(paramBitmap).maximumColorCount(paramInt).generate();
  }
  
  private void generate()
  {
    int j = this.mTargets.size();
    int i = 0;
    while (i < j)
    {
      Target localTarget = (Target)this.mTargets.get(i);
      localTarget.normalizeWeights();
      this.mSelectedSwatches.put(localTarget, generateScoredTarget(localTarget));
      i += 1;
    }
    this.mUsedColors.clear();
  }
  
  @Deprecated
  public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap paramBitmap, int paramInt, PaletteAsyncListener paramPaletteAsyncListener)
  {
    return from(paramBitmap).maximumColorCount(paramInt).generate(paramPaletteAsyncListener);
  }
  
  @Deprecated
  public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap paramBitmap, PaletteAsyncListener paramPaletteAsyncListener)
  {
    return from(paramBitmap).generate(paramPaletteAsyncListener);
  }
  
  private float generateScore(Swatch paramSwatch, Target paramTarget)
  {
    float f3 = 0.0F;
    float[] arrayOfFloat = paramSwatch.getHsl();
    if (paramTarget.getSaturationWeight() > 0.0F) {}
    for (float f1 = paramTarget.getSaturationWeight() * (1.0F - Math.abs(arrayOfFloat[1] - paramTarget.getTargetSaturation()));; f1 = 0.0F)
    {
      if (paramTarget.getLightnessWeight() > 0.0F) {
        f2 = paramTarget.getLightnessWeight();
      }
      for (float f2 = (1.0F - Math.abs(arrayOfFloat[2] - paramTarget.getTargetLightness())) * f2;; f2 = 0.0F)
      {
        if (paramTarget.getPopulationWeight() > 0.0F) {
          f3 = paramTarget.getPopulationWeight() * (paramSwatch.getPopulation() / this.mMaxPopulation);
        }
        return f1 + f2 + f3;
      }
    }
  }
  
  private Swatch generateScoredTarget(Target paramTarget)
  {
    Swatch localSwatch = getMaxScoredSwatchForTarget(paramTarget);
    if ((localSwatch != null) && (paramTarget.isExclusive())) {
      this.mUsedColors.append(localSwatch.getRgb(), true);
    }
    return localSwatch;
  }
  
  private Swatch getMaxScoredSwatchForTarget(Target paramTarget)
  {
    float f1 = 0.0F;
    Object localObject = null;
    int j = this.mSwatches.size();
    int i = 0;
    if (i < j)
    {
      Swatch localSwatch = (Swatch)this.mSwatches.get(i);
      if (!shouldBeScoredForTarget(localSwatch, paramTarget)) {
        break label89;
      }
      float f2 = generateScore(localSwatch, paramTarget);
      if ((localObject != null) && (f2 <= f1)) {
        break label89;
      }
      f1 = f2;
      localObject = localSwatch;
    }
    label89:
    for (;;)
    {
      i += 1;
      break;
      return (Swatch)localObject;
    }
  }
  
  private boolean shouldBeScoredForTarget(Swatch paramSwatch, Target paramTarget)
  {
    float[] arrayOfFloat = paramSwatch.getHsl();
    return (arrayOfFloat[1] >= paramTarget.getMinimumSaturation()) && (arrayOfFloat[1] <= paramTarget.getMaximumSaturation()) && (arrayOfFloat[2] >= paramTarget.getMinimumLightness()) && (arrayOfFloat[2] <= paramTarget.getMaximumLightness()) && (!this.mUsedColors.get(paramSwatch.getRgb()));
  }
  
  @ColorInt
  public int getColorForTarget(@NonNull Target paramTarget, @ColorInt int paramInt)
  {
    paramTarget = getSwatchForTarget(paramTarget);
    if (paramTarget != null) {
      paramInt = paramTarget.getRgb();
    }
    return paramInt;
  }
  
  @ColorInt
  public int getDarkMutedColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.DARK_MUTED, paramInt);
  }
  
  @Nullable
  public Swatch getDarkMutedSwatch()
  {
    return getSwatchForTarget(Target.DARK_MUTED);
  }
  
  @ColorInt
  public int getDarkVibrantColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.DARK_VIBRANT, paramInt);
  }
  
  @Nullable
  public Swatch getDarkVibrantSwatch()
  {
    return getSwatchForTarget(Target.DARK_VIBRANT);
  }
  
  @ColorInt
  public int getLightMutedColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.LIGHT_MUTED, paramInt);
  }
  
  @Nullable
  public Swatch getLightMutedSwatch()
  {
    return getSwatchForTarget(Target.LIGHT_MUTED);
  }
  
  @ColorInt
  public int getLightVibrantColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.LIGHT_VIBRANT, paramInt);
  }
  
  @Nullable
  public Swatch getLightVibrantSwatch()
  {
    return getSwatchForTarget(Target.LIGHT_VIBRANT);
  }
  
  @ColorInt
  public int getMutedColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.MUTED, paramInt);
  }
  
  @Nullable
  public Swatch getMutedSwatch()
  {
    return getSwatchForTarget(Target.MUTED);
  }
  
  @Nullable
  public Swatch getSwatchForTarget(@NonNull Target paramTarget)
  {
    return (Swatch)this.mSelectedSwatches.get(paramTarget);
  }
  
  @NonNull
  public List<Swatch> getSwatches()
  {
    return Collections.unmodifiableList(this.mSwatches);
  }
  
  @NonNull
  public List<Target> getTargets()
  {
    return Collections.unmodifiableList(this.mTargets);
  }
  
  @ColorInt
  public int getVibrantColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.VIBRANT, paramInt);
  }
  
  @Nullable
  public Swatch getVibrantSwatch()
  {
    return getSwatchForTarget(Target.VIBRANT);
  }
  
  public static final class Builder
  {
    private final Bitmap mBitmap;
    private final List<Palette.Filter> mFilters = new ArrayList();
    private int mMaxColors = 16;
    private Rect mRegion;
    private int mResizeArea = 25600;
    private int mResizeMaxDimension = -1;
    private final List<Palette.Swatch> mSwatches;
    private final List<Target> mTargets = new ArrayList();
    
    public Builder(Bitmap paramBitmap)
    {
      if ((paramBitmap == null) || (paramBitmap.isRecycled())) {
        throw new IllegalArgumentException("Bitmap is not valid");
      }
      this.mFilters.add(Palette.DEFAULT_FILTER);
      this.mBitmap = paramBitmap;
      this.mSwatches = null;
      this.mTargets.add(Target.LIGHT_VIBRANT);
      this.mTargets.add(Target.VIBRANT);
      this.mTargets.add(Target.DARK_VIBRANT);
      this.mTargets.add(Target.LIGHT_MUTED);
      this.mTargets.add(Target.MUTED);
      this.mTargets.add(Target.DARK_MUTED);
    }
    
    public Builder(List<Palette.Swatch> paramList)
    {
      if ((paramList == null) || (paramList.isEmpty())) {
        throw new IllegalArgumentException("List of Swatches is not valid");
      }
      this.mFilters.add(Palette.DEFAULT_FILTER);
      this.mSwatches = paramList;
      this.mBitmap = null;
    }
    
    private int[] getPixelsFromBitmap(Bitmap paramBitmap)
    {
      int i = 0;
      int j = paramBitmap.getWidth();
      int k = paramBitmap.getHeight();
      int[] arrayOfInt = new int[j * k];
      paramBitmap.getPixels(arrayOfInt, 0, j, 0, 0, j, k);
      if (this.mRegion == null) {
        return arrayOfInt;
      }
      k = this.mRegion.width();
      int m = this.mRegion.height();
      paramBitmap = new int[k * m];
      while (i < m)
      {
        System.arraycopy(arrayOfInt, (this.mRegion.top + i) * j + this.mRegion.left, paramBitmap, i * k, k);
        i += 1;
      }
      return paramBitmap;
    }
    
    private Bitmap scaleBitmapDown(Bitmap paramBitmap)
    {
      double d2 = -1.0D;
      int i;
      double d1;
      if (this.mResizeArea > 0)
      {
        i = paramBitmap.getWidth() * paramBitmap.getHeight();
        d1 = d2;
        if (i > this.mResizeArea) {
          d1 = this.mResizeArea / i;
        }
      }
      while (d1 <= 0.0D)
      {
        return paramBitmap;
        d1 = d2;
        if (this.mResizeMaxDimension > 0)
        {
          i = Math.max(paramBitmap.getWidth(), paramBitmap.getHeight());
          d1 = d2;
          if (i > this.mResizeMaxDimension) {
            d1 = this.mResizeMaxDimension / i;
          }
        }
      }
      return Bitmap.createScaledBitmap(paramBitmap, (int)Math.ceil(paramBitmap.getWidth() * d1), (int)Math.ceil(d1 * paramBitmap.getHeight()), false);
    }
    
    @NonNull
    public Builder addFilter(Palette.Filter paramFilter)
    {
      if (paramFilter != null) {
        this.mFilters.add(paramFilter);
      }
      return this;
    }
    
    @NonNull
    public Builder addTarget(@NonNull Target paramTarget)
    {
      if (!this.mTargets.contains(paramTarget)) {
        this.mTargets.add(paramTarget);
      }
      return this;
    }
    
    @NonNull
    public Builder clearFilters()
    {
      this.mFilters.clear();
      return this;
    }
    
    @NonNull
    public Builder clearRegion()
    {
      this.mRegion = null;
      return this;
    }
    
    @NonNull
    public Builder clearTargets()
    {
      if (this.mTargets != null) {
        this.mTargets.clear();
      }
      return this;
    }
    
    @NonNull
    public AsyncTask<Bitmap, Void, Palette> generate(final Palette.PaletteAsyncListener paramPaletteAsyncListener)
    {
      if (paramPaletteAsyncListener == null) {
        throw new IllegalArgumentException("listener can not be null");
      }
      AsyncTaskCompat.executeParallel(new AsyncTask()
      {
        protected Palette doInBackground(Bitmap... paramAnonymousVarArgs)
        {
          try
          {
            paramAnonymousVarArgs = Palette.Builder.this.generate();
            return paramAnonymousVarArgs;
          }
          catch (Exception paramAnonymousVarArgs)
          {
            Log.e("Palette", "Exception thrown during async generate", paramAnonymousVarArgs);
          }
          return null;
        }
        
        protected void onPostExecute(Palette paramAnonymousPalette)
        {
          paramPaletteAsyncListener.onGenerated(paramAnonymousPalette);
        }
      }, new Bitmap[] { this.mBitmap });
    }
    
    @NonNull
    public Palette generate()
    {
      Object localObject;
      if (this.mBitmap != null)
      {
        Bitmap localBitmap = scaleBitmapDown(this.mBitmap);
        if (0 != 0) {
          throw new NullPointerException();
        }
        localObject = this.mRegion;
        if ((localBitmap != this.mBitmap) && (localObject != null))
        {
          double d = localBitmap.getWidth() / this.mBitmap.getWidth();
          ((Rect)localObject).left = ((int)Math.floor(((Rect)localObject).left * d));
          ((Rect)localObject).top = ((int)Math.floor(((Rect)localObject).top * d));
          ((Rect)localObject).right = Math.min((int)Math.ceil(((Rect)localObject).right * d), localBitmap.getWidth());
          ((Rect)localObject).bottom = Math.min((int)Math.ceil(d * ((Rect)localObject).bottom), localBitmap.getHeight());
        }
        int[] arrayOfInt = getPixelsFromBitmap(localBitmap);
        int i = this.mMaxColors;
        if (this.mFilters.isEmpty())
        {
          localObject = null;
          localObject = new ColorCutQuantizer(arrayOfInt, i, (Palette.Filter[])localObject);
          if (localBitmap != this.mBitmap) {
            localBitmap.recycle();
          }
          localObject = ((ColorCutQuantizer)localObject).getQuantizedColors();
          if (0 != 0) {
            throw new NullPointerException();
          }
        }
      }
      for (;;)
      {
        localObject = new Palette((List)localObject, this.mTargets, null);
        ((Palette)localObject).generate();
        if (0 != 0) {
          throw new NullPointerException();
        }
        return (Palette)localObject;
        localObject = (Palette.Filter[])this.mFilters.toArray(new Palette.Filter[this.mFilters.size()]);
        break;
        localObject = this.mSwatches;
      }
    }
    
    @NonNull
    public Builder maximumColorCount(int paramInt)
    {
      this.mMaxColors = paramInt;
      return this;
    }
    
    @NonNull
    public Builder resizeBitmapArea(int paramInt)
    {
      this.mResizeArea = paramInt;
      this.mResizeMaxDimension = -1;
      return this;
    }
    
    @Deprecated
    @NonNull
    public Builder resizeBitmapSize(int paramInt)
    {
      this.mResizeMaxDimension = paramInt;
      this.mResizeArea = -1;
      return this;
    }
    
    @NonNull
    public Builder setRegion(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (this.mBitmap != null)
      {
        if (this.mRegion == null) {
          this.mRegion = new Rect();
        }
        this.mRegion.set(0, 0, this.mBitmap.getWidth(), this.mBitmap.getHeight());
        if (!this.mRegion.intersect(paramInt1, paramInt2, paramInt3, paramInt4)) {
          throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
        }
      }
      return this;
    }
  }
  
  public static abstract interface Filter
  {
    public abstract boolean isAllowed(int paramInt, float[] paramArrayOfFloat);
  }
  
  public static abstract interface PaletteAsyncListener
  {
    public abstract void onGenerated(Palette paramPalette);
  }
  
  public static final class Swatch
  {
    private final int mBlue;
    private int mBodyTextColor;
    private boolean mGeneratedTextColors;
    private final int mGreen;
    private float[] mHsl;
    private final int mPopulation;
    private final int mRed;
    private final int mRgb;
    private int mTitleTextColor;
    
    public Swatch(@ColorInt int paramInt1, int paramInt2)
    {
      this.mRed = Color.red(paramInt1);
      this.mGreen = Color.green(paramInt1);
      this.mBlue = Color.blue(paramInt1);
      this.mRgb = paramInt1;
      this.mPopulation = paramInt2;
    }
    
    Swatch(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this.mRed = paramInt1;
      this.mGreen = paramInt2;
      this.mBlue = paramInt3;
      this.mRgb = Color.rgb(paramInt1, paramInt2, paramInt3);
      this.mPopulation = paramInt4;
    }
    
    Swatch(float[] paramArrayOfFloat, int paramInt)
    {
      this(ColorUtils.HSLToColor(paramArrayOfFloat), paramInt);
      this.mHsl = paramArrayOfFloat;
    }
    
    private void ensureTextColorsGenerated()
    {
      int j;
      if (!this.mGeneratedTextColors)
      {
        i = ColorUtils.calculateMinimumAlpha(-1, this.mRgb, 4.5F);
        j = ColorUtils.calculateMinimumAlpha(-1, this.mRgb, 3.0F);
        if ((i != -1) && (j != -1))
        {
          this.mBodyTextColor = ColorUtils.setAlphaComponent(-1, i);
          this.mTitleTextColor = ColorUtils.setAlphaComponent(-1, j);
          this.mGeneratedTextColors = true;
        }
      }
      else
      {
        return;
      }
      int m = ColorUtils.calculateMinimumAlpha(-16777216, this.mRgb, 4.5F);
      int k = ColorUtils.calculateMinimumAlpha(-16777216, this.mRgb, 3.0F);
      if ((m != -1) && (m != -1))
      {
        this.mBodyTextColor = ColorUtils.setAlphaComponent(-16777216, m);
        this.mTitleTextColor = ColorUtils.setAlphaComponent(-16777216, k);
        this.mGeneratedTextColors = true;
        return;
      }
      if (i != -1)
      {
        i = ColorUtils.setAlphaComponent(-1, i);
        this.mBodyTextColor = i;
        if (j == -1) {
          break label176;
        }
      }
      label176:
      for (int i = ColorUtils.setAlphaComponent(-1, j);; i = ColorUtils.setAlphaComponent(-16777216, k))
      {
        this.mTitleTextColor = i;
        this.mGeneratedTextColors = true;
        return;
        i = ColorUtils.setAlphaComponent(-16777216, m);
        break;
      }
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if ((paramObject == null) || (getClass() != paramObject.getClass())) {
          return false;
        }
        paramObject = (Swatch)paramObject;
      } while ((this.mPopulation == ((Swatch)paramObject).mPopulation) && (this.mRgb == ((Swatch)paramObject).mRgb));
      return false;
    }
    
    @ColorInt
    public int getBodyTextColor()
    {
      ensureTextColorsGenerated();
      return this.mBodyTextColor;
    }
    
    public float[] getHsl()
    {
      if (this.mHsl == null) {
        this.mHsl = new float[3];
      }
      ColorUtils.RGBToHSL(this.mRed, this.mGreen, this.mBlue, this.mHsl);
      return this.mHsl;
    }
    
    public int getPopulation()
    {
      return this.mPopulation;
    }
    
    @ColorInt
    public int getRgb()
    {
      return this.mRgb;
    }
    
    @ColorInt
    public int getTitleTextColor()
    {
      ensureTextColorsGenerated();
      return this.mTitleTextColor;
    }
    
    public int hashCode()
    {
      return this.mRgb * 31 + this.mPopulation;
    }
    
    public String toString()
    {
      return getClass().getSimpleName() + " [RGB: #" + Integer.toHexString(getRgb()) + ']' + " [HSL: " + Arrays.toString(getHsl()) + ']' + " [Population: " + this.mPopulation + ']' + " [Title Text: #" + Integer.toHexString(getTitleTextColor()) + ']' + " [Body Text: #" + Integer.toHexString(getBodyTextColor()) + ']';
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/graphics/Palette.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */