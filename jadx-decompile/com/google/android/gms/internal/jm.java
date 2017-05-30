package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class jm implements jp {
    static final /* synthetic */ boolean a = (!jm.class.desiredAssertionStatus());
    private final jq b;
    private final jt c;
    private final ks d;
    private final jk e;
    private long f;

    public jm(ic icVar, jq jqVar, jk jkVar) {
        this(icVar, jqVar, jkVar, new md());
    }

    public jm(ic icVar, jq jqVar, jk jkVar, mc mcVar) {
        this.f = 0;
        this.b = jqVar;
        this.d = icVar.a("Persistence");
        this.c = new jt(this.b, this.d, mcVar);
        this.e = jkVar;
    }

    private void c() {
        this.f++;
        if (this.e.a(this.f)) {
            if (this.d.a()) {
                this.d.a("Reached prune check threshold.", new Object[0]);
            }
            this.f = 0;
            int i = 1;
            long b = this.b.b();
            if (this.d.a()) {
                this.d.a("Cache size: " + b, new Object[0]);
            }
            while (i != 0 && this.e.a(r2, this.c.a())) {
                jr a = this.c.a(this.e);
                if (a.a()) {
                    this.b.a(ij.a(), a);
                } else {
                    i = 0;
                }
                b = this.b.b();
                if (this.d.a()) {
                    this.d.a("Cache size after prune: " + b, new Object[0]);
                }
            }
        }
    }

    public jy a(kg kgVar) {
        boolean z;
        Set d;
        if (this.c.f(kgVar)) {
            js a = this.c.a(kgVar);
            d = (kgVar.e() || a == null || !a.d) ? null : this.b.d(a.a);
            z = true;
        } else {
            d = this.c.b(kgVar.a());
            z = false;
        }
        lh a2 = this.b.a(kgVar.a());
        if (r0 == null) {
            return new jy(lc.a(a2, kgVar.c()), z, false);
        }
        lh j = la.j();
        for (kv kvVar : r0) {
            j = j.a(kvVar, a2.c(kvVar));
        }
        return new jy(lc.a(j, kgVar.c()), z, true);
    }

    public <T> T a(Callable<T> callable) {
        this.b.e();
        try {
            T call = callable.call();
            this.b.g();
            this.b.f();
            return call;
        } catch (Throwable th) {
            this.b.f();
        }
    }

    public void a() {
        this.b.d();
    }

    public void a(long j) {
        this.b.a(j);
    }

    public void a(ij ijVar, ia iaVar) {
        Iterator it = iaVar.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            a(ijVar.a((ij) entry.getKey()), (lh) entry.getValue());
        }
    }

    public void a(ij ijVar, ia iaVar, long j) {
        this.b.a(ijVar, iaVar, j);
    }

    public void a(ij ijVar, lh lhVar) {
        if (!this.c.d(ijVar)) {
            this.b.a(ijVar, lhVar);
            this.c.c(ijVar);
        }
    }

    public void a(ij ijVar, lh lhVar, long j) {
        this.b.a(ijVar, lhVar, j);
    }

    public void a(kg kgVar, lh lhVar) {
        if (kgVar.e()) {
            this.b.a(kgVar.a(), lhVar);
        } else {
            this.b.b(kgVar.a(), lhVar);
        }
        d(kgVar);
        c();
    }

    public void a(kg kgVar, Set<kv> set) {
        if (a || !kgVar.e()) {
            js a = this.c.a(kgVar);
            if (a || (a != null && a.e)) {
                this.b.a(a.a, (Set) set);
                return;
            }
            throw new AssertionError("We only expect tracked keys for currently-active queries.");
        }
        throw new AssertionError("We should only track keys for filtered queries.");
    }

    public void a(kg kgVar, Set<kv> set, Set<kv> set2) {
        if (a || !kgVar.e()) {
            js a = this.c.a(kgVar);
            if (a || (a != null && a.e)) {
                this.b.a(a.a, (Set) set, (Set) set2);
                return;
            }
            throw new AssertionError("We only expect tracked keys for currently-active queries.");
        }
        throw new AssertionError("We should only track keys for filtered queries.");
    }

    public List<iy> b() {
        return this.b.a();
    }

    public void b(ij ijVar, ia iaVar) {
        this.b.a(ijVar, iaVar);
        c();
    }

    public void b(kg kgVar) {
        this.c.c(kgVar);
    }

    public void c(kg kgVar) {
        this.c.d(kgVar);
    }

    public void d(kg kgVar) {
        if (kgVar.e()) {
            this.c.a(kgVar.a());
        } else {
            this.c.e(kgVar);
        }
    }
}
