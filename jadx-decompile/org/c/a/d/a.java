package org.c.a.d;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.c.f.a.h;
import org.c.f.g;

public class a extends g {
    public a(Class<?> cls, h hVar) {
        super(hVar, cls, a(cls.getClasses()));
    }

    private static Class<?>[] a(Class<?>[] clsArr) {
        List arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add(cls);
            }
        }
        return (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }
}
