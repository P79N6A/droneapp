package com.google.android.gms.g;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

class n<TResult> implements o<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private d<? super TResult> c;

    public n(@NonNull Executor executor, @NonNull d<? super TResult> dVar) {
        this.a = executor;
        this.c = dVar;
    }

    public void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    public void a(@NonNull final f<TResult> fVar) {
        if (fVar.b()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new Runnable(this) {
                    final /* synthetic */ n b;

                    public void run() {
                        synchronized (this.b.b) {
                            if (this.b.c != null) {
                                this.b.c.a(fVar.c());
                            }
                        }
                    }
                });
            }
        }
    }
}
