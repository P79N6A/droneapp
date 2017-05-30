package org.c.b.d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.c.b.b;
import org.c.e.b.a;
import org.c.e.b.c;

@Deprecated
public class g {
    private final Object a;
    private final c b;
    private final org.c.e.c c;
    private k d;

    public g(Object obj, k kVar, c cVar, org.c.e.c cVar2) {
        this.a = obj;
        this.b = cVar;
        this.c = cVar2;
        this.d = kVar;
    }

    private void a(long j) {
        a(new 1(this, j));
    }

    private void d() {
        try {
            for (Method invoke : this.d.e()) {
                invoke.invoke(this.a, new Object[0]);
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

    private void e() {
        for (Method invoke : this.d.f()) {
            try {
                invoke.invoke(this.a, new Object[0]);
            } catch (InvocationTargetException e) {
                a(e.getTargetException());
            } catch (Throwable th) {
                a(th);
            }
        }
    }

    public void a() {
        if (this.d.a()) {
            this.b.c(this.c);
            return;
        }
        this.b.b(this.c);
        try {
            long b = this.d.b();
            if (b > 0) {
                a(b);
            } else {
                b();
            }
            this.b.d(this.c);
        } catch (Throwable th) {
            this.b.d(this.c);
        }
    }

    public void a(Runnable runnable) {
        try {
            d();
            runnable.run();
            e();
        } catch (c e) {
            e();
        } catch (Exception e2) {
            throw new RuntimeException("test should never throw an exception to this level");
        } catch (Throwable th) {
            e();
        }
    }

    protected void a(Throwable th) {
        this.b.a(new a(this.c, th));
    }

    public void b() {
        a(new 2(this));
    }

    protected void c() {
        Throwable targetException;
        try {
            this.d.a(this.a);
            if (this.d.d()) {
                a(new AssertionError("Expected exception: " + this.d.c().getName()));
            }
        } catch (InvocationTargetException e) {
            targetException = e.getTargetException();
            if (!(targetException instanceof b)) {
                if (!this.d.d()) {
                    a(targetException);
                } else if (this.d.a(targetException)) {
                    a(new Exception("Unexpected exception, expected<" + this.d.c().getName() + "> but was<" + targetException.getClass().getName() + ">", targetException));
                }
            }
        } catch (Throwable targetException2) {
            a(targetException2);
        }
    }
}
