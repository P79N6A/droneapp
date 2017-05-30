package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.abi.a;

@aaa
public class aav extends abq implements aax, aba {
    private final a a;
    private final Context b;
    private final abc c;
    private final aba d;
    private final Object e;
    private final String f;
    private final String g;
    private final xg h;
    private final long i;
    private int j = 0;
    private int k = 3;
    private aaw l;

    public aav(Context context, String str, String str2, xg xgVar, a aVar, abc com_google_android_gms_internal_abc, aba com_google_android_gms_internal_aba, long j) {
        this.b = context;
        this.f = str;
        this.g = str2;
        this.h = xgVar;
        this.a = aVar;
        this.c = com_google_android_gms_internal_abc;
        this.e = new Object();
        this.d = com_google_android_gms_internal_aba;
        this.i = j;
    }

    private void a(AdRequestParcel adRequestParcel, xr xrVar) {
        this.c.b().a((aba) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f)) {
                xrVar.a(adRequestParcel, this.g, this.h.a);
            } else {
                xrVar.a(adRequestParcel, this.g);
            }
        } catch (Throwable e) {
            b.d("Fail to load ad from adapter.", e);
            a(this.f, 0);
        }
    }

    private void b(long j) {
        while (true) {
            synchronized (this.e) {
                if (this.j != 0) {
                    break;
                } else if (!a(j)) {
                    this.l = new aaw.a().a(this.k).a(u.k().b() - j).a(this.f).b(this.h.d).a();
                    return;
                }
            }
        }
        this.l = new aaw.a().a(u.k().b() - j).a(1 == this.j ? 6 : this.k).a(this.f).b(this.h.d).a();
    }

    public void a() {
        if (this.c != null && this.c.b() != null && this.c.a() != null) {
            aaz b = this.c.b();
            b.a(null);
            b.a((aax) this);
            AdRequestParcel adRequestParcel = this.a.a.c;
            xr a = this.c.a();
            try {
                if (a.g()) {
                    com.google.android.gms.ads.internal.util.client.a.a.post(new 1(this, adRequestParcel, a));
                } else {
                    com.google.android.gms.ads.internal.util.client.a.a.post(new 2(this, a, adRequestParcel, b));
                }
            } catch (Throwable e) {
                b.d("Fail to check if adapter is initialized.", e);
                a(this.f, 0);
            }
            b(u.k().b());
            b.a(null);
            b.a(null);
            if (this.j == 1) {
                this.d.a(this.f);
            } else {
                this.d.a(this.f, this.k);
            }
        }
    }

    public void a(int i) {
        a(this.f, 0);
    }

    public void a(String str) {
        synchronized (this.e) {
            this.j = 1;
            this.e.notify();
        }
    }

    public void a(String str, int i) {
        synchronized (this.e) {
            this.j = 2;
            this.k = i;
            this.e.notify();
        }
    }

    protected boolean a(long j) {
        long b = this.i - (u.k().b() - j);
        if (b <= 0) {
            this.k = 4;
            return false;
        }
        try {
            this.e.wait(b);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.k = 5;
            return false;
        }
    }

    public void b() {
    }

    public aaw c() {
        aaw com_google_android_gms_internal_aaw;
        synchronized (this.e) {
            com_google_android_gms_internal_aaw = this.l;
        }
        return com_google_android_gms_internal_aaw;
    }

    public xg f() {
        return this.h;
    }

    public void g() {
        a(this.a.a.c, this.c.a());
    }
}
