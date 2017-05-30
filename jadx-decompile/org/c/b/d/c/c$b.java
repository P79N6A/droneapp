package org.c.b.d.c;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

class c$b implements Callable<Throwable> {
    final /* synthetic */ c a;
    private final CountDownLatch b;

    private c$b(c cVar) {
        this.a = cVar;
        this.b = new CountDownLatch(1);
    }

    public Throwable a() {
        try {
            this.b.countDown();
            c.a(this.a).a();
            return null;
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            return th;
        }
    }

    public void b() {
        this.b.await();
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
