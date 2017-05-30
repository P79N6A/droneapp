package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class i<T> implements Iterator<T> {
    protected final b<T> a;
    protected int b = -1;

    public i(b<T> bVar) {
        this.a = (b) d.a((Object) bVar);
    }

    public boolean hasNext() {
        return this.b < this.a.c() + -1;
    }

    public T next() {
        if (hasNext()) {
            b bVar = this.a;
            int i = this.b + 1;
            this.b = i;
            return bVar.a(i);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
