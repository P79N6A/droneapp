package com.mining.app.zxing.b;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class f {
    private static final int a = 300;
    private final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor(new a(null));
    private final Activity c;
    private ScheduledFuture<?> d = null;

    public f(Activity activity) {
        this.c = activity;
        a();
    }

    private void c() {
        if (this.d != null) {
            this.d.cancel(true);
            this.d = null;
        }
    }

    public void a() {
        c();
        this.d = this.b.schedule(new e(this.c), 300, TimeUnit.SECONDS);
    }

    public void b() {
        c();
        this.b.shutdown();
    }
}
