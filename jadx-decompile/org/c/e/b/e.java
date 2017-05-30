package org.c.e.b;

import org.c.e.b.b.a;
import org.c.e.c;
import org.c.e.j;

@a
final class e extends b {
    private final b a;
    private final Object b;

    e(b bVar, Object obj) {
        this.a = bVar;
        this.b = obj;
    }

    public void a(a aVar) {
        synchronized (this.b) {
            this.a.a(aVar);
        }
    }

    public void a(c cVar) {
        synchronized (this.b) {
            this.a.a(cVar);
        }
    }

    public void a(j jVar) {
        synchronized (this.b) {
            this.a.a(jVar);
        }
    }

    public void b(a aVar) {
        synchronized (this.b) {
            this.a.b(aVar);
        }
    }

    public void b(c cVar) {
        synchronized (this.b) {
            this.a.b(cVar);
        }
    }

    public void c(c cVar) {
        synchronized (this.b) {
            this.a.c(cVar);
        }
    }

    public void d(c cVar) {
        synchronized (this.b) {
            this.a.d(cVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.a.equals(((e) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString() + " (with synchronization wrapper)";
    }
}
