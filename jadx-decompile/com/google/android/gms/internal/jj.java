package com.google.android.gms.internal;

import com.google.android.gms.internal.jh.a;

public class jj extends jh {
    private final lh a;

    public jj(ji jiVar, ij ijVar, lh lhVar) {
        super(a.Overwrite, jiVar, ijVar);
        this.a = lhVar;
    }

    public jh a(kv kvVar) {
        return this.d.h() ? new jj(this.c, ij.a(), this.a.c(kvVar)) : new jj(this.c, this.d.e(), this.a);
    }

    public lh a() {
        return this.a;
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", new Object[]{c(), d(), this.a});
    }
}
