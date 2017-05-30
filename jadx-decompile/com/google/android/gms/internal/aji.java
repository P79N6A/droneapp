package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ajk.a;

public class aji extends w<ajk> {
    public aji(Context context, Looper looper, s sVar, b bVar, c cVar) {
        super(context, looper, 39, sVar, bVar, cVar);
    }

    protected ajk a(IBinder iBinder) {
        return a.a(iBinder);
    }

    public String a() {
        return "com.google.android.gms.common.service.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
}
