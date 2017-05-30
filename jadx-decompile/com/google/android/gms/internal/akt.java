package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;

public class akt extends akn<alh> {
    public static final g<akt> a = new g();
    public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.a.b> e = new com.google.android.gms.common.api.a("Fitness.RECORDING_API", new b(), a);

    static abstract class a<R extends m> extends com.google.android.gms.internal.ahl.a<R, akt> {
        public a(com.google.android.gms.common.api.g gVar) {
            super(akt.e, gVar);
        }
    }

    public static class b extends com.google.android.gms.common.api.a.b<akt, com.google.android.gms.common.api.a.a.b> {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
            return a(context, looper, sVar, (com.google.android.gms.common.api.a.a.b) obj, bVar, cVar);
        }

        public akt a(Context context, Looper looper, s sVar, com.google.android.gms.common.api.a.a.b bVar, com.google.android.gms.common.api.g.b bVar2, com.google.android.gms.common.api.g.c cVar) {
            return new akt(context, looper, sVar, bVar2, cVar);
        }
    }

    static abstract class c extends a<Status> {
        c(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        protected Status a(Status status) {
            d.b(!status.f());
            return status;
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public akt(Context context, Looper looper, s sVar, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
        super(context, looper, 56, bVar, cVar, sVar);
    }

    public alh a(IBinder iBinder) {
        return com.google.android.gms.internal.alh.a.a(iBinder);
    }

    public String a() {
        return "com.google.android.gms.fitness.RecordingApi";
    }

    public /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    public String b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitRecordingApi";
    }
}
