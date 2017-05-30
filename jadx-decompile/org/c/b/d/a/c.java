package org.c.b.d.a;

import java.lang.reflect.InvocationTargetException;

public abstract class c {
    public Object a() {
        try {
            return b();
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

    protected abstract Object b();
}
