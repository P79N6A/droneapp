package org.a.a.m;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.a.a.a.d;
import org.a.a.d.c;
import org.a.a.o.b;

@d
public abstract class a<T, C, E extends e<T, C>> implements c<T, E>, d<T> {
    private final Lock a = new ReentrantLock();
    private final b<T, C> b;
    private final Map<T, i<T, C, E>> c = new HashMap();
    private final Set<E> d = new HashSet();
    private final LinkedList<E> e = new LinkedList();
    private final LinkedList<g<E>> f = new LinkedList();
    private final Map<T, Integer> g = new HashMap();
    private volatile boolean h;
    private volatile int i;
    private volatile int j;

    public a(b<T, C> bVar, int i, int i2) {
        this.b = (b) org.a.a.o.a.a((Object) bVar, "Connection factory");
        this.i = org.a.a.o.a.b(i, "Max per route value");
        this.j = org.a.a.o.a.b(i2, "Max total value");
    }

    private E a(T t, Object obj, long j, TimeUnit timeUnit, g<E> gVar) {
        Date date = null;
        if (j > 0) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(j));
        }
        this.a.lock();
        i c = c(t);
        e eVar = null;
        while (eVar == null) {
            b.a(!this.h, "Connection pool shut down");
            while (true) {
                E b = c.b(obj);
                if (b != null) {
                    if (!b.e() && !b.a(System.currentTimeMillis())) {
                        break;
                    }
                    b.f();
                    this.e.remove(b);
                    c.a(b, false);
                } else {
                    break;
                }
            }
            if (b != null) {
                this.e.remove(b);
                this.d.add(b);
                this.a.unlock();
                return b;
            }
            int i;
            int d = d(t);
            int max = Math.max(0, (c.e() + 1) - d);
            if (max > 0) {
                for (i = 0; i < max; i++) {
                    e f = c.f();
                    if (f == null) {
                        break;
                    }
                    f.f();
                    this.e.remove(f);
                    c.a(f);
                }
            }
            if (c.e() < d) {
                i = Math.max(this.j - this.d.size(), 0);
                if (i > 0) {
                    if (this.e.size() > i - 1 && !this.e.isEmpty()) {
                        e eVar2 = (e) this.e.removeLast();
                        eVar2.f();
                        c(eVar2.h()).a(eVar2);
                    }
                    E c2 = c.c(this.b.a(t));
                    this.d.add(c2);
                    this.a.unlock();
                    return c2;
                }
            }
            try {
                c.a((g) gVar);
                this.f.add(gVar);
                boolean a = gVar.a(date);
                c.b((g) gVar);
                this.f.remove(gVar);
                if (!a && date != null && date.getTime() <= System.currentTimeMillis()) {
                    break;
                }
            } catch (Throwable th) {
                this.a.unlock();
            }
        }
        throw new TimeoutException("Timeout waiting for connection");
    }

    private i<T, C, E> c(final T t) {
        i<T, C, E> iVar = (i) this.c.get(t);
        if (iVar != null) {
            return iVar;
        }
        i anonymousClass1 = new i<T, C, E>(this, t) {
            final /* synthetic */ a b;

            protected E a(C c) {
                return this.b.a(t, (Object) c);
            }
        };
        this.c.put(t, anonymousClass1);
        return anonymousClass1;
    }

    private int d(T t) {
        Integer num = (Integer) this.g.get(t);
        return num != null ? num.intValue() : this.i;
    }

    private void g() {
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            i iVar = (i) ((Entry) it.next()).getValue();
            if (iVar.e() + iVar.c() == 0) {
                it.remove();
            }
        }
    }

    public Future<E> a(T t, Object obj, c<E> cVar) {
        org.a.a.o.a.a((Object) t, "Route");
        b.a(!this.h, "Connection pool shut down");
        final T t2 = t;
        final Object obj2 = obj;
        return new g<E>(this, this.a, cVar) {
            final /* synthetic */ a c;

            public E a(long j, TimeUnit timeUnit) {
                e a = this.c.a(t2, obj2, j, timeUnit, this);
                this.c.a(a);
                return a;
            }

            public /* synthetic */ Object b(long j, TimeUnit timeUnit) {
                return a(j, timeUnit);
            }
        };
    }

    protected abstract E a(T t, C c);

    public h a(T t) {
        h hVar;
        org.a.a.o.a.a((Object) t, "Route");
        this.a.lock();
        try {
            i c = c(t);
            hVar = new h(c.b(), c.c(), c.d(), d(t));
            return hVar;
        } finally {
            hVar = this.a;
            hVar.unlock();
        }
    }

    public void a(int i) {
        org.a.a.o.a.b(i, "Max value");
        this.a.lock();
        try {
            this.j = i;
        } finally {
            this.a.unlock();
        }
    }

    public void a(long j, TimeUnit timeUnit) {
        long j2 = 0;
        org.a.a.o.a.a((Object) timeUnit, "Time unit");
        long toMillis = timeUnit.toMillis(j);
        if (toMillis >= 0) {
            j2 = toMillis;
        }
        j2 = System.currentTimeMillis() - j2;
        a(new f<T, C>(this) {
            final /* synthetic */ a b;

            public void a(e<T, C> eVar) {
                if (eVar.m() <= j2) {
                    eVar.f();
                }
            }
        });
    }

    public void a(T t, int i) {
        org.a.a.o.a.a((Object) t, "Route");
        org.a.a.o.a.b(i, "Max per route value");
        this.a.lock();
        try {
            this.g.put(t, Integer.valueOf(i));
        } finally {
            this.a.unlock();
        }
    }

    protected void a(E e) {
    }

    public void a(E e, boolean z) {
        this.a.lock();
        try {
            if (this.d.remove(e)) {
                i c = c(e.h());
                c.a(e, z);
                if (!z || this.h) {
                    e.f();
                } else {
                    this.e.addFirst(e);
                    b((e) e);
                }
                g g = c.g();
                if (g != null) {
                    this.f.remove(g);
                } else {
                    g = (g) this.f.poll();
                }
                if (g != null) {
                    g.a();
                }
            }
            this.a.unlock();
        } catch (Throwable th) {
            this.a.unlock();
        }
    }

    protected void a(f<T, C> fVar) {
        this.a.lock();
        try {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                fVar.a(eVar);
                if (eVar.e()) {
                    c(eVar.h()).a(eVar);
                    it.remove();
                }
            }
            g();
        } finally {
            this.a.unlock();
        }
    }

    public boolean a() {
        return this.h;
    }

    public int b(T t) {
        org.a.a.o.a.a((Object) t, "Route");
        this.a.lock();
        try {
            int d = d(t);
            return d;
        } finally {
            this.a.unlock();
        }
    }

    public Future<E> b(T t, Object obj) {
        return a(t, obj, null);
    }

    public void b() {
        if (!this.h) {
            this.h = true;
            this.a.lock();
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).f();
                }
                for (e f : this.d) {
                    f.f();
                }
                for (i h : this.c.values()) {
                    h.h();
                }
                this.c.clear();
                this.d.clear();
                this.e.clear();
            } finally {
                this.a.unlock();
            }
        }
    }

    public void b(int i) {
        org.a.a.o.a.b(i, "Max per route value");
        this.a.lock();
        try {
            this.i = i;
        } finally {
            this.a.unlock();
        }
    }

    protected void b(E e) {
    }

    protected void b(f<T, C> fVar) {
        this.a.lock();
        try {
            for (e a : this.d) {
                fVar.a(a);
            }
        } finally {
            this.a.unlock();
        }
    }

    public int c() {
        this.a.lock();
        try {
            int i = this.j;
            return i;
        } finally {
            this.a.unlock();
        }
    }

    public int d() {
        this.a.lock();
        try {
            int i = this.i;
            return i;
        } finally {
            this.a.unlock();
        }
    }

    public h e() {
        this.a.lock();
        try {
            h hVar = new h(this.d.size(), this.f.size(), this.e.size(), this.j);
            return hVar;
        } finally {
            this.a.unlock();
        }
    }

    public void f() {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new f<T, C>(this) {
            final /* synthetic */ a b;

            public void a(e<T, C> eVar) {
                if (eVar.a(currentTimeMillis)) {
                    eVar.f();
                }
            }
        });
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[leased: ");
        stringBuilder.append(this.d);
        stringBuilder.append("][available: ");
        stringBuilder.append(this.e);
        stringBuilder.append("][pending: ");
        stringBuilder.append(this.f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
