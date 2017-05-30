package com.fimi.soul.view.photodraweeview;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class h
  implements ScaleGestureDetector.OnScaleGestureListener
{
  private static final int c = -1;
  float a;
  float b;
  private final float d;
  private final float e;
  private final ScaleGestureDetector f = new ScaleGestureDetector(paramContext, this);
  private final f g;
  private VelocityTracker h;
  private boolean i;
  private int j = -1;
  private int k = 0;
  
  public h(Context paramContext, f paramf)
  {
    this.g = paramf;
    paramContext = ViewConfiguration.get(paramContext);
    this.e = paramContext.getScaledMinimumFlingVelocity();
    this.d = paramContext.getScaledTouchSlop();
  }
  
  private void a(int paramInt, MotionEvent paramMotionEvent)
  {
    int m = 0;
    switch (paramInt)
    {
    }
    do
    {
      for (;;)
      {
        paramInt = m;
        if (this.j != -1) {
          paramInt = this.j;
        }
        this.k = MotionEventCompat.findPointerIndex(paramMotionEvent, paramInt);
        return;
        this.j = paramMotionEvent.getPointerId(0);
        continue;
        this.j = -1;
      }
      paramInt = MotionEventCompat.getActionIndex(paramMotionEvent);
    } while (MotionEventCompat.getPointerId(paramMotionEvent, paramInt) != this.j);
    if (paramInt == 0) {}
    for (paramInt = 1;; paramInt = 0)
    {
      this.j = MotionEventCompat.getPointerId(paramMotionEvent, paramInt);
      this.a = MotionEventCompat.getX(paramMotionEvent, paramInt);
      this.b = MotionEventCompat.getY(paramMotionEvent, paramInt);
      break;
    }
  }
  
  private float b(MotionEvent paramMotionEvent)
  {
    try
    {
      float f1 = MotionEventCompat.getX(paramMotionEvent, this.k);
      return f1;
    }
    catch (Exception localException) {}
    return paramMotionEvent.getX();
  }
  
  private void b(int paramInt, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    switch (paramInt)
    {
    }
    do
    {
      float f1;
      float f2;
      do
      {
        do
        {
          float f3;
          float f4;
          do
          {
            return;
            this.h = VelocityTracker.obtain();
            if (this.h != null) {
              this.h.addMovement(paramMotionEvent);
            }
            this.a = b(paramMotionEvent);
            this.b = c(paramMotionEvent);
            this.i = false;
            return;
            f1 = b(paramMotionEvent);
            f2 = c(paramMotionEvent);
            f3 = f1 - this.a;
            f4 = f2 - this.b;
            if (!this.i)
            {
              if (Math.sqrt(f3 * f3 + f4 * f4) >= this.d) {
                bool = true;
              }
              this.i = bool;
            }
          } while (!this.i);
          this.g.a(f3, f4);
          this.a = f1;
          this.b = f2;
        } while (this.h == null);
        this.h.addMovement(paramMotionEvent);
        return;
      } while (this.h == null);
      this.h.recycle();
      this.h = null;
      return;
      if ((this.i) && (this.h != null))
      {
        this.a = b(paramMotionEvent);
        this.b = c(paramMotionEvent);
        this.h.addMovement(paramMotionEvent);
        this.h.computeCurrentVelocity(1000);
        f1 = this.h.getXVelocity();
        f2 = this.h.getYVelocity();
        if (Math.max(Math.abs(f1), Math.abs(f2)) >= this.e) {
          this.g.a(this.a, this.b, -f1, -f2);
        }
      }
    } while (this.h == null);
    this.h.recycle();
    this.h = null;
  }
  
  private float c(MotionEvent paramMotionEvent)
  {
    try
    {
      float f1 = MotionEventCompat.getY(paramMotionEvent, this.k);
      return f1;
    }
    catch (Exception localException) {}
    return paramMotionEvent.getY();
  }
  
  public boolean a()
  {
    return this.f.isInProgress();
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    this.f.onTouchEvent(paramMotionEvent);
    int m = MotionEventCompat.getActionMasked(paramMotionEvent);
    a(m, paramMotionEvent);
    b(m, paramMotionEvent);
    return true;
  }
  
  public boolean b()
  {
    return this.i;
  }
  
  public boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    float f1 = paramScaleGestureDetector.getScaleFactor();
    if ((Float.isNaN(f1)) || (Float.isInfinite(f1))) {
      return false;
    }
    this.g.a(f1, paramScaleGestureDetector.getFocusX(), paramScaleGestureDetector.getFocusY());
    return true;
  }
  
  public boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    return true;
  }
  
  public void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector)
  {
    this.g.f();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/photodraweeview/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */