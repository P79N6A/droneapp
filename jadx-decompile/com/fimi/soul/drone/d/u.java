package com.fimi.soul.drone.d;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.c;
import java.util.Calendar;

public class u {
    public static void a(a aVar) {
        c cVar = new c();
        cVar.b = 11;
        cVar.c = 18;
        Calendar instance = Calendar.getInstance();
        int i = instance.get(1);
        int i2 = instance.get(2) + 1;
        int i3 = instance.get(5);
        int i4 = instance.get(11);
        int i5 = instance.get(12);
        int i6 = instance.get(13);
        cVar.d.a((short) i);
        cVar.d.b((byte) i2);
        cVar.d.b((byte) i3);
        cVar.d.b((byte) i4);
        cVar.d.b((byte) i5);
        cVar.d.b((byte) i6);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        cVar.d.b((byte) 0);
        aVar.T().a(cVar);
    }
}
