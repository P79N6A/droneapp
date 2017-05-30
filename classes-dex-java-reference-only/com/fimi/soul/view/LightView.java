package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

public class LightView
  extends View
{
  Typeface a = null;
  private Paint b;
  private Paint c;
  private int d = 0;
  private int e = 0;
  private Context f;
  private Bitmap g;
  
  public LightView(Context paramContext)
  {
    super(paramContext);
    this.f = paramContext;
    a();
  }
  
  public LightView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f = paramContext;
    a();
  }
  
  void a()
  {
    this.b = new Paint();
    this.b.setColor(-1);
    this.b.setAlpha(80);
    this.b.setStrokeWidth(3.0F);
    this.b.setStyle(Paint.Style.FILL);
    this.b.setAntiAlias(true);
    this.b.setTextSize(25.0F);
    this.c = new Paint();
    this.c.setColor(getResources().getColor(2131623997));
    this.c.setStrokeWidth(3.0F);
    this.c.setTextSize(25.0F);
    this.c.setAntiAlias(true);
    this.c.setStyle(Paint.Style.FILL);
    if (this.a == null) {
      this.a = Typeface.createFromAsset(this.f.getAssets(), "DIN Alternate Bold.TTF");
    }
    this.c.setTypeface(this.a);
    this.b.setTypeface(this.a);
    this.g = BitmapFactory.decodeResource(getResources(), 2130838141);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    float f1 = this.f.getResources().getDimension(2131296429);
    float f2 = (getWidth() - this.f.getResources().getDimension(2131296416)) / 100.0F;
    float f3 = this.f.getResources().getDimension(2131296429);
    float f4 = getY();
    float f5 = this.f.getResources().getDimension(2131296422);
    float f6 = getWidth();
    float f7 = this.f.getResources().getDimension(2131296429);
    float f8 = getY();
    paramCanvas.drawLine(f3, f5 + f4, f6 - f7, this.f.getResources().getDimension(2131296422) + f8, this.b);
    f3 = getY();
    f4 = getY();
    paramCanvas.drawLine(f1 + 0.0F * f2, 8.0F + f3, f1 + 0.0F * f2, this.f.getResources().getDimension(2131296420) + f4, this.b);
    f3 = getY();
    f4 = getY();
    paramCanvas.drawLine(f1 + 100.0F * f2, 8.0F + f3, f1 + 100.0F * f2, this.f.getResources().getDimension(2131296420) + f4, this.b);
    if (this.e != 0) {
      paramCanvas.drawText("1%", f1 - this.b.getTextSize() / 2.0F, getY() + this.f.getResources().getDimension(2131296430), this.b);
    }
    if (this.e != 100) {
      paramCanvas.drawText("100%", 100.0F * f2 + f1 - this.b.getTextSize(), getY() + this.f.getResources().getDimension(2131296430), this.b);
    }
    paramCanvas.drawBitmap(this.g, this.d * f2 + f1 - this.c.getTextSize() / 2.0F, getY() + this.f.getResources().getDimension(2131296418), this.c);
    this.c.setColor(this.f.getResources().getColor(2131624064));
    paramCanvas.drawText(String.valueOf(this.e + "%"), this.d * f2 + f1 - this.b.getTextSize() / 2.0F, getY() + this.f.getResources().getDimension(2131296430), this.c);
  }
  
  public void setLightPercent(int paramInt)
  {
    if (Math.abs(paramInt) <= 0) {}
    for (int i = 1;; i = Math.abs(paramInt))
    {
      this.e = i;
      this.d = Math.abs(paramInt);
      invalidate();
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/LightView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */