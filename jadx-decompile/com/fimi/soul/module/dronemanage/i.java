package com.fimi.soul.module.dronemanage;

import java.util.concurrent.atomic.AtomicInteger;

public class i {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private static AtomicInteger i = new AtomicInteger(0);

    public static final int a() {
        return i.get();
    }

    public static final void a(Integer num) {
        i.set(num.intValue());
    }
}