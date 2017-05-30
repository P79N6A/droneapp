package com.google.android.gms.g;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

class l<TResult> implements o<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private b<TResult> c;

    public l(@NonNull Executor executor, @NonNull b<TResult> bVar) {
        this.a = executor;
        this.c = bVar;
    }

    public void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    public void a(@NonNull final f<TResult> fVar) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new Runnable(this) {
                final /* synthetic */ l b;

                public void run() {
                    synchronized (this.b.b) {
                        if (this.b.c != null) {
                            this.b.c.a(fVar);
                        }
                    }
                }
            });
        }
    }
}
