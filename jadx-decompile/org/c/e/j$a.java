package org.c.e;

import org.c.e.b.b;
import org.c.e.b.b.a;

@a
class j$a extends b {
    final /* synthetic */ j a;

    private j$a(j jVar) {
        this.a = jVar;
    }

    public void a(org.c.e.b.a aVar) {
        j.d(this.a).add(aVar);
    }

    public void a(c cVar) {
        j.c(this.a).getAndIncrement();
    }

    public void a(j jVar) {
        j.b(this.a).addAndGet(System.currentTimeMillis() - j.a(this.a).get());
    }

    public void b(org.c.e.b.a aVar) {
    }

    public void c(c cVar) {
        j.e(this.a).getAndIncrement();
    }

    public void d(c cVar) {
        j.a(this.a).set(System.currentTimeMillis());
    }
}
