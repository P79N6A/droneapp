package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.a.a;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;

@aaa
public class aaz extends a {
    private volatile aax a;
    private volatile aba b;
    private volatile aay c;

    public aaz(aay com_google_android_gms_internal_aay) {
        this.c = com_google_android_gms_internal_aay;
    }

    public void a(e eVar) {
        if (this.a != null) {
            this.a.g();
        }
    }

    public void a(e eVar, int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public void a(e eVar, RewardItemParcel rewardItemParcel) {
        if (this.c != null) {
            this.c.b(rewardItemParcel);
        }
    }

    public void a(aax com_google_android_gms_internal_aax) {
        this.a = com_google_android_gms_internal_aax;
    }

    public void a(aba com_google_android_gms_internal_aba) {
        this.b = com_google_android_gms_internal_aba;
    }

    public void b(e eVar) {
        if (this.b != null) {
            this.b.a(f.a(eVar).getClass().getName());
        }
    }

    public void b(e eVar, int i) {
        if (this.b != null) {
            this.b.a(f.a(eVar).getClass().getName(), i);
        }
    }

    public void c(e eVar) {
        if (this.c != null) {
            this.c.G();
        }
    }

    public void d(e eVar) {
        if (this.c != null) {
            this.c.H();
        }
    }

    public void e(e eVar) {
        if (this.c != null) {
            this.c.I();
        }
    }

    public void f(e eVar) {
        if (this.c != null) {
            this.c.J();
        }
    }

    public void g(e eVar) {
        if (this.c != null) {
            this.c.K();
        }
    }
}
