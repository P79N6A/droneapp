package com.fimi.soul.drone;

import android.os.Handler;
import com.fimi.soul.drone.d.a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class b extends e {
    private final ConcurrentLinkedQueue<a> b = new ConcurrentLinkedQueue();
    private final Handler c;
    private final Runnable d = new Runnable(this) {
        final /* synthetic */ b a;

        {
            this.a = r1;
        }

        public void run() {
            do {
                this.a.c.removeCallbacks(this);
                a aVar = (a) this.a.b.poll();
                if (!(aVar == null || this.a.e.isEmpty())) {
                    Iterator it = this.a.e.iterator();
                    while (it.hasNext()) {
                        ((com.fimi.soul.drone.d.b) it.next()).onDroneEvent(aVar, this.a.a);
                    }
                }
            } while (!this.a.b.isEmpty());
        }
    };
    private final ConcurrentLinkedQueue<com.fimi.soul.drone.d.b> e = new ConcurrentLinkedQueue();

    public b(a aVar, Handler handler) {
        super(aVar);
        this.c = handler;
    }

    public void a(a aVar) {
        this.b.offer(aVar);
        this.c.post(this.d);
    }

    public void a(com.fimi.soul.drone.d.b bVar) {
        int i = 1;
        int i2 = bVar != null ? 1 : 0;
        if (this.e.contains(bVar)) {
            i = 0;
        }
        if ((i2 & i) != 0) {
            this.e.add(bVar);
        }
    }

    public void b(com.fimi.soul.drone.d.b bVar) {
        if (bVar != null && this.e.contains(bVar)) {
            this.e.remove(bVar);
        }
    }
}
