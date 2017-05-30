package org.c.a.e.a;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.c.a.e.a;
import org.c.a.e.b;
import org.c.a.e.c;
import org.c.f.a.d;
import org.c.f.a.k;

public class f extends a {
    public f(k kVar) {
        super(kVar);
    }

    protected Collection<d> b(org.c.a.e.d dVar) {
        Collection<d> b = super.b(dVar);
        String a = ((c) dVar.e(c.class)).a();
        Collection arrayList = new ArrayList();
        for (d dVar2 : b) {
            if (Arrays.asList(((b) dVar2.a(b.class)).a()).contains(a)) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    protected Collection<Field> c(org.c.a.e.d dVar) {
        Collection<Field> c = super.c(dVar);
        String a = ((c) dVar.e(c.class)).a();
        Collection arrayList = new ArrayList();
        for (Field field : c) {
            if (Arrays.asList(((a) field.getAnnotation(a.class)).a()).contains(a)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    protected Collection<Field> d(org.c.a.e.d dVar) {
        Collection<Field> d = super.d(dVar);
        String a = ((c) dVar.e(c.class)).a();
        Collection arrayList = new ArrayList();
        for (Field field : d) {
            if (Arrays.asList(((b) field.getAnnotation(b.class)).a()).contains(a)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    protected Collection<d> e(org.c.a.e.d dVar) {
        Collection<d> e = super.e(dVar);
        String a = ((c) dVar.e(c.class)).a();
        Collection arrayList = new ArrayList();
        for (d dVar2 : e) {
            if (Arrays.asList(((a) dVar2.a(a.class)).a()).contains(a)) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }
}
