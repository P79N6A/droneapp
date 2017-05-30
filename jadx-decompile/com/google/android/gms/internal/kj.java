package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class kj {
    static final /* synthetic */ boolean a = (!kj.class.desiredAssertionStatus());
    private static com.google.android.gms.internal.ko.a c = new com.google.android.gms.internal.ko.a() {
        public lg a(lb lbVar, lg lgVar, boolean z) {
            return null;
        }

        public lh a(kv kvVar) {
            return null;
        }
    };
    private final ko b;

    public static class a {
        public final ki a;
        public final List<ka> b;

        public a(ki kiVar, List<ka> list) {
            this.a = kiVar;
            this.b = list;
        }
    }

    private static class b implements com.google.android.gms.internal.ko.a {
        private final jc a;
        private final ki b;
        private final lh c;

        public b(jc jcVar, ki kiVar, lh lhVar) {
            this.a = jcVar;
            this.b = kiVar;
            this.c = lhVar;
        }

        public lg a(lb lbVar, lg lgVar, boolean z) {
            return this.a.a(this.c != null ? this.c : this.b.d(), lgVar, z, lbVar);
        }

        public lh a(kv kvVar) {
            jy a = this.b.a();
            if (a.a(kvVar)) {
                return a.c().c(kvVar);
            }
            return this.a.a(kvVar, this.c != null ? new jy(lc.a(this.c, ld.d()), true, false) : this.b.c());
        }
    }

    public kj(ko koVar) {
        this.b = koVar;
    }

    private ki a(ki kiVar, ij ijVar, ia iaVar, jc jcVar, lh lhVar, kk kkVar) {
        if (a || iaVar.b() == null) {
            Entry entry;
            ij a;
            Iterator it = iaVar.iterator();
            ki kiVar2 = kiVar;
            while (it.hasNext()) {
                entry = (Entry) it.next();
                a = ijVar.a((ij) entry.getKey());
                if (a(kiVar, a.d())) {
                    kiVar2 = a(kiVar2, a, (lh) entry.getValue(), jcVar, lhVar, kkVar);
                }
            }
            it = iaVar.iterator();
            while (it.hasNext()) {
                entry = (Entry) it.next();
                a = ijVar.a((ij) entry.getKey());
                if (!a(kiVar, a.d())) {
                    kiVar2 = a(kiVar2, a, (lh) entry.getValue(), jcVar, lhVar, kkVar);
                }
            }
            return kiVar2;
        }
        throw new AssertionError("Can't have a merge that is an overwrite");
    }

    private ki a(ki kiVar, ij ijVar, ia iaVar, jc jcVar, lh lhVar, boolean z, kk kkVar) {
        if (kiVar.c().c().b() && !kiVar.c().a()) {
            return kiVar;
        }
        if (a || iaVar.b() == null) {
            kv kvVar;
            if (!ijVar.h()) {
                iaVar = ia.a().a(ijVar, iaVar);
            }
            lh c = kiVar.c().c();
            Map d = iaVar.d();
            ki kiVar2 = kiVar;
            for (Entry entry : d.entrySet()) {
                kvVar = (kv) entry.getKey();
                if (c.a(kvVar)) {
                    kiVar2 = a(kiVar2, new ij(kvVar), ((ia) entry.getValue()).a(c.c(kvVar)), jcVar, lhVar, z, kkVar);
                }
            }
            for (Entry entry2 : d.entrySet()) {
                kvVar = (kv) entry2.getKey();
                Object obj = (kiVar.c().a(kvVar) || ((ia) entry2.getValue()).b() != null) ? null : 1;
                if (!c.a(kvVar) && obj == null) {
                    kiVar2 = a(kiVar2, new ij(kvVar), ((ia) entry2.getValue()).a(c.c(kvVar)), jcVar, lhVar, z, kkVar);
                }
            }
            return kiVar2;
        }
        throw new AssertionError("Can't have a merge that is an overwrite");
    }

    private ki a(ki kiVar, ij ijVar, jc jcVar, com.google.android.gms.internal.ko.a aVar, kk kkVar) {
        jy a = kiVar.a();
        if (jcVar.a(ijVar) != null) {
            return kiVar;
        }
        lc a2;
        lh a3;
        if (!ijVar.h()) {
            kv d = ijVar.d();
            if (!d.f()) {
                lh a4;
                ij e = ijVar.e();
                if (a.a(d)) {
                    a3 = jcVar.a(ijVar, a.c(), kiVar.c().c());
                    a4 = a3 != null ? a.c().c(d).a(e, a3) : a.c().c(d);
                } else {
                    a4 = jcVar.a(d, kiVar.c());
                }
                a2 = a4 != null ? this.b.a(a.d(), d, a4, e, aVar, kkVar) : a.d();
            } else if (a || ijVar.i() == 1) {
                a3 = jcVar.a(ijVar, a.c(), kiVar.c().c());
                a2 = a3 != null ? this.b.a(a.d(), a3) : a.d();
            } else {
                throw new AssertionError("Can't have a priority with additional path components");
            }
        } else if (a || kiVar.c().a()) {
            if (kiVar.c().b()) {
                a3 = kiVar.d();
                if (!(a3 instanceof kw)) {
                    a3 = la.j();
                }
                a3 = jcVar.b(a3);
            } else {
                a3 = jcVar.a(kiVar.d());
            }
            a2 = this.b.a(kiVar.a().d(), lc.a(a3, this.b.b()), kkVar);
        } else {
            throw new AssertionError("If change path is empty, we must have complete server data");
        }
        boolean z = a.a() || ijVar.h();
        return kiVar.a(a2, z, this.b.c());
    }

    private ki a(ki kiVar, ij ijVar, ju<Boolean> juVar, jc jcVar, lh lhVar, kk kkVar) {
        if (jcVar.a(ijVar) != null) {
            return kiVar;
        }
        boolean b = kiVar.c().b();
        jy c = kiVar.c();
        ia a;
        if (juVar.b() == null) {
            a = ia.a();
            Iterator it = juVar.iterator();
            while (it.hasNext()) {
                ij ijVar2 = (ij) ((Entry) it.next()).getKey();
                ij a2 = ijVar.a(ijVar2);
                if (c.a(a2)) {
                    a = a.a(ijVar2, c.c().a(a2));
                }
            }
            return a(kiVar, ijVar, a, jcVar, lhVar, b, kkVar);
        } else if ((ijVar.h() && c.a()) || c.a(ijVar)) {
            return a(kiVar, ijVar, c.c().a(ijVar), jcVar, lhVar, b, kkVar);
        } else if (!ijVar.h()) {
            return kiVar;
        } else {
            a = ia.a();
            for (lg lgVar : c.c()) {
                a = a.a(lgVar.c(), lgVar.d());
            }
            return a(kiVar, ijVar, a, jcVar, lhVar, b, kkVar);
        }
    }

    private ki a(ki kiVar, ij ijVar, lh lhVar, jc jcVar, lh lhVar2, kk kkVar) {
        jy a = kiVar.a();
        com.google.android.gms.internal.ko.a bVar = new b(jcVar, kiVar, lhVar2);
        if (ijVar.h()) {
            return kiVar.a(this.b.a(kiVar.a().d(), lc.a(lhVar, this.b.b()), kkVar), true, this.b.c());
        }
        kv d = ijVar.d();
        if (d.f()) {
            return kiVar.a(this.b.a(kiVar.a().d(), lhVar), a.a(), a.b());
        }
        lh lhVar3;
        ij e = ijVar.e();
        lh c = a.c().c(d);
        if (e.h()) {
            lhVar3 = lhVar;
        } else {
            lhVar3 = bVar.a(d);
            if (lhVar3 == null) {
                lhVar3 = la.j();
            } else if (!(e.g().f() && lhVar3.a(e.f()).b())) {
                lhVar3 = lhVar3.a(e, lhVar);
            }
        }
        return !c.equals(lhVar3) ? kiVar.a(this.b.a(a.d(), d, lhVar3, e, bVar, kkVar), a.a(), this.b.c()) : kiVar;
    }

    private ki a(ki kiVar, ij ijVar, lh lhVar, jc jcVar, lh lhVar2, boolean z, kk kkVar) {
        lc a;
        jy c = kiVar.c();
        ko a2 = z ? this.b : this.b.a();
        if (ijVar.h()) {
            a = a2.a(c.d(), lc.a(lhVar, a2.b()), null);
        } else if (!a2.c() || c.b()) {
            kv d = ijVar.d();
            if (!c.a(ijVar) && ijVar.i() > 1) {
                return kiVar;
            }
            ij e = ijVar.e();
            lh a3 = c.c().c(d).a(e, lhVar);
            a = d.f() ? a2.a(c.d(), a3) : a2.a(c.d(), d, a3, e, c, null);
        } else if (a || !ijVar.h()) {
            kv d2 = ijVar.d();
            a = a2.a(c.d(), c.d().a(d2, c.c().c(d2).a(ijVar.e(), lhVar)), null);
        } else {
            throw new AssertionError("An empty path should have been caught in the other branch");
        }
        boolean z2 = c.a() || ijVar.h();
        ki b = kiVar.b(a, z2, a2.c());
        return a(b, ijVar, jcVar, new b(jcVar, b, lhVar2), kkVar);
    }

    private void a(ki kiVar, ki kiVar2, List<ka> list) {
        jy a = kiVar2.a();
        if (a.a()) {
            Object obj = (a.c().e() || a.c().b()) ? 1 : null;
            if (!list.isEmpty() || !kiVar.a().a() || ((obj != null && !a.c().equals(kiVar.b())) || !a.c().f().equals(kiVar.b().f()))) {
                list.add(ka.a(a.d()));
            }
        }
    }

    private static boolean a(ki kiVar, kv kvVar) {
        return kiVar.a().a(kvVar);
    }

    private ki b(ki kiVar, ij ijVar, jc jcVar, lh lhVar, kk kkVar) {
        jy c = kiVar.c();
        lc d = c.d();
        boolean z = c.a() || ijVar.h();
        return a(kiVar.b(d, z, c.b()), ijVar, jcVar, c, kkVar);
    }

    public ki a(ki kiVar, ij ijVar, jc jcVar, lh lhVar, kk kkVar) {
        if (jcVar.a(ijVar) != null) {
            return kiVar;
        }
        com.google.android.gms.internal.ko.a bVar = new b(jcVar, kiVar, lhVar);
        lc d = kiVar.a().d();
        if (ijVar.h() || ijVar.d().f()) {
            d = this.b.a(d, lc.a(kiVar.c().a() ? jcVar.a(kiVar.d()) : jcVar.b(kiVar.c().c()), this.b.b()), kkVar);
        } else {
            kv d2 = ijVar.d();
            lh a = jcVar.a(d2, kiVar.c());
            if (a == null && kiVar.c().a(d2)) {
                a = d.a().c(d2);
            }
            if (a != null) {
                d = this.b.a(d, d2, a, ijVar.e(), bVar, kkVar);
            } else if (a == null && kiVar.a().c().a(d2)) {
                d = this.b.a(d, d2, la.j(), ijVar.e(), bVar, kkVar);
            }
            if (d.a().b() && kiVar.c().a()) {
                lh a2 = jcVar.a(kiVar.d());
                if (a2.e()) {
                    d = this.b.a(d, lc.a(a2, this.b.b()), kkVar);
                }
            }
        }
        boolean z = kiVar.c().a() || jcVar.a(ij.a()) != null;
        return kiVar.a(d, z, this.b.c());
    }

    public a a(ki kiVar, jh jhVar, jc jcVar, lh lhVar) {
        ki a;
        kk kkVar = new kk();
        boolean z;
        switch (jhVar.e()) {
            case Overwrite:
                jj jjVar = (jj) jhVar;
                if (jjVar.d().a()) {
                    a = a(kiVar, jjVar.c(), jjVar.a(), jcVar, lhVar, kkVar);
                    break;
                } else if (a || jjVar.d().b()) {
                    z = jjVar.d().c() || (kiVar.c().b() && !jjVar.c().h());
                    a = a(kiVar, jjVar.c(), jjVar.a(), jcVar, lhVar, z, kkVar);
                    break;
                } else {
                    throw new AssertionError();
                }
                break;
            case Merge:
                jg jgVar = (jg) jhVar;
                if (jgVar.d().a()) {
                    a = a(kiVar, jgVar.c(), jgVar.a(), jcVar, lhVar, kkVar);
                    break;
                } else if (a || jgVar.d().b()) {
                    z = jgVar.d().c() || kiVar.c().b();
                    a = a(kiVar, jgVar.c(), jgVar.a(), jcVar, lhVar, z, kkVar);
                    break;
                } else {
                    throw new AssertionError();
                }
                break;
            case AckUserWrite:
                je jeVar = (je) jhVar;
                if (!jeVar.b()) {
                    a = a(kiVar, jeVar.c(), jeVar.a(), jcVar, lhVar, kkVar);
                    break;
                }
                a = a(kiVar, jeVar.c(), jcVar, lhVar, kkVar);
                break;
            case ListenComplete:
                a = b(kiVar, jhVar.c(), jcVar, lhVar, kkVar);
                break;
            default:
                String valueOf = String.valueOf(jhVar.e());
                throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unknown operation: ").append(valueOf).toString());
        }
        List arrayList = new ArrayList(kkVar.a());
        a(kiVar, a, arrayList);
        return new a(a, arrayList);
    }
}
