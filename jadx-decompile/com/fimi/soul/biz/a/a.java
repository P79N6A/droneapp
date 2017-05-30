package com.fimi.soul.biz.a;

import java.util.concurrent.atomic.AtomicInteger;

public class a {
    public static final int a = 1;
    public static final int b = 2;
    private volatile AtomicInteger c;

    public static class a {
        public static final a a = new a();
    }

    private a() {
        this.c = new AtomicInteger(1);
    }

    public static a a() {
        return a.a;
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.set(i);
        }
    }

    public int b() {
        return this.c == null ? 0 : this.c.get();
    }

    public boolean c() {
        return this.c.get() == 2;
    }
}
