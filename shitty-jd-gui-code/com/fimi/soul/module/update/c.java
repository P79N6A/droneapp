package com.fimi.soul.module.update;

import java.io.PrintStream;
import java.util.Timer;
import java.util.TimerTask;

public class c
{
  Timer a = new Timer();
  a b;
  private final int c = 60;
  private int d;
  
  public c(int paramInt, a parama)
  {
    this.d = paramInt;
    this.b = parama;
  }
  
  public void a()
  {
    TimerTask local1 = new TimerTask()
    {
      public void run()
      {
        c.a(c.this);
        if (c.b(c.this) == 60)
        {
          c.this.b();
          c.this.d();
          c.this.b.a(true);
        }
        System.out.println(" counter=" + c.b(c.this));
      }
    };
    if (this.a != null) {
      this.a.schedule(local1, 100L, 1000L);
    }
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void b()
  {
    a(0);
  }
  
  public int c()
  {
    return this.d;
  }
  
  public void d()
  {
    this.d = 0;
    if (this.a != null)
    {
      this.a.cancel();
      this.a = null;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */