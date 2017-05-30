package org.c.e;

import java.util.Comparator;
import org.c.b.c.a;
import org.c.b.c.c;
import org.c.b.d.b;
import org.c.f.a.e;

public abstract class i {
    public static i a(Class<?> cls) {
        return new a(cls);
    }

    public static i a(Class<?> cls, String str) {
        return a((Class) cls).a(c.a(cls, str));
    }

    public static i a(Class<?> cls, Throwable th) {
        return a(new b(cls, th));
    }

    public static i a(a aVar, Class<?>... clsArr) {
        try {
            return a(aVar.a(new org.c.b.a.a(true), (Class[]) clsArr));
        } catch (e e) {
            throw new RuntimeException("Bug in saff's brain: Suite constructor, called as above, should always complete");
        }
    }

    public static i a(final l lVar) {
        return new i() {
            public l a() {
                return lVar;
            }
        };
    }

    public static i a(Class<?>... clsArr) {
        return a(h.b(), (Class[]) clsArr);
    }

    public static i b(Class<?> cls) {
        return new a(cls, false);
    }

    public i a(Comparator<c> comparator) {
        return new c(this, comparator);
    }

    public i a(org.c.e.a.a aVar) {
        return new org.c.b.c.b(this, aVar);
    }

    public i a(c cVar) {
        return a(org.c.e.a.a.b(cVar));
    }

    public abstract l a();
}
