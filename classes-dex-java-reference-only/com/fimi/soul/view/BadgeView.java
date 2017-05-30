package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TabWidget;
import android.widget.TextView;

public class BadgeView
  extends TextView
{
  public static final int a = 1;
  public static final int b = 2;
  public static final int c = 3;
  public static final int d = 4;
  public static final int e = 5;
  public static final int f = 10;
  private static final int g = 5;
  private static final int h = 5;
  private static final int i = 8;
  private static final int j = 2;
  private static final int k = Color.parseColor("#CCFF0000");
  private static final int l = -1;
  private static Animation m;
  private static Animation n;
  private Context o;
  private View p;
  private int q;
  private int r;
  private int s;
  private int t;
  private boolean u;
  private ShapeDrawable v;
  private int w;
  
  public BadgeView(Context paramContext)
  {
    this(paramContext, (AttributeSet)null, 16842884);
  }
  
  public BadgeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public BadgeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, null, 0);
  }
  
  public BadgeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, View paramView, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    a(paramContext, paramView, paramInt2);
  }
  
  public BadgeView(Context paramContext, View paramView)
  {
    this(paramContext, null, 16842884, paramView, 0);
  }
  
  public BadgeView(Context paramContext, TabWidget paramTabWidget, int paramInt)
  {
    this(paramContext, null, 16842884, paramTabWidget, paramInt);
  }
  
  private void a(Context paramContext, View paramView, int paramInt)
  {
    this.o = paramContext;
    this.p = paramView;
    this.w = paramInt;
    this.q = 2;
    this.r = c(5);
    this.s = this.r;
    this.t = k;
    setTypeface(Typeface.DEFAULT_BOLD);
    paramInt = c(5);
    setPadding(paramInt, 0, paramInt, 0);
    setTextColor(-1);
    m = new AlphaAnimation(0.0F, 1.0F);
    m.setInterpolator(new DecelerateInterpolator());
    m.setDuration(500L);
    n = new AlphaAnimation(1.0F, 0.0F);
    n.setInterpolator(new AccelerateInterpolator());
    n.setDuration(500L);
    this.u = false;
    if (this.p != null)
    {
      a(this.p);
      return;
    }
    a();
  }
  
  private void a(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    Object localObject = paramView.getParent();
    FrameLayout localFrameLayout = new FrameLayout(this.o);
    if ((paramView instanceof TabWidget))
    {
      paramView = ((TabWidget)paramView).getChildTabViewAt(this.w);
      this.p = paramView;
      ((ViewGroup)paramView).addView(localFrameLayout, new ViewGroup.LayoutParams(-1, -1));
      setVisibility(8);
      localFrameLayout.addView(this);
      return;
    }
    localObject = (ViewGroup)localObject;
    int i1 = ((ViewGroup)localObject).indexOfChild(paramView);
    ((ViewGroup)localObject).removeView(paramView);
    ((ViewGroup)localObject).addView(localFrameLayout, i1, localLayoutParams);
    localFrameLayout.addView(paramView);
    setVisibility(8);
    localFrameLayout.addView(this);
    ((ViewGroup)localObject).invalidate();
  }
  
  private void a(boolean paramBoolean, Animation paramAnimation)
  {
    if (getBackground() == null)
    {
      if (this.v == null) {
        this.v = getDefaultBackground();
      }
      setBackgroundDrawable(this.v);
    }
    d();
    if (paramBoolean) {
      startAnimation(paramAnimation);
    }
    setVisibility(0);
    this.u = true;
  }
  
  private void a(boolean paramBoolean, Animation paramAnimation1, Animation paramAnimation2)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    if (this.u)
    {
      if ((paramBoolean) && (paramAnimation2 != null)) {}
      for (paramBoolean = bool1;; paramBoolean = false)
      {
        b(paramBoolean, paramAnimation2);
        return;
      }
    }
    if ((paramBoolean) && (paramAnimation1 != null)) {}
    for (paramBoolean = bool2;; paramBoolean = false)
    {
      a(paramBoolean, paramAnimation1);
      return;
    }
  }
  
  private void b(boolean paramBoolean, Animation paramAnimation)
  {
    setVisibility(8);
    if (paramBoolean) {
      startAnimation(paramAnimation);
    }
    this.u = false;
  }
  
  private int c(int paramInt)
  {
    Resources localResources = getResources();
    return (int)TypedValue.applyDimension(1, paramInt, localResources.getDisplayMetrics());
  }
  
  private void d()
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    switch (this.q)
    {
    }
    for (;;)
    {
      setLayoutParams(localLayoutParams);
      return;
      localLayoutParams.gravity = 51;
      localLayoutParams.setMargins(this.r, this.s, 0, 0);
      continue;
      localLayoutParams.gravity = 53;
      localLayoutParams.setMargins(0, this.s, this.r, 0);
      continue;
      localLayoutParams.gravity = 83;
      localLayoutParams.setMargins(this.r, 0, 0, this.s);
      continue;
      localLayoutParams.gravity = 85;
      localLayoutParams.setMargins(0, 0, this.r, this.s);
      continue;
      localLayoutParams.gravity = 17;
      localLayoutParams.setMargins(0, 0, 0, 0);
      continue;
      localLayoutParams.gravity = 17;
      localLayoutParams.setMargins(this.r, 0, 0, 0);
    }
  }
  
  private ShapeDrawable getDefaultBackground()
  {
    int i1 = c(8);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { i1, i1, i1, i1, i1, i1, i1, i1 }, null, null));
    localShapeDrawable.getPaint().setColor(this.t);
    return localShapeDrawable;
  }
  
  public int a(int paramInt)
  {
    int i2 = 0;
    CharSequence localCharSequence = getText();
    int i1 = i2;
    if (localCharSequence != null) {}
    try
    {
      i1 = Integer.parseInt(localCharSequence.toString());
      paramInt = i1 + paramInt;
      setText(String.valueOf(paramInt));
      return paramInt;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        i1 = i2;
      }
    }
  }
  
  public void a()
  {
    a(false, null);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.r = paramInt1;
    this.s = paramInt2;
  }
  
  public void a(Animation paramAnimation)
  {
    a(true, paramAnimation);
  }
  
  public void a(Animation paramAnimation1, Animation paramAnimation2)
  {
    a(true, paramAnimation1, paramAnimation2);
  }
  
  public void a(boolean paramBoolean)
  {
    a(paramBoolean, m);
  }
  
  public int b(int paramInt)
  {
    return a(-paramInt);
  }
  
  public void b()
  {
    b(false, null);
  }
  
  public void b(Animation paramAnimation)
  {
    b(true, paramAnimation);
  }
  
  public void b(boolean paramBoolean)
  {
    b(paramBoolean, n);
  }
  
  public void c()
  {
    a(false, null, null);
  }
  
  public void c(boolean paramBoolean)
  {
    a(paramBoolean, m, n);
  }
  
  public int getBadgeBackgroundColor()
  {
    return this.t;
  }
  
  public int getBadgePosition()
  {
    return this.q;
  }
  
  public int getHorizontalBadgeMargin()
  {
    return this.r;
  }
  
  public View getTarget()
  {
    return this.p;
  }
  
  public int getVerticalBadgeMargin()
  {
    return this.s;
  }
  
  public boolean isShown()
  {
    return this.u;
  }
  
  public void setBadgeBackgroundColor(int paramInt)
  {
    this.t = paramInt;
    this.v = getDefaultBackground();
  }
  
  public void setBadgeMargin(int paramInt)
  {
    this.r = paramInt;
    this.s = paramInt;
  }
  
  public void setBadgePosition(int paramInt)
  {
    this.q = paramInt;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/BadgeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */