package com.google.android.gms.g;

import android.app.Activity;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aij;
import com.google.android.gms.internal.aik;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class q<TResult> extends f<TResult> {
    private final Object a = new Object();
    private final p<TResult> b = new p();
    private boolean c;
    private TResult d;
    private Exception e;

    private static class a extends aij {
        private final List<WeakReference<o<?>>> a = new ArrayList();

        private a(aik com_google_android_gms_internal_aik) {
            super(com_google_android_gms_internal_aik);
            this.d.a("TaskOnStopCallback", (aij) this);
        }

        public static a a(Activity activity) {
            aik b = aij.b(activity);
            a aVar = (a) b.a("TaskOnStopCallback", a.class);
            return aVar == null ? new a(b) : aVar;
        }

        @MainThread
        public void a() {
            synchronized (this.a) {
                for (WeakReference weakReference : this.a) {
                    o oVar = (o) weakReference.get();
                    if (oVar != null) {
                        oVar.a();
                    }
                }
                this.a.clear();
            }
        }

        public <T> void a(o<T> oVar) {
            synchronized (this.a) {
                this.a.add(new WeakReference(oVar));
            }
        }
    }

    q() {
    }

    private void e() {
        d.a(this.c, "Task is not yet complete");
    }

    private void f() {
        d.a(!this.c, "Task is already complete");
    }

    private void g() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a((f) this);
                return;
            }
        }
    }

    @NonNull
    public f<TResult> a(@NonNull Activity activity, @NonNull b<TResult> bVar) {
        o lVar = new l(h.a, bVar);
        this.b.a(lVar);
        a.a(activity).a(lVar);
        g();
        return this;
    }

    @NonNull
    public f<TResult> a(@NonNull Activity activity, @NonNull c cVar) {
        o mVar = new m(h.a, cVar);
        this.b.a(mVar);
        a.a(activity).a(mVar);
        g();
        return this;
    }

    @NonNull
    public f<TResult> a(@NonNull Activity activity, @NonNull d<? super TResult> dVar) {
        o nVar = new n(h.a, dVar);
        this.b.a(nVar);
        a.a(activity).a(nVar);
        g();
        return this;
    }

    @NonNull
    public <TContinuationResult> f<TContinuationResult> a(@NonNull a<TResult, TContinuationResult> aVar) {
        return a(h.a, (a) aVar);
    }

    @NonNull
    public f<TResult> a(@NonNull b<TResult> bVar) {
        return a(h.a, (b) bVar);
    }

    @NonNull
    public f<TResult> a(@NonNull c cVar) {
        return a(h.a, cVar);
    }

    @NonNull
    public f<TResult> a(@NonNull d<? super TResult> dVar) {
        return a(h.a, (d) dVar);
    }

    @NonNull
    public <TContinuationResult> f<TContinuationResult> a(@NonNull Executor executor, @NonNull a<TResult, TContinuationResult> aVar) {
        f qVar = new q();
        this.b.a(new j(executor, aVar, qVar));
        g();
        return qVar;
    }

    @NonNull
    public f<TResult> a(@NonNull Executor executor, @NonNull b<TResult> bVar) {
        this.b.a(new l(executor, bVar));
        g();
        return this;
    }

    @NonNull
    public f<TResult> a(@NonNull Executor executor, @NonNull c cVar) {
        this.b.a(new m(executor, cVar));
        g();
        return this;
    }

    @NonNull
    public f<TResult> a(@NonNull Executor executor, @NonNull d<? super TResult> dVar) {
        this.b.a(new n(executor, dVar));
        g();
        return this;
    }

    public <X extends Throwable> TResult a(@NonNull Class<X> cls) {
        TResult tResult;
        synchronized (this.a) {
            e();
            if (cls.isInstance(this.e)) {
                throw ((Throwable) cls.cast(this.e));
            } else if (this.e != null) {
                throw new e(this.e);
            } else {
                tResult = this.d;
            }
        }
        return tResult;
    }

    public void a(@NonNull Exception exception) {
        d.a(exception, "Exception must not be null");
        synchronized (this.a) {
            f();
            this.c = true;
            this.e = exception;
        }
        this.b.a((f) this);
    }

    public void a(TResult tResult) {
        synchronized (this.a) {
            f();
            this.c = true;
            this.d = tResult;
        }
        this.b.a((f) this);
    }

    public boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @NonNull
    public <TContinuationResult> f<TContinuationResult> b(@NonNull a<TResult, f<TContinuationResult>> aVar) {
        return b(h.a, aVar);
    }

    @NonNull
    public <TContinuationResult> f<TContinuationResult> b(@NonNull Executor executor, @NonNull a<TResult, f<TContinuationResult>> aVar) {
        f qVar = new q();
        this.b.a(new k(executor, aVar, qVar));
        g();
        return qVar;
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c && this.e == null;
        }
        return z;
    }

    public TResult c() {
        TResult tResult;
        synchronized (this.a) {
            e();
            if (this.e != null) {
                throw new e(this.e);
            }
            tResult = this.d;
        }
        return tResult;
    }

    @Nullable
    public Exception d() {
        Exception exception;
        synchronized (this.a) {
            exception = this.e;
        }
        return exception;
    }
}
