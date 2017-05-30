package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ajm implements ThreadFactory {
    private final String a;
    private final int b;
    private final AtomicInteger c;
    private final ThreadFactory d;

    public ajm(String str) {
        this(str, 0);
    }

    public ajm(String str, int i) {
        this.c = new AtomicInteger();
        this.d = Executors.defaultThreadFactory();
        this.a = (String) d.a(str, "Name must not be null");
        this.b = i;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.d.newThread(new ajn(runnable, this.b));
        String str = this.a;
        newThread.setName(new StringBuilder(String.valueOf(str).length() + 13).append(str).append("[").append(this.c.getAndIncrement()).append("]").toString());
        return newThread;
    }
}
