package com.google.android.gms.internal;

import com.fimi.soul.media.player.FimiMediaMeta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class iu {
    static final /* synthetic */ boolean a = (!iu.class.desiredAssertionStatus());
    private ju<it> b = ju.a();
    private final jb c = new jb();
    private final Map<iv, kg> d = new HashMap();
    private final Map<kg, iv> e = new HashMap();
    private final Set<kg> f = new HashSet();
    private final d g;
    private final jp h;
    private final ks i;
    private long j = 1;

    public interface d {
        void a(kg kgVar, iv ivVar);

        void a(kg kgVar, iv ivVar, hq hqVar, a aVar);
    }

    public interface a {
        List<? extends kc> a(com.google.firebase.database.c cVar);
    }

    private static class b extends ie {
        private kg b;

        public b(kg kgVar) {
            this.b = kgVar;
        }

        public ie a(kg kgVar) {
            return new b(kgVar);
        }

        public kb a(ka kaVar, kg kgVar) {
            return null;
        }

        public kg a() {
            return this.b;
        }

        public void a(kb kbVar) {
        }

        public void a(com.google.firebase.database.c cVar) {
        }

        public boolean a(ie ieVar) {
            return ieVar instanceof b;
        }

        public boolean a(com.google.android.gms.internal.kc.a aVar) {
            return false;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && ((b) obj).b.equals(this.b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }
    }

    private class c implements hq, a {
        final /* synthetic */ iu a;
        private final kh b;
        private final iv c;

        public c(iu iuVar, kh khVar) {
            this.a = iuVar;
            this.b = khVar;
            this.c = iuVar.b(khVar.a());
        }

        public String a() {
            return this.b.b().d();
        }

        public List<? extends kc> a(com.google.firebase.database.c cVar) {
            if (cVar == null) {
                return this.c != null ? this.a.a(this.c) : this.a.a(this.b.a().a());
            } else {
                ks a = this.a.i;
                String valueOf = String.valueOf(this.b.a().a());
                String valueOf2 = String.valueOf(cVar.toString());
                a.a(new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("Listen at ").append(valueOf).append(" failed: ").append(valueOf2).toString());
                return this.a.a(this.b.a(), cVar);
            }
        }

        public boolean b() {
            return mf.a(this.b.b()) > FimiMediaMeta.AV_CH_SIDE_RIGHT;
        }

        public hk c() {
            kx a = kx.a(this.b.b());
            List<ij> a2 = a.a();
            List arrayList = new ArrayList(a2.size());
            for (ij c : a2) {
                arrayList.add(c.c());
            }
            return new hk(arrayList, a.b());
        }
    }

    public iu(ic icVar, jp jpVar, d dVar) {
        this.g = dVar;
        this.h = jpVar;
        this.i = icVar.a("SyncTree");
    }

    private kg a(kg kgVar) {
        return (!kgVar.e() || kgVar.d()) ? kgVar : kg.a(kgVar.a());
    }

    private List<kc> a(jh jhVar) {
        return a(jhVar, this.b, null, this.c.a(ij.a()));
    }

    private List<kc> a(jh jhVar, ju<it> juVar, lh lhVar, jc jcVar) {
        if (jhVar.c().h()) {
            return b(jhVar, juVar, lhVar, jcVar);
        }
        it itVar = (it) juVar.b();
        if (lhVar == null && itVar != null) {
            lhVar = itVar.a(ij.a());
        }
        List<kc> arrayList = new ArrayList();
        kv d = jhVar.c().d();
        jh a = jhVar.a(d);
        ju juVar2 = (ju) juVar.c().b(d);
        if (!(juVar2 == null || a == null)) {
            arrayList.addAll(a(a, juVar2, lhVar != null ? lhVar.c(d) : null, jcVar.a(d)));
        }
        if (itVar != null) {
            arrayList.addAll(itVar.a(jhVar, jcVar, lhVar));
        }
        return arrayList;
    }

    private List<kh> a(ju<it> juVar) {
        List arrayList = new ArrayList();
        a((ju) juVar, arrayList);
        return arrayList;
    }

    private List<kc> a(final kg kgVar, final ie ieVar, final com.google.firebase.database.c cVar) {
        return (List) this.h.a(new Callable<List<kc>>(this) {
            static final /* synthetic */ boolean a = (!iu.class.desiredAssertionStatus());
            final /* synthetic */ iu e;

            public List<kc> a() {
                ij a = kgVar.a();
                it itVar = (it) this.e.b.e(a);
                List<kc> arrayList = new ArrayList();
                if (itVar != null && (kgVar.d() || itVar.b(kgVar))) {
                    Object obj;
                    mh a2 = itVar.a(kgVar, ieVar, cVar);
                    if (itVar.a()) {
                        this.e.b = this.e.b.d(a);
                    }
                    List<kg> list = (List) a2.a();
                    arrayList = (List) a2.b();
                    Object obj2 = null;
                    for (kg kgVar : list) {
                        this.e.h.c(kgVar);
                        obj = (obj2 != null || kgVar.e()) ? 1 : null;
                        obj2 = obj;
                    }
                    ju d = this.e.b;
                    obj = (d.b() == null || !((it) d.b()).c()) ? null : 1;
                    Iterator it = a.iterator();
                    ju juVar = d;
                    Object obj3 = obj;
                    while (it.hasNext()) {
                        juVar = juVar.a((kv) it.next());
                        obj = (obj3 != null || (juVar.b() != null && ((it) juVar.b()).c())) ? 1 : null;
                        if (obj != null) {
                            obj3 = obj;
                            break;
                        } else if (juVar.d()) {
                            obj3 = obj;
                            break;
                        } else {
                            obj3 = obj;
                        }
                    }
                    if (obj2 != null && obj3 == null) {
                        ju c = this.e.b.c(a);
                        if (!c.d()) {
                            for (kh khVar : this.e.a(c)) {
                                c cVar = new c(this.e, khVar);
                                this.e.g.a(this.e.a(khVar.a()), cVar.c, cVar, cVar);
                            }
                        }
                    }
                    if (obj3 == null && !list.isEmpty() && cVar == null) {
                        if (obj2 != null) {
                            this.e.g.a(this.e.a(kgVar), null);
                        } else {
                            for (kg kgVar2 : list) {
                                iv a3 = this.e.b(kgVar2);
                                if (a || a3 != null) {
                                    this.e.g.a(this.e.a(kgVar2), a3);
                                } else {
                                    throw new AssertionError();
                                }
                            }
                        }
                    }
                    this.e.a((List) list);
                }
                return arrayList;
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    private List<? extends kc> a(kg kgVar, jh jhVar) {
        ij a = kgVar.a();
        it itVar = (it) this.b.e(a);
        if (a || itVar != null) {
            return itVar.a(jhVar, this.c.a(a), null);
        }
        throw new AssertionError("Missing sync point for query tag that we're tracking");
    }

    private void a(ju<it> juVar, List<kh> list) {
        it itVar = (it) juVar.b();
        if (itVar == null || !itVar.c()) {
            if (itVar != null) {
                list.addAll(itVar.b());
            }
            Iterator it = juVar.c().iterator();
            while (it.hasNext()) {
                a((ju) ((Entry) it.next()).getValue(), (List) list);
            }
            return;
        }
        list.add(itVar.d());
    }

    private void a(kg kgVar, kh khVar) {
        ij a = kgVar.a();
        iv b = b(kgVar);
        Object cVar = new c(this, khVar);
        this.g.a(a(kgVar), b, cVar, cVar);
        ju c = this.b.c(a);
        if (b == null) {
            c.a(new com.google.android.gms.internal.ju.a<it, Void>(this) {
                final /* synthetic */ iu a;

                {
                    this.a = r1;
                }

                public Void a(ij ijVar, it itVar, Void voidR) {
                    kg a;
                    if (ijVar.h() || !itVar.c()) {
                        for (kh a2 : itVar.b()) {
                            a = a2.a();
                            this.a.g.a(this.a.a(a), this.a.b(a));
                        }
                    } else {
                        a = itVar.d().a();
                        this.a.g.a(this.a.a(a), this.a.b(a));
                    }
                    return null;
                }
            });
        } else if (!a && ((it) c.b()).c()) {
            throw new AssertionError("If we're adding a query, it shouldn't be shadowed");
        }
    }

    private void a(List<kg> list) {
        for (kg kgVar : list) {
            if (!kgVar.e()) {
                iv b = b(kgVar);
                if (a || b != null) {
                    this.e.remove(kgVar);
                    this.d.remove(b);
                } else {
                    throw new AssertionError();
                }
            }
        }
    }

    private iv b(kg kgVar) {
        return (iv) this.e.get(kgVar);
    }

    private kg b(iv ivVar) {
        return (kg) this.d.get(ivVar);
    }

    private List<kc> b(jh jhVar, ju<it> juVar, lh lhVar, jc jcVar) {
        it itVar = (it) juVar.b();
        final lh a = (lhVar != null || itVar == null) ? lhVar : itVar.a(ij.a());
        final List<kc> arrayList = new ArrayList();
        final jc jcVar2 = jcVar;
        final jh jhVar2 = jhVar;
        juVar.c().a(new com.google.android.gms.internal.he.b<kv, ju<it>>(this) {
            final /* synthetic */ iu e;

            public void a(kv kvVar, ju<it> juVar) {
                lh lhVar = null;
                if (a != null) {
                    lhVar = a.c(kvVar);
                }
                jc a = jcVar2.a(kvVar);
                jh a2 = jhVar2.a(kvVar);
                if (a2 != null) {
                    arrayList.addAll(this.e.b(a2, juVar, lhVar, a));
                }
            }

            public /* synthetic */ void a(Object obj, Object obj2) {
                a((kv) obj, (ju) obj2);
            }
        });
        if (itVar != null) {
            arrayList.addAll(itVar.a(jhVar, jcVar, a));
        }
        return arrayList;
    }

    private iv c() {
        long j = this.j;
        this.j = 1 + j;
        return new iv(j);
    }

    public List<? extends kc> a(long j, boolean z, boolean z2, mc mcVar) {
        final boolean z3 = z2;
        final long j2 = j;
        final boolean z4 = z;
        final mc mcVar2 = mcVar;
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            final /* synthetic */ iu e;

            public List<? extends kc> a() {
                if (z3) {
                    this.e.h.a(j2);
                }
                iy a = this.e.c.a(j2);
                boolean b = this.e.c.b(j2);
                if (a.f() && !z4) {
                    Map a2 = iq.a(mcVar2);
                    if (a.e()) {
                        this.e.h.a(a.b(), iq.a(a.c(), a2));
                    } else {
                        this.e.h.a(a.b(), iq.a(a.d(), a2));
                    }
                }
                if (!b) {
                    return Collections.emptyList();
                }
                ju a3;
                ju a4 = ju.a();
                if (a.e()) {
                    a3 = a4.a(ij.a(), Boolean.valueOf(true));
                } else {
                    Iterator it = a.d().iterator();
                    a3 = a4;
                    while (it.hasNext()) {
                        a3 = a3.a((ij) ((Entry) it.next()).getKey(), Boolean.valueOf(true));
                    }
                }
                return this.e.a(new je(a.b(), a3, z4));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends kc> a(final ie ieVar) {
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            static final /* synthetic */ boolean a = (!iu.class.desiredAssertionStatus());
            final /* synthetic */ iu c;

            public List<? extends kc> a() {
                it itVar;
                lh lhVar;
                it itVar2;
                jy jyVar;
                kg a = ieVar.a();
                ij a2 = a.a();
                lh lhVar2 = null;
                ij ijVar = a2;
                ju d = this.c.b;
                boolean z = false;
                while (!d.d()) {
                    boolean z2;
                    lh lhVar3;
                    itVar = (it) d.b();
                    if (itVar != null) {
                        if (lhVar2 == null) {
                            lhVar2 = itVar.a(ijVar);
                        }
                        z2 = z || itVar.c();
                        lhVar3 = lhVar2;
                    } else {
                        z2 = z;
                        lhVar3 = lhVar2;
                    }
                    d = d.a(ijVar.h() ? kv.a("") : ijVar.d());
                    ijVar = ijVar.e();
                    lhVar2 = lhVar3;
                    z = z2;
                }
                itVar = (it) this.c.b.e(a2);
                it itVar3;
                boolean z3;
                if (itVar == null) {
                    itVar = new it(this.c.h);
                    this.c.b = this.c.b.a(a2, (Object) itVar);
                    itVar3 = itVar;
                    lhVar = lhVar2;
                    z3 = z;
                    itVar2 = itVar3;
                } else {
                    z = z || itVar.c();
                    if (lhVar2 == null) {
                        lhVar2 = itVar.a(ij.a());
                    }
                    itVar3 = itVar;
                    lhVar = lhVar2;
                    z3 = z;
                    itVar2 = itVar3;
                }
                this.c.h.b(a);
                if (lhVar != null) {
                    jyVar = new jy(lc.a(lhVar, a.c()), true, false);
                } else {
                    jy a3 = this.c.h.a(a);
                    if (a3.a()) {
                        jyVar = a3;
                    } else {
                        lh j = la.j();
                        Iterator it = this.c.b.c(a2).c().iterator();
                        while (it.hasNext()) {
                            Entry entry = (Entry) it.next();
                            it itVar4 = (it) ((ju) entry.getValue()).b();
                            if (itVar4 != null) {
                                lh a4 = itVar4.a(ij.a());
                                if (a4 != null) {
                                    lhVar = j.a((kv) entry.getKey(), a4);
                                    j = lhVar;
                                }
                            }
                            lhVar = j;
                            j = lhVar;
                        }
                        for (lg lgVar : a3.c()) {
                            if (!j.a(lgVar.c())) {
                                j = j.a(lgVar.c(), lgVar.d());
                            }
                        }
                        jyVar = new jy(lc.a(j, a.c()), false, false);
                    }
                }
                boolean b = itVar2.b(a);
                if (!(b || a.e())) {
                    if (a || !this.c.e.containsKey(a)) {
                        iv f = this.c.c();
                        this.c.e.put(a, f);
                        this.c.d.put(f, a);
                    } else {
                        throw new AssertionError("View does not exist but we have a tag");
                    }
                }
                List<? extends kc> a5 = itVar2.a(ieVar, this.c.c.a(a2), jyVar);
                if (!(b || r4)) {
                    this.c.a(a, itVar2.a(a));
                }
                return a5;
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends kc> a(final ij ijVar) {
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            final /* synthetic */ iu b;

            public List<? extends kc> a() {
                this.b.h.d(kg.a(ijVar));
                return this.b.a(new jf(ji.b, ijVar));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends kc> a(ij ijVar, ia iaVar, ia iaVar2, long j, boolean z) {
        final boolean z2 = z;
        final ij ijVar2 = ijVar;
        final ia iaVar3 = iaVar;
        final long j2 = j;
        final ia iaVar4 = iaVar2;
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            final /* synthetic */ iu f;

            public List<? extends kc> a() {
                if (z2) {
                    this.f.h.a(ijVar2, iaVar3, j2);
                }
                this.f.c.a(ijVar2, iaVar4, Long.valueOf(j2));
                return this.f.a(new jg(ji.a, ijVar2, iaVar4));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends kc> a(final ij ijVar, final lh lhVar) {
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            final /* synthetic */ iu c;

            public List<? extends kc> a() {
                this.c.h.a(kg.a(ijVar), lhVar);
                return this.c.a(new jj(ji.b, ijVar, lhVar));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends kc> a(final ij ijVar, final lh lhVar, final iv ivVar) {
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            final /* synthetic */ iu d;

            public List<? extends kc> a() {
                kg a = this.d.b(ivVar);
                if (a == null) {
                    return Collections.emptyList();
                }
                ij a2 = ij.a(a.a(), ijVar);
                this.d.h.a(a2.h() ? a : kg.a(ijVar), lhVar);
                return this.d.a(a, new jj(ji.a(a.b()), a2, lhVar));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends kc> a(ij ijVar, lh lhVar, lh lhVar2, long j, boolean z, boolean z2) {
        boolean z3 = z || !z2;
        mk.a(z3, "We shouldn't be persisting non-visible writes.");
        final boolean z4 = z2;
        final ij ijVar2 = ijVar;
        final lh lhVar3 = lhVar;
        final long j2 = j;
        final lh lhVar4 = lhVar2;
        final boolean z5 = z;
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            final /* synthetic */ iu g;

            public List<? extends kc> a() {
                if (z4) {
                    this.g.h.a(ijVar2, lhVar3, j2);
                }
                this.g.c.a(ijVar2, lhVar4, Long.valueOf(j2), z5);
                return !z5 ? Collections.emptyList() : this.g.a(new jj(ji.a, ijVar2, lhVar4));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends kc> a(ij ijVar, List<lm> list) {
        it itVar = (it) this.b.e(ijVar);
        if (itVar == null) {
            return Collections.emptyList();
        }
        kh d = itVar.d();
        if (d == null) {
            return Collections.emptyList();
        }
        lh b = d.b();
        lh lhVar = b;
        for (lm a : list) {
            lhVar = a.a(lhVar);
        }
        return a(ijVar, lhVar);
    }

    public List<? extends kc> a(ij ijVar, List<lm> list, iv ivVar) {
        kg b = b(ivVar);
        if (b == null) {
            return Collections.emptyList();
        }
        if (a || ijVar.equals(b.a())) {
            it itVar = (it) this.b.e(b.a());
            if (a || itVar != null) {
                kh a = itVar.a(b);
                if (a || a != null) {
                    lh b2 = a.b();
                    lh lhVar = b2;
                    for (lm a2 : list) {
                        lhVar = a2.a(lhVar);
                    }
                    return a(ijVar, lhVar, ivVar);
                }
                throw new AssertionError("Missing view for query tag that we're tracking");
            }
            throw new AssertionError("Missing sync point for query tag that we're tracking");
        }
        throw new AssertionError();
    }

    public List<? extends kc> a(final ij ijVar, final Map<ij, lh> map) {
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            final /* synthetic */ iu c;

            public List<? extends kc> a() {
                ia b = ia.b(map);
                this.c.h.b(ijVar, b);
                return this.c.a(new jg(ji.b, ijVar, b));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends kc> a(final ij ijVar, final Map<ij, lh> map, final iv ivVar) {
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            final /* synthetic */ iu d;

            public List<? extends kc> a() {
                kg a = this.d.b(ivVar);
                if (a == null) {
                    return Collections.emptyList();
                }
                ij a2 = ij.a(a.a(), ijVar);
                ia b = ia.b(map);
                this.d.h.b(ijVar, b);
                return this.d.a(a, new jg(ji.a(a.b()), a2, b));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<? extends kc> a(final iv ivVar) {
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            final /* synthetic */ iu b;

            public List<? extends kc> a() {
                kg a = this.b.b(ivVar);
                if (a == null) {
                    return Collections.emptyList();
                }
                this.b.h.d(a);
                return this.b.a(a, new jf(ji.a(a.b()), ij.a()));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<kc> a(kg kgVar, com.google.firebase.database.c cVar) {
        return a(kgVar, null, cVar);
    }

    public void a(kg kgVar, boolean z) {
        if (z && !this.f.contains(kgVar)) {
            a(new b(kgVar));
            this.f.add(kgVar);
        } else if (!z && this.f.contains(kgVar)) {
            b(new b(kgVar));
            this.f.remove(kgVar);
        }
    }

    public boolean a() {
        return this.b.d();
    }

    public lh b(ij ijVar, List<Long> list) {
        lh a;
        ju juVar = this.b;
        it itVar = (it) juVar.b();
        lh lhVar = null;
        ij a2 = ij.a();
        ju juVar2 = juVar;
        ij ijVar2 = ijVar;
        while (true) {
            kv d = ijVar2.d();
            ij e = ijVar2.e();
            ijVar2 = a2.a(d);
            ij a3 = ij.a(ijVar2, ijVar);
            juVar2 = d != null ? juVar2.a(d) : ju.a();
            itVar = (it) juVar2.b();
            a = itVar != null ? itVar.a(a3) : lhVar;
            if (!e.h() && a == null) {
                lhVar = a;
                a2 = ijVar2;
                ijVar2 = e;
            }
        }
        return this.c.a(ijVar, a, (List) list, true);
    }

    public List<? extends kc> b() {
        return (List) this.h.a(new Callable<List<? extends kc>>(this) {
            final /* synthetic */ iu a;

            {
                this.a = r1;
            }

            public List<? extends kc> a() {
                this.a.h.a();
                if (this.a.c.a().isEmpty()) {
                    return Collections.emptyList();
                }
                return this.a.a(new je(ij.a(), new ju(Boolean.valueOf(true)), true));
            }

            public /* synthetic */ Object call() {
                return a();
            }
        });
    }

    public List<kc> b(ie ieVar) {
        return a(ieVar.a(), ieVar, null);
    }
}
