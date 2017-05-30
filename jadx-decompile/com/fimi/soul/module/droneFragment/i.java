package com.fimi.soul.module.droneFragment;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class i {
    public static int a = 0;
    public static int b = 1;
    private static AtomicInteger c = new AtomicInteger(a);
    private static AtomicInteger d = new AtomicInteger(a);
    private static AtomicInteger e = new AtomicInteger(a);
    private static AtomicBoolean f = new AtomicBoolean(true);

    public static AtomicInteger a() {
        return c;
    }

    public static void a(int i) {
        e.set(i);
    }

    public static void a(boolean z) {
        f.set(z);
    }

    public static AtomicInteger b() {
        return d;
    }

    public static void b(int i) {
        d.set(i);
    }

    public static AtomicInteger c() {
        return e;
    }

    public static void c(int i) {
        c.set(i);
    }

    public static AtomicBoolean d() {
        return f;
    }
}
