package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.c;
import com.google.android.gms.ads.internal.purchase.f;
import com.google.android.gms.ads.internal.purchase.i;
import com.google.android.gms.ads.internal.purchase.j;
import com.google.android.gms.ads.internal.purchase.k;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel.a;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abj;
import com.google.android.gms.internal.abk;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abo;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.abw;
import com.google.android.gms.internal.abz;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.ti;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.un;
import com.google.android.gms.internal.vv;
import com.google.android.gms.internal.wh;
import com.google.android.gms.internal.xg;
import com.google.android.gms.internal.xh;
import com.google.android.gms.internal.xi;
import com.google.android.gms.internal.xj;
import com.google.android.gms.internal.xm;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.xr;
import com.google.android.gms.internal.yv;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zd;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;

@aaa
public abstract class b
  extends a
  implements com.google.android.gms.ads.internal.overlay.g, j, s, vv, xi
{
  protected final xq j;
  protected transient boolean k;
  private final Messenger l;
  
  public b(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, VersionInfoParcel paramVersionInfoParcel, d paramd)
  {
    this(new v(paramContext, paramAdSizeParcel, paramString, paramVersionInfoParcel), paramxq, null, paramd);
  }
  
  protected b(v paramv, xq paramxq, @Nullable r paramr, d paramd)
  {
    super(paramv, paramr, paramd);
    this.j = paramxq;
    this.l = new Messenger(new yv(this.f.c));
    this.k = false;
  }
  
  private AdRequestInfoParcel.a a(AdRequestParcel paramAdRequestParcel, Bundle paramBundle, abk paramabk)
  {
    ApplicationInfo localApplicationInfo = this.f.c.getApplicationInfo();
    DisplayMetrics localDisplayMetrics;
    Object localObject1;
    String str2;
    String str3;
    long l1;
    String str4;
    Bundle localBundle;
    ArrayList localArrayList;
    PackageInfo localPackageInfo2;
    try
    {
      PackageInfo localPackageInfo1 = this.f.c.getPackageManager().getPackageInfo(localApplicationInfo.packageName, 0);
      localDisplayMetrics = this.f.c.getResources().getDisplayMetrics();
      Object localObject2 = null;
      localObject1 = localObject2;
      if (this.f.f != null)
      {
        localObject1 = localObject2;
        if (this.f.f.getParent() != null)
        {
          localObject1 = new int[2];
          this.f.f.getLocationOnScreen((int[])localObject1);
          int n = localObject1[0];
          int i1 = localObject1[1];
          int i2 = this.f.f.getWidth();
          int i3 = this.f.f.getHeight();
          int m = 0;
          i = m;
          if (this.f.f.isShown())
          {
            i = m;
            if (n + i2 > 0)
            {
              i = m;
              if (i1 + i3 > 0)
              {
                i = m;
                if (n <= localDisplayMetrics.widthPixels)
                {
                  i = m;
                  if (i1 <= localDisplayMetrics.heightPixels) {
                    i = 1;
                  }
                }
              }
            }
          }
          localObject1 = new Bundle(5);
          ((Bundle)localObject1).putInt("x", n);
          ((Bundle)localObject1).putInt("y", i1);
          ((Bundle)localObject1).putInt("width", i2);
          ((Bundle)localObject1).putInt("height", i3);
          ((Bundle)localObject1).putInt("visible", i);
        }
      }
      str2 = u.i().c();
      this.f.l = new abj(str2, this.f.b);
      this.f.l.a(paramAdRequestParcel);
      str3 = u.e().a(this.f.c, this.f.f, this.f.i);
      l2 = 0L;
      l1 = l2;
      if (this.f.p == null) {}
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      try
      {
        l1 = this.f.p.b();
        str4 = UUID.randomUUID().toString();
        localBundle = u.i().a(this.f.c, this, str2);
        localArrayList = new ArrayList();
        int i = 0;
        while (i < this.f.v.size())
        {
          localArrayList.add((String)this.f.v.keyAt(i));
          i += 1;
          continue;
          localNameNotFoundException = localNameNotFoundException;
          localPackageInfo2 = null;
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          long l2;
          abr.d("Cannot get correlation id, default to 0.");
          l1 = l2;
        }
      }
    }
    boolean bool1;
    if (this.f.q != null)
    {
      bool1 = true;
      if ((this.f.r == null) || (!u.i().r())) {
        break label819;
      }
    }
    label819:
    for (boolean bool2 = true;; bool2 = false)
    {
      boolean bool3 = this.i.c.a(this.f.c);
      String str1 = "";
      Object localObject3 = str1;
      if (((Boolean)uf.cu.c()).booleanValue())
      {
        abr.a("Getting webview cookie from CookieManager.");
        CookieManager localCookieManager = u.g().b(this.f.c);
        localObject3 = str1;
        if (localCookieManager != null) {
          localObject3 = localCookieManager.getCookie("googleads.g.doubleclick.net");
        }
      }
      str1 = null;
      if (paramabk != null) {
        str1 = paramabk.c();
      }
      return new AdRequestInfoParcel.a((Bundle)localObject1, paramAdRequestParcel, this.f.i, this.f.b, localApplicationInfo, localPackageInfo2, str2, u.i().a(), this.f.e, localBundle, this.f.A, localArrayList, paramBundle, u.i().g(), this.l, localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels, localDisplayMetrics.density, str3, l1, str4, uf.a(), this.f.a, this.f.w, new CapabilityParcel(bool1, bool2, bool3), this.f.h(), u.e().g(), u.e().h(), u.e().k(this.f.c), u.e().b(this.f.f), this.f.c instanceof Activity, u.i().k(), (String)localObject3, str1, u.i().n(), u.B().a(), u.e().i(), u.m().a());
      bool1 = false;
      break;
    }
  }
  
  public void A()
  {
    B();
  }
  
  public void B()
  {
    a(this.f.j, false);
  }
  
  public void C()
  {
    u.e().a(new Runnable()
    {
      public void run()
      {
        b.this.e.b();
      }
    });
  }
  
  public void D()
  {
    u.e().a(new Runnable()
    {
      public void run()
      {
        b.this.e.c();
      }
    });
  }
  
  protected void a(@Nullable abi paramabi, boolean paramBoolean)
  {
    if (paramabi == null) {
      abr.d("Ad state was null when trying to ping impression URLs.");
    }
    do
    {
      return;
      super.c(paramabi);
      if ((paramabi.r != null) && (paramabi.r.d != null)) {
        u.x().a(this.f.c, this.f.e.b, paramabi, this.f.b, paramBoolean, paramabi.r.d);
      }
    } while ((paramabi.o == null) || (paramabi.o.g == null));
    u.x().a(this.f.c, this.f.e.b, paramabi, this.f.b, paramBoolean, paramabi.o.g);
  }
  
  public void a(yy paramyy)
  {
    com.google.android.gms.common.internal.d.b("setInAppPurchaseListener must be called on the main UI thread.");
    this.f.q = paramyy;
  }
  
  public void a(zd paramzd, @Nullable String paramString)
  {
    com.google.android.gms.common.internal.d.b("setPlayStorePurchaseParams must be called on the main UI thread.");
    this.f.B = new k(paramString);
    this.f.r = paramzd;
    if ((!u.i().f()) && (paramzd != null)) {
      paramzd = (Future)new c(this.f.c, this.f.r, this.f.B).e();
    }
  }
  
  public void a(String paramString, ArrayList<String> paramArrayList)
  {
    paramArrayList = new com.google.android.gms.ads.internal.purchase.d(paramString, paramArrayList, this.f.c, this.f.e.b);
    if (this.f.q == null)
    {
      abr.d("InAppPurchaseListener is not set. Try to launch default purchase flow.");
      if (!ac.a().b(this.f.c))
      {
        abr.d("Google Play Service unavailable, cannot launch default purchase flow.");
        return;
      }
      if (this.f.r == null)
      {
        abr.d("PlayStorePurchaseListener is not set.");
        return;
      }
      if (this.f.B == null)
      {
        abr.d("PlayStorePurchaseVerifier is not initialized.");
        return;
      }
      if (this.f.F)
      {
        abr.d("An in-app purchase request is already in progress, abort");
        return;
      }
      this.f.F = true;
      try
      {
        if (!this.f.r.a(paramString))
        {
          this.f.F = false;
          return;
        }
      }
      catch (RemoteException paramString)
      {
        abr.d("Could not start In-App purchase.");
        this.f.F = false;
        return;
      }
      u.s().a(this.f.c, this.f.e.e, new GInAppPurchaseManagerInfoParcel(this.f.c, this.f.B, paramArrayList, this));
      return;
    }
    try
    {
      this.f.q.a(paramArrayList);
      return;
    }
    catch (RemoteException paramString)
    {
      abr.d("Could not start In-App purchase.");
    }
  }
  
  public void a(String paramString, boolean paramBoolean, int paramInt, final Intent paramIntent, f paramf)
  {
    try
    {
      if (this.f.r != null) {
        this.f.r.a(new com.google.android.gms.ads.internal.purchase.g(this.f.c, paramString, paramBoolean, paramInt, paramIntent, paramf));
      }
      abv.a.postDelayed(new Runnable()
      {
        public void run()
        {
          int i = u.s().a(paramIntent);
          u.s();
          if ((i == 0) && (b.this.f.j != null) && (b.this.f.j.b != null) && (b.this.f.j.b.i() != null)) {
            b.this.f.j.b.i().a();
          }
          b.this.f.F = false;
        }
      }, 500L);
      return;
    }
    catch (RemoteException paramString)
    {
      for (;;)
      {
        abr.d("Fail to invoke PlayStorePurchaseListener.");
      }
    }
  }
  
  protected boolean a(AdRequestParcel paramAdRequestParcel, abi paramabi, boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.f.e()))
    {
      if (paramabi.h <= 0L) {
        break label43;
      }
      this.e.a(paramAdRequestParcel, paramabi.h);
    }
    for (;;)
    {
      return this.e.d();
      label43:
      if ((paramabi.r != null) && (paramabi.r.i > 0L)) {
        this.e.a(paramAdRequestParcel, paramabi.r.i);
      } else if ((!paramabi.n) && (paramabi.d == 2)) {
        this.e.b(paramAdRequestParcel);
      }
    }
  }
  
  public boolean a(AdRequestParcel paramAdRequestParcel, un paramun)
  {
    Object localObject = null;
    if (!u()) {
      return false;
    }
    Bundle localBundle = a(u.i().a(this.f.c));
    this.e.a();
    this.f.E = 0;
    abk localabk;
    if (((Boolean)uf.cd.c()).booleanValue())
    {
      localabk = u.i().o();
      g localg = u.A();
      Context localContext = this.f.c;
      VersionInfoParcel localVersionInfoParcel = this.f.e;
      if (localabk == null) {
        localg.a(localContext, localVersionInfoParcel, false, localabk, (String)localObject, this.f.b);
      }
    }
    for (localObject = localabk;; localObject = null)
    {
      paramAdRequestParcel = a(paramAdRequestParcel, localBundle, (abk)localObject);
      paramun.a("seq_num", paramAdRequestParcel.g);
      paramun.a("request_id", paramAdRequestParcel.v);
      paramun.a("session_id", paramAdRequestParcel.h);
      if (paramAdRequestParcel.f != null) {
        paramun.a("app_version", String.valueOf(paramAdRequestParcel.f.versionCode));
      }
      this.f.g = u.a().a(this.f.c, paramAdRequestParcel, this.f.d, this);
      return true;
      localObject = localabk.d();
      break;
    }
  }
  
  boolean a(abi paramabi)
  {
    boolean bool = false;
    Object localObject;
    if (this.g != null)
    {
      localObject = this.g;
      this.g = null;
    }
    for (;;)
    {
      return a((AdRequestParcel)localObject, paramabi, bool);
      AdRequestParcel localAdRequestParcel = paramabi.a;
      localObject = localAdRequestParcel;
      if (localAdRequestParcel.c != null)
      {
        bool = localAdRequestParcel.c.getBoolean("_noRefresh", false);
        localObject = localAdRequestParcel;
      }
    }
  }
  
  protected boolean a(@Nullable abi paramabi1, abi paramabi2)
  {
    int i = 0;
    if ((paramabi1 != null) && (paramabi1.s != null)) {
      paramabi1.s.a(null);
    }
    if (paramabi2.s != null) {
      paramabi2.s.a(this);
    }
    int m;
    if (paramabi2.r != null)
    {
      m = paramabi2.r.o;
      i = paramabi2.r.p;
    }
    for (;;)
    {
      this.f.C.a(m, i);
      return true;
      m = 0;
    }
  }
  
  public void b(abi paramabi)
  {
    super.b(paramabi);
    if (paramabi.o != null)
    {
      abr.a("Pinging network fill URLs.");
      u.x().a(this.f.c, this.f.e.b, paramabi, this.f.b, false, paramabi.o.h);
      if ((paramabi.r != null) && (paramabi.r.f != null) && (paramabi.r.f.size() > 0))
      {
        abr.a("Pinging urls remotely");
        u.e().a(this.f.c, paramabi.r.f);
      }
    }
    if ((paramabi.d == 3) && (paramabi.r != null) && (paramabi.r.e != null))
    {
      abr.a("Pinging no fill URLs.");
      u.x().a(this.f.c, this.f.e.b, paramabi, this.f.b, false, paramabi.r.e);
    }
  }
  
  protected boolean b(AdRequestParcel paramAdRequestParcel)
  {
    return (super.b(paramAdRequestParcel)) && (!this.k);
  }
  
  public void c_()
  {
    com.google.android.gms.common.internal.d.b("resume must be called on the main UI thread.");
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (this.f.j != null)
    {
      localObject1 = localObject2;
      if (this.f.j.b != null) {
        localObject1 = this.f.j.b;
      }
    }
    if ((localObject1 != null) && (this.f.e())) {
      u.g().b(this.f.j.b);
    }
    if ((this.f.j != null) && (this.f.j.p != null)) {}
    try
    {
      this.f.j.p.e();
      if ((localObject1 == null) || (!((acy)localObject1).u())) {
        this.e.c();
      }
      this.h.e(this.f.j);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        abr.d("Could not resume mediation adapter.");
      }
    }
  }
  
  public void d()
  {
    com.google.android.gms.common.internal.d.b("pause must be called on the main UI thread.");
    if ((this.f.j != null) && (this.f.j.b != null) && (this.f.e())) {
      u.g().a(this.f.j.b);
    }
    if ((this.f.j != null) && (this.f.j.p != null)) {}
    try
    {
      this.f.j.p.d();
      this.h.d(this.f.j);
      this.e.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        abr.d("Could not pause mediation adapter.");
      }
    }
  }
  
  public void d_()
  {
    this.h.b(this.f.j);
    this.k = false;
    p();
    this.f.l.c();
  }
  
  public void e()
  {
    if (this.f.j == null)
    {
      abr.d("Ad state was null when trying to ping click URLs.");
      return;
    }
    if ((this.f.j.r != null) && (this.f.j.r.c != null)) {
      u.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.r.c);
    }
    if ((this.f.j.o != null) && (this.f.j.o.f != null)) {
      u.x().a(this.f.c, this.f.e.b, this.f.j, this.f.b, false, this.f.j.o.f);
    }
    super.e();
  }
  
  public void e_()
  {
    this.k = true;
    r();
  }
  
  public void f()
  {
    throw new IllegalStateException("showInterstitial is not supported for current ad type");
  }
  
  public void f_()
  {
    this.h.d(this.f.j);
  }
  
  public void g()
  {
    this.h.e(this.f.j);
  }
  
  public String j()
  {
    if (this.f.j == null) {
      return null;
    }
    return this.f.j.q;
  }
  
  protected boolean u()
  {
    boolean bool = true;
    if ((!u.e().a(this.f.c.getPackageManager(), this.f.c.getPackageName(), "android.permission.INTERNET")) || (!u.e().a(this.f.c))) {
      bool = false;
    }
    return bool;
  }
  
  public void v()
  {
    e();
  }
  
  public void w()
  {
    d_();
  }
  
  public void x()
  {
    m();
  }
  
  public void y()
  {
    e_();
  }
  
  public void z()
  {
    if (this.f.j != null)
    {
      String str = this.f.j.q;
      abr.d(String.valueOf(str).length() + 74 + "Mediation adapter " + str + " refreshed, but mediation adapters should never refresh.");
    }
    a(this.f.j, true);
    s();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */