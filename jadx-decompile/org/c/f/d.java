package org.c.f;

import java.lang.reflect.Method;
import java.util.Comparator;
import org.c.b.h;

public enum d {
    NAME_ASCENDING(h.b),
    JVM(null),
    DEFAULT(h.a);
    
    private final Comparator<Method> d;

    private d(Comparator<Method> comparator) {
        this.d = comparator;
    }

    public Comparator<Method> a() {
        return this.d;
    }
}
