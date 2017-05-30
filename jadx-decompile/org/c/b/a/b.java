package org.c.b.a;

import java.lang.reflect.Modifier;
import org.c.e.k;
import org.c.e.l;
import org.c.f.a.e;
import org.c.f.a.h;

public class b extends h {
    private static final String a = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";
    private final h b;

    public b(h hVar) {
        this.b = hVar;
    }

    private Class<?> b(Class<?> cls) {
        return (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : cls.getEnclosingClass();
    }

    public l a(Class<?> cls) {
        Class cls2 = cls;
        while (cls2 != null) {
            k kVar = (k) cls2.getAnnotation(k.class);
            if (kVar != null) {
                return a(kVar.a(), cls);
            }
            cls2 = b(cls2);
        }
        return null;
    }

    public l a(Class<? extends l> cls, Class<?> cls2) {
        try {
            return (l) cls.getConstructor(new Class[]{Class.class}).newInstance(new Object[]{cls2});
        } catch (NoSuchMethodException e) {
            try {
                return (l) cls.getConstructor(new Class[]{Class.class, h.class}).newInstance(new Object[]{cls2, this.b});
            } catch (NoSuchMethodException e2) {
                String simpleName = cls.getSimpleName();
                throw new e(String.format(a, new Object[]{simpleName, simpleName}));
            }
        }
    }
}
