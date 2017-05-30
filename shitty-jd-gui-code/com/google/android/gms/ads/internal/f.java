package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.act;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.acz.c;
import com.google.android.gms.internal.acz.e;
import com.google.android.gms.internal.add;
import com.google.android.gms.internal.tf;
import com.google.android.gms.internal.ti;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.xq;
import java.util.List;

@aaa
public class f
  extends c
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private boolean l;
  
  public f(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, VersionInfoParcel paramVersionInfoParcel, d paramd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramxq, paramVersionInfoParcel, paramd);
  }
  
  private AdSizeParcel b(abi.a parama)
  {
    if (parama.b.A) {
      return this.f.i;
    }
    parama = parama.b.m;
    if (parama != null)
    {
      parama = parama.split("[xX]");
      parama[0] = parama[0].trim();
      parama[1] = parama[1].trim();
    }
    for (parama = new com.google.android.gms.ads.d(Integer.parseInt(parama[0]), Integer.parseInt(parama[1]));; parama = this.f.i.b()) {
      return new AdSizeParcel(this.f.c, parama);
    }
  }
  
  private boolean b(@Nullable abi paramabi1, abi paramabi2)
  {
    View localView1;
    if (paramabi2.n)
    {
      localView1 = n.a(paramabi2);
      if (localView1 == null)
      {
        abr.d("Could not get mediation view");
        return false;
      }
      View localView2 = this.f.f.getNextView();
      if (localView2 != null)
      {
        if ((localView2 instanceof acy)) {
          ((acy)localView2).destroy();
        }
        this.f.f.removeView(localView2);
      }
      if (n.b(paramabi2)) {}
    }
    for (;;)
    {
      try
      {
        a(localView1);
        if (this.f.f.getChildCount() > 1) {
          this.f.f.showNext();
        }
        if (paramabi1 != null)
        {
          paramabi1 = this.f.f.getNextView();
          if (!(paramabi1 instanceof acy)) {
            break label271;
          }
          ((acy)paramabi1).a(this.f.c, this.f.i, this.a);
          this.f.d();
        }
        this.f.f.setVisibility(0);
        return true;
      }
      catch (Throwable paramabi1)
      {
        abr.d("Could not add mediation view to view hierarchy.", paramabi1);
        return false;
      }
      if ((paramabi2.v != null) && (paramabi2.b != null))
      {
        paramabi2.b.a(paramabi2.v);
        this.f.f.removeAllViews();
        this.f.f.setMinimumWidth(paramabi2.v.g);
        this.f.f.setMinimumHeight(paramabi2.v.d);
        a(paramabi2.b.b());
        continue;
        label271:
        if (paramabi1 != null) {
          this.f.f.removeView(paramabi1);
        }
      }
    }
  }
  
  private void e(final abi paramabi)
  {
    if (this.f.e()) {
      if (paramabi.b != null)
      {
        if (paramabi.j != null) {
          this.h.a(this.f.i, paramabi);
        }
        if (!paramabi.a()) {
          break label70;
        }
        this.h.a(this.f.i, paramabi).a(paramabi.b);
      }
    }
    label70:
    while ((this.f.D == null) || (paramabi.j == null))
    {
      return;
      paramabi.b.l().a(new acz.c()
      {
        public void a()
        {
          f.this.h.a(f.this.f.i, paramabi).a(paramabi.b);
        }
      });
      return;
    }
    this.h.a(this.f.i, paramabi, this.f.D);
  }
  
  protected acy a(abi.a parama, @Nullable e parame, @Nullable com.google.android.gms.ads.internal.safebrowsing.c paramc)
  {
    if ((this.f.i.h == null) && (this.f.i.j)) {
      this.f.i = b(parama);
    }
    return super.a(parama, parame, paramc);
  }
  
  protected void a(@Nullable abi paramabi, boolean paramBoolean)
  {
    super.a(paramabi, paramBoolean);
    if (n.b(paramabi)) {
      n.a(paramabi, new a());
    }
  }
  
  public void a(boolean paramBoolean)
  {
    com.google.android.gms.common.internal.d.b("setManualImpressionsEnabled must be called from the main thread.");
    this.l = paramBoolean;
  }
  
  public boolean a(AdRequestParcel paramAdRequestParcel)
  {
    return super.a(d(paramAdRequestParcel));
  }
  
  public boolean a(@Nullable abi paramabi1, final abi paramabi2)
  {
    if (!super.a(paramabi1, paramabi2)) {
      return false;
    }
    if ((this.f.e()) && (!b(paramabi1, paramabi2)))
    {
      a(0);
      return false;
    }
    final Object localObject;
    if (paramabi2.k)
    {
      d(paramabi2);
      u.C().a(this.f.f, this);
      u.C().a(this.f.f, this);
      if (!paramabi2.m)
      {
        localObject = new Runnable()
        {
          public void run()
          {
            f.this.d(f.this.f.j);
          }
        };
        if (paramabi2.b == null) {
          break label205;
        }
        paramabi1 = paramabi2.b.l();
        if (paramabi1 != null) {
          paramabi1.a(new acz.e()
          {
            public void a()
            {
              if (!paramabi2.m)
              {
                u.e();
                abv.b(localObject);
              }
            }
          });
        }
      }
      label128:
      if (paramabi2.b == null) {
        break label244;
      }
      localObject = paramabi2.b.z();
      acz localacz = paramabi2.b.l();
      paramabi1 = (abi)localObject;
      if (localacz != null) {
        localacz.h();
      }
    }
    label205:
    label244:
    for (paramabi1 = (abi)localObject;; paramabi1 = null)
    {
      if ((this.f.x != null) && (paramabi1 != null)) {
        paramabi1.b(this.f.x.b);
      }
      e(paramabi2);
      return true;
      paramabi1 = null;
      break;
      if ((this.f.f()) && (!((Boolean)uf.bH.c()).booleanValue())) {
        break label128;
      }
      a(paramabi2, false);
      break label128;
    }
  }
  
  AdRequestParcel d(AdRequestParcel paramAdRequestParcel)
  {
    if (paramAdRequestParcel.h == this.l) {
      return paramAdRequestParcel;
    }
    int i = paramAdRequestParcel.a;
    long l1 = paramAdRequestParcel.b;
    Bundle localBundle = paramAdRequestParcel.c;
    int j = paramAdRequestParcel.d;
    List localList = paramAdRequestParcel.e;
    boolean bool2 = paramAdRequestParcel.f;
    int k = paramAdRequestParcel.g;
    if ((paramAdRequestParcel.h) || (this.l)) {}
    for (boolean bool1 = true;; bool1 = false) {
      return new AdRequestParcel(i, l1, localBundle, j, localList, bool2, k, bool1, paramAdRequestParcel.i, paramAdRequestParcel.j, paramAdRequestParcel.k, paramAdRequestParcel.l, paramAdRequestParcel.m, paramAdRequestParcel.n, paramAdRequestParcel.o, paramAdRequestParcel.p, paramAdRequestParcel.q, paramAdRequestParcel.r);
    }
  }
  
  void d(@Nullable abi paramabi)
  {
    if (paramabi == null) {}
    while ((paramabi.m) || (this.f.f == null) || (!u.e().a(this.f.f, this.f.c)) || (!this.f.f.getGlobalVisibleRect(new Rect(), null))) {
      return;
    }
    if ((paramabi != null) && (paramabi.b != null) && (paramabi.b.l() != null)) {
      paramabi.b.l().a(null);
    }
    a(paramabi, false);
    paramabi.m = true;
  }
  
  public void f()
  {
    throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
  }
  
  @Nullable
  public com.google.android.gms.ads.internal.client.c l()
  {
    com.google.android.gms.common.internal.d.b("getVideoController must be called from the main thread.");
    if ((this.f.j != null) && (this.f.j.b != null)) {
      return this.f.j.b.z();
    }
    return null;
  }
  
  public void onGlobalLayout()
  {
    d(this.f.j);
  }
  
  public void onScrollChanged()
  {
    d(this.f.j);
  }
  
  protected boolean u()
  {
    boolean bool = true;
    if (!u.e().a(this.f.c.getPackageManager(), this.f.c.getPackageName(), "android.permission.INTERNET"))
    {
      ac.a().a(this.f.f, this.f.i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
      bool = false;
    }
    if (!u.e().a(this.f.c))
    {
      ac.a().a(this.f.f, this.f.i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
      bool = false;
    }
    if ((!bool) && (this.f.f != null)) {
      this.f.f.setVisibility(0);
    }
    return bool;
  }
  
  public class a
  {
    public a() {}
    
    public void a()
    {
      f.this.e();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */