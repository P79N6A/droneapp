package com.fimi.soul.biz.a;

import java.util.concurrent.atomic.AtomicInteger;

public class a
{
  public static final int a = 1;
  public static final int b = 2;
  private volatile AtomicInteger c = new AtomicInteger(1);
  
  public static a a()
  {
    return a.a;
  }
  
  public void a(int paramInt)
  {
    if (this.c != null) {
      this.c.set(paramInt);
    }
  }
  
  public int b()
  {
    if (this.c == null) {
      return 0;
    }
    return this.c.get();
  }
  
  public boolean c()
  {
    return this.c.get() == 2;
  }
  
  public static class a
  {
    public static final a a = new a(null);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */