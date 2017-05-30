package com.fimi.soul.view.photodraweeview;

import android.graphics.RectF;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import com.facebook.drawee.view.DraweeView;

public class b
  implements GestureDetector.OnDoubleTapListener
{
  private a a;
  
  public b(a parama)
  {
    a(parama);
  }
  
  public void a(a parama)
  {
    this.a = parama;
  }
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if (this.a == null) {
      return false;
    }
    try
    {
      float f1 = this.a.getScale();
      float f2 = paramMotionEvent.getX();
      float f3 = paramMotionEvent.getY();
      if (f1 < this.a.getMediumScale())
      {
        this.a.a(this.a.getMediumScale(), f2, f3, true);
        return true;
      }
      if ((f1 >= this.a.getMediumScale()) && (f1 < this.a.getMaximumScale()))
      {
        this.a.a(this.a.getMaximumScale(), f2, f3, true);
        return true;
      }
      this.a.a(this.a.getMinimumScale(), f2, f3, true);
      return true;
    }
    catch (Exception paramMotionEvent) {}
    return true;
  }
  
  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    if (this.a == null) {}
    DraweeView localDraweeView;
    do
    {
      do
      {
        return false;
        localDraweeView = this.a.a();
      } while (localDraweeView == null);
      if (this.a.getOnPhotoTapListener() != null)
      {
        RectF localRectF = this.a.c();
        if (localRectF != null)
        {
          float f2 = paramMotionEvent.getX();
          float f1 = paramMotionEvent.getY();
          if (localRectF.contains(f2, f1))
          {
            f2 = (f2 - localRectF.left) / localRectF.width();
            f1 = (f1 - localRectF.top) / localRectF.height();
            this.a.getOnPhotoTapListener().a(localDraweeView, f2, f1);
            return true;
          }
        }
      }
    } while (this.a.getOnViewTapListener() == null);
    this.a.getOnViewTapListener().a(localDraweeView, paramMotionEvent.getX(), paramMotionEvent.getY());
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/photodraweeview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */