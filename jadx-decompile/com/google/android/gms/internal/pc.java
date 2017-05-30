package com.google.android.gms.internal;

import java.lang.reflect.Type;
import java.util.Collection;

public final class pc implements ok {
    private final os a;

    private static final class a<E> extends oj<Collection<E>> {
        private final oj<E> a;
        private final ox<? extends Collection<E>> b;

        public a(nr nrVar, Type type, oj<E> ojVar, ox<? extends Collection<E>> oxVar) {
            this.a = new pm(nrVar, ojVar, type);
            this.b = oxVar;
        }

        public Collection<E> a(pp ppVar) {
            if (ppVar.f() == pq.NULL) {
                ppVar.j();
                return null;
            }
            Collection<E> collection = (Collection) this.b.a();
            ppVar.a();
            while (ppVar.e()) {
                collection.add(this.a.b(ppVar));
            }
            ppVar.b();
            return collection;
        }

        public void a(ps psVar, Collection<E> collection) {
            if (collection == null) {
                psVar.f();
                return;
            }
            psVar.b();
            for (E a : collection) {
                this.a.a(psVar, a);
            }
            psVar.c();
        }

        public /* synthetic */ Object b(pp ppVar) {
            return a(ppVar);
        }
    }

    public pc(os osVar) {
        this.a = osVar;
    }

    public <T> oj<T> a(nr nrVar, po<T> poVar) {
        Type b = poVar.b();
        Class a = poVar.a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        Type a2 = or.a(b, a);
        return new a(nrVar, a2, nrVar.a(po.a(a2)), this.a.a((po) poVar));
    }
}
