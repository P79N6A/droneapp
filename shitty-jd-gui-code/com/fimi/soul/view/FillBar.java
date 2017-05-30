package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;

public class FillBar
  extends View
{
  SurfaceHolder a;
  private Paint b;
  private Paint c;
  private Path d = new Path();
  private Path e = new Path();
  private int f;
  private int g;
  private float h = 0.0F;
  private float i = 0.5F;
  private float j = 0.5F;
  private boolean k = false;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private boolean q = false;
  
  public FillBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }
  
  private void b()
  {
    this.l = Color.parseColor("#D6D6D6");
    this.m = Color.parseColor("#FFFFFF");
    this.n = Color.parseColor("#F49748");
    this.b = new Paint();
    this.b.setAntiAlias(false);
    this.b.setStyle(Paint.Style.STROKE);
    this.b.setStrokeWidth(3.0F);
    this.c = new Paint(this.b);
    this.c.setStyle(Paint.Style.FILL);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.o = paramInt1;
    this.p = paramInt2;
  }
  
  public void a(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  public boolean a()
  {
    return this.k;
  }
  
  public int getColorBar()
  {
    return this.n;
  }
  
  public int getColorMin()
  {
    return this.m;
  }
  
  public int getColorOutline()
  {
    return this.l;
  }
  
  public float getMax()
  {
    return this.j;
  }
  
  public int getMaxValue()
  {
    return this.p + (int)(getMax() * (this.o - this.p));
  }
  
  public float getMin()
  {
    return this.i;
  }
  
  public int getMinValue()
  {
    return this.p + (int)(getMin() * (this.o - this.p));
  }
  
  public float getPercentage()
  {
    return this.h;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    float f1;
    float f2;
    if (this.f < this.g)
    {
      f1 = this.f;
      if (this.f >= this.g) {
        break label416;
      }
      f2 = this.g * this.h;
      label44:
      this.c.setColor(this.l);
      this.d.reset();
      this.d.moveTo(0.0F, 0.0F);
      this.d.lineTo(0.0F, this.f);
      this.d.lineTo(this.g, this.f);
      this.d.lineTo(this.g, 0.0F);
      this.d.lineTo(0.0F, 0.0F);
      paramCanvas.drawPath(this.d, this.c);
      this.c.setColor(this.n);
      this.e.reset();
      if (!this.q) {
        break label493;
      }
      if (this.f <= this.g) {
        break label425;
      }
      this.e.moveTo(0.0F, 0.0F);
      this.e.lineTo(0.0F, this.f - f1);
      this.e.lineTo(this.g, this.f - f1);
      this.e.lineTo(this.g, 0.0F);
      this.e.lineTo(0.0F, 0.0F);
      label236:
      paramCanvas.drawPath(this.e, this.c);
      this.b.setColor(this.m);
      if (a())
      {
        this.d.reset();
        if (!this.q) {
          break label723;
        }
        if (this.f <= this.g) {
          break label616;
        }
        f1 = this.f * this.i;
        this.d.reset();
        this.d.moveTo(0.0F, f1);
        this.d.lineTo(this.g, f1);
        paramCanvas.drawPath(this.d, this.b);
        this.d.reset();
        f1 = this.f * this.j;
        this.d.moveTo(0.0F, f1);
        this.d.lineTo(this.g, f1);
        paramCanvas.drawPath(this.d, this.b);
      }
    }
    for (;;)
    {
      invalidate();
      return;
      f1 = this.f * (1.0F - this.h);
      break;
      label416:
      f2 = this.g;
      break label44;
      label425:
      this.e.moveTo(0.0F, 0.0F);
      this.e.lineTo(0.0F, this.f);
      this.e.lineTo(this.g - f2, this.f);
      this.e.lineTo(this.g - f2, 0.0F);
      this.e.lineTo(0.0F, 0.0F);
      break label236;
      label493:
      if (this.f > this.g)
      {
        this.e.moveTo(0.0F, f1);
        this.e.lineTo(0.0F, this.f);
        this.e.lineTo(f2, this.f);
        this.e.lineTo(f2, f1);
        this.e.lineTo(0.0F, f1);
        break label236;
      }
      this.e.moveTo(0.0F, 0.0F);
      this.e.lineTo(0.0F, this.f);
      this.e.lineTo(f2, this.f);
      this.e.lineTo(f2, 0.0F);
      this.e.lineTo(0.0F, 0.0F);
      break label236;
      label616:
      f1 = this.g * this.j;
      this.d.reset();
      this.d.moveTo(f1, 0.0F);
      this.d.lineTo(f1, this.f);
      paramCanvas.drawPath(this.d, this.b);
      f1 = this.g * this.i;
      this.d.reset();
      this.d.moveTo(f1, 0.0F);
      this.d.lineTo(f1, this.f);
      paramCanvas.drawPath(this.d, this.b);
      continue;
      label723:
      if (this.f > this.g)
      {
        f1 = this.f * (1.0F - this.i);
        this.d.reset();
        this.d.moveTo(0.0F, f1);
        this.d.lineTo(this.g, f1);
        paramCanvas.drawPath(this.d, this.b);
        this.d.reset();
        f1 = this.f * (1.0F - this.j);
        this.d.moveTo(0.0F, f1);
        this.d.lineTo(this.g, f1);
        paramCanvas.drawPath(this.d, this.b);
      }
      else
      {
        f1 = this.g * this.i;
        this.d.reset();
        this.d.moveTo(f1, 0.0F);
        this.d.lineTo(f1, this.f);
        paramCanvas.drawPath(this.d, this.b);
        f1 = this.g * this.j;
        this.d.reset();
        this.d.moveTo(f1, 0.0F);
        this.d.lineTo(f1, this.f);
        paramCanvas.drawPath(this.d, this.b);
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.g = (paramInt1 - 1);
    this.f = (paramInt2 - 1);
  }
  
  public void setColorBar(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void setColorMin(int paramInt)
  {
    this.m = paramInt;
  }
  
  public void setColorOutline(int paramInt)
  {
    this.l = paramInt;
  }
  
  public void setPercentage(float paramFloat)
  {
    this.h = paramFloat;
    float f1;
    if (this.i > paramFloat)
    {
      f1 = paramFloat;
      this.i = f1;
      if (this.j >= paramFloat) {
        break label48;
      }
    }
    for (;;)
    {
      this.j = paramFloat;
      invalidate();
      return;
      f1 = this.i;
      break;
      label48:
      paramFloat = this.j;
    }
  }
  
  public void setShowMinMax(boolean paramBoolean)
  {
    this.k = paramBoolean;
    if (paramBoolean)
    {
      this.i = 0.5F;
      this.j = 0.5F;
    }
    invalidate();
  }
  
  public void setValue(int paramInt)
  {
    setPercentage((paramInt - this.p) / (this.o - this.p));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/FillBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */