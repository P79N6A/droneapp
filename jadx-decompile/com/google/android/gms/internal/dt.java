package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class dt {
    private final ScheduledExecutorService a;
    private ScheduledFuture<?> b;
    private String c;
    private boolean d;

    public dt() {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public dt(String str) {
        this(Executors.newSingleThreadScheduledExecutor());
        this.c = str;
    }

    dt(ScheduledExecutorService scheduledExecutorService) {
        this.b = null;
        this.c = null;
        this.a = scheduledExecutorService;
        this.d = false;
    }

    public void a(Context context, dl dlVar, long j, dh dhVar) {
        synchronized (this) {
            if (this.b != null) {
                this.b.cancel(false);
            }
            this.b = this.a.schedule(this.c != null ? new ds(context, dlVar, dhVar, this.c) : new ds(context, dlVar, dhVar), j, TimeUnit.MILLISECONDS);
        }
    }
}
