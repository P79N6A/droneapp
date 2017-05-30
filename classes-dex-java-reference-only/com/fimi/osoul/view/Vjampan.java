package com.fimi.osoul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class Vjampan
  extends View
{
  int a = this.f.getHeight();
  int b = this.f.getWidth();
  float c = getResources().getDisplayMetrics().density;
  private int d = 0;
  private Bitmap e;
  private Bitmap f = BitmapFactory.decodeResource(getResources(), 2130838235);
  private int g;
  private float h = 1.0F;
  
  public Vjampan(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawBitmap(this.f, 0.0F, 0.0F, null);
    Paint localPaint = new Paint();
    localPaint.setColor(65280);
    localPaint.setStyle(Paint.Style.FILL);
    localPaint.setAlpha(100);
    if (this.d >= this.a / 2) {
      paramCanvas.drawRoundRect(new RectF(0.0F, this.a - this.d, this.b, this.a / 2), 20.0F, 20.0F, localPaint);
    }
    for (;;)
    {
      super.onDraw(paramCanvas);
      return;
      if ((this.d >= 0) && (this.d < this.a / 2)) {
        paramCanvas.drawRoundRect(new RectF(0.0F, this.a / 2, this.b, this.a - this.d), 20.0F, 20.0F, localPaint);
      }
    }
  }
  
  public void setScale(int paramInt)
  {
    if (this.c == 1.5D) {
      this.d = (paramInt * 2);
    }
    for (;;)
    {
      invalidate();
      return;
      if (this.c == 2.0F) {
        this.d = (paramInt * 3);
      } else if (this.c == 3.0F) {
        this.d = ((int)(paramInt * 4.5D));
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/osoul/view/Vjampan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */