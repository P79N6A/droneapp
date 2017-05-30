package com.google.android.gms.internal;

import com.google.android.gms.internal.is.b;
import com.google.android.gms.internal.kw.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class iq {

    class AnonymousClass1 implements b {
        final /* synthetic */ is a;
        final /* synthetic */ Map b;

        AnonymousClass1(is isVar, Map map) {
            this.a = isVar;
            this.b = map;
        }

        public void a(ij ijVar, lh lhVar) {
            this.a.a(ijVar, iq.a(lhVar, this.b));
        }
    }

    class AnonymousClass2 extends a {
        final /* synthetic */ Map a;
        final /* synthetic */ ir b;

        AnonymousClass2(Map map, ir irVar) {
            this.a = map;
            this.b = irVar;
        }

        public void a(kv kvVar, lh lhVar) {
            lh a = iq.a(lhVar, this.a);
            if (a != lhVar) {
                this.b.a(new ij(kvVar.e()), a);
            }
        }
    }

    public static ia a(ia iaVar, Map<String, Object> map) {
        ia a = ia.a();
        Iterator it = iaVar.iterator();
        ia iaVar2 = a;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            iaVar2 = iaVar2.a((ij) entry.getKey(), a((lh) entry.getValue(), (Map) map));
        }
        return iaVar2;
    }

    public static is a(is isVar, Map<String, Object> map) {
        is isVar2 = new is();
        isVar.a(new ij(""), new AnonymousClass1(isVar2, map));
        return isVar2;
    }

    public static lh a(lh lhVar, Map<String, Object> map) {
        Object a = lhVar.f().a();
        if (a instanceof Map) {
            Map map2 = (Map) a;
            if (map2.containsKey(".sv")) {
                a = map.get((String) map2.get(".sv"));
            }
        }
        lh a2 = ll.a(a);
        if (lhVar.e()) {
            a = a(lhVar.a(), (Map) map);
            return (a.equals(lhVar.a()) && a2.equals(lhVar.f())) ? lhVar : li.a(a, a2);
        } else if (lhVar.b()) {
            return lhVar;
        } else {
            kw kwVar = (kw) lhVar;
            ir irVar = new ir(kwVar);
            kwVar.a(new AnonymousClass2(map, irVar));
            return !irVar.a().f().equals(a2) ? irVar.a().b(a2) : irVar.a();
        }
    }

    public static Object a(Object obj, Map<String, Object> map) {
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map2 = (Map) obj;
        if (!map2.containsKey(".sv")) {
            return obj;
        }
        String str = (String) map2.get(".sv");
        return map.containsKey(str) ? map.get(str) : obj;
    }

    public static Map<String, Object> a(mc mcVar) {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(mcVar.a()));
        return hashMap;
    }
}
