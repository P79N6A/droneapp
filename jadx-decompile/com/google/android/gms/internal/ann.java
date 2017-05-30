package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.anl.a;

public class ann extends w<anl> {
    public ann(Context context, Looper looper, s sVar, b bVar, c cVar) {
        super(context, looper, 3, sVar, bVar, cVar);
    }

    public anl a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.panorama.service.START";
    }

    public /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }
}
