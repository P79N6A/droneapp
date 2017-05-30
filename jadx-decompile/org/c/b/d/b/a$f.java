package org.c.b.d.b;

import java.lang.annotation.Annotation;
import java.util.List;
import org.c.f.a.c;

final class a$f implements a$j {
    private a$f() {
    }

    public void a(c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
        if (!cVar.h()) {
            list.add(new b(cVar, cls, "must be public."));
        }
    }
}
