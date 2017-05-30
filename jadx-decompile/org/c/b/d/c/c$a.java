package org.c.b.d.c;

import java.util.concurrent.TimeUnit;
import org.c.f.a.j;

public class c$a {
    private boolean a;
    private long b;
    private TimeUnit c;

    private c$a() {
        this.a = false;
        this.b = 0;
        this.c = TimeUnit.SECONDS;
    }

    public c$a a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout must be non-negative");
        } else if (timeUnit == null) {
            throw new NullPointerException("TimeUnit cannot be null");
        } else {
            this.b = j;
            this.c = timeUnit;
            return this;
        }
    }

    public c$a a(boolean z) {
        this.a = z;
        return this;
    }

    public c a(j jVar) {
        if (jVar != null) {
            return new c(this, jVar, null);
        }
        throw new NullPointerException("statement cannot be null");
    }
}
