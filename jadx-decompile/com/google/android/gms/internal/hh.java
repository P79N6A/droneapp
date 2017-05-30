package com.google.android.gms.internal;

import com.google.android.gms.internal.he.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class hh<K, V> extends gz<K, V> {
    private he<K, V> a;
    private Comparator<K> b;

    private static class a<A, B, C> {
        private final List<A> a;
        private final Map<B, C> b;
        private final com.google.android.gms.internal.gz.a.a<A, B> c;
        private hg<A, C> d;
        private hg<A, C> e;

        static class a implements Iterable<b> {
            private long a;
            private final int b;

            public a(int i) {
                int i2 = i + 1;
                this.b = (int) Math.floor(Math.log((double) i2) / Math.log(2.0d));
                this.a = ((long) i2) & (((long) Math.pow(2.0d, (double) this.b)) - 1);
            }

            public Iterator<b> iterator() {
                return new Iterator<b>(this) {
                    final /* synthetic */ a a;
                    private int b = (this.a.b - 1);

                    {
                        this.a = r2;
                    }

                    public b a() {
                        boolean z = true;
                        long b = this.a.a & ((long) (1 << this.b));
                        b bVar = new b();
                        if (b != 0) {
                            z = false;
                        }
                        bVar.a = z;
                        bVar.b = (int) Math.pow(2.0d, (double) this.b);
                        this.b--;
                        return bVar;
                    }

                    public boolean hasNext() {
                        return this.b >= 0;
                    }

                    public /* synthetic */ Object next() {
                        return a();
                    }

                    public void remove() {
                    }
                };
            }
        }

        static class b {
            public boolean a;
            public int b;

            b() {
            }
        }

        private a(List<A> list, Map<B, C> map, com.google.android.gms.internal.gz.a.a<A, B> aVar) {
            this.a = list;
            this.b = map;
            this.c = aVar;
        }

        private he<A, C> a(int i, int i2) {
            if (i2 == 0) {
                return hd.a();
            }
            if (i2 == 1) {
                Object obj = this.a.get(i);
                return new hc(obj, a(obj), null, null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            he a = a(i, i3);
            he a2 = a(i4 + 1, i3);
            obj = this.a.get(i4);
            return new hc(obj, a(obj), a, a2);
        }

        public static <A, B, C> hh<A, C> a(List<A> list, Map<B, C> map, com.google.android.gms.internal.gz.a.a<A, B> aVar, Comparator<A> comparator) {
            a aVar2 = new a(list, map, aVar);
            Collections.sort(list, comparator);
            Iterator it = new a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                int i;
                b bVar = (b) it.next();
                size -= bVar.b;
                if (bVar.a) {
                    aVar2.a(com.google.android.gms.internal.he.a.BLACK, bVar.b, size);
                    i = size;
                } else {
                    aVar2.a(com.google.android.gms.internal.he.a.BLACK, bVar.b, size);
                    size -= bVar.b;
                    aVar2.a(com.google.android.gms.internal.he.a.RED, bVar.b, size);
                    i = size;
                }
                size = i;
            }
            return new hh(aVar2.d == null ? hd.a() : aVar2.d, comparator);
        }

        private C a(A a) {
            return this.b.get(this.c.a(a));
        }

        private void a(com.google.android.gms.internal.he.a aVar, int i, int i2) {
            he a = a(i2 + 1, i - 1);
            Object obj = this.a.get(i2);
            he hfVar = aVar == com.google.android.gms.internal.he.a.RED ? new hf(obj, a(obj), null, a) : new hc(obj, a(obj), null, a);
            if (this.d == null) {
                this.d = hfVar;
                this.e = hfVar;
                return;
            }
            this.e.a(hfVar);
            this.e = hfVar;
        }
    }

    private hh(he<K, V> heVar, Comparator<K> comparator) {
        this.a = heVar;
        this.b = comparator;
    }

    public static <A, B, C> hh<A, C> a(List<A> list, Map<B, C> map, com.google.android.gms.internal.gz.a.a<A, B> aVar, Comparator<A> comparator) {
        return a.a(list, map, aVar, comparator);
    }

    public static <A, B> hh<A, B> a(Map<A, B> map, Comparator<A> comparator) {
        return a.a(new ArrayList(map.keySet()), map, com.google.android.gms.internal.gz.a.a(), comparator);
    }

    private he<K, V> e(K k) {
        he<K, V> heVar = this.a;
        while (!heVar.c()) {
            int compare = this.b.compare(k, heVar.d());
            if (compare < 0) {
                heVar = heVar.f();
            } else if (compare == 0) {
                return heVar;
            } else {
                heVar = heVar.g();
            }
        }
        return null;
    }

    public gz<K, V> a(K k, V v) {
        return new hh(this.a.a(k, v, this.b).a(null, null, com.google.android.gms.internal.he.a.BLACK, null, null), this.b);
    }

    public K a() {
        return this.a.h().d();
    }

    public void a(b<K, V> bVar) {
        this.a.a(bVar);
    }

    public boolean a(K k) {
        return e(k) != null;
    }

    public K b() {
        return this.a.i().d();
    }

    public V b(K k) {
        he e = e(k);
        return e != null ? e.e() : null;
    }

    public int c() {
        return this.a.j();
    }

    public gz<K, V> c(K k) {
        if (!a((Object) k)) {
            return this;
        }
        return new hh(this.a.a(k, this.b).a(null, null, com.google.android.gms.internal.he.a.BLACK, null, null), this.b);
    }

    public K d(K k) {
        he heVar = this.a;
        he heVar2 = null;
        while (!heVar.c()) {
            int compare = this.b.compare(k, heVar.d());
            if (compare == 0) {
                if (heVar.f().c()) {
                    return heVar2 != null ? heVar2.d() : null;
                } else {
                    heVar2 = heVar.f();
                    while (!heVar2.g().c()) {
                        heVar2 = heVar2.g();
                    }
                    return heVar2.d();
                }
            } else if (compare < 0) {
                heVar = heVar.f();
            } else {
                he heVar3 = heVar;
                heVar = heVar.g();
                heVar2 = heVar3;
            }
        }
        String valueOf = String.valueOf(k);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Couldn't find predecessor key of non-present key: ").append(valueOf).toString());
    }

    public boolean d() {
        return this.a.c();
    }

    public Iterator<Entry<K, V>> e() {
        return new ha(this.a, null, this.b, true);
    }

    public Comparator<K> f() {
        return this.b;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new ha(this.a, null, this.b, false);
    }
}
