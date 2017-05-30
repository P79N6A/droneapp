package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class pb<E> extends oj<Object> {
    public static final ok a = new ok() {
        public <T> oj<T> a(nr nrVar, po<T> poVar) {
            Type b = poVar.b();
            if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
                return null;
            }
            b = or.g(b);
            return new pb(nrVar, nrVar.a(po.a(b)), or.e(b));
        }
    };
    private final Class<E> b;
    private final oj<E> c;

    public pb(nr nrVar, oj<E> ojVar, Class<E> cls) {
        this.c = new pm(nrVar, ojVar, cls);
        this.b = cls;
    }

    public void a(ps psVar, Object obj) {
        if (obj == null) {
            psVar.f();
            return;
        }
        psVar.b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.a(psVar, Array.get(obj, i));
        }
        psVar.c();
    }

    public Object b(pp ppVar) {
        if (ppVar.f() == pq.NULL) {
            ppVar.j();
            return null;
        }
        List arrayList = new ArrayList();
        ppVar.a();
        while (ppVar.e()) {
            arrayList.add(this.c.b(ppVar));
        }
        ppVar.b();
        Object newInstance = Array.newInstance(this.b, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }
}
