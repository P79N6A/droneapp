package com.android.volley;

public class u extends Exception {
    public final j a;
    private long b;

    public u() {
        this.a = null;
    }

    public u(j jVar) {
        this.a = jVar;
    }

    public u(String str) {
        super(str);
        this.a = null;
    }

    public u(String str, Throwable th) {
        super(str, th);
        this.a = null;
    }

    public u(Throwable th) {
        super(th);
        this.a = null;
    }

    void a(long j) {
        this.b = j;
    }

    public long b() {
        return this.b;
    }
}
