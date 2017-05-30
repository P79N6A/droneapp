package com.google.android.gms.measurement;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.MainThread;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.f.a;

public final class AppMeasurementService
  extends Service
  implements f.a
{
  private f a;
  
  private f b()
  {
    if (this.a == null) {
      this.a = new f(this);
    }
    return this.a;
  }
  
  public Context a()
  {
    return this;
  }
  
  public boolean a(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
  
  @MainThread
  public IBinder onBind(Intent paramIntent)
  {
    return b().a(paramIntent);
  }
  
  @MainThread
  public void onCreate()
  {
    super.onCreate();
    b().a();
  }
  
  @MainThread
  public void onDestroy()
  {
    b().b();
    super.onDestroy();
  }
  
  @MainThread
  public void onRebind(Intent paramIntent)
  {
    b().c(paramIntent);
  }
  
  @MainThread
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    paramInt1 = b().a(paramIntent, paramInt1, paramInt2);
    AppMeasurementReceiver.completeWakefulIntent(paramIntent);
    return paramInt1;
  }
  
  @MainThread
  public boolean onUnbind(Intent paramIntent)
  {
    return b().b(paramIntent);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/measurement/AppMeasurementService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */