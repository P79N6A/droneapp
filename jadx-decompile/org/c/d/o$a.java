package org.c.d;

import java.util.concurrent.TimeUnit;

public class o$a {
    private boolean a = false;
    private long b = 0;
    private TimeUnit c = TimeUnit.SECONDS;

    protected o$a() {
    }

    protected long a() {
        return this.b;
    }

    public o$a a(long j, TimeUnit timeUnit) {
        this.b = j;
        this.c = timeUnit;
        return this;
    }

    public o$a a(boolean z) {
        this.a = z;
        return this;
    }

    protected TimeUnit b() {
        return this.c;
    }

    protected boolean c() {
        return this.a;
    }

    public o d() {
        return new o(this);
    }
}
