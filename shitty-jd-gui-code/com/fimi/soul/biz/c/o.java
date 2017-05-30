package com.fimi.soul.biz.c;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.a.e;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.ag;
import com.fimi.soul.utils.y;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.g;
import java.util.Iterator;
import java.util.List;

public class o
  implements a
{
  Handler a = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if ((paramAnonymousMessage.what == o.a(o.this)) && (o.b(o.this) != null))
      {
        if (o.c(o.this) != true) {
          break label114;
        }
        paramAnonymousMessage = j.a(o.d(o.this).d, 2130838207, o.e(o.this).getHeight(), false);
        o.b(o.this).a(paramAnonymousMessage);
        o.a(o.this, false);
      }
      for (;;)
      {
        o.this.a.sendEmptyMessageDelayed(o.a(o.this), o.f(o.this));
        return;
        label114:
        paramAnonymousMessage = j.a(o.d(o.this).d, 2130838208, o.e(o.this).getHeight(), false);
        o.b(o.this).a(paramAnonymousMessage);
        o.a(o.this, true);
      }
    }
  };
  private com.google.android.gms.maps.c b;
  private Context c;
  private volatile com.google.android.gms.maps.model.i d;
  private d e;
  private com.fimi.soul.drone.a f;
  private volatile com.google.android.gms.maps.model.i g;
  private g h;
  private FlyActionBean i;
  private int j = 100;
  private boolean k;
  private int l = 200;
  
  public o(com.google.android.gms.maps.c paramc, Context paramContext, com.fimi.soul.drone.a parama)
  {
    this.f = parama;
    this.b = paramc;
    this.c = paramContext;
    this.e = d.k();
  }
  
  public void a()
  {
    Object localObject3;
    FlyActionBean localFlyActionBean;
    try
    {
      List localList = d.k().e();
      if ((d.k().f().size() > 0) && (localList.size() == 0))
      {
        localObject3 = d.k().f().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localFlyActionBean = (FlyActionBean)((Iterator)localObject3).next();
          g localg = this.b.a(i.a(localFlyActionBean.getLatLng(), 2130838206));
          localg.a(localFlyActionBean);
          localg.a(0.5F, 0.88F);
          localg.i();
          if (!localList.contains(localg)) {
            localList.add(localg);
          }
        }
      }
      if (localObject1 == null) {
        break label284;
      }
    }
    finally {}
    int m;
    if (((List)localObject1).size() > 1) {
      m = 0;
    }
    for (;;)
    {
      if (m < ((List)localObject1).size())
      {
        localObject3 = (g)((List)localObject1).get(m);
        localFlyActionBean = (FlyActionBean)((g)localObject3).o();
        if (m == ((List)localObject1).size() - 1)
        {
          ((g)localObject3).a(j.a(2130838198));
          localFlyActionBean.setStyleInfo(2);
          localFlyActionBean.setCanclick(true);
          localFlyActionBean.setDrawableRes(2130838198);
          ((g)localObject3).a(0.1F, 0.9F);
        }
        for (;;)
        {
          localFlyActionBean.setModelType(1);
          ((g)localObject3).a(false);
          if (!((g)localObject3).j()) {
            break;
          }
          ((g)localObject3).i();
          break;
          localFlyActionBean.setCanclick(false);
          ((g)localObject3).a(j.a(2130838206));
          localFlyActionBean.setDrawableRes(2130838206);
          ((g)localObject3).a(0.5F, 0.7F);
        }
        label284:
        if (((List)localObject1).size() > 0)
        {
          localObject2 = (g)((List)localObject1).get(0);
          localObject3 = (FlyActionBean)((g)localObject2).o();
          ((g)localObject2).a(j.a(2130838198));
          ((FlyActionBean)localObject3).setStyleInfo(2);
          ((FlyActionBean)localObject3).setCanclick(true);
          ((FlyActionBean)localObject3).setDrawableRes(2130838198);
          ((g)localObject2).a(0.1F, 0.9F);
        }
      }
      Object localObject2 = this.e.h();
      if ((localObject2 != null) && (((List)localObject2).size() > 0))
      {
        if (this.d != null) {
          break label454;
        }
        this.d = this.b.a(i.a((List)localObject2, 4, this.c.getResources().getColor(2131624193)));
      }
      for (;;)
      {
        this.e.a(this.d);
        if (this.g != null)
        {
          this.g.a();
          this.g = null;
        }
        if (d.k().b() != null) {
          d.k().b().clear();
        }
        return;
        label454:
        this.d.a((List)localObject2);
      }
      m += 1;
    }
  }
  
  public void a(int paramInt)
  {
    if (this.f.aj().e() == 6)
    {
      List localList = this.e.e();
      if ((localList.size() >= 1) && (paramInt <= localList.size()) && (paramInt >= 1))
      {
        g localg;
        if (paramInt <= localList.size() - 1)
        {
          localg = (g)localList.get(paramInt - 1);
          this.h = localg;
          localg.a(0.3F, 0.7F);
          this.i = ((FlyActionBean)localg.o());
          if (!this.a.hasMessages(this.j)) {
            this.a.sendEmptyMessageDelayed(this.j, this.l);
          }
        }
        while (paramInt >= 2)
        {
          int m = 0;
          while (m < paramInt - 1)
          {
            localg = (g)localList.get(m);
            localg.a(j.a(2130838209));
            localg.a(0.2F, 0.7F);
            m += 1;
          }
          if (paramInt == localList.size())
          {
            if (this.a.hasMessages(this.j)) {
              this.a.removeMessages(this.j);
            }
            localg = (g)localList.get(localList.size() - 1);
            FlyActionBean localFlyActionBean = (FlyActionBean)localg.o();
            localg.a(j.a(this.f.d, 2130838198, localFlyActionBean.getHeight(), false));
            localg.a(0.15F, 0.9F);
          }
        }
      }
    }
  }
  
  public void a(FlyActionBean paramFlyActionBean)
  {
    int n = 0;
    Object localObject = this.e.h();
    List localList1 = this.e.f();
    List localList2 = this.e.e();
    int m = n;
    if (paramFlyActionBean != null)
    {
      m = n;
      if (localList1.contains(paramFlyActionBean))
      {
        m = localList1.indexOf(paramFlyActionBean);
        localList1.remove(paramFlyActionBean);
      }
    }
    if ((localObject != null) && (((List)localObject).contains(paramFlyActionBean.getLatLng())))
    {
      ((List)localObject).remove(paramFlyActionBean.getLatLng());
      if ((this.d != null) && (((List)localObject).size() > 0)) {
        this.d.a((List)localObject);
      }
    }
    else
    {
      if (localList2 != null)
      {
        localObject = localList2.iterator();
        while (((Iterator)localObject).hasNext())
        {
          g localg = (g)((Iterator)localObject).next();
          if (localg.o().equals(paramFlyActionBean))
          {
            localg.a();
            localList2.remove(localg);
          }
        }
      }
      if ((localList1.size() < 1) || (m > localList1.size()) || (m <= 0)) {
        break label306;
      }
      this.e.a((FlyActionBean)localList1.get(m - 1));
      label232:
      if ((localList2.size() < 1) || (m > localList2.size()) || (m <= 0)) {
        break label346;
      }
      ((g)localList2.get(m - 1)).a(j.a(this.f.d, 2130838167, paramFlyActionBean.getHeight(), true));
    }
    label306:
    label346:
    while (localList2.size() < 1)
    {
      return;
      this.f.a(d.a.bh);
      break;
      if (localList1.size() < 1) {
        break label232;
      }
      this.e.a((FlyActionBean)localList1.get(localList1.size() - 1));
      break label232;
    }
    ((g)localList2.get(localList2.size() - 1)).a(j.a(this.f.d, 2130838167, paramFlyActionBean.getHeight(), true));
  }
  
  public void a(LatLng paramLatLng)
  {
    List localList = d.k().b();
    if ((localList != null) && (!localList.contains(paramLatLng)))
    {
      localList.add(paramLatLng);
      if (localList.size() >= 2)
      {
        if (this.g != null) {
          break label82;
        }
        this.g = this.b.a(i.a(localList, 4, this.c.getResources().getColor(2131624058)).b(50.0F));
      }
    }
    return;
    label82:
    this.g.a(localList);
  }
  
  public void a(LatLng paramLatLng, int paramInt)
  {
    List localList1 = this.e.h();
    List localList2 = this.e.e();
    if ((localList2 != null) && (localList2.size() >= 20)) {
      com.fimi.kernel.utils.z.a(this.f.d, 2131362908, 3000);
    }
    do
    {
      double d1;
      do
      {
        return;
        localObject1 = com.fimi.soul.biz.k.b.a().b().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (com.google.android.gms.maps.model.c)((Iterator)localObject1).next();
          if ((localObject2 != null) && (y.c(((com.google.android.gms.maps.model.c)localObject2).c(), paramLatLng).a() < ((com.google.android.gms.maps.model.c)localObject2).d()))
          {
            com.fimi.kernel.utils.z.a(this.f.d, 2131362280, 3000);
            return;
          }
        }
        d1 = y.c(paramLatLng, new LatLng(this.f.v().b(), this.f.v().c())).a();
        if (d1 <= 500.0D) {
          break;
        }
      } while (d1 <= 500.0D);
      com.fimi.kernel.utils.z.a(this.c, 2131362551);
      return;
      Object localObject1 = new FlyActionBean();
      ((FlyActionBean)localObject1).setLatLng(paramLatLng);
      ((FlyActionBean)localObject1).setDrawableRes(paramInt);
      ((FlyActionBean)localObject1).setCanclick(true);
      ((FlyActionBean)localObject1).setType(2);
      ((FlyActionBean)localObject1).setModelType(1);
      ((FlyActionBean)localObject1).setHeight(this.e.g());
      ((FlyActionBean)localObject1).setSpeek(this.e.l());
      Object localObject2 = this.b.a(i.a(paramLatLng, this.f.d, this.e.g(), true, paramInt));
      ((g)localObject2).a(0.5F, 0.88F);
      ((g)localObject2).a(localObject1);
      ((g)localObject2).a(1000.0F);
      this.e.a((FlyActionBean)localObject1);
      if ((localList2 != null) && (!localList2.contains(localObject2)))
      {
        Iterator localIterator = localList2.iterator();
        while (localIterator.hasNext())
        {
          g localg = (g)localIterator.next();
          FlyActionBean localFlyActionBean = (FlyActionBean)localg.o();
          localg.a(j.a(this.f.d, 2130838166, localFlyActionBean.getHeight(), false));
        }
        localList2.add(localObject2);
        this.f.a(d.a.bg);
      }
      localList2 = this.e.f();
      if ((localList2 != null) && (!localList2.contains(localObject1))) {
        localList2.add(localObject1);
      }
    } while ((localList1 == null) || (localList1.contains(localList1)));
    localList1.add(paramLatLng);
    if (this.d == null) {
      this.d = this.b.a(i.a(localList1, 4, this.c.getResources().getColor(2131624193)));
    }
    for (;;)
    {
      this.e.a(this.d);
      return;
      this.d.a(localList1);
    }
  }
  
  public void b()
  {
    if (this.a.hasMessages(this.j)) {
      this.a.removeMessages(this.j);
    }
    if (this.d != null)
    {
      this.d.a();
      this.d = null;
    }
    if (this.g != null)
    {
      this.g.a();
      this.g = null;
    }
  }
  
  public void c()
  {
    List localList1 = d.k().e();
    List localList2 = d.k().h();
    int m = this.f.v().e();
    if ((localList1 != null) && (localList1.size() > 0) && (localList2 != null) && (m >= localList2.size()))
    {
      com.fimi.kernel.utils.z.a(this.f.d, 2131362189, 3000);
      com.fimi.kernel.d.b.b(this.f.d).a(this.f.d.getString(2131362189));
      ((g)localList1.get(localList1.size() - 1)).a(j.a(2130838199));
      h.a(this.f.d).a(0);
      this.f.a(d.a.bm);
    }
  }
  
  public void d()
  {
    List localList = d.k().h();
    Object localObject = d.k().f();
    if ((localList != null) && (localObject != null))
    {
      localList.clear();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        FlyActionBean localFlyActionBean = (FlyActionBean)((Iterator)localObject).next();
        if (!localList.contains(localFlyActionBean.getLatLng())) {
          localList.add(localFlyActionBean.getLatLng());
        }
      }
      this.d.a(localList);
    }
  }
  
  public void e()
  {
    if (this.a.hasMessages(this.j)) {
      this.a.removeMessages(this.j);
    }
    Object localObject = this.e.e();
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      localObject = (g)((List)localObject).get(((List)localObject).size() - 1);
      FlyActionBean localFlyActionBean = (FlyActionBean)((g)localObject).o();
      if ((localFlyActionBean != null) && (localFlyActionBean.getModelType() == 1))
      {
        localFlyActionBean.setStyleInfo(2);
        localFlyActionBean.setCanExcute(true);
        ((g)localObject).a("");
        ((g)localObject).h();
      }
    }
  }
  
  public void f()
  {
    Object localObject = this.e.e();
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      localObject = (g)((List)localObject).get(((List)localObject).size() - 1);
      FlyActionBean localFlyActionBean = (FlyActionBean)((g)localObject).o();
      if ((localObject != null) && (localFlyActionBean != null) && (localFlyActionBean.getModelType() == 1))
      {
        if (((g)localObject).j()) {
          ((g)localObject).i();
        }
        localFlyActionBean.setStyleInfo(2);
        localFlyActionBean.setCanExcute(false);
        ((g)localObject).a(this.f.d.getString(2131362123));
        ((g)localObject).h();
      }
    }
  }
  
  public void g()
  {
    Object localObject = this.e.e();
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      localObject = (g)((List)localObject).get(((List)localObject).size() - 1);
      FlyActionBean localFlyActionBean = (FlyActionBean)((g)localObject).o();
      if ((localFlyActionBean != null) && (localFlyActionBean.getModelType() == 1))
      {
        localFlyActionBean.setStyleInfo(2);
        localFlyActionBean.setCanExcute(true);
        if (((g)localObject).j())
        {
          ((g)localObject).i();
          if (!((g)localObject).j())
          {
            ((g)localObject).a("");
            ((g)localObject).h();
          }
        }
      }
    }
  }
  
  public void h()
  {
    Object localObject = this.e.e();
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      localObject = (g)((List)localObject).get(((List)localObject).size() - 1);
      if (((g)localObject).j()) {
        ((g)localObject).i();
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */