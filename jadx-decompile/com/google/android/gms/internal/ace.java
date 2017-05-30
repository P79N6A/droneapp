package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ace {
    private AtomicInteger a;
    private final Map<String, Queue<abd<?>>> b;
    private final Set<abd<?>> c;
    private final PriorityBlockingQueue<abd<?>> d;
    private final PriorityBlockingQueue<abd<?>> e;
    private final ru f;
    private final vy g;
    private final aeg h;
    private wz[] i;
    private sv j;
    private List<a> k;

    public interface a<T> {
        void a(abd<T> com_google_android_gms_internal_abd_T);
    }

    public ace(ru ruVar, vy vyVar) {
        this(ruVar, vyVar, 4);
    }

    public ace(ru ruVar, vy vyVar, int i) {
        this(ruVar, vyVar, i, new ux(new Handler(Looper.getMainLooper())));
    }

    public ace(ru ruVar, vy vyVar, int i, aeg com_google_android_gms_internal_aeg) {
        this.a = new AtomicInteger();
        this.b = new HashMap();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue();
        this.e = new PriorityBlockingQueue();
        this.k = new ArrayList();
        this.f = ruVar;
        this.g = vyVar;
        this.i = new wz[i];
        this.h = com_google_android_gms_internal_aeg;
    }

    public <T> abd<T> a(abd<T> com_google_android_gms_internal_abd_T) {
        com_google_android_gms_internal_abd_T.a(this);
        synchronized (this.c) {
            this.c.add(com_google_android_gms_internal_abd_T);
        }
        com_google_android_gms_internal_abd_T.a(c());
        com_google_android_gms_internal_abd_T.b("add-to-queue");
        if (com_google_android_gms_internal_abd_T.p()) {
            synchronized (this.b) {
                String d = com_google_android_gms_internal_abd_T.d();
                if (this.b.containsKey(d)) {
                    Queue queue = (Queue) this.b.get(d);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(com_google_android_gms_internal_abd_T);
                    this.b.put(d, queue);
                    if (ajg.b) {
                        ajg.a("Request for cacheKey=%s is in flight, putting on hold.", d);
                    }
                } else {
                    this.b.put(d, null);
                    this.d.add(com_google_android_gms_internal_abd_T);
                }
            }
        } else {
            this.e.add(com_google_android_gms_internal_abd_T);
        }
        return com_google_android_gms_internal_abd_T;
    }

    public void a() {
        b();
        this.j = new sv(this.d, this.e, this.f, this.h);
        this.j.start();
        for (int i = 0; i < this.i.length; i++) {
            wz wzVar = new wz(this.e, this.g, this.f, this.h);
            this.i[i] = wzVar;
            wzVar.start();
        }
    }

    public void b() {
        if (this.j != null) {
            this.j.a();
        }
        for (int i = 0; i < this.i.length; i++) {
            if (this.i[i] != null) {
                this.i[i].a();
            }
        }
    }

    <T> void b(abd<T> com_google_android_gms_internal_abd_T) {
        synchronized (this.c) {
            this.c.remove(com_google_android_gms_internal_abd_T);
        }
        synchronized (this.k) {
            for (a a : this.k) {
                a.a(com_google_android_gms_internal_abd_T);
            }
        }
        if (com_google_android_gms_internal_abd_T.p()) {
            synchronized (this.b) {
                Queue queue = (Queue) this.b.remove(com_google_android_gms_internal_abd_T.d());
                if (queue != null) {
                    if (ajg.b) {
                        ajg.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r2);
                    }
                    this.d.addAll(queue);
                }
            }
        }
    }

    public int c() {
        return this.a.incrementAndGet();
    }
}
