package com.fimi.soul.drone.droneconnection.connection;

import android.content.Context;

public abstract class a extends d {
    private static final String h = a.class.getSimpleName();
    protected final Context a;
    private boolean i = true;

    public a(Context context) {
        this.a = context;
    }

    protected abstract int a(byte[] bArr);

    protected abstract void a();

    public void a(boolean z) {
        this.i = z;
    }

    protected int b(byte[] bArr) {
        return this.i ? a(bArr) : 0;
    }

    protected abstract void b();

    public void b(boolean z) {
        if (z) {
            this.e = true;
        } else {
            this.e = false;
        }
    }

    public boolean c() {
        return this.i;
    }

    protected final void d() {
        b();
    }

    public final void e() {
        a();
    }
}
