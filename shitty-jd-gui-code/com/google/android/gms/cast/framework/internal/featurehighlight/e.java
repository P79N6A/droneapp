package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.v4.graphics.ColorUtils;
import android.util.TypedValue;
import com.google.android.gms.R.color;
import com.google.android.gms.R.dimen;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.fm;

class e
  extends Drawable
{
  private final int a;
  private final int b;
  private final int c;
  private final Rect d = new Rect();
  private final Rect e = new Rect();
  private final Paint f = new Paint();
  private float g;
  private float h = 1.0F;
  private float i;
  private float j;
  private float k = 0.0F;
  private float l = 0.0F;
  private int m = 244;
  
  public e(Context paramContext)
  {
    if (s.k()) {
      a(a(paramContext));
    }
    for (;;)
    {
      this.f.setAntiAlias(true);
      this.f.setStyle(Paint.Style.FILL);
      paramContext = paramContext.getResources();
      this.a = paramContext.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_center_threshold);
      this.b = paramContext.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_center_horizontal_offset);
      this.c = paramContext.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_outer_padding);
      return;
      a(paramContext.getResources().getColor(R.color.cast_libraries_material_featurehighlight_outer_highlight_default_color));
    }
  }
  
  private float a(float paramFloat1, float paramFloat2, Rect paramRect)
  {
    return (float)Math.ceil(fm.a(paramFloat1, paramFloat2, paramRect.left, paramRect.top, paramRect.right, paramRect.bottom));
  }
  
  @TargetApi(21)
  private static int a(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(16843827, localTypedValue, true);
    return ColorUtils.setAlphaComponent(localTypedValue.data, 244);
  }
  
  @ColorInt
  public int a()
  {
    return this.f.getColor();
  }
  
  public void a(@ColorInt int paramInt)
  {
    this.f.setColor(paramInt);
    this.m = this.f.getAlpha();
    invalidateSelf();
  }
  
  public void a(Rect paramRect1, Rect paramRect2)
  {
    this.d.set(paramRect1);
    this.e.set(paramRect2);
    float f1 = paramRect1.exactCenterX();
    float f2 = paramRect1.exactCenterY();
    Rect localRect = getBounds();
    if (Math.min(f2 - localRect.top, localRect.bottom - f2) < this.a)
    {
      this.i = f1;
      this.j = f2;
      this.g = (this.c + Math.max(a(this.i, this.j, paramRect1), a(this.i, this.j, paramRect2)));
      invalidateSelf();
      return;
    }
    int n;
    if (f1 <= localRect.exactCenterX())
    {
      n = 1;
      label131:
      if (n == 0) {
        break label169;
      }
    }
    label169:
    for (f1 = paramRect2.exactCenterX() + this.b;; f1 = paramRect2.exactCenterX() - this.b)
    {
      this.i = f1;
      this.j = paramRect2.exactCenterY();
      break;
      n = 0;
      break label131;
    }
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    return fm.b(paramFloat1, paramFloat2, this.i, this.j) < this.g;
  }
  
  public float b()
  {
    return this.i;
  }
  
  public Animator b(float paramFloat1, float paramFloat2)
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("scale", new float[] { 0.0F, 1.0F }), PropertyValuesHolder.ofFloat("translationX", new float[] { paramFloat1, 0.0F }), PropertyValuesHolder.ofFloat("translationY", new float[] { paramFloat2, 0.0F }), PropertyValuesHolder.ofInt("alpha", new int[] { 0, this.m }) });
    localObjectAnimator.setInterpolator(fl.a());
    return localObjectAnimator.setDuration(350L);
  }
  
  public float c()
  {
    return this.j;
  }
  
  public Animator c(float paramFloat1, float paramFloat2)
  {
    Object localObject = PropertyValuesHolder.ofFloat("scale", new float[] { 0.0F });
    PropertyValuesHolder localPropertyValuesHolder = PropertyValuesHolder.ofInt("alpha", new int[] { 0 });
    localObject = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] { localObject, PropertyValuesHolder.ofFloat("translationX", new float[] { 0.0F, paramFloat1 }), PropertyValuesHolder.ofFloat("translationY", new float[] { 0.0F, paramFloat2 }), localPropertyValuesHolder });
    ((Animator)localObject).setInterpolator(fl.b());
    return ((Animator)localObject).setDuration(200L);
  }
  
  public Animator d()
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("scale", new float[] { 1.125F }), PropertyValuesHolder.ofInt("alpha", new int[] { 0 }) });
    localObjectAnimator.setInterpolator(fl.b());
    return localObjectAnimator.setDuration(200L);
  }
  
  public void draw(Canvas paramCanvas)
  {
    paramCanvas.drawCircle(this.i + 0.0F, this.j + 0.0F, this.g * this.h, this.f);
  }
  
  public int getAlpha()
  {
    return this.f.getAlpha();
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void setAlpha(int paramInt)
  {
    this.f.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.f.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/internal/featurehighlight/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */