package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import java.util.LinkedList;
import java.util.Queue;

public final class FirebaseInstanceIdInternalReceiver
  extends WakefulBroadcastReceiver
{
  private static final Queue<Intent> a = new LinkedList();
  private static final Queue<Intent> b = new LinkedList();
  
  static int a(Context paramContext, String paramString, Intent paramIntent)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        paramContext = String.valueOf(paramString);
        if (paramContext.length() == 0) {}
        break;
      }
      break;
    }
    for (paramContext = "Unknown service action: ".concat(paramContext);; paramContext = new String("Unknown service action: "))
    {
      Log.w("FirebaseInstanceId", paramContext);
      return 500;
      if (!paramString.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
        break;
      }
      i = 0;
      break;
      if (!paramString.equals("com.google.firebase.MESSAGING_EVENT")) {
        break;
      }
      i = 1;
      break;
      a.offer(paramIntent);
      for (;;)
      {
        paramString = new Intent(paramString);
        paramString.setPackage(paramContext.getPackageName());
        return c(paramContext, paramString);
        b.offer(paramIntent);
      }
    }
  }
  
  public static Intent a()
  {
    return (Intent)a.poll();
  }
  
  public static Intent a(Context paramContext, Intent paramIntent)
  {
    return b(paramContext, "com.google.firebase.INSTANCE_ID_EVENT", paramIntent);
  }
  
  public static Intent b()
  {
    return (Intent)b.poll();
  }
  
  public static Intent b(Context paramContext, Intent paramIntent)
  {
    return b(paramContext, "com.google.firebase.MESSAGING_EVENT", paramIntent);
  }
  
  private static Intent b(Context paramContext, String paramString, Intent paramIntent)
  {
    paramContext = new Intent(paramContext, FirebaseInstanceIdInternalReceiver.class);
    paramContext.setAction(paramString);
    paramContext.putExtra("wrapped_intent", paramIntent);
    return paramContext;
  }
  
  private static int c(Context paramContext, Intent paramIntent)
  {
    d(paramContext, paramIntent);
    try
    {
      if (paramContext.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
        paramContext = startWakefulService(paramContext, paramIntent);
      }
      while (paramContext == null)
      {
        Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
        return 404;
        paramContext = paramContext.startService(paramIntent);
        Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
      }
      return -1;
    }
    catch (SecurityException paramContext)
    {
      Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", paramContext);
      return 401;
    }
  }
  
  private static void d(Context paramContext, Intent paramIntent)
  {
    Object localObject = paramContext.getPackageManager().resolveService(paramIntent, 0);
    if ((localObject == null) || (((ResolveInfo)localObject).serviceInfo == null))
    {
      Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
      return;
    }
    localObject = ((ResolveInfo)localObject).serviceInfo;
    if ((!paramContext.getPackageName().equals(((ServiceInfo)localObject).packageName)) || (((ServiceInfo)localObject).name == null))
    {
      paramContext = String.valueOf(((ServiceInfo)localObject).packageName);
      paramIntent = String.valueOf(((ServiceInfo)localObject).name);
      Log.e("FirebaseInstanceId", String.valueOf(paramContext).length() + 94 + String.valueOf(paramIntent).length() + "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + paramContext + "/" + paramIntent);
      return;
    }
    String str = ((ServiceInfo)localObject).name;
    localObject = str;
    if (str.startsWith("."))
    {
      localObject = String.valueOf(paramContext.getPackageName());
      str = String.valueOf(str);
      if (str.length() != 0) {
        localObject = ((String)localObject).concat(str);
      }
    }
    else if (Log.isLoggable("FirebaseInstanceId", 3))
    {
      str = String.valueOf(localObject);
      if (str.length() == 0) {
        break label225;
      }
    }
    label225:
    for (str = "Restricting intent to a specific service: ".concat(str);; str = new String("Restricting intent to a specific service: "))
    {
      Log.d("FirebaseInstanceId", str);
      paramIntent.setClassName(paramContext.getPackageName(), (String)localObject);
      return;
      localObject = new String((String)localObject);
      break;
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    Intent localIntent = (Intent)paramIntent.getParcelableExtra("wrapped_intent");
    if (localIntent == null)
    {
      Log.w("FirebaseInstanceId", "Missing wrapped intent");
      return;
    }
    a(paramContext, paramIntent.getAction(), localIntent);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/iid/FirebaseInstanceIdInternalReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */