package org.c.b.d.b;

import java.lang.annotation.Annotation;
import java.util.List;
import org.c.f.a.c;

final class a$g implements a$j {
    private a$g() {
    }

    public void a(c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
        if (!cVar.g()) {
            list.add(new b(cVar, cls, "must be static."));
        }
    }
}
