package com.google.android.gms.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class ow<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean f = (!ow.class.desiredAssertionStatus());
    private static final Comparator<Comparable> g = new Comparator<Comparable>() {
        public int a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((Comparable) obj, (Comparable) obj2);
        }
    };
    Comparator<? super K> a;
    d<K, V> b;
    int c;
    int d;
    final d<K, V> e;
    private a h;
    private b i;

    private abstract class c<T> implements Iterator<T> {
        d<K, V> b;
        d<K, V> c;
        int d;
        final /* synthetic */ ow e;

        private c(ow owVar) {
            this.e = owVar;
            this.b = this.e.e.d;
            this.c = null;
            this.d = this.e.d;
        }

        final d<K, V> b() {
            d<K, V> dVar = this.b;
            if (dVar == this.e.e) {
                throw new NoSuchElementException();
            } else if (this.e.d != this.d) {
                throw new ConcurrentModificationException();
            } else {
                this.b = dVar.d;
                this.c = dVar;
                return dVar;
            }
        }

        public final boolean hasNext() {
            return this.b != this.e.e;
        }

        public final void remove() {
            if (this.c == null) {
                throw new IllegalStateException();
            }
            this.e.a(this.c, true);
            this.c = null;
            this.d = this.e.d;
        }
    }

    class a extends AbstractSet<Entry<K, V>> {
        final /* synthetic */ ow a;

        a(ow owVar) {
            this.a = owVar;
        }

        public void clear() {
            this.a.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && this.a.a((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new c<Entry<K, V>>(this) {
                final /* synthetic */ a a;

                {
                    this.a = r3;
                    ow owVar = r3.a;
                }

                public Entry<K, V> a() {
                    return b();
                }

                public /* synthetic */ Object next() {
                    return a();
                }
            };
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            d a = this.a.a((Entry) obj);
            if (a == null) {
                return false;
            }
            this.a.a(a, true);
            return true;
        }

        public int size() {
            return this.a.c;
        }
    }

    final class b extends AbstractSet<K> {
        final /* synthetic */ ow a;

        b(ow owVar) {
            this.a = owVar;
        }

        public void clear() {
            this.a.clear();
        }

        public boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new c<K>(this) {
                final /* synthetic */ b a;

                {
                    this.a = r3;
                    ow owVar = r3.a;
                }

                public K next() {
                    return b().f;
                }
            };
        }

        public boolean remove(Object obj) {
            return this.a.b(obj) != null;
        }

        public int size() {
            return this.a.c;
        }
    }

    static final class d<K, V> implements Entry<K, V> {
        d<K, V> a;
        d<K, V> b;
        d<K, V> c;
        d<K, V> d;
        d<K, V> e;
        final K f;
        V g;
        int h;

        d() {
            this.f = null;
            this.e = this;
            this.d = this;
        }

        d(d<K, V> dVar, K k, d<K, V> dVar2, d<K, V> dVar3) {
            this.a = dVar;
            this.f = k;
            this.h = 1;
            this.d = dVar2;
            this.e = dVar3;
            dVar3.d = this;
            dVar2.e = this;
        }

        public d<K, V> a() {
            d<K, V> dVar;
            for (d<K, V> dVar2 = this.b; dVar2 != null; dVar2 = dVar2.b) {
                dVar = dVar2;
            }
            return dVar;
        }

        public d<K, V> b() {
            d<K, V> dVar;
            for (d<K, V> dVar2 = this.c; dVar2 != null; dVar2 = dVar2.c) {
                dVar = dVar2;
            }
            return dVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.f == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!this.f.equals(entry.getKey())) {
                return false;
            }
            if (this.g == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!this.g.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f;
        }

        public V getValue() {
            return this.g;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.f == null ? 0 : this.f.hashCode();
            if (this.g != null) {
                i = this.g.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f);
            String valueOf2 = String.valueOf(this.g);
            return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
        }
    }

    public ow() {
        this(g);
    }

    public ow(Comparator<? super K> comparator) {
        Comparator comparator2;
        this.c = 0;
        this.d = 0;
        this.e = new d();
        if (comparator == null) {
            comparator2 = g;
        }
        this.a = comparator2;
    }

    private void a(d<K, V> dVar) {
        int i = 0;
        d dVar2 = dVar.b;
        d dVar3 = dVar.c;
        d dVar4 = dVar3.b;
        d dVar5 = dVar3.c;
        dVar.c = dVar4;
        if (dVar4 != null) {
            dVar4.a = dVar;
        }
        a((d) dVar, dVar3);
        dVar3.b = dVar;
        dVar.a = dVar3;
        dVar.h = Math.max(dVar2 != null ? dVar2.h : 0, dVar4 != null ? dVar4.h : 0) + 1;
        int i2 = dVar.h;
        if (dVar5 != null) {
            i = dVar5.h;
        }
        dVar3.h = Math.max(i2, i) + 1;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d dVar3 = dVar.a;
        dVar.a = null;
        if (dVar2 != null) {
            dVar2.a = dVar3;
        }
        if (dVar3 == null) {
            this.b = dVar2;
        } else if (dVar3.b == dVar) {
            dVar3.b = dVar2;
        } else if (f || dVar3.c == dVar) {
            dVar3.c = dVar2;
        } else {
            throw new AssertionError();
        }
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void b(d<K, V> dVar) {
        int i = 0;
        d dVar2 = dVar.b;
        d dVar3 = dVar.c;
        d dVar4 = dVar2.b;
        d dVar5 = dVar2.c;
        dVar.b = dVar5;
        if (dVar5 != null) {
            dVar5.a = dVar;
        }
        a((d) dVar, dVar2);
        dVar2.c = dVar;
        dVar.a = dVar2;
        dVar.h = Math.max(dVar3 != null ? dVar3.h : 0, dVar5 != null ? dVar5.h : 0) + 1;
        int i2 = dVar.h;
        if (dVar4 != null) {
            i = dVar4.h;
        }
        dVar2.h = Math.max(i2, i) + 1;
    }

    private void b(d<K, V> dVar, boolean z) {
        d dVar2;
        while (dVar2 != null) {
            d dVar3 = dVar2.b;
            d dVar4 = dVar2.c;
            int i = dVar3 != null ? dVar3.h : 0;
            int i2 = dVar4 != null ? dVar4.h : 0;
            int i3 = i - i2;
            d dVar5;
            if (i3 == -2) {
                dVar3 = dVar4.b;
                dVar5 = dVar4.c;
                i2 = (dVar3 != null ? dVar3.h : 0) - (dVar5 != null ? dVar5.h : 0);
                if (i2 == -1 || (i2 == 0 && !z)) {
                    a(dVar2);
                } else if (f || i2 == 1) {
                    b(dVar4);
                    a(dVar2);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                dVar4 = dVar3.b;
                dVar5 = dVar3.c;
                i2 = (dVar4 != null ? dVar4.h : 0) - (dVar5 != null ? dVar5.h : 0);
                if (i2 == 1 || (i2 == 0 && !z)) {
                    b(dVar2);
                } else if (f || i2 == -1) {
                    a(dVar3);
                    b(dVar2);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                dVar2.h = i + 1;
                if (z) {
                    return;
                }
            } else if (f || i3 == -1 || i3 == 1) {
                dVar2.h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            dVar2 = dVar2.a;
        }
    }

    d<K, V> a(Object obj) {
        d<K, V> dVar = null;
        if (obj != null) {
            try {
                dVar = a(obj, false);
            } catch (ClassCastException e) {
            }
        }
        return dVar;
    }

    d<K, V> a(K k, boolean z) {
        int i;
        Comparator comparator = this.a;
        d<K, V> dVar = this.b;
        if (dVar != null) {
            int compareTo;
            Comparable comparable = comparator == g ? (Comparable) k : null;
            while (true) {
                compareTo = comparable != null ? comparable.compareTo(dVar.f) : comparator.compare(k, dVar.f);
                if (compareTo == 0) {
                    return dVar;
                }
                d<K, V> dVar2 = compareTo < 0 ? dVar.b : dVar.c;
                if (dVar2 == null) {
                    break;
                }
                dVar = dVar2;
            }
            int i2 = compareTo;
            d dVar3 = dVar;
            i = i2;
        } else {
            d<K, V> dVar4 = dVar;
            i = 0;
        }
        if (!z) {
            return null;
        }
        d<K, V> dVar5;
        d dVar6 = this.e;
        if (dVar3 != null) {
            dVar5 = new d(dVar3, k, dVar6, dVar6.e);
            if (i < 0) {
                dVar3.b = dVar5;
            } else {
                dVar3.c = dVar5;
            }
            b(dVar3, true);
        } else if (comparator != g || (k instanceof Comparable)) {
            dVar5 = new d(dVar3, k, dVar6, dVar6.e);
            this.b = dVar5;
        } else {
            throw new ClassCastException(String.valueOf(k.getClass().getName()).concat(" is not Comparable"));
        }
        this.c++;
        this.d++;
        return dVar5;
    }

    d<K, V> a(Entry<?, ?> entry) {
        d<K, V> a = a(entry.getKey());
        Object obj = (a == null || !a(a.g, entry.getValue())) ? null : 1;
        return obj != null ? a : null;
    }

    void a(d<K, V> dVar, boolean z) {
        int i = 0;
        if (z) {
            dVar.e.d = dVar.d;
            dVar.d.e = dVar.e;
        }
        d dVar2 = dVar.b;
        d dVar3 = dVar.c;
        d dVar4 = dVar.a;
        if (dVar2 == null || dVar3 == null) {
            if (dVar2 != null) {
                a((d) dVar, dVar2);
                dVar.b = null;
            } else if (dVar3 != null) {
                a((d) dVar, dVar3);
                dVar.c = null;
            } else {
                a((d) dVar, null);
            }
            b(dVar4, false);
            this.c--;
            this.d++;
            return;
        }
        int i2;
        dVar2 = dVar2.h > dVar3.h ? dVar2.b() : dVar3.a();
        a(dVar2, false);
        dVar4 = dVar.b;
        if (dVar4 != null) {
            i2 = dVar4.h;
            dVar2.b = dVar4;
            dVar4.a = dVar2;
            dVar.b = null;
        } else {
            i2 = 0;
        }
        dVar4 = dVar.c;
        if (dVar4 != null) {
            i = dVar4.h;
            dVar2.c = dVar4;
            dVar4.a = dVar2;
            dVar.c = null;
        }
        dVar2.h = Math.max(i2, i) + 1;
        a((d) dVar, dVar2);
    }

    d<K, V> b(Object obj) {
        d a = a(obj);
        if (a != null) {
            a(a, true);
        }
        return a;
    }

    public void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        d dVar = this.e;
        dVar.e = dVar;
        dVar.d = dVar;
    }

    public boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        set = new a(this);
        this.h = set;
        return set;
    }

    public V get(Object obj) {
        d a = a(obj);
        return a != null ? a.g : null;
    }

    public Set<K> keySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        set = new b(this);
        this.i = set;
        return set;
    }

    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        d a = a((Object) k, true);
        V v2 = a.g;
        a.g = v;
        return v2;
    }

    public V remove(Object obj) {
        d b = b(obj);
        return b != null ? b.g : null;
    }

    public int size() {
        return this.c;
    }
}
