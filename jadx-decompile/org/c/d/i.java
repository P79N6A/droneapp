package org.c.d;

import java.util.concurrent.TimeUnit;
import org.c.e;
import org.c.e.c;
import org.c.f.a.j;

public abstract class i implements l {
    private final a a;
    private volatile long b;
    private volatile long c;

    static class a {
        a() {
        }

        public long a() {
            return System.nanoTime();
        }
    }

    private class b extends m {
        final /* synthetic */ i a;

        private b(i iVar) {
            this.a = iVar;
        }

        protected void a(Throwable th, c cVar) {
            this.a.c();
            this.a.a(this.a.a(), th, cVar);
        }

        protected void a(c cVar) {
            this.a.b();
        }

        protected void a(e eVar, c cVar) {
            this.a.c();
            this.a.a(this.a.a(), eVar, cVar);
        }

        protected void b(c cVar) {
            this.a.b(this.a.a(), cVar);
        }

        protected void c(c cVar) {
            this.a.c();
            this.a.a(this.a.a(), cVar);
        }
    }

    public i() {
        this(new a());
    }

    i(a aVar) {
        this.a = aVar;
    }

    private long a() {
        if (this.b == 0) {
            throw new IllegalStateException("Test has not started");
        }
        long j = this.c;
        if (j == 0) {
            j = this.a.a();
        }
        return j - this.b;
    }

    private void b() {
        this.b = this.a.a();
        this.c = 0;
    }

    private void c() {
        this.c = this.a.a();
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(a(), TimeUnit.NANOSECONDS);
    }

    public final j a(j jVar, c cVar) {
        return new b().a(jVar, cVar);
    }

    protected void a(long j, Throwable th, c cVar) {
    }

    protected void a(long j, c cVar) {
    }

    protected void a(long j, e eVar, c cVar) {
    }

    protected void b(long j, c cVar) {
    }
}
