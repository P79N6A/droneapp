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
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;

@aaa
public class ws extends a {
    private final String a;
    private final wm b;
    @Nullable
    private l c;
    private final wo d;
    @Nullable
    private zd e;
    private String f;

    public ws(Context context, String str, xq xqVar, VersionInfoParcel versionInfoParcel, d dVar) {
        this(str, new wm(context, xqVar, versionInfoParcel, dVar));
    }

    ws(String str, wm wmVar) {
        this.a = str;
        this.b = wmVar;
        this.d = new wo();
        u.t().a(wmVar);
    }

    static boolean b(AdRequestParcel adRequestParcel) {
        Bundle a = wp.a(adRequestParcel);
        return a != null && a.containsKey("gw");
    }

    static boolean c(AdRequestParcel adRequestParcel) {
        Bundle a = wp.a(adRequestParcel);
        return a != null && a.containsKey("_ad");
    }

    private void n() {
        if (this.c != null && this.e != null) {
            this.c.a(this.e, this.f);
        }
    }

    @Nullable
    public e a() {
        return this.c != null ? this.c.a() : null;
    }

    public void a(AdSizeParcel adSizeParcel) {
        if (this.c != null) {
            this.c.a(adSizeParcel);
        }
    }

    public void a(VideoOptionsParcel videoOptionsParcel) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public void a(af afVar) {
        this.d.e = afVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(ag agVar) {
        this.d.a = agVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(am amVar) {
        this.d.b = amVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(ao aoVar) {
        m();
        if (this.c != null) {
            this.c.a(aoVar);
        }
    }

    public void a(com.google.android.gms.ads.internal.reward.client.d dVar) {
        this.d.f = dVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(ur urVar) {
        this.d.d = urVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(yy yyVar) {
        this.d.c = yyVar;
        if (this.c != null) {
            this.d.a(this.c);
        }
    }

    public void a(zd zdVar, String str) {
        this.e = zdVar;
        this.f = str;
        n();
    }

    public void a(String str) {
    }

    public void a(boolean z) {
        m();
        if (this.c != null) {
            this.c.a(z);
        }
    }

    public boolean a(AdRequestParcel adRequestParcel) {
        if (((Boolean) uf.at.c()).booleanValue()) {
            AdRequestParcel.a(adRequestParcel);
        }
        if (!b(adRequestParcel)) {
            m();
        }
        if (wp.c(adRequestParcel)) {
            m();
        }
        if (adRequestParcel.j != null) {
            m();
        }
        if (this.c != null) {
            return this.c.a(adRequestParcel);
        }
        wp t = u.t();
        if (c(adRequestParcel)) {
            t.b(adRequestParcel, this.a);
        }
        wr.a a = t.a(adRequestParcel, this.a);
        if (a != null) {
            if (!a.e) {
                a.a();
            }
            this.c = a.a;
            a.c.a(this.d);
            this.d.a(this.c);
            n();
            return a.f;
        }
        m();
        return this.c.a(adRequestParcel);
    }

    public void b() {
        if (this.c != null) {
            this.c.b();
        }
    }

    public boolean c() {
        return this.c != null && this.c.c();
    }

    public void c_() {
        if (this.c != null) {
            this.c.c_();
        }
    }

    public void d() {
        if (this.c != null) {
            this.c.d();
        }
    }

    public void f() {
        if (this.c != null) {
            this.c.f();
        } else {
            b.d("Interstitial ad must be loaded before showInterstitial().");
        }
    }

    public void g_() {
        if (this.c != null) {
            this.c.g_();
        }
    }

    public void h() {
        if (this.c != null) {
            this.c.h();
        } else {
            b.d("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    @Nullable
    public AdSizeParcel i() {
        return this.c != null ? this.c.i() : null;
    }

    @Nullable
    public String j() {
        return this.c != null ? this.c.j() : null;
    }

    public boolean k() {
        return this.c != null && this.c.k();
    }

    public c l() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    void m() {
        if (this.c == null) {
            this.c = this.b.a(this.a);
            this.d.a(this.c);
            n();
        }
    }
}
