package com.fimi.soul.biz.c;

import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.b.d;
import com.fimi.soul.utils.af;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class l
  implements m
{
  private com.fimi.soul.drone.a a;
  
  public l(com.fimi.soul.drone.a parama)
  {
    this.a = parama;
  }
  
  public void a()
  {
    d.a(this.a).a(1, 0.0D, 0.0D, 0, 22, 0, 0, 0, 0, 0);
  }
  
  public void a(List<FlyActionBean> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      FlyActionBean localFlyActionBean = (FlyActionBean)paramList.get(0);
      int i;
      if ((localFlyActionBean.getPara1() == 0) || (localFlyActionBean.getPara1() == 1))
      {
        i = (short)(int)((360 - localFlyActionBean.getStart_point_agle()) / 1.412D);
        if (com.fimi.soul.biz.n.a.a().b()) {
          break label170;
        }
        paramList = com.fimi.soul.utils.z.a(0.5D, localFlyActionBean.getLatLng().a, localFlyActionBean.getLatLng().b);
      }
      label170:
      for (paramList = new LatLng(paramList.a(), paramList.b());; paramList = new LatLng(localFlyActionBean.getLatLng().a, localFlyActionBean.getLatLng().b))
      {
        d.a(this.a).a(1, paramList.b, paramList.a, localFlyActionBean.getHeight() * 10, localFlyActionBean.getOpration_Code(), localFlyActionBean.getRidus() * 10, localFlyActionBean.getSpeek() * 10, i, localFlyActionBean.getPara1(), localFlyActionBean.getYaw_mode());
        return;
        i = (short)(int)(localFlyActionBean.getStart_point_agle() / 1.412D);
        break;
      }
    }
    com.fimi.kernel.utils.z.a(this.a.d, 2131362515);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */