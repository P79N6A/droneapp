package com.google.android.gms.cast.internal;

import com.google.android.gms.common.util.e;

public final class q {
    public static final Object a = new Object();
    private static final m g = new m("RequestTracker");
    private long b;
    private long c = -1;
    private long d = 0;
    private p e;
    private final e f;

    public q(e eVar, long j) {
        this.f = eVar;
        this.b = j;
    }

    private void c() {
        this.c = -1;
        this.e = null;
        this.d = 0;
    }

    public void a() {
        synchronized (a) {
            if (this.c != -1) {
                c();
            }
        }
    }

    public void a(long j, p pVar) {
        synchronized (a) {
            p pVar2 = this.e;
            long j2 = this.c;
            this.c = j;
            this.e = pVar;
            this.d = this.f.b();
        }
        if (pVar2 != null) {
            pVar2.a(j2);
        }
    }

    public boolean a(long j) {
        boolean z;
        synchronized (a) {
            z = this.c != -1 && this.c == j;
        }
        return z;
    }

    public boolean a(long j, int i) {
        return a(j, i, null);
    }

    public boolean a(long j, int i, Object obj) {
        boolean z = true;
        p pVar = null;
        synchronized (a) {
            if (this.c == -1 || this.c != j) {
                z = false;
            } else {
                g.b("request %d completed", Long.valueOf(this.c));
                pVar = this.e;
                c();
            }
        }
        if (pVar != null) {
            pVar.a(j, i, obj);
        }
        return z;
    }

    public boolean b() {
        boolean z;
        synchronized (a) {
            z = this.c != -1;
        }
        return z;
    }

    public boolean b(long j, int i) {
        p pVar;
        boolean z = true;
        long j2 = 0;
        synchronized (a) {
            if (this.c == -1 || j - this.d < this.b) {
                z = false;
                pVar = null;
            } else {
                g.b("request %d timed out", Long.valueOf(this.c));
                j2 = this.c;
                pVar = this.e;
                c();
            }
        }
        if (pVar != null) {
            pVar.a(j2, i, null);
        }
        return z;
    }
}
