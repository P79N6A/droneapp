package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ai;
import com.google.android.gms.ads.internal.client.ak;
import com.google.android.gms.ads.internal.client.an.a;
import com.google.android.gms.ads.internal.client.ap;
import com.google.android.gms.ads.internal.reward.client.b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aat;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.uw;
import com.google.android.gms.internal.ws;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.yq;
import com.google.android.gms.internal.yz;

@aaa
@Keep
@DynamiteApi
public class ClientApi
  extends an.a
{
  public ai createAdLoaderBuilder(com.google.android.gms.c.e parame, String paramString, xq paramxq, int paramInt)
  {
    return new k((Context)com.google.android.gms.c.f.a(parame), paramString, paramxq, new VersionInfoParcel(9683000, paramInt, true), d.a());
  }
  
  public yq createAdOverlay(com.google.android.gms.c.e parame)
  {
    return new com.google.android.gms.ads.internal.overlay.d((Activity)com.google.android.gms.c.f.a(parame));
  }
  
  public ak createBannerAdManager(com.google.android.gms.c.e parame, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, int paramInt)
  {
    return new f((Context)com.google.android.gms.c.f.a(parame), paramAdSizeParcel, paramString, paramxq, new VersionInfoParcel(9683000, paramInt, true), d.a());
  }
  
  public yz createInAppPurchaseManager(com.google.android.gms.c.e parame)
  {
    return new com.google.android.gms.ads.internal.purchase.e((Activity)com.google.android.gms.c.f.a(parame));
  }
  
  public ak createInterstitialAdManager(com.google.android.gms.c.e parame, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, int paramInt)
  {
    parame = (Context)com.google.android.gms.c.f.a(parame);
    uf.a(parame);
    VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(9683000, paramInt, true);
    boolean bool = "reward_mb".equals(paramAdSizeParcel.b);
    if (((!bool) && (((Boolean)uf.av.c()).booleanValue())) || ((bool) && (((Boolean)uf.aw.c()).booleanValue()))) {}
    for (paramInt = 1; paramInt != 0; paramInt = 0) {
      return new ws(parame, paramString, paramxq, localVersionInfoParcel, d.a());
    }
    return new l(parame, paramAdSizeParcel, paramString, paramxq, localVersionInfoParcel, d.a());
  }
  
  public uw createNativeAdViewDelegate(com.google.android.gms.c.e parame1, com.google.android.gms.c.e parame2)
  {
    return new com.google.android.gms.ads.internal.formats.l((FrameLayout)com.google.android.gms.c.f.a(parame1), (FrameLayout)com.google.android.gms.c.f.a(parame2));
  }
  
  public b createRewardedVideoAd(com.google.android.gms.c.e parame, xq paramxq, int paramInt)
  {
    parame = (Context)com.google.android.gms.c.f.a(parame);
    VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(9683000, paramInt, true);
    return new aat(parame, d.a(), paramxq, localVersionInfoParcel);
  }
  
  public ak createSearchAdManager(com.google.android.gms.c.e parame, AdSizeParcel paramAdSizeParcel, String paramString, int paramInt)
  {
    return new t((Context)com.google.android.gms.c.f.a(parame), paramAdSizeParcel, paramString, new VersionInfoParcel(9683000, paramInt, true));
  }
  
  @Nullable
  public ap getMobileAdsSettingsManager(com.google.android.gms.c.e parame)
  {
    return null;
  }
  
  public ap getMobileAdsSettingsManagerWithClientJarVersion(com.google.android.gms.c.e parame, int paramInt)
  {
    return o.a((Context)com.google.android.gms.c.f.a(parame), new VersionInfoParcel(9683000, paramInt, true));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/ClientApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */