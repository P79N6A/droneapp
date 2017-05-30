package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

public class jc {
    private final ij a;
    private final jb b;

    public jc(ij ijVar, jb jbVar) {
        this.a = ijVar;
        this.b = jbVar;
    }

    public jc a(kv kvVar) {
        return new jc(this.a.a(kvVar), this.b);
    }

    public lg a(lh lhVar, lg lgVar, boolean z, lb lbVar) {
        return this.b.a(this.a, lhVar, lgVar, z, lbVar);
    }

    public lh a(ij ijVar) {
        return this.b.b(this.a.a(ijVar));
    }

    public lh a(ij ijVar, lh lhVar, lh lhVar2) {
        return this.b.a(this.a, ijVar, lhVar, lhVar2);
    }

    public lh a(kv kvVar, jy jyVar) {
        return this.b.a(this.a, kvVar, jyVar);
    }

    public lh a(lh lhVar) {
        return a(lhVar, Collections.emptyList());
    }

    public lh a(lh lhVar, List<Long> list) {
        return a(lhVar, (List) list, false);
    }

    public lh a(lh lhVar, List<Long> list, boolean z) {
        return this.b.a(this.a, lhVar, (List) list, z);
    }

    public lh b(lh lhVar) {
        return this.b.a(this.a, lhVar);
    }
}
