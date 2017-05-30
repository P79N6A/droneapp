package com.fimi.soul.module.update.a;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.droneconnection.connection.f.a;

public class d
{
  public static c a(int paramInt)
  {
    c localc = new c();
    localc.c = 204;
    localc.b = 2;
    localc.d.b((byte)paramInt);
    localc.d.b((byte)2);
    return localc;
  }
  
  public static void a(a parama)
  {
    a(parama, 0);
    a(parama, 9);
    a(parama, 10);
    a(parama, 6);
    a(parama, 3);
    a(parama, 1);
  }
  
  public static void a(a parama, int paramInt)
  {
    try
    {
      parama.T().a(a(paramInt));
      Thread.sleep(200L);
      return;
    }
    catch (Exception parama)
    {
      parama.printStackTrace();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */