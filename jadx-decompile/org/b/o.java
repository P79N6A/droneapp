package org.b;

import org.b.b.b;
import org.b.g.a;

public abstract class o<T> extends b<T> {
    private static final b a = new b("matchesSafely", 2, 0);
    private final Class<?> b;

    protected o() {
        this(a);
    }

    protected o(Class<?> cls) {
        this.b = cls;
    }

    protected o(b bVar) {
        this.b = bVar.a(getClass());
    }

    public final void a(Object obj, g gVar) {
        if (obj == null || !this.b.isInstance(obj)) {
            super.a(obj, gVar);
        } else {
            b(obj, gVar);
        }
    }

    public final boolean a(Object obj) {
        return obj != null && this.b.isInstance(obj) && b(obj, new a());
    }

    protected abstract boolean b(T t, g gVar);
}
