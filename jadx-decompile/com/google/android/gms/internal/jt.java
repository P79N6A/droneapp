package com.google.android.gms.internal;

import com.google.android.gms.internal.ju.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class jt {
    static final /* synthetic */ boolean a = (!jt.class.desiredAssertionStatus());
    private static final jv<Map<kf, js>> b = new jv<Map<kf, js>>() {
        public /* synthetic */ boolean a(Object obj) {
            return a((Map) obj);
        }

        public boolean a(Map<kf, js> map) {
            js jsVar = (js) map.get(kf.a);
            return jsVar != null && jsVar.d;
        }
    };
    private static final jv<Map<kf, js>> c = new jv<Map<kf, js>>() {
        public /* synthetic */ boolean a(Object obj) {
            return a((Map) obj);
        }

        public boolean a(Map<kf, js> map) {
            js jsVar = (js) map.get(kf.a);
            return jsVar != null && jsVar.e;
        }
    };
    private static final jv<js> d = new jv<js>() {
        public boolean a(js jsVar) {
            return !jsVar.e;
        }

        public /* synthetic */ boolean a(Object obj) {
            return a((js) obj);
        }
    };
    private static final jv<js> e = new jv<js>() {
        public boolean a(js jsVar) {
            return !jt.d.a(jsVar);
        }

        public /* synthetic */ boolean a(Object obj) {
            return a((js) obj);
        }
    };
    private ju<Map<kf, js>> f;
    private final jq g;
    private final ks h;
    private final mc i;
    private long j = 0;

    public jt(jq jqVar, ks ksVar, mc mcVar) {
        this.g = jqVar;
        this.h = ksVar;
        this.i = mcVar;
        this.f = new ju(null);
        c();
        for (js jsVar : this.g.c()) {
            this.j = Math.max(jsVar.a + 1, this.j);
            a(jsVar);
        }
    }

    private static long a(jk jkVar, long j) {
        return j - Math.min((long) Math.floor((double) ((1.0f - jkVar.a()) * ((float) j))), jkVar.b());
    }

    private List<js> a(jv<js> jvVar) {
        List<js> arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            for (js jsVar : ((Map) ((Entry) it.next()).getValue()).values()) {
                if (jvVar.a(jsVar)) {
                    arrayList.add(jsVar);
                }
            }
        }
        return arrayList;
    }

    private void a(js jsVar) {
        Map map;
        g(jsVar.b);
        Map map2 = (Map) this.f.e(jsVar.b.a());
        if (map2 == null) {
            map2 = new HashMap();
            this.f = this.f.a(jsVar.b.a(), (Object) map2);
            map = map2;
        } else {
            map = map2;
        }
        js jsVar2 = (js) map.get(jsVar.b.b());
        boolean z = jsVar2 == null || jsVar2.a == jsVar.a;
        mk.a(z);
        map.put(jsVar.b.b(), jsVar);
    }

    private void a(kg kgVar, boolean z) {
        kg h = h(kgVar);
        js a = a(h);
        long a2 = this.i.a();
        if (a != null) {
            a = a.a(a2).a(z);
        } else if (a || z) {
            long j = this.j;
            this.j = 1 + j;
            a = new js(j, h, a2, false, z);
        } else {
            throw new AssertionError("If we're setting the query to inactive, we should already be tracking it!");
        }
        b(a);
    }

    private void b(js jsVar) {
        a(jsVar);
        this.g.a(jsVar);
    }

    private void c() {
        try {
            this.g.e();
            this.g.c(this.i.a());
            this.g.g();
        } finally {
            this.g.f();
        }
    }

    private boolean e(ij ijVar) {
        return this.f.a(ijVar, b) != null;
    }

    private Set<Long> f(ij ijVar) {
        Set<Long> hashSet = new HashSet();
        Map map = (Map) this.f.e(ijVar);
        if (map != null) {
            for (js jsVar : map.values()) {
                if (!jsVar.b.e()) {
                    hashSet.add(Long.valueOf(jsVar.a));
                }
            }
        }
        return hashSet;
    }

    private static void g(kg kgVar) {
        boolean z = !kgVar.e() || kgVar.d();
        mk.a(z, "Can't have tracked non-default query that loads all data");
    }

    private static kg h(kg kgVar) {
        return kgVar.e() ? kg.a(kgVar.a()) : kgVar;
    }

    public long a() {
        return (long) a(d).size();
    }

    public jr a(jk jkVar) {
        List a = a(d);
        long a2 = a(jkVar, (long) a.size());
        jr jrVar = new jr();
        if (this.h.a()) {
            this.h.a("Pruning old queries.  Prunable: " + a.size() + " Count to prune: " + a2, new Object[0]);
        }
        Collections.sort(a, new Comparator<js>(this) {
            final /* synthetic */ jt a;

            {
                this.a = r1;
            }

            public int a(js jsVar, js jsVar2) {
                return mk.a(jsVar.c, jsVar2.c);
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((js) obj, (js) obj2);
            }
        });
        for (int i = 0; ((long) i) < a2; i++) {
            js jsVar = (js) a.get(i);
            jrVar = jrVar.c(jsVar.b.a());
            b(jsVar.b);
        }
        jr jrVar2 = jrVar;
        for (int i2 = (int) a2; i2 < a.size(); i2++) {
            jrVar2 = jrVar2.d(((js) a.get(i2)).b.a());
        }
        List<js> a3 = a(e);
        if (this.h.a()) {
            this.h.a("Unprunable queries: " + a3.size(), new Object[0]);
        }
        for (js jsVar2 : a3) {
            jrVar2 = jrVar2.d(jsVar2.b.a());
        }
        return jrVar2;
    }

    public js a(kg kgVar) {
        kg h = h(kgVar);
        Map map = (Map) this.f.e(h.a());
        return map != null ? (js) map.get(h.b()) : null;
    }

    public void a(ij ijVar) {
        this.f.c(ijVar).a(new a<Map<kf, js>, Void>(this) {
            final /* synthetic */ jt a;

            {
                this.a = r1;
            }

            public Void a(ij ijVar, Map<kf, js> map, Void voidR) {
                for (Entry value : map.entrySet()) {
                    js jsVar = (js) value.getValue();
                    if (!jsVar.d) {
                        this.a.b(jsVar.a());
                    }
                }
                return null;
            }
        });
    }

    public Set<kv> b(ij ijVar) {
        if (a || !f(kg.a(ijVar))) {
            Set<kv> hashSet = new HashSet();
            Set f = f(ijVar);
            if (!f.isEmpty()) {
                hashSet.addAll(this.g.a(f));
            }
            Iterator it = this.f.c(ijVar).c().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                kv kvVar = (kv) entry.getKey();
                ju juVar = (ju) entry.getValue();
                if (juVar.b() != null && b.a((Map) juVar.b())) {
                    hashSet.add(kvVar);
                }
            }
            return hashSet;
        }
        throw new AssertionError("Path is fully complete.");
    }

    public void b(kg kgVar) {
        kg h = h(kgVar);
        js a = a(h);
        if (a || a != null) {
            this.g.b(a.a);
            Map map = (Map) this.f.e(h.a());
            map.remove(h.b());
            if (map.isEmpty()) {
                this.f = this.f.d(h.a());
                return;
            }
            return;
        }
        throw new AssertionError("Query must exist to be removed.");
    }

    public void c(ij ijVar) {
        if (!e(ijVar)) {
            kg a = kg.a(ijVar);
            js a2 = a(a);
            if (a2 == null) {
                long j = this.j;
                this.j = 1 + j;
                a2 = new js(j, a, this.i.a(), true, false);
            } else if (a || !a2.d) {
                a2 = a2.a();
            } else {
                throw new AssertionError("This should have been handled above!");
            }
            b(a2);
        }
    }

    public void c(kg kgVar) {
        a(kgVar, true);
    }

    public void d(kg kgVar) {
        a(kgVar, false);
    }

    public boolean d(ij ijVar) {
        return this.f.b(ijVar, c) != null;
    }

    public void e(kg kgVar) {
        js a = a(h(kgVar));
        if (a != null && !a.d) {
            b(a.a());
        }
    }

    public boolean f(kg kgVar) {
        if (e(kgVar.a())) {
            return true;
        }
        if (kgVar.e()) {
            return false;
        }
        Map map = (Map) this.f.e(kgVar.a());
        boolean z = map != null && map.containsKey(kgVar.b()) && ((js) map.get(kgVar.b())).d;
        return z;
    }
}
