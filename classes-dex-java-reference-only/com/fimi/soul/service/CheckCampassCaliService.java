package com.fimi.soul.service;

import android.app.IntentService;
import android.content.Intent;
import android.location.Location;
import com.fimi.kernel.c.c;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.entity.CheckCampssBeann;
import com.fimi.soul.module.update.a.d;
import com.fimi.soul.utils.ag;
import com.fimi.soul.utils.y;
import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;
import java.util.List;

public class CheckCampassCaliService
  extends IntentService
{
  DroidPlannerApp a;
  private Location b;
  
  public CheckCampassCaliService()
  {
    super("CheckCampassCaliService");
  }
  
  public CheckCampassCaliService(String paramString)
  {
    super(paramString);
  }
  
  public void onCreate()
  {
    super.onCreate();
    this.a = ((DroidPlannerApp)getApplication());
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    this.a.a.a(d.a.bT);
    paramIntent = (CheckCampssBeann)c.a().a("checkcampass", CheckCampssBeann.class);
    if (paramIntent == null) {
      this.a.a.a(d.a.be);
    }
    double d1;
    do
    {
      return;
      Object localObject = MyLocationManager.a(this).c();
      if (localObject == null)
      {
        this.a.a.a(d.a.be);
        return;
      }
      localObject = new LatLng(((Location)localObject).getLatitude(), ((Location)localObject).getLongitude());
      paramIntent = paramIntent.getListLatlng().iterator();
      d1 = 0.0D;
      while (paramIntent.hasNext())
      {
        double d2 = y.c((LatLng)localObject, (LatLng)paramIntent.next()).a();
        d1 = d2;
        if (d2 <= 3000.0D) {
          d1 = d2;
        }
      }
    } while (d1 <= 3000.0D);
    this.a.a.a(d.a.be);
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    super.onStart(paramIntent, paramInt);
    d.a(this.a.a);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/CheckCampassCaliService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */