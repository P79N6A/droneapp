package com.google.android.gms.g;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class i {

    class AnonymousClass1 implements Runnable {
        final /* synthetic */ q a;
        final /* synthetic */ Callable b;

        AnonymousClass1(q qVar, Callable callable) {
            this.a = qVar;
            this.b = callable;
        }

        public void run() {
            try {
                this.a.a(this.b.call());
            } catch (Exception e) {
                this.a.a(e);
            }
        }
    }

    interface b extends c, d<Object> {
    }

    private static final class a implements b {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        public void a() {
            this.a.await();
        }

        public void a(@NonNull Exception exception) {
            this.a.countDown();
        }

        public void a(Object obj) {
            this.a.countDown();
        }

        public boolean a(long j, TimeUnit timeUnit) {
            return this.a.await(j, timeUnit);
        }
    }

    private static final class c implements b {
        private final Object a = new Object();
        private final int b;
        private final q<Void> c;
        private int d;
        private int e;
        private Exception f;

        public c(int i, q<Void> qVar) {
            this.b = i;
            this.c = qVar;
        }

        private void a() {
            if (this.d + this.e != this.b) {
                return;
            }
            if (this.f == null) {
                this.c.a(null);
                return;
            }
            q qVar = this.c;
            int i = this.e;
            qVar.a(new ExecutionException(i + " out of " + this.b + " underlying tasks failed", this.f));
        }

        public void a(@NonNull Exception exception) {
            synchronized (this.a) {
                this.e++;
                this.f = exception;
                a();
            }
        }

        public void a(Object obj) {
            synchronized (this.a) {
                this.d++;
                a();
            }
        }
    }

    private i() {
    }

    public static <TResult> f<TResult> a(@NonNull Exception exception) {
        f qVar = new q();
        qVar.a(exception);
        return qVar;
    }

    public static <TResult> f<TResult> a(TResult tResult) {
        f qVar = new q();
        qVar.a((Object) tResult);
        return qVar;
    }

    public static f<Void> a(Collection<? extends f<?>> collection) {
        if (collection.isEmpty()) {
            return a(null);
        }
        for (f fVar : collection) {
            if (fVar == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        f qVar = new q();
        b cVar = new c(collection.size(), qVar);
        for (f fVar2 : collection) {
            a(fVar2, cVar);
        }
        return qVar;
    }

    public static <TResult> f<TResult> a(@NonNull Callable<TResult> callable) {
        return a(h.a, (Callable) callable);
    }

    public static <TResult> f<TResult> a(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        d.a(executor, "Executor must not be null");
        d.a(callable, "Callback must not be null");
        f qVar = new q();
        executor.execute(new AnonymousClass1(qVar, callable));
        return qVar;
    }

    public static f<Void> a(f<?>... fVarArr) {
        return fVarArr.length == 0 ? a(null) : a(Arrays.asList(fVarArr));
    }

    public static <TResult> TResult a(@NonNull f<TResult> fVar) {
        d.a();
        d.a(fVar, "Task must not be null");
        if (fVar.a()) {
            return b(fVar);
        }
        b aVar = new a();
        a((f) fVar, aVar);
        aVar.a();
        return b(fVar);
    }

    public static <TResult> TResult a(@NonNull f<TResult> fVar, long j, @NonNull TimeUnit timeUnit) {
        d.a();
        d.a(fVar, "Task must not be null");
        d.a(timeUnit, "TimeUnit must not be null");
        if (fVar.a()) {
            return b(fVar);
        }
        b aVar = new a();
        a((f) fVar, aVar);
        if (aVar.a(j, timeUnit)) {
            return b(fVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static void a(f<?> fVar, b bVar) {
        fVar.a(h.b, (d) bVar);
        fVar.a(h.b, (c) bVar);
    }

    private static <TResult> TResult b(f<TResult> fVar) {
        if (fVar.b()) {
            return fVar.c();
        }
        throw new ExecutionException(fVar.d());
    }
}
