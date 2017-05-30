package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class kw implements lh {
    public static Comparator<kv> a = new Comparator<kv>() {
        public int a(kv kvVar, kv kvVar2) {
            return kvVar.a(kvVar2);
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((kv) obj, (kv) obj2);
        }
    };
    static final /* synthetic */ boolean b = (!kw.class.desiredAssertionStatus());
    private final gz<kv, lh> c;
    private final lh e;
    private String f;

    public static abstract class a extends com.google.android.gms.internal.he.b<kv, lh> {
        public abstract void a(kv kvVar, lh lhVar);

        public /* synthetic */ void a(Object obj, Object obj2) {
            b((kv) obj, (lh) obj2);
        }

        public void b(kv kvVar, lh lhVar) {
            a(kvVar, lhVar);
        }
    }

    private static class b implements Iterator<lg> {
        private final Iterator<Entry<kv, lh>> a;

        public b(Iterator<Entry<kv, lh>> it) {
            this.a = it;
        }

        public lg a() {
            Entry entry = (Entry) this.a.next();
            return new lg((kv) entry.getKey(), (lh) entry.getValue());
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public /* synthetic */ Object next() {
            return a();
        }

        public void remove() {
            this.a.remove();
        }
    }

    protected kw() {
        this.f = null;
        this.c = com.google.android.gms.internal.gz.a.a(a);
        this.e = ll.a();
    }

    protected kw(gz<kv, lh> gzVar, lh lhVar) {
        this.f = null;
        if (!gzVar.d() || lhVar.b()) {
            this.e = lhVar;
            this.c = gzVar;
            return;
        }
        throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
    }

    private static void a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(" ");
        }
    }

    private void b(StringBuilder stringBuilder, int i) {
        if (this.c.d() && this.e.b()) {
            stringBuilder.append("{ }");
            return;
        }
        stringBuilder.append("{\n");
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            a(stringBuilder, i + 2);
            stringBuilder.append(((kv) entry.getKey()).e());
            stringBuilder.append("=");
            if (entry.getValue() instanceof kw) {
                ((kw) entry.getValue()).b(stringBuilder, i + 2);
            } else {
                stringBuilder.append(((lh) entry.getValue()).toString());
            }
            stringBuilder.append("\n");
        }
        if (!this.e.b()) {
            a(stringBuilder, i + 2);
            stringBuilder.append(".priority=");
            stringBuilder.append(this.e.toString());
            stringBuilder.append("\n");
        }
        a(stringBuilder, i);
        stringBuilder.append("}");
    }

    public int a(lh lhVar) {
        return b() ? lhVar.b() ? 0 : -1 : lhVar.e() ? 1 : lhVar.b() ? 1 : lhVar == lh.d ? -1 : 0;
    }

    public lh a(ij ijVar) {
        kv d = ijVar.d();
        return d == null ? this : c(d).a(ijVar.e());
    }

    public lh a(ij ijVar, lh lhVar) {
        kv d = ijVar.d();
        if (d == null) {
            return lhVar;
        }
        if (!d.f()) {
            return a(d, c(d).a(ijVar.e(), lhVar));
        }
        if (b || ll.a(lhVar)) {
            return b(lhVar);
        }
        throw new AssertionError();
    }

    public lh a(kv kvVar, lh lhVar) {
        if (kvVar.f()) {
            return b(lhVar);
        }
        gz gzVar = this.c;
        if (gzVar.a((Object) kvVar)) {
            gzVar = gzVar.c(kvVar);
        }
        if (!lhVar.b()) {
            gzVar = gzVar.a(kvVar, lhVar);
        }
        return gzVar.d() ? la.j() : new kw(gzVar, this.e);
    }

    public Object a() {
        return a(false);
    }

    public Object a(boolean z) {
        int i = 0;
        if (b()) {
            return null;
        }
        Map hashMap = new HashMap();
        Iterator it = this.c.iterator();
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            int i5;
            int i6;
            Entry entry = (Entry) it.next();
            String e = ((kv) entry.getKey()).e();
            hashMap.put(e, ((lh) entry.getValue()).a(z));
            i4++;
            if (i2 != 0) {
                if (e.length() <= 1 || e.charAt(0) != '0') {
                    Integer d = mk.d(e);
                    if (d == null || d.intValue() < 0) {
                        i5 = 0;
                        i6 = i3;
                        i2 = i5;
                        i3 = i6;
                    } else if (d.intValue() > i3) {
                        i3 = d.intValue();
                        i5 = i2;
                        i6 = i3;
                        i2 = i5;
                        i3 = i6;
                    }
                } else {
                    i5 = 0;
                    i6 = i3;
                    i2 = i5;
                    i3 = i6;
                }
            }
            i5 = i2;
            i6 = i3;
            i2 = i5;
            i3 = i6;
        }
        if (z || i2 == 0 || i3 >= i4 * 2) {
            if (z && !this.e.b()) {
                hashMap.put(".priority", this.e.a());
            }
            return hashMap;
        }
        List arrayList = new ArrayList(i3 + 1);
        while (i <= i3) {
            arrayList.add(hashMap.get(i));
            i++;
        }
        return arrayList;
    }

    public String a(com.google.android.gms.internal.lh.a aVar) {
        if (aVar != com.google.android.gms.internal.lh.a.V1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.e.b()) {
            stringBuilder.append("priority:");
            stringBuilder.append(this.e.a(com.google.android.gms.internal.lh.a.V1));
            stringBuilder.append(":");
        }
        List<lg> arrayList = new ArrayList();
        Iterator it = iterator();
        Object obj = null;
        while (it.hasNext()) {
            lg lgVar = (lg) it.next();
            arrayList.add(lgVar);
            Object obj2 = (obj == null && lgVar.d().f().b()) ? null : 1;
            obj = obj2;
        }
        if (obj != null) {
            Collections.sort(arrayList, lk.d());
        }
        for (lg lgVar2 : arrayList) {
            String d = lgVar2.d().d();
            if (!d.equals("")) {
                stringBuilder.append(":");
                stringBuilder.append(lgVar2.c().e());
                stringBuilder.append(":");
                stringBuilder.append(d);
            }
        }
        return stringBuilder.toString();
    }

    public void a(a aVar) {
        a(aVar, false);
    }

    public void a(final a aVar, boolean z) {
        if (!z || f().b()) {
            this.c.a((com.google.android.gms.internal.he.b) aVar);
        } else {
            this.c.a(new com.google.android.gms.internal.he.b<kv, lh>(this) {
                boolean a = false;
                final /* synthetic */ kw c;

                public void a(kv kvVar, lh lhVar) {
                    if (!this.a && kvVar.a(kv.c()) > 0) {
                        this.a = true;
                        aVar.a(kv.c(), this.c.f());
                    }
                    aVar.a(kvVar, lhVar);
                }

                public /* synthetic */ void a(Object obj, Object obj2) {
                    a((kv) obj, (lh) obj2);
                }
            });
        }
    }

    public boolean a(kv kvVar) {
        return !c(kvVar).b();
    }

    public kv b(kv kvVar) {
        return (kv) this.c.d(kvVar);
    }

    public lh b(lh lhVar) {
        return this.c.d() ? la.j() : new kw(this.c, lhVar);
    }

    public boolean b() {
        return this.c.d();
    }

    public int c() {
        return this.c.c();
    }

    public lh c(kv kvVar) {
        return (!kvVar.f() || this.e.b()) ? this.c.a((Object) kvVar) ? (lh) this.c.b(kvVar) : la.j() : this.e;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((lh) obj);
    }

    public String d() {
        if (this.f == null) {
            String a = a(com.google.android.gms.internal.lh.a.V1);
            this.f = a.isEmpty() ? "" : mk.b(a);
        }
        return this.f;
    }

    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kw)) {
            return false;
        }
        kw kwVar = (kw) obj;
        if (!f().equals(kwVar.f())) {
            return false;
        }
        if (this.c.c() != kwVar.c.c()) {
            return false;
        }
        Iterator it = this.c.iterator();
        Iterator it2 = kwVar.c.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Entry entry2 = (Entry) it2.next();
            if (((kv) entry.getKey()).equals(entry2.getKey())) {
                if (!((lh) entry.getValue()).equals(entry2.getValue())) {
                }
            }
            return false;
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        throw new IllegalStateException("Something went wrong internally.");
    }

    public lh f() {
        return this.e;
    }

    public kv g() {
        return (kv) this.c.a();
    }

    public kv h() {
        return (kv) this.c.b();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            lg lgVar = (lg) it.next();
            i = lgVar.d().hashCode() + (((i * 31) + lgVar.c().hashCode()) * 17);
        }
        return i;
    }

    public Iterator<lg> i() {
        return new b(this.c.e());
    }

    public Iterator<lg> iterator() {
        return new b(this.c.iterator());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        b(stringBuilder, 0);
        return stringBuilder.toString();
    }
}
