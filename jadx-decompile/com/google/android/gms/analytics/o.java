package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.List;

public abstract class o<T extends o> {
    protected final l a;
    private final p b;
    private final List<m> c = new ArrayList();

    protected o(p pVar, e eVar) {
        d.a((Object) pVar);
        this.b = pVar;
        l lVar = new l(this, eVar);
        lVar.k();
        this.a = lVar;
    }

    protected void a(l lVar) {
    }

    protected void b(l lVar) {
        for (m a : this.c) {
            a.a(this, lVar);
        }
    }

    public l l() {
        l a = this.a.a();
        b(a);
        return a;
    }

    public l m() {
        return this.a;
    }

    public List<r> n() {
        return this.a.c();
    }

    protected p o() {
        return this.b;
    }
}
