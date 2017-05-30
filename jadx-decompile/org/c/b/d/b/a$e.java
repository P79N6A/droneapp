package org.c.b.d.b;

import java.lang.annotation.Annotation;
import java.util.List;
import org.c.f.a.c;
import org.c.h;

final class a$e implements a$j {
    private a$e() {
    }

    public void a(c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
        boolean a = a.a(cVar);
        Object obj = cVar.a(h.class) != null ? 1 : null;
        if (!cVar.g()) {
            return;
        }
        if (a || obj == null) {
            list.add(new b(cVar, cls, a.a(cVar) ? "must not be static." : "must not be static or it must be annotated with @ClassRule."));
        }
    }
}
