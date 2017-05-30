package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.a.a;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;

public final class g extends w<k> {
    @Nullable
    private final a a;

    public g(Context context, Looper looper, s sVar, a aVar, b bVar, c cVar) {
        super(context, looper, 68, sVar, bVar, cVar);
        this.a = aVar;
    }

    protected k a(IBinder iBinder) {
        return k.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    protected Bundle c() {
        return this.a == null ? new Bundle() : this.a.b();
    }

    a d() {
        return this.a;
    }
}
