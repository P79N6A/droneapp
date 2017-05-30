package org.c.a.e.a;

import java.util.ArrayList;
import java.util.List;
import org.c.a.e.e;
import org.c.a.e.g;

public class d extends e {
    private Class<?> a;

    public d(Class<?> cls) {
        this.a = cls;
    }

    public List<g> a(org.c.a.e.d dVar) {
        Object[] enumConstants = this.a.getEnumConstants();
        List<g> arrayList = new ArrayList();
        for (Object obj : enumConstants) {
            arrayList.add(g.a(obj.toString(), obj));
        }
        return arrayList;
    }
}
