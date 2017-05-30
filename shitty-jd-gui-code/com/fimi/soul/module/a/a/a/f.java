package com.fimi.soul.module.a.a.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class f
  extends View
{
  private static final int a = 6;
  private static final int b = 14;
  private static final int c = 52;
  private int d;
  private int e;
  
  public f(Context paramContext)
  {
    super(paramContext);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 != this.e)
    {
      this.e = paramInt1;
      postInvalidate();
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.d <= 1)
    {
      setVisibility(8);
      return;
    }
    float f3 = getHeight();
    float f1 = 6.0F * f3 / 52.0F;
    float f2 = 14.0F * f3 / 52.0F;
    float f4 = this.d;
    float f5 = this.d - 1;
    f4 = (getWidth() - (f1 * 2.0F * f4 + f5 * f2)) / 2.0F;
    f3 /= 2.0F;
    paramCanvas.drawColor(-1);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    int i = 0;
    label106:
    if (i < this.d)
    {
      if (i != this.e) {
        break label161;
      }
      localPaint.setColor(-10653280);
    }
    for (;;)
    {
      paramCanvas.drawCircle((f1 * 2.0F + f2) * i + f4, f3, f1, localPaint);
      i += 1;
      break label106;
      break;
      label161:
      localPaint.setColor(-5262921);
    }
  }
  
  public void setScreenCount(int paramInt)
  {
    this.d = paramInt;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */