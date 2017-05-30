package org.c.b.d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.c.a;
import org.c.b;
import org.c.f;
import org.c.g;
import org.c.m;

@Deprecated
public class h {
    private final List<Throwable> a = new ArrayList();
    private j b;

    public h(j jVar) {
        this.b = jVar;
    }

    private void a(Class<? extends Annotation> cls, boolean z) {
        for (Method method : this.b.a(cls)) {
            if (Modifier.isStatic(method.getModifiers()) != z) {
                this.a.add(new Exception("Method " + method.getName() + "() " + (z ? "should" : "should not") + " be static"));
            }
            if (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                this.a.add(new Exception("Class " + method.getDeclaringClass().getName() + " should be public"));
            }
            if (!Modifier.isPublic(method.getModifiers())) {
                this.a.add(new Exception("Method " + method.getName() + " should be public"));
            }
            if (method.getReturnType() != Void.TYPE) {
                this.a.add(new Exception("Method " + method.getName() + " should be void"));
            }
            if (method.getParameterTypes().length != 0) {
                this.a.add(new Exception("Method " + method.getName() + " should have no parameters"));
            }
        }
    }

    public void a() {
        a(a.class, false);
        a(f.class, false);
        a(m.class, false);
        if (this.b.a(m.class).size() == 0) {
            this.a.add(new Exception("No runnable methods"));
        }
    }

    public void b() {
        a(g.class, true);
        a(b.class, true);
    }

    public List<Throwable> c() {
        e();
        b();
        a();
        return this.a;
    }

    public void d() {
        if (!this.a.isEmpty()) {
            throw new d(this.a);
        }
    }

    public void e() {
        try {
            this.b.d();
        } catch (Throwable e) {
            this.a.add(new Exception("Test class should have public zero-argument constructor", e));
        }
    }
}
