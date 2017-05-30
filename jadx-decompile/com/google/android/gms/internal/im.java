package com.google.android.gms.internal;

import com.google.android.gms.internal.iu.d;
import com.google.firebase.database.c;
import com.google.firebase.database.e;
import com.google.firebase.database.g;
import com.google.firebase.database.q;
import com.google.firebase.database.r;
import com.google.firebase.database.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class im implements com.google.android.gms.internal.hr.a {
    static final /* synthetic */ boolean b = (!im.class.desiredAssertionStatus());
    public long a = 0;
    private final in c;
    private final mg d = new mg(new md(), 0);
    private final hr e;
    private ir f;
    private is g;
    private jw<List<a>> h;
    private boolean i = false;
    private final ke j;
    private final ic k;
    private final ks l;
    private final ks m;
    private final ks n;
    private long o = 1;
    private iu p;
    private iu q;
    private g r;
    private boolean s = false;
    private long t = 0;

    private static class a implements Comparable<a> {
        private ij a;
        private com.google.firebase.database.q.a b;
        private r c;
        private b d;
        private long e;
        private boolean f;
        private int g;
        private c h;
        private long i;
        private lh j;
        private lh k;
        private lh l;

        private a(ij ijVar, com.google.firebase.database.q.a aVar, r rVar, b bVar, boolean z, long j) {
            this.a = ijVar;
            this.b = aVar;
            this.c = rVar;
            this.d = bVar;
            this.g = 0;
            this.f = z;
            this.e = j;
            this.h = null;
            this.j = null;
            this.k = null;
            this.l = null;
        }

        public int a(a aVar) {
            return this.e < aVar.e ? -1 : this.e == aVar.e ? 0 : 1;
        }

        public /* synthetic */ int compareTo(Object obj) {
            return a((a) obj);
        }
    }

    private enum b {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    im(in inVar, ic icVar, g gVar) {
        this.c = inVar;
        this.k = icVar;
        this.r = gVar;
        this.l = this.k.a("RepoOperation");
        this.m = this.k.a("Transaction");
        this.n = this.k.a("DataOperation");
        this.j = new ke(this.k);
        this.e = icVar.a(new hp(inVar.a, inVar.c, inVar.b), this);
        a(new Runnable(this) {
            final /* synthetic */ im a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.j();
            }
        });
    }

    private ij a(ij ijVar, final int i) {
        ij b = c(ijVar).b();
        if (this.m.a()) {
            ks ksVar = this.l;
            String valueOf = String.valueOf(ijVar);
            String valueOf2 = String.valueOf(b);
            ksVar.a(new StringBuilder((String.valueOf(valueOf).length() + 44) + String.valueOf(valueOf2).length()).append("Aborting transactions for path: ").append(valueOf).append(". Affected: ").append(valueOf2).toString(), new Object[0]);
        }
        jw a = this.h.a(ijVar);
        a.a(new com.google.android.gms.internal.jw.a<List<a>>(this) {
            final /* synthetic */ im b;

            public boolean a(jw<List<a>> jwVar) {
                this.b.a((jw) jwVar, i);
                return false;
            }
        });
        a(a, i);
        a.a(new com.google.android.gms.internal.jw.b<List<a>>(this) {
            final /* synthetic */ im b;

            public void a(jw<List<a>> jwVar) {
                this.b.a((jw) jwVar, i);
            }
        });
        return b;
    }

    private lh a(ij ijVar) {
        return a(ijVar, new ArrayList());
    }

    private lh a(ij ijVar, List<Long> list) {
        lh b = this.q.b(ijVar, (List) list);
        return b == null ? la.j() : b;
    }

    private void a(long j, ij ijVar, c cVar) {
        if (cVar == null || cVar.a() != -25) {
            List a = this.q.a(j, !(cVar == null), true, this.d);
            if (a.size() > 0) {
                b(ijVar);
            }
            a(a);
        }
    }

    private void a(jp jpVar) {
        List<iy> b = jpVar.b();
        Map a = iq.a(this.d);
        long j = Long.MIN_VALUE;
        for (final iy iyVar : b) {
            hu anonymousClass11 = new hu(this) {
                final /* synthetic */ im b;

                public void a(String str, String str2) {
                    c a = im.b(str, str2);
                    this.b.a("Persisted write", iyVar.b(), a);
                    this.b.a(iyVar.a(), iyVar.b(), a);
                }
            };
            if (j >= iyVar.a()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            long a2 = iyVar.a();
            this.o = iyVar.a() + 1;
            if (iyVar.e()) {
                if (this.l.a()) {
                    this.l.a("Restoring overwrite with id " + iyVar.a(), new Object[0]);
                }
                this.e.a(iyVar.b().c(), iyVar.c().a(true), anonymousClass11);
                this.q.a(iyVar.b(), iyVar.c(), iq.a(iyVar.c(), a), iyVar.a(), true, false);
            } else {
                if (this.l.a()) {
                    this.l.a("Restoring merge with id " + iyVar.a(), new Object[0]);
                }
                this.e.a(iyVar.b().c(), iyVar.d().a(true), anonymousClass11);
                this.q.a(iyVar.b(), iyVar.d(), iq.a(iyVar.d(), a), iyVar.a(), false);
            }
            j = a2;
        }
    }

    private void a(jw<List<a>> jwVar) {
        if (((List) jwVar.a()) != null) {
            List<a> c = c((jw) jwVar);
            if (b || c.size() > 0) {
                Boolean valueOf;
                Boolean valueOf2 = Boolean.valueOf(true);
                for (a d : c) {
                    if (d.d != b.RUN) {
                        valueOf = Boolean.valueOf(false);
                        break;
                    }
                }
                valueOf = valueOf2;
                if (valueOf.booleanValue()) {
                    a((List) c, jwVar.b());
                    return;
                }
                return;
            }
            throw new AssertionError();
        } else if (jwVar.c()) {
            jwVar.b(new com.google.android.gms.internal.jw.b<List<a>>(this) {
                final /* synthetic */ im a;

                {
                    this.a = r1;
                }

                public void a(jw<List<a>> jwVar) {
                    this.a.a((jw) jwVar);
                }
            });
        }
    }

    private void a(jw<List<a>> jwVar, int i) {
        List list = (List) jwVar.a();
        List arrayList = new ArrayList();
        if (list != null) {
            c a;
            List<Runnable> arrayList2 = new ArrayList();
            if (i == -9) {
                a = c.a("overriddenBySet");
            } else {
                mk.a(i == -25, "Unknown transaction abort reason: " + i);
                a = c.a(-25);
            }
            int i2 = 0;
            int i3 = -1;
            while (i2 < list.size()) {
                int i4;
                final a aVar = (a) list.get(i2);
                if (aVar.d == b.SENT_NEEDS_ABORT) {
                    i4 = i3;
                } else if (aVar.d == b.SENT) {
                    if (b || i3 == i2 - 1) {
                        aVar.d = b.SENT_NEEDS_ABORT;
                        aVar.h = a;
                        i4 = i2;
                    } else {
                        throw new AssertionError();
                    }
                } else if (b || aVar.d == b.RUN) {
                    a(new ja(this, aVar.c, kg.a(aVar.a)));
                    if (i == -9) {
                        arrayList.addAll(this.q.a(aVar.i, true, false, this.d));
                    } else {
                        mk.a(i == -25, "Unknown transaction abort reason: " + i);
                    }
                    arrayList2.add(new Runnable(this) {
                        final /* synthetic */ im c;

                        public void run() {
                            aVar.b.a(a, false, null);
                        }
                    });
                    i4 = i3;
                } else {
                    throw new AssertionError();
                }
                i2++;
                i3 = i4;
            }
            if (i3 == -1) {
                jwVar.a(null);
            } else {
                jwVar.a(list.subList(0, i3 + 1));
            }
            a(arrayList);
            for (Runnable b : arrayList2) {
                b(b);
            }
        }
    }

    private void a(String str, ij ijVar, c cVar) {
        if (cVar != null && cVar.a() != -1 && cVar.a() != -25) {
            ks ksVar = this.l;
            String valueOf = String.valueOf(ijVar.toString());
            String valueOf2 = String.valueOf(cVar.toString());
            ksVar.a(new StringBuilder(((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append(" at ").append(valueOf).append(" failed: ").append(valueOf2).toString());
        }
    }

    private void a(List<? extends kc> list) {
        if (!list.isEmpty()) {
            this.j.a((List) list);
        }
    }

    private void a(final List<a> list, final ij ijVar) {
        List arrayList = new ArrayList();
        for (a c : list) {
            arrayList.add(Long.valueOf(c.i));
        }
        lh a = a(ijVar, arrayList);
        String str = "badhash";
        String d = a.d();
        for (a c2 : list) {
            if (b || c2.d == b.RUN) {
                c2.d = b.SENT;
                c2.g = c2.g + 1;
                a = a.a(ij.a(ijVar, c2.a), c2.k);
            } else {
                throw new AssertionError();
            }
        }
        Object a2 = a.a(true);
        k();
        this.e.a(ijVar.c(), a2, d, new hu(this) {
            final /* synthetic */ im d;

            public void a(String str, String str2) {
                int i = 0;
                c a = im.b(str, str2);
                this.d.a("Transaction", ijVar, a);
                List arrayList = new ArrayList();
                if (a == null) {
                    List arrayList2 = new ArrayList();
                    for (final a aVar : list) {
                        aVar.d = b.COMPLETED;
                        arrayList.addAll(this.d.q.a(aVar.i, false, false, this.d.d));
                        final com.google.firebase.database.b a2 = s.a(s.a(this, aVar.a), lc.a(aVar.l));
                        arrayList2.add(new Runnable(this) {
                            final /* synthetic */ AnonymousClass22 c;

                            public void run() {
                                aVar.b.a(null, true, a2);
                            }
                        });
                        this.d.a(new ja(this.d, aVar.c, kg.a(aVar.a)));
                    }
                    this.d.b(this.d.h.a(ijVar));
                    this.d.m();
                    this.a(arrayList);
                    while (i < arrayList2.size()) {
                        this.d.b((Runnable) arrayList2.get(i));
                        i++;
                    }
                    return;
                }
                if (a.a() == -1) {
                    for (a aVar2 : list) {
                        if (aVar2.d == b.SENT_NEEDS_ABORT) {
                            aVar2.d = b.NEEDS_ABORT;
                        } else {
                            aVar2.d = b.RUN;
                        }
                    }
                } else {
                    for (a aVar22 : list) {
                        aVar22.d = b.NEEDS_ABORT;
                        aVar22.h = a;
                    }
                }
                this.d.b(ijVar);
            }
        });
    }

    private void a(final List<a> list, jw<List<a>> jwVar) {
        List list2 = (List) jwVar.a();
        if (list2 != null) {
            list.addAll(list2);
        }
        jwVar.b(new com.google.android.gms.internal.jw.b<List<a>>(this) {
            final /* synthetic */ im b;

            public void a(jw<List<a>> jwVar) {
                this.b.a(list, (jw) jwVar);
            }
        });
    }

    private ij b(ij ijVar) {
        jw c = c(ijVar);
        ij b = c.b();
        b(c(c), b);
        return b;
    }

    private static c b(String str, String str2) {
        return str != null ? c.a(str, str2) : null;
    }

    private void b(jw<List<a>> jwVar) {
        Object obj = (List) jwVar.a();
        if (obj != null) {
            int i = 0;
            while (i < obj.size()) {
                int i2;
                if (((a) obj.get(i)).d == b.COMPLETED) {
                    obj.remove(i);
                    i2 = i;
                } else {
                    i2 = i + 1;
                }
                i = i2;
            }
            if (obj.size() > 0) {
                jwVar.a(obj);
            } else {
                jwVar.a(null);
            }
        }
        jwVar.b(new com.google.android.gms.internal.jw.b<List<a>>(this) {
            final /* synthetic */ im a;

            {
                this.a = r1;
            }

            public void a(jw<List<a>> jwVar) {
                this.a.b((jw) jwVar);
            }
        });
    }

    private void b(kv kvVar, Object obj) {
        if (kvVar.equals(ib.b)) {
            this.d.a(((Long) obj).longValue());
        }
        ij ijVar = new ij(ib.a, kvVar);
        try {
            lh a = li.a(obj);
            this.f.a(ijVar, a);
            a(this.p.a(ijVar, a));
        } catch (Throwable e) {
            this.l.a("Failed to parse info update", e);
        }
    }

    private void b(List<a> list, ij ijVar) {
        if (!list.isEmpty()) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (a c : list) {
                arrayList2.add(Long.valueOf(c.i));
            }
            for (final a aVar : list) {
                ij a = ij.a(ijVar, aVar.a);
                ArrayList arrayList3 = new ArrayList();
                if (b || a != null) {
                    Object obj;
                    c k;
                    if (aVar.d == b.NEEDS_ABORT) {
                        obj = 1;
                        k = aVar.h;
                        if (k.a() != -25) {
                            arrayList3.addAll(this.q.a(aVar.i, true, false, this.d));
                        }
                    } else if (aVar.d != b.RUN) {
                        k = null;
                        obj = null;
                    } else if (aVar.g >= 25) {
                        obj = 1;
                        k = c.a("maxretries");
                        arrayList3.addAll(this.q.a(aVar.i, true, false, this.d));
                    } else {
                        com.google.firebase.database.q.b a2;
                        lh a3 = a(aVar.a, arrayList2);
                        aVar.j = a3;
                        try {
                            a2 = aVar.b.a(s.a(a3));
                            k = null;
                        } catch (Throwable th) {
                            c a4 = c.a(th);
                            a2 = q.a();
                            k = a4;
                        }
                        if (a2.a()) {
                            Long valueOf = Long.valueOf(aVar.i);
                            Map a5 = iq.a(this.d);
                            lh b = a2.b();
                            lh a6 = iq.a(b, a5);
                            aVar.k = b;
                            aVar.l = a6;
                            aVar.i = k();
                            arrayList2.remove(valueOf);
                            arrayList3.addAll(this.q.a(aVar.a, b, a6, aVar.i, aVar.f, false));
                            arrayList3.addAll(this.q.a(valueOf.longValue(), true, false, this.d));
                            k = null;
                            obj = null;
                        } else {
                            obj = 1;
                            arrayList3.addAll(this.q.a(aVar.i, true, false, this.d));
                        }
                    }
                    a((List) arrayList3);
                    if (obj != null) {
                        aVar.d = b.COMPLETED;
                        final com.google.firebase.database.b a7 = s.a(s.a(this, aVar.a), lc.a(aVar.j));
                        a(new Runnable(this) {
                            final /* synthetic */ im b;

                            public void run() {
                                this.b.a(new ja(this.b, aVar.c, kg.a(aVar.a)));
                            }
                        });
                        arrayList.add(new Runnable(this) {
                            final /* synthetic */ im d;

                            public void run() {
                                aVar.b.a(k, false, a7);
                            }
                        });
                    }
                } else {
                    throw new AssertionError();
                }
            }
            b(this.h);
            for (int i = 0; i < arrayList.size(); i++) {
                b((Runnable) arrayList.get(i));
            }
            m();
        }
    }

    private jw<List<a>> c(ij ijVar) {
        jw<List<a>> jwVar = this.h;
        while (!ijVar.h() && jwVar.a() == null) {
            jwVar = jwVar.a(new ij(ijVar.d()));
            ijVar = ijVar.e();
        }
        return jwVar;
    }

    private List<a> c(jw<List<a>> jwVar) {
        List arrayList = new ArrayList();
        a(arrayList, (jw) jwVar);
        Collections.sort(arrayList);
        return arrayList;
    }

    private void j() {
        this.k.p().a(new com.google.android.gms.internal.hy.b(this) {
            final /* synthetic */ im a;

            {
                this.a = r1;
            }

            public void a(String str) {
                this.a.l.a("Auth token changed, triggering auth token refresh", new Object[0]);
                this.a.e.c(str);
            }
        });
        this.e.a();
        jp b = this.k.b(this.c.a);
        this.f = new ir();
        this.g = new is();
        this.h = new jw();
        this.p = new iu(this.k, new jo(), new d(this) {
            final /* synthetic */ im a;

            {
                this.a = r1;
            }

            public void a(kg kgVar, iv ivVar) {
            }

            public void a(final kg kgVar, iv ivVar, hq hqVar, final com.google.android.gms.internal.iu.a aVar) {
                this.a.a(new Runnable(this) {
                    final /* synthetic */ AnonymousClass9 c;

                    public void run() {
                        lh a = this.c.a.f.a(kgVar.a());
                        if (!a.b()) {
                            this.c.a.a(this.c.a.p.a(kgVar.a(), a));
                            aVar.a(null);
                        }
                    }
                });
            }
        });
        this.q = new iu(this.k, b, new d(this) {
            final /* synthetic */ im a;

            {
                this.a = r1;
            }

            public void a(kg kgVar, iv ivVar) {
                this.a.e.a(kgVar.a().c(), kgVar.b().l());
            }

            public void a(kg kgVar, iv ivVar, hq hqVar, final com.google.android.gms.internal.iu.a aVar) {
                this.a.e.a(kgVar.a().c(), kgVar.b().l(), hqVar, ivVar != null ? Long.valueOf(ivVar.a()) : null, new hu(this) {
                    final /* synthetic */ AnonymousClass10 b;

                    public void a(String str, String str2) {
                        this.b.a.a(aVar.a(im.b(str, str2)));
                    }
                });
            }
        });
        a(b);
        b(ib.c, Boolean.valueOf(false));
        b(ib.d, Boolean.valueOf(false));
    }

    private long k() {
        long j = this.o;
        this.o = 1 + j;
        return j;
    }

    private void l() {
        is a = iq.a(this.g, iq.a(this.d));
        final List arrayList = new ArrayList();
        a.a(ij.a(), new com.google.android.gms.internal.is.b(this) {
            final /* synthetic */ im b;

            public void a(ij ijVar, lh lhVar) {
                arrayList.addAll(this.b.q.a(ijVar, lhVar));
                this.b.b(this.b.a(ijVar, -9));
            }
        });
        this.g = new is();
        a(arrayList);
    }

    private void m() {
        jw jwVar = this.h;
        b(jwVar);
        a(jwVar);
    }

    private long n() {
        long j = this.t;
        this.t = 1 + j;
        return j;
    }

    public void a() {
        a(ib.d, Boolean.valueOf(true));
    }

    public void a(ie ieVar) {
        a(ib.a.equals(ieVar.a().a().d()) ? this.p.b(ieVar) : this.q.b(ieVar));
    }

    public void a(ij ijVar, ia iaVar, com.google.firebase.database.e.a aVar, Map<String, Object> map) {
        if (this.l.a()) {
            ks ksVar = this.l;
            String valueOf = String.valueOf(ijVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 8).append("update: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.n.a()) {
            ksVar = this.n;
            valueOf = String.valueOf(ijVar);
            String valueOf2 = String.valueOf(map);
            ksVar.a(new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append("update: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        if (iaVar.e()) {
            if (this.l.a()) {
                this.l.a("update called with no changes. No-op", new Object[0]);
            }
            a(aVar, null, ijVar);
            return;
        }
        ia a = iq.a(iaVar, iq.a(this.d));
        final long k = k();
        a(this.q.a(ijVar, iaVar, a, k, true));
        final ij ijVar2 = ijVar;
        final com.google.firebase.database.e.a aVar2 = aVar;
        this.e.a(ijVar.c(), (Map) map, new hu(this) {
            final /* synthetic */ im d;

            public void a(String str, String str2) {
                c a = im.b(str, str2);
                this.d.a("updateChildren", ijVar2, a);
                this.d.a(k, ijVar2, a);
                this.d.a(aVar2, a, ijVar2);
            }
        });
        b(a(ijVar, -9));
    }

    public void a(ij ijVar, lh lhVar, com.google.firebase.database.e.a aVar) {
        if (this.l.a()) {
            ks ksVar = this.l;
            String valueOf = String.valueOf(ijVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 5).append("set: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.n.a()) {
            ksVar = this.n;
            valueOf = String.valueOf(ijVar);
            String valueOf2 = String.valueOf(lhVar);
            ksVar.a(new StringBuilder((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length()).append("set: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        lh a = iq.a(lhVar, iq.a(this.d));
        final long k = k();
        a(this.q.a(ijVar, lhVar, a, k, true, true));
        final ij ijVar2 = ijVar;
        final com.google.firebase.database.e.a aVar2 = aVar;
        this.e.a(ijVar.c(), lhVar.a(true), new hu(this) {
            final /* synthetic */ im d;

            public void a(String str, String str2) {
                c a = im.b(str, str2);
                this.d.a("setValue", ijVar2, a);
                this.d.a(k, ijVar2, a);
                this.d.a(aVar2, a, ijVar2);
            }
        });
        b(a(ijVar, -9));
    }

    public void a(final ij ijVar, final com.google.firebase.database.e.a aVar) {
        this.e.a(ijVar.c(), new hu(this) {
            final /* synthetic */ im c;

            public void a(String str, String str2) {
                c a = im.b(str, str2);
                if (a == null) {
                    this.c.g.a(ijVar);
                }
                this.c.a(aVar, a, ijVar);
            }
        });
    }

    public void a(ij ijVar, final com.google.firebase.database.q.a aVar, boolean z) {
        if (this.l.a()) {
            ks ksVar = this.l;
            String valueOf = String.valueOf(ijVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 13).append("transaction: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.n.a()) {
            ksVar = this.l;
            valueOf = String.valueOf(ijVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 13).append("transaction: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.k.j() && !this.s) {
            this.s = true;
            this.m.b("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
        }
        e a = s.a(this, ijVar);
        r anonymousClass19 = new r(this) {
            final /* synthetic */ im a;

            {
                this.a = r1;
            }

            public void a(com.google.firebase.database.b bVar) {
            }

            public void a(c cVar) {
            }
        };
        b(new ja(this, anonymousClass19, a.o()));
        a aVar2 = new a(ijVar, aVar, anonymousClass19, b.INITIALIZING, z, n());
        lh a2 = a(ijVar);
        aVar2.j = a2;
        com.google.firebase.database.q.b bVar;
        c cVar;
        try {
            com.google.firebase.database.q.b a3 = aVar.a(s.a(a2));
            if (a3 == null) {
                throw new NullPointerException("Transaction returned null as result");
            }
            bVar = a3;
            cVar = null;
            if (bVar.a()) {
                aVar2.d = b.RUN;
                jw a4 = this.h.a(ijVar);
                Object obj = (List) a4.a();
                if (obj == null) {
                    obj = new ArrayList();
                }
                obj.add(aVar2);
                a4.a(obj);
                Map a5 = iq.a(this.d);
                lh b = bVar.b();
                lh a6 = iq.a(b, a5);
                aVar2.k = b;
                aVar2.l = a6;
                aVar2.i = k();
                a(this.q.a(ijVar, b, a6, aVar2.i, z, false));
                m();
                return;
            }
            aVar2.k = null;
            aVar2.l = null;
            final com.google.firebase.database.b a7 = s.a(a, lc.a(aVar2.j));
            b(new Runnable(this) {
                final /* synthetic */ im d;

                public void run() {
                    aVar.a(cVar, false, a7);
                }
            });
        } catch (Throwable th) {
            c a8 = c.a(th);
            cVar = a8;
            bVar = q.a();
        }
    }

    public void a(final ij ijVar, final Map<ij, lh> map, final com.google.firebase.database.e.a aVar, Map<String, Object> map2) {
        this.e.b(ijVar.c(), (Map) map2, new hu(this) {
            final /* synthetic */ im d;

            public void a(String str, String str2) {
                c a = im.b(str, str2);
                this.d.a("onDisconnect().updateChildren", ijVar, a);
                if (a == null) {
                    for (Entry entry : map.entrySet()) {
                        this.d.g.a(ijVar.a((ij) entry.getKey()), (lh) entry.getValue());
                    }
                }
                this.d.a(aVar, a, ijVar);
            }
        });
    }

    public void a(kg kgVar, boolean z) {
        if (b || kgVar.a().h() || !kgVar.a().d().equals(ib.a)) {
            this.q.a(kgVar, z);
            return;
        }
        throw new AssertionError();
    }

    public void a(kv kvVar, Object obj) {
        b(kvVar, obj);
    }

    void a(final com.google.firebase.database.e.a aVar, final c cVar, ij ijVar) {
        if (aVar != null) {
            kv g = ijVar.g();
            final e a = (g == null || !g.f()) ? s.a(this, ijVar) : s.a(this, ijVar.f());
            b(new Runnable(this) {
                final /* synthetic */ im d;

                public void run() {
                    aVar.a(cVar, a);
                }
            });
        }
    }

    public void a(Runnable runnable) {
        this.k.c();
        this.k.m().a(runnable);
    }

    public void a(List<String> list, Object obj, boolean z, Long l) {
        List a;
        ij ijVar = new ij((List) list);
        if (this.l.a()) {
            ks ksVar = this.l;
            String valueOf = String.valueOf(ijVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 14).append("onDataUpdate: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.n.a()) {
            ksVar = this.l;
            valueOf = String.valueOf(ijVar);
            String valueOf2 = String.valueOf(obj);
            ksVar.a(new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(valueOf2).length()).append("onDataUpdate: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        this.a++;
        if (l != null) {
            try {
                iv ivVar = new iv(l.longValue());
                if (z) {
                    Map hashMap = new HashMap();
                    for (Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new ij((String) entry.getKey()), li.a(entry.getValue()));
                    }
                    a = this.q.a(ijVar, hashMap, ivVar);
                } else {
                    a = this.q.a(ijVar, li.a(obj), ivVar);
                }
            } catch (Throwable e) {
                this.l.a("FIREBASE INTERNAL ERROR", e);
                return;
            }
        } else if (z) {
            Map hashMap2 = new HashMap();
            for (Entry entry2 : ((Map) obj).entrySet()) {
                hashMap2.put(new ij((String) entry2.getKey()), li.a(entry2.getValue()));
            }
            a = this.q.a(ijVar, hashMap2);
        } else {
            a = this.q.a(ijVar, li.a(obj));
        }
        if (a.size() > 0) {
            b(ijVar);
        }
        a(a);
    }

    public void a(List<String> list, List<ht> list2, Long l) {
        ij ijVar = new ij((List) list);
        if (this.l.a()) {
            ks ksVar = this.l;
            String valueOf = String.valueOf(ijVar);
            ksVar.a(new StringBuilder(String.valueOf(valueOf).length() + 20).append("onRangeMergeUpdate: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.n.a()) {
            ksVar = this.l;
            valueOf = String.valueOf(ijVar);
            String valueOf2 = String.valueOf(list2);
            ksVar.a(new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append("onRangeMergeUpdate: ").append(valueOf).append(" ").append(valueOf2).toString(), new Object[0]);
        }
        this.a++;
        List arrayList = new ArrayList(list2.size());
        for (ht lmVar : list2) {
            arrayList.add(new lm(lmVar));
        }
        List a = l != null ? this.q.a(ijVar, arrayList, new iv(l.longValue())) : this.q.a(ijVar, arrayList);
        if (a.size() > 0) {
            b(ijVar);
        }
        a(a);
    }

    public void a(Map<String, Object> map) {
        for (Entry entry : map.entrySet()) {
            b(kv.a((String) entry.getKey()), entry.getValue());
        }
    }

    public void a(boolean z) {
        a(ib.c, Boolean.valueOf(z));
    }

    public void b() {
        a(ib.d, Boolean.valueOf(false));
        l();
    }

    public void b(ie ieVar) {
        kv d = ieVar.a().a().d();
        List a = (d == null || !d.equals(ib.a)) ? this.q.a(ieVar) : this.p.a(ieVar);
        a(a);
    }

    public void b(final ij ijVar, final lh lhVar, final com.google.firebase.database.e.a aVar) {
        this.e.b(ijVar.c(), lhVar.a(true), new hu(this) {
            final /* synthetic */ im d;

            public void a(String str, String str2) {
                c a = im.b(str, str2);
                this.d.a("onDisconnect().setValue", ijVar, a);
                if (a == null) {
                    this.d.g.a(ijVar, lhVar);
                }
                this.d.a(aVar, a, ijVar);
            }
        });
    }

    public void b(Runnable runnable) {
        this.k.c();
        this.k.l().a(runnable);
    }

    public g c() {
        return this.r;
    }

    public in d() {
        return this.c;
    }

    public long e() {
        return this.d.a();
    }

    boolean f() {
        return (this.p.a() && this.q.a()) ? false : true;
    }

    public void g() {
        if (this.l.a()) {
            this.l.a("Purging writes", new Object[0]);
        }
        a(this.q.b());
        a(ij.a(), -25);
        this.e.d();
    }

    void h() {
        this.e.d("repo_interrupt");
    }

    void i() {
        this.e.e("repo_interrupt");
    }

    public String toString() {
        return this.c.toString();
    }
}
