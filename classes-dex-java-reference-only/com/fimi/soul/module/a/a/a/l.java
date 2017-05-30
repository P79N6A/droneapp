package com.fimi.soul.module.a.a.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class l
  extends View
{
  private float a;
  
  public l(Context paramContext)
  {
    super(paramContext);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i = getWidth() / 2;
    int j = getHeight() / 2;
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setColor(-6250336);
    paramCanvas.drawRect(i, 0.0F, getWidth(), j, localPaint);
    localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setStrokeWidth(3.0F * this.a);
    localPaint.setColor(-1);
    float f = 8.0F * this.a;
    paramCanvas.drawLine(i + f, f, getWidth() - f, i - f, localPaint);
    paramCanvas.drawLine(i + f, i - f, getWidth() - f, f, localPaint);
  }
  
  public void setRatio(float paramFloat)
  {
    this.a = paramFloat;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */