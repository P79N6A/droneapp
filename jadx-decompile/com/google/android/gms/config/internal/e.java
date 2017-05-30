package com.google.android.gms.config.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.config.internal.j.a;

public class e extends w<j> {
    public e(Context context, Looper looper, s sVar, b bVar, c cVar) {
        super(context, looper, 64, sVar, bVar, cVar);
    }

    protected j a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.config.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.config.internal.IConfigService";
    }
}
