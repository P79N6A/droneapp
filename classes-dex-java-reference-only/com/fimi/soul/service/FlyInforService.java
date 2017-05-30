package com.fimi.soul.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import com.fimi.kernel.c.c;
import com.fimi.soul.entity.DroneInfoBean;
import com.fimi.soul.entity.UpdateDroneInforBean;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.ao;

public class FlyInforService
  extends Service
{
  private DroneInfoBean a = new DroneInfoBean();
  private c b;
  
  private void a()
  {
    UpdateDroneInforBean localUpdateDroneInforBean = new UpdateDroneInforBean();
    Object localObject = com.fimi.soul.base.a.b(this);
    if ((localObject != null) && (((User)localObject).getUserID() != null) && (!"".equals(((User)localObject).getUserID()))) {
      localUpdateDroneInforBean.setUserID(((User)localObject).getUserID());
    }
    localObject = (com.fimi.soul.drone.e.a)this.b.a("0", com.fimi.soul.drone.e.a.class);
    if (localObject != null)
    {
      localUpdateDroneInforBean.setPlaneID(((com.fimi.soul.drone.e.a)localObject).d() + "" + ((com.fimi.soul.drone.e.a)localObject).e() + "" + ((com.fimi.soul.drone.e.a)localObject).g());
      this.a.setFlySoftVersion(((com.fimi.soul.drone.e.a)localObject).c());
    }
    localObject = (com.fimi.soul.drone.e.a)this.b.a("1", com.fimi.soul.drone.e.a.class);
    if (localObject != null)
    {
      this.a.setRemoteId(((com.fimi.soul.drone.e.a)localObject).d() + "" + ((com.fimi.soul.drone.e.a)localObject).e() + "" + ((com.fimi.soul.drone.e.a)localObject).g());
      this.a.setRemoteSoftVersion(((com.fimi.soul.drone.e.a)localObject).c());
    }
    localObject = (com.fimi.soul.drone.e.a)this.b.a("3", com.fimi.soul.drone.e.a.class);
    if (localObject != null)
    {
      this.a.setCoulidId(((com.fimi.soul.drone.e.a)localObject).d() + "" + ((com.fimi.soul.drone.e.a)localObject).e() + "" + ((com.fimi.soul.drone.e.a)localObject).g());
      this.a.setCloudSoftVersion(((com.fimi.soul.drone.e.a)localObject).c());
    }
    localObject = (com.fimi.soul.drone.e.a)this.b.a("9", com.fimi.soul.drone.e.a.class);
    if (localObject != null) {
      this.a.setLightStreamVersion(((com.fimi.soul.drone.e.a)localObject).c());
    }
    localUpdateDroneInforBean.setmDroneInfoBean(this.a);
    this.b.a("flyinfo", localUpdateDroneInforBean);
  }
  
  @Nullable
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    this.b = c.a();
    this.a.setPhoneDevice(ao.g(getApplicationContext()).substring(0, ao.g(getApplicationContext()).indexOf(",")));
    this.a.setTelePhoneId(ao.g(getApplicationContext()).substring(ao.g(getApplicationContext()).indexOf(",") + 1));
    this.a.setAppSoftVersion(ao.d(getApplicationContext()));
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    if (ao.b(getApplicationContext())) {
      new com.fimi.soul.biz.b.a(getApplicationContext()).a();
    }
    a();
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/FlyInforService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */