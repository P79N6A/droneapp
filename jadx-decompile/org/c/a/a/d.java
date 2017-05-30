package org.c.a.a;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.c.b;
import org.c.f;
import org.c.g;
import org.c.g.a;

public final class d extends a {
    private static final Set<Class<? extends Annotation>> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Class[]{g.class, b.class, f.class, org.c.a.class})));

    private void a(List<Exception> list, Class<?> cls) {
        list.add(new Exception(String.format("@%s can not be combined with @Category", new Object[]{cls.getSimpleName()})));
    }

    public List<Exception> a(org.c.f.a.d dVar) {
        List arrayList = new ArrayList();
        for (Annotation annotation : dVar.a()) {
            for (Class cls : a) {
                if (annotation.annotationType().isAssignableFrom(cls)) {
                    a(arrayList, cls);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
