package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.af;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.ak.a;
import com.google.android.gms.ads.internal.client.am;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.e;

@aaa
public class ws
  extends ak.a
{
  private final String a;
  private final wm b;
  @Nullable
  private l c;
  private final wo d;
  @Nullable
  private zd e;
  private String f;
  
  public ws(Context paramContext, String paramString, xq paramxq, VersionInfoParcel paramVersionInfoParcel, com.google.android.gms.ads.internal.d paramd)
  {
    this(paramString, new wm(paramContext, paramxq, paramVersionInfoParcel, paramd));
  }
  
  ws(String paramString, wm paramwm)
  {
    this.a = paramString;
    this.b = paramwm;
    this.d = new wo();
    u.t().a(paramwm);
  }
  
  static boolean b(AdRequestParcel paramAdRequestParcel)
  {
    paramAdRequestParcel = wp.a(paramAdRequestParcel);
    return (paramAdRequestParcel != null) && (paramAdRequestParcel.containsKey("gw"));
  }
  
  static boolean c(AdRequestParcel paramAdRequestParcel)
  {
    paramAdRequestParcel = wp.a(paramAdRequestParcel);
    return (paramAdRequestParcel != null) && (paramAdRequestParcel.containsKey("_ad"));
  }
  
  private void n()
  {
    if ((this.c != null) && (this.e != null)) {
      this.c.a(this.e, this.f);
    }
  }
  
  @Nullable
  public e a()
  {
    if (this.c != null) {
      return this.c.a();
    }
    return null;
  }
  
  public void a(AdSizeParcel paramAdSizeParcel)
  {
    if (this.c != null) {
      this.c.a(paramAdSizeParcel);
    }
  }
  
  public void a(VideoOptionsParcel paramVideoOptionsParcel)
  {
    throw new IllegalStateException("getVideoController not implemented for interstitials");
  }
  
  public void a(af paramaf)
  {
    this.d.e = paramaf;
    if (this.c != null) {
      this.d.a(this.c);
    }
  }
  
  public void a(ag paramag)
  {
    this.d.a = paramag;
    if (this.c != null) {
      this.d.a(this.c);
    }
  }
  
  public void a(am paramam)
  {
    this.d.b = paramam;
    if (this.c != null) {
      this.d.a(this.c);
    }
  }
  
  public void a(ao paramao)
  {
    m();
    if (this.c != null) {
      this.c.a(paramao);
    }
  }
  
  public void a(com.google.android.gms.ads.internal.reward.client.d paramd)
  {
    this.d.f = paramd;
    if (this.c != null) {
      this.d.a(this.c);
    }
  }
  
  public void a(ur paramur)
  {
    this.d.d = paramur;
    if (this.c != null) {
      this.d.a(this.c);
    }
  }
  
  public void a(yy paramyy)
  {
    this.d.c = paramyy;
    if (this.c != null) {
      this.d.a(this.c);
    }
  }
  
  public void a(zd paramzd, String paramString)
  {
    this.e = paramzd;
    this.f = paramString;
    n();
  }
  
  public void a(String paramString) {}
  
  public void a(boolean paramBoolean)
  {
    m();
    if (this.c != null) {
      this.c.a(paramBoolean);
    }
  }
  
  public boolean a(AdRequestParcel paramAdRequestParcel)
  {
    if (((Boolean)uf.at.c()).booleanValue()) {
      AdRequestParcel.a(paramAdRequestParcel);
    }
    if (!b(paramAdRequestParcel)) {
      m();
    }
    if (wp.c(paramAdRequestParcel)) {
      m();
    }
    if (paramAdRequestParcel.j != null) {
      m();
    }
    if (this.c != null) {
      return this.c.a(paramAdRequestParcel);
    }
    Object localObject = u.t();
    if (c(paramAdRequestParcel)) {
      ((wp)localObject).b(paramAdRequestParcel, this.a);
    }
    localObject = ((wp)localObject).a(paramAdRequestParcel, this.a);
    if (localObject != null)
    {
      if (!((wr.a)localObject).e) {
        ((wr.a)localObject).a();
      }
      this.c = ((wr.a)localObject).a;
      ((wr.a)localObject).c.a(this.d);
      this.d.a(this.c);
      n();
      return ((wr.a)localObject).f;
    }
    m();
    return this.c.a(paramAdRequestParcel);
  }
  
  public void b()
  {
    if (this.c != null) {
      this.c.b();
    }
  }
  
  public boolean c()
  {
    return (this.c != null) && (this.c.c());
  }
  
  public void c_()
  {
    if (this.c != null) {
      this.c.c_();
    }
  }
  
  public void d()
  {
    if (this.c != null) {
      this.c.d();
    }
  }
  
  public void f()
  {
    if (this.c != null)
    {
      this.c.f();
      return;
    }
    abr.d("Interstitial ad must be loaded before showInterstitial().");
  }
  
  public void g_()
  {
    if (this.c != null) {
      this.c.g_();
    }
  }
  
  public void h()
  {
    if (this.c != null)
    {
      this.c.h();
      return;
    }
    abr.d("Interstitial ad must be loaded before pingManualTrackingUrl().");
  }
  
  @Nullable
  public AdSizeParcel i()
  {
    if (this.c != null) {
      return this.c.i();
    }
    return null;
  }
  
  @Nullable
  public String j()
  {
    if (this.c != null) {
      return this.c.j();
    }
    return null;
  }
  
  public boolean k()
  {
    return (this.c != null) && (this.c.k());
  }
  
  public c l()
  {
    throw new IllegalStateException("getVideoController not implemented for interstitials");
  }
  
  void m()
  {
    if (this.c != null) {
      return;
    }
    this.c = this.b.a(this.a);
    this.d.a(this.c);
    n();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */