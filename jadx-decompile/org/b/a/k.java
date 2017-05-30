package org.b.a;

import org.b.b;
import org.b.g;
import org.b.i;

public class k<T> extends b<T> {
    private final org.b.k<T> a;

    public k(org.b.k<T> kVar) {
        this.a = kVar;
    }

    @i
    public static <T> org.b.k<T> a(org.b.k<T> kVar) {
        return new k(kVar);
    }

    @i
    public static <T> org.b.k<T> b(T t) {
        return a(i.b(t));
    }

    public void a(g gVar) {
        gVar.a("not ").a(this.a);
    }

    public boolean a(Object obj) {
        return !this.a.a(obj);
    }
}
