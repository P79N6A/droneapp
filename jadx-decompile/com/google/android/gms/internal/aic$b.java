package com.google.android.gms.internal;

import android.os.Process;
import android.util.SparseArray;
import com.google.android.gms.common.api.u;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicBoolean;

final class aic$b extends Thread {
    private final ReferenceQueue<u<?>> a;
    private final SparseArray<aic$a> b;
    private final AtomicBoolean c = new AtomicBoolean();

    public aic$b(ReferenceQueue<u<?>> referenceQueue, SparseArray<aic$a> sparseArray) {
        super("GoogleApiCleanup");
        this.a = referenceQueue;
        this.b = sparseArray;
    }

    public void run() {
        this.c.set(true);
        Process.setThreadPriority(10);
        while (this.c.get()) {
            try {
                aic$a com_google_android_gms_internal_aic_a = (aic$a) this.a.remove();
                this.b.remove(com_google_android_gms_internal_aic_a.b);
                com_google_android_gms_internal_aic_a.a();
            } catch (InterruptedException e) {
            } finally {
                this.c.set(false);
            }
        }
    }
}
