package com.google.firebase.iid;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.firebase.b;
import java.io.IOException;

public class FirebaseInstanceIdService
  extends zzb
{
  private static BroadcastReceiver c;
  private static final Object d = new Object();
  private static boolean e = false;
  private boolean f = false;
  
  private c a(String paramString)
  {
    if (paramString == null) {
      return c.a(this, null);
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("subtype", paramString);
    return c.a(this, localBundle);
  }
  
  static void a(Context paramContext)
  {
    if (e.a(paramContext) == null) {
      return;
    }
    synchronized (d)
    {
      if (!e)
      {
        paramContext.sendBroadcast(c(0));
        e = true;
      }
      return;
    }
  }
  
  static void a(Context paramContext, FirebaseInstanceId paramFirebaseInstanceId)
  {
    synchronized (d)
    {
      if (e) {
        return;
      }
      ??? = paramFirebaseInstanceId.g();
      if ((??? == null) || (((f.a)???).b(c.e)) || (paramFirebaseInstanceId.i().a() != null))
      {
        a(paramContext);
        return;
      }
    }
  }
  
  private void a(Intent arg1, String paramString)
  {
    boolean bool = c(this);
    final int i = b(???, bool);
    Log.d("FirebaseInstanceId", String.valueOf(paramString).length() + 47 + "background sync failed: " + paramString + ", retry in " + i + "s");
    synchronized (d)
    {
      d(i);
      e = true;
      if (!bool)
      {
        if (this.f) {
          Log.d("FirebaseInstanceId", "device not connected. Connectivity change received registered");
        }
        if (c == null) {
          c = new BroadcastReceiver()
          {
            public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
            {
              if (FirebaseInstanceIdService.b(paramAnonymousContext))
              {
                if (FirebaseInstanceIdService.a(FirebaseInstanceIdService.this)) {
                  Log.d("FirebaseInstanceId", "connectivity changed. starting background sync.");
                }
                FirebaseInstanceIdService.this.getApplicationContext().unregisterReceiver(this);
                paramAnonymousContext.sendBroadcast(FirebaseInstanceIdService.a(i));
              }
            }
          };
        }
        getApplicationContext().registerReceiver(c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
      }
      return;
    }
  }
  
  private void a(Intent paramIntent, boolean paramBoolean)
  {
    synchronized (d)
    {
      e = false;
      if (e.a(this) == null) {
        return;
      }
    }
    ??? = FirebaseInstanceId.a();
    if (((FirebaseInstanceId)???).g() == null) {
      try
      {
        if (((FirebaseInstanceId)???).h() != null)
        {
          if (this.f) {
            Log.d("FirebaseInstanceId", "get master token succeeded");
          }
          a(this, (FirebaseInstanceId)???);
          a();
          return;
        }
      }
      catch (IOException localIOException1)
      {
        a(paramIntent, localIOException1.getMessage());
        return;
        a(paramIntent, "returned token is null");
        return;
      }
      catch (SecurityException paramIntent)
      {
        Log.e("FirebaseInstanceId", "Unable to get master token", paramIntent);
        return;
      }
    }
    d locald = localIOException1.i();
    String str = locald.a();
    if (str != null)
    {
      Object localObject3 = str.split("!");
      Object localObject2;
      int j;
      if (localObject3.length == 2)
      {
        localObject2 = localObject3[0];
        localObject3 = localObject3[1];
        j = -1;
      }
      for (;;)
      {
        try
        {
          int k = ((String)localObject2).hashCode();
          int i = j;
          switch (k)
          {
          default: 
            i = j;
          case 84: 
            switch (i)
            {
            default: 
              locald.b(str);
              str = locald.a();
            }
            break;
          case 83: 
            i = j;
            if (!((String)localObject2).equals("S")) {
              continue;
            }
            i = 0;
            break;
          case 85: 
            i = j;
            if (!((String)localObject2).equals("U")) {
              continue;
            }
            i = 1;
            continue;
            FirebaseInstanceId.a().b((String)localObject3);
            if (!this.f) {
              continue;
            }
            Log.d("FirebaseInstanceId", "subscribe operation succeeded");
            continue;
            FirebaseInstanceId.a().c((String)localObject3);
          }
        }
        catch (IOException localIOException2)
        {
          a(paramIntent, localIOException2.getMessage());
          return;
        }
        if (this.f) {
          Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
        }
      }
    }
    Log.d("FirebaseInstanceId", "topic sync succeeded");
  }
  
  private void a(e parame, Bundle paramBundle)
  {
    String str = e.a(this);
    if (str == null)
    {
      Log.w("FirebaseInstanceId", "Unable to respond to ping due to missing target package");
      return;
    }
    Intent localIntent = new Intent("com.google.android.gcm.intent.SEND");
    localIntent.setPackage(str);
    localIntent.putExtras(paramBundle);
    parame.a(localIntent);
    localIntent.putExtra("google.to", "google.com/iid");
    localIntent.putExtra("google.message_id", e.b());
    sendOrderedBroadcast(localIntent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
  }
  
  private int b(Intent paramIntent, boolean paramBoolean)
  {
    int j = 10;
    int i;
    if (paramIntent == null)
    {
      i = 10;
      if ((i >= 10) || (paramBoolean)) {
        break label39;
      }
      j = 30;
    }
    label39:
    while (i < 10)
    {
      return j;
      i = paramIntent.getIntExtra("next_retry_delay_in_seconds", 0);
      break;
    }
    if (i > 28800) {
      return 28800;
    }
    return i;
  }
  
  private static Intent c(int paramInt)
  {
    Context localContext = b.d().a();
    Intent localIntent = new Intent("ACTION_TOKEN_REFRESH_RETRY");
    localIntent.putExtra("next_retry_delay_in_seconds", paramInt);
    return FirebaseInstanceIdInternalReceiver.a(localContext, localIntent);
  }
  
  private static boolean c(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.isConnected());
  }
  
  private void d(int paramInt)
  {
    AlarmManager localAlarmManager = (AlarmManager)getSystemService("alarm");
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(this, 0, c(paramInt * 2), 268435456);
    localAlarmManager.set(3, SystemClock.elapsedRealtime() + paramInt * 1000, localPendingIntent);
  }
  
  private String e(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("subtype");
    paramIntent = str;
    if (str == null) {
      paramIntent = "";
    }
    return paramIntent;
  }
  
  @WorkerThread
  public void a() {}
  
  public boolean a(Intent paramIntent)
  {
    this.f = Log.isLoggable("FirebaseInstanceId", 3);
    if ((paramIntent.getStringExtra("error") != null) || (paramIntent.getStringExtra("registration_id") != null))
    {
      String str2 = e(paramIntent);
      if (this.f)
      {
        str1 = String.valueOf(str2);
        if (str1.length() == 0) {
          break label84;
        }
      }
      label84:
      for (String str1 = "Register result in service ".concat(str1);; str1 = new String("Register result in service "))
      {
        Log.d("FirebaseInstanceId", str1);
        a(str2).e().d(paramIntent);
        return true;
      }
    }
    return false;
  }
  
  public void b(Intent paramIntent)
  {
    String str2 = paramIntent.getAction();
    String str1 = str2;
    if (str2 == null) {
      str1 = "";
    }
    switch (str1.hashCode())
    {
    }
    label40:
    for (int i = -1;; i = 0) {
      switch (i)
      {
      default: 
        d(paramIntent);
        return;
        if (!str1.equals("ACTION_TOKEN_REFRESH_RETRY")) {
          break label40;
        }
      }
    }
    a(paramIntent, false);
  }
  
  protected Intent c(Intent paramIntent)
  {
    return FirebaseInstanceIdInternalReceiver.a();
  }
  
  public void d(Intent paramIntent)
  {
    String str2 = e(paramIntent);
    c localc = a(str2);
    String str1 = paramIntent.getStringExtra("CMD");
    Object localObject;
    if (this.f)
    {
      localObject = String.valueOf(paramIntent.getExtras());
      Log.d("FirebaseInstanceId", String.valueOf(str2).length() + 18 + String.valueOf(str1).length() + String.valueOf(localObject).length() + "Service command " + str2 + " " + str1 + " " + (String)localObject);
    }
    if (paramIntent.getStringExtra("unregistered") != null)
    {
      localObject = localc.d();
      str1 = str2;
      if (str2 == null) {
        str1 = "";
      }
      ((f)localObject).d(str1);
      localc.e().d(paramIntent);
    }
    do
    {
      do
      {
        return;
        if ("gcm.googleapis.com/refresh".equals(paramIntent.getStringExtra("from")))
        {
          localc.d().d(str2);
          a(paramIntent, false);
          return;
        }
        if ("RST".equals(str1))
        {
          localc.c();
          a(paramIntent, true);
          return;
        }
        if (!"RST_FULL".equals(str1)) {
          break;
        }
      } while (localc.d().b());
      localc.c();
      localc.d().c();
      a(paramIntent, true);
      return;
      if ("SYNC".equals(str1))
      {
        localc.d().d(str2);
        a(paramIntent, false);
        return;
      }
    } while (!"PING".equals(str1));
    a(localc.e(), paramIntent.getExtras());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/iid/FirebaseInstanceIdService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */