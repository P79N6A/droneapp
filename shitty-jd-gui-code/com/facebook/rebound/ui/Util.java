package com.facebook.rebound.ui;

import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.FrameLayout.LayoutParams;

public abstract class Util
{
  public static final FrameLayout.LayoutParams createLayoutParams(int paramInt1, int paramInt2)
  {
    return new FrameLayout.LayoutParams(paramInt1, paramInt2);
  }
  
  public static final FrameLayout.LayoutParams createMatchParams()
  {
    return createLayoutParams(-1, -1);
  }
  
  public static final FrameLayout.LayoutParams createMatchWrapParams()
  {
    return createLayoutParams(-1, -2);
  }
  
  public static final FrameLayout.LayoutParams createWrapMatchParams()
  {
    return createLayoutParams(-2, -1);
  }
  
  public static final FrameLayout.LayoutParams createWrapParams()
  {
    return createLayoutParams(-2, -2);
  }
  
  public static final int dpToPx(float paramFloat, Resources paramResources)
  {
    return (int)TypedValue.applyDimension(1, paramFloat, paramResources.getDisplayMetrics());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/ui/Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */