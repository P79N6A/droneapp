package com.google.android.gms.g;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

class m<TResult> implements o<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private c c;

    public m(@NonNull Executor executor, @NonNull c cVar) {
        this.a = executor;
        this.c = cVar;
    }

    public void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    public void a(@NonNull final f<TResult> fVar) {
        if (!fVar.b()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new Runnable(this) {
                    final /* synthetic */ m b;

                    public void run() {
                        synchronized (this.b.b) {
                            if (this.b.c != null) {
                                this.b.c.a(fVar.d());
                            }
                        }
                    }
                });
            }
        }
    }
}
