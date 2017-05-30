package com.fimi.soul.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.fimi.kernel.c;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;

public class DroneFaultService
  extends Service
  implements d.b
{
  public a a;
  public DroidPlannerApp b;
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    this.b = ((DroidPlannerApp)getApplication());
    this.a = this.b.a;
    this.a.a(this);
  }
  
  public void onDestroy()
  {
    startService(new Intent(this, DroneFaultService.class));
    this.a.b(this);
    super.onDestroy();
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    if (c.d() == null)
    {
      stopSelf();
      return;
    }
    int i = 1.a[parama.ordinal()];
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/DroneFaultService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */