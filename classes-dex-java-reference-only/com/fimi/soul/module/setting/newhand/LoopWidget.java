package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.b.a.b.a.g;
import com.b.a.b.c.a;
import com.b.a.b.d;
import com.b.a.b.e.a;
import java.util.ArrayList;
import java.util.List;

public class LoopWidget
  extends FrameLayout
{
  private int a;
  private d b;
  private List<ImageView> c;
  private Context d;
  private ViewPager e;
  private boolean f;
  private int g;
  private int h;
  private LinearLayout i;
  private List<ImageView> j;
  private Handler k = new Handler();
  private com.b.a.b.c l;
  private final Runnable m = new Runnable()
  {
    public void run()
    {
      if (LoopWidget.a(LoopWidget.this))
      {
        LoopWidget.a(LoopWidget.this, LoopWidget.b(LoopWidget.this) % (LoopWidget.c(LoopWidget.this) + 1) + 1);
        if (LoopWidget.b(LoopWidget.this) == 1)
        {
          LoopWidget.d(LoopWidget.this).setCurrentItem(LoopWidget.b(LoopWidget.this), false);
          LoopWidget.f(LoopWidget.this).post(LoopWidget.e(LoopWidget.this));
          return;
        }
        LoopWidget.d(LoopWidget.this).setCurrentItem(LoopWidget.b(LoopWidget.this));
        LoopWidget.f(LoopWidget.this).postDelayed(LoopWidget.e(LoopWidget.this), 2000L);
        return;
      }
      LoopWidget.f(LoopWidget.this).postDelayed(LoopWidget.e(LoopWidget.this), 5000L);
    }
  };
  
  public LoopWidget(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public LoopWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LoopWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.d = paramContext;
    a(paramContext);
    a();
  }
  
  private void a()
  {
    this.c = new ArrayList();
    this.j = new ArrayList();
    this.h = 400;
  }
  
  private void a(int[] paramArrayOfInt)
  {
    this.a = paramArrayOfInt.length;
    int n = 0;
    ImageView localImageView;
    while (n < this.a)
    {
      localImageView = new ImageView(this.d);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
      localLayoutParams.leftMargin = 5;
      localLayoutParams.rightMargin = 5;
      localImageView.setImageResource(2130837877);
      this.i.addView(localImageView, localLayoutParams);
      this.j.add(localImageView);
      n += 1;
    }
    ((ImageView)this.j.get(0)).setImageResource(2130837878);
    n = 0;
    if (n <= this.a + 1)
    {
      localImageView = new ImageView(this.d);
      localImageView.setScaleType(ImageView.ScaleType.FIT_XY);
      if (n == 0) {
        localImageView.setImageResource(paramArrayOfInt[(this.a - 1)]);
      }
      for (;;)
      {
        this.c.add(localImageView);
        n += 1;
        break;
        if (n == this.a + 1) {
          localImageView.setImageResource(paramArrayOfInt[0]);
        } else {
          localImageView.setImageResource(paramArrayOfInt[(n - 1)]);
        }
      }
    }
  }
  
  private void a(String[] paramArrayOfString)
  {
    this.a = paramArrayOfString.length;
    int n = 0;
    ImageView localImageView;
    while (n < this.a)
    {
      localImageView = new ImageView(this.d);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
      localLayoutParams.leftMargin = 5;
      localLayoutParams.rightMargin = 5;
      localImageView.setImageResource(2130837877);
      this.i.addView(localImageView, localLayoutParams);
      this.j.add(localImageView);
      n += 1;
    }
    ((ImageView)this.j.get(0)).setImageResource(2130837878);
    n = 0;
    if (n <= this.a + 1)
    {
      localImageView = new ImageView(this.d);
      localImageView.setScaleType(ImageView.ScaleType.FIT_XY);
      if (n == 0) {
        this.b.a(paramArrayOfString[(this.a - 1)], localImageView, this.l);
      }
      for (;;)
      {
        this.c.add(localImageView);
        n += 1;
        break;
        if (n == this.a + 1) {
          this.b.a(paramArrayOfString[0], localImageView, this.l);
        } else {
          this.b.a(paramArrayOfString[(n - 1)], localImageView, this.l);
        }
      }
    }
  }
  
  private void b()
  {
    this.c.clear();
    View localView = LayoutInflater.from(this.d).inflate(2130968721, this, true);
    this.e = ((ViewPager)localView.findViewById(2131690345));
    this.i = ((LinearLayout)localView.findViewById(2131690346));
    this.i.setVisibility(8);
    this.i.removeAllViews();
  }
  
  private void c()
  {
    this.e.setAdapter(new a());
    this.e.setFocusable(true);
    this.e.setCurrentItem(1);
    this.g = 1;
    this.e.setOnPageChangeListener(new b());
    d();
  }
  
  private void d()
  {
    this.f = true;
    this.k.postDelayed(this.m, 2000L);
  }
  
  public void a(Context paramContext)
  {
    paramContext = new e.a(paramContext).b(3).a().b(new com.b.a.a.a.b.c()).a(g.b).b().c();
    d.a().a(paramContext);
    this.l = new c.a().b(true).d(true).d();
    this.b = d.a();
  }
  
  public void setImagesRes(int[] paramArrayOfInt)
  {
    b();
    a(paramArrayOfInt);
    c();
  }
  
  public void setImagesUrl(String[] paramArrayOfString)
  {
    b();
    a(paramArrayOfString);
    c();
  }
  
  class a
    extends PagerAdapter
  {
    a() {}
    
    public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      paramViewGroup.removeView((View)LoopWidget.g(LoopWidget.this).get(paramInt));
    }
    
    public int getCount()
    {
      return LoopWidget.g(LoopWidget.this).size();
    }
    
    public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup.addView((View)LoopWidget.g(LoopWidget.this).get(paramInt));
      return LoopWidget.g(LoopWidget.this).get(paramInt);
    }
    
    public boolean isViewFromObject(View paramView, Object paramObject)
    {
      return paramView == paramObject;
    }
  }
  
  class b
    implements ViewPager.OnPageChangeListener
  {
    b() {}
    
    public void onPageScrollStateChanged(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return;
      case 1: 
        LoopWidget.a(LoopWidget.this, false);
        return;
      case 2: 
        LoopWidget.a(LoopWidget.this, true);
        return;
      }
      if (LoopWidget.d(LoopWidget.this).getCurrentItem() == 0) {
        LoopWidget.d(LoopWidget.this).setCurrentItem(LoopWidget.c(LoopWidget.this), false);
      }
      for (;;)
      {
        LoopWidget.a(LoopWidget.this, LoopWidget.d(LoopWidget.this).getCurrentItem());
        LoopWidget.a(LoopWidget.this, true);
        return;
        if (LoopWidget.d(LoopWidget.this).getCurrentItem() == LoopWidget.c(LoopWidget.this) + 1) {
          LoopWidget.d(LoopWidget.this).setCurrentItem(1, false);
        }
      }
    }
    
    public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
    
    public void onPageSelected(int paramInt)
    {
      int i = 0;
      if (i < LoopWidget.h(LoopWidget.this).size())
      {
        if (i == paramInt - 1) {
          ((ImageView)LoopWidget.h(LoopWidget.this).get(i)).setImageResource(2130837878);
        }
        for (;;)
        {
          i += 1;
          break;
          ((ImageView)LoopWidget.h(LoopWidget.this).get(i)).setImageResource(2130837877);
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/newhand/LoopWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */