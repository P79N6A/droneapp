package com.google.android.gms.nearby.internal.connection.dev;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.nearby.internal.connection.dev.u.a;
import com.xiaomi.market.sdk.j;

public final class k extends w<u> {
    private final long a = ((long) hashCode());

    public k(Context context, Looper looper, s sVar, b bVar, c cVar) {
        super(context, looper, 54, sVar, bVar, cVar);
    }

    protected u a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService";
    }

    protected Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putLong(j.aa, this.a);
        return bundle;
    }

    public void f() {
        if (t()) {
            try {
                ((u) G()).a(new ClientDisconnectingParams());
            } catch (Throwable e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        super.f();
    }
}
