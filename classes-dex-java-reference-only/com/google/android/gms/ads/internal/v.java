package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.client.af;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.am;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.k;
import com.google.android.gms.ads.internal.reward.client.d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abj;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abo;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.aby;
import com.google.android.gms.internal.ach;
import com.google.android.gms.internal.ack;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.ro;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.uh;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.vf;
import com.google.android.gms.internal.vg;
import com.google.android.gms.internal.vh;
import com.google.android.gms.internal.vi;
import com.google.android.gms.internal.xr;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@aaa
public final class v
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  @Nullable
  List<String> A;
  @Nullable
  k B;
  @Nullable
  public abo C = null;
  @Nullable
  View D = null;
  public int E = 0;
  boolean F = false;
  boolean G = false;
  private HashSet<abj> H = null;
  private int I = -1;
  private int J = -1;
  private ach K;
  private boolean L = true;
  private boolean M = true;
  private boolean N = false;
  final String a;
  public String b;
  public final Context c;
  final ro d;
  public final VersionInfoParcel e;
  @Nullable
  a f;
  @Nullable
  public abq g;
  @Nullable
  public abx h;
  public AdSizeParcel i;
  @Nullable
  public abi j;
  public abi.a k;
  @Nullable
  public abj l;
  @Nullable
  af m;
  @Nullable
  ag n;
  @Nullable
  am o;
  @Nullable
  ao p;
  @Nullable
  yy q;
  @Nullable
  zd r;
  @Nullable
  vf s;
  @Nullable
  vg t;
  SimpleArrayMap<String, vh> u;
  SimpleArrayMap<String, vi> v;
  NativeAdOptionsParcel w;
  @Nullable
  VideoOptionsParcel x;
  @Nullable
  ur y;
  @Nullable
  d z;
  
  public v(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel)
  {
    this(paramContext, paramAdSizeParcel, paramString, paramVersionInfoParcel, null);
  }
  
  v(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel, ro paramro)
  {
    uf.a(paramContext);
    if (u.i().e() != null)
    {
      List localList = uf.b();
      if (paramVersionInfoParcel.c != 0) {
        localList.add(Integer.toString(paramVersionInfoParcel.c));
      }
      u.i().e().a(localList);
    }
    this.a = UUID.randomUUID().toString();
    if ((paramAdSizeParcel.e) || (paramAdSizeParcel.i))
    {
      this.f = null;
      this.i = paramAdSizeParcel;
      this.b = paramString;
      this.c = paramContext;
      this.e = paramVersionInfoParcel;
      if (paramro == null) {
        break label247;
      }
    }
    for (;;)
    {
      this.d = paramro;
      this.K = new ach(200L);
      this.v = new SimpleArrayMap();
      return;
      this.f = new a(paramContext, paramString, this, this);
      this.f.setMinimumWidth(paramAdSizeParcel.g);
      this.f.setMinimumHeight(paramAdSizeParcel.d);
      this.f.setVisibility(4);
      break;
      label247:
      paramro = new ro(new i(this));
    }
  }
  
  private void b(boolean paramBoolean)
  {
    boolean bool = true;
    if ((this.f == null) || (this.j == null) || (this.j.b == null) || (this.j.b.l() == null)) {}
    while ((paramBoolean) && (!this.K.a())) {
      return;
    }
    Object localObject;
    int i1;
    int i2;
    if (this.j.b.l().b())
    {
      localObject = new int[2];
      this.f.getLocationOnScreen((int[])localObject);
      i1 = ac.a().b(this.c, localObject[0]);
      i2 = ac.a().b(this.c, localObject[1]);
      if ((i1 != this.I) || (i2 != this.J))
      {
        this.I = i1;
        this.J = i2;
        localObject = this.j.b.l();
        i1 = this.I;
        i2 = this.J;
        if (paramBoolean) {
          break label189;
        }
      }
    }
    label189:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      ((acz)localObject).a(i1, i2, paramBoolean);
      k();
      return;
    }
  }
  
  private void k()
  {
    if (this.f == null) {}
    Rect localRect1;
    Rect localRect2;
    do
    {
      View localView;
      do
      {
        return;
        localView = this.f.getRootView().findViewById(16908290);
      } while (localView == null);
      localRect1 = new Rect();
      localRect2 = new Rect();
      this.f.getGlobalVisibleRect(localRect1);
      localView.getGlobalVisibleRect(localRect2);
      if (localRect1.top != localRect2.top) {
        this.L = false;
      }
    } while (localRect1.bottom == localRect2.bottom);
    this.M = false;
  }
  
  public HashSet<abj> a()
  {
    return this.H;
  }
  
  public void a(HashSet<abj> paramHashSet)
  {
    this.H = paramHashSet;
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.E == 0) {
      c();
    }
    if (this.g != null) {
      this.g.d();
    }
    if (this.h != null) {
      this.h.d();
    }
    if (paramBoolean) {
      this.j = null;
    }
  }
  
  public void b()
  {
    if ((this.j != null) && (this.j.b != null)) {
      this.j.b.destroy();
    }
  }
  
  public void c()
  {
    if ((this.j != null) && (this.j.b != null)) {
      this.j.b.stopLoading();
    }
  }
  
  public void d()
  {
    if ((this.j != null) && (this.j.p != null)) {}
    try
    {
      this.j.p.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      abr.d("Could not destroy mediation adapter.");
    }
  }
  
  public boolean e()
  {
    return this.E == 0;
  }
  
  public boolean f()
  {
    return this.E == 1;
  }
  
  public void g()
  {
    if (this.f != null) {
      this.f.b();
    }
  }
  
  public String h()
  {
    if ((this.L) && (this.M)) {
      return "";
    }
    if (this.L)
    {
      if (this.N) {
        return "top-scrollable";
      }
      return "top-locked";
    }
    if (this.M)
    {
      if (this.N) {
        return "bottom-scrollable";
      }
      return "bottom-locked";
    }
    return "";
  }
  
  public void i()
  {
    if (this.l == null) {
      return;
    }
    if (this.j != null)
    {
      this.l.a(this.j.A);
      this.l.b(this.j.B);
      this.l.b(this.j.n);
    }
    this.l.a(this.i.e);
  }
  
  public void j()
  {
    g();
    this.n = null;
    this.o = null;
    this.r = null;
    this.q = null;
    this.y = null;
    this.p = null;
    a(false);
    if (this.f != null) {
      this.f.removeAllViews();
    }
    b();
    d();
    this.j = null;
  }
  
  public void onGlobalLayout()
  {
    b(false);
  }
  
  public void onScrollChanged()
  {
    b(true);
    this.N = true;
  }
  
  public static class a
    extends ViewSwitcher
  {
    private final aby a;
    @Nullable
    private final ack b;
    
    public a(Context paramContext, String paramString, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
    {
      super();
      this.a = new aby(paramContext);
      this.a.a(paramString);
      if ((paramContext instanceof Activity)) {}
      for (this.b = new ack((Activity)paramContext, this, paramOnGlobalLayoutListener, paramOnScrollChangedListener);; this.b = new ack(null, this, paramOnGlobalLayoutListener, paramOnScrollChangedListener))
      {
        this.b.a();
        return;
      }
    }
    
    public aby a()
    {
      return this.a;
    }
    
    public void b()
    {
      abr.e("Disable position monitoring on adFrame.");
      if (this.b != null) {
        this.b.b();
      }
    }
    
    protected void onAttachedToWindow()
    {
      super.onAttachedToWindow();
      if (this.b != null) {
        this.b.c();
      }
    }
    
    protected void onDetachedFromWindow()
    {
      super.onDetachedFromWindow();
      if (this.b != null) {
        this.b.d();
      }
    }
    
    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      this.a.a(paramMotionEvent);
      return false;
    }
    
    public void removeAllViews()
    {
      Object localObject = new ArrayList();
      int i = 0;
      while (i < getChildCount())
      {
        View localView = getChildAt(i);
        if ((localView != null) && ((localView instanceof acy))) {
          ((List)localObject).add((acy)localView);
        }
        i += 1;
      }
      super.removeAllViews();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((acy)((Iterator)localObject).next()).destroy();
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */