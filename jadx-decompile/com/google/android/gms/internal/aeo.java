package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.a.d;
import com.google.android.gms.auth.a.d.a;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;

public class aeo extends w<d> {
    public aeo(Context context, Looper looper, s sVar, b bVar, c cVar) {
        super(context, looper, 120, sVar, bVar, cVar);
    }

    protected d a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }
}
