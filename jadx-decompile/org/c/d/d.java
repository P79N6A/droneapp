package org.c.d;

import java.util.ArrayList;
import java.util.List;
import org.b.k;
import org.c.c.a;

class d {
    private final List<k<?>> a = new ArrayList();

    d() {
    }

    private k<Throwable> b(k<?> kVar) {
        return kVar;
    }

    private k<Throwable> c() {
        return this.a.size() == 1 ? b((k) this.a.get(0)) : org.b.d.a(d());
    }

    private List<k<? super Throwable>> d() {
        return new ArrayList(this.a);
    }

    void a(k<?> kVar) {
        this.a.add(kVar);
    }

    boolean a() {
        return !this.a.isEmpty();
    }

    k<Throwable> b() {
        return a.e(c());
    }
}
