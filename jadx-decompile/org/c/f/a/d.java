package org.c.f.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

public class d extends c<d> {
    private final Method a;

    public d(Method method) {
        if (method == null) {
            throw new NullPointerException("FrameworkMethod cannot be created without an underlying method.");
        }
        this.a = method;
    }

    private Class<?>[] j() {
        return this.a.getParameterTypes();
    }

    public Object a(Object obj, Object... objArr) {
        return new 1(this, obj, objArr).a();
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return this.a.getAnnotation(cls);
    }

    public void a(boolean z, List<Throwable> list) {
        b(z, list);
        if (this.a.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.a.getName() + " should have no parameters"));
        }
    }

    @Deprecated
    public boolean a(Type type) {
        return j().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(this.a.getReturnType());
    }

    public boolean a(d dVar) {
        if (!dVar.b().equals(b()) || dVar.j().length != j().length) {
            return false;
        }
        for (int i = 0; i < dVar.j().length; i++) {
            if (!dVar.j()[i].equals(j()[i])) {
                return false;
            }
        }
        return true;
    }

    public Annotation[] a() {
        return this.a.getAnnotations();
    }

    public String b() {
        return this.a.getName();
    }

    public void b(List<Throwable> list) {
        new g(this.a).a(list);
    }

    public void b(boolean z, List<Throwable> list) {
        if (g() != z) {
            list.add(new Exception("Method " + this.a.getName() + "() " + (z ? "should" : "should not") + " be static"));
        }
        if (!h()) {
            list.add(new Exception("Method " + this.a.getName() + "() should be public"));
        }
        if (this.a.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.a.getName() + "() should be void"));
        }
    }

    protected int c() {
        return this.a.getModifiers();
    }

    public Method d() {
        return this.a;
    }

    public Class<?> e() {
        return i();
    }

    public boolean equals(Object obj) {
        return !d.class.isInstance(obj) ? false : ((d) obj).a.equals(this.a);
    }

    public Class<?> f() {
        return this.a.getDeclaringClass();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Class<?> i() {
        return this.a.getReturnType();
    }

    public String toString() {
        return this.a.toString();
    }
}
