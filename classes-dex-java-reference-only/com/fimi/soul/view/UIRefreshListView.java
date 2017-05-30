package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UIRefreshListView
  extends ListView
  implements AbsListView.OnScrollListener
{
  private static final String a = "MM-dd HH:mm";
  private static final int b = 3;
  private static final int c = 0;
  private static final int d = 1;
  private static final int e = 2;
  private static final int f = 3;
  private static final int g = 4;
  private static final int h = 1;
  private static final int i = 2;
  private static final int j = 3;
  private RotateAnimation A;
  private boolean B;
  private int C;
  private int D;
  private int E;
  private boolean F;
  private int G;
  private int H;
  private int I;
  private boolean J;
  private c K;
  private b L;
  private a M;
  private int k;
  private int l;
  private boolean m = false;
  private boolean n = false;
  private boolean o = true;
  private boolean p = false;
  private LayoutInflater q;
  private LinearLayout r;
  private TextView s;
  private TextView t;
  private ImageView u;
  private ProgressBar v;
  private View w;
  private ProgressBar x;
  private TextView y;
  private RotateAnimation z;
  
  public UIRefreshListView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public UIRefreshListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public UIRefreshListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(int paramInt)
  {
    if (paramInt > 0) {}
    for (;;)
    {
      LinearInterpolator localLinearInterpolator = new LinearInterpolator();
      this.z = new RotateAnimation(0.0F, -180.0F, 1, 0.5F, 1, 0.5F);
      this.z.setInterpolator(localLinearInterpolator);
      this.z.setDuration(paramInt);
      this.z.setFillAfter(true);
      this.A = new RotateAnimation(-180.0F, 0.0F, 1, 0.5F, 1, 0.5F);
      this.A.setInterpolator(localLinearInterpolator);
      this.A.setDuration(paramInt);
      this.A.setFillAfter(true);
      return;
      paramInt = 250;
    }
  }
  
  private void a(Context paramContext)
  {
    setCacheColorHint(paramContext.getResources().getColor(17170445));
    this.q = LayoutInflater.from(paramContext);
    h();
    i();
    setOnScrollListener(this);
    a(0);
  }
  
  private void a(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams2 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new ViewGroup.LayoutParams(-1, -2);
    }
    int i2 = ViewGroup.getChildMeasureSpec(0, 0, localLayoutParams1.width);
    int i1 = localLayoutParams1.height;
    if (i1 > 0) {}
    for (i1 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);; i1 = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(i2, i1);
      return;
    }
  }
  
  private void h()
  {
    this.r = ((LinearLayout)this.q.inflate(2130968775, null));
    this.u = ((ImageView)this.r.findViewById(2131690517));
    this.u.setMinimumWidth(70);
    this.u.setMinimumHeight(50);
    this.v = ((ProgressBar)this.r.findViewById(2131690518));
    this.s = ((TextView)this.r.findViewById(2131690519));
    this.t = ((TextView)this.r.findViewById(2131690520));
    a(this.r);
    this.D = this.r.getMeasuredHeight();
    this.C = this.r.getMeasuredWidth();
    this.r.setPadding(0, this.D * -1, 0, 0);
    this.r.invalidate();
    Log.v("size", "width:" + this.C + " height:" + this.D);
    addHeaderView(this.r, null, false);
    this.k = 3;
  }
  
  private void i()
  {
    this.w = this.q.inflate(2130968774, null);
    this.w.setVisibility(0);
    this.x = ((ProgressBar)this.w.findViewById(2131690514));
    this.y = ((TextView)this.w.findViewById(2131690515));
    this.w.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (UIRefreshListView.c(UIRefreshListView.this))
        {
          if (!UIRefreshListView.d(UIRefreshListView.this)) {
            break label59;
          }
          if ((UIRefreshListView.e(UIRefreshListView.this) != 1) && (UIRefreshListView.f(UIRefreshListView.this) != 2))
          {
            UIRefreshListView.a(UIRefreshListView.this, 1);
            UIRefreshListView.g(UIRefreshListView.this);
          }
        }
        label59:
        while (UIRefreshListView.e(UIRefreshListView.this) == 1) {
          return;
        }
        UIRefreshListView.a(UIRefreshListView.this, 1);
        UIRefreshListView.g(UIRefreshListView.this);
      }
    });
    addFooterView(this.w);
    if (this.o)
    {
      this.l = 3;
      return;
    }
    this.l = 2;
  }
  
  private void j()
  {
    if (this.m) {}
    switch (this.l)
    {
    default: 
    case 1: 
      do
      {
        return;
      } while (this.y.getText().equals(Integer.valueOf(2131362599)));
      this.y.setText(2131362599);
      this.y.setVisibility(0);
      this.x.setVisibility(0);
      return;
    case 2: 
      this.y.setText(2131362601);
      this.y.setVisibility(0);
      this.x.setVisibility(8);
      this.w.setVisibility(0);
      return;
    }
    this.y.setText(2131362602);
    this.y.setVisibility(0);
    this.x.setVisibility(8);
    this.w.setVisibility(0);
  }
  
  private void k()
  {
    switch (this.k)
    {
    default: 
      return;
    case 0: 
      this.u.setVisibility(0);
      this.v.setVisibility(8);
      this.s.setVisibility(0);
      this.t.setVisibility(0);
      this.u.clearAnimation();
      this.u.startAnimation(this.z);
      this.s.setText(2131362606);
      return;
    case 1: 
      this.v.setVisibility(8);
      this.s.setVisibility(0);
      this.t.setVisibility(0);
      this.u.clearAnimation();
      this.u.setVisibility(0);
      if (this.F)
      {
        this.F = false;
        this.u.clearAnimation();
        this.u.startAnimation(this.A);
        this.s.setText(2131362604);
        return;
      }
      this.s.setText(2131362604);
      return;
    case 2: 
      this.r.setPadding(0, 0, 0, 0);
      this.v.setVisibility(0);
      this.u.clearAnimation();
      this.u.setVisibility(8);
      this.s.setText(2131362600);
      this.t.setVisibility(0);
      return;
    }
    this.r.setPadding(0, this.D * -1, 0, 0);
    this.v.setVisibility(8);
    this.u.clearAnimation();
    this.u.setImageResource(2130838544);
    this.s.setText(2131362604);
    this.t.setVisibility(0);
  }
  
  private void l()
  {
    if (this.K != null) {
      this.K.a();
    }
  }
  
  private void m()
  {
    if (this.L != null)
    {
      this.y.setText(2131362599);
      this.y.setVisibility(0);
      this.x.setVisibility(0);
      this.L.a();
    }
  }
  
  public boolean a()
  {
    return this.m;
  }
  
  public boolean b()
  {
    return this.n;
  }
  
  public boolean c()
  {
    return this.o;
  }
  
  public boolean d()
  {
    return this.p;
  }
  
  public void e()
  {
    if (this.p) {
      setSelection(0);
    }
    this.k = 3;
    this.t.setText(getResources().getString(2131362605) + new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA).format(new Date()));
    k();
  }
  
  public void f()
  {
    if (this.o) {}
    for (this.l = 3;; this.l = 2)
    {
      j();
      return;
    }
  }
  
  public void g()
  {
    removeFooterView(this.w);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.G = paramInt1;
    this.H = (paramInt1 + paramInt2 - 2);
    this.I = (paramInt3 - 2);
    if (paramInt3 > paramInt2) {}
    for (this.J = true;; this.J = false)
    {
      if (this.M != null) {
        this.M.a(paramAbsListView, paramInt1, paramInt2, paramInt3);
      }
      return;
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (this.m) {
      if ((this.H == this.I) && (paramInt == 0) && (this.l != 1))
      {
        if (!this.o) {
          break label100;
        }
        if (!this.n) {
          break label84;
        }
        if (this.k != 2)
        {
          this.l = 1;
          m();
          j();
        }
      }
    }
    for (;;)
    {
      if (this.M != null) {
        this.M.a(paramAbsListView, paramInt);
      }
      return;
      label84:
      this.l = 1;
      m();
      j();
      continue;
      label100:
      this.l = 2;
      j();
      continue;
      if ((this.w != null) && (this.w.getVisibility() == 0))
      {
        System.out.println("this.removeFooterView(endRootView);...");
        this.w.setVisibility(8);
        removeFooterView(this.w);
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.n)
    {
      if ((this.m) && (this.l == 1)) {
        return super.onTouchEvent(paramMotionEvent);
      }
      switch (paramMotionEvent.getAction())
      {
      }
    }
    int i1;
    do
    {
      for (;;)
      {
        return super.onTouchEvent(paramMotionEvent);
        if ((this.G == 0) && (!this.B))
        {
          this.B = true;
          this.E = ((int)paramMotionEvent.getY());
          continue;
          if ((this.k != 2) && (this.k != 4))
          {
            if ((this.k != 3) || (this.k == 1))
            {
              this.k = 3;
              k();
            }
            if (this.k == 0)
            {
              this.k = 2;
              k();
              l();
            }
          }
          this.B = false;
          this.F = false;
        }
      }
      i1 = (int)paramMotionEvent.getY();
      if ((!this.B) && (this.G == 0))
      {
        this.B = true;
        this.E = i1;
      }
    } while ((this.k == 2) || (!this.B) || (this.k == 4));
    if (this.k == 0)
    {
      setSelection(0);
      if (((i1 - this.E) / 3 < this.D) && (i1 - this.E > 0))
      {
        this.k = 1;
        k();
      }
    }
    else
    {
      label269:
      if (this.k == 1)
      {
        setSelection(0);
        if ((i1 - this.E) / 3 < this.D) {
          break label424;
        }
        this.k = 0;
        this.F = true;
        k();
      }
    }
    for (;;)
    {
      if ((this.k == 3) && (i1 - this.E > 0))
      {
        this.k = 1;
        k();
      }
      if (this.k == 1) {
        this.r.setPadding(0, this.D * -1 + (i1 - this.E) / 3, 0, 0);
      }
      if (this.k != 0) {
        break;
      }
      this.r.setPadding(0, (i1 - this.E) / 3 - this.D, 0, 0);
      break;
      if (i1 - this.E > 0) {
        break label269;
      }
      this.k = 3;
      k();
      break label269;
      label424:
      if (i1 - this.E <= 0)
      {
        this.k = 3;
        k();
      }
    }
  }
  
  public void setAdapter(BaseAdapter paramBaseAdapter)
  {
    this.t.setText(getResources().getString(2131362605) + new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA).format(new Date()));
    super.setAdapter(paramBaseAdapter);
  }
  
  public void setAutoLoadMore(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public void setCanLoadMore(final boolean paramBoolean)
  {
    this.m = paramBoolean;
    if (this.w == null) {
      i();
    }
    this.w.post(new Runnable()
    {
      public void run()
      {
        View localView;
        if ((paramBoolean) && (UIRefreshListView.this.getFooterViewsCount() == 0))
        {
          UIRefreshListView.a(UIRefreshListView.this);
          localView = UIRefreshListView.b(UIRefreshListView.this);
          if (!paramBoolean) {
            break label82;
          }
          i = 0;
          label41:
          localView.setVisibility(i);
          localView = UIRefreshListView.b(UIRefreshListView.this);
          if (!paramBoolean) {
            break label88;
          }
        }
        label82:
        label88:
        for (int i = 0;; i = -UIRefreshListView.b(UIRefreshListView.this).getHeight())
        {
          localView.setPadding(0, i, 0, 0);
          return;
          UIRefreshListView.this.g();
          break;
          i = 8;
          break label41;
        }
      }
    });
  }
  
  public void setCanRefresh(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public void setListViewOnScrollListener(a parama)
  {
    this.M = parama;
  }
  
  public void setMoveToFirstItemAfterRefresh(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public void setOnLoadListener(b paramb)
  {
    if (paramb != null)
    {
      this.L = paramb;
      if ((this.m) && (getFooterViewsCount() == 0)) {
        i();
      }
    }
  }
  
  public void setOnRefreshListener(c paramc)
  {
    if (paramc != null) {
      this.K = paramc;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(AbsListView paramAbsListView, int paramInt);
    
    public abstract void a(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3);
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
  
  public static abstract interface c
  {
    public abstract void a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/UIRefreshListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */