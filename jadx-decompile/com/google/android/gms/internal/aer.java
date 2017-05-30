package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.aet.a;

public class aer extends w<aet> {
    public aer(Context context, Looper looper, s sVar, b bVar, c cVar) {
        super(context, looper, 74, sVar, bVar, cVar);
    }

    protected aet a(IBinder iBinder) {
        return a.a(iBinder);
    }

    @NonNull
    protected String a() {
        return "com.google.android.gms.auth.api.accountactivationstate.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    @NonNull
    protected String b() {
        return "com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService";
    }
}
