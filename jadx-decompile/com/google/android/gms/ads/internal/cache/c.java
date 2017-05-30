package com.google.android.gms.ads.internal.cache;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.cache.f.a;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.p.b;
import com.google.android.gms.internal.aaa;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

@aaa
public class c extends p<f> {
    c(Context context, Looper looper, b bVar, com.google.android.gms.common.internal.p.c cVar) {
        super(context, looper, Opcodes.LSHR, bVar, cVar, null);
    }

    protected f a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public f a_() {
        return (f) super.G();
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }
}
