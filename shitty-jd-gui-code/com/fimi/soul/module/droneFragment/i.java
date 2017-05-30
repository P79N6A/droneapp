package com.fimi.soul.module.droneFragment;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class i
{
  public static int a = 0;
  public static int b = 1;
  private static AtomicInteger c = new AtomicInteger(a);
  private static AtomicInteger d = new AtomicInteger(a);
  private static AtomicInteger e = new AtomicInteger(a);
  private static AtomicBoolean f = new AtomicBoolean(true);
  
  public static AtomicInteger a()
  {
    return c;
  }
  
  public static void a(int paramInt)
  {
    e.set(paramInt);
  }
  
  public static void a(boolean paramBoolean)
  {
    f.set(paramBoolean);
  }
  
  public static AtomicInteger b()
  {
    return d;
  }
  
  public static void b(int paramInt)
  {
    d.set(paramInt);
  }
  
  public static AtomicInteger c()
  {
    return e;
  }
  
  public static void c(int paramInt)
  {
    c.set(paramInt);
  }
  
  public static AtomicBoolean d()
  {
    return f;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */