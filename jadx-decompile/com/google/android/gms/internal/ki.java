package com.google.android.gms.internal;

public class ki {
    private final jy a;
    private final jy b;

    public ki(jy jyVar, jy jyVar2) {
        this.a = jyVar;
        this.b = jyVar2;
    }

    public jy a() {
        return this.a;
    }

    public ki a(lc lcVar, boolean z, boolean z2) {
        return new ki(new jy(lcVar, z, z2), this.b);
    }

    public ki b(lc lcVar, boolean z, boolean z2) {
        return new ki(this.a, new jy(lcVar, z, z2));
    }

    public lh b() {
        return this.a.a() ? this.a.c() : null;
    }

    public jy c() {
        return this.b;
    }

    public lh d() {
        return this.b.a() ? this.b.c() : null;
    }
}
