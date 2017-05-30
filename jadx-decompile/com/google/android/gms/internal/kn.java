package com.google.android.gms.internal;

import com.google.android.gms.internal.ko.a;
import java.util.Iterator;

public class kn implements ko {
    static final /* synthetic */ boolean a = (!kn.class.desiredAssertionStatus());
    private final kp b;
    private final lb c;
    private final int d;
    private final boolean e;

    public kn(kf kfVar) {
        this.b = new kp(kfVar);
        this.c = kfVar.j();
        this.d = kfVar.i();
        this.e = !kfVar.k();
    }

    private lc a(lc lcVar, kv kvVar, lh lhVar, a aVar, kk kkVar) {
        if (a || lcVar.a().c() == this.d) {
            lg lgVar = new lg(kvVar, lhVar);
            lg c = this.e ? lcVar.c() : lcVar.d();
            boolean a = this.b.a(lgVar);
            if (lcVar.a().a(kvVar)) {
                lh c2 = lcVar.a().c(kvVar);
                lg a2 = aVar.a(this.c, c, this.e);
                while (a2 != null && (a2.c().equals(kvVar) || lcVar.a().a(a2.c()))) {
                    a2 = aVar.a(this.c, a2, this.e);
                }
                Object obj = (!a || lhVar.b() || (a2 == null ? 1 : this.c.a(a2, lgVar, this.e)) < 0) ? null : 1;
                if (obj != null) {
                    if (kkVar != null) {
                        kkVar.a(ka.a(kvVar, lhVar, c2));
                    }
                    return lcVar.a(kvVar, lhVar);
                }
                if (kkVar != null) {
                    kkVar.a(ka.b(kvVar, c2));
                }
                lcVar = lcVar.a(kvVar, la.j());
                obj = (a2 == null || !this.b.a(a2)) ? null : 1;
                if (obj == null) {
                    return lcVar;
                }
                if (kkVar != null) {
                    kkVar.a(ka.a(a2.c(), a2.d()));
                }
                return lcVar.a(a2.c(), a2.d());
            } else if (lhVar.b() || !a || this.c.a(c, lgVar, this.e) < 0) {
                return lcVar;
            } else {
                if (kkVar != null) {
                    kkVar.a(ka.b(c.c(), c.d()));
                    kkVar.a(ka.a(kvVar, lhVar));
                }
                return lcVar.a(kvVar, lhVar).a(c.c(), la.j());
            }
        }
        throw new AssertionError();
    }

    public ko a() {
        return this.b.a();
    }

    public lc a(lc lcVar, kv kvVar, lh lhVar, ij ijVar, a aVar, kk kkVar) {
        lh j = !this.b.a(new lg(kvVar, lhVar)) ? la.j() : lhVar;
        return lcVar.a().c(kvVar).equals(j) ? lcVar : lcVar.a().c() < this.d ? this.b.a().a(lcVar, kvVar, j, ijVar, aVar, kkVar) : a(lcVar, kvVar, j, aVar, kkVar);
    }

    public lc a(lc lcVar, lc lcVar2, kk kkVar) {
        lc a;
        if (lcVar2.a().e() || lcVar2.a().b()) {
            a = lc.a(la.j(), this.c);
        } else {
            Object d;
            Iterator it;
            int i;
            lc b = lcVar2.b(ll.a());
            if (this.e) {
                Iterator b2 = lcVar2.b();
                Object e = this.b.e();
                d = this.b.d();
                it = b2;
                i = -1;
            } else {
                Iterator it2 = lcVar2.iterator();
                lg d2 = this.b.d();
                lg e2 = this.b.e();
                lg lgVar = d2;
                i = 1;
                it = it2;
            }
            int i2 = 0;
            a = b;
            Object obj = null;
            while (it.hasNext()) {
                int i3;
                lc lcVar3;
                lg lgVar2 = (lg) it.next();
                if (obj == null && this.c.compare(r5, lgVar2) * i <= 0) {
                    obj = 1;
                }
                Object obj2 = (obj == null || i2 >= this.d || this.c.compare(lgVar2, d) * i > 0) ? null : 1;
                if (obj2 != null) {
                    i3 = i2 + 1;
                    lcVar3 = a;
                } else {
                    a = a.a(lgVar2.c(), la.j());
                    i3 = i2;
                    lcVar3 = a;
                }
                a = lcVar3;
                i2 = i3;
            }
        }
        return this.b.a().a(lcVar, a, kkVar);
    }

    public lc a(lc lcVar, lh lhVar) {
        return lcVar;
    }

    public lb b() {
        return this.c;
    }

    public boolean c() {
        return true;
    }
}
