package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.reward.client.f;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.uw;
import com.google.android.gms.internal.vj;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.yp;
import com.google.android.gms.internal.yq;
import com.google.android.gms.internal.yz;
import com.google.android.gms.internal.zf;
import com.tencent.tauth.AuthActivity;

@aaa
public class ab {
    private an a;
    private final Object b = new Object();
    private final v c;
    private final u d;
    private final j e;
    private final vj f;
    private final f g;
    private final zf h;
    private final yp i;

    @VisibleForTesting
    abstract class a<T> {
        final /* synthetic */ ab f;

        a(ab abVar) {
            this.f = abVar;
        }

        @Nullable
        protected abstract T b();

        @Nullable
        protected abstract T b(an anVar);

        @Nullable
        protected final T c() {
            T t = null;
            an a = this.f.b();
            if (a == null) {
                b.d("ClientApi class cannot be loaded.");
            } else {
                try {
                    t = b(a);
                } catch (Throwable e) {
                    b.d("Cannot invoke local loader using ClientApi class", e);
                }
            }
            return t;
        }

        @Nullable
        protected final T d() {
            try {
                return b();
            } catch (Throwable e) {
                b.d("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public ab(v vVar, u uVar, j jVar, vj vjVar, f fVar, zf zfVar, yp ypVar) {
        this.c = vVar;
        this.d = uVar;
        this.e = jVar;
        this.f = vjVar;
        this.g = fVar;
        this.h = zfVar;
        this.i = ypVar;
    }

    @Nullable
    private static an a() {
        try {
            Object newInstance = ab.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return com.google.android.gms.ads.internal.client.an.a.asInterface((IBinder) newInstance);
            }
            b.d("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Throwable e) {
            b.d("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    private void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AuthActivity.ACTION_KEY, "no_ads_fallback");
        bundle.putString("flow", str);
        ac.a().a(context, null, "gmob-apps", bundle, true);
    }

    private static boolean a(Activity activity, String str) {
        Intent intent = activity.getIntent();
        if (intent.hasExtra(str)) {
            return intent.getBooleanExtra(str, false);
        }
        b.b("useClientJar flag not found in activity intent extras.");
        return false;
    }

    @Nullable
    private an b() {
        an anVar;
        synchronized (this.b) {
            if (this.a == null) {
                this.a = a();
            }
            anVar = this.a;
        }
        return anVar;
    }

    public ai a(final Context context, final String str, final xq xqVar) {
        return (ai) a(context, false, new a<ai>(this) {
            final /* synthetic */ ab d;

            public ai a() {
                ai a = this.d.d.a(context, str, xqVar);
                if (a != null) {
                    return a;
                }
                this.d.a(context, "native_ad");
                return new k();
            }

            public ai a(an anVar) {
                return anVar.createAdLoaderBuilder(com.google.android.gms.c.f.a(context), str, xqVar, q.a);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(an anVar) {
                return a(anVar);
            }
        });
    }

    public ak a(final Context context, final AdSizeParcel adSizeParcel, final String str) {
        return (ak) a(context, false, new a<ak>(this) {
            final /* synthetic */ ab d;

            public ak a() {
                ak a = this.d.c.a(context, adSizeParcel, str, null, 3);
                if (a != null) {
                    return a;
                }
                this.d.a(context, com.google.firebase.a.a.a.o);
                return new l();
            }

            public ak a(an anVar) {
                return anVar.createSearchAdManager(com.google.android.gms.c.f.a(context), adSizeParcel, str, q.a);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(an anVar) {
                return a(anVar);
            }
        });
    }

    public ak a(Context context, AdSizeParcel adSizeParcel, String str, xq xqVar) {
        final Context context2 = context;
        final AdSizeParcel adSizeParcel2 = adSizeParcel;
        final String str2 = str;
        final xq xqVar2 = xqVar;
        return (ak) a(context, false, new a<ak>(this) {
            final /* synthetic */ ab e;

            public ak a() {
                ak a = this.e.c.a(context2, adSizeParcel2, str2, xqVar2, 1);
                if (a != null) {
                    return a;
                }
                this.e.a(context2, "banner");
                return new l();
            }

            public ak a(an anVar) {
                return anVar.createBannerAdManager(com.google.android.gms.c.f.a(context2), adSizeParcel2, str2, xqVar2, q.a);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(an anVar) {
                return a(anVar);
            }
        });
    }

    public ap a(final Context context) {
        return (ap) a(context, false, new a<ap>(this) {
            final /* synthetic */ ab b;

            public ap a() {
                ap a = this.b.e.a(context);
                if (a != null) {
                    return a;
                }
                this.b.a(context, "mobile_ads_settings");
                return new m();
            }

            public ap a(an anVar) {
                return anVar.getMobileAdsSettingsManagerWithClientJarVersion(com.google.android.gms.c.f.a(context), q.a);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(an anVar) {
                return a(anVar);
            }
        });
    }

    public com.google.android.gms.ads.internal.reward.client.b a(final Context context, final xq xqVar) {
        return (com.google.android.gms.ads.internal.reward.client.b) a(context, false, new a<com.google.android.gms.ads.internal.reward.client.b>(this) {
            final /* synthetic */ ab c;

            public com.google.android.gms.ads.internal.reward.client.b a() {
                com.google.android.gms.ads.internal.reward.client.b a = this.c.g.a(context, xqVar);
                if (a != null) {
                    return a;
                }
                this.c.a(context, "rewarded_video");
                return new o();
            }

            public com.google.android.gms.ads.internal.reward.client.b a(an anVar) {
                return anVar.createRewardedVideoAd(com.google.android.gms.c.f.a(context), xqVar, q.a);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(an anVar) {
                return a(anVar);
            }
        });
    }

    public uw a(final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2) {
        return (uw) a(context, false, new a<uw>(this) {
            final /* synthetic */ ab d;

            public uw a() {
                uw a = this.d.f.a(context, frameLayout, frameLayout2);
                if (a != null) {
                    return a;
                }
                this.d.a(context, "native_ad_view_delegate");
                return new n();
            }

            public uw a(an anVar) {
                return anVar.createNativeAdViewDelegate(com.google.android.gms.c.f.a(frameLayout), com.google.android.gms.c.f.a(frameLayout2));
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(an anVar) {
                return a(anVar);
            }
        });
    }

    @Nullable
    public yz a(final Activity activity) {
        return (yz) a((Context) activity, a(activity, "com.google.android.gms.ads.internal.purchase.useClientJar"), new a<yz>(this) {
            final /* synthetic */ ab b;

            public yz a() {
                yz a = this.b.h.a(activity);
                if (a != null) {
                    return a;
                }
                this.b.a(activity, "iap");
                return null;
            }

            public yz a(an anVar) {
                return anVar.createInAppPurchaseManager(com.google.android.gms.c.f.a(activity));
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(an anVar) {
                return a(anVar);
            }
        });
    }

    @VisibleForTesting
    <T> T a(Context context, boolean z, a<T> aVar) {
        if (!(z || ac.a().b(context))) {
            b.a("Google Play Services is not available");
            z = true;
        }
        T c;
        if (z) {
            c = aVar.c();
            return c == null ? aVar.d() : c;
        } else {
            c = aVar.d();
            return c == null ? aVar.c() : c;
        }
    }

    public ak b(Context context, AdSizeParcel adSizeParcel, String str, xq xqVar) {
        final Context context2 = context;
        final AdSizeParcel adSizeParcel2 = adSizeParcel;
        final String str2 = str;
        final xq xqVar2 = xqVar;
        return (ak) a(context, false, new a<ak>(this) {
            final /* synthetic */ ab e;

            public ak a() {
                ak a = this.e.c.a(context2, adSizeParcel2, str2, xqVar2, 2);
                if (a != null) {
                    return a;
                }
                this.e.a(context2, "interstitial");
                return new l();
            }

            public ak a(an anVar) {
                return anVar.createInterstitialAdManager(com.google.android.gms.c.f.a(context2), adSizeParcel2, str2, xqVar2, q.a);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(an anVar) {
                return a(anVar);
            }
        });
    }

    @Nullable
    public yq b(final Activity activity) {
        return (yq) a((Context) activity, a(activity, "com.google.android.gms.ads.internal.overlay.useClientJar"), new a<yq>(this) {
            final /* synthetic */ ab b;

            public yq a() {
                yq a = this.b.i.a(activity);
                if (a != null) {
                    return a;
                }
                this.b.a(activity, "ad_overlay");
                return null;
            }

            public yq a(an anVar) {
                return anVar.createAdOverlay(com.google.android.gms.c.f.a(activity));
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(an anVar) {
                return a(anVar);
            }
        });
    }
}
