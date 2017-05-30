package com.google.android.gms.g;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

class k<TResult, TContinuationResult> implements c, d<TContinuationResult>, o<TResult> {
    private final Executor a;
    private final a<TResult, f<TContinuationResult>> b;
    private final q<TContinuationResult> c;

    public k(@NonNull Executor executor, @NonNull a<TResult, f<TContinuationResult>> aVar, @NonNull q<TContinuationResult> qVar) {
        this.a = executor;
        this.b = aVar;
        this.c = qVar;
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public void a(@NonNull final f<TResult> fVar) {
        this.a.execute(new Runnable(this) {
            final /* synthetic */ k b;

            public void run() {
                try {
                    f fVar = (f) this.b.b.a(fVar);
                    if (fVar == null) {
                        this.b.a(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    fVar.a(h.b, this.b);
                    fVar.a(h.b, this.b);
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

    public void a(@NonNull Exception exception) {
        this.c.a(exception);
    }

    public void a(TContinuationResult tContinuationResult) {
        this.c.a((Object) tContinuationResult);
    }
}
