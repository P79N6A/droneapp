package com.google.firebase.crash.internal.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.firebase.crash.internal.g;
import com.google.firebase.crash.internal.g.a;

public final class FirebaseCrashSenderService
  extends IntentService
{
  public static final String a = String.valueOf(d).concat(".SEND");
  public static final String b = String.valueOf(d).concat(".API_KEY");
  private static final String c = FirebaseCrashSenderService.class.getSimpleName();
  private static final String d = FirebaseCrashSenderService.class.getName();
  private com.google.firebase.crash.internal.f e;
  
  @Keep
  public FirebaseCrashSenderService()
  {
    super(FirebaseCrashSenderService.class.getSimpleName());
  }
  
  public void onCreate()
  {
    super.onCreate();
    try
    {
      g.a().a(getApplicationContext());
      this.e = g.a().d();
      this.e.a(com.google.android.gms.c.f.a(this));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e(c, "Unexpected failure remoting onCreate()", localRemoteException);
      this.e = null;
      return;
    }
    catch (g.a locala)
    {
      for (;;) {}
    }
  }
  
  public void onDestroy()
  {
    if (this.e != null) {}
    try
    {
      this.e.a();
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e(c, "Unexpected failure remoting onDestroy()", localRemoteException);
      }
    }
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    if (this.e != null) {}
    try
    {
      this.e.b(com.google.android.gms.c.f.a(paramIntent));
      return;
    }
    catch (RemoteException paramIntent)
    {
      Log.e(c, "Unexpected failure remoting onRunTask()", paramIntent);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/crash/internal/service/FirebaseCrashSenderService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */