package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class BatteryView
  extends View
{
  Paint a = null;
  Paint b = null;
  Rect c = null;
  double d = 100.0D;
  int e;
  double f;
  double g;
  int h;
  int i;
  int j;
  int k;
  private int l = 100;
  private float m;
  
  public BatteryView(Context paramContext)
  {
    super(paramContext);
  }
  
  public BatteryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.m = getContext().getResources().getDisplayMetrics().density;
  }
  
  public void a(int paramInt, double paramDouble)
  {
    this.l = paramInt;
    if (this.d > 0.0D) {
      this.d = paramDouble;
    }
    if (this.l < 0) {
      this.l = 0;
    }
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    float f1 = (float)(this.l / this.d);
    float f2 = f1 * 360.0F;
    Paint localPaint = new Paint();
    localPaint.setColor(getResources().getColor(2131623952));
    localPaint.setAntiAlias(true);
    paramCanvas.drawCircle(this.m * 12.0F, this.m * 12.0F, this.m * 12.0F, localPaint);
    localPaint = new Paint();
    localPaint.setColor(getResources().getColor(2131623965));
    localPaint.setAntiAlias(true);
    paramCanvas.drawCircle(this.m * 12.0F, this.m * 12.0F, 11.0F * this.m, localPaint);
    localPaint = new Paint();
    if (f1 <= 0.25D) {
      localPaint.setColor(getResources().getColor(2131623958));
    }
    for (;;)
    {
      localPaint.setAntiAlias(true);
      paramCanvas.drawArc(new RectF(this.m * 3.0F, this.m * 3.0F, 21.0F * this.m, 21.0F * this.m), 270.0F - f2, f2, true, localPaint);
      return;
      if ((f1 > 0.25D) && (f1 <= 0.5D)) {
        localPaint.setColor(getResources().getColor(2131623957));
      } else if ((f1 > 0.5D) && (f1 <= 0.75D)) {
        localPaint.setColor(getResources().getColor(2131623960));
      } else {
        localPaint.setColor(getResources().getColor(2131623955));
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/BatteryView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */