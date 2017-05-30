package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.h;
import com.google.android.gms.maps.model.g;

public class MapWrapperLayout
  extends RelativeLayout
{
  private c a;
  private int b;
  private g c;
  private View d;
  
  public MapWrapperLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public MapWrapperLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MapWrapperLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(c paramc, int paramInt)
  {
    this.a = paramc;
    this.b = paramInt;
  }
  
  public void a(g paramg, View paramView)
  {
    this.c = paramg;
    this.d = paramView;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    MotionEvent localMotionEvent;
    if ((this.c != null) && (this.c.j()) && (this.a != null) && (this.d != null))
    {
      Point localPoint = this.a.n().a(this.c.c());
      localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      localMotionEvent.offsetLocation(-localPoint.x + this.d.getWidth() / 3, -localPoint.y + this.d.getHeight() + this.b);
    }
    for (boolean bool1 = this.d.dispatchTouchEvent(localMotionEvent);; bool1 = false)
    {
      if (!bool1)
      {
        bool1 = bool2;
        if (!super.dispatchTouchEvent(paramMotionEvent)) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/MapWrapperLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */