package org.c.b.d;

import java.lang.reflect.Method;
import java.util.List;
import org.c.f;
import org.c.m;
import org.c.m.a;

@Deprecated
public class k {
    private final Method a;
    private j b;

    public k(Method method, j jVar) {
        this.a = method;
        this.b = jVar;
    }

    public void a(Object obj) {
        this.a.invoke(obj, new Object[0]);
    }

    public boolean a() {
        return this.a.getAnnotation(org.c.k.class) != null;
    }

    boolean a(Throwable th) {
        return !c().isAssignableFrom(th.getClass());
    }

    public long b() {
        m mVar = (m) this.a.getAnnotation(m.class);
        return mVar == null ? 0 : mVar.b();
    }

    protected Class<? extends Throwable> c() {
        m mVar = (m) this.a.getAnnotation(m.class);
        return (mVar == null || mVar.a() == a.class) ? null : mVar.a();
    }

    boolean d() {
        return c() != null;
    }

    List<Method> e() {
        return this.b.a(f.class);
    }

    List<Method> f() {
        return this.b.a(org.c.a.class);
    }
}
