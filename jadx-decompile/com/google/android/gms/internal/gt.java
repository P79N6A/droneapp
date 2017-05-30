package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

public class gt implements Executor {
    private static gt a = new gt();
    private Handler b = new Handler(Looper.getMainLooper());

    private gt() {
    }

    public static gt a() {
        return a;
    }

    public void execute(@NonNull Runnable runnable) {
        this.b.post(runnable);
    }
}
