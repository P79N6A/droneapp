package org.b.b;

import java.lang.reflect.Method;

public class b {
    private final String a;
    private final int b;
    private final int c;

    public b(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public Class<?> a(Class<?> cls) {
        Class superclass;
        while (superclass != Object.class) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (a(method)) {
                    return b(method);
                }
            }
            superclass = superclass.getSuperclass();
        }
        throw new Error("Cannot determine correct type for " + this.a + "() method.");
    }

    protected boolean a(Method method) {
        return method.getName().equals(this.a) && method.getParameterTypes().length == this.b && !method.isSynthetic();
    }

    protected Class<?> b(Method method) {
        return method.getParameterTypes()[this.c];
    }
}
