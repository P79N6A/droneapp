package org.c.b.b;

import java.lang.reflect.Method;
import org.b.b;
import org.c.b.h;

@Deprecated
public abstract class d<T> extends b<T> {
    private Class<?> a;

    protected d() {
        this.a = a(getClass());
    }

    protected d(Class<T> cls) {
        this.a = cls;
    }

    private static Class<?> a(Class<?> cls) {
        Class superclass;
        while (superclass != Object.class) {
            for (Method method : h.a(superclass)) {
                if (a(method)) {
                    return method.getParameterTypes()[0];
                }
            }
            superclass = superclass.getSuperclass();
        }
        throw new Error("Cannot determine correct type for matchesSafely() method.");
    }

    private static boolean a(Method method) {
        return method.getName().equals("matchesSafely") && method.getParameterTypes().length == 1 && !method.isSynthetic();
    }

    public final boolean a(Object obj) {
        return obj != null && this.a.isInstance(obj) && b(obj);
    }

    public abstract boolean b(T t);
}
