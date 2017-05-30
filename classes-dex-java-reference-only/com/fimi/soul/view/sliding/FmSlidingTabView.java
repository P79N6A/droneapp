package com.fimi.soul.view.sliding;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.fimi.kernel.utils.k;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"NewApi"})
public class FmSlidingTabView
  extends LinearLayout
{
  public int a;
  private Context b;
  private Runnable c;
  private ViewPager.OnPageChangeListener d;
  private int e;
  private int f = -1;
  private int g = 30;
  private int h = -16777216;
  private int i = -16777216;
  private LinearLayout j = null;
  private HorizontalScrollView k = null;
  private FmViewPager l;
  private List<String> m = null;
  private List<Drawable> n = null;
  private ArrayList<Fragment> o = null;
  private ArrayList<TextView> p = null;
  private FmFragmentPagerAdapter q = null;
  private View.OnClickListener r = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      paramAnonymousView = (FmTabItemView)paramAnonymousView;
      FmSlidingTabView.a(FmSlidingTabView.this).setCurrentItem(paramAnonymousView.getIndex());
    }
  };
  
  public FmSlidingTabView(Fragment paramFragment)
  {
    super(paramFragment.getActivity());
    this.b = paramFragment.getActivity();
    a();
    if (Build.VERSION.SDK_INT <= 17)
    {
      k.c(FmSlidingTabView.class, "AbSlidingTabView(Fragment fragment) 要求最低SDK版本17");
      return;
    }
    this.q = new FmFragmentPagerAdapter(paramFragment.getChildFragmentManager(), this.o);
    this.l.setAdapter(this.q);
    this.l.setOnPageChangeListener(new MyOnPageChangeListener());
    this.l.setOffscreenPageLimit(3);
    addView(this.l, new LinearLayout.LayoutParams(-1, -1));
  }
  
  public FmSlidingTabView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FmSlidingTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = paramContext;
    a();
    this.q = new FmFragmentPagerAdapter(((FragmentActivity)this.b).getFragmentManager(), this.o);
    this.l.setAdapter(this.q);
    this.l.setOnPageChangeListener(new MyOnPageChangeListener());
    this.l.setOffscreenPageLimit(3);
    addView(this.l, new LinearLayout.LayoutParams(-1, -1));
  }
  
  private void a(String paramString, int paramInt)
  {
    a(paramString, paramInt, null);
  }
  
  private void a(String paramString, int paramInt, Drawable paramDrawable)
  {
    FmTabItemView localFmTabItemView = new FmTabItemView(this.b);
    if (this.f != -1) {
      localFmTabItemView.setTabBackgroundResource(this.f);
    }
    if (paramDrawable != null) {
      localFmTabItemView.a(null, paramDrawable, null, null);
    }
    localFmTabItemView.setTabTextColor(this.h);
    localFmTabItemView.setTabTextSize(this.g);
    localFmTabItemView.a(paramInt, paramString);
    this.p.add(localFmTabItemView.getTextView());
    localFmTabItemView.setOnClickListener(this.r);
    this.j.addView(localFmTabItemView, new LinearLayout.LayoutParams(0, -1, 1.0F));
  }
  
  private void b(int paramInt)
  {
    final View localView = this.j.getChildAt(paramInt);
    if (this.c != null) {
      removeCallbacks(this.c);
    }
    this.c = new Runnable()
    {
      public void run()
      {
        int i = localView.getLeft();
        int j = (FmSlidingTabView.this.getWidth() - localView.getWidth()) / 2;
        FmSlidingTabView.c(FmSlidingTabView.this).smoothScrollTo(i - j, 0);
        FmSlidingTabView.a(FmSlidingTabView.this, null);
      }
    };
    post(this.c);
  }
  
  public void a()
  {
    setOrientation(1);
    setBackgroundColor(Color.rgb(255, 255, 255));
    this.k = new HorizontalScrollView(this.b);
    this.k.setHorizontalScrollBarEnabled(false);
    this.k.setSmoothScrollingEnabled(true);
    this.j = new LinearLayout(this.b);
    this.j.setOrientation(0);
    this.j.setGravity(17);
    this.k.addView(this.j, new ViewGroup.LayoutParams(-2, -1));
    addView(this.k, new ViewGroup.LayoutParams(-1, -2));
    this.l = new FmViewPager(this.b);
    this.l.setId(1985);
    this.o = new ArrayList();
    this.p = new ArrayList();
    this.m = new ArrayList();
    this.n = new ArrayList();
    if (!(this.b instanceof FragmentActivity)) {
      k.c(FmSlidingTabView.class, "构造AbSlidingTabView的参数context,必须是FragmentActivity的实例。");
    }
  }
  
  public void a(int paramInt)
  {
    this.j.removeViewAt(paramInt);
    this.o.remove(paramInt);
    this.p.remove(paramInt);
    this.n.remove(paramInt);
    this.m.remove(paramInt);
    this.q.notifyDataSetChanged();
    b();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    while (i1 < this.p.size())
    {
      ((TextView)this.p.get(i1)).setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
      i1 += 1;
    }
  }
  
  public void a(String paramString, Fragment paramFragment)
  {
    this.m.add(paramString);
    this.o.add(paramFragment);
    this.q.notifyDataSetChanged();
    b();
  }
  
  public void a(String paramString, Fragment paramFragment, Drawable paramDrawable)
  {
    this.m.add(paramString);
    this.o.add(paramFragment);
    this.n.add(paramDrawable);
    this.q.notifyDataSetChanged();
    b();
  }
  
  public void a(List<String> paramList, List<Fragment> paramList1)
  {
    this.m.addAll(paramList);
    this.o.addAll(paramList1);
    this.q.notifyDataSetChanged();
    b();
  }
  
  public void a(List<String> paramList, List<Fragment> paramList1, List<Drawable> paramList2)
  {
    this.m.addAll(paramList);
    this.o.addAll(paramList1);
    this.n.addAll(paramList2);
    this.q.notifyDataSetChanged();
    b();
  }
  
  public void b()
  {
    this.j.removeAllViews();
    this.p.clear();
    int i2 = this.q.getCount();
    int i1 = 0;
    if (i1 < i2)
    {
      if (this.n.size() > 0) {
        a((String)this.m.get(i1), i1, (Drawable)this.n.get(i1));
      }
      for (;;)
      {
        i1 += 1;
        break;
        a((String)this.m.get(i1), i1);
      }
    }
    if (this.e > i2) {
      this.e = (i2 - 1);
    }
    setCurrentItem(this.e);
    requestLayout();
  }
  
  public void c()
  {
    this.j.removeAllViews();
    this.o.clear();
    this.p.clear();
    this.n.clear();
    this.m.clear();
    this.q.notifyDataSetChanged();
    b();
  }
  
  public ViewPager getViewPager()
  {
    return this.l;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.c != null) {
      post(this.c);
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.c != null) {
      removeCallbacks(this.c);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    if (i1 == 1073741824)
    {
      bool = true;
      this.k.setFillViewport(bool);
      int i2 = this.j.getChildCount();
      if ((i2 <= 1) || ((i1 != 1073741824) && (i1 != Integer.MIN_VALUE))) {
        break label127;
      }
      if (i2 <= 2) {
        break label114;
      }
      this.a = ((int)(View.MeasureSpec.getSize(paramInt1) * 0.4F));
    }
    for (;;)
    {
      i1 = getMeasuredWidth();
      super.onMeasure(paramInt1, paramInt2);
      paramInt1 = getMeasuredWidth();
      if ((bool) && (i1 != paramInt1)) {
        setCurrentItem(this.e);
      }
      return;
      bool = false;
      break;
      label114:
      this.a = (View.MeasureSpec.getSize(paramInt1) / 2);
      continue;
      label127:
      this.a = -1;
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    if (this.l == null) {
      throw new IllegalStateException("ViewPager has not been bound.");
    }
    this.e = paramInt;
    int i2 = this.j.getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      FmTabItemView localFmTabItemView = (FmTabItemView)this.j.getChildAt(i1);
      boolean bool;
      if (i1 == paramInt)
      {
        bool = true;
        label59:
        localFmTabItemView.setSelected(bool);
        if (!bool) {
          break label98;
        }
        localFmTabItemView.setTabTextColor(this.i);
        b(paramInt);
      }
      for (;;)
      {
        i1 += 1;
        break;
        bool = false;
        break label59;
        label98:
        localFmTabItemView.setTabTextColor(this.h);
      }
    }
  }
  
  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.d = paramOnPageChangeListener;
  }
  
  public void setSlidingEnabled(boolean paramBoolean)
  {
    this.l.setPagingEnabled(paramBoolean);
  }
  
  public void setTabBackgroundResource(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void setTabLayoutBackgroundResource(int paramInt)
  {
    this.j.setBackgroundResource(paramInt);
  }
  
  public void setTabSelectColor(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void setTabTextColor(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void setTabTextSize(int paramInt)
  {
    this.g = paramInt;
  }
  
  public class MyOnPageChangeListener
    implements ViewPager.OnPageChangeListener
  {
    public MyOnPageChangeListener() {}
    
    public void onPageScrollStateChanged(int paramInt)
    {
      if (FmSlidingTabView.b(FmSlidingTabView.this) != null) {
        FmSlidingTabView.b(FmSlidingTabView.this).onPageScrollStateChanged(paramInt);
      }
    }
    
    public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
    {
      if (FmSlidingTabView.b(FmSlidingTabView.this) != null) {
        FmSlidingTabView.b(FmSlidingTabView.this).onPageScrolled(paramInt1, paramFloat, paramInt2);
      }
    }
    
    public void onPageSelected(int paramInt)
    {
      FmSlidingTabView.this.setCurrentItem(paramInt);
      if (FmSlidingTabView.b(FmSlidingTabView.this) != null) {
        FmSlidingTabView.b(FmSlidingTabView.this).onPageSelected(paramInt);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/sliding/FmSlidingTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */