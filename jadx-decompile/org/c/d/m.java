package org.c.d;

import java.util.List;
import org.c.b.b;
import org.c.e;
import org.c.e.c;
import org.c.f.a.j;

public abstract class m implements l {
    private void a(Throwable th, c cVar, List<Throwable> list) {
        try {
            a(th, cVar);
        } catch (Throwable th2) {
            list.add(th2);
        }
    }

    private void a(b bVar, c cVar, List<Throwable> list) {
        try {
            if (bVar instanceof e) {
                a((e) bVar, cVar);
            } else {
                a(bVar, cVar);
            }
        } catch (Throwable th) {
            list.add(th);
        }
    }

    private void a(c cVar, List<Throwable> list) {
        try {
            c(cVar);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    private void b(c cVar, List<Throwable> list) {
        try {
            a(cVar);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    private void c(c cVar, List<Throwable> list) {
        try {
            b(cVar);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    public j a(j jVar, c cVar) {
        return new 1(this, cVar, jVar);
    }

    protected void a(Throwable th, c cVar) {
    }

    @Deprecated
    protected void a(b bVar, c cVar) {
    }

    protected void a(c cVar) {
    }

    protected void a(e eVar, c cVar) {
        a((b) eVar, cVar);
    }

    protected void b(c cVar) {
    }

    protected void c(c cVar) {
    }
}
