package com.fimi.soul.module.update.a;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.c;

public class d {
    public static c a(int i) {
        c cVar = new c();
        cVar.c = 204;
        cVar.b = 2;
        cVar.d.b((byte) i);
        cVar.d.b((byte) 2);
        return cVar;
    }

    public static void a(a aVar) {
        a(aVar, 0);
        a(aVar, 9);
        a(aVar, 10);
        a(aVar, 6);
        a(aVar, 3);
        a(aVar, 1);
    }

    public static void a(a aVar, int i) {
        try {
            aVar.T().a(a(i));
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
