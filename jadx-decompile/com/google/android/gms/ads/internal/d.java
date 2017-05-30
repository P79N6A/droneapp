package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.safebrowsing.a;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.vq;
import com.google.android.gms.internal.wk;

@aaa
public class d {
    public final wk a;
    public final j b;
    public final m c;
    public final com.google.android.gms.ads.internal.safebrowsing.d d;

    public d(wk wkVar, j jVar, m mVar, com.google.android.gms.ads.internal.safebrowsing.d dVar) {
        this.a = wkVar;
        this.b = jVar;
        this.c = mVar;
        this.d = dVar;
    }

    public static d a() {
        return new d(new vq(), new n(), new t(), new a());
    }
}
