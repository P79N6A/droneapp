package org.c.b.d.b;

import java.lang.annotation.Annotation;
import org.c.f.a.c;

class b extends Exception {
    public b(c<?> cVar, Class<? extends Annotation> cls, String str) {
        super(String.format("The @%s '%s' %s", new Object[]{cls.getSimpleName(), cVar.b(), str}));
    }
}
