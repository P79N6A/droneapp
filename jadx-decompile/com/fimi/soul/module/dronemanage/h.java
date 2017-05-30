package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.g.f;

public class h {
    static f a = null;
    static com.fimi.soul.drone.a b = null;
    static c c = null;
    static int d = 0;
    public static final int e = 0;
    public static final int f = 1;
    static a g = null;
    private static final int i = 1;
    private static final int j = 2;
    Handler h = new Handler(this) {
        final /* synthetic */ h a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    if (h.a != null) {
                        h.a.e();
                        h.a.f();
                        return;
                    }
                    return;
                case 2:
                    if (h.a != null) {
                        h.a.e();
                        h.a.f();
                    }
                    if (h.g != null) {
                        h.g.a(1);
                        h.g = null;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    };

    public interface a {
        void a(int i);
    }

    public h(a aVar) {
        g = aVar;
    }

    public static h a() {
        return new h();
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public void a(com.fimi.soul.drone.a aVar, c cVar) {
        b = aVar;
        c = cVar;
    }

    public void b() {
        d = 0;
        if (a != null) {
            a.c();
            return;
        }
        a = new f(200, new Runnable(this) {
            final /* synthetic */ h a;

            {
                this.a = r1;
            }

            public void run() {
                h.d++;
                h.b.T().a(h.c);
                if (h.d >= 5) {
                    this.a.h.sendEmptyMessage(2);
                }
            }
        });
        a.d();
    }

    public void c() {
        this.h.sendEmptyMessage(1);
    }

    public void d() {
        g = null;
    }

    public boolean e() {
        return a.b();
    }
}
