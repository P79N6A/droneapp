package org.c.f.a;

import java.lang.reflect.Modifier;
import java.util.List;

public abstract class c<T extends c<T>> implements a {
    boolean a(List<T> list) {
        for (T a : list) {
            if (a((c) a)) {
                return true;
            }
        }
        return false;
    }

    abstract boolean a(T t);

    public abstract String b();

    protected abstract int c();

    public abstract Class<?> e();

    public abstract Class<?> f();

    public boolean g() {
        return Modifier.isStatic(c());
    }

    public boolean h() {
        return Modifier.isPublic(c());
    }
}
