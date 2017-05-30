package org.c.d;

import java.util.concurrent.TimeUnit;
import org.c.b.d.c.c;
import org.c.f.a.j;

public class o implements l {
    private final long a;
    private final TimeUnit b;
    private final boolean c;

    @Deprecated
    public o(int i) {
        this((long) i, TimeUnit.MILLISECONDS);
    }

    public o(long j, TimeUnit timeUnit) {
        this.a = j;
        this.b = timeUnit;
        this.c = false;
    }

    protected o(a aVar) {
        this.a = aVar.a();
        this.b = aVar.b();
        this.c = aVar.c();
    }

    public static a a() {
        return new a();
    }

    public static o a(long j) {
        return new o(j, TimeUnit.MILLISECONDS);
    }

    public static o b(long j) {
        return new o(j, TimeUnit.SECONDS);
    }

    protected final long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.a, this.b);
    }

    protected j a(j jVar) {
        return c.b().a(this.a, this.b).a(this.c).a(jVar);
    }

    public j a(j jVar, org.c.e.c cVar) {
        try {
            return a(jVar);
        } catch (Exception e) {
            return new 1(this, e);
        }
    }

    protected final boolean b() {
        return this.c;
    }
}
