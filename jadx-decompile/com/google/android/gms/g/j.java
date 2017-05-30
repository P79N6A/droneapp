package com.google.android.gms.g;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

class j<TResult, TContinuationResult> implements o<TResult> {
    private final Executor a;
    private final a<TResult, TContinuationResult> b;
    private final q<TContinuationResult> c;

    public j(@NonNull Executor executor, @NonNull a<TResult, TContinuationResult> aVar, @NonNull q<TContinuationResult> qVar) {
        this.a = executor;
        this.b = aVar;
        this.c = qVar;
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public void a(@NonNull final f<TResult> fVar) {
        this.a.execute(new Runnable(this) {
            final /* synthetic */ j b;

            public void run() {
                try {
                    this.b.c.a(this.b.b.a(fVar));
                } catch (Exception e) {
                    if (e.getCause() instanceof Exception) {
                        this.b.c.a((Exception) e.getCause());
                    } else {
                        this.b.c.a(e);
                    }
                } catch (Exception e2) {
                    this.b.c.a(e2);
                }
            }
        });
    }
}
