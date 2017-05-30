package org.c.e.b;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.c.e.b.b.a;
import org.c.e.j;

public class c {
    private final List<b> a = new CopyOnWriteArrayList();
    private volatile boolean b = false;

    private void a(List<b> list, List<a> list2) {
        if (!list2.isEmpty()) {
            new 4(this, list, list2).a();
        }
    }

    public void a() {
        this.b = true;
    }

    public void a(a aVar) {
        a(this.a, Arrays.asList(new a[]{aVar}));
    }

    public void a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Cannot add a null listener");
        }
        this.a.add(c(bVar));
    }

    public void a(org.c.e.c cVar) {
        new 1(this, cVar).a();
    }

    public void a(j jVar) {
        new 2(this, jVar).a();
    }

    public void b(a aVar) {
        new 5(this, aVar).a();
    }

    public void b(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Cannot remove a null listener");
        }
        this.a.remove(c(bVar));
    }

    public void b(org.c.e.c cVar) {
        if (this.b) {
            throw new d();
        }
        new 3(this, cVar).a();
    }

    b c(b bVar) {
        return bVar.getClass().isAnnotationPresent(a.class) ? bVar : new e(bVar, this);
    }

    public void c(org.c.e.c cVar) {
        new 6(this, cVar).a();
    }

    public void d(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Cannot add a null listener");
        }
        this.a.add(0, c(bVar));
    }

    public void d(org.c.e.c cVar) {
        new 7(this, cVar).a();
    }
}
