package com.google.firebase.crash.internal.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.firebase.crash.internal.e;
import com.google.firebase.crash.internal.g;
import com.google.firebase.crash.internal.g.a;

public final class FirebaseCrashReceiverService
  extends IntentService
{
  public static final String a = String.valueOf(g).concat(".SAVE");
  public static final String b = String.valueOf(g).concat(".CRASH_REPORT");
  public static final String c = String.valueOf(g).concat(".CRASH_TIME");
  public static final String d = String.valueOf(g).concat(".API_KEY");
  public static final String e = String.valueOf(g).concat(".IS_FATAL");
  private static final String f = FirebaseCrashReceiverService.class.getSimpleName();
  private static final String g = FirebaseCrashReceiverService.class.getName();
  private e h;
  
  @Keep
  public FirebaseCrashReceiverService()
  {
    super(FirebaseCrashReceiverService.class.getSimpleName());
  }
  
  public void onCreate()
  {
    super.onCreate();
    try
    {
      g.a().a(getApplicationContext());
      this.h = g.a().c();
      this.h.a(f.a(this));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e(f, "Unexpected failure remoting onCreate()", localRemoteException);
      this.h = null;
      return;
    }
    catch (g.a locala)
    {
      for (;;) {}
    }
  }
  
  public void onDestroy()
  {
    if (this.h != null) {}
    try
    {
      this.h.a();
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e(f, "Unexpected failure remoting onDestroy()", localRemoteException);
      }
    }
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    if (this.h != null) {}
    try
    {
      this.h.b(f.a(paramIntent));
      return;
    }
    catch (RemoteException paramIntent)
    {
      Log.e(f, "Unexpected failure remoting onHandleIntent()", paramIntent);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/crash/internal/service/FirebaseCrashReceiverService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */