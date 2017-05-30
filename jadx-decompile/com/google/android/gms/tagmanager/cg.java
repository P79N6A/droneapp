package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.en.e;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.gi.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class cg {
    private static final bn<com.google.android.gms.internal.hj.a> a = new bn(cw.g(), true);
    private final com.google.android.gms.internal.en.c b;
    private final q c;
    private final Map<String, t> d;
    private final Map<String, t> e;
    private final Map<String, t> f;
    private final di<com.google.android.gms.internal.en.a, bn<com.google.android.gms.internal.hj.a>> g;
    private final di<String, b> h;
    private final Set<e> i;
    private final e j;
    private final Map<String, c> k;
    private volatile String l;
    private int m;

    interface a {
        void a(e eVar, Set<com.google.android.gms.internal.en.a> set, Set<com.google.android.gms.internal.en.a> set2, cb cbVar);
    }

    private static class b {
        private bn<com.google.android.gms.internal.hj.a> a;
        private com.google.android.gms.internal.hj.a b;

        public b(bn<com.google.android.gms.internal.hj.a> bnVar, com.google.android.gms.internal.hj.a aVar) {
            this.a = bnVar;
            this.b = aVar;
        }

        public bn<com.google.android.gms.internal.hj.a> a() {
            return this.a;
        }

        public com.google.android.gms.internal.hj.a b() {
            return this.b;
        }

        public int c() {
            return (this.b == null ? 0 : this.b.f()) + ((com.google.android.gms.internal.hj.a) this.a.a()).f();
        }
    }

    private static class c {
        private final Set<e> a = new HashSet();
        private final Map<e, List<com.google.android.gms.internal.en.a>> b = new HashMap();
        private final Map<e, List<com.google.android.gms.internal.en.a>> c = new HashMap();
        private final Map<e, List<String>> d = new HashMap();
        private final Map<e, List<String>> e = new HashMap();
        private com.google.android.gms.internal.en.a f;

        public Set<e> a() {
            return this.a;
        }

        public void a(com.google.android.gms.internal.en.a aVar) {
            this.f = aVar;
        }

        public void a(e eVar) {
            this.a.add(eVar);
        }

        public void a(e eVar, com.google.android.gms.internal.en.a aVar) {
            List list = (List) this.b.get(eVar);
            if (list == null) {
                list = new ArrayList();
                this.b.put(eVar, list);
            }
            list.add(aVar);
        }

        public void a(e eVar, String str) {
            List list = (List) this.d.get(eVar);
            if (list == null) {
                list = new ArrayList();
                this.d.put(eVar, list);
            }
            list.add(str);
        }

        public Map<e, List<com.google.android.gms.internal.en.a>> b() {
            return this.b;
        }

        public void b(e eVar, com.google.android.gms.internal.en.a aVar) {
            List list = (List) this.c.get(eVar);
            if (list == null) {
                list = new ArrayList();
                this.c.put(eVar, list);
            }
            list.add(aVar);
        }

        public void b(e eVar, String str) {
            List list = (List) this.e.get(eVar);
            if (list == null) {
                list = new ArrayList();
                this.e.put(eVar, list);
            }
            list.add(str);
        }

        public Map<e, List<String>> c() {
            return this.d;
        }

        public Map<e, List<String>> d() {
            return this.e;
        }

        public Map<e, List<com.google.android.gms.internal.en.a>> e() {
            return this.c;
        }

        public com.google.android.gms.internal.en.a f() {
            return this.f;
        }
    }

    public cg(Context context, com.google.android.gms.internal.en.c cVar, e eVar, com.google.android.gms.tagmanager.dr.a aVar, com.google.android.gms.tagmanager.dr.a aVar2, q qVar) {
        if (cVar == null) {
            throw new NullPointerException("resource cannot be null");
        }
        this.b = cVar;
        this.i = new HashSet(cVar.b());
        this.j = eVar;
        this.c = qVar;
        this.g = new dj().a(1048576, new com.google.android.gms.tagmanager.dj.a<com.google.android.gms.internal.en.a, bn<com.google.android.gms.internal.hj.a>>(this) {
            final /* synthetic */ cg a;

            {
                this.a = r1;
            }

            public int a(com.google.android.gms.internal.en.a aVar, bn<com.google.android.gms.internal.hj.a> bnVar) {
                return ((com.google.android.gms.internal.hj.a) bnVar.a()).f();
            }

            public /* synthetic */ int a(Object obj, Object obj2) {
                return a((com.google.android.gms.internal.en.a) obj, (bn) obj2);
            }
        });
        this.h = new dj().a(1048576, new com.google.android.gms.tagmanager.dj.a<String, b>(this) {
            final /* synthetic */ cg a;

            {
                this.a = r1;
            }

            public /* synthetic */ int a(Object obj, Object obj2) {
                return a((String) obj, (b) obj2);
            }

            public int a(String str, b bVar) {
                return str.length() + bVar.c();
            }
        });
        this.d = new HashMap();
        b(new dg(context));
        b(new dr(aVar2));
        b(new dv(eVar));
        b(new cx(context, eVar));
        this.e = new HashMap();
        c(new dp());
        c(new n());
        c(new o());
        c(new v());
        c(new w());
        c(new as());
        c(new at());
        c(new bw());
        c(new cq());
        this.f = new HashMap();
        a(new ah(context));
        a(new bi(context));
        a(new db(context));
        a(new dc(context));
        a(new dd(context));
        a(new de(context));
        a(new df(context));
        a(new dk());
        a(new do(this.b.c()));
        a(new dr(aVar));
        a(new dt(eVar));
        a(new i(context));
        a(new j());
        a(new m());
        a(new r(this));
        a(new x());
        a(new y());
        a(new am(context));
        a(new ao());
        a(new ar());
        a(new ay());
        a(new ba(context));
        a(new bo());
        a(new bq());
        a(new bt());
        a(new bv());
        a(new bx(context));
        a(new ch());
        a(new ci());
        a(new cs());
        a(new cy());
        this.k = new HashMap();
        for (e eVar2 : this.i) {
            if (qVar.a()) {
                a(eVar2.f(), eVar2.g(), "add macro");
                a(eVar2.k(), eVar2.h(), "remove macro");
                a(eVar2.d(), eVar2.i(), "add tag");
                a(eVar2.e(), eVar2.j(), "remove tag");
            }
            int i = 0;
            while (i < eVar2.f().size()) {
                com.google.android.gms.internal.en.a aVar3 = (com.google.android.gms.internal.en.a) eVar2.f().get(i);
                String str = "Unknown";
                if (qVar.a() && i < eVar2.g().size()) {
                    str = (String) eVar2.g().get(i);
                }
                c a = a(this.k, a(aVar3));
                a.a(eVar2);
                a.a(eVar2, aVar3);
                a.a(eVar2, str);
                i++;
            }
            i = 0;
            while (i < eVar2.k().size()) {
                aVar3 = (com.google.android.gms.internal.en.a) eVar2.k().get(i);
                str = "Unknown";
                if (qVar.a() && i < eVar2.h().size()) {
                    str = (String) eVar2.h().get(i);
                }
                a = a(this.k, a(aVar3));
                a.a(eVar2);
                a.b(eVar2, aVar3);
                a.b(eVar2, str);
                i++;
            }
        }
        for (Entry entry : this.b.d().entrySet()) {
            for (com.google.android.gms.internal.en.a aVar32 : (List) entry.getValue()) {
                if (!cw.e((com.google.android.gms.internal.hj.a) aVar32.b().get(fh.NOT_DEFAULT_MACRO.toString())).booleanValue()) {
                    a(this.k, (String) entry.getKey()).a(aVar32);
                }
            }
        }
    }

    private bn<com.google.android.gms.internal.hj.a> a(com.google.android.gms.internal.hj.a aVar, Set<String> set, cz czVar) {
        if (!aVar.l) {
            return new bn(aVar, true);
        }
        com.google.android.gms.internal.hj.a a;
        int i;
        bn a2;
        String str;
        String valueOf;
        switch (aVar.a) {
            case 2:
                a = en.a(aVar);
                a.c = new com.google.android.gms.internal.hj.a[aVar.c.length];
                for (i = 0; i < aVar.c.length; i++) {
                    a2 = a(aVar.c[i], (Set) set, czVar.a(i));
                    if (a2 == a) {
                        return a;
                    }
                    a.c[i] = (com.google.android.gms.internal.hj.a) a2.a();
                }
                return new bn(a, false);
            case 3:
                a = en.a(aVar);
                if (aVar.d.length != aVar.e.length) {
                    str = "Invalid serving value: ";
                    valueOf = String.valueOf(aVar.toString());
                    aw.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return a;
                }
                a.d = new com.google.android.gms.internal.hj.a[aVar.d.length];
                a.e = new com.google.android.gms.internal.hj.a[aVar.d.length];
                for (i = 0; i < aVar.d.length; i++) {
                    a2 = a(aVar.d[i], (Set) set, czVar.b(i));
                    bn a3 = a(aVar.e[i], (Set) set, czVar.c(i));
                    if (a2 == a || a3 == a) {
                        return a;
                    }
                    a.d[i] = (com.google.android.gms.internal.hj.a) a2.a();
                    a.e[i] = (com.google.android.gms.internal.hj.a) a3.a();
                }
                return new bn(a, false);
            case 4:
                if (set.contains(aVar.f)) {
                    valueOf = String.valueOf(aVar.f);
                    str = String.valueOf(set.toString());
                    aw.a(new StringBuilder((String.valueOf(valueOf).length() + 79) + String.valueOf(str).length()).append("Macro cycle detected.  Current macro reference: ").append(valueOf).append(".  Previous macro references: ").append(str).append(".").toString());
                    return a;
                }
                set.add(aVar.f);
                bn<com.google.android.gms.internal.hj.a> a4 = da.a(a(aVar.f, (Set) set, czVar.a()), aVar.k);
                set.remove(aVar.f);
                return a4;
            case 7:
                a = en.a(aVar);
                a.j = new com.google.android.gms.internal.hj.a[aVar.j.length];
                for (i = 0; i < aVar.j.length; i++) {
                    a2 = a(aVar.j[i], (Set) set, czVar.d(i));
                    if (a2 == a) {
                        return a;
                    }
                    a.j[i] = (com.google.android.gms.internal.hj.a) a2.a();
                }
                return new bn(a, false);
            default:
                aw.a("Unknown type: " + aVar.a);
                return a;
        }
    }

    private bn<com.google.android.gms.internal.hj.a> a(String str, Set<String> set, az azVar) {
        this.m++;
        b bVar = (b) this.h.a(str);
        if (bVar == null || this.c.a()) {
            c cVar = (c) this.k.get(str);
            String valueOf;
            if (cVar == null) {
                valueOf = String.valueOf(b());
                aw.a(new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(str).length()).append(valueOf).append("Invalid macro: ").append(str).toString());
                this.m--;
                return a;
            }
            com.google.android.gms.internal.en.a f;
            bn a = a(str, cVar.a(), cVar.b(), cVar.c(), cVar.e(), cVar.d(), set, azVar.b());
            if (((Set) a.a()).isEmpty()) {
                f = cVar.f();
            } else {
                if (((Set) a.a()).size() > 1) {
                    valueOf = String.valueOf(b());
                    aw.b(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(str).length()).append(valueOf).append("Multiple macros active for macroName ").append(str).toString());
                }
                f = (com.google.android.gms.internal.en.a) ((Set) a.a()).iterator().next();
            }
            if (f == null) {
                this.m--;
                return a;
            }
            bn a2 = a(this.f, f, (Set) set, azVar.a());
            boolean z = a.b() && a2.b();
            bn<com.google.android.gms.internal.hj.a> bnVar = a2 == a ? a : new bn((com.google.android.gms.internal.hj.a) a2.a(), z);
            com.google.android.gms.internal.hj.a c = f.c();
            if (bnVar.b()) {
                this.h.a(str, new b(bnVar, c));
            }
            a(c, (Set) set);
            this.m--;
            return bnVar;
        }
        a(bVar.b(), (Set) set);
        this.m--;
        return bVar.a();
    }

    private bn<com.google.android.gms.internal.hj.a> a(Map<String, t> map, com.google.android.gms.internal.en.a aVar, Set<String> set, by byVar) {
        boolean z = true;
        com.google.android.gms.internal.hj.a aVar2 = (com.google.android.gms.internal.hj.a) aVar.b().get(fh.FUNCTION.toString());
        if (aVar2 == null) {
            aw.a("No function id in properties");
            return a;
        }
        String str = aVar2.g;
        t tVar = (t) map.get(str);
        if (tVar == null) {
            aw.a(String.valueOf(str).concat(" has no backing implementation."));
            return a;
        }
        bn<com.google.android.gms.internal.hj.a> bnVar = (bn) this.g.a(aVar);
        if (bnVar != null && !this.c.a()) {
            return bnVar;
        }
        Map hashMap = new HashMap();
        boolean z2 = true;
        for (Entry entry : aVar.b().entrySet()) {
            bn a = a((com.google.android.gms.internal.hj.a) entry.getValue(), (Set) set, byVar.a((String) entry.getKey()).a((com.google.android.gms.internal.hj.a) entry.getValue()));
            if (a == a) {
                return a;
            }
            boolean z3;
            if (a.b()) {
                aVar.a((String) entry.getKey(), (com.google.android.gms.internal.hj.a) a.a());
                z3 = z2;
            } else {
                z3 = false;
            }
            hashMap.put((String) entry.getKey(), (com.google.android.gms.internal.hj.a) a.a());
            z2 = z3;
        }
        if (tVar.a(hashMap.keySet())) {
            if (!(z2 && tVar.a())) {
                z = false;
            }
            bnVar = new bn(tVar.a(hashMap), z);
            if (z) {
                this.g.a(aVar, bnVar);
            }
            byVar.a((com.google.android.gms.internal.hj.a) bnVar.a());
            return bnVar;
        }
        String valueOf = String.valueOf(tVar.c());
        String valueOf2 = String.valueOf(hashMap.keySet());
        aw.a(new StringBuilder(((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("Incorrect keys for function ").append(str).append(" required ").append(valueOf).append(" had ").append(valueOf2).toString());
        return a;
    }

    private bn<Set<com.google.android.gms.internal.en.a>> a(Set<e> set, Set<String> set2, a aVar, cf cfVar) {
        Set hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        boolean z = true;
        for (e eVar : set) {
            cb a = cfVar.a();
            bn a2 = a(eVar, (Set) set2, a);
            if (((Boolean) a2.a()).booleanValue()) {
                aVar.a(eVar, hashSet, hashSet2, a);
            }
            boolean z2 = z && a2.b();
            z = z2;
        }
        hashSet.removeAll(hashSet2);
        cfVar.a(hashSet);
        return new bn(hashSet, z);
    }

    private static c a(Map<String, c> map, String str) {
        c cVar = (c) map.get(str);
        if (cVar != null) {
            return cVar;
        }
        cVar = new c();
        map.put(str, cVar);
        return cVar;
    }

    private static String a(com.google.android.gms.internal.en.a aVar) {
        return cw.a((com.google.android.gms.internal.hj.a) aVar.b().get(fh.INSTANCE_NAME.toString()));
    }

    private void a(com.google.android.gms.internal.hj.a aVar, Set<String> set) {
        if (aVar != null) {
            bn a = a(aVar, (Set) set, new bl());
            if (a != a) {
                Object f = cw.f((com.google.android.gms.internal.hj.a) a.a());
                if (f instanceof Map) {
                    this.j.a((Map) f);
                } else if (f instanceof List) {
                    for (Object f2 : (List) f2) {
                        if (f2 instanceof Map) {
                            this.j.a((Map) f2);
                        } else {
                            aw.b("pushAfterEvaluate: value not a Map");
                        }
                    }
                } else {
                    aw.b("pushAfterEvaluate: value not a Map or List");
                }
            }
        }
    }

    private static void a(List<com.google.android.gms.internal.en.a> list, List<String> list2, String str) {
        if (list.size() != list2.size()) {
            aw.c(new StringBuilder(String.valueOf(str).length() + 102).append("Invalid resource: imbalance of rule names of functions for ").append(str).append(" operation. Using default rule name instead").toString());
        }
    }

    private static void a(Map<String, t> map, t tVar) {
        if (map.containsKey(tVar.b())) {
            String str = "Duplicate function type name: ";
            String valueOf = String.valueOf(tVar.b());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        map.put(tVar.b(), tVar);
    }

    private String b() {
        if (this.m <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.m));
        for (int i = 2; i < this.m; i++) {
            stringBuilder.append(l.c);
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    bn<Boolean> a(com.google.android.gms.internal.en.a aVar, Set<String> set, by byVar) {
        bn a = a(this.e, aVar, (Set) set, byVar);
        Object e = cw.e((com.google.android.gms.internal.hj.a) a.a());
        byVar.a(cw.f(e));
        return new bn(e, a.b());
    }

    bn<Boolean> a(e eVar, Set<String> set, cb cbVar) {
        boolean z = true;
        for (com.google.android.gms.internal.en.a a : eVar.c()) {
            bn a2 = a(a, (Set) set, cbVar.a());
            if (((Boolean) a2.a()).booleanValue()) {
                cbVar.a(cw.f(Boolean.valueOf(false)));
                return new bn(Boolean.valueOf(false), a2.b());
            }
            boolean z2 = z && a2.b();
            z = z2;
        }
        for (com.google.android.gms.internal.en.a a3 : eVar.b()) {
            a2 = a(a3, (Set) set, cbVar.b());
            if (((Boolean) a2.a()).booleanValue()) {
                z = z && a2.b();
            } else {
                cbVar.a(cw.f(Boolean.valueOf(false)));
                return new bn(Boolean.valueOf(false), a2.b());
            }
        }
        cbVar.a(cw.f(Boolean.valueOf(true)));
        return new bn(Boolean.valueOf(true), z);
    }

    bn<Set<com.google.android.gms.internal.en.a>> a(String str, Set<e> set, Map<e, List<com.google.android.gms.internal.en.a>> map, Map<e, List<String>> map2, Map<e, List<com.google.android.gms.internal.en.a>> map3, Map<e, List<String>> map4, Set<String> set2, cf cfVar) {
        final Map<e, List<com.google.android.gms.internal.en.a>> map5 = map;
        final Map<e, List<String>> map6 = map2;
        final Map<e, List<com.google.android.gms.internal.en.a>> map7 = map3;
        final Map<e, List<String>> map8 = map4;
        return a((Set) set, (Set) set2, new a(this) {
            final /* synthetic */ cg e;

            public void a(e eVar, Set<com.google.android.gms.internal.en.a> set, Set<com.google.android.gms.internal.en.a> set2, cb cbVar) {
                List list = (List) map5.get(eVar);
                List list2 = (List) map6.get(eVar);
                if (list != null) {
                    set.addAll(list);
                    cbVar.c().a(list, list2);
                }
                list = (List) map7.get(eVar);
                list2 = (List) map8.get(eVar);
                if (list != null) {
                    set2.addAll(list);
                    cbVar.d().a(list, list2);
                }
            }
        }, cfVar);
    }

    bn<Set<com.google.android.gms.internal.en.a>> a(Set<e> set, cf cfVar) {
        return a((Set) set, new HashSet(), new a(this) {
            final /* synthetic */ cg a;

            {
                this.a = r1;
            }

            public void a(e eVar, Set<com.google.android.gms.internal.en.a> set, Set<com.google.android.gms.internal.en.a> set2, cb cbVar) {
                set.addAll(eVar.d());
                set2.addAll(eVar.e());
                cbVar.e().a(eVar.d(), eVar.i());
                cbVar.f().a(eVar.e(), eVar.j());
            }
        }, cfVar);
    }

    synchronized String a() {
        return this.l;
    }

    void a(t tVar) {
        a(this.f, tVar);
    }

    public synchronized void a(String str) {
        c(str);
        p b = this.c.b(str);
        ds b2 = b.b();
        for (com.google.android.gms.internal.en.a a : (Set) a(this.i, b2.b()).a()) {
            a(this.d, a, new HashSet(), b2.a());
        }
        b.c();
        c(null);
    }

    public synchronized void a(List<i> list) {
        for (i iVar : list) {
            if (iVar.a == null || !iVar.a.startsWith("gaExperiment:")) {
                String valueOf = String.valueOf(iVar);
                aw.e(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Ignored supplemental: ").append(valueOf).toString());
            } else {
                s.a(this.j, iVar);
            }
        }
    }

    public bn<com.google.android.gms.internal.hj.a> b(String str) {
        this.m = 0;
        p a = this.c.a(str);
        bn<com.google.android.gms.internal.hj.a> a2 = a(str, new HashSet(), a.a());
        a.c();
        return a2;
    }

    void b(t tVar) {
        a(this.d, tVar);
    }

    void c(t tVar) {
        a(this.e, tVar);
    }

    synchronized void c(String str) {
        this.l = str;
    }
}
