package com.google.android.gms.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.u;

public class aid<O extends a> extends ahu {
    private final u<O> c;

    public aid(u<O> uVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.c = uVar;
    }

    public <A extends c, R extends m, T extends ahl.a<R, A>> T a(@NonNull T t) {
        return this.c.a(t);
    }

    public void a(aiw com_google_android_gms_internal_aiw) {
        this.c.b();
    }

    public <A extends c, T extends ahl.a<? extends m, A>> T b(@NonNull T t) {
        return this.c.b(t);
    }

    public void b(aiw com_google_android_gms_internal_aiw) {
        this.c.c();
    }

    public Looper c() {
        return this.c.h();
    }
}
