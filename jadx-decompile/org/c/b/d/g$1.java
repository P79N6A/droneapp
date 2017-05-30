package org.c.b.d;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.c.f.a.l;

class g$1 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ g b;

    g$1(g gVar, long j) {
        this.b = gVar;
        this.a = j;
    }

    public void run() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future submit = newSingleThreadExecutor.submit(new Callable<Object>(this) {
            final /* synthetic */ g$1 a;

            {
                this.a = r1;
            }

            public Object call() {
                this.a.b.c();
                return null;
            }
        });
        newSingleThreadExecutor.shutdown();
        try {
            if (!newSingleThreadExecutor.awaitTermination(this.a, TimeUnit.MILLISECONDS)) {
                newSingleThreadExecutor.shutdownNow();
            }
            submit.get(0, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            this.b.a(new l(this.a, TimeUnit.MILLISECONDS));
        } catch (Throwable e2) {
            this.b.a(e2);
        }
    }
}
