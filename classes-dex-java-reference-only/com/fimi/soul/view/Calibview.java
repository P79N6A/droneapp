package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.fimi.soul.utils.g;

public class Calibview
  extends View
{
  Context a;
  RectF b;
  private float c;
  private int d = 10;
  private int e = 100;
  private int f = 60;
  private int g;
  private int h;
  private int i;
  private int j;
  
  public Calibview(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
  }
  
  public Calibview(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
    this.c = getResources().getDisplayMetrics().density;
    if (this.c == 1.5D)
    {
      this.e = g.a(paramContext, 65.0F);
      this.d = g.a(paramContext, 5.0F);
      this.f = g.a(paramContext, 40.0F);
    }
    do
    {
      return;
      if (this.c == 2.0F)
      {
        this.e = g.a(paramContext, 50.0F);
        this.d = g.a(paramContext, 5.0F);
        this.f = g.a(paramContext, 30.0F);
        return;
      }
    } while (this.c != 3.0F);
    this.e = g.a(paramContext, 33.0F);
    this.d = g.a(paramContext, 3.0F);
    this.f = g.a(paramContext, 20.0F);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramInt3;
    this.j = paramInt4;
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    Paint localPaint1 = new Paint();
    localPaint1.setStrokeWidth(3.0F);
    localPaint1.setStyle(Paint.Style.STROKE);
    localPaint1.setColor(-1);
    localPaint1.setAntiAlias(true);
    paramCanvas.drawCircle(this.e * this.c, this.e * this.c, this.f * this.c, localPaint1);
    localPaint1.setStyle(Paint.Style.FILL);
    paramCanvas.drawCircle(this.e * this.c, this.e * this.c, this.d * this.c, localPaint1);
    localPaint1.setStyle(Paint.Style.STROKE);
    localPaint1.setColor(-16777216);
    localPaint1.setStrokeWidth(3.0F);
    this.b = new RectF((this.e - this.f) * this.c, (this.e - this.d) * this.c, (this.e - this.d) * this.c, (this.e + this.d) * this.c);
    paramCanvas.drawRoundRect(this.b, this.c * 10.0F, this.c * 10.0F, localPaint1);
    this.b = new RectF((this.e - this.d) * this.c, (this.e - this.f) * this.c, (this.e + this.d) * this.c, (this.e - this.d) * this.c);
    paramCanvas.drawRoundRect(this.b, this.c * 10.0F, this.c * 10.0F, localPaint1);
    this.b = new RectF((this.e + this.d) * this.c, (this.e - this.d) * this.c, (this.e + this.f) * this.c, (this.e + this.d) * this.c);
    paramCanvas.drawRoundRect(this.b, this.c * 10.0F, this.c * 10.0F, localPaint1);
    this.b = new RectF((this.e - this.d) * this.c, (this.e + this.d) * this.c, (this.e + this.d) * this.c, (this.e + this.f) * this.c);
    paramCanvas.drawRoundRect(this.b, this.c * 10.0F, this.c * 10.0F, localPaint1);
    Paint localPaint2 = new Paint();
    localPaint2.setColor(-16777216);
    localPaint2.setTextSize(15.0F * this.c);
    localPaint2.setTextAlign(Paint.Align.CENTER);
    localPaint1.setStrokeWidth(1.0F);
    localPaint2.setAntiAlias(true);
    paramCanvas.drawText(this.h * 2 + "%", (this.e - this.f - 20) * this.c, (this.e + 2) * this.c, localPaint2);
    paramCanvas.drawText(this.g * 2 + "%", this.e * this.c, (this.e - this.f - 5) * this.c, localPaint2);
    paramCanvas.drawText(this.i * 2 + "%", (this.e + this.f + 20) * this.c, (this.e + 2) * this.c, localPaint2);
    paramCanvas.drawText(this.j * 2 + "%", this.e * this.c, (this.e + this.f + 15) * this.c, localPaint2);
    localPaint1.setStyle(Paint.Style.FILL);
    localPaint1.setColor(-16711936);
    this.b = new RectF((this.e - this.d - this.h) * this.c, (this.e - this.d) * this.c, (this.e - this.d) * this.c, (this.e + this.d) * this.c);
    paramCanvas.drawRoundRect(this.b, this.c * 10.0F, this.c * 10.0F, localPaint1);
    this.b = new RectF((this.e - this.d) * this.c, (this.e - this.d - this.g) * this.c, (this.e + this.d) * this.c, (this.e - this.d) * this.c);
    paramCanvas.drawRoundRect(this.b, this.c * 10.0F, this.c * 10.0F, localPaint1);
    this.b = new RectF((this.e + this.d) * this.c, (this.e - this.d) * this.c, (this.e + this.d + this.i) * this.c, (this.e + this.d) * this.c);
    paramCanvas.drawRoundRect(this.b, this.c * 10.0F, this.c * 10.0F, localPaint1);
    this.b = new RectF((this.e - this.d) * this.c, (this.e + this.d) * this.c, (this.e + this.d) * this.c, (this.e + this.d + this.j) * this.c);
    paramCanvas.drawRoundRect(this.b, this.c * 10.0F, this.c * 10.0F, localPaint1);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/Calibview.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */