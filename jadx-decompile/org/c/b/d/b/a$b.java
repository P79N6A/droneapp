package org.c.b.d.b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.List;
import org.c.f.a.c;

final class a$b implements a$j {
    private a$b() {
    }

    private boolean a(c<?> cVar) {
        return Modifier.isPublic(cVar.f().getModifiers());
    }

    public void a(c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
        if (!a(cVar)) {
            list.add(new b(cVar, cls, "must be declared in a public class."));
        }
    }
}
