package com.fimi.soul.biz.c;

import android.content.Context;
import android.content.res.Resources;
import com.fimi.soul.biz.k.b;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.ag;
import com.fimi.soul.utils.y;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.g;
import java.util.Iterator;
import java.util.List;

public class e
  implements a
{
  private com.google.android.gms.maps.c a;
  private Context b;
  private com.fimi.soul.drone.a c;
  private d d;
  private g e;
  private com.google.android.gms.maps.model.i f;
  
  public e(com.google.android.gms.maps.c paramc, Context paramContext, com.fimi.soul.drone.a parama)
  {
    this.c = parama;
    this.a = paramc;
    this.b = paramContext;
    this.d = d.k();
  }
  
  public void a()
  {
    if (this.e != null)
    {
      if (this.e.j()) {
        this.e.i();
      }
      this.e.a(false);
    }
  }
  
  public void a(LatLng paramLatLng)
  {
    List localList = d.k().b();
    if ((localList != null) && (!localList.contains(paramLatLng)))
    {
      localList.add(paramLatLng);
      if (localList.size() >= 2)
      {
        if (this.f != null) {
          break label80;
        }
        this.f = this.a.a(i.a(localList, 4, this.b.getResources().getColor(2131624058)).b(50.0F));
      }
    }
    return;
    label80:
    this.f.a(localList);
  }
  
  public void a(LatLng paramLatLng, int paramInt)
  {
    Object localObject1 = b.a().b().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.google.android.gms.maps.model.c)((Iterator)localObject1).next();
      if ((localObject2 != null) && (y.c(((com.google.android.gms.maps.model.c)localObject2).c(), paramLatLng).a() < ((com.google.android.gms.maps.model.c)localObject2).d())) {
        com.fimi.kernel.utils.z.a(this.c.d, 2131362280, 3000);
      }
    }
    double d1;
    do
    {
      return;
      d1 = y.c(paramLatLng, new LatLng(this.c.v().b(), this.c.v().c())).a();
      if (d1 <= 500.0D) {
        break;
      }
    } while (d1 <= 500.0D);
    com.fimi.kernel.utils.z.a(this.b, 2131362551);
    return;
    localObject1 = this.d.f();
    if (this.e == null)
    {
      localObject2 = new FlyActionBean();
      ((FlyActionBean)localObject2).setLatLng(paramLatLng);
      ((FlyActionBean)localObject2).setDrawableRes(paramInt);
      ((FlyActionBean)localObject2).setCanclick(true);
      ((FlyActionBean)localObject2).setType(2);
      ((FlyActionBean)localObject2).setModelType(2);
      ((FlyActionBean)localObject2).setStyleInfo(1);
      ((FlyActionBean)localObject2).setHeight(this.d.g());
      ((FlyActionBean)localObject2).setSpeek(this.d.l());
      this.e = this.a.a(i.a(paramLatLng, this.c.d, this.d.g(), true, paramInt));
      this.e.a(localObject2);
      this.e.a(1000.0F);
      this.e.a(0.2F, 0.8F);
      this.d.a((FlyActionBean)localObject2);
      if (!((List)localObject1).contains(localObject2)) {
        ((List)localObject1).add(localObject2);
      }
      paramLatLng = this.d.e();
      if ((paramLatLng != null) && (!paramLatLng.contains(this.e))) {
        paramLatLng.add(this.e);
      }
      this.c.a(d.a.bg);
      return;
    }
    ((FlyActionBean)this.e.o()).setLatLng(paramLatLng);
    this.e.a(paramLatLng);
  }
  
  public void b()
  {
    if (this.e != null)
    {
      this.e.a();
      this.e = null;
    }
    if (this.f != null)
    {
      this.f.a();
      this.f = null;
    }
    this.d.f().clear();
    this.c.a(d.a.bh);
  }
  
  public void c()
  {
    if (this.e != null) {
      this.e.a(j.a(2130838199));
    }
    h.a(this.b).a(0);
  }
  
  public void d()
  {
    if (this.e != null)
    {
      FlyActionBean localFlyActionBean = (FlyActionBean)this.e.o();
      if (localFlyActionBean != null) {
        localFlyActionBean.setStyleInfo(1);
      }
      this.e.a(this.c.d.getString(2131362123));
      this.e.h();
    }
  }
  
  public void e()
  {
    if (this.e != null)
    {
      FlyActionBean localFlyActionBean = (FlyActionBean)this.e.o();
      if ((localFlyActionBean != null) && (localFlyActionBean.getModelType() == 2))
      {
        localFlyActionBean.setStyleInfo(2);
        this.e.a(j.a(2130838198));
        this.e.a(this.c.d.getString(2131362123));
        this.e.h();
      }
    }
  }
  
  public void f()
  {
    if (this.e != null)
    {
      FlyActionBean localFlyActionBean = (FlyActionBean)this.e.o();
      if (localFlyActionBean != null)
      {
        localFlyActionBean.setType(1);
        this.e.a(j.a(this.c.d, 2130838198, localFlyActionBean.getHeight(), false));
      }
    }
  }
  
  public void g()
  {
    if (this.e != null)
    {
      FlyActionBean localFlyActionBean = (FlyActionBean)this.e.o();
      if ((localFlyActionBean != null) && (localFlyActionBean.getModelType() == 2) && (1 == localFlyActionBean.getType()))
      {
        localFlyActionBean.setStyleInfo(2);
        localFlyActionBean.setCanExcute(false);
        this.e.a(j.a(2130838198));
        if (this.e.j()) {
          this.e.i();
        }
        this.e.a(this.c.d.getString(2131362123));
        this.e.h();
      }
    }
  }
  
  public void h()
  {
    if (this.e != null)
    {
      FlyActionBean localFlyActionBean = (FlyActionBean)this.e.o();
      if ((localFlyActionBean != null) && (localFlyActionBean.getModelType() == 2) && (1 == localFlyActionBean.getType()))
      {
        localFlyActionBean.setStyleInfo(2);
        localFlyActionBean.setCanExcute(true);
        this.e.a(j.a(2130838198));
        if (this.e.j()) {
          this.e.i();
        }
        this.e.a(this.c.d.getString(2131362123));
        this.e.h();
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */