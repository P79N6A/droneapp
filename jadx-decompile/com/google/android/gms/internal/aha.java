package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ahd.a;

public class aha extends w<ahd> {
    public aha(Context context, Looper looper, s sVar, b bVar, c cVar) {
        super(context, looper, 40, sVar, bVar, cVar);
    }

    protected ahd a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.clearcut.service.START";
    }

    public void a(ahc com_google_android_gms_internal_ahc, LogEventParcelable logEventParcelable) {
        ((ahd) G()).a(com_google_android_gms_internal_ahc, logEventParcelable);
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }
}
