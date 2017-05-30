package org.c.f.b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import org.c.e.b.c;
import org.c.f.a.d;
import org.c.f.a.j;
import org.c.f.b;

public class a extends b {
    private final Object[] a;
    private final String b;

    public a(d dVar) {
        super(dVar.b().d());
        this.a = dVar.c().toArray(new Object[dVar.c().size()]);
        this.b = dVar.a();
    }

    private Object j() {
        return g().f().newInstance(this.a);
    }

    private Object k() {
        List<org.c.f.a.b> l = l();
        if (l.size() != this.a.length) {
            throw new Exception("Wrong number of parameters and @Parameter fields. @Parameter fields counted: " + l.size() + ", available parameters: " + this.a.length + ".");
        }
        Object newInstance = g().d().newInstance();
        for (org.c.f.a.b d : l) {
            Field d2 = d.d();
            int a = ((org.c.f.e.a) d2.getAnnotation(org.c.f.e.a.class)).a();
            try {
                d2.set(newInstance, this.a[a]);
            } catch (Throwable e) {
                throw new Exception(g().e() + ": Trying to set " + d2.getName() + " with the value " + this.a[a] + " that is not the right type (" + this.a[a].getClass().getSimpleName() + " instead of " + d2.getType().getSimpleName() + ").", e);
            }
        }
        return newInstance;
    }

    private List<org.c.f.a.b> l() {
        return g().c(org.c.f.e.a.class);
    }

    private boolean m() {
        return !l().isEmpty();
    }

    public Object b() {
        return m() ? k() : j();
    }

    protected j b(c cVar) {
        return c(cVar);
    }

    protected void b(List<Throwable> list) {
        e((List) list);
        if (m()) {
            f(list);
        }
    }

    protected String d(d dVar) {
        return dVar.b() + f();
    }

    protected String f() {
        return this.b;
    }

    protected void h(List<Throwable> list) {
        super.h(list);
        if (m()) {
            int a;
            List<org.c.f.a.b> l = l();
            int[] iArr = new int[l.size()];
            for (org.c.f.a.b d : l) {
                a = ((org.c.f.e.a) d.d().getAnnotation(org.c.f.e.a.class)).a();
                if (a < 0 || a > l.size() - 1) {
                    list.add(new Exception("Invalid @Parameter value: " + a + ". @Parameter fields counted: " + l.size() + ". Please use an index between 0 and " + (l.size() - 1) + "."));
                } else {
                    iArr[a] = iArr[a] + 1;
                }
            }
            for (a = 0; a < iArr.length; a++) {
                int i = iArr[a];
                if (i == 0) {
                    list.add(new Exception("@Parameter(" + a + ") is never used."));
                } else if (i > 1) {
                    list.add(new Exception("@Parameter(" + a + ") is used more than once (" + i + ")."));
                }
            }
        }
    }

    protected Annotation[] i() {
        return new Annotation[0];
    }
}
