package org.a.a.i.b;

import java.util.concurrent.atomic.AtomicLong;

public final class q {
    private final AtomicLong a = new AtomicLong();
    private final AtomicLong b = new AtomicLong();
    private final a c = new a();
    private final a d = new a();
    private final a e = new a();
    private final a f = new a();

    static class a {
        private final AtomicLong a = new AtomicLong(0);
        private final AtomicLong b = new AtomicLong(0);

        a() {
        }

        public long a() {
            return this.a.get();
        }

        public void a(long j) {
            this.a.incrementAndGet();
            this.b.addAndGet(System.currentTimeMillis() - j);
        }

        public long b() {
            long j = this.a.get();
            return j > 0 ? this.b.get() / j : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[count=").append(a()).append(", averageDuration=").append(b()).append("]");
            return stringBuilder.toString();
        }
    }

    q() {
    }

    AtomicLong a() {
        return this.a;
    }

    AtomicLong b() {
        return this.b;
    }

    a c() {
        return this.c;
    }

    a d() {
        return this.d;
    }

    a e() {
        return this.e;
    }

    a f() {
        return this.f;
    }

    public long g() {
        return this.a.get();
    }

    public long h() {
        return this.b.get();
    }

    public long i() {
        return this.c.a();
    }

    public long j() {
        return this.c.b();
    }

    public long k() {
        return this.d.a();
    }

    public long l() {
        return this.d.b();
    }

    public long m() {
        return this.e.a();
    }

    public long n() {
        return this.e.b();
    }

    public long o() {
        return this.f.a();
    }

    public long p() {
        return this.f.b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[activeConnections=").append(this.a).append(", scheduledConnections=").append(this.b).append(", successfulConnections=").append(this.c).append(", failedConnections=").append(this.d).append(", requests=").append(this.e).append(", tasks=").append(this.f).append("]");
        return stringBuilder.toString();
    }
}
