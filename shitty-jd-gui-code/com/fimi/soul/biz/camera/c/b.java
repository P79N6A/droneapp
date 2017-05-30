package com.fimi.soul.biz.camera.c;

import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.c.a;
import com.fimi.soul.biz.camera.c.d;
import com.fimi.soul.biz.camera.e.a;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.g;
import com.fimi.soul.drone.h.i;
import com.fimi.soul.drone.h.i.a;

public class b
  extends e
{
  private static com.fimi.soul.drone.g.f h;
  private com.fimi.soul.drone.c.a.a.f a;
  private boolean b = false;
  private boolean c = false;
  private boolean d = false;
  private int e = 0;
  private int f = 0;
  private com.fimi.soul.drone.g.f g;
  
  public b(c paramc)
  {
    super(paramc);
    h = new com.fimi.soul.drone.g.f(1000, new Runnable()
    {
      public void run()
      {
        b.a(b.this);
        if (b.b(b.this) > 10)
        {
          b.a(b.this, false);
          b.l().e();
        }
      }
    });
    o();
  }
  
  private void a(c.a parama)
  {
    if (a().l() != null) {
      a().l().a(parama, a().f());
    }
  }
  
  private void a(com.fimi.soul.drone.a parama)
  {
    parama = (g)parama.c;
    c.a locala = a().f();
    switch (4.a[parama.f().ordinal()])
    {
    }
    for (;;)
    {
      a(locala);
      return;
      a().a(c.a.c);
      continue;
      a().a(c.a.d);
      continue;
      a().a(c.a.b);
    }
  }
  
  private void o()
  {
    this.g = new com.fimi.soul.drone.g.f(1000, new Runnable()
    {
      public void run()
      {
        b.c(b.this);
        if (b.d(b.this) > 2)
        {
          if (!d.a().k()) {
            b.this.i();
          }
          b.a(b.this, 0);
        }
      }
    });
  }
  
  public void a(e.a parama)
  {
    if (this.a != null) {
      this.a.a(parama);
    }
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  public void c()
  {
    if (this.a != null)
    {
      this.b = true;
      this.a.f();
    }
  }
  
  public void d()
  {
    h();
  }
  
  public void e()
  {
    if (this.a != null)
    {
      this.c = true;
      this.a.i();
    }
  }
  
  public void f()
  {
    if (this.a != null)
    {
      this.c = true;
      this.a.b();
    }
  }
  
  public void g()
  {
    if (this.a != null)
    {
      this.c = true;
      this.a.d();
    }
  }
  
  public void h()
  {
    if (this.a != null)
    {
      this.c = true;
      this.a.h();
    }
  }
  
  public void i()
  {
    if (this.a != null)
    {
      this.c = true;
      this.a.a();
    }
  }
  
  public void j()
  {
    if (this.a != null)
    {
      this.c = true;
      this.a.c();
    }
  }
  
  public void k()
  {
    if (this.a != null)
    {
      this.b = true;
      this.a.g();
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    int i;
    if ((parama1.U()) && (parama1.T().a()))
    {
      if (this.g == null)
      {
        o();
        this.g.c();
      }
      if ((this.a == null) && (parama1 != null))
      {
        this.a = com.fimi.soul.drone.c.a.a.f.a(parama1);
        this.a.a();
      }
      if ((parama == d.a.aH) && (parama1.c != null))
      {
        i = parama1.c.a();
        if (i != 50) {
          break label181;
        }
        this.f = 0;
        parama = (g)parama1.c;
        switch (4.a[parama.f().ordinal()])
        {
        }
      }
    }
    label181:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              this.d = true;
              this.e = 0;
              if (h == null) {
                h = new com.fimi.soul.drone.g.f(1000, new Runnable()
                {
                  public void run()
                  {
                    b.a(b.this);
                    if (b.b(b.this) > 10)
                    {
                      b.a(b.this, false);
                      b.l().e();
                    }
                  }
                });
              }
              h.d();
              return;
            } while (i != 49);
            parama = (i)parama1.c;
            if (parama.e() != i.a.b) {
              break;
            }
            this.d = true;
            this.e = 0;
          } while (h == null);
          h.d();
          return;
        } while (parama.e() != i.a.c);
        this.d = false;
      } while (h == null);
      h.e();
      return;
      if (h != null) {
        h.e();
      }
      this.d = false;
    } while (this.g == null);
    this.g.f();
    this.g = null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */