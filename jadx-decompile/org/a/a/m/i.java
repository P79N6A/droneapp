package org.a.a.m;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.a.a.a.c;
import org.a.a.o.a;
import org.a.a.o.b;

@c
abstract class i<T, C, E extends e<T, C>> {
    private final T a;
    private final Set<E> b = new HashSet();
    private final LinkedList<E> c = new LinkedList();
    private final LinkedList<g<E>> d = new LinkedList();

    i(T t) {
        this.a = t;
    }

    public final T a() {
        return this.a;
    }

    protected abstract E a(C c);

    public void a(E e, boolean z) {
        a.a((Object) e, "Pool entry");
        b.a(this.b.remove(e), "Entry %s has not been leased from this pool", e);
        if (z) {
            this.c.addFirst(e);
        }
    }

    public void a(g<E> gVar) {
        if (gVar != null) {
            this.d.add(gVar);
        }
    }

    public boolean a(E e) {
        a.a((Object) e, "Pool entry");
        return this.c.remove(e) || this.b.remove(e);
    }

    public int b() {
        return this.b.size();
    }

    public E b(Object obj) {
        if (!this.c.isEmpty()) {
            Iterator it;
            e eVar;
            if (obj != null) {
                it = this.c.iterator();
                while (it.hasNext()) {
                    eVar = (e) it.next();
                    if (obj.equals(eVar.l())) {
                        it.remove();
                        this.b.add(eVar);
                        return eVar;
                    }
                }
            }
            it = this.c.iterator();
            while (it.hasNext()) {
                eVar = (e) it.next();
                if (eVar.l() == null) {
                    it.remove();
                    this.b.add(eVar);
                    return eVar;
                }
            }
        }
        return null;
    }

    public void b(g<E> gVar) {
        if (gVar != null) {
            this.d.remove(gVar);
        }
    }

    public int c() {
        return this.d.size();
    }

    public E c(C c) {
        E a = a((Object) c);
        this.b.add(a);
        return a;
    }

    public int d() {
        return this.c.size();
    }

    public int e() {
        return this.c.size() + this.b.size();
    }

    public E f() {
        return !this.c.isEmpty() ? (e) this.c.getLast() : null;
    }

    public g<E> g() {
        return (g) this.d.poll();
    }

    public void h() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((g) it.next()).cancel(true);
        }
        this.d.clear();
        it = this.c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).f();
        }
        this.c.clear();
        for (e f : this.b) {
            f.f();
        }
        this.b.clear();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[route: ");
        stringBuilder.append(this.a);
        stringBuilder.append("][leased: ");
        stringBuilder.append(this.b.size());
        stringBuilder.append("][available: ");
        stringBuilder.append(this.c.size());
        stringBuilder.append("][pending: ");
        stringBuilder.append(this.d.size());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
