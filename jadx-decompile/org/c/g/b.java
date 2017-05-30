package org.c.g;

import java.util.concurrent.ConcurrentHashMap;

public class b {
    private static final ConcurrentHashMap<f, a> a = new ConcurrentHashMap();

    public a a(f fVar) {
        a aVar = (a) a.get(fVar);
        if (aVar == null) {
            Class a = fVar.a();
            if (a == null) {
                throw new IllegalArgumentException("Can't create validator, value is null in annotation " + fVar.getClass().getName());
            }
            try {
                a.putIfAbsent(fVar, (a) a.newInstance());
                aVar = (a) a.get(fVar);
            } catch (Throwable e) {
                throw new RuntimeException("Exception received when creating AnnotationValidator class " + a.getName(), e);
            }
        }
        return aVar;
    }
}
