package com.fimi.soul.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class HackyViewPager
  extends ViewPager
{
  private static final String a = "HackyViewPager";
  private boolean b = true;
  
  public HackyViewPager(Context paramContext)
  {
    super(paramContext);
  }
  
  public HackyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (IllegalArgumentException paramMotionEvent)
    {
      Log.e("HackyViewPager", "hacky viewpager error1");
      return false;
    }
    catch (ArrayIndexOutOfBoundsException paramMotionEvent)
    {
      Log.e("HackyViewPager", "hacky viewpager error2");
    }
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.b) {
      return false;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    if (!this.b) {
      return;
    }
    super.scrollTo(paramInt1, paramInt2);
  }
  
  public void setScrollble(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/HackyViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */