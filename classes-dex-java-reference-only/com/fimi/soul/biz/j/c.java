package com.fimi.soul.biz.j;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.fimi.soul.biz.c.h;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.ac;
import com.fimi.soul.drone.h.ad;
import com.fimi.soul.entity.DroneModelBean;
import com.fimi.soul.entity.DroneModelType;
import com.fimi.soul.module.droneFragment.i;
import com.fimi.soul.utils.ak;
import com.fimi.soul.utils.ak.a;
import java.lang.ref.WeakReference;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

public class c
  implements d.b
{
  private DroneModelBean a;
  private d b;
  private com.fimi.soul.drone.a c;
  private int d;
  private int e = 20;
  private int f = 20;
  private int g = 100;
  private ak h;
  private boolean i = true;
  private WeakReference<Context> j;
  private e k;
  private Handler l = new Handler();
  private Runnable m = new Runnable()
  {
    public void run()
    {
      c.this.b();
    }
  };
  private h n;
  private boolean o;
  private Observer p = new Observer()
  {
    public void update(Observable paramAnonymousObservable, Object paramAnonymousObject)
    {
      c.this.a();
      switch (c.a(c.this))
      {
      default: 
        return;
      }
      if ((c.b(c.this).getCurrentFlightModel() == 7) && (c.a(c.this) != 2))
      {
        c.c(c.this).a(2131362090);
        c.e(c.this).a(c.d(c.this).d.getString(2131362090));
        c.d(c.this).a(d.a.bn);
        return;
      }
      if (c.b(c.this).getCurrentFlightModel() == 3)
      {
        c.c(c.this).a(2131362079);
        c.e(c.this).a(c.d(c.this).d.getString(2131362079));
        c.d(c.this).a(d.a.bn);
        return;
      }
      c.c(c.this).a(2131362089);
      c.e(c.this).a(c.d(c.this).d.getString(2131362089));
    }
  };
  private int q;
  
  public c(d paramd, com.fimi.soul.drone.a parama, Context paramContext)
  {
    this.b = paramd;
    this.a = new DroneModelBean(parama);
    this.a.addObserver(this.p);
    this.c = parama;
    this.j = new WeakReference(paramContext);
    this.k = new e(parama);
    this.n = h.a(paramContext);
  }
  
  private void a(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  private void b(int paramInt)
  {
    this.b.b(paramInt);
  }
  
  private void e()
  {
    if (this.c.aj().g().judgeNoAction())
    {
      h();
      i();
    }
  }
  
  private void f()
  {
    if ((this.c.aj().g().isEnterModel()) && (!this.c.g().k()) && (this.f != 0))
    {
      this.q += 1;
      if (this.q > 3)
      {
        this.b.a(2131362192, 0);
        this.q = 0;
      }
      return;
    }
    if (this.q != 0) {
      this.q = 0;
    }
    this.b.a(0, 4);
  }
  
  private void g()
  {
    if ((!this.c.ac()) && (!this.c.af())) {
      if ((this.c.al().j()) && (this.c.aj().a() == 0))
      {
        a(2131361975);
        b(2130838334);
      }
    }
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
              do
              {
                return;
                a(2131362673);
                b(2130838335);
                return;
                if ((this.e == 2) && (!this.c.ac()) && (this.d == 1))
                {
                  a(2131362417);
                  b(2130838334);
                  return;
                }
                if ((this.e == 1) && (!this.c.ac()) && (this.d == 1))
                {
                  a(2131362320);
                  this.o = false;
                  b(2130838334);
                  return;
                }
                if ((this.e == 0) && (!this.c.ac()) && (this.d == 1))
                {
                  a(2131361975);
                  b(2130838334);
                  return;
                }
                if ((this.e == 2) && (this.c.ac()) && (this.d == 1))
                {
                  a(2131362416);
                  b(2130838334);
                  return;
                }
                if ((this.e == 1) && (this.c.ac()) && (this.d == 1))
                {
                  a(2131362319);
                  b(2130838334);
                  j();
                  return;
                }
                if ((this.e == 0) && (this.c.ac()) && (this.d == 1))
                {
                  a(2131361974);
                  b(2130838334);
                  return;
                }
                if (this.d != 7) {
                  break;
                }
                a(2131362855);
                b(2130838466);
              } while (!this.c.g().k());
              e();
              return;
              if (this.d != 8) {
                break;
              }
              e();
              a(2131362643);
              b(2130838466);
            } while ((!this.i) || (this.h != null));
            this.i = false;
            this.k.a(this.c.d.getResources().getString(2131362643));
            this.h = new ak((Context)this.j.get(), new ak.a()
            {
              public void a()
              {
                if (c.f(c.this) != null)
                {
                  c.f(c.this).dismiss();
                  c.a(c.this, null);
                }
              }
            }, 3);
            this.h.setCancelable(true);
            this.h.show();
            return;
            if (this.d == 3)
            {
              a(2131362411);
              b(2130838240);
              e();
              return;
            }
            if (this.d == 9)
            {
              e();
              a(2131362444);
              b(2130838240);
              return;
            }
            if (this.d == 2)
            {
              a(2131362815);
              b(2130838532);
              return;
            }
            if (this.d != 4) {
              break;
            }
            this.o = true;
            if (this.f == 4)
            {
              a(2131362797);
              b(2130837870);
              return;
            }
          } while (this.f != 2);
          a(2131362279);
          b(2130837870);
          return;
          if (this.d != 5) {
            break;
          }
          if (this.f == 4)
          {
            a(2131362796);
            b(2130837872);
            return;
          }
        } while (this.f != 2);
        a(2131362359);
        b(2130837872);
        return;
        if (this.d != 6) {
          break;
        }
        this.o = true;
        if (this.f == 4)
        {
          a(2131362799);
          b(2130838156);
          return;
        }
      } while (this.f != 2);
      a(2131362191);
      b(2130838156);
      return;
      if (this.d != 10) {
        break;
      }
      if (this.f == 4)
      {
        a(2131362798);
        b(2130903047);
        return;
      }
    } while (this.f != 2);
    a(2131362820);
    b(2130903047);
    return;
    a(2131362091);
    b(2130838334);
  }
  
  private void h()
  {
    this.c.a(d.a.bu);
  }
  
  private void i()
  {
    this.o = false;
    this.c.a(d.a.bn);
  }
  
  private void j()
  {
    if (!this.o)
    {
      this.o = true;
      this.c.a(d.a.bo);
    }
  }
  
  public void a()
  {
    i.a(false);
    this.l.postDelayed(this.m, 5000L);
  }
  
  public void b()
  {
    i.a(true);
  }
  
  public void c()
  {
    if (this.k != null) {
      this.k.a();
    }
    this.c.b(this);
  }
  
  public void d()
  {
    if (this.k != null) {
      this.k.b();
    }
    this.c.a(this);
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    if ((parama1.U()) && (parama1.T().a())) {}
    switch (4.a[parama.ordinal()])
    {
    case 1: 
    default: 
      return;
    case 2: 
      com.fimi.soul.module.calibcompass.a.a().a("147");
      return;
    case 3: 
      com.fimi.soul.module.calibcompass.a.a().a("146");
      return;
    case 4: 
      com.fimi.soul.module.calibcompass.a.a().a("145");
      parama1.a(d.a.bn);
      return;
    case 5: 
      com.fimi.soul.module.calibcompass.a.a().a("144");
      parama1.a(d.a.bn);
      return;
    }
    this.d = parama1.aj().e();
    this.e = parama1.aj().d();
    this.f = parama1.aj().f();
    this.a.setFlightModel(this.d, this.e);
    f();
    if (this.d != 8) {
      this.i = true;
    }
    if (i.d().get()) {
      g();
    }
    if ((this.g == 5) && (this.d != 5)) {
      this.k.a(parama1.d.getString(2131362584));
    }
    if ((this.g != 10) && (this.d == 10)) {
      parama1.a(d.a.bO);
    }
    this.g = this.d;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/j/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */