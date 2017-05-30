package com.google.android.gms.internal;

import com.google.android.gms.internal.jh.a;

public class jg extends jh {
    private final ia a;

    public jg(ji jiVar, ij ijVar, ia iaVar) {
        super(a.Merge, jiVar, ijVar);
        this.a = iaVar;
    }

    public ia a() {
        return this.a;
    }

    public jh a(kv kvVar) {
        if (!this.d.h()) {
            return this.d.d().equals(kvVar) ? new jg(this.c, this.d.e(), this.a) : null;
        } else {
            ia d = this.a.d(new ij(kvVar));
            return d.e() ? null : d.b() != null ? new jj(this.c, ij.a(), d.b()) : new jg(this.c, ij.a(), d);
        }
    }

    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", new Object[]{c(), d(), this.a});
    }
}
