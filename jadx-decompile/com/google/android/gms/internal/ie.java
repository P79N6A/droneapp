package com.google.android.gms.internal;

import com.google.android.gms.internal.kc.a;
import com.google.firebase.database.c;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ie {
    static final /* synthetic */ boolean a = (!ie.class.desiredAssertionStatus());
    private AtomicBoolean b = new AtomicBoolean(false);
    private if c;
    private boolean d = false;

    public abstract ie a(kg kgVar);

    public abstract kb a(ka kaVar, kg kgVar);

    public abstract kg a();

    public void a(if ifVar) {
        if (!a && c()) {
            throw new AssertionError();
        } else if (a || this.c == null) {
            this.c = ifVar;
        } else {
            throw new AssertionError();
        }
    }

    public abstract void a(kb kbVar);

    public abstract void a(c cVar);

    public void a(boolean z) {
        this.d = z;
    }

    public abstract boolean a(ie ieVar);

    public abstract boolean a(a aVar);

    public void b() {
        if (this.b.compareAndSet(false, true) && this.c != null) {
            this.c.a(this);
            this.c = null;
        }
    }

    public boolean c() {
        return this.b.get();
    }

    public boolean d() {
        return this.d;
    }
}
