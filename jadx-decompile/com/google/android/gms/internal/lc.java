package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class lc implements Iterable<lg> {
    private static final hb<lg> a = new hb(Collections.emptyList(), null);
    private final lh b;
    private hb<lg> c;
    private final lb d;

    private lc(lh lhVar, lb lbVar) {
        this.d = lbVar;
        this.b = lhVar;
        this.c = null;
    }

    private lc(lh lhVar, lb lbVar, hb<lg> hbVar) {
        this.d = lbVar;
        this.b = lhVar;
        this.c = hbVar;
    }

    public static lc a(lh lhVar) {
        return new lc(lhVar, lk.d());
    }

    public static lc a(lh lhVar, lb lbVar) {
        return new lc(lhVar, lbVar);
    }

    private void e() {
        if (this.c != null) {
            return;
        }
        if (this.d.equals(ld.d())) {
            this.c = a;
            return;
        }
        List arrayList = new ArrayList();
        Object obj = null;
        for (lg lgVar : this.b) {
            obj = (obj != null || this.d.a(lgVar.d())) ? 1 : null;
            arrayList.add(new lg(lgVar.c(), lgVar.d()));
        }
        if (obj != null) {
            this.c = new hb(arrayList, this.d);
        } else {
            this.c = a;
        }
    }

    public kv a(kv kvVar, lh lhVar, lb lbVar) {
        if (this.d.equals(ld.d()) || this.d.equals(lbVar)) {
            e();
            if (this.c == a) {
                return this.b.b(kvVar);
            }
            lg lgVar = (lg) this.c.c(new lg(kvVar, lhVar));
            return lgVar != null ? lgVar.c() : null;
        } else {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
    }

    public lc a(kv kvVar, lh lhVar) {
        lh a = this.b.a(kvVar, lhVar);
        if (this.c == a && !this.d.a(lhVar)) {
            return new lc(a, this.d, a);
        }
        if (this.c == null || this.c == a) {
            return new lc(a, this.d, null);
        }
        hb a2 = this.c.a(new lg(kvVar, this.b.c(kvVar)));
        if (!lhVar.b()) {
            a2 = a2.b(new lg(kvVar, lhVar));
        }
        return new lc(a, this.d, a2);
    }

    public lh a() {
        return this.b;
    }

    public boolean a(lb lbVar) {
        return this.d.equals(lbVar);
    }

    public lc b(lh lhVar) {
        return new lc(this.b.b(lhVar), this.d, this.c);
    }

    public Iterator<lg> b() {
        e();
        return this.c == a ? this.b.i() : this.c.c();
    }

    public lg c() {
        if (!(this.b instanceof kw)) {
            return null;
        }
        e();
        if (this.c != a) {
            return (lg) this.c.a();
        }
        kv g = ((kw) this.b).g();
        return new lg(g, this.b.c(g));
    }

    public lg d() {
        if (!(this.b instanceof kw)) {
            return null;
        }
        e();
        if (this.c != a) {
            return (lg) this.c.b();
        }
        kv h = ((kw) this.b).h();
        return new lg(h, this.b.c(h));
    }

    public Iterator<lg> iterator() {
        e();
        return this.c == a ? this.b.iterator() : this.c.iterator();
    }
}
