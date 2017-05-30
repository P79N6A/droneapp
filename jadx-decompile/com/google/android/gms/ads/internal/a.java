package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.Debug;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.client.af;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.am;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.client.w;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.i;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aas;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abj;
import com.google.android.gms.internal.abn;
import com.google.android.gms.internal.abo;
import com.google.android.gms.internal.ti;
import com.google.android.gms.internal.tn;
import com.google.android.gms.internal.tq;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.ul;
import com.google.android.gms.internal.un;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.vp;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zd;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

@aaa
public abstract class a extends com.google.android.gms.ads.internal.client.ak.a implements com.google.android.gms.ads.internal.client.a, p, com.google.android.gms.ads.internal.request.a.a, abn, vp, com.google.android.gms.internal.zn.a {
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

    a(v vVar, @Nullable r rVar, d dVar) {
        this.f = vVar;
        if (rVar == null) {
            rVar = new r(this);
        }
        this.e = rVar;
        this.i = dVar;
        u.e().b(this.f.c);
        u.i().a(this.f.c, this.f.e);
        u.j().a(this.f.c);
        this.h = u.i().p();
        u.h().a(this.f.c);
        u();
    }

    private TimerTask a(final Timer timer, final CountDownLatch countDownLatch) {
        return new TimerTask(this) {
            final /* synthetic */ a c;

            public void run() {
                if (((long) ((Integer) uf.bV.c()).intValue()) != countDownLatch.getCount()) {
                    b.a("Stopping method tracing");
                    Debug.stopMethodTracing();
                    if (countDownLatch.getCount() == 0) {
                        timer.cancel();
                        return;
                    }
                }
                String concat = String.valueOf(this.c.f.c.getPackageName()).concat("_adsTrace_");
                try {
                    b.a("Starting method tracing");
                    countDownLatch.countDown();
                    Debug.startMethodTracing(new StringBuilder(String.valueOf(concat).length() + 20).append(concat).append(u.k().a()).toString(), ((Integer) uf.bW.c()).intValue());
                } catch (Throwable e) {
                    b.d("Exception occurred while starting method tracing.", e);
                }
            }
        };
    }

    private AdRequestParcel d(AdRequestParcel adRequestParcel) {
        return (!i.b(this.f.c) || adRequestParcel.k == null) ? adRequestParcel : new w(adRequestParcel).a(null).a();
    }

    private void d(abi com_google_android_gms_internal_abi) {
        if (u.m().b() && !com_google_android_gms_internal_abi.H && !TextUtils.isEmpty(com_google_android_gms_internal_abi.D)) {
            b.a("Sending troubleshooting signals to the server.");
            u.m().a(this.f.c, this.f.e.b, com_google_android_gms_internal_abi.D, this.f.b);
            com_google_android_gms_internal_abi.H = true;
        }
    }

    private void u() {
        if (((Boolean) uf.bT.c()).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(a(timer, new CountDownLatch(((Integer) uf.bV.c()).intValue())), 0, ((Long) uf.bU.c()).longValue());
        }
    }

    Bundle a(@Nullable tq tqVar) {
        if (tqVar == null) {
            return null;
        }
        String b;
        String c;
        if (tqVar.f()) {
            tqVar.d();
        }
        tn c2 = tqVar.c();
        if (c2 != null) {
            b = c2.b();
            c = c2.c();
            String str = "In AdManager: loadAd, ";
            String valueOf = String.valueOf(c2.toString());
            b.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            if (b != null) {
                u.i().a(b);
            }
        } else {
            c = null;
            b = u.i().i();
        }
        if (b == null) {
            return null;
        }
        Bundle bundle = new Bundle(1);
        bundle.putString("fingerprint", b);
        if (b.equals(c)) {
            return bundle;
        }
        bundle.putString("v_fp", c);
        return bundle;
    }

    public e a() {
        d.b("getAdFrame must be called on the main UI thread.");
        return f.a(this.f.f);
    }

    protected void a(int i) {
        b.d("Failed to load ad: " + i);
        this.d = false;
        if (this.f.n != null) {
            try {
                this.f.n.a(i);
            } catch (Throwable e) {
                b.d("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.f.z != null) {
            try {
                this.f.z.a(i);
            } catch (Throwable e2) {
                b.d("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    protected void a(View view) {
        com.google.android.gms.ads.internal.v.a aVar = this.f.f;
        if (aVar != null) {
            aVar.addView(view, u.g().d());
        }
    }

    public void a(AdSizeParcel adSizeParcel) {
        d.b("setAdSize must be called on the main UI thread.");
        this.f.i = adSizeParcel;
        if (!(this.f.j == null || this.f.j.b == null || this.f.E != 0)) {
            this.f.j.b.a(adSizeParcel);
        }
        if (this.f.f != null) {
            if (this.f.f.getChildCount() > 1) {
                this.f.f.removeView(this.f.f.getNextView());
            }
            this.f.f.setMinimumWidth(adSizeParcel.g);
            this.f.f.setMinimumHeight(adSizeParcel.d);
            this.f.f.requestLayout();
        }
    }

    public void a(@Nullable VideoOptionsParcel videoOptionsParcel) {
        d.b("setVideoOptions must be called on the main UI thread.");
        this.f.x = videoOptionsParcel;
    }

    public void a(af afVar) {
        d.b("setAdListener must be called on the main UI thread.");
        this.f.m = afVar;
    }

    public void a(ag agVar) {
        d.b("setAdListener must be called on the main UI thread.");
        this.f.n = agVar;
    }

    public void a(am amVar) {
        d.b("setAppEventListener must be called on the main UI thread.");
        this.f.o = amVar;
    }

    public void a(ao aoVar) {
        d.b("setCorrelationIdProvider must be called on the main UI thread");
        this.f.p = aoVar;
    }

    public void a(com.google.android.gms.ads.internal.reward.client.d dVar) {
        d.b("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f.z = dVar;
    }

    protected void a(@Nullable RewardItemParcel rewardItemParcel) {
        if (this.f.z != null) {
            try {
                String str = "";
                int i = 0;
                if (rewardItemParcel != null) {
                    str = rewardItemParcel.b;
                    i = rewardItemParcel.c;
                }
                this.f.z.a(new aas(str, i));
            } catch (Throwable e) {
                b.d("Could not call RewardedVideoAdListener.onRewarded().", e);
            }
        }
    }

    public void a(com.google.android.gms.internal.abi.a aVar) {
        if (!(aVar.b.n == -1 || TextUtils.isEmpty(aVar.b.y))) {
            long b = b(aVar.b.y);
            if (b != -1) {
                ul a = this.a.a(b + aVar.b.n);
                this.a.a(a, "stc");
            }
        }
        this.a.a(aVar.b.y);
        this.a.a(this.b, "arf");
        this.c = this.a.a();
        this.a.a("gqi", aVar.b.z);
        this.f.g = null;
        this.f.k = aVar;
        a(aVar, this.a);
    }

    protected abstract void a(com.google.android.gms.internal.abi.a aVar, un unVar);

    public void a(ur urVar) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void a(yy yyVar) {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void a(zd zdVar, String str) {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public void a(String str) {
        b.d("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public void a(String str, @Nullable String str2) {
        if (this.f.o != null) {
            try {
                this.f.o.a(str, str2);
            } catch (Throwable e) {
                b.d("Could not call the AppEventListener.", e);
            }
        }
    }

    public void a(HashSet<abj> hashSet) {
        this.f.a((HashSet) hashSet);
    }

    public void a(boolean z) {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public boolean a(AdRequestParcel adRequestParcel) {
        d.b("loadAd must be called on the main UI thread.");
        u.j().a();
        if (((Boolean) uf.at.c()).booleanValue()) {
            AdRequestParcel.a(adRequestParcel);
        }
        AdRequestParcel d = d(adRequestParcel);
        if (this.f.g == null && this.f.h == null) {
            b.c("Starting ad request.");
            o();
            this.b = this.a.a();
            if (!d.f) {
                String valueOf = String.valueOf(ac.a().a(this.f.c));
                b.c(new StringBuilder(String.valueOf(valueOf).length() + 71).append("Use AdRequest.Builder.addTestDevice(\"").append(valueOf).append("\") to get test ads on this device.").toString());
            }
            this.e.a(d);
            this.d = a(d, this.a);
            return this.d;
        }
        if (this.g != null) {
            b.d("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            b.d("Loading already in progress, saving this object for future refreshes.");
        }
        this.g = d;
        return false;
    }

    protected abstract boolean a(AdRequestParcel adRequestParcel, un unVar);

    boolean a(abi com_google_android_gms_internal_abi) {
        return false;
    }

    protected abstract boolean a(@Nullable abi com_google_android_gms_internal_abi, abi com_google_android_gms_internal_abi2);

    long b(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException e) {
            b.d("Invalid index for Url fetch time in CSI latency info.");
            return -1;
        } catch (NumberFormatException e2) {
            b.d("Cannot find valid format of Url fetch time in CSI latency info.");
            return -1;
        }
    }

    public void b() {
        d.b("destroy must be called on the main UI thread.");
        this.e.a();
        this.h.c(this.f.j);
        this.f.j();
    }

    public void b(abi com_google_android_gms_internal_abi) {
        this.a.a(this.c, "awr");
        this.f.h = null;
        if (!(com_google_android_gms_internal_abi.d == -2 || com_google_android_gms_internal_abi.d == 3)) {
            u.i().a(this.f.a());
        }
        if (com_google_android_gms_internal_abi.d == -1) {
            this.d = false;
            return;
        }
        if (a(com_google_android_gms_internal_abi)) {
            b.a("Ad refresh scheduled.");
        }
        if (com_google_android_gms_internal_abi.d != -2) {
            a(com_google_android_gms_internal_abi.d);
            return;
        }
        if (this.f.C == null) {
            this.f.C = new abo(this.f.b);
        }
        this.h.b(this.f.j);
        if (a(this.f.j, com_google_android_gms_internal_abi)) {
            this.f.j = com_google_android_gms_internal_abi;
            this.f.i();
            this.a.a("is_mraid", this.f.j.a() ? "1" : "0");
            this.a.a("is_mediation", this.f.j.n ? "1" : "0");
            if (!(this.f.j.b == null || this.f.j.b.l() == null)) {
                this.a.a("is_delay_pl", this.f.j.b.l().f() ? "1" : "0");
            }
            this.a.a(this.b, "ttc");
            if (u.i().e() != null) {
                u.i().e().a(this.a);
            }
            if (this.f.e()) {
                s();
            }
        }
        if (com_google_android_gms_internal_abi.I != null) {
            u.e().a(this.f.c, com_google_android_gms_internal_abi.I);
        }
    }

    protected boolean b(AdRequestParcel adRequestParcel) {
        if (this.f.f == null) {
            return false;
        }
        ViewParent parent = this.f.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return u.e().a(view, view.getContext());
    }

    public void c(AdRequestParcel adRequestParcel) {
        if (b(adRequestParcel)) {
            a(adRequestParcel);
            return;
        }
        b.c("Ad is not visible. Not refreshing ad.");
        this.e.b(adRequestParcel);
    }

    protected void c(@Nullable abi com_google_android_gms_internal_abi) {
        if (com_google_android_gms_internal_abi == null) {
            b.d("Ad state was null when trying to ping impression URLs.");
            return;
        }
        b.a("Pinging Impression URLs.");
        if (this.f.l != null) {
            this.f.l.a();
        }
        if (com_google_android_gms_internal_abi.e != null && !com_google_android_gms_internal_abi.F) {
            u.e().a(this.f.c, this.f.e.b, com_google_android_gms_internal_abi.e);
            com_google_android_gms_internal_abi.F = true;
            d(com_google_android_gms_internal_abi);
        }
    }

    public boolean c() {
        d.b("isLoaded must be called on the main UI thread.");
        return this.f.g == null && this.f.h == null && this.f.j != null;
    }

    public void c_() {
        d.b("resume must be called on the main UI thread.");
    }

    public void d() {
        d.b("pause must be called on the main UI thread.");
    }

    public void e() {
        if (this.f.j == null) {
            b.d("Ad state was null when trying to ping click URLs.");
            return;
        }
        b.a("Pinging click URLs.");
        if (this.f.l != null) {
            this.f.l.b();
        }
        if (this.f.j.c != null) {
            u.e().a(this.f.c, this.f.e.b, this.f.j.c);
        }
        if (this.f.m != null) {
            try {
                this.f.m.a();
            } catch (Throwable e) {
                b.d("Could not notify onAdClicked event.", e);
            }
        }
    }

    public void g_() {
        d.b("stopLoading must be called on the main UI thread.");
        this.d = false;
        this.f.a(true);
    }

    public void h() {
        d.b("recordManualImpression must be called on the main UI thread.");
        if (this.f.j == null) {
            b.d("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        b.a("Pinging manual tracking URLs.");
        if (this.f.j.f != null && !this.f.j.G) {
            u.e().a(this.f.c, this.f.e.b, this.f.j.f);
            this.f.j.G = true;
            d(this.f.j);
        }
    }

    @Nullable
    public AdSizeParcel i() {
        d.b("getAdSize must be called on the main UI thread.");
        return this.f.i == null ? null : new ThinAdSizeParcel(this.f.i);
    }

    public boolean k() {
        return this.d;
    }

    public c l() {
        return null;
    }

    public void m() {
        q();
    }

    public d n() {
        return this.i;
    }

    public void o() {
        this.a = new un(((Boolean) uf.N.c()).booleanValue(), "load_ad", this.f.i.b);
        this.b = new ul(-1, null, null);
        this.c = new ul(-1, null, null);
    }

    protected void p() {
        b.c("Ad closing.");
        if (this.f.n != null) {
            try {
                this.f.n.a();
            } catch (Throwable e) {
                b.d("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.f.z != null) {
            try {
                this.f.z.d();
            } catch (Throwable e2) {
                b.d("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    protected void q() {
        b.c("Ad leaving application.");
        if (this.f.n != null) {
            try {
                this.f.n.b();
            } catch (Throwable e) {
                b.d("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.f.z != null) {
            try {
                this.f.z.e();
            } catch (Throwable e2) {
                b.d("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    protected void r() {
        b.c("Ad opening.");
        if (this.f.n != null) {
            try {
                this.f.n.d();
            } catch (Throwable e) {
                b.d("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.f.z != null) {
            try {
                this.f.z.b();
            } catch (Throwable e2) {
                b.d("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    protected void s() {
        b.c("Ad finished loading.");
        this.d = false;
        if (this.f.n != null) {
            try {
                this.f.n.c();
            } catch (Throwable e) {
                b.d("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.f.z != null) {
            try {
                this.f.z.a();
            } catch (Throwable e2) {
                b.d("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    protected void t() {
        if (this.f.z != null) {
            try {
                this.f.z.c();
            } catch (Throwable e) {
                b.d("Could not call RewardedVideoAdListener.onVideoStarted().", e);
            }
        }
    }
}
