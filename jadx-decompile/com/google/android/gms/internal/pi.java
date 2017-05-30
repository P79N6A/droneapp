package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class pi extends oj<Object> {
    public static final ok a = new ok() {
        public <T> oj<T> a(nr nrVar, po<T> poVar) {
            return poVar.a() == Object.class ? new pi(nrVar) : null;
        }
    };
    private final nr b;

    private pi(nr nrVar) {
        this.b = nrVar;
    }

    public void a(ps psVar, Object obj) {
        if (obj == null) {
            psVar.f();
            return;
        }
        oj a = this.b.a(obj.getClass());
        if (a instanceof pi) {
            psVar.d();
            psVar.e();
            return;
        }
        a.a(psVar, obj);
    }

    public Object b(pp ppVar) {
        switch (ppVar.f()) {
            case BEGIN_ARRAY:
                List arrayList = new ArrayList();
                ppVar.a();
                while (ppVar.e()) {
                    arrayList.add(b(ppVar));
                }
                ppVar.b();
                return arrayList;
            case BEGIN_OBJECT:
                Map owVar = new ow();
                ppVar.c();
                while (ppVar.e()) {
                    owVar.put(ppVar.g(), b(ppVar));
                }
                ppVar.d();
                return owVar;
            case STRING:
                return ppVar.h();
            case NUMBER:
                return Double.valueOf(ppVar.k());
            case BOOLEAN:
                return Boolean.valueOf(ppVar.i());
            case NULL:
                ppVar.j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }
}
