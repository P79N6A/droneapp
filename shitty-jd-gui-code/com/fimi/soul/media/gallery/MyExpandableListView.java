package com.fimi.soul.media.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

public class MyExpandableListView
  extends ExpandableListView
{
  private float a;
  private float b;
  private int c;
  
  public MyExpandableListView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public MyExpandableListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public MyExpandableListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    this.c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i)
    {
    }
    for (;;)
    {
      return false;
      this.a = f1;
      this.b = f2;
      continue;
      i = (int)(this.a - f1);
      int j = (int)(this.b - f2);
      if ((Math.abs(i) > this.c) && (Math.abs(j / i) < 1)) {}
      for (i = 1; i != 0; i = 0) {
        return true;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/gallery/MyExpandableListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */