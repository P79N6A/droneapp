package com.google.android.gms.analytics.internal;

public abstract class t extends s {
    private boolean a;

    protected t(v vVar) {
        super(vVar);
    }

    public boolean C() {
        return this.a;
    }

    protected void D() {
        if (!C()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public void E() {
        a();
        this.a = true;
    }

    protected abstract void a();
}
