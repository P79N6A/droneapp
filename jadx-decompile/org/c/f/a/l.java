package org.c.f.a;

import java.util.concurrent.TimeUnit;

public class l extends Exception {
    private static final long serialVersionUID = 31935685163547539L;
    private final TimeUnit a;
    private final long b;

    public l(long j, TimeUnit timeUnit) {
        super(String.format("test timed out after %d %s", new Object[]{Long.valueOf(j), timeUnit.name().toLowerCase()}));
        this.a = timeUnit;
        this.b = j;
    }

    public long a() {
        return this.b;
    }

    public TimeUnit b() {
        return this.a;
    }
}
