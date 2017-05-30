package com.fimi.kernel.view.progress;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;

public class ProgressView
  extends View
{
  private static final int[] a = { -16711936, 65280, -65536 };
  private float b;
  private float c;
  private Paint d;
  private int e;
  private int f;
  private int g = 0;
  private int h = 0;
  
  public ProgressView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public ProgressView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public ProgressView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private int a(int paramInt)
  {
    float f1 = getContext().getResources().getDisplayMetrics().density;
    float f2 = paramInt;
    if (paramInt >= 0) {}
    for (paramInt = 1;; paramInt = -1) {
      return (int)(paramInt * 0.5F + f2 * f1);
    }
  }
  
  private void a(Context paramContext) {}
  
  public float getCurrentCount()
  {
    return this.c;
  }
  
  public float getMaxCount()
  {
    return this.b;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.d = new Paint();
    this.d.setAntiAlias(true);
    int i = this.f / 2;
    RectF localRectF;
    if (this.h == 0)
    {
      this.d.setColor(771751935);
      paramCanvas.drawRoundRect(new RectF(0.0F, 0.0F, this.e, this.f), i, i, this.d);
      localRectF = new RectF(0.0F, 0.0F, this.c / this.b * this.e, this.f);
      if (this.g != 0) {
        break label152;
      }
      this.d.setColor(1895825407);
    }
    for (;;)
    {
      paramCanvas.drawRoundRect(localRectF, i, i, this.d);
      return;
      this.d.setColor(this.h);
      break;
      label152:
      this.d.setColor(this.g);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if ((i == 1073741824) || (i == Integer.MIN_VALUE))
    {
      this.e = paramInt1;
      if ((j != Integer.MIN_VALUE) && (j != 0)) {
        break label81;
      }
    }
    label81:
    for (this.f = a(15);; this.f = paramInt2)
    {
      setMeasuredDimension(this.e, this.f);
      return;
      this.e = 0;
      break;
    }
  }
  
  public void setBackColor(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void setCurrentCount(float paramFloat)
  {
    float f1 = paramFloat;
    if (paramFloat > this.b) {
      f1 = this.b;
    }
    this.c = f1;
    invalidate();
  }
  
  public void setFrontColor(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void setMaxCount(float paramFloat)
  {
    this.b = paramFloat;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/view/progress/ProgressView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */