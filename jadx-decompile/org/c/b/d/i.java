package org.c.b.d;

import b.c.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class i extends e {
    public i(Class<?> cls) {
        super(a(cls));
    }

    public static b.b.i a(Class<?> cls) {
        try {
            Method method = cls.getMethod(a.a, new Class[0]);
            if (Modifier.isStatic(method.getModifiers())) {
                return (b.b.i) method.invoke(null, new Object[0]);
            }
            throw new Exception(cls.getName() + ".suite() must be static");
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
