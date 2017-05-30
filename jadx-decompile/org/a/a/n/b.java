package org.a.a.n;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.a.a.a.c;

@c
final class b<E> {
    private final LinkedList<E> a = new LinkedList();
    private final Map<Class<?>, E> b = new HashMap();

    private void c(E e) {
        Object remove = this.b.remove(e.getClass());
        if (remove != null) {
            this.a.remove(remove);
        }
        this.b.put(e.getClass(), e);
    }

    public LinkedList<E> a() {
        return new LinkedList(this.a);
    }

    public b<E> a(E e) {
        if (e != null) {
            c(e);
            this.a.addFirst(e);
        }
        return this;
    }

    public b<E> a(Collection<E> collection) {
        if (collection != null) {
            for (E a : collection) {
                a((Object) a);
            }
        }
        return this;
    }

    public b<E> a(E... eArr) {
        if (eArr != null) {
            for (Object a : eArr) {
                a(a);
            }
        }
        return this;
    }

    public b<E> b(E e) {
        if (e != null) {
            c(e);
            this.a.addLast(e);
        }
        return this;
    }

    public b<E> b(Collection<E> collection) {
        if (collection != null) {
            for (E b : collection) {
                b((Object) b);
            }
        }
        return this;
    }

    public b<E> b(E... eArr) {
        if (eArr != null) {
            for (Object b : eArr) {
                b(b);
            }
        }
        return this;
    }
}
