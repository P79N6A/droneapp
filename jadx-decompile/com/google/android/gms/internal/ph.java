package com.google.android.gms.internal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ph implements ok {
    private final os a;
    private final boolean b;

    private final class a<K, V> extends oj<Map<K, V>> {
        final /* synthetic */ ph a;
        private final oj<K> b;
        private final oj<V> c;
        private final ox<? extends Map<K, V>> d;

        public a(ph phVar, nr nrVar, Type type, oj<K> ojVar, Type type2, oj<V> ojVar2, ox<? extends Map<K, V>> oxVar) {
            this.a = phVar;
            this.b = new pm(nrVar, ojVar, type);
            this.c = new pm(nrVar, ojVar2, type2);
            this.d = oxVar;
        }

        private String a(nx nxVar) {
            if (nxVar.j()) {
                od n = nxVar.n();
                if (n.p()) {
                    return String.valueOf(n.b());
                }
                if (n.a()) {
                    return Boolean.toString(n.g());
                }
                if (n.q()) {
                    return n.c();
                }
                throw new AssertionError();
            } else if (nxVar.k()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        public Map<K, V> a(pp ppVar) {
            pq f = ppVar.f();
            if (f == pq.NULL) {
                ppVar.j();
                return null;
            }
            Map<K, V> map = (Map) this.d.a();
            Object b;
            if (f == pq.BEGIN_ARRAY) {
                ppVar.a();
                while (ppVar.e()) {
                    ppVar.a();
                    b = this.b.b(ppVar);
                    if (map.put(b, this.c.b(ppVar)) != null) {
                        String valueOf = String.valueOf(b);
                        throw new og(new StringBuilder(String.valueOf(valueOf).length() + 15).append("duplicate key: ").append(valueOf).toString());
                    }
                    ppVar.b();
                }
                ppVar.b();
                return map;
            }
            ppVar.c();
            while (ppVar.e()) {
                ou.a.a(ppVar);
                b = this.b.b(ppVar);
                if (map.put(b, this.c.b(ppVar)) != null) {
                    valueOf = String.valueOf(b);
                    throw new og(new StringBuilder(String.valueOf(valueOf).length() + 15).append("duplicate key: ").append(valueOf).toString());
                }
            }
            ppVar.d();
            return map;
        }

        public void a(ps psVar, Map<K, V> map) {
            int i = 0;
            if (map == null) {
                psVar.f();
            } else if (this.a.b) {
                List arrayList = new ArrayList(map.size());
                List arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                for (Entry entry : map.entrySet()) {
                    nx a = this.b.a(entry.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry.getValue());
                    int i3 = (a.h() || a.i()) ? 1 : 0;
                    i2 = i3 | i2;
                }
                if (i2 != 0) {
                    psVar.b();
                    while (i < arrayList.size()) {
                        psVar.b();
                        oz.a((nx) arrayList.get(i), psVar);
                        this.c.a(psVar, arrayList2.get(i));
                        psVar.c();
                        i++;
                    }
                    psVar.c();
                    return;
                }
                psVar.d();
                while (i < arrayList.size()) {
                    psVar.a(a((nx) arrayList.get(i)));
                    this.c.a(psVar, arrayList2.get(i));
                    i++;
                }
                psVar.e();
            } else {
                psVar.d();
                for (Entry entry2 : map.entrySet()) {
                    psVar.a(String.valueOf(entry2.getKey()));
                    this.c.a(psVar, entry2.getValue());
                }
                psVar.e();
            }
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    }

    public ph(os osVar, boolean z) {
        this.a = osVar;
        this.b = z;
    }

    private oj<?> a(nr nrVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? pn.f : nrVar.a(po.a(type));
    }

    public <T> oj<T> a(nr nrVar, po<T> poVar) {
        Type b = poVar.b();
        if (!Map.class.isAssignableFrom(poVar.a())) {
            return null;
        }
        Type[] b2 = or.b(b, or.e(b));
        oj a = a(nrVar, b2[0]);
        oj a2 = nrVar.a(po.a(b2[1]));
        ox a3 = this.a.a((po) poVar);
        return new a(this, nrVar, b2[0], a, b2[1], a2, a3);
    }
}
