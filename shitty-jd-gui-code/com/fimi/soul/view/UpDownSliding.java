package com.fimi.soul.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.v;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.utils.ao;

public class UpDownSliding
  extends RelativeLayout
{
  private static final int B = 1;
  private static final int C = 2;
  private static final int r = 0;
  private static final int s = 1;
  private static final int t = 2;
  private static final int u = 3;
  private static int y = -1;
  private static int z = -2130706433;
  private b A = b.b;
  private Handler D = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      case 0: 
        UpDownSliding.a(UpDownSliding.this, UpDownSliding.b.b, UpDownSliding.b.c);
        return;
      case 1: 
        UpDownSliding.a(UpDownSliding.this, UpDownSliding.b.b, UpDownSliding.b.a);
        return;
      case 2: 
        UpDownSliding.this.a(2, UpDownSliding.a.b, Boolean.valueOf(true));
        return;
      }
      UpDownSliding.this.a(1, UpDownSliding.a.a, Boolean.valueOf(true));
    }
  };
  int a;
  int b;
  int c;
  int d;
  boolean e = false;
  private String[] f = { getResources().getString(2131362597), getResources().getString(2131362573), getResources().getString(2131362804) };
  private int[] g;
  private int[] h;
  private int[] i;
  private LinearLayout[] j;
  private ImageView k;
  private VelocityTracker l;
  private TextView[] m;
  private c n;
  private Boolean o = Boolean.valueOf(false);
  private b p = b.b;
  private final int q = 10;
  private RelativeLayout.LayoutParams v;
  private RelativeLayout.LayoutParams w;
  private RelativeLayout.LayoutParams x;
  
  public UpDownSliding(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public UpDownSliding(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public UpDownSliding(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(b paramb1, b paramb2)
  {
    if ((paramb1 == b.a) && (paramb2 == b.b)) {
      a(2, a.a, Boolean.valueOf(false));
    }
    do
    {
      return;
      if ((paramb1 == b.b) && (paramb2 == b.c))
      {
        a(1, a.a, Boolean.valueOf(false));
        return;
      }
      if ((paramb1 == b.c) && (paramb2 == b.b))
      {
        a(1, a.b, Boolean.valueOf(false));
        return;
      }
      if ((paramb1 == b.b) && (paramb2 == b.a))
      {
        a(2, a.b, Boolean.valueOf(false));
        return;
      }
      if ((paramb1 == b.a) && (paramb2 == b.c))
      {
        a(b.a, b.b);
        this.D.sendEmptyMessageAtTime(0, 1000L);
        return;
      }
    } while ((paramb1 != b.c) || (paramb2 != b.a));
    a(b.c, b.b);
    this.D.sendEmptyMessageDelayed(1, 1000L);
  }
  
  public void a(int paramInt, a parama, Boolean paramBoolean)
  {
    if (parama == a.b) {}
    for (ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { this.v.topMargin, this.i[paramInt] });; localValueAnimator = ValueAnimator.ofInt(new int[] { this.v.topMargin, this.i[(paramInt - 1)] })) {
      switch (paramInt)
      {
      default: 
        return;
      }
    }
    if (parama == a.b)
    {
      parama = ValueAnimator.ofInt(new int[] { 0, this.h[0] });
      this.m[0].setTextColor(z);
      this.m[1].setTextColor(y);
      this.m[2].setTextColor(z);
    }
    for (this.p = b.b;; this.p = b.c)
    {
      parama.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          UpDownSliding.c(UpDownSliding.this).leftMargin = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          UpDownSliding.d(UpDownSliding.this).leftMargin = (((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue() / (UpDownSliding.this.c / UpDownSliding.this.d) + UpDownSliding.this.c);
          UpDownSliding.e(UpDownSliding.this).leftMargin = (UpDownSliding.f(UpDownSliding.this)[1] - ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue() / (UpDownSliding.this.c / UpDownSliding.this.d));
        }
      });
      localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          UpDownSliding.c(UpDownSliding.this).topMargin = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          UpDownSliding.d(UpDownSliding.this).topMargin = (((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue() + UpDownSliding.this.a);
          UpDownSliding.e(UpDownSliding.this).topMargin = (((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue() + UpDownSliding.this.a * 2);
          UpDownSliding.g(UpDownSliding.this)[0].setLayoutParams(UpDownSliding.c(UpDownSliding.this));
          UpDownSliding.g(UpDownSliding.this)[1].setLayoutParams(UpDownSliding.d(UpDownSliding.this));
          UpDownSliding.g(UpDownSliding.this)[2].setLayoutParams(UpDownSliding.e(UpDownSliding.this));
        }
      });
      if ((this.n != null) && (paramBoolean.booleanValue()))
      {
        this.n.a(this.p);
        c.e().a(this.p.a());
      }
      parama.setDuration(250L);
      localValueAnimator.setDuration(250L);
      parama.start();
      localValueAnimator.start();
      return;
      parama = ValueAnimator.ofInt(new int[] { this.h[0], 0 });
      this.m[0].setTextColor(z);
      this.m[1].setTextColor(z);
      this.m[2].setTextColor(y);
    }
    if (parama == a.b)
    {
      parama = ValueAnimator.ofInt(new int[] { this.h[0], this.h[1] });
      this.m[0].setTextColor(y);
      this.m[1].setTextColor(z);
      this.m[2].setTextColor(z);
    }
    for (this.p = b.a;; this.p = b.b)
    {
      parama.setDuration(500L);
      parama.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          UpDownSliding.c(UpDownSliding.this).leftMargin = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          UpDownSliding.d(UpDownSliding.this).leftMargin = (UpDownSliding.f(UpDownSliding.this)[1] - (((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue() - UpDownSliding.f(UpDownSliding.this)[0]));
          UpDownSliding.e(UpDownSliding.this).leftMargin = ((UpDownSliding.f(UpDownSliding.this)[1] - ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue()) * (UpDownSliding.this.c / UpDownSliding.this.d));
        }
      });
      localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          UpDownSliding.c(UpDownSliding.this).topMargin = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          UpDownSliding.d(UpDownSliding.this).topMargin = (((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue() + UpDownSliding.this.a);
          UpDownSliding.e(UpDownSliding.this).topMargin = (((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue() + UpDownSliding.this.a * 2);
          UpDownSliding.g(UpDownSliding.this)[0].setLayoutParams(UpDownSliding.c(UpDownSliding.this));
          UpDownSliding.g(UpDownSliding.this)[1].setLayoutParams(UpDownSliding.d(UpDownSliding.this));
          UpDownSliding.g(UpDownSliding.this)[2].setLayoutParams(UpDownSliding.e(UpDownSliding.this));
        }
      });
      if ((this.n != null) && (paramBoolean.booleanValue()))
      {
        this.n.a(this.p);
        c.e().a(this.p.a());
      }
      parama.setDuration(250L);
      localValueAnimator.setDuration(250L);
      parama.start();
      localValueAnimator.start();
      return;
      parama = ValueAnimator.ofInt(new int[] { this.h[1], this.h[0] });
      this.m[0].setTextColor(z);
      this.m[1].setTextColor(y);
      this.m[2].setTextColor(z);
    }
  }
  
  public void a(Context paramContext)
  {
    this.a = ((int)getResources().getDimension(2131296524));
    this.c = ((int)getResources().getDimension(2131296522));
    this.d = ((int)getResources().getDimension(2131296523));
    this.b = ((int)getResources().getDimension(2131296518));
    this.g = new int[] { this.a, this.a * 2, this.a * 3 };
    this.h = new int[] { this.c, this.c + this.d, this.c };
    this.i = new int[] { 0, this.a, this.a * 2 };
    RelativeLayout localRelativeLayout = new RelativeLayout(paramContext);
    localRelativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
    this.j = new LinearLayout[3];
    this.m = new TextView[3];
    final int i1 = 0;
    while (i1 < this.f.length)
    {
      this.j[i1] = new LinearLayout(paramContext);
      this.m[i1] = new TextView(paramContext);
      Object localObject = new LinearLayout.LayoutParams(-2, -2);
      this.m[i1].setTextColor(-1);
      this.m[i1].setText(this.f[i1]);
      this.m[i1].setTextSize(0, this.b);
      this.m[i1].setTextColor(z);
      this.m[i1].setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.m[i1].setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (!UpDownSliding.this.isEnabled()) {}
          do
          {
            do
            {
              return;
            } while (i1 == UpDownSliding.a(UpDownSliding.this).a());
            if ((i1 == UpDownSliding.b.a.a()) && (UpDownSliding.a(UpDownSliding.this) == UpDownSliding.b.b))
            {
              UpDownSliding.this.a(2, UpDownSliding.a.b, Boolean.valueOf(true));
              return;
            }
            if ((i1 == UpDownSliding.b.b.a()) && (UpDownSliding.a(UpDownSliding.this) == UpDownSliding.b.a))
            {
              UpDownSliding.this.a(2, UpDownSliding.a.a, Boolean.valueOf(true));
              return;
            }
            if ((i1 == UpDownSliding.b.a.a()) && (UpDownSliding.a(UpDownSliding.this) == UpDownSliding.b.c))
            {
              UpDownSliding.this.a(1, UpDownSliding.a.b, Boolean.valueOf(false));
              UpDownSliding.b(UpDownSliding.this).sendEmptyMessageAtTime(2, 1000L);
              return;
            }
            if ((i1 == UpDownSliding.b.b.a()) && (UpDownSliding.a(UpDownSliding.this) == UpDownSliding.b.c))
            {
              UpDownSliding.this.a(1, UpDownSliding.a.b, Boolean.valueOf(true));
              return;
            }
            if ((i1 == UpDownSliding.b.c.a()) && (UpDownSliding.a(UpDownSliding.this) == UpDownSliding.b.a))
            {
              UpDownSliding.this.a(2, UpDownSliding.a.a, Boolean.valueOf(false));
              UpDownSliding.b(UpDownSliding.this).sendEmptyMessageAtTime(3, 1000L);
              return;
            }
          } while ((i1 != UpDownSliding.b.c.a()) || (UpDownSliding.a(UpDownSliding.this) != UpDownSliding.b.b));
          UpDownSliding.this.a(1, UpDownSliding.a.a, Boolean.valueOf(true));
        }
      });
      ao.a(paramContext.getAssets(), new View[] { this.m[i1] });
      this.m[i1].getPaint().setFakeBoldText(true);
      this.j[i1].setId(i1 + 100);
      this.j[i1].addView(this.m[i1]);
      localObject = new RelativeLayout.LayoutParams(-1, -1);
      ((RelativeLayout.LayoutParams)localObject).topMargin = this.g[i1];
      ((RelativeLayout.LayoutParams)localObject).leftMargin = this.h[i1];
      this.j[i1].setLayoutParams((ViewGroup.LayoutParams)localObject);
      localRelativeLayout.addView(this.j[i1]);
      i1 += 1;
    }
    localRelativeLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    i1 = this.m[0].getMeasuredHeight();
    int i2 = this.m[0].getMeasuredWidth();
    this.m[1].setTextColor(y);
    if (d.a().k())
    {
      this.m[2].setVisibility(8);
      this.m[2].setEnabled(false);
    }
    for (;;)
    {
      this.k = new ImageView(paramContext);
      this.k.setBackgroundResource(2130838280);
      paramContext = new RelativeLayout.LayoutParams(-2, -2);
      int i3 = (int)getResources().getDimension(2131296519);
      paramContext.height = i3;
      paramContext.width = i3;
      paramContext.topMargin = (this.a * 2 + i1 / 2 - i3 / 2);
      paramContext.leftMargin = ((int)(i2 + this.h[1] + getResources().getDimension(2131296520) + i3 / 5));
      this.k.setLayoutParams(paramContext);
      localRelativeLayout.addView(this.k);
      addView(localRelativeLayout);
      this.v = ((RelativeLayout.LayoutParams)this.j[0].getLayoutParams());
      this.x = ((RelativeLayout.LayoutParams)this.j[1].getLayoutParams());
      this.w = ((RelativeLayout.LayoutParams)this.j[2].getLayoutParams());
      paramContext = (RelativeLayout.LayoutParams)localRelativeLayout.getLayoutParams();
      paramContext.height = ((this.a * 2 + i1 / 2) * 2);
      localRelativeLayout.setLayoutParams(paramContext);
      return;
      this.m[2].setVisibility(0);
      this.m[2].setEnabled(true);
    }
  }
  
  public void b(Context paramContext)
  {
    this.m[2].setVisibility(8);
    this.m[2].setEnabled(false);
    setState(b.b);
  }
  
  public b getCurrentState()
  {
    b localb = b.a;
    switch (c.e().c())
    {
    default: 
      return localb;
    case 0: 
      return b.a;
    case 1: 
      return b.b;
    }
    return b.c;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!isEnabled()) {
      return true;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      for (;;)
      {
        return super.onTouchEvent(paramMotionEvent);
        if (this.l == null) {
          this.l = VelocityTracker.obtain();
        }
        for (;;)
        {
          this.l.addMovement(paramMotionEvent);
          this.e = true;
          break;
          this.l.clear();
        }
        this.l.recycle();
        this.l = null;
      }
      this.l.addMovement(paramMotionEvent);
      this.l.computeCurrentVelocity(1000);
      if (Math.abs(this.l.getYVelocity()) < 10.0F) {
        return super.onTouchEvent(paramMotionEvent);
      }
    } while (!this.e);
    this.e = false;
    int i1;
    if (this.l.getYVelocity() > 0.0F)
    {
      i1 = 0;
      label168:
      if (i1 >= this.i.length) {
        break label362;
      }
      if (this.i[i1] != this.v.topMargin) {}
    }
    for (;;)
    {
      if (i1 == 2)
      {
        return super.onTouchEvent(paramMotionEvent);
        i1 += 1;
        break label168;
      }
      if (i1 + 1 == 1) {
        this.A = b.b;
      }
      if (i1 + 1 == 2) {
        this.A = b.a;
      }
      a(i1 + 1, a.b, Boolean.valueOf(true));
      break;
      if (this.l.getYVelocity() >= 0.0F) {
        break;
      }
      i1 = 0;
      label270:
      if (i1 < this.i.length) {
        if (this.i[i1] != this.v.topMargin) {}
      }
      for (;;)
      {
        if (i1 == 0)
        {
          return super.onTouchEvent(paramMotionEvent);
          i1 += 1;
          break label270;
        }
        if (i1 == 1)
        {
          this.A = b.c;
          return super.onTouchEvent(paramMotionEvent);
        }
        if (i1 == 2) {
          this.A = b.b;
        }
        a(i1, a.a, Boolean.valueOf(true));
        break;
        i1 = 0;
      }
      label362:
      i1 = 0;
    }
  }
  
  public void setOnUpDownSliding(c paramc)
  {
    this.n = paramc;
  }
  
  public void setState(b paramb)
  {
    if (paramb == this.A) {
      return;
    }
    this.A = paramb;
    if (!this.o.booleanValue())
    {
      this.o = Boolean.valueOf(true);
      switch (7.a[paramb.ordinal()])
      {
      }
      for (;;)
      {
        this.j[0].setLayoutParams(this.v);
        this.j[1].setLayoutParams(this.x);
        this.j[2].setLayoutParams(this.w);
        return;
        this.v.topMargin = this.g[1];
        this.x.topMargin = this.g[2];
        this.w.topMargin = (this.a * 4);
        this.v.leftMargin = this.h[1];
        this.x.leftMargin = this.h[2];
        this.w.leftMargin = 0;
        this.m[0].setTextColor(y);
        this.m[1].setTextColor(z);
        this.m[2].setTextColor(z);
        this.p = b.a;
        continue;
        this.v.topMargin = this.g[0];
        this.x.topMargin = this.g[1];
        this.w.topMargin = this.g[2];
        this.v.leftMargin = this.h[0];
        this.x.leftMargin = this.h[1];
        this.w.leftMargin = this.h[2];
        this.m[0].setTextColor(z);
        this.m[1].setTextColor(y);
        this.m[2].setTextColor(z);
        this.p = b.b;
        continue;
        this.v.topMargin = 0;
        this.x.topMargin = this.g[0];
        this.w.topMargin = this.g[1];
        this.v.leftMargin = 0;
        this.x.leftMargin = this.h[0];
        this.w.leftMargin = this.h[1];
        this.m[0].setTextColor(z);
        this.m[1].setTextColor(z);
        this.m[2].setTextColor(y);
        this.p = b.c;
      }
    }
    a(this.p, paramb);
  }
  
  private static enum a
  {
    private a() {}
  }
  
  public static enum b
  {
    private int d;
    
    private b(int paramInt)
    {
      this.d = paramInt;
    }
    
    public int a()
    {
      return this.d;
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(UpDownSliding.b paramb);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/UpDownSliding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */