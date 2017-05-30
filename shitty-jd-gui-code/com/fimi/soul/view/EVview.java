package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.soul.biz.e.d;

public class EVview
  extends View
{
  boolean a = false;
  private Paint b;
  private Paint c;
  private Paint d;
  private int e = 6;
  private float f = 0.0F;
  private Context g;
  private Typeface h;
  
  public EVview(Context paramContext)
  {
    super(paramContext);
    this.g = paramContext;
    this.a = d.a().k();
    a();
  }
  
  public EVview(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.g = paramContext;
    this.a = d.a().k();
    a();
  }
  
  private void b(float paramFloat)
  {
    if (paramFloat == -2.0F) {
      this.e = 0;
    }
    do
    {
      return;
      if (paramFloat == -1.7F)
      {
        this.e = 1;
        return;
      }
      if (paramFloat == -1.3F)
      {
        this.e = 2;
        return;
      }
      if (paramFloat == -1.0F)
      {
        this.e = 3;
        return;
      }
      if (paramFloat == -0.7F)
      {
        this.e = 4;
        return;
      }
      if (paramFloat == -0.3F)
      {
        this.e = 5;
        return;
      }
      if (paramFloat == 0.0F)
      {
        this.e = 6;
        return;
      }
      if (paramFloat == 0.3F)
      {
        this.e = 7;
        return;
      }
      if (paramFloat == 0.7F)
      {
        this.e = 8;
        return;
      }
      if (paramFloat == 1.0F)
      {
        this.e = 9;
        return;
      }
      if (paramFloat == 1.3F)
      {
        this.e = 10;
        return;
      }
      if (paramFloat == 1.7F)
      {
        this.e = 11;
        return;
      }
    } while (paramFloat != 2.0F);
    this.e = 12;
  }
  
  private void c(float paramFloat)
  {
    if (paramFloat == -2.0F) {
      this.e = 0;
    }
    do
    {
      return;
      if (paramFloat == -1.3F)
      {
        this.e = 2;
        return;
      }
      if (paramFloat == -0.7F)
      {
        this.e = 4;
        return;
      }
      if (paramFloat == 0.0F)
      {
        this.e = 6;
        return;
      }
      if (paramFloat == 0.7F)
      {
        this.e = 8;
        return;
      }
      if (paramFloat == 1.3F)
      {
        this.e = 10;
        return;
      }
    } while (paramFloat != 2.0F);
    this.e = 12;
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
    this.c.setAntiAlias(true);
    this.c.setStyle(Paint.Style.FILL);
    if (this.h == null) {
      this.h = Typeface.createFromAsset(this.g.getAssets(), "DIN Alternate Bold.TTF");
    }
    this.c.setTypeface(this.h);
    this.b.setTypeface(this.h);
  }
  
  public void a(float paramFloat)
  {
    this.f = paramFloat;
    this.a = d.a().k();
    if (this.a) {
      c(paramFloat);
    }
    for (;;)
    {
      invalidate();
      return;
      b(paramFloat);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.b.setColor(-1);
    float f1 = this.g.getResources().getDimension(2131296429);
    float f2 = getY();
    float f3 = this.g.getResources().getDimension(2131296422);
    float f4 = getWidth();
    float f5 = this.g.getResources().getDimension(2131296429);
    float f6 = getY();
    paramCanvas.drawLine(f1, f3 + f2, f4 - f5, this.g.getResources().getDimension(2131296422) + f6, this.b);
    f1 = this.g.getResources().getDimension(2131296429);
    f2 = (getWidth() - this.g.getResources().getDimension(2131296416)) / 12.0F;
    int i = 0;
    if (i <= 12)
    {
      this.b.setColor(-1);
      if (i % 2 != 0)
      {
        if (!this.a)
        {
          f3 = i;
          f4 = getY();
          f5 = this.g.getResources().getDimension(2131296421);
          f6 = i;
          float f7 = getY();
          paramCanvas.drawLine(f1 + f3 * f2, f5 + f4, f1 + f6 * f2, this.g.getResources().getDimension(2131296425) + f7, this.b);
        }
        label248:
        if (i != 0) {
          break label379;
        }
        if (this.e != 0) {
          paramCanvas.drawText("-2", i * f2 + f1 - this.b.getTextSize() / 3.0F, getY() + this.g.getResources().getDimension(2131296430), this.b);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        f3 = i;
        f4 = getY();
        f5 = i;
        f6 = getY();
        paramCanvas.drawLine(f1 + f3 * f2, 13.0F + f4, f1 + f5 * f2, this.g.getResources().getDimension(2131296428) + f6, this.b);
        break label248;
        label379:
        if (i == 6)
        {
          if (this.e != 6) {
            paramCanvas.drawText("0", i * f2 + f1 - this.b.getTextSize() / 3.0F, getY() + this.g.getResources().getDimension(2131296430), this.b);
          }
        }
        else if ((i == 12) && (this.e != 12)) {
          paramCanvas.drawText("2", i * f2 + f1 - this.b.getTextSize() / 3.0F, getY() + this.g.getResources().getDimension(2131296430), this.b);
        }
      }
    }
    paramCanvas.drawCircle(this.e * f2 + f1, getY() + this.g.getResources().getDimension(2131296422), this.g.getResources().getDimension(2131296432), this.c);
    this.b.setColor(this.g.getResources().getColor(2131624064));
    paramCanvas.drawText(String.valueOf(this.f), this.e * f2 + f1 - this.b.getTextSize() / 2.0F, getY() + this.g.getResources().getDimension(2131296430), this.b);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/EVview.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */