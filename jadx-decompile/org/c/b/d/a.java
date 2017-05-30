package org.c.b.d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.c.b.b;
import org.c.e.b.c;

@Deprecated
public class a {
    private c a;
    private j b;
    private org.c.e.c c;
    private final Runnable d;

    public a(c cVar, j jVar, org.c.e.c cVar2, Runnable runnable) {
        this.a = cVar;
        this.b = jVar;
        this.c = cVar2;
        this.d = runnable;
    }

    private void c() {
        try {
            for (Method invoke : this.b.b()) {
                invoke.invoke(null, new Object[0]);
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (b e2) {
            throw new c();
        } catch (Throwable th) {
            a(th);
            c cVar = new c();
        }
    }

    private void d() {
        for (Method invoke : this.b.c()) {
            try {
                invoke.invoke(null, new Object[0]);
            } catch (InvocationTargetException e) {
                a(e.getTargetException());
            } catch (Throwable th) {
                a(th);
            }
        }
    }

    protected void a() {
        this.d.run();
    }

    protected void a(Throwable th) {
        this.a.a(new org.c.e.b.a(this.c, th));
    }

    public void b() {
        try {
            c();
            a();
        } catch (c e) {
        } finally {
            d();
        }
    }
}
