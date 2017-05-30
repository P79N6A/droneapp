package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class VerticalSeekBar
  extends View
{
  private int a = 1;
  private Bitmap b = BitmapFactory.decodeResource(getResources(), 2130837960);
  private Bitmap c = BitmapFactory.decodeResource(getResources(), 2130837961);
  private int d;
  private float e = 1.0F;
  
  public VerticalSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawBitmap(this.c, 0.0F, 0.0F, null);
    paramCanvas.drawBitmap(this.b, 0.0F, this.e, null);
    super.onDraw(paramCanvas);
  }
  
  public void setScale(int paramInt)
  {
    int i = 100;
    this.a = paramInt;
    this.d = (this.c.getHeight() - this.b.getHeight());
    if (this.a < 1)
    {
      this.a = 1;
      this.e = 1.0F;
      invalidate();
      return;
    }
    if (this.a > 100) {}
    for (paramInt = i;; paramInt = this.a)
    {
      this.e = (paramInt * this.d / 100);
      break;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/VerticalSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */