package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.R.id;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.fq;

public final class a
  extends ViewGroup
{
  private final int[] a = new int[2];
  private final Rect b = new Rect();
  private final Rect c = new Rect();
  private final e d;
  private final c e;
  private b f;
  private View g;
  @Nullable
  private View h;
  @Nullable
  private Animator i;
  private final d j;
  private final GestureDetectorCompat k;
  @Nullable
  private GestureDetectorCompat l;
  private a m;
  private boolean n;
  
  public a(Context paramContext)
  {
    super(paramContext);
    setId(R.id.cast_featurehighlight_view);
    setWillNotDraw(false);
    this.e = new c(paramContext);
    this.e.setCallback(this);
    this.d = new e(paramContext);
    this.d.setCallback(this);
    this.j = new d(this);
    this.k = new GestureDetectorCompat(paramContext, new GestureDetector.SimpleOnGestureListener()
    {
      public boolean onSingleTapUp(MotionEvent paramAnonymousMotionEvent)
      {
        float f1 = paramAnonymousMotionEvent.getX();
        float f2 = paramAnonymousMotionEvent.getY();
        if ((!a.a(a.this, f1, f2)) || (!a.a(a.this).a(f1, f2))) {
          a.b(a.this).b();
        }
        return true;
      }
    });
    this.k.setIsLongpressEnabled(false);
    setVisibility(8);
  }
  
  private void a(Animator paramAnimator)
  {
    if (this.i != null) {
      this.i.cancel();
    }
    this.i = paramAnimator;
    this.i.start();
  }
  
  private void a(int[] paramArrayOfInt, View paramView)
  {
    getLocationInWindow(paramArrayOfInt);
    int i1 = paramArrayOfInt[0];
    int i2 = paramArrayOfInt[1];
    paramView.getLocationInWindow(paramArrayOfInt);
    paramArrayOfInt[0] -= i1;
    paramArrayOfInt[1] -= i2;
  }
  
  private boolean a(float paramFloat1, float paramFloat2)
  {
    return this.c.contains(Math.round(paramFloat1), Math.round(paramFloat2));
  }
  
  private Animator d(@Nullable final Runnable paramRunnable)
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.f.asView(), "alpha", new float[] { 0.0F }).setDuration(200L);
    localObjectAnimator.setInterpolator(fl.b());
    Animator localAnimator1 = this.d.d();
    Animator localAnimator2 = this.e.c();
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator, localAnimator1, localAnimator2 });
    localAnimatorSet.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        a.this.setVisibility(8);
        a.a(a.this, null);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
      }
    });
    return localAnimatorSet;
  }
  
  private Animator e(@Nullable final Runnable paramRunnable)
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.f.asView(), "alpha", new float[] { 0.0F }).setDuration(200L);
    localObjectAnimator.setInterpolator(fl.b());
    float f1 = this.b.exactCenterX();
    float f2 = this.d.b();
    float f3 = this.b.exactCenterY();
    float f4 = this.d.c();
    Animator localAnimator1 = this.d.c(f1 - f2, f3 - f4);
    Animator localAnimator2 = this.e.d();
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator, localAnimator1, localAnimator2 });
    localAnimatorSet.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        a.this.setVisibility(8);
        a.a(a.this, null);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
      }
    });
    return localAnimatorSet;
  }
  
  private Animator f()
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.f.asView(), "alpha", new float[] { 0.0F, 1.0F }).setDuration(350L);
    localObjectAnimator.setInterpolator(fl.a());
    float f1 = this.b.exactCenterX();
    float f2 = this.d.b();
    float f3 = this.b.exactCenterY();
    float f4 = this.d.c();
    Animator localAnimator1 = this.d.b(f1 - f2, f3 - f4);
    Animator localAnimator2 = this.e.a();
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator, localAnimator1, localAnimator2 });
    localAnimatorSet.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        a.a(a.this, a.c(a.this));
        a.d(a.this).start();
      }
    });
    return localAnimatorSet;
  }
  
  private Animator g()
  {
    return this.e.b();
  }
  
  public void a()
  {
    if (this.g == null) {
      throw new IllegalStateException("Target view must be set before animation");
    }
    setVisibility(0);
    a(f());
  }
  
  public void a(@ColorInt int paramInt)
  {
    this.d.a(paramInt);
  }
  
  public void a(final View paramView1, @Nullable View paramView2, final boolean paramBoolean, final a parama)
  {
    this.g = ((View)fq.a(paramView1));
    this.h = paramView2;
    this.m = ((a)fq.a(parama));
    paramView1 = new GestureDetector.SimpleOnGestureListener()
    {
      public boolean onSingleTapUp(MotionEvent paramAnonymousMotionEvent)
      {
        if (paramView1.getParent() != null) {
          paramView1.performClick();
        }
        if (paramBoolean) {
          parama.a();
        }
        return true;
      }
    };
    this.l = new GestureDetectorCompat(getContext(), paramView1);
    this.l.setIsLongpressEnabled(false);
    setVisibility(4);
  }
  
  public void a(b paramb)
  {
    this.f = ((b)fq.a(paramb));
    addView(paramb.asView(), 0);
  }
  
  public void a(@Nullable final Runnable paramRunnable)
  {
    addOnLayoutChangeListener(new View.OnLayoutChangeListener()
    {
      public void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
      {
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        a.this.a();
        a.this.removeOnLayoutChangeListener(this);
      }
    });
  }
  
  @Nullable
  Drawable b()
  {
    return null;
  }
  
  public void b(@Nullable Runnable paramRunnable)
  {
    a(e(paramRunnable));
  }
  
  View c()
  {
    return this.f.asView();
  }
  
  public void c(@Nullable Runnable paramRunnable)
  {
    a(d(paramRunnable));
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
  }
  
  e d()
  {
    return this.d;
  }
  
  c e()
  {
    return this.e;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-2, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new ViewGroup.MarginLayoutParams(paramLayoutParams);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.save();
    if (this.h != null) {
      paramCanvas.clipRect(this.c);
    }
    this.d.draw(paramCanvas);
    this.e.draw(paramCanvas);
    if (this.g != null)
    {
      if (this.g.getParent() != null)
      {
        Bitmap localBitmap = Bitmap.createBitmap(this.g.getWidth(), this.g.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas(localBitmap);
        this.g.draw(localCanvas);
        int i1 = this.d.a();
        int i3 = Color.red(i1);
        int i4 = Color.green(i1);
        int i5 = Color.blue(i1);
        i1 = 0;
        while (i1 < localBitmap.getHeight())
        {
          int i2 = 0;
          while (i2 < localBitmap.getWidth())
          {
            int i6 = localBitmap.getPixel(i2, i1);
            if (Color.alpha(i6) != 0) {
              localBitmap.setPixel(i2, i1, Color.argb(Color.alpha(i6), i3, i4, i5));
            }
            i2 += 1;
          }
          i1 += 1;
        }
        paramCanvas.drawBitmap(localBitmap, this.b.left, this.b.top, null);
      }
      paramCanvas.restore();
      return;
    }
    throw new IllegalStateException("Neither target view nor drawable was set");
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.g == null) {
      throw new IllegalStateException("Target view must be set before layout");
    }
    if (this.g.getParent() != null) {
      a(this.a, this.g);
    }
    this.b.set(this.a[0], this.a[1], this.a[0] + this.g.getWidth(), this.a[1] + this.g.getHeight());
    if (this.h != null)
    {
      a(this.a, this.h);
      this.c.set(this.a[0], this.a[1], this.a[0] + this.h.getMeasuredWidth(), this.a[1] + this.h.getMeasuredHeight());
    }
    for (;;)
    {
      this.d.setBounds(this.c);
      this.e.setBounds(this.c);
      this.j.a(this.b, this.c);
      return;
      this.c.set(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    setMeasuredDimension(resolveSize(i1, paramInt1), resolveSize(i2, paramInt2));
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 == 0) {
      this.n = this.b.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
    if (this.n)
    {
      MotionEvent localMotionEvent = paramMotionEvent;
      if (this.l != null)
      {
        this.l.onTouchEvent(paramMotionEvent);
        localMotionEvent = paramMotionEvent;
        if (i1 == 1)
        {
          localMotionEvent = MotionEvent.obtain(paramMotionEvent);
          localMotionEvent.setAction(3);
        }
      }
      if (this.g.getParent() != null) {
        this.g.onTouchEvent(localMotionEvent);
      }
      return true;
    }
    this.k.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.d) || (paramDrawable == this.e) || (paramDrawable == null);
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/internal/featurehighlight/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */