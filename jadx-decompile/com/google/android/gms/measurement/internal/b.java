package com.google.android.gms.measurement.internal;

abstract class b extends al {
    private boolean a;

    b(aj ajVar) {
        super(ajVar);
        this.n.a(this);
    }

    boolean a() {
        return this.a;
    }

    boolean b() {
        return false;
    }

    protected void c() {
        if (!a()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void d() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        e();
        this.n.J();
        this.a = true;
    }

    protected abstract void e();
}
