package com.google.android.gms.internal;

import com.google.android.gms.internal.pj.a;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class pm<T> extends oj<T> {
    private final nr a;
    private final oj<T> b;
    private final Type c;

    pm(nr nrVar, oj<T> ojVar, Type type) {
        this.a = nrVar;
        this.b = ojVar;
        this.c = type;
    }

    private Type a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    public void a(ps psVar, T t) {
        oj ojVar = this.b;
        Type a = a(this.c, (Object) t);
        if (a != this.c) {
            ojVar = this.a.a(po.a(a));
            if ((ojVar instanceof a) && !(this.b instanceof a)) {
                ojVar = this.b;
            }
        }
        ojVar.a(psVar, t);
    }

    public T b(pp ppVar) {
        return this.b.b(ppVar);
    }
}
