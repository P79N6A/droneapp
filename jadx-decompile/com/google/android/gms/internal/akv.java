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

public class akv extends akn<alk> {
    public static final g<akv> a = new g();
    public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.a.b> e = new com.google.android.gms.common.api.a("Fitness.SESSIONS_API", new b(), a);

    static abstract class a<R extends m> extends com.google.android.gms.internal.ahl.a<R, akv> {
        public a(com.google.android.gms.common.api.g gVar) {
            super(akv.e, gVar);
        }
    }

    public static class b extends com.google.android.gms.common.api.a.b<akv, com.google.android.gms.common.api.a.a.b> {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
            return a(context, looper, sVar, (com.google.android.gms.common.api.a.a.b) obj, bVar, cVar);
        }

        public akv a(Context context, Looper looper, s sVar, com.google.android.gms.common.api.a.a.b bVar, com.google.android.gms.common.api.g.b bVar2, com.google.android.gms.common.api.g.c cVar) {
            return new akv(context, looper, sVar, bVar2, cVar);
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

    public akv(Context context, Looper looper, s sVar, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
        super(context, looper, 58, bVar, cVar, sVar);
    }

    public alk a(IBinder iBinder) {
        return com.google.android.gms.internal.alk.a.a(iBinder);
    }

    public String a() {
        return "com.google.android.gms.fitness.SessionsApi";
    }

    public /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    public String b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
    }
}
