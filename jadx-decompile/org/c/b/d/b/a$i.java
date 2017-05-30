package org.c.b.d.b;

import java.lang.annotation.Annotation;
import java.util.List;
import org.c.f.a.c;

final class a$i implements a$j {
    private a$i() {
    }

    public void a(c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
        if (!a.c(cVar)) {
            list.add(new b(cVar, cls, "must return an implementation of TestRule."));
        }
    }
}
