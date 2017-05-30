package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import com.google.firebase.c.p;
import java.util.concurrent.Executor;

public class nf {
    private final Handler a;
    private final Executor b;

    public nf(@Nullable Executor executor) {
        this.b = executor;
        if (this.b != null) {
            this.a = null;
        } else if (Looper.myLooper() != null) {
            this.a = new Handler();
        } else {
            this.a = null;
        }
    }

    public void a(@NonNull Runnable runnable) {
        d.a(runnable);
        if (this.a != null) {
            this.a.post(runnable);
        } else if (this.b != null) {
            this.b.execute(runnable);
        } else {
            p.a().d(runnable);
        }
    }
}
