package com.google.android.gms.internal;

public final class pe implements ok {
    private final os a;

    public pe(os osVar) {
        this.a = osVar;
    }

    static oj<?> a(os osVar, nr nrVar, po<?> poVar, ol olVar) {
        Class a = olVar.a();
        if (oj.class.isAssignableFrom(a)) {
            return (oj) osVar.a(po.b(a)).a();
        }
        if (ok.class.isAssignableFrom(a)) {
            return ((ok) osVar.a(po.b(a)).a()).a(nrVar, poVar);
        }
        throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
    }

    public <T> oj<T> a(nr nrVar, po<T> poVar) {
        ol olVar = (ol) poVar.a().getAnnotation(ol.class);
        return olVar == null ? null : a(this.a, nrVar, poVar, olVar);
    }
}
