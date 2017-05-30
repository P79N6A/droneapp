package org.c.f.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.c.b.d.b;
import org.c.e.l;

public abstract class h {
    private final Set<Class<?>> a = new HashSet();

    private List<l> a(Class<?>[] clsArr) {
        List arrayList = new ArrayList();
        for (Class c : clsArr) {
            l c2 = c(c);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        return arrayList;
    }

    public List<l> a(Class<?> cls, List<Class<?>> list) {
        return a((Class) cls, (Class[]) list.toArray(new Class[0]));
    }

    public List<l> a(Class<?> cls, Class<?>[] clsArr) {
        d(cls);
        try {
            List<l> a = a((Class[]) clsArr);
            return a;
        } finally {
            e(cls);
        }
    }

    public abstract l a(Class<?> cls);

    public l c(Class<?> cls) {
        try {
            return a((Class) cls);
        } catch (Throwable th) {
            return new b(cls, th);
        }
    }

    Class<?> d(Class<?> cls) {
        if (this.a.add(cls)) {
            return cls;
        }
        throw new e(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", new Object[]{cls.getName()}));
    }

    void e(Class<?> cls) {
        this.a.remove(cls);
    }
}
