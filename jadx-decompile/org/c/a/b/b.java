package org.c.a.b;

import b.b.n;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.c.b.d.e;
import org.c.e.c;
import org.c.e.h;
import org.c.e.i;
import org.c.e.j;
import org.c.e.l;
import org.c.f.g;

public class b {
    private static final String a = "malformed JUnit 3 test class: ";
    private final c b;

    private b(File file) {
        this.b = c.a(file);
    }

    public static b a(File file) {
        return new b(file);
    }

    @Deprecated
    public static b a(String str) {
        return a(new File(str));
    }

    private i a(List<c> list) {
        List arrayList = new ArrayList();
        for (c a : list) {
            arrayList.add(a(a));
        }
        return new 1(this, arrayList);
    }

    private l a(c cVar) {
        if (cVar.toString().equals("TestSuite with 0 tests")) {
            return g.a();
        }
        if (cVar.toString().startsWith(a)) {
            return new e(new n(b(cVar)));
        }
        Class i = cVar.i();
        if (i == null) {
            throw new RuntimeException("Can't build a runner from description [" + cVar + "]");
        }
        String k = cVar.k();
        return k == null ? i.a(i).a() : i.a(i, k).a();
    }

    private void a(c cVar, c cVar2, List<c> list) {
        if (!cVar2.b().isEmpty()) {
            Iterator it = cVar2.b().iterator();
            while (it.hasNext()) {
                a(cVar2, (c) it.next(), list);
            }
        } else if (cVar2.toString().equals("warning(junit.framework.TestSuite$1)")) {
            list.add(c.a(a + cVar, new Annotation[0]));
        } else {
            list.add(cVar2);
        }
    }

    private Class<?> b(c cVar) {
        try {
            return Class.forName(cVar.toString().replace(a, ""));
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    private List<c> d(i iVar) {
        List<c> arrayList = new ArrayList();
        a(null, iVar.a().d(), arrayList);
        return arrayList;
    }

    public j a(Class<?> cls) {
        return a(i.a(cls));
    }

    public j a(i iVar) {
        return a(iVar, new h());
    }

    public j a(i iVar, h hVar) {
        hVar.a(this.b.a());
        return hVar.a(b(iVar).a());
    }

    public i b(i iVar) {
        if (iVar instanceof org.c.b.c.c) {
            return iVar;
        }
        List d = d(iVar);
        Collections.sort(d, this.b.b());
        return a(d);
    }

    public List<c> c(i iVar) {
        return d(b(iVar));
    }
}
