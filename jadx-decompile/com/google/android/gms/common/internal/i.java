package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.a.h;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;

public class i<T extends IInterface> extends w<T> {
    private final h<T> a;

    public i(Context context, Looper looper, int i, b bVar, c cVar, s sVar, h<T> hVar) {
        super(context, looper, i, sVar, bVar, cVar);
        this.a = hVar;
    }

    protected String a() {
        return this.a.a();
    }

    protected void a(int i, T t) {
        this.a.a(i, t);
    }

    protected T b(IBinder iBinder) {
        return this.a.a(iBinder);
    }

    protected String b() {
        return this.a.b();
    }

    public h<T> h() {
        return this.a;
    }
}
