package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;

class d
{
  static AppMeasurement a;
  
  private static AppMeasurement a(Context paramContext)
  {
    if (0 == 0) {}
    try
    {
      return AppMeasurement.getInstance(paramContext);
    }
    catch (NoClassDefFoundError paramContext) {}
    paramContext = a;
    return paramContext;
    return null;
  }
  
  public static void a(Context paramContext, Intent paramIntent)
  {
    a(paramContext, "_nr", paramIntent);
  }
  
  private static void a(Context paramContext, String paramString, Intent paramIntent)
  {
    Bundle localBundle = new Bundle();
    String str = paramIntent.getStringExtra("google.c.a.c_id");
    if (str != null) {
      localBundle.putString("_nmid", str);
    }
    str = paramIntent.getStringExtra("google.c.a.c_l");
    if (str != null) {
      localBundle.putString("_nmn", str);
    }
    str = paramIntent.getStringExtra("from");
    if ((str != null) && (str.startsWith("/topics/"))) {}
    for (;;)
    {
      if (str != null) {
        localBundle.putString("_nt", str);
      }
      try
      {
        localBundle.putInt("_nmt", Integer.valueOf(paramIntent.getStringExtra("google.c.a.ts")).intValue());
        if (!paramIntent.hasExtra("google.c.a.udt")) {}
      }
      catch (NumberFormatException localNumberFormatException)
      {
        try
        {
          localBundle.putInt("_ndt", Integer.valueOf(paramIntent.getStringExtra("google.c.a.udt")).intValue());
          if (Log.isLoggable("FirebaseMessaging", 3))
          {
            paramIntent = String.valueOf(localBundle);
            Log.d("FirebaseMessaging", String.valueOf(paramString).length() + 22 + String.valueOf(paramIntent).length() + "Sending event=" + paramString + " params=" + paramIntent);
          }
          paramContext = a(paramContext);
          if (paramContext != null)
          {
            paramContext.a("fcm", paramString, localBundle);
            return;
            str = null;
            continue;
            localNumberFormatException = localNumberFormatException;
            Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", localNumberFormatException);
          }
        }
        catch (NumberFormatException paramIntent)
        {
          for (;;)
          {
            Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", paramIntent);
          }
          Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
      }
    }
  }
  
  public static void b(Context paramContext, Intent paramIntent)
  {
    e(paramContext, paramIntent);
    a(paramContext, "_no", paramIntent);
  }
  
  public static void c(Context paramContext, Intent paramIntent)
  {
    a(paramContext, "_nd", paramIntent);
  }
  
  public static void d(Context paramContext, Intent paramIntent)
  {
    a(paramContext, "_nf", paramIntent);
  }
  
  private static void e(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {}
    do
    {
      return;
      if ("1".equals(paramIntent.getStringExtra("google.c.a.tc")))
      {
        paramContext = a(paramContext);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
          Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (paramContext != null)
        {
          paramIntent = paramIntent.getStringExtra("google.c.a.c_id");
          paramContext.a("fcm", "_ln", paramIntent);
          Bundle localBundle = new Bundle();
          localBundle.putString("source", "Firebase");
          localBundle.putString("medium", "notification");
          localBundle.putString("campaign", paramIntent);
          paramContext.a("fcm", "_cmp", localBundle);
          return;
        }
        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        return;
      }
    } while (!Log.isLoggable("FirebaseMessaging", 3));
    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/messaging/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */