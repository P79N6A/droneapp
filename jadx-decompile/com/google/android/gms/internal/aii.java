package com.google.android.gms.internal;

public class aii extends Exception {
    public final zb a;
    private long b;

    public aii() {
        this.a = null;
    }

    public aii(zb zbVar) {
        this.a = zbVar;
    }

    public aii(Throwable th) {
        super(th);
        this.a = null;
    }

    void a(long j) {
        this.b = j;
    }
}
