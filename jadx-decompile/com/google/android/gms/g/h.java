package com.google.android.gms.g;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

public final class h {
    public static final Executor a = new a();
    static final Executor b = new Executor() {
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    };

    private static final class a implements Executor {
        private final Handler a = new Handler(Looper.getMainLooper());

        public void execute(@NonNull Runnable runnable) {
            this.a.post(runnable);
        }
    }

    private h() {
    }
}
