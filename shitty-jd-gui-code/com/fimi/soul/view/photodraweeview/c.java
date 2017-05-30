package com.fimi.soul.view.photodraweeview;

import android.view.GestureDetector.OnDoubleTapListener;
import android.view.View.OnLongClickListener;

public abstract interface c
{
  public static final float a = 3.0F;
  public static final float b = 1.75F;
  public static final float c = 1.0F;
  public static final long d = 200L;
  
  public abstract void a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean);
  
  public abstract void a(float paramFloat, boolean paramBoolean);
  
  public abstract void a(int paramInt1, int paramInt2);
  
  public abstract float getMaximumScale();
  
  public abstract float getMediumScale();
  
  public abstract float getMinimumScale();
  
  public abstract d getOnPhotoTapListener();
  
  public abstract g getOnViewTapListener();
  
  public abstract float getScale();
  
  public abstract void setAllowParentInterceptOnEdge(boolean paramBoolean);
  
  public abstract void setMaximumScale(float paramFloat);
  
  public abstract void setMediumScale(float paramFloat);
  
  public abstract void setMinimumScale(float paramFloat);
  
  public abstract void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener);
  
  public abstract void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener);
  
  public abstract void setOnPhotoTapListener(d paramd);
  
  public abstract void setOnScaleChangeListener(e parame);
  
  public abstract void setOnViewTapListener(g paramg);
  
  public abstract void setScale(float paramFloat);
  
  public abstract void setZoomTransitionDuration(long paramLong);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/photodraweeview/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */