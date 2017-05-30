package org.c.f;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.c.b.d.c.e;
import org.c.d.f;
import org.c.d.h;
import org.c.d.l;
import org.c.e.c;
import org.c.f.a.d;
import org.c.f.a.j;
import org.c.k;
import org.c.m;
import org.c.m.a;

public class b extends f<d> {
    private final ConcurrentHashMap<d, c> a = new ConcurrentHashMap();

    public b(Class<?> cls) {
        super(cls);
    }

    private Class<? extends Throwable> a(m mVar) {
        return (mVar == null || mVar.a() == a.class) ? null : mVar.a();
    }

    private j a(d dVar, List<l> list, Object obj, j jVar) {
        for (f fVar : e(obj)) {
            if (!list.contains(fVar)) {
                jVar = fVar.a(jVar, dVar, obj);
            }
        }
        return jVar;
    }

    private j a(d dVar, List<l> list, j jVar) {
        return list.isEmpty() ? jVar : new h(jVar, list, c(dVar));
    }

    private boolean b(m mVar) {
        return a(mVar) != null;
    }

    private long c(m mVar) {
        return mVar == null ? 0 : mVar.b();
    }

    private List<f> e(Object obj) {
        return a(obj);
    }

    private j e(d dVar, Object obj, j jVar) {
        List b = b(obj);
        return a(dVar, b, a(dVar, b, obj, jVar));
    }

    private void i(List<Throwable> list) {
        org.c.b.d.b.a.d.a(g(), (List) list);
    }

    private boolean j() {
        return g().d().getConstructors().length == 1;
    }

    protected List<d> a() {
        return g().b(m.class);
    }

    protected List<f> a(Object obj) {
        List<f> b = g().b(obj, org.c.l.class, f.class);
        b.addAll(g().a(obj, org.c.l.class, f.class));
        return b;
    }

    protected j a(d dVar) {
        try {
            Object a = new 1(this).a();
            return e(dVar, a, d(dVar, a, c(dVar, a, b(dVar, a, a(dVar, a, a(dVar, a))))));
        } catch (Throwable th) {
            return new org.c.b.d.c.b(th);
        }
    }

    protected j a(d dVar, Object obj) {
        return new org.c.b.d.c.d(dVar, obj);
    }

    protected j a(d dVar, Object obj, j jVar) {
        m mVar = (m) dVar.a(m.class);
        return b(mVar) ? new org.c.b.d.c.a(jVar, a(mVar)) : jVar;
    }

    protected void a(List<Throwable> list) {
        super.a((List) list);
        d((List) list);
        b((List) list);
        g(list);
        h(list);
        i(list);
    }

    protected void a(d dVar, org.c.e.b.c cVar) {
        c c = c(dVar);
        if (b(dVar)) {
            cVar.c(c);
        } else {
            a(a(dVar), c, cVar);
        }
    }

    protected Object b() {
        return g().f().newInstance(new Object[0]);
    }

    protected List<l> b(Object obj) {
        List<l> b = g().b(obj, org.c.l.class, l.class);
        b.addAll(g().a(obj, org.c.l.class, l.class));
        return b;
    }

    @Deprecated
    protected j b(d dVar, Object obj, j jVar) {
        long c = c((m) dVar.a(m.class));
        return c <= 0 ? jVar : org.c.b.d.c.c.b().a(c, TimeUnit.MILLISECONDS).a(jVar);
    }

    protected void b(List<Throwable> list) {
        e((List) list);
        f(list);
    }

    protected boolean b(d dVar) {
        return dVar.a(k.class) != null;
    }

    protected List<d> c() {
        return a();
    }

    protected c c(d dVar) {
        c cVar = (c) this.a.get(dVar);
        if (cVar != null) {
            return cVar;
        }
        cVar = c.a(g().d(), d(dVar), dVar.a());
        this.a.putIfAbsent(dVar, cVar);
        return cVar;
    }

    protected j c(d dVar, Object obj, j jVar) {
        List b = g().b(org.c.f.class);
        return b.isEmpty() ? jVar : new org.c.b.d.c.f(jVar, b, obj);
    }

    protected void c(List<Throwable> list) {
        a(m.class, false, (List) list);
    }

    protected /* synthetic */ boolean c(Object obj) {
        return b((d) obj);
    }

    protected String d(d dVar) {
        return dVar.b();
    }

    protected /* synthetic */ c d(Object obj) {
        return c((d) obj);
    }

    protected j d(d dVar, Object obj, j jVar) {
        List b = g().b(org.c.a.class);
        return b.isEmpty() ? jVar : new e(jVar, b, obj);
    }

    protected void d(List<Throwable> list) {
        if (g().h()) {
            list.add(new Exception("The inner class " + g().e() + " is not static."));
        }
    }

    protected void e(List<Throwable> list) {
        if (!j()) {
            list.add(new Exception("Test class should have exactly one public constructor"));
        }
    }

    protected void f(List<Throwable> list) {
        if (!g().h() && j() && g().f().getParameterTypes().length != 0) {
            list.add(new Exception("Test class should have exactly one public zero-argument constructor"));
        }
    }

    @Deprecated
    protected void g(List<Throwable> list) {
        a(org.c.a.class, false, (List) list);
        a(org.c.f.class, false, (List) list);
        c((List) list);
        if (a().size() == 0) {
            list.add(new Exception("No runnable methods"));
        }
    }

    protected void h(List<Throwable> list) {
        org.c.b.d.b.a.b.a(g(), (List) list);
    }
}
