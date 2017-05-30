package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class jb {
    static final /* synthetic */ boolean a = (!jb.class.desiredAssertionStatus());
    private static final jv<iy> e = new jv<iy>() {
        public boolean a(iy iyVar) {
            return iyVar.f();
        }

        public /* synthetic */ boolean a(Object obj) {
            return a((iy) obj);
        }
    };
    private ia b = ia.a();
    private List<iy> c = new ArrayList();
    private Long d = Long.valueOf(-1);

    private static ia a(List<iy> list, jv<iy> jvVar, ij ijVar) {
        ia a = ia.a();
        ia iaVar = a;
        for (iy iyVar : list) {
            if (jvVar.a(iyVar)) {
                ij b = iyVar.b();
                if (iyVar.e()) {
                    if (ijVar.b(b)) {
                        a = iaVar.a(ij.a(ijVar, b), iyVar.c());
                    } else if (b.b(ijVar)) {
                        a = iaVar.a(ij.a(), iyVar.c().a(ij.a(b, ijVar)));
                    }
                    iaVar = a;
                } else {
                    if (ijVar.b(b)) {
                        a = iaVar.a(ij.a(ijVar, b), iyVar.d());
                    } else if (b.b(ijVar)) {
                        b = ij.a(b, ijVar);
                        if (b.h()) {
                            a = iaVar.a(ij.a(), iyVar.d());
                        } else {
                            lh c = iyVar.d().c(b);
                            if (c != null) {
                                a = iaVar.a(ij.a(), c);
                            }
                        }
                    }
                    iaVar = a;
                }
            }
            a = iaVar;
            iaVar = a;
        }
        return iaVar;
    }

    private boolean a(iy iyVar, ij ijVar) {
        if (iyVar.e()) {
            return iyVar.b().b(ijVar);
        }
        Iterator it = iyVar.d().iterator();
        while (it.hasNext()) {
            if (iyVar.b().a((ij) ((Entry) it.next()).getKey()).b(ijVar)) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        this.b = a(this.c, e, ij.a());
        if (this.c.size() > 0) {
            this.d = Long.valueOf(((iy) this.c.get(this.c.size() - 1)).a());
        } else {
            this.d = Long.valueOf(-1);
        }
    }

    public iy a(long j) {
        for (iy iyVar : this.c) {
            if (iyVar.a() == j) {
                return iyVar;
            }
        }
        return null;
    }

    public jc a(ij ijVar) {
        return new jc(ijVar, this);
    }

    public lg a(ij ijVar, lh lhVar, lg lgVar, boolean z, lb lbVar) {
        lg lgVar2 = null;
        ia d = this.b.d(ijVar);
        lh c = d.c(ij.a());
        if (c == null) {
            if (lhVar != null) {
                c = d.a(lhVar);
            }
            return lgVar2;
        }
        for (lg lgVar3 : r0) {
            lg lgVar32;
            if (lbVar.a(lgVar32, lgVar, z) <= 0 || (lgVar2 != null && lbVar.a(lgVar32, lgVar2, z) >= 0)) {
                lgVar32 = lgVar2;
            }
            lgVar2 = lgVar32;
        }
        return lgVar2;
    }

    public lh a(ij ijVar, ij ijVar2, lh lhVar, lh lhVar2) {
        if (!a && lhVar == null && lhVar2 == null) {
            throw new AssertionError("Either existingEventSnap or existingServerSnap must exist");
        }
        ij a = ijVar.a(ijVar2);
        if (this.b.b(a)) {
            return null;
        }
        ia d = this.b.d(a);
        return d.e() ? lhVar2.a(ijVar2) : d.a(lhVar2.a(ijVar2));
    }

    public lh a(ij ijVar, kv kvVar, jy jyVar) {
        ij a = ijVar.a(kvVar);
        lh c = this.b.c(a);
        return c != null ? c : jyVar.a(kvVar) ? this.b.d(a).a(jyVar.c().c(kvVar)) : null;
    }

    public lh a(ij ijVar, lh lhVar) {
        la j = la.j();
        lh<lg> c = this.b.c(ijVar);
        lh lhVar2;
        if (c == null) {
            ia d = this.b.d(ijVar);
            lhVar2 = j;
            for (lg lgVar : lhVar) {
                lhVar2 = lhVar2.a(lgVar.c(), d.d(new ij(lgVar.c())).a(lgVar.d()));
            }
            for (lg lgVar2 : d.c()) {
                lhVar2 = lhVar2.a(lgVar2.c(), lgVar2.d());
            }
            return lhVar2;
        } else if (c.e()) {
            return j;
        } else {
            lhVar2 = j;
            for (lg lgVar22 : c) {
                lhVar2 = lhVar2.a(lgVar22.c(), lgVar22.d());
            }
            return lhVar2;
        }
    }

    public lh a(final ij ijVar, lh lhVar, final List<Long> list, final boolean z) {
        ia d;
        if (!list.isEmpty() || z) {
            d = this.b.d(ijVar);
            if (!z && d.e()) {
                return lhVar;
            }
            if (!z && lhVar == null && !d.b(ij.a())) {
                return null;
            }
            d = a(this.c, new jv<iy>(this) {
                final /* synthetic */ jb d;

                public boolean a(iy iyVar) {
                    return (iyVar.f() || z) && !list.contains(Long.valueOf(iyVar.a())) && (iyVar.b().b(ijVar) || ijVar.b(iyVar.b()));
                }

                public /* synthetic */ boolean a(Object obj) {
                    return a((iy) obj);
                }
            }, ijVar);
            if (lhVar == null) {
                lhVar = la.j();
            }
            return d.a(lhVar);
        }
        lh c = this.b.c(ijVar);
        if (c != null) {
            return c;
        }
        d = this.b.d(ijVar);
        if (d.e()) {
            return lhVar;
        }
        if (lhVar == null && !d.b(ij.a())) {
            return null;
        }
        if (lhVar == null) {
            lhVar = la.j();
        }
        return d.a(lhVar);
    }

    public List<iy> a() {
        List arrayList = new ArrayList(this.c);
        this.b = ia.a();
        this.c = new ArrayList();
        return arrayList;
    }

    public void a(ij ijVar, ia iaVar, Long l) {
        if (a || l.longValue() > this.d.longValue()) {
            this.c.add(new iy(l.longValue(), ijVar, iaVar));
            this.b = this.b.a(ijVar, iaVar);
            this.d = l;
            return;
        }
        throw new AssertionError();
    }

    public void a(ij ijVar, lh lhVar, Long l, boolean z) {
        if (a || l.longValue() > this.d.longValue()) {
            this.c.add(new iy(l.longValue(), ijVar, lhVar, z));
            if (z) {
                this.b = this.b.a(ijVar, lhVar);
            }
            this.d = l;
            return;
        }
        throw new AssertionError();
    }

    public lh b(ij ijVar) {
        return this.b.c(ijVar);
    }

    public boolean b(long j) {
        iy iyVar = null;
        int i = 0;
        for (iy iyVar2 : this.c) {
            iy iyVar22;
            if (iyVar22.a() == j) {
                iyVar = iyVar22;
                break;
            }
            i++;
        }
        if (a || iyVar != null) {
            this.c.remove(iyVar);
            boolean f = iyVar.f();
            int size = this.c.size() - 1;
            boolean z = false;
            while (f && size >= 0) {
                boolean z2;
                iyVar22 = (iy) this.c.get(size);
                if (iyVar22.f()) {
                    if (size >= i && a(iyVar22, iyVar.b())) {
                        z2 = z;
                        z = false;
                        size--;
                        f = z;
                        z = z2;
                    } else if (iyVar.b().b(iyVar22.b())) {
                        z2 = true;
                        z = f;
                        size--;
                        f = z;
                        z = z2;
                    }
                }
                z2 = z;
                z = f;
                size--;
                f = z;
                z = z2;
            }
            if (!f) {
                return false;
            }
            if (z) {
                b();
                return true;
            } else if (iyVar.e()) {
                this.b = this.b.a(iyVar.b());
                return true;
            } else {
                Iterator it = iyVar.d().iterator();
                while (it.hasNext()) {
                    this.b = this.b.a(iyVar.b().a((ij) ((Entry) it.next()).getKey()));
                }
                return true;
            }
        }
        throw new AssertionError("removeWrite called with nonexistent writeId");
    }
}
