package com.google.android.gms.internal;

import java.util.concurrent.Future;

@aaa
public abstract class abq implements abx<Future> {
    private final Runnable a;
    private volatile Thread b;
    private boolean c;

    public abq() {
        this.a = new 1(this);
        this.c = false;
    }

    public abq(boolean z) {
        this.a = new 1(this);
        this.c = z;
    }

    public abstract void a();

    public abstract void b();

    public final void d() {
        b();
        if (this.b != null) {
            this.b.interrupt();
        }
    }

    public /* synthetic */ Object e() {
        return h();
    }

    public final Future h() {
        return this.c ? abu.a(1, this.a) : abu.a(this.a);
    }
}
