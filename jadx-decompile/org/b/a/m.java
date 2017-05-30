package org.b.a;

import org.b.b;
import org.b.g;
import org.b.i;
import org.b.k;

public class m<T> extends b<T> {
    private final T a;

    public m(T t) {
        this.a = t;
    }

    @i
    public static <T> k<T> b(T t) {
        return new m(t);
    }

    @i
    public static <T> k<T> c(T t) {
        return new m(t);
    }

    public void a(g gVar) {
        gVar.a("sameInstance(").a(this.a).a(")");
    }

    public boolean a(Object obj) {
        return obj == this.a;
    }
}
