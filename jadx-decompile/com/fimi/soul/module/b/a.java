package com.fimi.soul.module.b;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.g.f;

public class a {
    static int a = 0;
    private static final int f = 1;
    private static final int g = 2;
    Handler b = new Handler(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    if (this.a.c != null) {
                        this.a.c.e();
                        this.a.c.f();
                    }
                    if (this.a.h != null && this.a.e != null) {
                        this.a.h.a(this.a.e.c);
                        this.a.e = null;
                        return;
                    }
                    return;
                case 2:
                    if (this.a.c != null) {
                        this.a.c.e();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    };
    private f c;
    private com.fimi.soul.drone.a d;
    private volatile c e;
    private b h;

    public a(b bVar) {
        this.h = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public void a() {
        a = 0;
        if (this.c == null || this.c.b()) {
            this.c = new f(200, new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.e != null) {
                        a.a++;
                        this.a.d.T().a(this.a.e);
                        if (a.a >= 5) {
                            this.a.b.sendEmptyMessage(1);
                        }
                    }
                }
            });
            this.c.d();
            return;
        }
        this.c.c();
    }

    public void a(com.fimi.soul.drone.a aVar, c cVar) {
        this.d = aVar;
        this.e = cVar;
    }

    public void b() {
        this.b.sendEmptyMessage(2);
    }

    public boolean c() {
        return this.c.b();
    }
}
