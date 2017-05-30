package org.a.a.c.f;

import java.lang.reflect.InvocationTargetException;
import org.a.a.a.b;

@b
public class a {
    private a() {
    }

    public static <T> T a(T t) {
        T t2 = null;
        if (t != null) {
            if (t instanceof Cloneable) {
                try {
                    try {
                        t2 = t.getClass().getMethod("clone", (Class[]) null).invoke(t, (Object[]) null);
                    } catch (InvocationTargetException e) {
                        Throwable cause = e.getCause();
                        if (cause instanceof CloneNotSupportedException) {
                            throw ((CloneNotSupportedException) cause);
                        }
                        throw new Error("Unexpected exception", cause);
                    } catch (IllegalAccessException e2) {
                        throw new IllegalAccessError(e2.getMessage());
                    }
                } catch (NoSuchMethodException e3) {
                    throw new NoSuchMethodError(e3.getMessage());
                }
            }
            throw new CloneNotSupportedException();
        }
        return t2;
    }

    public static Object b(Object obj) {
        return a(obj);
    }
}
