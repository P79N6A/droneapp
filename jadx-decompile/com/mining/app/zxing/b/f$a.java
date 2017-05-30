package com.mining.app.zxing.b;

import java.util.concurrent.ThreadFactory;

final class f$a implements ThreadFactory {
    private f$a() {
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        return thread;
    }
}
