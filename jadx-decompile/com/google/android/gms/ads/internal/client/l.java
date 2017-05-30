package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.client.ak.a;
import com.google.android.gms.ads.internal.reward.client.d;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zd;

public class l extends a {
    private ag a;

    public e a() {
        return null;
    }

    public void a(AdSizeParcel adSizeParcel) {
    }

    public void a(VideoOptionsParcel videoOptionsParcel) {
    }

    public void a(af afVar) {
    }

    public void a(ag agVar) {
        this.a = agVar;
    }

    public void a(am amVar) {
    }

    public void a(ao aoVar) {
    }

    public void a(d dVar) {
    }

    public void a(ur urVar) {
    }

    public void a(yy yyVar) {
    }

    public void a(zd zdVar, String str) {
    }

    public void a(String str) {
    }

    public void a(boolean z) {
    }

    public boolean a(AdRequestParcel adRequestParcel) {
        b.b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable(this) {
            final /* synthetic */ l a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.a != null) {
                    try {
                        this.a.a.a(1);
                    } catch (Throwable e) {
                        b.d("Could not notify onAdFailedToLoad event.", e);
                    }
                }
            }
        });
        return false;
    }

    public void b() {
    }

    public boolean c() {
        return false;
    }

    public void c_() {
    }

    public void d() {
    }

    public void f() {
    }

    public void g_() {
    }

    public void h() {
    }

    public AdSizeParcel i() {
        return null;
    }

    public String j() {
        return null;
    }

    public boolean k() {
        return false;
    }

    public c l() {
        return null;
    }
}
