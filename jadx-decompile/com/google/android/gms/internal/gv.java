package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;

public class gv implements ig {
    private final Handler a = new Handler(Looper.getMainLooper());

    public void a() {
    }

    public void a(Runnable runnable) {
        this.a.post(runnable);
    }

    public void b() {
    }
}
