package com.fimi.soul.view.myhorizontalseebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fimi.overseas.soul.R.styleable;

public abstract class AbsSeekBar
  extends ProgressBar
{
  private static final int q = 255;
  float a;
  boolean b = true;
  private Drawable n;
  private int o;
  private int p = 1;
  private float r;
  private int s;
  private float t;
  private boolean u;
  
  public AbsSeekBar(Context paramContext)
  {
    super(paramContext);
  }
  
  public AbsSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AbsSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.SeekBar, paramInt, 0);
    setThumb(localTypedArray.getDrawable(0));
    setThumbOffset(localTypedArray.getDimensionPixelOffset(1, getThumbOffset()));
    localTypedArray.recycle();
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Theme, 0, 0);
    this.r = paramAttributeSet.getFloat(0, 0.5F);
    paramAttributeSet.recycle();
    this.s = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    Drawable localDrawable1 = getCurrentDrawable();
    Drawable localDrawable2 = this.n;
    int i;
    int j;
    float f;
    if (localDrawable2 == null)
    {
      i = 0;
      j = Math.min(this.f, paramInt2 - this.l - this.m);
      int k = getMax();
      if (k <= 0) {
        break label140;
      }
      f = getProgress() / k;
      label61:
      if (i <= j) {
        break label145;
      }
      if (localDrawable2 != null) {
        a(paramInt1, localDrawable2, f, 0);
      }
      i = (i - j) / 2;
      if (localDrawable1 != null) {
        localDrawable1.setBounds(0, i, paramInt1 - this.k - this.j, paramInt2 - this.m - i - this.l);
      }
    }
    label140:
    label145:
    do
    {
      return;
      i = localDrawable2.getIntrinsicHeight();
      break;
      f = 0.0F;
      break label61;
      if (localDrawable1 != null) {
        localDrawable1.setBounds(0, 0, paramInt1 - this.k - this.j, paramInt2 - this.m - this.l);
      }
      paramInt2 = (j - i) / 2;
    } while (localDrawable2 == null);
    a(paramInt1, localDrawable2, f, paramInt2);
  }
  
  private void a(int paramInt1, Drawable paramDrawable, float paramFloat, int paramInt2)
  {
    int j = this.j;
    int m = this.k;
    int i = paramDrawable.getIntrinsicWidth();
    int k = paramDrawable.getIntrinsicHeight();
    j = (int)((paramInt1 - j - m - i + this.o * 2) * paramFloat);
    Rect localRect;
    if (paramInt2 == Integer.MIN_VALUE)
    {
      localRect = paramDrawable.getBounds();
      paramInt2 = localRect.top;
    }
    for (paramInt1 = localRect.bottom;; paramInt1 = paramInt2 + k)
    {
      paramDrawable.setBounds(j, paramInt2, i + j, paramInt1);
      return;
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    float f2 = 0.0F;
    int i = getWidth();
    int j = this.j;
    int k = this.k;
    int m = (int)paramMotionEvent.getX();
    float f1;
    if (m < this.j) {
      f1 = 0.0F;
    }
    for (;;)
    {
      a((int)(f2 + f1 * getMax()), true);
      return;
      if (m > i - this.k)
      {
        f1 = 1.0F;
      }
      else
      {
        f1 = (m - this.j) / (i - j - k);
        f2 = this.a;
      }
    }
  }
  
  private void g() {}
  
  void a()
  {
    this.u = true;
  }
  
  void a(float paramFloat, boolean paramBoolean)
  {
    super.a(paramFloat, paramBoolean);
    Drawable localDrawable = this.n;
    if (localDrawable != null)
    {
      a(getWidth(), localDrawable, paramFloat, Integer.MIN_VALUE);
      invalidate();
    }
  }
  
  public void a(int paramInt)
  {
    super.a(paramInt);
  }
  
  void b()
  {
    this.u = false;
  }
  
  void c() {}
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = getProgressDrawable();
    if (localObject != null) {
      if (!isEnabled()) {
        break label61;
      }
    }
    label61:
    for (int i = 255;; i = (int)(255.0F * this.r))
    {
      ((Drawable)localObject).setAlpha(i);
      if ((this.n != null) && (this.n.isStateful()))
      {
        localObject = getDrawableState();
        this.n.setState((int[])localObject);
      }
      return;
    }
  }
  
  public int getKeyProgressIncrement()
  {
    return this.p;
  }
  
  public Drawable getThumb()
  {
    return this.n;
  }
  
  public int getThumbOffset()
  {
    return this.o;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.n != null) {
      this.n.jumpToCurrentState();
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      if (this.n != null)
      {
        paramCanvas.save();
        paramCanvas.translate(this.j - this.o, this.l);
        this.n.draw(paramCanvas);
        paramCanvas.restore();
      }
      return;
    }
    finally
    {
      paramCanvas = finally;
      throw paramCanvas;
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(AbsSeekBar.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(AbsSeekBar.class.getName());
    if (isEnabled())
    {
      int i = getProgress();
      if (i > 0) {
        paramAccessibilityNodeInfo.addAction(8192);
      }
      if (i < getMax()) {
        paramAccessibilityNodeInfo.addAction(4096);
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i;
    if (isEnabled())
    {
      i = getProgress();
      switch (paramInt)
      {
      }
    }
    do
    {
      do
      {
        return super.onKeyDown(paramInt, paramKeyEvent);
      } while (i <= 0);
      a(i - this.p, true);
      c();
      return true;
    } while (i >= getMax());
    a(i + this.p, true);
    c();
    return true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 0;
    for (;;)
    {
      int k;
      try
      {
        Drawable localDrawable = getCurrentDrawable();
        if (this.n == null)
        {
          i = 0;
          if (localDrawable != null)
          {
            j = Math.max(this.c, Math.min(this.d, localDrawable.getIntrinsicWidth()));
            i = Math.max(i, Math.max(this.e, Math.min(this.f, localDrawable.getIntrinsicHeight())));
            k = this.j;
            int m = this.k;
            int i1 = this.l;
            int i2 = this.m;
            setMeasuredDimension(resolveSizeAndState(j + (k + m), paramInt1, 0), resolveSizeAndState(i + (i1 + i2), paramInt2, 0));
          }
        }
        else
        {
          i = this.n.getIntrinsicHeight();
          continue;
        }
        k = 0;
      }
      finally {}
      int i = j;
      j = k;
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    super.onRtlPropertiesChanged(paramInt);
    paramInt = getMax();
    if (paramInt > 0) {}
    for (float f = getProgress() / paramInt;; f = 0.0F)
    {
      Drawable localDrawable = this.n;
      if (localDrawable != null)
      {
        a(getWidth(), localDrawable, f, Integer.MIN_VALUE);
        invalidate();
      }
      return;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a(paramInt1, paramInt2);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    if ((!this.b) || (!isEnabled())) {
      bool = false;
    }
    do
    {
      return bool;
      switch (paramMotionEvent.getAction())
      {
      default: 
        return true;
      case 0: 
        setPressed(true);
        if (this.n != null) {
          invalidate(this.n.getBounds());
        }
        a();
        a(paramMotionEvent);
        g();
        return true;
      case 2: 
        if (this.u)
        {
          a(paramMotionEvent);
          return true;
        }
        break;
      }
    } while (Math.abs(paramMotionEvent.getX() - this.t) <= this.s);
    setPressed(true);
    if (this.n != null) {
      invalidate(this.n.getBounds());
    }
    a();
    a(paramMotionEvent);
    g();
    return true;
    if (this.u)
    {
      a(paramMotionEvent);
      b();
      setPressed(false);
    }
    for (;;)
    {
      invalidate();
      return true;
      a();
      a(paramMotionEvent);
      b();
    }
    if (this.u)
    {
      b();
      setPressed(false);
    }
    invalidate();
    return true;
  }
  
  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    if (super.performAccessibilityAction(paramInt, paramBundle)) {
      return true;
    }
    if (!isEnabled()) {
      return false;
    }
    int i = getProgress();
    int j = Math.max(1, Math.round(getMax() / 5.0F));
    switch (paramInt)
    {
    default: 
      return false;
    case 8192: 
      if (i <= 0) {
        return false;
      }
      a(i - j, true);
      c();
      return true;
    }
    if (i >= getMax()) {
      return false;
    }
    a(i + j, true);
    c();
    return true;
  }
  
  public void setKeyProgressIncrement(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = -paramInt;
    }
    this.p = i;
  }
  
  public void setMax(int paramInt)
  {
    try
    {
      super.setMax(paramInt);
      if ((this.p == 0) || (getMax() / this.p > 20)) {
        setKeyProgressIncrement(Math.max(1, Math.round(getMax() / 20.0F)));
      }
      return;
    }
    finally {}
  }
  
  public void setThumb(Drawable paramDrawable)
  {
    if ((this.n != null) && (paramDrawable != this.n)) {
      this.n.setCallback(null);
    }
    for (int i = 1;; i = 0)
    {
      if (paramDrawable != null)
      {
        paramDrawable.setCallback(this);
        this.o = (paramDrawable.getIntrinsicWidth() / 2);
        if ((i != 0) && ((paramDrawable.getIntrinsicWidth() != this.n.getIntrinsicWidth()) || (paramDrawable.getIntrinsicHeight() != this.n.getIntrinsicHeight()))) {
          requestLayout();
        }
      }
      this.n = paramDrawable;
      invalidate();
      if (i != 0)
      {
        a(getWidth(), getHeight());
        if ((paramDrawable != null) && (paramDrawable.isStateful())) {
          paramDrawable.setState(getDrawableState());
        }
      }
      return;
    }
  }
  
  public void setThumbOffset(int paramInt)
  {
    this.o = paramInt;
    invalidate();
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (paramDrawable == this.n) || (super.verifyDrawable(paramDrawable));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/myhorizontalseebar/AbsSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */