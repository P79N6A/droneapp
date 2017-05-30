package org.c.f;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.c.d.h;
import org.c.e.a.a;
import org.c.e.a.b;
import org.c.e.a.d;
import org.c.e.l;
import org.c.f.a.i;
import org.c.f.a.j;
import org.c.f.a.k;
import org.c.g;
import org.c.g.c;
import org.c.g.e;

public abstract class f<T> extends l implements b, d {
    private static final List<e> a = Arrays.asList(new e[]{new c(), new org.c.g.d()});
    private final Object b = new Object();
    private final k c;
    private volatile Collection<T> d = null;
    private volatile i e = new i(this) {
        final /* synthetic */ f a;

        {
            this.a = r1;
        }

        public void a() {
        }

        public void a(Runnable runnable) {
            runnable.run();
        }
    };

    protected f(Class<?> cls) {
        this.c = a((Class) cls);
        b();
    }

    private boolean a() {
        for (Object c : j()) {
            if (!c(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean a(a aVar, T t) {
        return aVar.a(d((Object) t));
    }

    private Comparator<? super T> b(final org.c.e.a.e eVar) {
        return new Comparator<T>(this) {
            final /* synthetic */ f b;

            public int compare(T t, T t2) {
                return eVar.a(this.b.d((Object) t), this.b.d((Object) t2));
            }
        };
    }

    private void b() {
        List arrayList = new ArrayList();
        a(arrayList);
        if (!arrayList.isEmpty()) {
            throw new org.c.f.a.e(arrayList);
        }
    }

    private void b(List<Throwable> list) {
        if (g().d() != null) {
            for (e a : a) {
                list.addAll(a.a(g()));
            }
        }
    }

    private j c(j jVar) {
        Iterable e = e();
        return e.isEmpty() ? jVar : new h(jVar, e, d());
    }

    private void c(List<Throwable> list) {
        org.c.b.d.b.a.a.a(g(), (List) list);
        org.c.b.d.b.a.c.a(g(), (List) list);
    }

    private void d(final org.c.e.b.c cVar) {
        i iVar = this.e;
        try {
            for (final Object next : j()) {
                iVar.a(new Runnable(this) {
                    final /* synthetic */ f c;

                    public void run() {
                        this.c.a(next, cVar);
                    }
                });
            }
        } finally {
            iVar.a();
        }
    }

    private Collection<T> j() {
        if (this.d == null) {
            synchronized (this.b) {
                if (this.d == null) {
                    this.d = Collections.unmodifiableCollection(c());
                }
            }
        }
        return this.d;
    }

    protected j a(j jVar) {
        List b = this.c.b(g.class);
        return b.isEmpty() ? jVar : new org.c.b.d.c.f(jVar, b, null);
    }

    protected k a(Class<?> cls) {
        return new k(cls);
    }

    protected void a(Class<? extends Annotation> cls, boolean z, List<Throwable> list) {
        for (org.c.f.a.d a : g().b((Class) cls)) {
            a.a(z, (List) list);
        }
    }

    protected abstract void a(T t, org.c.e.b.c cVar);

    protected void a(List<Throwable> list) {
        a(g.class, true, (List) list);
        a(org.c.b.class, true, (List) list);
        c((List) list);
        b((List) list);
    }

    public void a(a aVar) {
        synchronized (this.b) {
            Collection arrayList = new ArrayList(j());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (a(aVar, next)) {
                    try {
                        aVar.a(next);
                    } catch (org.c.e.a.c e) {
                        it.remove();
                    }
                } else {
                    it.remove();
                }
            }
            this.d = Collections.unmodifiableCollection(arrayList);
            if (this.d.isEmpty()) {
                throw new org.c.e.a.c();
            }
        }
    }

    public void a(org.c.e.a.e eVar) {
        synchronized (this.b) {
            for (Object a : j()) {
                eVar.a(a);
            }
            Collection arrayList = new ArrayList(j());
            Collections.sort(arrayList, b(eVar));
            this.d = Collections.unmodifiableCollection(arrayList);
        }
    }

    public void a(org.c.e.b.c cVar) {
        org.c.b.d.a.a aVar = new org.c.b.d.a.a(cVar, d());
        try {
            b(cVar).a();
        } catch (org.c.b.b e) {
            aVar.a(e);
        } catch (org.c.e.b.d e2) {
            throw e2;
        } catch (Throwable th) {
            aVar.a(th);
        }
    }

    public void a(i iVar) {
        this.e = iVar;
    }

    protected final void a(j jVar, org.c.e.c cVar, org.c.e.b.c cVar2) {
        org.c.b.d.a.a aVar = new org.c.b.d.a.a(cVar2, cVar);
        aVar.b();
        try {
            jVar.a();
        } catch (org.c.b.b e) {
            aVar.a(e);
        } catch (Throwable th) {
            aVar.a(th);
        } finally {
            aVar.a();
        }
    }

    protected j b(org.c.e.b.c cVar) {
        j c = c(cVar);
        return !a() ? c(b(a(c))) : c;
    }

    protected j b(j jVar) {
        List b = this.c.b(org.c.b.class);
        return b.isEmpty() ? jVar : new org.c.b.d.c.e(jVar, b, null);
    }

    protected abstract List<T> c();

    protected j c(final org.c.e.b.c cVar) {
        return new j(this) {
            final /* synthetic */ f b;

            public void a() {
                this.b.d(cVar);
            }
        };
    }

    protected boolean c(T t) {
        return false;
    }

    public org.c.e.c d() {
        org.c.e.c a = org.c.e.c.a(f(), i());
        for (Object d : j()) {
            a.a(d(d));
        }
        return a;
    }

    protected abstract org.c.e.c d(T t);

    protected List<org.c.d.l> e() {
        List<org.c.d.l> b = this.c.b(null, org.c.h.class, org.c.d.l.class);
        b.addAll(this.c.a(null, org.c.h.class, org.c.d.l.class));
        return b;
    }

    protected String f() {
        return this.c.e();
    }

    public final k g() {
        return this.c;
    }

    protected Annotation[] i() {
        return this.c.a();
    }
}
