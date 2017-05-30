package com.google.android.gms.internal;

public abstract class oj<T> {
    public final nx a(T t) {
        try {
            ps pgVar = new pg();
            a(pgVar, t);
            return pgVar.a();
        } catch (Throwable e) {
            throw new ny(e);
        }
    }

    public abstract void a(ps psVar, T t);

    public abstract T b(pp ppVar);
}
