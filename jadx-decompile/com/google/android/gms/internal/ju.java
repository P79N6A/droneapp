package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class ju<T> implements Iterable<Entry<ij, T>> {
    private static final gz c = com.google.android.gms.internal.gz.a.a(hi.a(kv.class));
    private static final ju d = new ju(null, c);
    private final T a;
    private final gz<kv, ju<T>> b;

    public interface a<T, R> {
        R a(ij ijVar, T t, R r);
    }

    public ju(T t) {
        this(t, c);
    }

    public ju(T t, gz<kv, ju<T>> gzVar) {
        this.a = t;
        this.b = gzVar;
    }

    public static <V> ju<V> a() {
        return d;
    }

    private <R> R a(ij ijVar, a<? super T, R> aVar, R r) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            r = ((ju) entry.getValue()).a(ijVar.a((kv) entry.getKey()), aVar, r);
        }
        return this.a != null ? aVar.a(ijVar, this.a, r) : r;
    }

    public ij a(ij ijVar) {
        return a(ijVar, jv.e);
    }

    public ij a(ij ijVar, jv<? super T> jvVar) {
        if (this.a != null && jvVar.a(this.a)) {
            return ij.a();
        }
        if (ijVar.h()) {
            return null;
        }
        ju juVar = (ju) this.b.b(ijVar.d());
        if (juVar == null) {
            return null;
        }
        ij a = juVar.a(ijVar.e(), (jv) jvVar);
        if (a == null) {
            return null;
        }
        return new ij(r2).a(a);
    }

    public ju<T> a(ij ijVar, ju<T> juVar) {
        if (ijVar.h()) {
            return juVar;
        }
        kv d = ijVar.d();
        ju juVar2 = (ju) this.b.b(d);
        if (juVar2 == null) {
            juVar2 = a();
        }
        juVar2 = juVar2.a(ijVar.e(), (ju) juVar);
        return new ju(this.a, juVar2.d() ? this.b.c(d) : this.b.a(d, juVar2));
    }

    public ju<T> a(ij ijVar, T t) {
        if (ijVar.h()) {
            return new ju(t, this.b);
        }
        kv d = ijVar.d();
        ju juVar = (ju) this.b.b(d);
        if (juVar == null) {
            juVar = a();
        }
        return new ju(this.a, this.b.a(d, juVar.a(ijVar.e(), (Object) t)));
    }

    public ju<T> a(kv kvVar) {
        ju<T> juVar = (ju) this.b.b(kvVar);
        return juVar != null ? juVar : a();
    }

    public <R> R a(R r, a<? super T, R> aVar) {
        return a(ij.a(), aVar, r);
    }

    public void a(a<T, Void> aVar) {
        a(ij.a(), aVar, null);
    }

    public boolean a(jv<? super T> jvVar) {
        if (this.a != null && jvVar.a(this.a)) {
            return true;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((ju) ((Entry) it.next()).getValue()).a((jv) jvVar)) {
                return true;
            }
        }
        return false;
    }

    public T b() {
        return this.a;
    }

    public T b(ij ijVar) {
        return c(ijVar, jv.e);
    }

    public T b(ij ijVar, jv<? super T> jvVar) {
        if (this.a != null && jvVar.a(this.a)) {
            return this.a;
        }
        Iterator it = ijVar.iterator();
        while (it.hasNext()) {
            ju juVar = (ju) this.b.b((kv) it.next());
            if (juVar == null) {
                return null;
            }
            if (juVar.a != null && jvVar.a(juVar.a)) {
                return juVar.a;
            }
            this = juVar;
        }
        return null;
    }

    public gz<kv, ju<T>> c() {
        return this.b;
    }

    public ju<T> c(ij ijVar) {
        if (ijVar.h()) {
            return this;
        }
        ju juVar = (ju) this.b.b(ijVar.d());
        return juVar != null ? juVar.c(ijVar.e()) : a();
    }

    public T c(ij ijVar, jv<? super T> jvVar) {
        T t = (this.a == null || !jvVar.a(this.a)) ? null : this.a;
        Iterator it = ijVar.iterator();
        T t2 = t;
        while (it.hasNext()) {
            ju juVar = (ju) this.b.b((kv) it.next());
            if (juVar == null) {
                break;
            }
            if (juVar.a != null && jvVar.a(juVar.a)) {
                t2 = juVar.a;
            }
            this = juVar;
        }
        return t2;
    }

    public ju<T> d(ij ijVar) {
        if (ijVar.h()) {
            return this.b.d() ? a() : new ju(null, this.b);
        } else {
            kv d = ijVar.d();
            ju juVar = (ju) this.b.b(d);
            if (juVar == null) {
                return this;
            }
            juVar = juVar.d(ijVar.e());
            gz c = juVar.d() ? this.b.c(d) : this.b.a(d, juVar);
            return (this.a == null && c.d()) ? a() : new ju(this.a, c);
        }
    }

    public boolean d() {
        return this.a == null && this.b.d();
    }

    public T e(ij ijVar) {
        if (ijVar.h()) {
            return this.a;
        }
        ju juVar = (ju) this.b.b(ijVar.d());
        return juVar != null ? juVar.e(ijVar.e()) : null;
    }

    public Collection<T> e() {
        final Collection arrayList = new ArrayList();
        a(new a<T, Void>(this) {
            final /* synthetic */ ju b;

            public Void a(ij ijVar, T t, Void voidR) {
                arrayList.add(t);
                return null;
            }
        });
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ju juVar = (ju) obj;
        if (this.b == null ? juVar.b != null : !this.b.equals(juVar.b)) {
            return false;
        }
        if (this.a != null) {
            if (this.a.equals(juVar.a)) {
                return true;
            }
        } else if (juVar.a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.a != null ? this.a.hashCode() : 0) * 31;
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode + i;
    }

    public Iterator<Entry<ij, T>> iterator() {
        final List arrayList = new ArrayList();
        a(new a<T, Void>(this) {
            final /* synthetic */ ju b;

            public Void a(ij ijVar, T t, Void voidR) {
                arrayList.add(new SimpleImmutableEntry(ijVar, t));
                return null;
            }
        });
        return arrayList.iterator();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImmutableTree { value=");
        stringBuilder.append(b());
        stringBuilder.append(", children={");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            stringBuilder.append(((kv) entry.getKey()).e());
            stringBuilder.append("=");
            stringBuilder.append(entry.getValue());
        }
        stringBuilder.append("} }");
        return stringBuilder.toString();
    }
}
