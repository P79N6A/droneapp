package com.google.android.gms.internal;

import com.google.android.gms.internal.gi.h;
import com.google.android.gms.tagmanager.aw;
import com.google.android.gms.tagmanager.cw;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class en {

    public static class a {
        private final Map<String, com.google.android.gms.internal.hj.a> a;
        private final com.google.android.gms.internal.hj.a b;

        private a(Map<String, com.google.android.gms.internal.hj.a> map, com.google.android.gms.internal.hj.a aVar) {
            this.a = map;
            this.b = aVar;
        }

        public static b a() {
            return new b();
        }

        public void a(String str, com.google.android.gms.internal.hj.a aVar) {
            this.a.put(str, aVar);
        }

        public Map<String, com.google.android.gms.internal.hj.a> b() {
            return Collections.unmodifiableMap(this.a);
        }

        public com.google.android.gms.internal.hj.a c() {
            return this.b;
        }

        public String toString() {
            String valueOf = String.valueOf(b());
            String valueOf2 = String.valueOf(this.b);
            return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("Properties: ").append(valueOf).append(" pushAfterEvaluate: ").append(valueOf2).toString();
        }
    }

    public static class b {
        private final Map<String, com.google.android.gms.internal.hj.a> a;
        private com.google.android.gms.internal.hj.a b;

        private b() {
            this.a = new HashMap();
        }

        public a a() {
            return new a(this.a, this.b);
        }

        public b a(com.google.android.gms.internal.hj.a aVar) {
            this.b = aVar;
            return this;
        }

        public b a(String str, com.google.android.gms.internal.hj.a aVar) {
            this.a.put(str, aVar);
            return this;
        }
    }

    public static class c {
        private final List<e> a;
        private final Map<String, List<a>> b;
        private final String c;
        private final int d;

        private c(List<e> list, Map<String, List<a>> map, String str, int i) {
            this.a = Collections.unmodifiableList(list);
            this.b = Collections.unmodifiableMap(map);
            this.c = str;
            this.d = i;
        }

        public static d a() {
            return new d();
        }

        public List<e> b() {
            return this.a;
        }

        public String c() {
            return this.c;
        }

        public Map<String, List<a>> d() {
            return this.b;
        }

        public String toString() {
            String valueOf = String.valueOf(b());
            String valueOf2 = String.valueOf(this.b);
            return new StringBuilder((String.valueOf(valueOf).length() + 17) + String.valueOf(valueOf2).length()).append("Rules: ").append(valueOf).append("  Macros: ").append(valueOf2).toString();
        }
    }

    public static class d {
        private final List<e> a;
        private final Map<String, List<a>> b;
        private String c;
        private int d;

        private d() {
            this.a = new ArrayList();
            this.b = new HashMap();
            this.c = "";
            this.d = 0;
        }

        public c a() {
            return new c(this.a, this.b, this.c, this.d);
        }

        public d a(int i) {
            this.d = i;
            return this;
        }

        public d a(a aVar) {
            String a = cw.a((com.google.android.gms.internal.hj.a) aVar.b().get(fh.INSTANCE_NAME.toString()));
            List list = (List) this.b.get(a);
            if (list == null) {
                list = new ArrayList();
                this.b.put(a, list);
            }
            list.add(aVar);
            return this;
        }

        public d a(e eVar) {
            this.a.add(eVar);
            return this;
        }

        public d a(String str) {
            this.c = str;
            return this;
        }
    }

    public static class e {
        private final List<a> a;
        private final List<a> b;
        private final List<a> c;
        private final List<a> d;
        private final List<a> e;
        private final List<a> f;
        private final List<String> g;
        private final List<String> h;
        private final List<String> i;
        private final List<String> j;

        private e(List<a> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, List<String> list7, List<String> list8, List<String> list9, List<String> list10) {
            this.a = Collections.unmodifiableList(list);
            this.b = Collections.unmodifiableList(list2);
            this.c = Collections.unmodifiableList(list3);
            this.d = Collections.unmodifiableList(list4);
            this.e = Collections.unmodifiableList(list5);
            this.f = Collections.unmodifiableList(list6);
            this.g = Collections.unmodifiableList(list7);
            this.h = Collections.unmodifiableList(list8);
            this.i = Collections.unmodifiableList(list9);
            this.j = Collections.unmodifiableList(list10);
        }

        public static f a() {
            return new f();
        }

        public List<a> b() {
            return this.a;
        }

        public List<a> c() {
            return this.b;
        }

        public List<a> d() {
            return this.c;
        }

        public List<a> e() {
            return this.d;
        }

        public List<a> f() {
            return this.e;
        }

        public List<String> g() {
            return this.g;
        }

        public List<String> h() {
            return this.h;
        }

        public List<String> i() {
            return this.i;
        }

        public List<String> j() {
            return this.j;
        }

        public List<a> k() {
            return this.f;
        }

        public String toString() {
            String valueOf = String.valueOf(b());
            String valueOf2 = String.valueOf(c());
            String valueOf3 = String.valueOf(d());
            String valueOf4 = String.valueOf(e());
            String valueOf5 = String.valueOf(f());
            String valueOf6 = String.valueOf(k());
            return new StringBuilder((((((String.valueOf(valueOf).length() + 102) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("Positive predicates: ").append(valueOf).append("  Negative predicates: ").append(valueOf2).append("  Add tags: ").append(valueOf3).append("  Remove tags: ").append(valueOf4).append("  Add macros: ").append(valueOf5).append("  Remove macros: ").append(valueOf6).toString();
        }
    }

    public static class f {
        private final List<a> a;
        private final List<a> b;
        private final List<a> c;
        private final List<a> d;
        private final List<a> e;
        private final List<a> f;
        private final List<String> g;
        private final List<String> h;
        private final List<String> i;
        private final List<String> j;

        private f() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.g = new ArrayList();
            this.h = new ArrayList();
            this.i = new ArrayList();
            this.j = new ArrayList();
        }

        public e a() {
            return new e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public f a(a aVar) {
            this.a.add(aVar);
            return this;
        }

        public f a(String str) {
            this.i.add(str);
            return this;
        }

        public f b(a aVar) {
            this.b.add(aVar);
            return this;
        }

        public f b(String str) {
            this.j.add(str);
            return this;
        }

        public f c(a aVar) {
            this.c.add(aVar);
            return this;
        }

        public f c(String str) {
            this.g.add(str);
            return this;
        }

        public f d(a aVar) {
            this.d.add(aVar);
            return this;
        }

        public f d(String str) {
            this.h.add(str);
            return this;
        }

        public f e(a aVar) {
            this.e.add(aVar);
            return this;
        }

        public f f(a aVar) {
            this.f.add(aVar);
            return this;
        }
    }

    public static class g extends Exception {
        public g(String str) {
            super(str);
        }
    }

    private static a a(com.google.android.gms.internal.gi.b bVar, com.google.android.gms.internal.gi.f fVar, com.google.android.gms.internal.hj.a[] aVarArr, int i) {
        b a = a.a();
        for (int valueOf : bVar.a) {
            com.google.android.gms.internal.gi.e eVar = (com.google.android.gms.internal.gi.e) a(fVar.d, Integer.valueOf(valueOf).intValue(), "properties");
            String str = (String) a(fVar.b, eVar.a, "keys");
            com.google.android.gms.internal.hj.a aVar = (com.google.android.gms.internal.hj.a) a(aVarArr, eVar.b, "values");
            if (fh.PUSH_AFTER_EVALUATE.toString().equals(str)) {
                a.a(aVar);
            } else {
                a.a(str, aVar);
            }
        }
        return a.a();
    }

    public static c a(com.google.android.gms.internal.gi.f fVar) {
        int i;
        int i2 = 0;
        com.google.android.gms.internal.hj.a[] aVarArr = new com.google.android.gms.internal.hj.a[fVar.c.length];
        for (i = 0; i < fVar.c.length; i++) {
            a(i, fVar, aVarArr, new HashSet(0));
        }
        d a = c.a();
        List arrayList = new ArrayList();
        for (i = 0; i < fVar.f.length; i++) {
            arrayList.add(a(fVar.f[i], fVar, aVarArr, i));
        }
        List arrayList2 = new ArrayList();
        for (i = 0; i < fVar.g.length; i++) {
            arrayList2.add(a(fVar.g[i], fVar, aVarArr, i));
        }
        List arrayList3 = new ArrayList();
        for (i = 0; i < fVar.e.length; i++) {
            a a2 = a(fVar.e[i], fVar, aVarArr, i);
            a.a(a2);
            arrayList3.add(a2);
        }
        com.google.android.gms.internal.gi.g[] gVarArr = fVar.h;
        int length = gVarArr.length;
        while (i2 < length) {
            a.a(a(gVarArr[i2], arrayList, arrayList3, arrayList2, fVar));
            i2++;
        }
        a.a(fVar.l);
        a.a(fVar.q);
        return a.a();
    }

    private static e a(com.google.android.gms.internal.gi.g gVar, List<a> list, List<a> list2, List<a> list3, com.google.android.gms.internal.gi.f fVar) {
        f a = e.a();
        for (int valueOf : gVar.a) {
            a.a((a) list3.get(Integer.valueOf(valueOf).intValue()));
        }
        for (int valueOf2 : gVar.b) {
            a.b((a) list3.get(Integer.valueOf(valueOf2).intValue()));
        }
        for (int valueOf22 : gVar.c) {
            a.c((a) list.get(Integer.valueOf(valueOf22).intValue()));
        }
        for (int valueOf3 : gVar.e) {
            a.a(fVar.c[Integer.valueOf(valueOf3).intValue()].b);
        }
        for (int valueOf222 : gVar.d) {
            a.d((a) list.get(Integer.valueOf(valueOf222).intValue()));
        }
        for (int valueOf32 : gVar.f) {
            a.b(fVar.c[Integer.valueOf(valueOf32).intValue()].b);
        }
        for (int valueOf2222 : gVar.g) {
            a.e((a) list2.get(Integer.valueOf(valueOf2222).intValue()));
        }
        for (int valueOf322 : gVar.i) {
            a.c(fVar.c[Integer.valueOf(valueOf322).intValue()].b);
        }
        for (int valueOf22222 : gVar.h) {
            a.f((a) list2.get(Integer.valueOf(valueOf22222).intValue()));
        }
        for (int valueOf4 : gVar.j) {
            a.d(fVar.c[Integer.valueOf(valueOf4).intValue()].b);
        }
        return a.a();
    }

    private static com.google.android.gms.internal.hj.a a(int i, com.google.android.gms.internal.gi.f fVar, com.google.android.gms.internal.hj.a[] aVarArr, Set<Integer> set) {
        int i2 = 0;
        if (set.contains(Integer.valueOf(i))) {
            String valueOf = String.valueOf(set);
            a(new StringBuilder(String.valueOf(valueOf).length() + 90).append("Value cycle detected.  Current value reference: ").append(i).append(".  Previous value references: ").append(valueOf).append(".").toString());
        }
        com.google.android.gms.internal.hj.a aVar = (com.google.android.gms.internal.hj.a) a(fVar.c, i, "values");
        if (aVarArr[i] != null) {
            return aVarArr[i];
        }
        com.google.android.gms.internal.hj.a aVar2 = null;
        set.add(Integer.valueOf(i));
        h b;
        int[] iArr;
        int length;
        int i3;
        int i4;
        switch (aVar.a) {
            case 1:
            case 5:
            case 6:
            case 8:
                aVar2 = aVar;
                break;
            case 2:
                b = b(aVar);
                aVar2 = a(aVar);
                aVar2.c = new com.google.android.gms.internal.hj.a[b.b.length];
                iArr = b.b;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    aVar2.c[i3] = a(iArr[i2], fVar, aVarArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
            case 3:
                aVar2 = a(aVar);
                h b2 = b(aVar);
                if (b2.c.length != b2.d.length) {
                    i3 = b2.c.length;
                    a("Uneven map keys (" + i3 + ") and map values (" + b2.d.length + ")");
                }
                aVar2.d = new com.google.android.gms.internal.hj.a[b2.c.length];
                aVar2.e = new com.google.android.gms.internal.hj.a[b2.c.length];
                int[] iArr2 = b2.c;
                int length2 = iArr2.length;
                i3 = 0;
                i4 = 0;
                while (i3 < length2) {
                    int i5 = i4 + 1;
                    aVar2.d[i4] = a(iArr2[i3], fVar, aVarArr, (Set) set);
                    i3++;
                    i4 = i5;
                }
                iArr = b2.d;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    aVar2.e[i3] = a(iArr[i2], fVar, aVarArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
            case 4:
                aVar2 = a(aVar);
                aVar2.f = cw.a(a(b(aVar).g, fVar, aVarArr, (Set) set));
                break;
            case 7:
                aVar2 = a(aVar);
                b = b(aVar);
                aVar2.j = new com.google.android.gms.internal.hj.a[b.f.length];
                iArr = b.f;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    aVar2.j[i3] = a(iArr[i2], fVar, aVarArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
        }
        if (aVar2 == null) {
            valueOf = String.valueOf(aVar);
            a(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Invalid value: ").append(valueOf).toString());
        }
        aVarArr[i] = aVar2;
        set.remove(Integer.valueOf(i));
        return aVar2;
    }

    public static com.google.android.gms.internal.hj.a a(com.google.android.gms.internal.hj.a aVar) {
        com.google.android.gms.internal.hj.a aVar2 = new com.google.android.gms.internal.hj.a();
        aVar2.a = aVar.a;
        aVar2.k = (int[]) aVar.k.clone();
        if (aVar.l) {
            aVar2.l = aVar.l;
        }
        return aVar2;
    }

    private static <T> T a(T[] tArr, int i, String str) {
        if (i < 0 || i >= tArr.length) {
            a(new StringBuilder(String.valueOf(str).length() + 45).append("Index out of bounds detected: ").append(i).append(" in ").append(str).toString());
        }
        return tArr[i];
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private static void a(String str) {
        aw.a(str);
        throw new g(str);
    }

    private static h b(com.google.android.gms.internal.hj.a aVar) {
        if (((h) aVar.a(h.a)) == null) {
            String valueOf = String.valueOf(aVar);
            a(new StringBuilder(String.valueOf(valueOf).length() + 54).append("Expected a ServingValue and didn't get one. Value is: ").append(valueOf).toString());
        }
        return (h) aVar.a(h.a);
    }
}
