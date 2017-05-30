package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.g.f;

public class j {
    static f a = null;
    static a b = null;
    static c c = null;
    static int d = 0;
    static Handler e = new Handler() {
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    if (j.a != null) {
                        j.a.e();
                        j.a.f();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    };
    private static final int f = 1;

    public static void a() {
        d = 0;
        if (a != null) {
            a.c();
            return;
        }
        a = new f(200, new Runnable() {
            public void run() {
                j.d++;
                j.b.T().a(j.c);
                if (j.d >= 5) {
                    j.e.sendEmptyMessage(1);
                }
            }
        });
        a.d();
    }

    public static void a(a aVar, c cVar) {
        b = aVar;
        c = cVar;
    }

    public static void b() {
        e.sendEmptyMessage(1);
    }

    public boolean c() {
        return a.b();
    }
}
