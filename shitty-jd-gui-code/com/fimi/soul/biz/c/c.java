package com.fimi.soul.biz.c;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.ak;
import com.fimi.soul.drone.h.as;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.droneFragment.FlyActionSettingFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.g;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.atomic.AtomicInteger;

public class c
  extends Observable
  implements d.b
{
  private static final int r = 11;
  private h a;
  private e b;
  private o c;
  private b d;
  private k e;
  private com.fimi.soul.module.dronemanage.d f;
  private com.fimi.soul.drone.a g;
  private int h;
  private int i;
  private boolean j = true;
  private boolean k = true;
  private boolean l = true;
  private boolean m = true;
  private int n = 1000;
  private boolean o = true;
  private boolean p;
  private FragmentManager q;
  private Handler s = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (paramAnonymousMessage.what == c.a(c.this)) {
        c.a(c.this, false);
      }
      while (paramAnonymousMessage.what != 11) {
        return;
      }
      c.b(c.this, false);
    }
  };
  
  public c(com.fimi.soul.drone.a parama, com.google.android.gms.maps.c paramc, Context paramContext, FragmentManager paramFragmentManager)
  {
    this.q = paramFragmentManager;
    this.g = parama;
    parama.a(this);
    this.a = h.a(parama.d);
    this.b = new e(paramc, paramContext, parama);
    this.c = new o(paramc, paramContext, parama);
    this.e = new k(paramc, paramContext, parama);
    this.f = new com.fimi.soul.module.dronemanage.d(paramc, paramContext, parama);
    this.d = new b(paramc, paramContext, parama);
  }
  
  private void e()
  {
    if ((this.h == 4) && (this.i == 1) && (!this.p))
    {
      this.b.c();
      com.fimi.kernel.utils.z.a(this.g.d, 2131362187, 3000);
      com.fimi.kernel.d.b.b(this.g.d).a(this.g.d.getString(2131362187));
      this.b.d();
    }
    this.h = this.i;
  }
  
  private void f()
  {
    if ((this.h == 10) && (this.i == 1) && (!this.p))
    {
      com.fimi.kernel.utils.z.a(this.g.d, 2131362188, 3000);
      com.fimi.kernel.d.b.b(this.g.d).a(this.g.d.getString(2131362188));
      h.a(this.g.d).a(0);
    }
    this.h = this.i;
  }
  
  private void g()
  {
    Object localObject = this.g.u();
    localObject = new LatLng(((ag)localObject).e(), ((ag)localObject).d());
    if (this.a.a().get() == 1) {
      this.c.a((LatLng)localObject);
    }
    do
    {
      return;
      if (this.a.a().get() == 2)
      {
        this.b.a((LatLng)localObject);
        return;
      }
      if (this.a.a().get() == 3)
      {
        this.e.a((LatLng)localObject);
        return;
      }
    } while (this.a.a().get() != 4);
    this.d.b((LatLng)localObject);
  }
  
  private void h()
  {
    int i1 = this.g.v().e();
    if ((this.h == 6) && (this.i == 1)) {
      this.c.c();
    }
    for (;;)
    {
      this.h = this.i;
      if (this.i == 6)
      {
        g();
        if (!this.o) {
          this.c.a(i1);
        }
      }
      return;
      if ((this.h == 7) && (this.i == 1) && (this.g.ac())) {
        this.g.a(d.a.bo);
      }
    }
  }
  
  public void a()
  {
    FlyActionBean localFlyActionBean = d.k().j();
    if (localFlyActionBean != null) {}
    switch (localFlyActionBean.getModelType())
    {
    default: 
      return;
    case 1: 
      if (2 == localFlyActionBean.getType())
      {
        this.c.a(localFlyActionBean);
        return;
      }
      d.k().m();
      this.g.a(d.a.bj);
      return;
    case 2: 
      this.b.b();
      return;
    }
    this.e.i();
  }
  
  public void a(LatLng paramLatLng, int paramInt)
  {
    if (d.k().d())
    {
      paramLatLng = d.k().c();
      if (paramLatLng != null)
      {
        paramLatLng.i();
        FlyActionBean localFlyActionBean = (FlyActionBean)paramLatLng.o();
        if (localFlyActionBean.getModelType() == 1) {
          paramLatLng.a(j.a(this.g.d, 2130838166, localFlyActionBean.getHeight(), false));
        }
        d.k().a(null);
        d.k().a(false);
      }
    }
    do
    {
      return;
      if (this.a.a().get() == 1)
      {
        this.c.a(paramLatLng, paramInt);
        return;
      }
      if (this.a.a().get() == 2)
      {
        this.b.a(paramLatLng, paramInt);
        return;
      }
    } while (this.a.a().get() != 3);
  }
  
  public void a(g paramg)
  {
    FlyActionSettingFragment localFlyActionSettingFragment = (FlyActionSettingFragment)this.q.findFragmentById(2131689827);
    if ((paramg.o() instanceof FlyActionBean)) {}
    for (FlyActionBean localFlyActionBean1 = (FlyActionBean)paramg.o();; localFlyActionBean1 = null)
    {
      Object localObject = d.k().e();
      if ((localObject != null) && (localFlyActionBean1 != null))
      {
        d.k().a(localFlyActionBean1);
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          g localg = (g)((Iterator)localObject).next();
          FlyActionBean localFlyActionBean2 = (FlyActionBean)localg.o();
          if ((localg.o() != null) && (localg.o().equals(localFlyActionBean1)))
          {
            if (localFlyActionSettingFragment != null) {
              if (localFlyActionSettingFragment.isVisible())
              {
                this.g.a(d.a.bg);
                if (localFlyActionBean1.getModelType() == 1)
                {
                  localFlyActionBean2.setDrawableRes(2130838167);
                  paramg.a(j.a(this.g.d, 2130838167, localFlyActionBean2.getHeight(), true));
                  d.k().a(true);
                  d.k().a(localFlyActionBean2);
                  d.k().a(localg);
                }
              }
              else if (localFlyActionBean1.getModelType() == 1)
              {
                this.c.e();
              }
              else if (localFlyActionBean1.getModelType() == 2)
              {
                paramg.a(this.g.d.getString(2131362123));
                paramg.h();
              }
              else if (localFlyActionBean1.getModelType() == 3)
              {
                paramg.a(this.g.d.getString(2131362123));
                paramg.h();
              }
            }
          }
          else if ((localFlyActionSettingFragment != null) && (localFlyActionSettingFragment.isVisible()) && (2 == localFlyActionBean1.getType()) && (localFlyActionBean2 != null))
          {
            localg.a(j.a(this.g.d, 2130838166, localFlyActionBean2.getHeight(), false));
            localFlyActionBean2.setDrawableRes(2130838166);
          }
        }
      }
      return;
    }
  }
  
  public void b()
  {
    if (this.a.a().get() == 1) {
      this.c.d();
    }
    while ((this.a.a().get() == 2) || (this.a.a().get() != 3)) {
      return;
    }
  }
  
  public void c()
  {
    this.j = true;
    this.k = true;
    this.l = true;
    this.m = true;
    d.k().h().clear();
  }
  
  public void d()
  {
    this.g.a(this);
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    Object localObject;
    switch (2.a[parama.ordinal()])
    {
    default: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      do
      {
        return;
        this.d.c();
        return;
        this.e.a();
        return;
        c();
        this.j = true;
        d.k().m();
        this.c.b();
        this.b.b();
        this.e.i();
        this.d.c();
        return;
        this.c.e();
        return;
        this.p = true;
        if (!this.s.hasMessages(11)) {
          this.s.sendEmptyMessageDelayed(11, 2000L);
        }
        for (;;)
        {
          parama = parama1.o();
          if (parama.e() == 51)
          {
            localObject = d.k().e();
            if ((localObject != null) && (((List)localObject).size() == 0))
            {
              localObject = new LatLng(parama.h(), parama.b());
              d.k().a((int)parama.h());
              d.k().b(parama.i());
              this.b.a((LatLng)localObject, 2130838198);
            }
            this.b.a();
          }
          com.fimi.soul.biz.j.b.a(parama.d());
          com.fimi.soul.module.b.d.a(parama1).c(133);
          return;
          this.s.removeMessages(11);
          this.s.sendEmptyMessageDelayed(11, 2000L);
        }
        this.o = true;
        if (!this.s.hasMessages(this.n)) {
          this.s.sendEmptyMessageDelayed(this.n, 3000L);
        }
        this.c.a();
        return;
        this.i = parama1.aj().e();
        return;
        this.c.b();
        this.b.b();
        this.e.i();
        d.k().m();
        parama1.a(d.a.bE);
        return;
        this.o = true;
        if (!this.s.hasMessages(this.n)) {
          this.s.sendEmptyMessageDelayed(this.n, 3000L);
        }
        this.c.a();
        return;
        if (this.a.a().get() == 1)
        {
          if ((this.j) && (d.k().h().size() < 1) && (this.i == 6))
          {
            this.j = false;
            parama1.a(d.a.bk);
            return;
          }
          h();
          return;
        }
        if (this.a.a().get() == 2)
        {
          if ((this.k) && (d.k().h().size() < 1) && (this.i == 4))
          {
            this.k = false;
            parama1.a(d.a.bs);
            return;
          }
          if (this.i == 4)
          {
            g();
            this.b.f();
          }
          e();
          return;
        }
        if (this.a.a().get() != 3) {
          break;
        }
        if ((this.l) && (d.k().h().size() < 1) && (this.i == 5))
        {
          this.l = false;
          parama1.a(d.a.bF);
          return;
        }
      } while (this.i != 5);
      g();
      return;
      if (this.a.a().get() == 4)
      {
        if ((this.m) && (this.d.g()) && (this.i == 10))
        {
          this.m = false;
          com.fimi.soul.module.b.d.a(parama1).a((byte)19, (byte)0, (short)0, (short)0, (byte)0, (short)0, 0.0F, 0.0F);
          return;
        }
        if (this.i == 10) {
          g();
        }
        f();
        return;
      }
      this.h = 0;
      return;
    case 12: 
    case 13: 
      this.c.f();
      this.b.g();
      this.e.e();
      return;
    case 14: 
      this.c.g();
      this.b.h();
      this.e.f();
      return;
    case 15: 
      this.c.h();
      return;
    case 16: 
      this.p = true;
      this.b.e();
      return;
    case 17: 
      a();
      return;
    case 18: 
      parama = parama1.q();
      if ((parama.j() == 22) && (d.k().h().size() < 1) && (this.i == 5))
      {
        localObject = new FlyActionBean();
        ((FlyActionBean)localObject).setYaw_mode(parama.b() / 10);
        ((FlyActionBean)localObject).setLatLng(new LatLng(parama.h(), parama.i()));
        ((FlyActionBean)localObject).setDrawableRes(2130838198);
        ((FlyActionBean)localObject).setCanclick(true);
        ((FlyActionBean)localObject).setType(1);
        ((FlyActionBean)localObject).setModelType(3);
        ((FlyActionBean)localObject).setStyleInfo(2);
        ((FlyActionBean)localObject).setStart_point_agle((short)(int)(parama.d() * 1.412D));
        ((FlyActionBean)localObject).setSpeek(parama.e() / 10);
        ((FlyActionBean)localObject).setRidus(parama.f() / 10);
        ((FlyActionBean)localObject).setPara1(parama.c());
        ((FlyActionBean)localObject).setHeight((int)parama.g() / 10);
        this.e.a((FlyActionBean)localObject);
      }
      for (;;)
      {
        parama1.a(d.a.bG);
        return;
        this.e.g();
      }
    case 19: 
      this.e.f();
      return;
    case 20: 
      parama = parama1.ap();
      if (parama.j() == 18)
      {
        this.p = true;
        if (!this.s.hasMessages(11))
        {
          this.s.sendEmptyMessageDelayed(11, 2000L);
          return;
        }
        this.s.removeMessages(11);
        this.s.sendEmptyMessageDelayed(11, 2000L);
        return;
      }
      parama = new LatLng(parama.c(), parama.e());
      this.d.a(parama);
      this.d.b();
      return;
    case 21: 
      this.p = true;
      return;
    case 22: 
      this.d.c();
      return;
    case 23: 
      this.d.a();
      return;
    }
    this.d.b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */