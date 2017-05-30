package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aaf;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.un;
import com.google.android.gms.internal.vx;
import com.google.android.gms.internal.wd;
import com.google.android.gms.internal.wy;
import com.google.android.gms.internal.xg;
import com.google.android.gms.internal.xh;
import com.google.android.gms.internal.xq;
import com.tencent.tauth.AuthActivity;
import java.util.Collections;
import java.util.concurrent.Future;
import org.json.JSONObject;

@aaa
public class l extends c implements vx, com.google.android.gms.internal.wd.a {
    protected transient boolean l = false;
    private int m = -1;
    private boolean n;
    private float o;

    @aaa
    private class a extends abq {
        final /* synthetic */ l a;
        private final int b;

        public a(l lVar, int i) {
            this.a = lVar;
            this.b = i;
        }

        public void a() {
            InterstitialAdParameterParcel interstitialAdParameterParcel = new InterstitialAdParameterParcel(this.a.f.G, this.a.H(), this.a.n, this.a.o, this.a.f.G ? this.b : -1);
            int q = this.a.f.j.b.q();
            final AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this.a, this.a, this.a, this.a.f.j.b, q == -1 ? this.a.f.j.g : q, this.a.f.e, this.a.f.j.C, interstitialAdParameterParcel);
            abv.a.post(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    u.c().a(this.b.a.f.c, adOverlayInfoParcel);
                }
            });
        }

        public void b() {
        }
    }

    public l(Context context, AdSizeParcel adSizeParcel, String str, xq xqVar, VersionInfoParcel versionInfoParcel, d dVar) {
        super(context, adSizeParcel, str, xqVar, versionInfoParcel, dVar);
    }

    private void a(Bundle bundle) {
        u.e().b(this.f.c, this.f.e.b, "gmob-apps", bundle, false);
    }

    static com.google.android.gms.internal.abi.a b(com.google.android.gms.internal.abi.a aVar) {
        try {
            String jSONObject = aaf.a(aVar.b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.google.ads.mediation.a.AD_UNIT_ID_PARAMETER, aVar.a.e);
            xg xgVar = new xg(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
            AdResponseParcel adResponseParcel = aVar.b;
            xh xhVar = new xh(Collections.singletonList(xgVar), -1, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), adResponseParcel.J, adResponseParcel.K, "", -1, 0, 1, null, 0, -1, -1, false);
            return new com.google.android.gms.internal.abi.a(aVar.a, new AdResponseParcel(aVar.a, adResponseParcel.b, adResponseParcel.c, Collections.emptyList(), Collections.emptyList(), adResponseParcel.g, true, adResponseParcel.i, Collections.emptyList(), adResponseParcel.k, adResponseParcel.l, adResponseParcel.m, adResponseParcel.n, adResponseParcel.o, adResponseParcel.p, adResponseParcel.q, null, adResponseParcel.s, adResponseParcel.t, adResponseParcel.u, adResponseParcel.v, adResponseParcel.w, adResponseParcel.z, adResponseParcel.A, adResponseParcel.B, null, Collections.emptyList(), Collections.emptyList(), adResponseParcel.F, adResponseParcel.G, adResponseParcel.H, adResponseParcel.I, adResponseParcel.J, adResponseParcel.K, adResponseParcel.L, null, adResponseParcel.N), xhVar, aVar.d, aVar.e, aVar.f, aVar.g, null);
        } catch (Throwable e) {
            b.b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return aVar;
        }
    }

    protected boolean H() {
        if (!(this.f.c instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.f.c).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        boolean z = (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
        return z;
    }

    public void I() {
        u.z().b(Integer.valueOf(this.m));
        if (this.f.e()) {
            this.f.b();
            this.f.j = null;
            this.f.G = false;
            this.l = false;
        }
    }

    public void J() {
        if (!(this.f.j == null || this.f.j.y == null)) {
            u.e().a(this.f.c, this.f.e.b, this.f.j.y);
        }
        t();
    }

    protected acy a(com.google.android.gms.internal.abi.a aVar, @Nullable e eVar, @Nullable c cVar) {
        acy a = u.f().a(this.f.c, this.f.i, false, false, this.f.d, this.f.e, this.a, this, this.i);
        a.l().a(this, null, this, this, ((Boolean) uf.ac.c()).booleanValue(), this, this, eVar, null, cVar);
        a((wy) a);
        a.b(aVar.a.w);
        wd.a(a, (com.google.android.gms.internal.wd.a) this);
        return a;
    }

    public void a(com.google.android.gms.internal.abi.a aVar, un unVar) {
        Object obj = 1;
        if (!((Boolean) uf.av.c()).booleanValue()) {
            super.a(aVar, unVar);
        } else if (aVar.e != -2) {
            super.a(aVar, unVar);
        } else {
            Bundle bundle = aVar.a.c.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
            Object obj2 = (bundle == null || !bundle.containsKey("gw")) ? 1 : null;
            if (aVar.b.h) {
                obj = null;
            }
            if (!(obj2 == null || r2 == null)) {
                this.f.k = b(aVar);
            }
            super.a(this.f.k, unVar);
        }
    }

    public void a(boolean z, float f) {
        this.n = z;
        this.o = f;
    }

    protected boolean a(AdRequestParcel adRequestParcel, abi com_google_android_gms_internal_abi, boolean z) {
        if (this.f.e() && com_google_android_gms_internal_abi.b != null) {
            u.g().a(com_google_android_gms_internal_abi.b);
        }
        return this.e.d();
    }

    public boolean a(AdRequestParcel adRequestParcel, un unVar) {
        if (this.f.j == null) {
            return super.a(adRequestParcel, unVar);
        }
        b.d("An interstitial is already loading. Aborting.");
        return false;
    }

    public boolean a(@Nullable abi com_google_android_gms_internal_abi, abi com_google_android_gms_internal_abi2) {
        if (!super.a(com_google_android_gms_internal_abi, com_google_android_gms_internal_abi2)) {
            return false;
        }
        if (!(this.f.e() || this.f.D == null || com_google_android_gms_internal_abi2.j == null)) {
            this.h.a(this.f.i, com_google_android_gms_internal_abi2, this.f.D);
        }
        return true;
    }

    public void b(RewardItemParcel rewardItemParcel) {
        if (this.f.j != null) {
            if (this.f.j.z != null) {
                u.e().a(this.f.c, this.f.e.b, this.f.j.z);
            }
            if (this.f.j.x != null) {
                rewardItemParcel = this.f.j.x;
            }
        }
        a(rewardItemParcel);
    }

    public void b(boolean z) {
        this.f.G = z;
    }

    public void e_() {
        B();
        super.e_();
        if (this.f.j != null && this.f.j.b != null) {
            acz l = this.f.j.b.l();
            if (l != null) {
                l.h();
            }
        }
    }

    public void f() {
        d.b("showInterstitial must be called on the main UI thread.");
        if (this.f.j == null) {
            b.d("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) uf.aL.c()).booleanValue()) {
            Bundle bundle;
            String packageName = this.f.c.getApplicationContext() != null ? this.f.c.getApplicationContext().getPackageName() : this.f.c.getPackageName();
            if (!this.l) {
                b.d("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString(AuthActivity.ACTION_KEY, "show_interstitial_before_load_finish");
                a(bundle);
            }
            if (!u.e().g(this.f.c)) {
                b.d("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString(AuthActivity.ACTION_KEY, "show_interstitial_app_not_in_foreground");
                a(bundle);
            }
        }
        if (!this.f.f()) {
            if (this.f.j.n && this.f.j.p != null) {
                try {
                    this.f.j.p.b();
                } catch (Throwable e) {
                    b.d("Could not show interstitial.", e);
                    I();
                }
            } else if (this.f.j.b == null) {
                b.d("The interstitial failed to load.");
            } else if (this.f.j.b.p()) {
                b.d("The interstitial is already showing.");
            } else {
                this.f.j.b.a(true);
                if (this.f.j.j != null) {
                    this.h.a(this.f.i, this.f.j);
                }
                Bitmap h = this.f.G ? u.e().h(this.f.c) : null;
                this.m = u.z().a(h);
                if (!((Boolean) uf.bA.c()).booleanValue() || h == null) {
                    InterstitialAdParameterParcel interstitialAdParameterParcel = new InterstitialAdParameterParcel(this.f.G, H(), false, 0.0f, -1);
                    int q = this.f.j.b.q();
                    if (q == -1) {
                        q = this.f.j.g;
                    }
                    u.c().a(this.f.c, new AdOverlayInfoParcel(this, this, this, this.f.j.b, q, this.f.e, this.f.j.C, interstitialAdParameterParcel));
                    return;
                }
                Future future = (Future) new a(this, this.m).e();
            }
        }
    }

    protected void p() {
        I();
        super.p();
    }

    protected void s() {
        super.s();
        this.l = true;
    }
}
