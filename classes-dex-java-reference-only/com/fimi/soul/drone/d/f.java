package com.fimi.soul.drone.d;

import com.fimi.soul.drone.c.a.a.az;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.module.b.d;
import java.util.Map;

public class f
{
  public static final az a = new az();
  public static c b = a.a();
  
  static
  {
    a.a = 193;
  }
  
  public static void a()
  {
    try
    {
      Thread.sleep(200L);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
    }
  }
  
  public static void a(com.fimi.soul.drone.a parama)
  {
    a.d = 0;
    parama.T().a(a.a());
  }
  
  public static void b(com.fimi.soul.drone.a parama)
  {
    a.d = 1;
    parama.T().a(a.a());
  }
  
  public static void c(com.fimi.soul.drone.a parama)
  {
    a.d = 3;
    parama.T().a(a.a());
  }
  
  public static void d(com.fimi.soul.drone.a parama)
  {
    a.d = 10;
    parama.T().a(a.a());
  }
  
  public static void e(com.fimi.soul.drone.a parama)
  {
    a.d = -3;
    parama.T().a(a.a());
  }
  
  public static void f(com.fimi.soul.drone.a parama)
  {
    a.d = 5;
    parama.T().a(a.a());
  }
  
  public static void g(com.fimi.soul.drone.a parama)
  {
    a.d = 9;
    parama.T().a(a.a());
  }
  
  public static void h(com.fimi.soul.drone.a parama)
  {
    a.d = 6;
    parama.T().a(a.a());
  }
  
  public static void i(com.fimi.soul.drone.a parama)
  {
    a.d = 5;
    parama.T().a(a.a());
  }
  
  public static void j(com.fimi.soul.drone.a parama)
  {
    c(parama);
    a();
    b(parama);
    a();
    a(parama);
    a();
    g(parama);
    a();
    d(parama);
    a();
    h(parama);
    a();
  }
  
  public static void k(com.fimi.soul.drone.a parama)
  {
    Map localMap = com.fimi.soul.module.update.a.a.a().b();
    if (!localMap.containsKey(Integer.valueOf(3)))
    {
      d.a(parama).b(3);
      c(parama);
      a();
    }
    if (!localMap.containsKey(Integer.valueOf(1)))
    {
      d.a(parama).b(1);
      b(parama);
      a();
    }
    if (!localMap.containsKey(Integer.valueOf(0)))
    {
      d.a(parama).b(0);
      a(parama);
      a();
    }
    if (!localMap.containsKey(Integer.valueOf(9)))
    {
      d.a(parama).b(9);
      g(parama);
      a();
    }
    if (!localMap.containsKey(Integer.valueOf(10)))
    {
      d.a(parama).b(10);
      d(parama);
      a();
    }
    if (!localMap.containsKey(Integer.valueOf(6)))
    {
      d.a(parama).b(6);
      h(parama);
      a();
    }
    if (!localMap.containsKey(Integer.valueOf(253)))
    {
      d.a(parama).b(253);
      e(parama);
      a();
    }
    if (!localMap.containsKey(Integer.valueOf(5)))
    {
      d.a(parama).b(5);
      i(parama);
      a();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */