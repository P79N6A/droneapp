package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.g.f;

public class a {
    private static final int f = 1;
    f a;
    com.fimi.soul.drone.a b;
    c c;
    int d;
    Handler e = new Handler(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    if (this.a.a != null) {
                        this.a.a.e();
                        this.a.a.f();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    };

    public void a() {
        this.d = 0;
        if (this.a != null) {
            this.a.c();
            return;
        }
        this.a = new f(200, new Runnable(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void run() {
                a aVar = this.a;
                aVar.d++;
                this.a.b.T().a(this.a.c);
                if (this.a.d >= 5) {
                    this.a.e.sendEmptyMessage(1);
                }
            }
        });
        this.a.d();
    }

    public void a(com.fimi.soul.drone.a aVar, c cVar) {
        this.b = aVar;
        this.c = cVar;
    }

    public void b() {
        this.e.sendEmptyMessage(1);
    }

    public boolean c() {
        return this.a.b();
    }
}
