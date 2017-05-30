package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.u;

class wr$a {
    l a;
    @Nullable
    AdRequestParcel b;
    wn c;
    long d;
    boolean e;
    boolean f;
    final /* synthetic */ wr g;

    wr$a(wr wrVar, wm wmVar) {
        this.g = wrVar;
        this.a = wmVar.b(wr.a(wrVar));
        this.c = new wn();
        this.c.a(this.a);
    }

    wr$a(wr wrVar, wm wmVar, AdRequestParcel adRequestParcel) {
        this(wrVar, wmVar);
        this.b = adRequestParcel;
    }

    void a() {
        if (!this.e) {
            this.f = this.a.a(wp.b(this.b != null ? this.b : wr.b(this.g)));
            this.e = true;
            this.d = u.k().a();
        }
    }
}
