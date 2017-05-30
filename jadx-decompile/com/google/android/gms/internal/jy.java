package com.google.android.gms.internal;

public class jy {
    private final lc a;
    private final boolean b;
    private final boolean c;

    public jy(lc lcVar, boolean z, boolean z2) {
        this.a = lcVar;
        this.b = z;
        this.c = z2;
    }

    public boolean a() {
        return this.b;
    }

    public boolean a(ij ijVar) {
        return ijVar.h() ? a() && !this.c : a(ijVar.d());
    }

    public boolean a(kv kvVar) {
        return (a() && !this.c) || this.a.a().a(kvVar);
    }

    public boolean b() {
        return this.c;
    }

    public lh c() {
        return this.a.a();
    }

    public lc d() {
        return this.a;
    }
}
