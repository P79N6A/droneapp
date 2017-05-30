package org.c.e;

import org.c.f.a.h;
import org.c.f.g;

public class a {
    public static a c() {
        return new a();
    }

    protected l a(h hVar, Class<?> cls) {
        return hVar.a(cls);
    }

    public l a(final h hVar, Class<?>[] clsArr) {
        return new g(new h(this) {
            final /* synthetic */ a b;

            public l a(Class<?> cls) {
                return this.b.a(hVar, (Class) cls);
            }
        }, clsArr);
    }
}
