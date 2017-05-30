package org.b.a;

import org.b.b;
import org.b.g;
import org.b.i;
import org.b.k;

public class f<T> extends b<T> {
    private final k<T> a;

    public f(k<T> kVar) {
        this.a = kVar;
    }

    @Deprecated
    @i
    public static <T> k<T> a(Class<T> cls) {
        return a(j.a((Class) cls));
    }

    @i
    public static <T> k<T> a(k<T> kVar) {
        return new f(kVar);
    }

    @i
    public static <T> k<T> b(Class<T> cls) {
        return a(j.a((Class) cls));
    }

    @i
    public static <T> k<T> b(T t) {
        return a(i.b(t));
    }

    public void a(Object obj, g gVar) {
        this.a.a(obj, gVar);
    }

    public void a(g gVar) {
        gVar.a("is ").a(this.a);
    }

    public boolean a(Object obj) {
        return this.a.a(obj);
    }
}
