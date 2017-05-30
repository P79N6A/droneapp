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
import com.google.android.gms.ads.internal.formats.l;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.reward.client.b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aat;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.uw;
import com.google.android.gms.internal.ws;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.yq;
import com.google.android.gms.internal.yz;

@Keep
@DynamiteApi
@aaa
public class ClientApi extends a {
    public ai createAdLoaderBuilder(e eVar, String str, xq xqVar, int i) {
        return new k((Context) f.a(eVar), str, xqVar, new VersionInfoParcel(q.a, i, true), d.a());
    }

    public yq createAdOverlay(e eVar) {
        return new d((Activity) f.a(eVar));
    }

    public ak createBannerAdManager(e eVar, AdSizeParcel adSizeParcel, String str, xq xqVar, int i) {
        return new f((Context) f.a(eVar), adSizeParcel, str, xqVar, new VersionInfoParcel(q.a, i, true), d.a());
    }

    public yz createInAppPurchaseManager(e eVar) {
        return new com.google.android.gms.ads.internal.purchase.e((Activity) f.a(eVar));
    }

    public ak createInterstitialAdManager(e eVar, AdSizeParcel adSizeParcel, String str, xq xqVar, int i) {
        Context context = (Context) f.a(eVar);
        uf.a(context);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(q.a, i, true);
        boolean equals = "reward_mb".equals(adSizeParcel.b);
        Object obj = ((equals || !((Boolean) uf.av.c()).booleanValue()) && !(equals && ((Boolean) uf.aw.c()).booleanValue())) ? null : 1;
        if (obj != null) {
            return new ws(context, str, xqVar, versionInfoParcel, d.a());
        }
        return new l(context, adSizeParcel, str, xqVar, versionInfoParcel, d.a());
    }

    public uw createNativeAdViewDelegate(e eVar, e eVar2) {
        return new l((FrameLayout) f.a(eVar), (FrameLayout) f.a(eVar2));
    }

    public b createRewardedVideoAd(e eVar, xq xqVar, int i) {
        return new aat((Context) f.a(eVar), d.a(), xqVar, new VersionInfoParcel(q.a, i, true));
    }

    public ak createSearchAdManager(e eVar, AdSizeParcel adSizeParcel, String str, int i) {
        return new t((Context) f.a(eVar), adSizeParcel, str, new VersionInfoParcel(q.a, i, true));
    }

    @Nullable
    public ap getMobileAdsSettingsManager(e eVar) {
        return null;
    }

    public ap getMobileAdsSettingsManagerWithClientJarVersion(e eVar, int i) {
        return o.a((Context) f.a(eVar), new VersionInfoParcel(q.a, i, true));
    }
}
