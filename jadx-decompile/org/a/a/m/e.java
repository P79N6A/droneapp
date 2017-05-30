package org.a.a.m;

import java.util.concurrent.TimeUnit;
import org.a.a.a.a;
import org.a.a.a.d;

@d
public abstract class e<T, C> {
    private final String a;
    private final T b;
    private final C c;
    private final long d;
    private final long e;
    @a(a = "this")
    private long f;
    @a(a = "this")
    private long g;
    private volatile Object h;

    public e(String str, T t, C c) {
        this(str, t, c, 0, TimeUnit.MILLISECONDS);
    }

    public e(String str, T t, C c, long j, TimeUnit timeUnit) {
        org.a.a.o.a.a((Object) t, "Route");
        org.a.a.o.a.a((Object) c, org.a.a.e.j);
        org.a.a.o.a.a((Object) timeUnit, "Time unit");
        this.a = str;
        this.b = t;
        this.c = c;
        this.d = System.currentTimeMillis();
        if (j > 0) {
            this.e = this.d + timeUnit.toMillis(j);
        } else {
            this.e = Long.MAX_VALUE;
        }
        this.g = this.e;
    }

    public synchronized void a(long j, TimeUnit timeUnit) {
        org.a.a.o.a.a((Object) timeUnit, "Time unit");
        this.f = System.currentTimeMillis();
        this.g = Math.min(j > 0 ? this.f + timeUnit.toMillis(j) : Long.MAX_VALUE, this.e);
    }

    public void a(Object obj) {
        this.h = obj;
    }

    public synchronized boolean a(long j) {
        return j >= this.g;
    }

    public abstract boolean e();

    public abstract void f();

    public String g() {
        return this.a;
    }

    public T h() {
        return this.b;
    }

    public C i() {
        return this.c;
    }

    public long j() {
        return this.d;
    }

    public long k() {
        return this.e;
    }

    public Object l() {
        return this.h;
    }

    public synchronized long m() {
        return this.f;
    }

    public synchronized long n() {
        return this.g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[id:");
        stringBuilder.append(this.a);
        stringBuilder.append("][route:");
        stringBuilder.append(this.b);
        stringBuilder.append("][state:");
        stringBuilder.append(this.h);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
