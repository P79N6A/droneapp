package org.c.d;

import org.c.e.c;
import org.c.f.a.j;

public abstract class e implements l {
    private j a(final j jVar) {
        return new j(this) {
            final /* synthetic */ e b;

            public void a() {
                this.b.a();
                try {
                    jVar.a();
                } finally {
                    this.b.b();
                }
            }
        };
    }

    public j a(j jVar, c cVar) {
        return a(jVar);
    }

    protected void a() {
    }

    protected void b() {
    }
}
