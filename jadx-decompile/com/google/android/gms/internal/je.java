package com.google.android.gms.internal;

import com.google.android.gms.internal.jh.a;

public class je extends jh {
    private final boolean a;
    private final ju<Boolean> e;

    public je(ij ijVar, ju<Boolean> juVar, boolean z) {
        super(a.AckUserWrite, ji.a, ijVar);
        this.e = juVar;
        this.a = z;
    }

    public jh a(kv kvVar) {
        if (!this.d.h()) {
            mk.a(this.d.d().equals(kvVar), "operationForChild called for unrelated child.");
            return new je(this.d.e(), this.e, this.a);
        } else if (this.e.b() != null) {
            mk.a(this.e.c().d(), "affectedTree should not have overlapping affected paths.");
            return this;
        } else {
            return new je(ij.a(), this.e.c(new ij(kvVar)), this.a);
        }
    }

    public ju<Boolean> a() {
        return this.e;
    }

    public boolean b() {
        return this.a;
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", new Object[]{c(), Boolean.valueOf(this.a), this.e});
    }
}
