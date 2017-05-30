package com.fimi.soul.biz.h;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.c.a.c;
import java.util.LinkedList;

public class b
{
  private final int a = 100;
  private final int b = 10000;
  private b c = b.a;
  private final d d = d.a();
  private boolean e;
  private Handler f = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (paramAnonymousMessage.what == 100)
      {
        if ((b.a(b.this) != null) && (b.a(b.this).size() > 0))
        {
          paramAnonymousMessage = (LinkedList)b.a(b.this).clone();
          while (paramAnonymousMessage.size() > 0)
          {
            c localc = (c)paramAnonymousMessage.pollFirst();
            b.b(b.this).a(localc);
          }
        }
        b.b(b.this).k();
      }
    }
  };
  private int g = 1200;
  private LinkedList<c> h = new LinkedList();
  private volatile boolean i;
  
  public static b a()
  {
    return a.a;
  }
  
  private void i()
  {
    if ((this.h != null) && (this.h.size() > 0)) {
      while (this.h.size() > 0)
      {
        c localc = (c)this.h.pollFirst();
        this.d.a(localc);
      }
    }
  }
  
  public void a(b paramb)
  {
    this.c = paramb;
  }
  
  public void a(c paramc)
  {
    if (this.e)
    {
      if (!this.d.j())
      {
        this.d.b();
        i();
        this.d.e();
        this.d.f();
      }
      this.d.a(paramc);
    }
    for (;;)
    {
      return;
      if (!this.d.d()) {
        this.d.c();
      }
      this.d.b(paramc);
      if (this.h.size() < this.g) {
        this.h.add(paramc);
      }
      while (this.d.j())
      {
        g();
        return;
        this.h.removeFirst();
        this.h.addLast(paramc);
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public boolean b()
  {
    return this.d.j();
  }
  
  public LinkedList c()
  {
    return this.h;
  }
  
  public void d()
  {
    this.h.clear();
  }
  
  public boolean e()
  {
    return this.i;
  }
  
  public b f()
  {
    return this.c;
  }
  
  public void g()
  {
    if (!this.f.hasMessages(100)) {
      this.f.sendEmptyMessageDelayed(100, 10000L);
    }
  }
  
  public boolean h()
  {
    return this.e;
  }
  
  public static class a
  {
    public static final b a = new b(null);
  }
  
  public static enum b
  {
    private b() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */