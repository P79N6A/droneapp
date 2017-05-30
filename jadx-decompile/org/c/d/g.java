package org.c.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.c.e.c;
import org.c.f.a.j;

public class g implements l {
    private static final g a = new g(Collections.emptyList());
    private List<l> b;

    private g(List<l> list) {
        this.b = list;
    }

    public static g a() {
        return a;
    }

    public static g a(l lVar) {
        return a().b(lVar);
    }

    public j a(j jVar, c cVar) {
        for (l a : this.b) {
            jVar = a.a(jVar, cVar);
        }
        return jVar;
    }

    public g b(l lVar) {
        List arrayList = new ArrayList();
        arrayList.add(lVar);
        arrayList.addAll(this.b);
        return new g(arrayList);
    }
}
