package com.fimi.soul.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;

public class GridV
  extends GridView
{
  public GridV(Context paramContext)
  {
    super(paramContext);
  }
  
  public GridV(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public GridV(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 2) {
      return true;
    }
    return super.dispatchTouchEvent(paramMotionEvent);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/GridV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */