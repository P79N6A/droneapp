package com.fimi.soul.view.photodraweeview;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.view.View.OnLongClickListener;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

public class PhotoDraweeView
  extends SimpleDraweeView
  implements c
{
  private a e;
  
  public PhotoDraweeView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public PhotoDraweeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public PhotoDraweeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  public PhotoDraweeView(Context paramContext, GenericDraweeHierarchy paramGenericDraweeHierarchy)
  {
    super(paramContext, paramGenericDraweeHierarchy);
    a();
  }
  
  protected void a()
  {
    if ((this.e == null) || (this.e.a() == null)) {
      this.e = new a(this);
    }
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    this.e.a(paramFloat1, paramFloat2, paramFloat3, paramBoolean);
  }
  
  public void a(float paramFloat, boolean paramBoolean)
  {
    this.e.a(paramFloat, paramBoolean);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.e.a(paramInt1, paramInt2);
  }
  
  public float getMaximumScale()
  {
    return this.e.getMaximumScale();
  }
  
  public float getMediumScale()
  {
    return this.e.getMediumScale();
  }
  
  public float getMinimumScale()
  {
    return this.e.getMinimumScale();
  }
  
  public d getOnPhotoTapListener()
  {
    return this.e.getOnPhotoTapListener();
  }
  
  public g getOnViewTapListener()
  {
    return this.e.getOnViewTapListener();
  }
  
  public float getScale()
  {
    return this.e.getScale();
  }
  
  protected void onAttachedToWindow()
  {
    a();
    super.onAttachedToWindow();
  }
  
  protected void onDetachedFromWindow()
  {
    this.e.g();
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(@NonNull Canvas paramCanvas)
  {
    int i = paramCanvas.save();
    paramCanvas.concat(this.e.b());
    super.onDraw(paramCanvas);
    paramCanvas.restoreToCount(i);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setAllowParentInterceptOnEdge(boolean paramBoolean)
  {
    this.e.setAllowParentInterceptOnEdge(paramBoolean);
  }
  
  public void setMaximumScale(float paramFloat)
  {
    this.e.setMaximumScale(paramFloat);
  }
  
  public void setMediumScale(float paramFloat)
  {
    this.e.setMediumScale(paramFloat);
  }
  
  public void setMinimumScale(float paramFloat)
  {
    this.e.setMinimumScale(paramFloat);
  }
  
  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.e.setOnDoubleTapListener(paramOnDoubleTapListener);
  }
  
  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.e.setOnLongClickListener(paramOnLongClickListener);
  }
  
  public void setOnPhotoTapListener(d paramd)
  {
    this.e.setOnPhotoTapListener(paramd);
  }
  
  public void setOnScaleChangeListener(e parame)
  {
    this.e.setOnScaleChangeListener(parame);
  }
  
  public void setOnViewTapListener(g paramg)
  {
    this.e.setOnViewTapListener(paramg);
  }
  
  public void setScale(float paramFloat)
  {
    this.e.setScale(paramFloat);
  }
  
  public void setZoomTransitionDuration(long paramLong)
  {
    this.e.setZoomTransitionDuration(paramLong);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/photodraweeview/PhotoDraweeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */