package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.internal.afc;

public class ReconnectionService
  extends Service
{
  private static final m a = new m("ReconnectionService");
  private y b;
  
  public IBinder onBind(Intent paramIntent)
  {
    try
    {
      paramIntent = this.b.a(paramIntent);
      return paramIntent;
    }
    catch (RemoteException paramIntent)
    {
      a.a(paramIntent, "Unable to call %s on %s.", new Object[] { "onBind", y.class.getSimpleName() });
    }
    return null;
  }
  
  public void onCreate()
  {
    c localc = c.a(this);
    this.b = afc.a(this, localc.b().c(), localc.e().a());
    try
    {
      this.b.a();
      super.onCreate();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "onCreate", y.class.getSimpleName() });
      }
    }
  }
  
  public void onDestroy()
  {
    try
    {
      this.b.b();
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "onDestroy", y.class.getSimpleName() });
      }
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = this.b.a(paramIntent, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (RemoteException paramIntent)
    {
      a.a(paramIntent, "Unable to call %s on %s.", new Object[] { "onStartCommand", y.class.getSimpleName() });
    }
    return 1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/ReconnectionService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */