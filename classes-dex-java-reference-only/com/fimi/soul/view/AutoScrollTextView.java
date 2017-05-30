package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class AutoScrollTextView
  extends TextView
  implements View.OnClickListener
{
  public static final String a = AutoScrollTextView.class.getSimpleName();
  public boolean b = false;
  String c;
  private float d = 0.0F;
  private float e = 0.0F;
  private float f = 0.0F;
  private float g = 0.0F;
  private float h = 0.0F;
  private float i = 0.0F;
  private Paint j = null;
  private CharSequence k = "";
  private float l = 0.5F;
  private int m = -16777216;
  private int n = 0;
  
  public AutoScrollTextView(Context paramContext)
  {
    super(paramContext);
    c();
  }
  
  public AutoScrollTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
  }
  
  public AutoScrollTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c();
  }
  
  private void c()
  {
    setOnClickListener(this);
  }
  
  public void a()
  {
    this.b = true;
    invalidate();
  }
  
  public void a(float paramFloat)
  {
    this.k = super.getText();
    this.j = super.getPaint();
    this.k = getText().toString();
    this.d = this.j.measureText(this.k.toString());
    this.e = getWidth();
    this.e = paramFloat;
    this.f = this.d;
    this.h = (this.e + this.d);
    this.i = (this.e + this.d * 1.5F);
    this.g = (getTextSize() + getPaddingTop());
    this.j.setColor(this.m);
  }
  
  public void b()
  {
    this.b = false;
    invalidate();
  }
  
  public float getSpeed()
  {
    return this.l;
  }
  
  public int getTextColor()
  {
    return this.m;
  }
  
  public void onClick(View paramView)
  {
    if (this.b)
    {
      b();
      return;
    }
    a();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (this.j != null)
    {
      paramCanvas.drawText(this.k, 0, this.k.length(), this.h - this.f, this.g, this.j);
      if (this.b) {}
    }
    else
    {
      return;
    }
    this.f += this.l;
    if (this.f > this.i)
    {
      this.n += 1;
      if (this.n == this.k.length()) {
        this.n = 0;
      }
      a(0.0F);
      this.f = this.d;
    }
    invalidate();
  }
  
  public void setSpeed(float paramFloat)
  {
    this.l = paramFloat;
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    super.setText(paramCharSequence, paramBufferType);
    a(0.0F);
  }
  
  public void setTextColor(int paramInt)
  {
    this.m = paramInt;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/AutoScrollTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */