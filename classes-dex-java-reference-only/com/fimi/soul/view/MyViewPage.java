package com.fimi.soul.view;

import android.content.Context;
import android.graphics.PointF;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import java.io.PrintStream;

public class MyViewPage
  extends ViewPager
{
  PointF a = new PointF();
  PointF b = new PointF();
  private float c;
  
  public MyViewPage(Context paramContext)
  {
    super(paramContext);
  }
  
  public MyViewPage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    System.out.println("MyViewPage2 onInterceptTouchEvent");
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.b.x = paramMotionEvent.getX();
    this.b.y = paramMotionEvent.getY();
    if (paramMotionEvent.getAction() == 0)
    {
      this.a.x = paramMotionEvent.getX();
      this.a.y = paramMotionEvent.getY();
      getParent().requestDisallowInterceptTouchEvent(true);
    }
    if (paramMotionEvent.getAction() == 2) {
      getParent().requestDisallowInterceptTouchEvent(true);
    }
    if ((paramMotionEvent.getAction() == 1) && (this.a.x == this.b.x) && (this.a.y == this.b.y)) {
      return true;
    }
    try
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (IllegalArgumentException paramMotionEvent)
    {
      paramMotionEvent.printStackTrace();
    }
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/MyViewPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */