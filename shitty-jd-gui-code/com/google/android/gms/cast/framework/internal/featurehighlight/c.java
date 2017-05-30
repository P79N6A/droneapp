package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import com.google.android.gms.R.dimen;
import com.google.android.gms.R.integer;
import com.google.android.gms.internal.fj;
import com.google.android.gms.internal.fl;

class c
  extends Drawable
{
  private final Paint a = new Paint();
  private final Paint b = new Paint();
  private final Rect c = new Rect();
  private final int d;
  private final int e;
  private float f;
  private float g = 1.0F;
  private float h;
  private float i;
  
  public c(Context paramContext)
  {
    paramContext = paramContext.getResources();
    this.d = paramContext.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_inner_radius);
    this.e = paramContext.getInteger(R.integer.cast_libraries_material_featurehighlight_pulse_base_alpha);
    this.a.setAntiAlias(true);
    this.a.setStyle(Paint.Style.FILL);
    this.b.setAntiAlias(true);
    this.b.setStyle(Paint.Style.FILL);
    a(-1);
  }
  
  public Animator a()
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("scale", new float[] { 0.0F, 1.0F }), PropertyValuesHolder.ofFloat("alpha", new float[] { 0.0F, 1.0F }) });
    localObjectAnimator.setInterpolator(fl.a());
    return localObjectAnimator.setDuration(350L);
  }
  
  public void a(@ColorInt int paramInt)
  {
    this.a.setColor(paramInt);
    this.b.setColor(paramInt);
    invalidateSelf();
  }
  
  public void a(Rect paramRect)
  {
    this.c.set(paramRect);
    this.h = this.c.exactCenterX();
    this.i = this.c.exactCenterY();
    this.f = Math.max(this.d, Math.max(this.c.width() / 2.0F, this.c.height() / 2.0F));
    invalidateSelf();
  }
  
  public Animator b()
  {
    AnimatorSet localAnimatorSet = new AnimatorSet();
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this, "scale", new float[] { 1.0F, 1.1F }).setDuration(500L);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this, "scale", new float[] { 1.1F, 1.0F }).setDuration(500L);
    ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("pulseScale", new float[] { 1.1F, 2.0F }), PropertyValuesHolder.ofFloat("pulseAlpha", new float[] { 1.0F, 0.0F }) }).setDuration(500L);
    localAnimatorSet.play(localObjectAnimator1);
    localAnimatorSet.play(localObjectAnimator2).with(localObjectAnimator3).after(localObjectAnimator1);
    localAnimatorSet.setInterpolator(fl.c());
    localAnimatorSet.setStartDelay(500L);
    localAnimatorSet.addListener(fj.b(localAnimatorSet));
    return localAnimatorSet;
  }
  
  public Animator c()
  {
    return d();
  }
  
  public Animator d()
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("scale", new float[] { 0.0F }), PropertyValuesHolder.ofFloat("alpha", new float[] { 0.0F }), PropertyValuesHolder.ofFloat("pulseScale", new float[] { 0.0F }), PropertyValuesHolder.ofFloat("pulseAlpha", new float[] { 0.0F }) });
    localObjectAnimator.setInterpolator(fl.b());
    return localObjectAnimator.setDuration(200L);
  }
  
  public void draw(Canvas paramCanvas)
  {
    paramCanvas.drawCircle(this.h, this.i, this.f * this.g, this.a);
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void setAlpha(int paramInt)
  {
    this.a.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/internal/featurehighlight/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */