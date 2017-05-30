package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class hb<T> implements Iterable<T> {
    private final gz<T, Void> a;

    private static class a<T> implements Iterator<T> {
        final Iterator<Entry<T, Void>> a;

        public a(Iterator<Entry<T, Void>> it) {
            this.a = it;
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public T next() {
            return ((Entry) this.a.next()).getKey();
        }

        public void remove() {
            this.a.remove();
        }
    }

    private hb(gz<T, Void> gzVar) {
        this.a = gzVar;
    }

    public hb(List<T> list, Comparator<T> comparator) {
        this.a = com.google.android.gms.internal.gz.a.a(list, Collections.emptyMap(), com.google.android.gms.internal.gz.a.a(), comparator);
    }

    public hb<T> a(T t) {
        gz c = this.a.c(t);
        return c == this.a ? this : new hb(c);
    }

    public T a() {
        return this.a.a();
    }

    public hb<T> b(T t) {
        return new hb(this.a.a(t, null));
    }

    public T b() {
        return this.a.b();
    }

    public T c(T t) {
        return this.a.d(t);
    }

    public Iterator<T> c() {
        return new a(this.a.e());
    }

    public Iterator<T> iterator() {
        return new a(this.a.iterator());
    }
}
