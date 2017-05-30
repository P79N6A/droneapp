package com.fimi.soul.biz.c;

import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.af;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class f
  implements m
{
  private com.fimi.soul.drone.a a;
  
  public f(com.fimi.soul.drone.a parama)
  {
    this.a = parama;
  }
  
  public void a()
  {
    d.a(this.a).a(0, 0.0D, 0.0D, (short)0, 170, 0);
  }
  
  public void a(List<FlyActionBean> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      FlyActionBean localFlyActionBean = (FlyActionBean)paramList.get(0);
      if (!com.fimi.soul.biz.n.a.a().b()) {
        paramList = com.fimi.soul.utils.z.a(0.5D, localFlyActionBean.getLatLng().a, localFlyActionBean.getLatLng().b);
      }
      for (paramList = new LatLng(paramList.a(), paramList.b());; paramList = new LatLng(localFlyActionBean.getLatLng().a, localFlyActionBean.getLatLng().b))
      {
        d.a(this.a).a(1, paramList.b, paramList.a, (short)localFlyActionBean.getHeight(), 85, localFlyActionBean.getSpeek());
        return;
      }
    }
    com.fimi.kernel.utils.z.a(this.a.d, 2131362512);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */