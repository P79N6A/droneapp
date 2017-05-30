package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.p.b;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.measurement.internal.y.a;

public class aa extends p<y> {
    public aa(Context context, Looper looper, b bVar, c cVar) {
        super(context, looper, 93, bVar, cVar, null);
    }

    public y a(IBinder iBinder) {
        return a.a(iBinder);
    }

    @NonNull
    protected String a() {
        return "com.google.android.gms.measurement.START";
    }

    public /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    @NonNull
    protected String b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
}
