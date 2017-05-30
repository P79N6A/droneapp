package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.d;

public class Strategy$a {
    private int a = 3;
    private int b = 300;
    private int c = 0;
    private int d = -1;

    public Strategy$a a(int i) {
        this.a = i;
        return this;
    }

    public Strategy a() {
        if (this.d == 2 && this.c == 1) {
            throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
        }
        return new Strategy(2, 0, this.b, this.c, false, this.d, this.a);
    }

    public Strategy$a b(int i) {
        this.d = i;
        return this;
    }

    public Strategy$a c(int i) {
        boolean z = i == Integer.MAX_VALUE || (i > 0 && i <= Strategy.g);
        d.b(z, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", new Object[]{Integer.valueOf(i), Integer.valueOf(Strategy.g)});
        this.b = i;
        return this;
    }

    public Strategy$a d(int i) {
        this.c = i;
        return this;
    }
}
