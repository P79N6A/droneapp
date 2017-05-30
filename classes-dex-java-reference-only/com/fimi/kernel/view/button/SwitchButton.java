package com.fimi.kernel.view.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import com.fimi.kernel.R.styleable;
import com.fimi.kernel.utils.p;

public class SwitchButton
  extends View
{
  SimpleSpringListener a = new SimpleSpringListener()
  {
    public void onSpringUpdate(Spring paramAnonymousSpring)
    {
      double d = paramAnonymousSpring.getCurrentValue();
      SwitchButton.a(SwitchButton.this, d);
    }
  };
  private SpringSystem b;
  private Spring c;
  private float d;
  private int e = 0;
  private int f = Color.parseColor("#ffffff");
  private int g = Color.parseColor("#bcbcbd");
  private int h = Color.parseColor("#bcbcbd");
  private int i = Color.parseColor("#ff5400");
  private Paint j;
  private boolean k = false;
  private int l = 1;
  private float m;
  private float n;
  private float o;
  private float p;
  private float q;
  private int r;
  private float s;
  private RectF t = new RectF();
  private boolean u = true;
  private a v;
  
  private SwitchButton(Context paramContext)
  {
    super(paramContext);
  }
  
  public SwitchButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setup(paramAttributeSet);
  }
  
  public SwitchButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
    this.s = ((float)SpringUtil.mapValueFromRangeToRange(paramDouble, 0.0D, 1.0D, this.p, this.q));
    float f1 = (float)SpringUtil.mapValueFromRangeToRange(1.0D - paramDouble, 0.0D, 1.0D, 10.0D, this.r);
    int i5 = Color.blue(this.i);
    int i3 = Color.red(this.i);
    int i1 = Color.green(this.i);
    int i6 = Color.blue(this.h);
    int i4 = Color.red(this.h);
    int i2 = Color.green(this.h);
    i5 = (int)SpringUtil.mapValueFromRangeToRange(1.0D - paramDouble, 0.0D, 1.0D, i5, i6);
    i3 = (int)SpringUtil.mapValueFromRangeToRange(1.0D - paramDouble, 0.0D, 1.0D, i3, i4);
    i1 = (int)SpringUtil.mapValueFromRangeToRange(1.0D - paramDouble, 0.0D, 1.0D, i1, i2);
    i2 = a(i5, 0, 255);
    this.g = Color.rgb(a(i3, 0, 255), a(i1, 0, 255), i2);
    postInvalidate();
  }
  
  private void a(boolean paramBoolean)
  {
    double d1 = 1.0D;
    if (paramBoolean)
    {
      localSpring = this.c;
      if (this.k) {}
      for (;;)
      {
        localSpring.setEndValue(d1);
        return;
        d1 = 0.0D;
      }
    }
    Spring localSpring = this.c;
    double d2;
    if (this.k)
    {
      d2 = 1.0D;
      localSpring.setCurrentValue(d2);
      if (!this.k) {
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
    if (!this.k) {}
    for (boolean bool = true;; bool = false)
    {
      this.k = bool;
      a(true);
      setSwitchState(this.k);
      if (this.v != null) {
        this.v.a(this, this.k);
      }
      return;
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.k = paramBoolean1;
    a(paramBoolean2);
  }
  
  public boolean a()
  {
    return this.u;
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.j.setStyle(Paint.Style.STROKE);
    this.j.setAntiAlias(true);
    float f1 = p.a(getContext(), 0.5F);
    this.t.set(f1, f1, getWidth() - f1, getHeight() - f1);
    this.j.setColor(603979775);
    this.j.setStrokeWidth(p.a(getContext(), 0.7F));
    paramCanvas.drawRoundRect(this.t, this.d, this.d, this.j);
    this.j.setStyle(Paint.Style.FILL);
    this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
    this.t.set(this.s - 1.0F - this.d, this.m - this.d, this.s + 1.1F + this.d, this.m + this.d);
    this.j.setColor(0);
    paramCanvas.drawRoundRect(this.t, this.d, this.d, this.j);
    f1 = this.r * 0.45F;
    this.t.set(this.s - f1, this.m - f1, this.s + f1, this.m + f1);
    this.j.setColor(this.g);
    paramCanvas.drawRoundRect(this.t, f1, f1, this.j);
  }
  
  public boolean getToggleOn()
  {
    return this.k;
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
    this.m = this.d;
    this.n = this.d;
    this.o = (paramInt1 - this.d);
    this.p = (this.n + this.l);
    this.q = (this.o - this.l);
    this.r = (paramInt2 - this.l * 4);
    if (this.k) {}
    for (float f1 = this.q;; f1 = this.p)
    {
      this.s = f1;
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
    this.u = paramBoolean;
  }
  
  public void setOnSwitchListener(a parama)
  {
    this.v = parama;
  }
  
  public void setSwitchState(boolean paramBoolean)
  {
    a(paramBoolean, true);
  }
  
  public void setup(AttributeSet paramAttributeSet)
  {
    this.j = new Paint(1);
    this.j.setStyle(Paint.Style.STROKE);
    this.j.setStrokeCap(Paint.Cap.ROUND);
    this.b = SpringSystem.create();
    this.c = this.b.createSpring();
    this.c.setSpringConfig(SpringConfig.fromOrigamiTensionAndFriction(50.0D, 7.0D));
    setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        SwitchButton.a(SwitchButton.this);
      }
    });
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.SwitchButton);
    this.e = paramAttributeSet.getColor(R.styleable.SwitchButton_onColor, this.e);
    this.h = paramAttributeSet.getColor(R.styleable.SwitchButton_spotColor, this.h);
    this.l = paramAttributeSet.getDimensionPixelSize(R.styleable.SwitchButton_borderWidth, (int)p.a(getContext(), this.l));
    this.u = paramAttributeSet.getBoolean(R.styleable.SwitchButton_animate, this.u);
    paramAttributeSet.recycle();
  }
  
  public static abstract interface a
  {
    public abstract void a(View paramView, boolean paramBoolean);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/view/button/SwitchButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */