package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.anc.a;

public class amx extends w<anc> {
    public amx(Context context, Looper looper, b bVar, c cVar, s sVar) {
        super(context, looper, 69, sVar, bVar, cVar);
    }

    protected anc a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
    }
}
