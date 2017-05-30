package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class TunWheel
  extends View
{
  private static final int e = 5;
  private static final int h = 7;
  private static final int j = 8;
  private static final int k = 5;
  private static int l = 20;
  int a;
  Context b;
  private float c;
  private int d;
  private int f = 0;
  private int g = 5;
  private int i = 0;
  private a m;
  private Boolean n = Boolean.valueOf(true);
  private Bitmap o;
  
  public TunWheel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = paramContext;
    this.c = getContext().getResources().getDisplayMetrics().density;
    if (this.c == 1.5D) {
      this.a = ((int)(180.0F * this.c));
    }
    for (;;)
    {
      setBackgroundDrawable(getResources().getDrawable(2130838522));
      this.o = BitmapFactory.decodeResource(getResources(), 2130838522);
      if ((this.o != null) && (!this.o.isRecycled())) {
        this.o.recycle();
      }
      return;
      if (this.c == 2.0F) {
        this.a = ((int)(this.c * 220.0F));
      } else if (this.c == 3.0F) {
        this.a = ((int)(this.c * 220.0F));
      }
    }
  }
  
  private void a()
  {
    if (this.m != null) {
      this.m.a(this.f);
    }
  }
  
  private void a(Canvas paramCanvas)
  {
    paramCanvas.save();
    TextPaint localTextPaint = new TextPaint(1);
    localTextPaint.setTextSize(11.0F * this.c);
    float f1 = Layout.getDesiredWidth("0", localTextPaint);
    Paint localPaint = new Paint();
    localPaint.setColor(getResources().getColor(2131623965));
    float f2 = this.c;
    float f3 = getHeight() / 2;
    float f4 = this.c;
    float f5 = getWidth();
    float f6 = this.c;
    float f7 = getHeight() / 2;
    paramCanvas.drawRect(4.0F * f2, f3 - f1 - f4 * 4.0F, f5 - f6 * 1.0F, this.c * 2.0F + (f7 + f1), localPaint);
    localPaint = new Paint();
    localPaint.setColor(getResources().getColor(2131624130));
    localPaint.setStyle(Paint.Style.STROKE);
    double d1;
    if (this.n.booleanValue())
    {
      f2 = this.c;
      f3 = getHeight() / 2;
      f4 = this.c;
      f5 = getWidth();
      f6 = this.c;
      f7 = getHeight() / 2;
      paramCanvas.drawRect(4.0F * f2, f3 - f1 - f4 * 4.0F, f5 - f6 * 1.0F, this.c * 2.0F + (f7 + f1), localPaint);
      localTextPaint.setColor(getResources().getColor(2131624205));
      f1 = Layout.getDesiredWidth("0", localTextPaint);
      if ((this.f < 100) || (this.f >= 1000)) {
        break label476;
      }
      d1 = this.f / 10.0D;
      f2 = l;
      f3 = this.c;
      f4 = getHeight() / 2;
      paramCanvas.drawText(String.valueOf(d1), f2 + 3.0F * f3, f1 / 2.0F + f4, localTextPaint);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      f2 = this.c;
      f3 = this.c;
      f4 = getHeight() / 2;
      f5 = this.c;
      f6 = getWidth();
      f7 = this.c;
      float f8 = this.c;
      float f9 = getHeight() / 2;
      paramCanvas.drawRect(f2 * 4.0F - f3, f4 - f1 - f5 * 4.0F, f6 - f7 * 1.0F - f8, this.c * 2.0F + (f9 + f1), localPaint);
      break;
      label476:
      if (this.f >= 1000)
      {
        d1 = this.f / 10.0D;
        f2 = l;
        f3 = getHeight() / 2;
        paramCanvas.drawText(String.valueOf(d1), f2, f1 / 2.0F + f3, localTextPaint);
      }
      else if ((this.f < 0) && (this.f > -100))
      {
        d1 = this.f / 10.0D;
        f2 = l;
        f3 = this.c;
        f4 = getHeight() / 2;
        paramCanvas.drawText(String.valueOf(d1), f2 + f3 * 4.0F, f1 / 2.0F + f4, localTextPaint);
      }
      else if ((this.f < -100) && (this.f > 64537))
      {
        d1 = this.f / 10.0D;
        f2 = l;
        f3 = this.c;
        f4 = getHeight() / 2;
        paramCanvas.drawText(String.valueOf(d1), f2 + f3 * 2.0F, f1 / 2.0F + f4, localTextPaint);
      }
      else if (this.f <= 64536)
      {
        d1 = this.f / 10.0D;
        f2 = l;
        f3 = this.c;
        f4 = getHeight() / 2;
        paramCanvas.drawText(String.valueOf(d1), f2 - f3, f1 / 2.0F + f4, localTextPaint);
      }
      else
      {
        d1 = this.f / 10.0D;
        f2 = l;
        f3 = this.c;
        f4 = getHeight() / 2;
        paramCanvas.drawText(String.valueOf(d1), f2 + 6.0F * f3, f1 / 2.0F + f4, localTextPaint);
      }
    }
  }
  
  private void b(Canvas paramCanvas)
  {
    paramCanvas.save();
    Paint localPaint = new Paint();
    localPaint.setStrokeWidth(2.0F);
    localPaint.setColor(getResources().getColor(2131624130));
    localPaint.setStrokeWidth(1.0F);
    localPaint.setAntiAlias(true);
    TextPaint localTextPaint1 = new TextPaint(1);
    localTextPaint1.setTextSize(7.0F * this.c);
    localTextPaint1.setColor(getResources().getColor(2131624130));
    int i3 = this.d;
    float f2 = Layout.getDesiredWidth("0", localTextPaint1);
    l = (int)(7.0F * this.c);
    TextPaint localTextPaint2 = new TextPaint(1);
    localTextPaint2.setTextSize(11.0F * this.c);
    localTextPaint2.setColor(getResources().getColor(2131624130));
    float f1;
    float f3;
    float f4;
    int i2;
    int i1;
    if (this.n.booleanValue())
    {
      f1 = getPaddingLeft() + l;
      f3 = this.c;
      f4 = getPaddingTop();
      paramCanvas.drawLine(f1 - f3, 10.0F * this.c + f4, getPaddingLeft() + l - this.c, getHeight() - 10.0F * this.c, localPaint);
      i2 = 0;
      f1 = 0.0F;
      i1 = 0;
      if (i2 <= i3 - 20.0F * this.c)
      {
        f1 = i3 / 2 + this.i - this.g * i1 * this.c;
        if ((this.f + i1) % 5 == 0)
        {
          f3 = l + getPaddingLeft();
          f4 = l;
          paramCanvas.drawLine(f3, f1, this.c * 8.0F + f4, f1, localPaint);
          paramCanvas.drawText(String.valueOf((this.f + i1) / 10.0D), l + this.c * 8.0F + 3.0F * this.c, f1 + f2 / 2.0F, localTextPaint1);
          label369:
          f1 = i3 / 2 + this.i + this.g * i1 * this.c;
          if (i2 != i3 - 20.0F * this.c)
          {
            if ((this.f - i1) % 5 != 0) {
              break label591;
            }
            f3 = l + getPaddingLeft();
            f4 = l;
            paramCanvas.drawLine(f3, f1, this.c * 8.0F + f4, f1, localPaint);
            if (f1 < i3 - 23.0F * this.c) {
              paramCanvas.drawText(String.valueOf((this.f - i1) / 10.0D), l + this.c * 8.0F + 3.0F * this.c, f2 / 2.0F + f1, localTextPaint1);
            }
          }
        }
        for (;;)
        {
          i2 = (int)(i2 + this.g * 2 * this.c);
          i1 += 1;
          break;
          f3 = l + getPaddingLeft();
          f4 = l;
          paramCanvas.drawLine(f3, f1, this.c * 5.0F + f4, f1, localPaint);
          break label369;
          label591:
          f3 = l + getPaddingLeft();
          f4 = l;
          paramCanvas.drawLine(f3, f1, this.c * 5.0F + f4, f1, localPaint);
        }
      }
      paramCanvas.drawLine(l + getPaddingLeft(), f1 - this.i, 2.0F * (l + this.c * 8.0F), f1 - this.i, localPaint);
      paramCanvas.drawText("m", l + this.c * 8.0F, f2 / 2.0F + f1 - 4.0F * this.c - this.i, localTextPaint2);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      f1 = getWidth() - l;
      f3 = this.c;
      f4 = getPaddingTop();
      float f5 = this.c;
      float f6 = getWidth() - l;
      paramCanvas.drawLine(2.0F * f3 + f1, 10.0F * f5 + f4, 2.0F * this.c + f6, getHeight() - 10.0F * this.c, localPaint);
      i2 = 0;
      f1 = 0.0F;
      i1 = 0;
      if (i2 <= i3 - 20.0F * this.c)
      {
        f1 = i3 / 2 + this.i - this.g * i1 * this.c;
        if ((this.f + i1) % 5 == 0)
        {
          f3 = getWidth() - l;
          f4 = this.c;
          f5 = getWidth() - l;
          f6 = this.c;
          paramCanvas.drawLine(f4 + f3, f1, this.c + (f5 - f6 * 8.0F), f1, localPaint);
          if ((this.f + i1 >= 100) && (this.f + i1 < 1000))
          {
            paramCanvas.drawText(String.valueOf((this.f + i1) / 10.0D), l + 5.0F * this.c, f1 + f2 / 2.0F, localTextPaint1);
            label986:
            f1 = i3 / 2 + this.i + this.g * i1 * this.c;
            if (i2 != i3 - 20.0F * this.c)
            {
              if ((this.f - i1) % 5 != 0) {
                break label1821;
              }
              f3 = getWidth() - l;
              f4 = this.c;
              f5 = getWidth() - l;
              f6 = this.c;
              paramCanvas.drawLine(f4 + f3, f1, this.c + (f5 - f6 * 8.0F), f1, localPaint);
              if (f1 < i3 - 23.0F * this.c)
              {
                if ((this.f - i1 < 100) || (this.f - i1 >= 1000)) {
                  break label1546;
                }
                paramCanvas.drawText(String.valueOf((this.f - i1) / 10.0D), l + 5.0F * this.c, f2 / 2.0F + f1, localTextPaint1);
              }
            }
          }
        }
        for (;;)
        {
          i2 = (int)(i2 + this.g * 2 * this.c);
          i1 += 1;
          break;
          if (this.f + i1 >= 1000)
          {
            paramCanvas.drawText(String.valueOf((this.f + i1) / 10.0D), l + this.c, f1 + f2 / 2.0F, localTextPaint1);
            break label986;
          }
          if ((this.f + i1 < 0) && (this.f + i1 > -100))
          {
            paramCanvas.drawText(String.valueOf((this.f + i1) / 10.0D), l + 7.0F * this.c, f1 + f2 / 2.0F, localTextPaint1);
            break label986;
          }
          if ((this.f + i1 < -100) && (this.f + i1 > 64537))
          {
            paramCanvas.drawText(String.valueOf((this.f + i1) / 10.0D), l + 3.0F * this.c, f1 + f2 / 2.0F, localTextPaint1);
            break label986;
          }
          if (this.f + i1 <= 64536)
          {
            paramCanvas.drawText(String.valueOf((this.f + i1) / 10.0D), l - 2.0F * this.c, f1 + f2 / 2.0F, localTextPaint1);
            break label986;
          }
          paramCanvas.drawText(String.valueOf((this.f + i1) / 10.0D), l * 2 + 2.0F * this.c, f1 + f2 / 2.0F, localTextPaint1);
          break label986;
          f3 = getWidth() - l;
          f4 = this.c;
          f5 = getWidth() - l;
          f6 = this.c;
          paramCanvas.drawLine(f4 + f3, f1, this.c + (f5 - f6 * 5.0F), f1, localPaint);
          break label986;
          label1546:
          if (this.f - i1 >= 1000)
          {
            paramCanvas.drawText(String.valueOf((this.f - i1) / 10.0D), l + this.c, f2 / 2.0F + f1, localTextPaint1);
          }
          else if ((this.f - i1 < 0) && (this.f - i1 > -100))
          {
            paramCanvas.drawText(String.valueOf((this.f - i1) / 10.0D), l + this.c * 7.0F, f2 / 2.0F + f1, localTextPaint1);
          }
          else if ((this.f - i1 <= -100) && (this.f - i1 > 64537))
          {
            paramCanvas.drawText(String.valueOf((this.f - i1) / 10.0D), l + 3.0F * this.c, f2 / 2.0F + f1, localTextPaint1);
          }
          else if (this.f - i1 <= 64536)
          {
            paramCanvas.drawText(String.valueOf((this.f - i1) / 10.0D), l - 2.0F * this.c, f2 / 2.0F + f1, localTextPaint1);
          }
          else
          {
            paramCanvas.drawText(String.valueOf((this.f - i1) / 10.0D), l * 2 + 2.0F * this.c, f2 / 2.0F + f1, localTextPaint1);
            continue;
            label1821:
            f3 = getWidth() - l;
            f4 = this.c;
            f5 = getWidth() - l;
            f6 = this.c;
            paramCanvas.drawLine(f4 + f3, f1, this.c + (f5 - f6 * 5.0F), f1, localPaint);
          }
        }
      }
      f3 = getWidth() / 4;
      f4 = this.c;
      f5 = this.i;
      f6 = getWidth() - l;
      paramCanvas.drawLine(f4 + f3, f1 - f5, this.c + f6, f1 - this.i, localPaint);
      paramCanvas.drawText("m/s", 8.0F * this.c + this.c, f2 / 2.0F + f1 - 4.0F * this.c - this.i, localTextPaint2);
    }
  }
  
  public void a(float paramFloat)
  {
    this.f = ((int)(10.0F * paramFloat));
    a();
    postInvalidate();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.i = ((int)(paramInt2 * this.c / 2.0F));
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    b(paramCanvas);
    a(paramCanvas);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.d = getHeight();
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(this.o.getWidth(), this.a);
  }
  
  public void setDirection(Boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public static abstract interface a
  {
    public abstract void a(float paramFloat);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/TunWheel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */