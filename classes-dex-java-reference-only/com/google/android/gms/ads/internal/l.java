package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aaf;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.abw;
import com.google.android.gms.internal.acf;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.ada;
import com.google.android.gms.internal.ti;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.un;
import com.google.android.gms.internal.vx;
import com.google.android.gms.internal.wd;
import com.google.android.gms.internal.wd.a;
import com.google.android.gms.internal.xg;
import com.google.android.gms.internal.xh;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.xr;
import java.util.Collections;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class l
  extends c
  implements vx, wd.a
{
  protected transient boolean l = false;
  private int m = -1;
  private boolean n;
  private float o;
  
  public l(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, VersionInfoParcel paramVersionInfoParcel, d paramd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramxq, paramVersionInfoParcel, paramd);
  }
  
  private void a(Bundle paramBundle)
  {
    u.e().b(this.f.c, this.f.e.b, "gmob-apps", paramBundle, false);
  }
  
  static abi.a b(abi.a parama)
  {
    try
    {
      Object localObject1 = aaf.a(parama.b).toString();
      Object localObject2 = new JSONObject();
      ((JSONObject)localObject2).put("pubid", parama.a.e);
      localObject2 = ((JSONObject)localObject2).toString();
      localObject2 = new xg((String)localObject1, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), (String)localObject2, null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
      localObject1 = parama.b;
      localObject2 = new xh(Collections.singletonList(localObject2), -1L, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), ((AdResponseParcel)localObject1).J, ((AdResponseParcel)localObject1).K, "", -1L, 0, 1, null, 0, -1, -1L, false);
      localObject1 = new AdResponseParcel(parama.a, ((AdResponseParcel)localObject1).b, ((AdResponseParcel)localObject1).c, Collections.emptyList(), Collections.emptyList(), ((AdResponseParcel)localObject1).g, true, ((AdResponseParcel)localObject1).i, Collections.emptyList(), ((AdResponseParcel)localObject1).k, ((AdResponseParcel)localObject1).l, ((AdResponseParcel)localObject1).m, ((AdResponseParcel)localObject1).n, ((AdResponseParcel)localObject1).o, ((AdResponseParcel)localObject1).p, ((AdResponseParcel)localObject1).q, null, ((AdResponseParcel)localObject1).s, ((AdResponseParcel)localObject1).t, ((AdResponseParcel)localObject1).u, ((AdResponseParcel)localObject1).v, ((AdResponseParcel)localObject1).w, ((AdResponseParcel)localObject1).z, ((AdResponseParcel)localObject1).A, ((AdResponseParcel)localObject1).B, null, Collections.emptyList(), Collections.emptyList(), ((AdResponseParcel)localObject1).F, ((AdResponseParcel)localObject1).G, ((AdResponseParcel)localObject1).H, ((AdResponseParcel)localObject1).I, ((AdResponseParcel)localObject1).J, ((AdResponseParcel)localObject1).K, ((AdResponseParcel)localObject1).L, null, ((AdResponseParcel)localObject1).N);
      return new abi.a(parama.a, (AdResponseParcel)localObject1, (xh)localObject2, parama.d, parama.e, parama.f, parama.g, null);
    }
    catch (JSONException localJSONException)
    {
      abr.b("Unable to generate ad state for an interstitial ad with pooling.", localJSONException);
    }
    return parama;
  }
  
  protected boolean H()
  {
    if (!(this.f.c instanceof Activity)) {}
    Window localWindow;
    do
    {
      return false;
      localWindow = ((Activity)this.f.c).getWindow();
    } while ((localWindow == null) || (localWindow.getDecorView() == null));
    Rect localRect1 = new Rect();
    Rect localRect2 = new Rect();
    localWindow.getDecorView().getGlobalVisibleRect(localRect1, null);
    localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect2);
    if ((localRect1.bottom != 0) && (localRect2.bottom != 0) && (localRect1.top == localRect2.top)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void I()
  {
    u.z().b(Integer.valueOf(this.m));
    if (this.f.e())
    {
      this.f.b();
      this.f.j = null;
      this.f.G = false;
      this.l = false;
    }
  }
  
  public void J()
  {
    if ((this.f.j != null) && (this.f.j.y != null)) {
      u.e().a(this.f.c, this.f.e.b, this.f.j.y);
    }
    t();
  }
  
  protected acy a(abi.a parama, @Nullable e parame, @Nullable com.google.android.gms.ads.internal.safebrowsing.c paramc)
  {
    acy localacy = u.f().a(this.f.c, this.f.i, false, false, this.f.d, this.f.e, this.a, this, this.i);
    localacy.l().a(this, null, this, this, ((Boolean)uf.ac.c()).booleanValue(), this, this, parame, null, paramc);
    a(localacy);
    localacy.b(parama.a.w);
    wd.a(localacy, this);
    return localacy;
  }
  
  public void a(abi.a parama, un paramun)
  {
    int j = 1;
    if (!((Boolean)uf.av.c()).booleanValue())
    {
      super.a(parama, paramun);
      return;
    }
    if (parama.e != -2)
    {
      super.a(parama, paramun);
      return;
    }
    Bundle localBundle = parama.a.c.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    int i;
    if ((localBundle == null) || (!localBundle.containsKey("gw")))
    {
      i = 1;
      if (parama.b.h) {
        break label124;
      }
    }
    for (;;)
    {
      if ((i != 0) && (j != 0)) {
        this.f.k = b(parama);
      }
      super.a(this.f.k, paramun);
      return;
      i = 0;
      break;
      label124:
      j = 0;
    }
  }
  
  public void a(boolean paramBoolean, float paramFloat)
  {
    this.n = paramBoolean;
    this.o = paramFloat;
  }
  
  protected boolean a(AdRequestParcel paramAdRequestParcel, abi paramabi, boolean paramBoolean)
  {
    if ((this.f.e()) && (paramabi.b != null)) {
      u.g().a(paramabi.b);
    }
    return this.e.d();
  }
  
  public boolean a(AdRequestParcel paramAdRequestParcel, un paramun)
  {
    if (this.f.j != null)
    {
      abr.d("An interstitial is already loading. Aborting.");
      return false;
    }
    return super.a(paramAdRequestParcel, paramun);
  }
  
  public boolean a(@Nullable abi paramabi1, abi paramabi2)
  {
    if (!super.a(paramabi1, paramabi2)) {
      return false;
    }
    if ((!this.f.e()) && (this.f.D != null) && (paramabi2.j != null)) {
      this.h.a(this.f.i, paramabi2, this.f.D);
    }
    return true;
  }
  
  public void b(RewardItemParcel paramRewardItemParcel)
  {
    RewardItemParcel localRewardItemParcel = paramRewardItemParcel;
    if (this.f.j != null)
    {
      if (this.f.j.z != null) {
        u.e().a(this.f.c, this.f.e.b, this.f.j.z);
      }
      localRewardItemParcel = paramRewardItemParcel;
      if (this.f.j.x != null) {
        localRewardItemParcel = this.f.j.x;
      }
    }
    a(localRewardItemParcel);
  }
  
  public void b(boolean paramBoolean)
  {
    this.f.G = paramBoolean;
  }
  
  public void e_()
  {
    B();
    super.e_();
    if ((this.f.j != null) && (this.f.j.b != null))
    {
      acz localacz = this.f.j.b.l();
      if (localacz != null) {
        localacz.h();
      }
    }
  }
  
  public void f()
  {
    com.google.android.gms.common.internal.d.b("showInterstitial must be called on the main UI thread.");
    if (this.f.j == null)
    {
      abr.d("The interstitial has not loaded.");
      return;
    }
    if (((Boolean)uf.aL.c()).booleanValue()) {
      if (this.f.c.getApplicationContext() == null) {
        break label235;
      }
    }
    label235:
    for (String str = this.f.c.getApplicationContext().getPackageName();; localObject = this.f.c.getPackageName())
    {
      Bundle localBundle;
      if (!this.l)
      {
        abr.d("It is not recommended to show an interstitial before onAdLoaded completes.");
        localBundle = new Bundle();
        localBundle.putString("appid", str);
        localBundle.putString("action", "show_interstitial_before_load_finish");
        a(localBundle);
      }
      if (!u.e().g(this.f.c))
      {
        abr.d("It is not recommended to show an interstitial when app is not in foreground.");
        localBundle = new Bundle();
        localBundle.putString("appid", str);
        localBundle.putString("action", "show_interstitial_app_not_in_foreground");
        a(localBundle);
      }
      if (this.f.f()) {
        break;
      }
      if ((!this.f.j.n) || (this.f.j.p == null)) {
        break label249;
      }
      try
      {
        this.f.j.p.b();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        abr.d("Could not show interstitial.", localRemoteException);
        I();
        return;
      }
    }
    label249:
    if (this.f.j.b == null)
    {
      abr.d("The interstitial failed to load.");
      return;
    }
    if (this.f.j.b.p())
    {
      abr.d("The interstitial is already showing.");
      return;
    }
    this.f.j.b.a(true);
    if (this.f.j.j != null) {
      this.h.a(this.f.i, this.f.j);
    }
    if (this.f.G) {}
    for (Object localObject = u.e().h(this.f.c);; localObject = null)
    {
      this.m = u.z().a((Bitmap)localObject);
      if ((!((Boolean)uf.bA.c()).booleanValue()) || (localObject == null)) {
        break;
      }
      localObject = (Future)new a(this.m).e();
      return;
    }
    localObject = new InterstitialAdParameterParcel(this.f.G, H(), false, 0.0F, -1);
    int j = this.f.j.b.q();
    int i = j;
    if (j == -1) {
      i = this.f.j.g;
    }
    localObject = new AdOverlayInfoParcel(this, this, this, this.f.j.b, i, this.f.e, this.f.j.C, (InterstitialAdParameterParcel)localObject);
    u.c().a(this.f.c, (AdOverlayInfoParcel)localObject);
  }
  
  protected void p()
  {
    I();
    super.p();
  }
  
  protected void s()
  {
    super.s();
    this.l = true;
  }
  
  @aaa
  private class a
    extends abq
  {
    private final int b;
    
    public a(int paramInt)
    {
      this.b = paramInt;
    }
    
    public void a()
    {
      boolean bool1 = l.this.f.G;
      boolean bool2 = l.this.H();
      boolean bool3 = l.a(l.this);
      float f = l.b(l.this);
      int i;
      final Object localObject;
      if (l.this.f.G)
      {
        i = this.b;
        localObject = new InterstitialAdParameterParcel(bool1, bool2, bool3, f, i);
        i = l.this.f.j.b.q();
        if (i != -1) {
          break label192;
        }
        i = l.this.f.j.g;
      }
      label192:
      for (;;)
      {
        localObject = new AdOverlayInfoParcel(l.this, l.this, l.this, l.this.f.j.b, i, l.this.f.e, l.this.f.j.C, (InterstitialAdParameterParcel)localObject);
        abv.a.post(new Runnable()
        {
          public void run()
          {
            u.c().a(l.this.f.c, localObject);
          }
        });
        return;
        i = -1;
        break;
      }
    }
    
    public void b() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */