package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ahl.b;
import com.google.android.gms.internal.ail;

final class ab<T> extends ba<Status> {
    private T a;
    private ail<T> b;
    private a<T> c;

    interface a<T> {
        void a(ar arVar, b<Status> bVar, T t, ail<T> com_google_android_gms_internal_ail_T);
    }

    private ab(g gVar, T t, ail<T> com_google_android_gms_internal_ail_T, a<T> aVar) {
        super(gVar);
        this.a = d.a(t);
        this.b = (ail) d.a(com_google_android_gms_internal_ail_T);
        this.c = (a) d.a(aVar);
    }

    static <T> i<Status> a(g gVar, a<T> aVar, T t) {
        return gVar.a(new ab(gVar, t, gVar.a(t), aVar));
    }

    protected Status a(Status status) {
        this.a = null;
        this.b = null;
        return status;
    }

    protected void a(ar arVar) {
        this.c.a(arVar, this, this.a, this.b);
        this.a = null;
        this.b = null;
    }

    protected /* synthetic */ m b(Status status) {
        return a(status);
    }
}
