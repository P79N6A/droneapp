package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.g.f;

public class a
{
  private static final int f = 1;
  f a;
  com.fimi.soul.drone.a b;
  c c;
  int d;
  Handler e = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      }
      do
      {
        return;
      } while (a.this.a == null);
      a.this.a.e();
      a.this.a.f();
    }
  };
  
  public void a()
  {
    this.d = 0;
    if (this.a != null)
    {
      this.a.c();
      return;
    }
    this.a = new f(200, new Runnable()
    {
      public void run()
      {
        a locala = a.this;
        locala.d += 1;
        a.this.b.T().a(a.this.c);
        if (a.this.d >= 5) {
          a.this.e.sendEmptyMessage(1);
        }
      }
    });
    this.a.d();
  }
  
  public void a(com.fimi.soul.drone.a parama, c paramc)
  {
    this.b = parama;
    this.c = paramc;
  }
  
  public void b()
  {
    this.e.sendEmptyMessage(1);
  }
  
  public boolean c()
  {
    return this.a.b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/dronemanage/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */