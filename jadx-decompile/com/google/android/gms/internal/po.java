package com.google.android.gms.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class po<T> {
    final Class<? super T> a;
    final Type b;
    final int c;

    protected po() {
        this.b = a(getClass());
        this.a = or.e(this.b);
        this.c = this.b.hashCode();
    }

    po(Type type) {
        this.b = or.d((Type) op.a((Object) type));
        this.a = or.e(this.b);
        this.c = this.b.hashCode();
    }

    public static po<?> a(Type type) {
        return new po(type);
    }

    static Type a(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return or.d(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public static <T> po<T> b(Class<T> cls) {
        return new po(cls);
    }

    public final Class<? super T> a() {
        return this.a;
    }

    public final Type b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof po) && or.a(this.b, ((po) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return or.f(this.b);
    }
}
