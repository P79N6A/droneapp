package org.c.b.a;

import b.c.a;
import org.c.b.d.i;
import org.c.e.l;

public class h extends org.c.f.a.h {
    public l a(Class<?> cls) {
        return b(cls) ? new i(cls) : null;
    }

    public boolean b(Class<?> cls) {
        try {
            cls.getMethod(a.a, new Class[0]);
            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }
}
