package org.b.a;

import org.b.b;
import org.b.g;
import org.b.i;
import org.b.k;

public class l<T> extends b<T> {
    @i
    public static <T> k<T> a(Class<T> cls) {
        return new l();
    }

    @i
    public static k<Object> b() {
        return new l();
    }

    @i
    public static <T> k<T> b(Class<T> cls) {
        return k.a(a((Class) cls));
    }

    @i
    public static k<Object> c() {
        return k.a(b());
    }

    public void a(g gVar) {
        gVar.a("null");
    }

    public boolean a(Object obj) {
        return obj == null;
    }
}
