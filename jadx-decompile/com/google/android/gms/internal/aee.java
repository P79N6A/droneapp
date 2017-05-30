package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.aeb.a;

public class aee extends w<aeb> {
    public aee(Context context, Looper looper, s sVar, b bVar, c cVar) {
        super(context, looper, 19, sVar, bVar, cVar);
    }

    protected aeb a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    public aeb h() {
        return (aeb) G();
    }
}
