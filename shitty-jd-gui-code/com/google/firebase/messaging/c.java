package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.support.v4.app.NotificationCompat.Builder;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdInternalReceiver;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

class c
{
  static c a;
  private final Context b;
  private final AtomicInteger c = new AtomicInteger((int)SystemClock.elapsedRealtime());
  
  private c(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
  }
  
  private int a()
  {
    return this.c.incrementAndGet();
  }
  
  private PendingIntent a(Bundle paramBundle, PendingIntent paramPendingIntent)
  {
    Intent localIntent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
    a(localIntent, paramBundle);
    localIntent.putExtra("pending_intent", paramPendingIntent);
    paramBundle = FirebaseInstanceIdInternalReceiver.b(this.b, localIntent);
    return PendingIntent.getBroadcast(this.b, a(), paramBundle, 1073741824);
  }
  
  static c a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new c(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  static String a(Bundle paramBundle, String paramString)
  {
    String str2 = paramBundle.getString(paramString);
    String str1 = str2;
    if (str2 == null) {
      str1 = paramBundle.getString(paramString.replace("gcm.n.", "gcm.notification."));
    }
    return str1;
  }
  
  private static String a(String paramString)
  {
    return paramString.substring("gcm.n.".length());
  }
  
  private void a(Intent paramIntent, Bundle paramBundle)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.startsWith("google.c.a.")) || (str.equals("from"))) {
        paramIntent.putExtra(str, paramBundle.getString(str));
      }
    }
  }
  
  private void a(String paramString, Notification paramNotification)
  {
    if (Log.isLoggable("FirebaseMessaging", 3)) {
      Log.d("FirebaseMessaging", "Showing notification");
    }
    NotificationManager localNotificationManager = (NotificationManager)this.b.getSystemService("notification");
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
    {
      long l = SystemClock.uptimeMillis();
      str = 37 + "GCM-Notification:" + l;
    }
    localNotificationManager.notify(str, 0, paramNotification);
  }
  
  static boolean a(Bundle paramBundle)
  {
    return ("1".equals(a(paramBundle, "gcm.n.e"))) || (a(paramBundle, "gcm.n.icon") != null);
  }
  
  private int b(String paramString)
  {
    Resources localResources;
    int i;
    if (!TextUtils.isEmpty(paramString))
    {
      localResources = this.b.getResources();
      i = localResources.getIdentifier(paramString, "drawable", this.b.getPackageName());
      if (i == 0) {}
    }
    int j;
    do
    {
      do
      {
        return i;
        j = localResources.getIdentifier(paramString, "mipmap", this.b.getPackageName());
        i = j;
      } while (j != 0);
      Log.w("FirebaseMessaging", String.valueOf(paramString).length() + 57 + "Icon resource " + paramString + " not found. Notification will use app icon.");
      j = this.b.getApplicationInfo().icon;
      i = j;
    } while (j != 0);
    return 17301651;
  }
  
  static String b(Bundle paramBundle, String paramString)
  {
    paramString = String.valueOf(paramString);
    String str = String.valueOf("_loc_key");
    if (str.length() != 0) {}
    for (paramString = paramString.concat(str);; paramString = new String(paramString)) {
      return a(paramBundle, paramString);
    }
  }
  
  static boolean b(Context paramContext)
  {
    if (((KeyguardManager)paramContext.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {}
    int i;
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
    do
    {
      while (!paramContext.hasNext())
      {
        do
        {
          return false;
          i = Process.myPid();
          paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
        } while (paramContext == null);
        paramContext = paramContext.iterator();
      }
      localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
    } while (localRunningAppProcessInfo.pid != i);
    if (localRunningAppProcessInfo.importance == 100) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private Uri c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if ((!"default".equals(paramString)) && (this.b.getResources().getIdentifier(paramString, "raw", this.b.getPackageName()) != 0))
    {
      String str1 = String.valueOf("android.resource://");
      String str2 = String.valueOf(this.b.getPackageName());
      return Uri.parse(String.valueOf(str1).length() + 5 + String.valueOf(str2).length() + String.valueOf(paramString).length() + str1 + str2 + "/raw/" + paramString);
    }
    return RingtoneManager.getDefaultUri(2);
  }
  
  static String c(Bundle paramBundle)
  {
    String str2 = a(paramBundle, "gcm.n.sound2");
    String str1 = str2;
    if (TextUtils.isEmpty(str2)) {
      str1 = a(paramBundle, "gcm.n.sound");
    }
    return str1;
  }
  
  static Object[] c(Bundle paramBundle, String paramString)
  {
    Object localObject = String.valueOf(paramString);
    String str = String.valueOf("_loc_args");
    if (str.length() != 0)
    {
      localObject = ((String)localObject).concat(str);
      str = a(paramBundle, (String)localObject);
      if (!TextUtils.isEmpty(str)) {
        break label59;
      }
      paramBundle = null;
    }
    for (;;)
    {
      return paramBundle;
      localObject = new String((String)localObject);
      break;
      try
      {
        label59:
        JSONArray localJSONArray = new JSONArray(str);
        localObject = new String[localJSONArray.length()];
        int i = 0;
        for (;;)
        {
          paramBundle = (Bundle)localObject;
          if (i >= localObject.length) {
            break;
          }
          localObject[i] = localJSONArray.opt(i);
          i += 1;
        }
        paramBundle = paramBundle.concat(paramString);
      }
      catch (JSONException paramBundle)
      {
        paramBundle = String.valueOf(paramString);
        paramString = String.valueOf("_loc_args");
        if (paramString.length() == 0) {}
      }
    }
    for (;;)
    {
      paramBundle = String.valueOf(a(paramBundle));
      Log.w("FirebaseMessaging", String.valueOf(paramBundle).length() + 41 + String.valueOf(str).length() + "Malformed " + paramBundle + ": " + str + "  Default value will be used.");
      return null;
      paramBundle = new String(paramBundle);
    }
  }
  
  private Notification d(Bundle paramBundle)
  {
    String str1 = d(paramBundle, "gcm.n.title");
    String str2 = d(paramBundle, "gcm.n.body");
    int i = b(a(paramBundle, "gcm.n.icon"));
    String str3 = a(paramBundle, "gcm.n.color");
    Uri localUri = c(c(paramBundle));
    PendingIntent localPendingIntent3 = e(paramBundle);
    PendingIntent localPendingIntent2 = null;
    PendingIntent localPendingIntent1 = localPendingIntent3;
    if (FirebaseMessagingService.b(paramBundle))
    {
      localPendingIntent1 = a(paramBundle, localPendingIntent3);
      localPendingIntent2 = f(paramBundle);
    }
    paramBundle = new NotificationCompat.Builder(this.b).setAutoCancel(true).setSmallIcon(i);
    if (!TextUtils.isEmpty(str1)) {
      paramBundle.setContentTitle(str1);
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(str2))
      {
        paramBundle.setContentText(str2);
        paramBundle.setStyle(new NotificationCompat.BigTextStyle().bigText(str2));
      }
      if (!TextUtils.isEmpty(str3)) {
        paramBundle.setColor(Color.parseColor(str3));
      }
      if (localUri != null) {
        paramBundle.setSound(localUri);
      }
      if (localPendingIntent1 != null) {
        paramBundle.setContentIntent(localPendingIntent1);
      }
      if (localPendingIntent2 != null) {
        paramBundle.setDeleteIntent(localPendingIntent2);
      }
      return paramBundle.build();
      paramBundle.setContentTitle(this.b.getApplicationInfo().loadLabel(this.b.getPackageManager()));
    }
  }
  
  private String d(Bundle paramBundle, String paramString)
  {
    String str = a(paramBundle, paramString);
    if (!TextUtils.isEmpty(str)) {
      return str;
    }
    str = b(paramBundle, paramString);
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    Resources localResources = this.b.getResources();
    int i = localResources.getIdentifier(str, "string", this.b.getPackageName());
    if (i == 0)
    {
      paramBundle = String.valueOf(paramString);
      paramString = String.valueOf("_loc_key");
      if (paramString.length() != 0) {}
      for (paramBundle = paramBundle.concat(paramString);; paramBundle = new String(paramBundle))
      {
        paramBundle = String.valueOf(a(paramBundle));
        Log.w("FirebaseMessaging", String.valueOf(paramBundle).length() + 49 + String.valueOf(str).length() + paramBundle + " resource not found: " + str + " Default value will be used.");
        return null;
      }
    }
    paramBundle = c(paramBundle, paramString);
    if (paramBundle == null) {
      return localResources.getString(i);
    }
    try
    {
      paramString = localResources.getString(i, paramBundle);
      return paramString;
    }
    catch (MissingFormatArgumentException paramString)
    {
      paramBundle = String.valueOf(Arrays.toString(paramBundle));
      Log.w("FirebaseMessaging", String.valueOf(str).length() + 58 + String.valueOf(paramBundle).length() + "Missing format argument for " + str + ": " + paramBundle + " Default value will be used.", paramString);
    }
    return null;
  }
  
  private PendingIntent e(Bundle paramBundle)
  {
    Object localObject = a(paramBundle, "gcm.n.click_action");
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = new Intent((String)localObject);
      ((Intent)localObject).setPackage(this.b.getPackageName());
      ((Intent)localObject).setFlags(268435456);
    }
    label166:
    for (;;)
    {
      paramBundle = new Bundle(paramBundle);
      FirebaseMessagingService.a(paramBundle);
      ((Intent)localObject).putExtras(paramBundle);
      paramBundle = paramBundle.keySet().iterator();
      while (paramBundle.hasNext())
      {
        String str = (String)paramBundle.next();
        if ((str.startsWith("gcm.n.")) || (str.startsWith("gcm.notification.")))
        {
          ((Intent)localObject).removeExtra(str);
          continue;
          localObject = this.b.getPackageManager().getLaunchIntentForPackage(this.b.getPackageName());
          if (localObject != null) {
            break label166;
          }
          Log.w("FirebaseMessaging", "No activity found to launch app");
          return null;
        }
      }
      return PendingIntent.getActivity(this.b, a(), (Intent)localObject, 1073741824);
    }
  }
  
  private PendingIntent f(Bundle paramBundle)
  {
    Intent localIntent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
    a(localIntent, paramBundle);
    paramBundle = FirebaseInstanceIdInternalReceiver.b(this.b, localIntent);
    return PendingIntent.getBroadcast(this.b, a(), paramBundle, 1073741824);
  }
  
  void b(Bundle paramBundle)
  {
    Notification localNotification = d(paramBundle);
    a(a(paramBundle, "gcm.n.tag"), localNotification);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/messaging/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */