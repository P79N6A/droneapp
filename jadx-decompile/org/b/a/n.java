package org.b.a;

import org.b.b;
import org.b.g;
import org.b.k;

abstract class n<T> extends b<T> {
    private final Iterable<k<? super T>> a;

    public n(Iterable<k<? super T>> iterable) {
        this.a = iterable;
    }

    public abstract void a(g gVar);

    public void a(g gVar, String str) {
        gVar.b("(", " " + str + " ", ")", this.a);
    }

    public abstract boolean a(Object obj);

    protected boolean a(Object obj, boolean z) {
        for (k a : this.a) {
            if (a.a(obj) == z) {
                return z;
            }
        }
        return !z;
    }
}
