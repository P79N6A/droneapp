package org.c.f.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class b extends c<b> {
    private final Field a;

    b(Field field) {
        if (field == null) {
            throw new NullPointerException("FrameworkField cannot be created without an underlying field.");
        }
        this.a = field;
    }

    public Object a(Object obj) {
        return this.a.get(obj);
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return this.a.getAnnotation(cls);
    }

    public boolean a(b bVar) {
        return bVar.b().equals(b());
    }

    public Annotation[] a() {
        return this.a.getAnnotations();
    }

    public String b() {
        return d().getName();
    }

    protected int c() {
        return this.a.getModifiers();
    }

    public Field d() {
        return this.a;
    }

    public Class<?> e() {
        return this.a.getType();
    }

    public Class<?> f() {
        return this.a.getDeclaringClass();
    }

    public String toString() {
        return this.a.toString();
    }
}
