package com.google.android.gms.cast.framework.media;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.internal.afc;

public class MediaNotificationService
  extends Service
{
  public static final String a = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION";
  private static final m b = new m("MediaNotificationService");
  private f c;
  
  public IBinder onBind(Intent paramIntent)
  {
    try
    {
      paramIntent = this.c.a(paramIntent);
      return paramIntent;
    }
    catch (RemoteException paramIntent)
    {
      b.a(paramIntent, "Unable to call %s on %s.", new Object[] { "onBind", f.class.getSimpleName() });
    }
    return null;
  }
  
  public void onCreate()
  {
    CastOptions localCastOptions = c.a(this).a();
    this.c = afc.a(this, c.a(this).f(), com.google.android.gms.c.f.a(null), localCastOptions.g());
    try
    {
      this.c.a();
      super.onCreate();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        b.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "onCreate", f.class.getSimpleName() });
      }
    }
  }
  
  public void onDestroy()
  {
    try
    {
      this.c.b();
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        b.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "onDestroy", f.class.getSimpleName() });
      }
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = this.c.a(paramIntent, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (RemoteException paramIntent)
    {
      b.a(paramIntent, "Unable to call %s on %s.", new Object[] { "onStartCommand", f.class.getSimpleName() });
    }
    return 1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/MediaNotificationService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */