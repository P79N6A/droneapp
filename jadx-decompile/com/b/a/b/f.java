package com.b.a.b;

import com.b.a.b.e.a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

class f {
    final e a;
    private Executor b;
    private Executor c;
    private Executor d;
    private final Map<Integer, String> e = Collections.synchronizedMap(new HashMap());
    private final Map<String, ReentrantLock> f = new WeakHashMap();
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final Object j = new Object();

    f(e eVar) {
        this.a = eVar;
        this.b = eVar.g;
        this.c = eVar.h;
        this.d = a.a();
    }

    private void h() {
        if (!this.a.i && ((ExecutorService) this.b).isShutdown()) {
            this.b = i();
        }
        if (!this.a.j && ((ExecutorService) this.c).isShutdown()) {
            this.c = i();
        }
    }

    private Executor i() {
        return a.a(this.a.k, this.a.l, this.a.m);
    }

    String a(a aVar) {
        return (String) this.e.get(Integer.valueOf(aVar.f()));
    }

    ReentrantLock a(String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f.get(str);
        if (reentrantLock != null) {
            return reentrantLock;
        }
        reentrantLock = new ReentrantLock();
        this.f.put(str, reentrantLock);
        return reentrantLock;
    }

    void a() {
        this.g.set(true);
    }

    void a(a aVar, String str) {
        this.e.put(Integer.valueOf(aVar.f()), str);
    }

    void a(final h hVar) {
        this.d.execute(new Runnable(this) {
            final /* synthetic */ f b;

            public void run() {
                File a = this.b.a.o.a(hVar.a());
                Object obj = (a == null || !a.exists()) ? null : 1;
                this.b.h();
                if (obj != null) {
                    this.b.c.execute(hVar);
                } else {
                    this.b.b.execute(hVar);
                }
            }
        });
    }

    void a(i iVar) {
        h();
        this.c.execute(iVar);
    }

    void a(Runnable runnable) {
        this.d.execute(runnable);
    }

    void a(boolean z) {
        this.h.set(z);
    }

    void b() {
        this.g.set(false);
        synchronized (this.j) {
            this.j.notifyAll();
        }
    }

    void b(a aVar) {
        this.e.remove(Integer.valueOf(aVar.f()));
    }

    void b(boolean z) {
        this.i.set(z);
    }

    void c() {
        if (!this.a.i) {
            ((ExecutorService) this.b).shutdownNow();
        }
        if (!this.a.j) {
            ((ExecutorService) this.c).shutdownNow();
        }
        this.e.clear();
        this.f.clear();
    }

    AtomicBoolean d() {
        return this.g;
    }

    Object e() {
        return this.j;
    }

    boolean f() {
        return this.h.get();
    }

    boolean g() {
        return this.i.get();
    }
}
