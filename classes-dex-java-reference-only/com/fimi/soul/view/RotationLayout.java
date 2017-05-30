package com.fimi.soul.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

@SuppressLint({"Instantiatable"})
class RotationLayout
  extends FrameLayout
{
  private int a;
  
  public RotationLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public RotationLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public RotationLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(int paramInt)
  {
    this.a = ((paramInt + 360) % 360 / 90);
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    if (this.a == 0)
    {
      super.dispatchDraw(paramCanvas);
      return;
    }
    if (this.a == 1)
    {
      paramCanvas.translate(getWidth(), 0.0F);
      paramCanvas.rotate(90.0F, getWidth() / 2, 0.0F);
      paramCanvas.translate(getHeight() / 2, getWidth() / 2);
    }
    for (;;)
    {
      super.dispatchDraw(paramCanvas);
      return;
      if (this.a == 2)
      {
        paramCanvas.rotate(180.0F, getWidth() / 2, getHeight() / 2);
      }
      else
      {
        paramCanvas.translate(0.0F, getHeight());
        paramCanvas.rotate(270.0F, getWidth() / 2, 0.0F);
        paramCanvas.translate(getHeight() / 2, -getWidth() / 2);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.a == 1) || (this.a == 3))
    {
      super.onMeasure(paramInt1, paramInt2);
      setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/RotationLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */