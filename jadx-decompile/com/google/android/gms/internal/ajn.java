package com.google.android.gms.internal;

import android.os.Process;

class ajn implements Runnable {
    private final Runnable a;
    private final int b;

    public ajn(Runnable runnable, int i) {
        this.a = runnable;
        this.b = i;
    }

    public void run() {
        Process.setThreadPriority(this.b);
        this.a.run();
    }
}
