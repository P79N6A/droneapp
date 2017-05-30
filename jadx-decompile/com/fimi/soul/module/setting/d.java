package com.fimi.soul.module.setting;

import com.fimi.kernel.c;
import com.fimi.kernel.utils.t;
import com.fimi.soul.drone.a;

public class d {
    public static final int a = 7;
    public static final int b = 120;
    public static final int c = 30;
    public static int d = 16;
    public static int e = 17;
    public static int f = 0;
    public static int g = 1880;
    private static a h;
    private static d i;
    private static boolean j = false;

    public static d a(a aVar) {
        h = aVar;
        if (i == null) {
            i = new d();
        }
        j = c.e().m();
        return i;
    }

    private com.fimi.soul.drone.c.a.c b() {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 7;
        cVar.c = 134;
        cVar.d.b((byte) 0);
        cVar.d.b((byte) e);
        cVar.d.a(0.0f);
        cVar.d.b((byte) 0);
        return cVar;
    }

    private com.fimi.soul.drone.c.a.c b(float f) {
        com.fimi.soul.drone.c.a.c cVar = new com.fimi.soul.drone.c.a.c();
        cVar.b = 6;
        cVar.c = 134;
        cVar.d.b((byte) 0);
        cVar.d.b((byte) d);
        cVar.d.a(f);
        return cVar;
    }

    public void a() {
        h.T().a(b());
    }

    public void a(float f) {
        if (j) {
            f = (float) ((int) t.d((double) f));
        }
        h.T().a(b(f));
    }
}
