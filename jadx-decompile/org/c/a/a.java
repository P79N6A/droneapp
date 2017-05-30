package org.c.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.c.e.l;
import org.c.f.a.h;
import org.c.f.a.i;
import org.c.f.f;

public class a extends org.c.e.a {
    private final boolean a;
    private final boolean b;

    public a(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static org.c.e.a a() {
        return new a(true, false);
    }

    private static l a(l lVar) {
        if (lVar instanceof f) {
            ((f) lVar).a(new i() {
                private final ExecutorService a = Executors.newCachedThreadPool();

                public void a() {
                    try {
                        this.a.shutdown();
                        this.a.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace(System.err);
                    }
                }

                public void a(Runnable runnable) {
                    this.a.submit(runnable);
                }
            });
        }
        return lVar;
    }

    public static org.c.e.a b() {
        return new a(false, true);
    }

    protected l a(h hVar, Class<?> cls) {
        l a = super.a(hVar, (Class) cls);
        return this.b ? a(a) : a;
    }

    public l a(h hVar, Class<?>[] clsArr) {
        l a = super.a(hVar, (Class[]) clsArr);
        return this.a ? a(a) : a;
    }
}
