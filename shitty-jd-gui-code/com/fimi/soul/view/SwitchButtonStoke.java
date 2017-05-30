package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import com.facebook.rebound.SimpleSpringListener;
import com.facebook.rebound.Spring;
import com.facebook.rebound.SpringConfig;
import com.facebook.rebound.SpringSystem;
import com.facebook.rebound.SpringUtil;
import com.fimi.kernel.utils.p;

public class SwitchButtonStoke
  extends View
{
  SimpleSpringListener a = new SimpleSpringListener()
  {
    public void onSpringUpdate(Spring paramAnonymousSpring)
    {
      double d = paramAnonymousSpring.getCurrentValue();
      SwitchButtonStoke.a(SwitchButtonStoke.this, d);
    }
  };
  private SpringSystem b;
  private Spring c;
  private float d;
  private int e = 0;
  private int f = Color.parseColor("#63000000");
  private int g = Color.parseColor("#51000000");
  private int h = Color.parseColor("#ededed");
  private int i = Color.parseColor("#ededed");
  private int j = Color.parseColor("#ff4f00");
  private Paint k;
  private boolean l = false;
  private int m = 1;
  private float n;
  private float o;
  private float p;
  private float q;
  private float r;
  private int s;
  private float t;
  private RectF u = new RectF();
  private boolean v = true;
  private a w;
  
  private SwitchButtonStoke(Context paramContext)
  {
    super(paramContext);
  }
  
  public SwitchButtonStoke(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setup(paramAttributeSet);
  }
  
  public SwitchButtonStoke(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setup(paramAttributeSet);
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  private void a(double paramDouble)
  {
    this.t = ((float)SpringUtil.mapValueFromRangeToRange(paramDouble, 0.0D, 1.0D, this.q, this.r));
    float f1 = (float)SpringUtil.mapValueFromRangeToRange(1.0D - paramDouble, 0.0D, 1.0D, 10.0D, this.s);
    int i5 = Color.blue(this.j);
    int i3 = Color.red(this.j);
    int i1 = Color.green(this.j);
    int i6 = Color.blue(this.i);
    int i4 = Color.red(this.i);
    int i2 = Color.green(this.i);
    i5 = (int)SpringUtil.mapValueFromRangeToRange(1.0D - paramDouble, 0.0D, 1.0D, i5, i6);
    i3 = (int)SpringUtil.mapValueFromRangeToRange(1.0D - paramDouble, 0.0D, 1.0D, i3, i4);
    i1 = (int)SpringUtil.mapValueFromRangeToRange(1.0D - paramDouble, 0.0D, 1.0D, i1, i2);
    i2 = a(i5, 0, 255);
    this.h = Color.rgb(a(i3, 0, 255), a(i1, 0, 255), i2);
    postInvalidate();
  }
  
  private void a(boolean paramBoolean)
  {
    double d1 = 1.0D;
    if (paramBoolean)
    {
      localSpring = this.c;
      if (this.l) {}
      for (;;)
      {
        localSpring.setEndValue(d1);
        return;
        d1 = 0.0D;
      }
    }
    Spring localSpring = this.c;
    double d2;
    if (this.l)
    {
      d2 = 1.0D;
      localSpring.setCurrentValue(d2);
      if (!this.l) {
        break label75;
      }
    }
    for (;;)
    {
      a(d1);
      return;
      d2 = 0.0D;
      break;
      label75:
      d1 = 0.0D;
    }
  }
  
  private void b()
  {
    if (!this.l) {}
    for (boolean bool = true;; bool = false)
    {
      this.l = bool;
      a(true);
      setSwitchState(this.l);
      if (this.w != null) {
        this.w.a(this, this.l);
      }
      return;
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.l = paramBoolean1;
    a(paramBoolean2);
  }
  
  public boolean a()
  {
    return this.v;
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.k.setStyle(Paint.Style.STROKE);
    this.k.setAntiAlias(true);
    float f1 = p.a(getContext(), 0.5F);
    this.u.set(f1, f1, getWidth() - f1, getHeight() - f1);
    this.k.setColor(this.f);
    this.k.setStrokeWidth(p.a(getContext(), 0.7F));
    paramCanvas.drawRoundRect(this.u, this.d, this.d, this.k);
    this.k.setStyle(Paint.Style.FILL);
    this.k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
    this.u.set(this.t - this.d + 4.0F, this.n - this.d + 4.0F, this.t - 4.0F + this.d, this.n + this.d - 4.0F);
    if (this.l) {
      this.k.setColor(this.j);
    }
    for (;;)
    {
      paramCanvas.drawRoundRect(this.u, this.d, this.d, this.k);
      f1 = this.s * 0.45F;
      this.u.set(this.t - f1, this.n - f1, this.t + f1, this.n + f1);
      this.k.setColor(this.h);
      paramCanvas.drawRoundRect(this.u, f1, f1, this.k);
      return;
      this.k.setColor(this.g);
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.c.addListener(this.a);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.c.removeListener(this.a);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = getWidth();
    paramInt2 = getHeight();
    this.d = (Math.min(paramInt1, paramInt2) * 0.5F);
    this.n = this.d;
    this.o = this.d;
    this.p = (paramInt1 - this.d);
    this.q = (this.o + this.m);
    this.r = (this.p - this.m);
    this.s = (paramInt2 - this.m * 4);
    if (this.l) {}
    for (float f1 = this.r;; f1 = this.q)
    {
      this.t = f1;
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.getMode(paramInt1);
    View.MeasureSpec.getMode(paramInt2);
    View.MeasureSpec.getSize(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    Resources localResources = Resources.getSystem();
    if ((i2 == 0) || (i2 == Integer.MIN_VALUE)) {
      paramInt1 = View.MeasureSpec.makeMeasureSpec((int)TypedValue.applyDimension(1, 50.0F, localResources.getDisplayMetrics()), 1073741824);
    }
    if ((i1 == 0) || (i1 == Integer.MIN_VALUE)) {
      paramInt2 = View.MeasureSpec.makeMeasureSpec((int)TypedValue.applyDimension(1, 30.0F, localResources.getDisplayMetrics()), 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setAnimate(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public void setOnSwitchListener(a parama)
  {
    this.w = parama;
  }
  
  public void setSwitchState(boolean paramBoolean)
  {
    a(paramBoolean, true);
  }
  
  public void setup(AttributeSet paramAttributeSet)
  {
    this.k = new Paint(1);
    this.k.setStyle(Paint.Style.STROKE);
    this.k.setStrokeCap(Paint.Cap.ROUND);
    this.b = SpringSystem.create();
    this.c = this.b.createSpring();
    this.c.setSpringConfig(SpringConfig.fromOrigamiTensionAndFriction(50.0D, 7.0D));
    setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        SwitchButtonStoke.a(SwitchButtonStoke.this);
      }
    });
  }
  
  public static abstract interface a
  {
    public abstract void a(View paramView, boolean paramBoolean);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/SwitchButtonStoke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */