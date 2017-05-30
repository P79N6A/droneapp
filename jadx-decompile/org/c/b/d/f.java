package org.c.b.d;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.c.e.a.b;
import org.c.e.a.d;
import org.c.e.a.e;
import org.c.e.b.a;
import org.c.e.b.c;
import org.c.e.l;

@Deprecated
public class f extends l implements b, d {
    private final List<Method> a = a();
    private j b;

    public f(Class<?> cls) {
        this.b = new j(cls);
        b();
    }

    private void a(c cVar, org.c.e.c cVar2, Throwable th) {
        cVar.b(cVar2);
        cVar.a(new a(cVar2, th));
        cVar.d(cVar2);
    }

    protected List<Method> a() {
        return this.b.a();
    }

    protected k a(Method method) {
        return new k(method, this.b);
    }

    protected void a(Method method, c cVar) {
        org.c.e.c c = c(method);
        try {
            new g(f(), a(method), cVar, c).a();
        } catch (InvocationTargetException e) {
            a(cVar, c, e.getCause());
        } catch (Throwable e2) {
            a(cVar, c, e2);
        }
    }

    public void a(org.c.e.a.a aVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!aVar.a(c((Method) it.next()))) {
                it.remove();
            }
        }
        if (this.a.isEmpty()) {
            throw new org.c.e.a.c();
        }
    }

    public void a(e eVar) {
        Collections.sort(this.a, new 2(this, eVar));
    }

    public void a(c cVar) {
        new a(cVar, this.b, d(), new 1(this, cVar)).b();
    }

    protected String b(Method method) {
        return method.getName();
    }

    protected void b() {
        h hVar = new h(this.b);
        hVar.c();
        hVar.d();
    }

    protected void b(c cVar) {
        for (Method a : this.a) {
            a(a, cVar);
        }
    }

    protected org.c.e.c c(Method method) {
        return org.c.e.c.a(g().e(), b(method), d(method));
    }

    protected Annotation[] c() {
        return this.b.e().getAnnotations();
    }

    public org.c.e.c d() {
        org.c.e.c a = org.c.e.c.a(e(), c());
        for (Method c : this.a) {
            a.a(c(c));
        }
        return a;
    }

    protected Annotation[] d(Method method) {
        return method.getAnnotations();
    }

    protected String e() {
        return g().f();
    }

    protected Object f() {
        return g().d().newInstance(new Object[0]);
    }

    protected j g() {
        return this.b;
    }
}
