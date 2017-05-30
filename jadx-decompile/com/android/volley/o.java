package com.android.volley;

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

public class o {
    private static final int f = 4;
    private AtomicInteger a;
    private final Map<String, Queue<n<?>>> b;
    private final Set<n<?>> c;
    private final PriorityBlockingQueue<n<?>> d;
    private final PriorityBlockingQueue<n<?>> e;
    private final b g;
    private final g h;
    private final q i;
    private h[] j;
    private c k;
    private List<b> l;

    public interface a {
        boolean a(n<?> nVar);
    }

    public interface b<T> {
        void a(n<T> nVar);
    }

    public o(b bVar, g gVar) {
        this(bVar, gVar, 4);
    }

    public o(b bVar, g gVar, int i) {
        this(bVar, gVar, i, new e(new Handler(Looper.getMainLooper())));
    }

    public o(b bVar, g gVar, int i, q qVar) {
        this.a = new AtomicInteger();
        this.b = new HashMap();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue();
        this.e = new PriorityBlockingQueue();
        this.l = new ArrayList();
        this.g = bVar;
        this.h = gVar;
        this.j = new h[i];
        this.i = qVar;
    }

    public <T> n<T> a(n<T> nVar) {
        nVar.a(this);
        synchronized (this.c) {
            this.c.add(nVar);
        }
        nVar.a(c());
        nVar.a("add-to-queue");
        if (nVar.w()) {
            synchronized (this.b) {
                String j = nVar.j();
                if (this.b.containsKey(j)) {
                    Queue queue = (Queue) this.b.get(j);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(nVar);
                    this.b.put(j, queue);
                    if (v.b) {
                        v.a("Request for cacheKey=%s is in flight, putting on hold.", j);
                    }
                } else {
                    this.b.put(j, null);
                    this.d.add(nVar);
                }
            }
        } else {
            this.e.add(nVar);
        }
        return nVar;
    }

    public void a() {
        b();
        this.k = new c(this.d, this.e, this.g, this.i);
        this.k.start();
        for (int i = 0; i < this.j.length; i++) {
            h hVar = new h(this.e, this.h, this.g, this.i);
            this.j[i] = hVar;
            hVar.start();
        }
    }

    public void a(a aVar) {
        synchronized (this.c) {
            for (n nVar : this.c) {
                if (aVar.a(nVar)) {
                    nVar.l();
                }
            }
        }
    }

    public <T> void a(b<T> bVar) {
        synchronized (this.l) {
            this.l.add(bVar);
        }
    }

    public void a(final Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        a(new a(this) {
            final /* synthetic */ o b;

            public boolean a(n<?> nVar) {
                return nVar.b() == obj;
            }
        });
    }

    public void b() {
        if (this.k != null) {
            this.k.a();
        }
        for (int i = 0; i < this.j.length; i++) {
            if (this.j[i] != null) {
                this.j[i].a();
            }
        }
    }

    <T> void b(n<T> nVar) {
        synchronized (this.c) {
            this.c.remove(nVar);
        }
        synchronized (this.l) {
            for (b a : this.l) {
                a.a(nVar);
            }
        }
        if (nVar.w()) {
            synchronized (this.b) {
                Queue queue = (Queue) this.b.remove(nVar.j());
                if (queue != null) {
                    if (v.b) {
                        v.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r2);
                    }
                    this.d.addAll(queue);
                }
            }
        }
    }

    public <T> void b(b<T> bVar) {
        synchronized (this.l) {
            this.l.remove(bVar);
        }
    }

    public int c() {
        return this.a.incrementAndGet();
    }

    public b d() {
        return this.g;
    }
}
