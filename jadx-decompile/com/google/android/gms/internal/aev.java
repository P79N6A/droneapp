package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.aex.a;

public final class aev extends w<aex> {
    private final Bundle a;

    public aev(Context context, Looper looper, s sVar, c cVar, b bVar, g.c cVar2) {
        super(context, looper, 16, sVar, bVar, cVar2);
        this.a = cVar == null ? new Bundle() : cVar.a();
    }

    protected aex a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.auth.service.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    protected Bundle c() {
        return this.a;
    }

    public boolean v() {
        s J = J();
        return (TextUtils.isEmpty(J.a()) || J.a(com.google.android.gms.auth.api.b.b).isEmpty()) ? false : true;
    }
}
