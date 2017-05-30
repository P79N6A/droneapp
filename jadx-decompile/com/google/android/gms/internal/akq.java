package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;

public class akq extends akn<ale> {
    public static final g<akq> a = new g();
    public static final com.google.android.gms.common.api.a<b> e = new com.google.android.gms.common.api.a("Fitness.GOALS_API", new a(), a);

    public static class a extends com.google.android.gms.common.api.a.b<akq, b> {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (b) obj, bVar, cVar);
        }

        public akq a(Context context, Looper looper, s sVar, b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new akq(context, looper, sVar, bVar2, cVar);
        }
    }

    public akq(Context context, Looper looper, s sVar, com.google.android.gms.common.api.g.b bVar, c cVar) {
        super(context, looper, 125, bVar, cVar, sVar);
    }

    public ale a(IBinder iBinder) {
        return com.google.android.gms.internal.ale.a.a(iBinder);
    }

    public String a() {
        return "com.google.android.gms.fitness.GoalsApi";
    }

    public /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    public String b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi";
    }
}
