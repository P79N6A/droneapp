package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.games.multiplayer.realtime.d.a;

public final class e extends d {
    private final h a;
    private final g b;
    private final a c;
    private final String d;
    private final int e;
    private final String[] f;
    private final Bundle g;

    e(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.g = aVar.g;
        this.f = (String[]) aVar.f.toArray(new String[aVar.f.size()]);
        d.a(this.c, "Must specify a message listener");
    }

    public h a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public g c() {
        return this.b;
    }

    public a d() {
        return this.c;
    }

    public int e() {
        return this.e;
    }

    public String[] f() {
        return this.f;
    }

    public Bundle g() {
        return this.g;
    }
}
