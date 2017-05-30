package org.c.b.d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.c.b;
import org.c.b.h;
import org.c.f;
import org.c.g;
import org.c.m;

@Deprecated
public class j {
    private final Class<?> a;

    public j(Class<?> cls) {
        this.a = cls;
    }

    private boolean a(Method method, Method method2) {
        if (!method2.getName().equals(method.getName()) || method2.getParameterTypes().length != method.getParameterTypes().length) {
            return false;
        }
        for (int i = 0; i < method2.getParameterTypes().length; i++) {
            if (!method2.getParameterTypes()[i].equals(method.getParameterTypes()[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean a(Method method, List<Method> list) {
        for (Method a : list) {
            if (a(method, a)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(Class<? extends Annotation> cls) {
        return cls.equals(f.class) || cls.equals(g.class);
    }

    private List<Class<?>> c(Class<?> cls) {
        List arrayList = new ArrayList();
        Class superclass;
        while (superclass != null) {
            arrayList.add(superclass);
            superclass = superclass.getSuperclass();
        }
        return arrayList;
    }

    public List<Method> a() {
        return a(m.class);
    }

    public List<Method> a(Class<? extends Annotation> cls) {
        List arrayList = new ArrayList();
        for (Class a : c(this.a)) {
            for (Method method : h.a(a)) {
                if (!(method.getAnnotation(cls) == null || a(method, arrayList))) {
                    arrayList.add(method);
                }
            }
        }
        if (b(cls)) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    List<Method> b() {
        return a(g.class);
    }

    List<Method> c() {
        return a(b.class);
    }

    public Constructor<?> d() {
        return this.a.getConstructor(new Class[0]);
    }

    public Class<?> e() {
        return this.a;
    }

    public String f() {
        return this.a.getName();
    }
}
