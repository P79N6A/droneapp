package com.google.android.gms.internal;

import com.google.android.gms.internal.he.b;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class gz<K, V> implements Iterable<Entry<K, V>> {

    public static class a {
        private static final a a = new a() {
            public Object a(Object obj) {
                return obj;
            }
        };

        public interface a<C, D> {
            D a(C c);
        }

        public static <A> a<A, A> a() {
            return a;
        }

        public static <K, V> gz<K, V> a(Comparator<K> comparator) {
            return new gy(comparator);
        }

        public static <A, B, C> gz<A, C> a(List<A> list, Map<B, C> map, a<A, B> aVar, Comparator<A> comparator) {
            return list.size() < 25 ? gy.a(list, map, aVar, comparator) : hh.a(list, map, aVar, comparator);
        }

        public static <A, B> gz<A, B> a(Map<A, B> map, Comparator<A> comparator) {
            return map.size() < 25 ? gy.a((Map) map, (Comparator) comparator) : hh.a((Map) map, (Comparator) comparator);
        }
    }

    public abstract gz<K, V> a(K k, V v);

    public abstract K a();

    public abstract void a(b<K, V> bVar);

    public abstract boolean a(K k);

    public abstract K b();

    public abstract V b(K k);

    public abstract int c();

    public abstract gz<K, V> c(K k);

    public abstract K d(K k);

    public abstract boolean d();

    public abstract Iterator<Entry<K, V>> e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz)) {
            return false;
        }
        gz gzVar = (gz) obj;
        if (!f().equals(gzVar.f())) {
            return false;
        }
        if (c() != gzVar.c()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = gzVar.iterator();
        while (it.hasNext()) {
            if (!((Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Comparator<K> f();

    public int hashCode() {
        int hashCode = f().hashCode();
        Iterator it = iterator();
        int i = hashCode;
        while (it.hasNext()) {
            i = ((Entry) it.next()).hashCode() + (i * 31);
        }
        return i;
    }

    public abstract Iterator<Entry<K, V>> iterator();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("{");
        Iterator it = iterator();
        Object obj = 1;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append("(");
            stringBuilder.append(entry.getKey());
            stringBuilder.append("=>");
            stringBuilder.append(entry.getValue());
            stringBuilder.append(")");
        }
        stringBuilder.append("};");
        return stringBuilder.toString();
    }
}
