package com.fimi.soul.module.update;

import java.util.Timer;
import java.util.TimerTask;

public class c {
    Timer a = new Timer();
    a b;
    private final int c = 60;
    private int d;

    public interface a {
        void a(boolean z);
    }

    public c(int i, a aVar) {
        this.d = i;
        this.b = aVar;
    }

    public void a() {
        TimerTask anonymousClass1 = new TimerTask(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.d = this.a.d + 1;
                if (this.a.d == 60) {
                    this.a.b();
                    this.a.d();
                    this.a.b.a(true);
                }
                System.out.println(" counter=" + this.a.d);
            }
        };
        if (this.a != null) {
            this.a.schedule(anonymousClass1, 100, 1000);
        }
    }

    public void a(int i) {
        this.d = i;
    }

    public void b() {
        a(0);
    }

    public int c() {
        return this.d;
    }

    public void d() {
        this.d = 0;
        if (this.a != null) {
            this.a.cancel();
            this.a = null;
        }
    }
}
