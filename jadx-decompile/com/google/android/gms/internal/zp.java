package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.internal.zn.a;

@aaa
public class zp extends abq {
    private final a a;
    private final AdResponseParcel b = this.c.b;
    private final abi.a c;

    public zp(abi.a aVar, a aVar2) {
        this.c = aVar;
        this.a = aVar2;
    }

    private abi a(int i) {
        return new abi(this.c.a.c, null, null, i, null, null, this.b.l, this.b.k, this.c.a.i, false, null, null, null, null, null, this.b.i, this.c.d, this.b.g, this.c.f, this.b.n, this.b.o, this.c.h, null, null, null, null, this.c.b.F, this.c.b.G, null, null, null);
    }

    public void a() {
        abv.a.post(new 1(this, a(0)));
    }

    public void b() {
    }
}
