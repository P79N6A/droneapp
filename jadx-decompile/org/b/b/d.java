package org.b.b;

import java.util.Iterator;
import org.b.m;

public class d<T> implements Iterator<m> {
    private Iterator<T> a;

    public d(Iterator<T> it) {
        this.a = it;
    }

    public m a() {
        return new c(this.a.next());
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
