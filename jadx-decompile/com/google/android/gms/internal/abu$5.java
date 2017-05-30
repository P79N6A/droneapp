package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class abu$5 implements ThreadFactory {
    final /* synthetic */ String a;
    private final AtomicInteger b = new AtomicInteger(1);

    abu$5(String str) {
        this.a = str;
    }

    public Thread newThread(Runnable runnable) {
        String str = this.a;
        return new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 23).append("AdWorker(").append(str).append(") #").append(this.b.getAndIncrement()).toString());
    }
}
