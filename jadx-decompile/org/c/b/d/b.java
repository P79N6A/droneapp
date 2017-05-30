package org.c.b.d;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.c.e.b.a;
import org.c.e.b.c;
import org.c.e.l;
import org.c.f.a.e;

public class b extends l {
    private final List<Throwable> a;
    private final Class<?> b;

    public b(Class<?> cls, Throwable th) {
        if (cls == null) {
            throw new NullPointerException("Test class cannot be null");
        }
        this.b = cls;
        this.a = a(th);
    }

    private List<Throwable> a(Throwable th) {
        if (th instanceof InvocationTargetException) {
            return a(th.getCause());
        }
        if (th instanceof e) {
            return ((e) th).a();
        }
        if (th instanceof d) {
            return ((d) th).a();
        }
        return Arrays.asList(new Throwable[]{th});
    }

    private void a(Throwable th, c cVar) {
        org.c.e.c b = b(th);
        cVar.b(b);
        cVar.a(new a(b, th));
        cVar.d(b);
    }

    private org.c.e.c b(Throwable th) {
        return org.c.e.c.a(this.b, "initializationError");
    }

    public void a(c cVar) {
        for (Throwable a : this.a) {
            a(a, cVar);
        }
    }

    public org.c.e.c d() {
        org.c.e.c a = org.c.e.c.a(this.b);
        for (Throwable b : this.a) {
            a.a(b(b));
        }
        return a;
    }
}
