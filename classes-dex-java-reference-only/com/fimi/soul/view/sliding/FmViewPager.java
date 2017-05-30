package com.fimi.soul.view.sliding;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class FmViewPager
  extends ViewPager
{
  private boolean a = true;
  
  public FmViewPager(Context paramContext)
  {
    super(paramContext);
  }
  
  public FmViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a) {
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a) {
      return super.onTouchEvent(paramMotionEvent);
    }
    return false;
  }
  
  public void setPagingEnabled(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/sliding/FmViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */