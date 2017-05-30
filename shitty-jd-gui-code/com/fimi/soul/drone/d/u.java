package com.fimi.soul.drone.d;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import java.util.Calendar;

public class u
{
  public static void a(a parama)
  {
    c localc = new c();
    localc.b = 11;
    localc.c = 18;
    Calendar localCalendar = Calendar.getInstance();
    int i = localCalendar.get(1);
    int j = localCalendar.get(2);
    int k = localCalendar.get(5);
    int m = localCalendar.get(11);
    int n = localCalendar.get(12);
    int i1 = localCalendar.get(13);
    localc.d.a((short)i);
    localc.d.b((byte)(j + 1));
    localc.d.b((byte)k);
    localc.d.b((byte)m);
    localc.d.b((byte)n);
    localc.d.b((byte)i1);
    localc.d.b((byte)0);
    localc.d.b((byte)0);
    localc.d.b((byte)0);
    localc.d.b((byte)0);
    parama.T().a(localc);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/d/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */