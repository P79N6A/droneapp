package com.google.android.gms.internal;

import com.google.android.gms.internal.gz.a.a;
import com.google.android.gms.internal.he.b;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class gy<K, V> extends gz<K, V> {
    private final K[] a;
    private final V[] b;
    private final Comparator<K> c;

    public gy(Comparator<K> comparator) {
        this.a = new Object[0];
        this.b = new Object[0];
        this.c = comparator;
    }

    private gy(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.a = kArr;
        this.b = vArr;
        this.c = comparator;
    }

    public static <A, B, C> gy<A, C> a(List<A> list, Map<B, C> map, a<A, B> aVar, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        size = 0;
        for (Object next : list) {
            objArr[size] = next;
            objArr2[size] = map.get(aVar.a(next));
            size++;
        }
        return new gy(comparator, objArr, objArr2);
    }

    public static <K, V> gy<K, V> a(Map<K, V> map, Comparator<K> comparator) {
        return a(new ArrayList(map.keySet()), map, gz.a.a(), comparator);
    }

    private Iterator<Entry<K, V>> a(final int i, final boolean z) {
        return new Iterator<Entry<K, V>>(this) {
            int a = i;
            final /* synthetic */ gy d;

            public Entry<K, V> a() {
                Object obj = this.d.a[this.a];
                Object obj2 = this.d.b[this.a];
                this.a = z ? this.a - 1 : this.a + 1;
                return new SimpleImmutableEntry(obj, obj2);
            }

            public boolean hasNext() {
                return z ? this.a >= 0 : this.a < this.d.a.length;
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }
        };
    }

    private static <T> T[] a(T[] tArr, int i) {
        int length = tArr.length - 1;
        Object obj = new Object[length];
        System.arraycopy(tArr, 0, obj, 0, i);
        System.arraycopy(tArr, i + 1, obj, i, length - i);
        return obj;
    }

    private static <T> T[] a(T[] tArr, int i, T t) {
        int length = tArr.length + 1;
        Object obj = new Object[length];
        System.arraycopy(tArr, 0, obj, 0, i);
        obj[i] = t;
        System.arraycopy(tArr, i, obj, i + 1, (length - i) - 1);
        return obj;
    }

    private static <T> T[] b(T[] tArr, int i, T t) {
        int length = tArr.length;
        Object obj = new Object[length];
        System.arraycopy(tArr, 0, obj, 0, length);
        obj[i] = t;
        return obj;
    }

    private int e(K k) {
        int i = 0;
        while (i < this.a.length && this.c.compare(this.a[i], k) < 0) {
            i++;
        }
        return i;
    }

    private int f(K k) {
        int i = 0;
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (this.c.compare(k, objArr[i2]) == 0) {
                return i;
            }
            i2++;
            i++;
        }
        return -1;
    }

    public gz<K, V> a(K k, V v) {
        int f = f(k);
        if (f != -1) {
            if (this.a[f] == k && this.b[f] == v) {
                return this;
            }
            return new gy(this.c, b(this.a, f, k), b(this.b, f, v));
        } else if (this.a.length > 25) {
            Map hashMap = new HashMap(this.a.length + 1);
            for (f = 0; f < this.a.length; f++) {
                hashMap.put(this.a[f], this.b[f]);
            }
            hashMap.put(k, v);
            return hh.a(hashMap, this.c);
        } else {
            f = e(k);
            return new gy(this.c, a(this.a, f, k), a(this.b, f, v));
        }
    }

    public K a() {
        return this.a.length > 0 ? this.a[0] : null;
    }

    public void a(b<K, V> bVar) {
        for (int i = 0; i < this.a.length; i++) {
            bVar.a(this.a[i], this.b[i]);
        }
    }

    public boolean a(K k) {
        return f(k) != -1;
    }

    public K b() {
        return this.a.length > 0 ? this.a[this.a.length - 1] : null;
    }

    public V b(K k) {
        int f = f(k);
        return f != -1 ? this.b[f] : null;
    }

    public int c() {
        return this.a.length;
    }

    public gz<K, V> c(K k) {
        int f = f(k);
        if (f == -1) {
            return this;
        }
        return new gy(this.c, a(this.a, f), a(this.b, f));
    }

    public K d(K k) {
        int f = f(k);
        if (f != -1) {
            return f > 0 ? this.a[f - 1] : null;
        } else {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
    }

    public boolean d() {
        return this.a.length == 0;
    }

    public Iterator<Entry<K, V>> e() {
        return a(this.a.length - 1, true);
    }

    public Comparator<K> f() {
        return this.c;
    }

    public Iterator<Entry<K, V>> iterator() {
        return a(0, false);
    }
}
