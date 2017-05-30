package org.b;

import org.b.b.b;

public abstract class p<T> extends b<T> {
    private static final b a = new b("matchesSafely", 1, 0);
    private final Class<?> b;

    protected p() {
        this(a);
    }

    protected p(Class<?> cls) {
        this.b = cls;
    }

    protected p(b bVar) {
        this.b = bVar.a(getClass());
    }

    public final void a(Object obj, g gVar) {
        if (obj == null) {
            super.a(obj, gVar);
        } else if (this.b.isInstance(obj)) {
            b(obj, gVar);
        } else {
            gVar.a("was a ").a(obj.getClass().getName()).a(" (").a(obj).a(")");
        }
    }

    public final boolean a(Object obj) {
        return obj != null && this.b.isInstance(obj) && b(obj);
    }

    protected void b(T t, g gVar) {
        super.a(t, gVar);
    }

    protected abstract boolean b(T t);
}
