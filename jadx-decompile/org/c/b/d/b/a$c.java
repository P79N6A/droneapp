package org.c.b.d.b;

import java.lang.annotation.Annotation;
import java.util.List;
import org.c.f.a.c;

final class a$c implements a$j {
    private a$c() {
    }

    public void a(c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
        if (!a.b(cVar)) {
            list.add(new b(cVar, cls, "must implement MethodRule or TestRule."));
        }
    }
}
