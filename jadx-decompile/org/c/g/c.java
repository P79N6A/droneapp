package org.c.g;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.c.f.a.k;

public final class c implements e {
    private static final List<a<?>> a = Arrays.asList(new a[]{new b(), new d(), new c()});

    private static abstract class a<T extends org.c.f.a.a> {
        private static final b a = new b();

        private a() {
        }

        private List<Exception> a(T t) {
            List<Exception> arrayList = new ArrayList();
            for (Annotation annotationType : t.a()) {
                f fVar = (f) annotationType.annotationType().getAnnotation(f.class);
                if (fVar != null) {
                    arrayList.addAll(a(a.a(fVar), t));
                }
            }
            return arrayList;
        }

        abstract Iterable<T> a(k kVar);

        abstract List<Exception> a(a aVar, T t);

        public List<Exception> b(k kVar) {
            List<Exception> arrayList = new ArrayList();
            for (org.c.f.a.a a : a(kVar)) {
                arrayList.addAll(a(a));
            }
            return arrayList;
        }
    }

    private static class b extends a<k> {
        private b() {
            super();
        }

        Iterable<k> a(k kVar) {
            return Collections.singletonList(kVar);
        }

        List<Exception> a(a aVar, k kVar) {
            return aVar.a(kVar);
        }
    }

    private static class c extends a<org.c.f.a.b> {
        private c() {
            super();
        }

        Iterable<org.c.f.a.b> a(k kVar) {
            return kVar.c();
        }

        List<Exception> a(a aVar, org.c.f.a.b bVar) {
            return aVar.a(bVar);
        }
    }

    private static class d extends a<org.c.f.a.d> {
        private d() {
            super();
        }

        Iterable<org.c.f.a.d> a(k kVar) {
            return kVar.b();
        }

        List<Exception> a(a aVar, org.c.f.a.d dVar) {
            return aVar.a(dVar);
        }
    }

    public List<Exception> a(k kVar) {
        List<Exception> arrayList = new ArrayList();
        for (a b : a) {
            arrayList.addAll(b.b(kVar));
        }
        return arrayList;
    }
}
