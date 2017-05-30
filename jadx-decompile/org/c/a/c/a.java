package org.c.a.c;

import java.util.List;
import org.c.e.b.b;
import org.c.e.j;

class a {
    private final List<org.c.e.b.a> a;

    public a(List<org.c.e.b.a> list) {
        this.a = list;
    }

    public j a() {
        j jVar = new j();
        b g = jVar.g();
        for (org.c.e.b.a a : this.a) {
            try {
                g.a(a);
            } catch (Exception e) {
                throw new RuntimeException("I can't believe this happened");
            }
        }
        return jVar;
    }
}
