package com.fimi.soul.biz.c;

import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.al;
import com.fimi.soul.drone.h.am;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.af;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class p
  implements m
{
  private List<FlyActionBean> a;
  private com.fimi.soul.drone.a b;
  private volatile int c = 1;
  
  public p(com.fimi.soul.drone.a parama)
  {
    this.b = parama;
  }
  
  public void a()
  {
    al localal = this.b.l();
    if (localal.a() < this.c) {}
    while ((this.c != localal.a()) || (localal.g() != 0.0D) || (this.a == null) || (this.c > this.a.size())) {
      return;
    }
    if (localal.a() == this.a.size())
    {
      com.fimi.soul.module.b.d.a(this.b).q();
      return;
    }
    this.c += 1;
    a(this.c);
  }
  
  public void a(int paramInt)
  {
    FlyActionBean localFlyActionBean;
    if ((this.a.size() >= 1) && (paramInt <= this.a.size()))
    {
      localFlyActionBean = (FlyActionBean)this.a.get(paramInt - 1);
      if (com.fimi.soul.biz.n.a.a().b()) {
        break label127;
      }
      localObject = com.fimi.soul.utils.z.a(0.5D, localFlyActionBean.getLatLng().a, localFlyActionBean.getLatLng().b);
    }
    label127:
    for (Object localObject = new LatLng(((af)localObject).a(), ((af)localObject).b());; localObject = new LatLng(localFlyActionBean.getLatLng().a, localFlyActionBean.getLatLng().b))
    {
      com.fimi.soul.module.b.d.a(this.b).a(paramInt, ((LatLng)localObject).b, ((LatLng)localObject).a, (short)localFlyActionBean.getHeight(), (short)this.a.size(), localFlyActionBean.getSpeek());
      return;
    }
  }
  
  public void a(am paramam)
  {
    List localList1 = d.k().h();
    List localList2 = d.k().f();
    LatLng localLatLng = new LatLng(paramam.c(), paramam.b());
    if ((localList1 != null) && (!localList1.contains(localLatLng)) && (paramam.h() != 0))
    {
      localList1.add(localLatLng);
      FlyActionBean localFlyActionBean = new FlyActionBean();
      localFlyActionBean.setLatLng(localLatLng);
      localFlyActionBean.setHeight((int)paramam.d());
      localFlyActionBean.setType(1);
      localFlyActionBean.setModelType(1);
      localFlyActionBean.setSpeek((int)paramam.g());
      if ((localList2 != null) && (!localList2.contains(localFlyActionBean))) {
        localList2.add(localFlyActionBean);
      }
    }
    if (paramam.h() <= localList1.size())
    {
      this.b.a(d.a.bl);
      return;
    }
    b(paramam.a() + 1);
  }
  
  public void a(List<FlyActionBean> paramList)
  {
    if ((paramList != null) && (paramList.size() <= 0))
    {
      com.fimi.kernel.utils.z.a(this.b.d, 2131362518);
      return;
    }
    this.c = 1;
    this.a = paramList;
    a(this.c);
  }
  
  public void b(int paramInt)
  {
    com.fimi.soul.module.b.d.a(this.b).a(paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */