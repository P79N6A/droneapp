package com.google.android.gms.internal;

import com.google.android.gms.internal.ko.a;

public class kl implements ko {
    static final /* synthetic */ boolean a = (!kl.class.desiredAssertionStatus());
    private final lb b;

    public kl(lb lbVar) {
        this.b = lbVar;
    }

    public ko a() {
        return this;
    }

    public lc a(lc lcVar, kv kvVar, lh lhVar, ij ijVar, a aVar, kk kkVar) {
        if (a || lcVar.a(this.b)) {
            lh a = lcVar.a();
            lh c = a.c(kvVar);
            if (c.a(ijVar).equals(lhVar.a(ijVar)) && c.b() == lhVar.b()) {
                return lcVar;
            }
            if (kkVar != null) {
                if (lhVar.b()) {
                    if (a.a(kvVar)) {
                        kkVar.a(ka.b(kvVar, c));
                    } else if (!(a || a.e())) {
                        throw new AssertionError("A child remove without an old child only makes sense on a leaf node");
                    }
                } else if (c.b()) {
                    kkVar.a(ka.a(kvVar, lhVar));
                } else {
                    kkVar.a(ka.a(kvVar, lhVar, c));
                }
            }
            return (a.e() && lhVar.b()) ? lcVar : lcVar.a(kvVar, lhVar);
        } else {
            throw new AssertionError("The index must match the filter");
        }
    }

    public lc a(lc lcVar, lc lcVar2, kk kkVar) {
        if (a || lcVar2.a(this.b)) {
            if (kkVar != null) {
                for (lg lgVar : lcVar.a()) {
                    if (!lcVar2.a().a(lgVar.c())) {
                        kkVar.a(ka.b(lgVar.c(), lgVar.d()));
                    }
                }
                if (!lcVar2.a().e()) {
                    for (lg lgVar2 : lcVar2.a()) {
                        if (lcVar.a().a(lgVar2.c())) {
                            lh c = lcVar.a().c(lgVar2.c());
                            if (!c.equals(lgVar2.d())) {
                                kkVar.a(ka.a(lgVar2.c(), lgVar2.d(), c));
                            }
                        } else {
                            kkVar.a(ka.a(lgVar2.c(), lgVar2.d()));
                        }
                    }
                }
            }
            return lcVar2;
        }
        throw new AssertionError("Can't use IndexedNode that doesn't have filter's index");
    }

    public lc a(lc lcVar, lh lhVar) {
        return lcVar.a().b() ? lcVar : lcVar.b(lhVar);
    }

    public lb b() {
        return this.b;
    }

    public boolean c() {
        return false;
    }
}
