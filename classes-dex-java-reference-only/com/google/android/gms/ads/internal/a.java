package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Debug;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.client.af;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.ak.a;
import com.google.android.gms.ads.internal.client.am;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.client.w;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.a.a;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.f;
import com.google.android.gms.common.util.i;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aas;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abj;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abn;
import com.google.android.gms.internal.abo;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.abw;
import com.google.android.gms.internal.abz;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.ti;
import com.google.android.gms.internal.tn;
import com.google.android.gms.internal.tp;
import com.google.android.gms.internal.tq;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.uh;
import com.google.android.gms.internal.ul;
import com.google.android.gms.internal.un;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.vp;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zd;
import com.google.android.gms.internal.zn.a;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

@aaa
public abstract class a
  extends ak.a
  implements com.google.android.gms.ads.internal.client.a, p, a.a, abn, vp, zn.a
{
  protected un a;
  protected ul b;
  protected ul c;
  protected boolean d = false;
  protected final r e;
  protected final v f;
  @Nullable
  protected transient AdRequestParcel g;
  protected final ti h;
  protected final d i;
  
  a(v paramv, @Nullable r paramr, d paramd)
  {
    this.f = paramv;
    if (paramr != null) {}
    for (;;)
    {
      this.e = paramr;
      this.i = paramd;
      u.e().b(this.f.c);
      u.i().a(this.f.c, this.f.e);
      u.j().a(this.f.c);
      this.h = u.i().p();
      u.h().a(this.f.c);
      u();
      return;
      paramr = new r(this);
    }
  }
  
  private TimerTask a(final Timer paramTimer, final CountDownLatch paramCountDownLatch)
  {
    new TimerTask()
    {
      public void run()
      {
        if (((Integer)uf.bV.c()).intValue() != paramCountDownLatch.getCount())
        {
          abr.a("Stopping method tracing");
          Debug.stopMethodTracing();
          if (paramCountDownLatch.getCount() == 0L)
          {
            paramTimer.cancel();
            return;
          }
        }
        String str = String.valueOf(a.this.f.c.getPackageName()).concat("_adsTrace_");
        try
        {
          abr.a("Starting method tracing");
          paramCountDownLatch.countDown();
          long l = u.k().a();
          Debug.startMethodTracing(String.valueOf(str).length() + 20 + str + l, ((Integer)uf.bW.c()).intValue());
          return;
        }
        catch (Exception localException)
        {
          abr.d("Exception occurred while starting method tracing.", localException);
        }
      }
    };
  }
  
  private AdRequestParcel d(AdRequestParcel paramAdRequestParcel)
  {
    AdRequestParcel localAdRequestParcel = paramAdRequestParcel;
    if (i.b(this.f.c))
    {
      localAdRequestParcel = paramAdRequestParcel;
      if (paramAdRequestParcel.k != null) {
        localAdRequestParcel = new w(paramAdRequestParcel).a(null).a();
      }
    }
    return localAdRequestParcel;
  }
  
  private void d(abi paramabi)
  {
    if ((!u.m().b()) || (paramabi.H) || (TextUtils.isEmpty(paramabi.D))) {
      return;
    }
    abr.a("Sending troubleshooting signals to the server.");
    u.m().a(this.f.c, this.f.e.b, paramabi.D, this.f.b);
    paramabi.H = true;
  }
  
  private void u()
  {
    if (((Boolean)uf.bT.c()).booleanValue())
    {
      Timer localTimer = new Timer();
      localTimer.schedule(a(localTimer, new CountDownLatch(((Integer)uf.bV.c()).intValue())), 0L, ((Long)uf.bU.c()).longValue());
    }
  }
  
  Bundle a(@Nullable tq paramtq)
  {
    Object localObject2;
    if (paramtq == null)
    {
      localObject2 = null;
      return (Bundle)localObject2;
    }
    if (paramtq.f()) {
      paramtq.d();
    }
    paramtq = paramtq.c();
    Object localObject3;
    label61:
    Object localObject1;
    if (paramtq != null)
    {
      localObject2 = paramtq.b();
      localObject3 = paramtq.c();
      paramtq = String.valueOf(paramtq.toString());
      if (paramtq.length() != 0)
      {
        paramtq = "In AdManager: loadAd, ".concat(paramtq);
        abr.a(paramtq);
        paramtq = (tq)localObject3;
        localObject1 = localObject2;
        if (localObject2 != null)
        {
          u.i().a((String)localObject2);
          localObject1 = localObject2;
        }
      }
    }
    for (paramtq = (tq)localObject3;; paramtq = null)
    {
      if (localObject1 == null) {
        break label158;
      }
      localObject3 = new Bundle(1);
      ((Bundle)localObject3).putString("fingerprint", (String)localObject1);
      localObject2 = localObject3;
      if (((String)localObject1).equals(paramtq)) {
        break;
      }
      ((Bundle)localObject3).putString("v_fp", paramtq);
      return (Bundle)localObject3;
      paramtq = new String("In AdManager: loadAd, ");
      break label61;
      localObject1 = u.i().i();
    }
    label158:
    return null;
  }
  
  public com.google.android.gms.c.e a()
  {
    com.google.android.gms.common.internal.d.b("getAdFrame must be called on the main UI thread.");
    return f.a(this.f.f);
  }
  
  protected void a(int paramInt)
  {
    abr.d(30 + "Failed to load ad: " + paramInt);
    this.d = false;
    if (this.f.n != null) {}
    try
    {
      this.f.n.a(paramInt);
      if (this.f.z == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          this.f.z.a(paramInt);
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          abr.d("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        abr.d("Could not call AdListener.onAdFailedToLoad().", localRemoteException1);
      }
    }
  }
  
  protected void a(View paramView)
  {
    v.a locala = this.f.f;
    if (locala != null) {
      locala.addView(paramView, u.g().d());
    }
  }
  
  public void a(AdSizeParcel paramAdSizeParcel)
  {
    com.google.android.gms.common.internal.d.b("setAdSize must be called on the main UI thread.");
    this.f.i = paramAdSizeParcel;
    if ((this.f.j != null) && (this.f.j.b != null) && (this.f.E == 0)) {
      this.f.j.b.a(paramAdSizeParcel);
    }
    if (this.f.f == null) {
      return;
    }
    if (this.f.f.getChildCount() > 1) {
      this.f.f.removeView(this.f.f.getNextView());
    }
    this.f.f.setMinimumWidth(paramAdSizeParcel.g);
    this.f.f.setMinimumHeight(paramAdSizeParcel.d);
    this.f.f.requestLayout();
  }
  
  public void a(@Nullable VideoOptionsParcel paramVideoOptionsParcel)
  {
    com.google.android.gms.common.internal.d.b("setVideoOptions must be called on the main UI thread.");
    this.f.x = paramVideoOptionsParcel;
  }
  
  public void a(af paramaf)
  {
    com.google.android.gms.common.internal.d.b("setAdListener must be called on the main UI thread.");
    this.f.m = paramaf;
  }
  
  public void a(ag paramag)
  {
    com.google.android.gms.common.internal.d.b("setAdListener must be called on the main UI thread.");
    this.f.n = paramag;
  }
  
  public void a(am paramam)
  {
    com.google.android.gms.common.internal.d.b("setAppEventListener must be called on the main UI thread.");
    this.f.o = paramam;
  }
  
  public void a(ao paramao)
  {
    com.google.android.gms.common.internal.d.b("setCorrelationIdProvider must be called on the main UI thread");
    this.f.p = paramao;
  }
  
  public void a(com.google.android.gms.ads.internal.reward.client.d paramd)
  {
    com.google.android.gms.common.internal.d.b("setRewardedVideoAdListener can only be called from the UI thread.");
    this.f.z = paramd;
  }
  
  protected void a(@Nullable RewardItemParcel paramRewardItemParcel)
  {
    if (this.f.z == null) {
      return;
    }
    String str = "";
    int j = 0;
    if (paramRewardItemParcel != null) {}
    try
    {
      str = paramRewardItemParcel.b;
      j = paramRewardItemParcel.c;
      this.f.z.a(new aas(str, j));
      return;
    }
    catch (RemoteException paramRewardItemParcel)
    {
      abr.d("Could not call RewardedVideoAdListener.onRewarded().", paramRewardItemParcel);
    }
  }
  
  public void a(abi.a parama)
  {
    if ((parama.b.n != -1L) && (!TextUtils.isEmpty(parama.b.y)))
    {
      long l = b(parama.b.y);
      if (l != -1L)
      {
        ul localul = this.a.a(l + parama.b.n);
        this.a.a(localul, new String[] { "stc" });
      }
    }
    this.a.a(parama.b.y);
    this.a.a(this.b, new String[] { "arf" });
    this.c = this.a.a();
    this.a.a("gqi", parama.b.z);
    this.f.g = null;
    this.f.k = parama;
    a(parama, this.a);
  }
  
  protected abstract void a(abi.a parama, un paramun);
  
  public void a(ur paramur)
  {
    throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
  }
  
  public void a(yy paramyy)
  {
    throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
  }
  
  public void a(zd paramzd, String paramString)
  {
    throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
  }
  
  public void a(String paramString)
  {
    abr.d("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
  }
  
  public void a(String paramString1, @Nullable String paramString2)
  {
    if (this.f.o != null) {}
    try
    {
      this.f.o.a(paramString1, paramString2);
      return;
    }
    catch (RemoteException paramString1)
    {
      abr.d("Could not call the AppEventListener.", paramString1);
    }
  }
  
  public void a(HashSet<abj> paramHashSet)
  {
    this.f.a(paramHashSet);
  }
  
  public void a(boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
  }
  
  public boolean a(AdRequestParcel paramAdRequestParcel)
  {
    com.google.android.gms.common.internal.d.b("loadAd must be called on the main UI thread.");
    u.j().a();
    if (((Boolean)uf.at.c()).booleanValue()) {
      AdRequestParcel.a(paramAdRequestParcel);
    }
    paramAdRequestParcel = d(paramAdRequestParcel);
    if ((this.f.g != null) || (this.f.h != null))
    {
      if (this.g != null) {
        abr.d("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
      }
      for (;;)
      {
        this.g = paramAdRequestParcel;
        return false;
        abr.d("Loading already in progress, saving this object for future refreshes.");
      }
    }
    abr.c("Starting ad request.");
    o();
    this.b = this.a.a();
    if (!paramAdRequestParcel.f)
    {
      String str = String.valueOf(ac.a().a(this.f.c));
      abr.c(String.valueOf(str).length() + 71 + "Use AdRequest.Builder.addTestDevice(\"" + str + "\") to get test ads on this device.");
    }
    this.e.a(paramAdRequestParcel);
    this.d = a(paramAdRequestParcel, this.a);
    return this.d;
  }
  
  protected abstract boolean a(AdRequestParcel paramAdRequestParcel, un paramun);
  
  boolean a(abi paramabi)
  {
    return false;
  }
  
  protected abstract boolean a(@Nullable abi paramabi1, abi paramabi2);
  
  long b(String paramString)
  {
    int m = paramString.indexOf("ufe");
    int k = paramString.indexOf(',', m);
    int j = k;
    if (k == -1) {
      j = paramString.length();
    }
    try
    {
      long l = Long.parseLong(paramString.substring(m + 4, j));
      return l;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      abr.d("Invalid index for Url fetch time in CSI latency info.");
      return -1L;
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        abr.d("Cannot find valid format of Url fetch time in CSI latency info.");
      }
    }
  }
  
  public void b()
  {
    com.google.android.gms.common.internal.d.b("destroy must be called on the main UI thread.");
    this.e.a();
    this.h.c(this.f.j);
    this.f.j();
  }
  
  public void b(abi paramabi)
  {
    this.a.a(this.c, new String[] { "awr" });
    this.f.h = null;
    if ((paramabi.d != -2) && (paramabi.d != 3)) {
      u.i().a(this.f.a());
    }
    if (paramabi.d == -1)
    {
      this.d = false;
      return;
    }
    if (a(paramabi)) {
      abr.a("Ad refresh scheduled.");
    }
    if (paramabi.d != -2)
    {
      a(paramabi.d);
      return;
    }
    if (this.f.C == null) {
      this.f.C = new abo(this.f.b);
    }
    this.h.b(this.f.j);
    un localun;
    if (a(this.f.j, paramabi))
    {
      this.f.j = paramabi;
      this.f.i();
      localun = this.a;
      if (!this.f.j.a()) {
        break label394;
      }
      str = "1";
      label203:
      localun.a("is_mraid", str);
      localun = this.a;
      if (!this.f.j.n) {
        break label401;
      }
      str = "1";
      label233:
      localun.a("is_mediation", str);
      if ((this.f.j.b != null) && (this.f.j.b.l() != null))
      {
        localun = this.a;
        if (!this.f.j.b.l().f()) {
          break label408;
        }
      }
    }
    label394:
    label401:
    label408:
    for (String str = "1";; str = "0")
    {
      localun.a("is_delay_pl", str);
      this.a.a(this.b, new String[] { "ttc" });
      if (u.i().e() != null) {
        u.i().e().a(this.a);
      }
      if (this.f.e()) {
        s();
      }
      if (paramabi.I == null) {
        break;
      }
      u.e().a(this.f.c, paramabi.I);
      return;
      str = "0";
      break label203;
      str = "0";
      break label233;
    }
  }
  
  protected boolean b(AdRequestParcel paramAdRequestParcel)
  {
    if (this.f.f == null) {
      return false;
    }
    paramAdRequestParcel = this.f.f.getParent();
    if (!(paramAdRequestParcel instanceof View)) {
      return false;
    }
    paramAdRequestParcel = (View)paramAdRequestParcel;
    return u.e().a(paramAdRequestParcel, paramAdRequestParcel.getContext());
  }
  
  public void c(AdRequestParcel paramAdRequestParcel)
  {
    if (b(paramAdRequestParcel))
    {
      a(paramAdRequestParcel);
      return;
    }
    abr.c("Ad is not visible. Not refreshing ad.");
    this.e.b(paramAdRequestParcel);
  }
  
  protected void c(@Nullable abi paramabi)
  {
    if (paramabi == null) {
      abr.d("Ad state was null when trying to ping impression URLs.");
    }
    do
    {
      return;
      abr.a("Pinging Impression URLs.");
      if (this.f.l != null) {
        this.f.l.a();
      }
    } while ((paramabi.e == null) || (paramabi.F));
    u.e().a(this.f.c, this.f.e.b, paramabi.e);
    paramabi.F = true;
    d(paramabi);
  }
  
  public boolean c()
  {
    com.google.android.gms.common.internal.d.b("isLoaded must be called on the main UI thread.");
    return (this.f.g == null) && (this.f.h == null) && (this.f.j != null);
  }
  
  public void c_()
  {
    com.google.android.gms.common.internal.d.b("resume must be called on the main UI thread.");
  }
  
  public void d()
  {
    com.google.android.gms.common.internal.d.b("pause must be called on the main UI thread.");
  }
  
  public void e()
  {
    if (this.f.j == null) {
      abr.d("Ad state was null when trying to ping click URLs.");
    }
    do
    {
      return;
      abr.a("Pinging click URLs.");
      if (this.f.l != null) {
        this.f.l.b();
      }
      if (this.f.j.c != null) {
        u.e().a(this.f.c, this.f.e.b, this.f.j.c);
      }
    } while (this.f.m == null);
    try
    {
      this.f.m.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      abr.d("Could not notify onAdClicked event.", localRemoteException);
    }
  }
  
  public void g_()
  {
    com.google.android.gms.common.internal.d.b("stopLoading must be called on the main UI thread.");
    this.d = false;
    this.f.a(true);
  }
  
  public void h()
  {
    com.google.android.gms.common.internal.d.b("recordManualImpression must be called on the main UI thread.");
    if (this.f.j == null) {
      abr.d("Ad state was null when trying to ping manual tracking URLs.");
    }
    do
    {
      return;
      abr.a("Pinging manual tracking URLs.");
    } while ((this.f.j.f == null) || (this.f.j.G));
    u.e().a(this.f.c, this.f.e.b, this.f.j.f);
    this.f.j.G = true;
    d(this.f.j);
  }
  
  @Nullable
  public AdSizeParcel i()
  {
    com.google.android.gms.common.internal.d.b("getAdSize must be called on the main UI thread.");
    if (this.f.i == null) {
      return null;
    }
    return new ThinAdSizeParcel(this.f.i);
  }
  
  public boolean k()
  {
    return this.d;
  }
  
  public c l()
  {
    return null;
  }
  
  public void m()
  {
    q();
  }
  
  public d n()
  {
    return this.i;
  }
  
  public void o()
  {
    this.a = new un(((Boolean)uf.N.c()).booleanValue(), "load_ad", this.f.i.b);
    this.b = new ul(-1L, null, null);
    this.c = new ul(-1L, null, null);
  }
  
  protected void p()
  {
    abr.c("Ad closing.");
    if (this.f.n != null) {}
    try
    {
      this.f.n.a();
      if (this.f.z == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          this.f.z.d();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          abr.d("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        abr.d("Could not call AdListener.onAdClosed().", localRemoteException1);
      }
    }
  }
  
  protected void q()
  {
    abr.c("Ad leaving application.");
    if (this.f.n != null) {}
    try
    {
      this.f.n.b();
      if (this.f.z == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          this.f.z.e();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          abr.d("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        abr.d("Could not call AdListener.onAdLeftApplication().", localRemoteException1);
      }
    }
  }
  
  protected void r()
  {
    abr.c("Ad opening.");
    if (this.f.n != null) {}
    try
    {
      this.f.n.d();
      if (this.f.z == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          this.f.z.b();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          abr.d("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        abr.d("Could not call AdListener.onAdOpened().", localRemoteException1);
      }
    }
  }
  
  protected void s()
  {
    abr.c("Ad finished loading.");
    this.d = false;
    if (this.f.n != null) {}
    try
    {
      this.f.n.c();
      if (this.f.z == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          this.f.z.a();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          abr.d("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        abr.d("Could not call AdListener.onAdLoaded().", localRemoteException1);
      }
    }
  }
  
  protected void t()
  {
    if (this.f.z == null) {
      return;
    }
    try
    {
      this.f.z.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      abr.d("Could not call RewardedVideoAdListener.onVideoStarted().", localRemoteException);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */