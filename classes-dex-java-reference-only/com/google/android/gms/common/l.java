package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.R.string;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.s;
import com.google.android.gms.common.util.y;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class l
{
  private static String a;
  private static int b = 0;
  private static boolean c = false;
  private static final AtomicBoolean d = new AtomicBoolean();
  @Deprecated
  public static final int e = ;
  @Deprecated
  public static final String f = "com.google.android.gms";
  public static final String g = "com.android.vending";
  public static boolean h = false;
  public static boolean i = false;
  static boolean j = false;
  static final AtomicBoolean k;
  
  static
  {
    a = null;
    b = 0;
    c = false;
    k = new AtomicBoolean();
  }
  
  private static void a(Context paramContext)
  {
    if (d.get()) {}
    do
    {
      return;
      b(paramContext);
      if (b == 0) {
        throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
      }
    } while (b == e);
    int m = e;
    int n = b;
    paramContext = String.valueOf("com.google.android.gms.version");
    throw new IllegalStateException(String.valueOf(paramContext).length() + 290 + "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + m + " but found " + n + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"" + paramContext + "\" android:value=\"@integer/google_play_services_version\" />");
  }
  
  @Deprecated
  public static boolean a()
  {
    return "user".equals(Build.TYPE);
  }
  
  @Deprecated
  @TargetApi(19)
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    return y.a(paramContext, paramInt, paramString);
  }
  
  @TargetApi(21)
  static boolean a(Context paramContext, String paramString)
  {
    boolean bool = paramString.equals("com.google.android.gms");
    if ((bool) && (com.google.android.gms.common.util.d.a())) {
      return false;
    }
    if (s.k())
    {
      localObject = paramContext.getPackageManager().getPackageInstaller().getAllSessions().iterator();
      while (((Iterator)localObject).hasNext()) {
        if (paramString.equals(((PackageInstaller.SessionInfo)((Iterator)localObject).next()).getAppPackageName())) {
          return true;
        }
      }
    }
    Object localObject = paramContext.getPackageManager();
    try
    {
      paramString = ((PackageManager)localObject).getApplicationInfo(paramString, 8192);
      if (bool) {
        return paramString.enabled;
      }
      if (paramString.enabled)
      {
        bool = n(paramContext);
        if (bool) {}
      }
      for (bool = true;; bool = false) {
        return bool;
      }
      return false;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
  }
  
  private static int b()
  {
    return q.a;
  }
  
  @Deprecated
  public static PendingIntent b(int paramInt1, Context paramContext, int paramInt2)
  {
    return j.b().a(paramContext, paramInt1, paramInt2);
  }
  
  private static void b(Context paramContext)
  {
    if (!c) {
      c(paramContext);
    }
  }
  
  /* Error */
  private static void c(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 206	android/content/Context:getPackageName	()Ljava/lang/String;
    //   4: putstatic 40	com/google/android/gms/common/l:a	Ljava/lang/String;
    //   7: aload_0
    //   8: invokestatic 211	com/google/android/gms/internal/ajp:b	(Landroid/content/Context;)Lcom/google/android/gms/internal/ajo;
    //   11: astore_1
    //   12: aload_0
    //   13: invokestatic 216	com/google/android/gms/common/internal/b:b	(Landroid/content/Context;)I
    //   16: putstatic 42	com/google/android/gms/common/l:b	I
    //   19: aload_1
    //   20: ldc 18
    //   22: bipush 64
    //   24: invokevirtual 221	com/google/android/gms/internal/ajo:b	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +35 -> 64
    //   32: aload_0
    //   33: invokestatic 226	com/google/android/gms/common/m:a	(Landroid/content/Context;)Lcom/google/android/gms/common/m;
    //   36: aload_1
    //   37: iconst_1
    //   38: anewarray 228	com/google/android/gms/common/k$a
    //   41: dup
    //   42: iconst_0
    //   43: getstatic 233	com/google/android/gms/common/k$d:a	[Lcom/google/android/gms/common/k$a;
    //   46: iconst_1
    //   47: aaload
    //   48: aastore
    //   49: invokevirtual 236	com/google/android/gms/common/m:a	(Landroid/content/pm/PackageInfo;[Lcom/google/android/gms/common/k$a;)Lcom/google/android/gms/common/k$a;
    //   52: ifnull +12 -> 64
    //   55: iconst_1
    //   56: putstatic 38	com/google/android/gms/common/l:j	Z
    //   59: iconst_1
    //   60: putstatic 44	com/google/android/gms/common/l:c	Z
    //   63: return
    //   64: iconst_0
    //   65: putstatic 38	com/google/android/gms/common/l:j	Z
    //   68: goto -9 -> 59
    //   71: astore_0
    //   72: ldc -18
    //   74: ldc -16
    //   76: aload_0
    //   77: invokestatic 246	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   80: pop
    //   81: iconst_1
    //   82: putstatic 44	com/google/android/gms/common/l:c	Z
    //   85: return
    //   86: astore_0
    //   87: iconst_1
    //   88: putstatic 44	com/google/android/gms/common/l:c	Z
    //   91: aload_0
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	paramContext	Context
    //   11	26	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	28	71	android/content/pm/PackageManager$NameNotFoundException
    //   32	59	71	android/content/pm/PackageManager$NameNotFoundException
    //   64	68	71	android/content/pm/PackageManager$NameNotFoundException
    //   0	28	86	finally
    //   32	59	86	finally
    //   64	68	86	finally
    //   72	81	86	finally
  }
  
  @Deprecated
  public static boolean c(Context paramContext, int paramInt)
  {
    return y.a(paramContext, paramInt);
  }
  
  @Deprecated
  public static String d(int paramInt)
  {
    return ConnectionResult.a(paramInt);
  }
  
  @Deprecated
  public static boolean d(Context paramContext, int paramInt)
  {
    if (paramInt == 18) {
      return true;
    }
    if (paramInt == 1) {
      return a(paramContext, "com.google.android.gms");
    }
    return false;
  }
  
  @Deprecated
  public static int e(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    PackageInfo localPackageInfo;
    try
    {
      paramContext.getResources().getString(R.string.common_google_play_services_unknown_issue);
      if (!"com.google.android.gms".equals(paramContext.getPackageName())) {
        a(paramContext);
      }
      if (!i.a(paramContext))
      {
        m = 1;
        localObject = null;
        if (m == 0) {}
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        try
        {
          localObject = localPackageManager.getPackageInfo("com.android.vending", 8256);
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          Object localObject;
          Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
          return 9;
        }
        try
        {
          localPackageInfo = localPackageManager.getPackageInfo("com.google.android.gms", 64);
          paramContext = m.a(paramContext);
          if (m == 0) {
            break label176;
          }
          localObject = paramContext.a((PackageInfo)localObject, k.d.a);
          if (localObject != null) {
            break label147;
          }
          Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
          return 9;
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
          return 1;
        }
        localThrowable = localThrowable;
        Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        continue;
        m = 0;
      }
    }
    label147:
    if (paramContext.a(localPackageInfo, new k.a[] { localThrowable }) == null)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
      return 9;
      label176:
      if (paramContext.a(localPackageInfo, k.d.a) == null)
      {
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
      }
    }
    int m = com.google.android.gms.common.util.l.a(e);
    if (com.google.android.gms.common.util.l.a(localPackageInfo.versionCode) < m)
    {
      m = e;
      int n = localPackageInfo.versionCode;
      Log.w("GooglePlayServicesUtil", 77 + "Google Play services out of date.  Requires " + m + " but found " + n);
      return 2;
    }
    ApplicationInfo localApplicationInfo = localPackageInfo.applicationInfo;
    paramContext = localApplicationInfo;
    if (localApplicationInfo == null) {}
    try
    {
      paramContext = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
      if (!paramContext.enabled) {
        return 3;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", paramContext);
      return 1;
    }
    return 0;
  }
  
  @Deprecated
  public static Intent e(int paramInt)
  {
    return j.b().a(null, paramInt, null);
  }
  
  @Deprecated
  public static boolean e(Context paramContext, int paramInt)
  {
    if (paramInt == 9) {
      return a(paramContext, "com.android.vending");
    }
    return false;
  }
  
  @Deprecated
  public static void f(Context paramContext)
  {
    int m = j.b().a(paramContext);
    if (m != 0)
    {
      paramContext = j.b().a(paramContext, m, "e");
      Log.e("GooglePlayServicesUtil", 57 + "GooglePlayServices not available due to error " + m);
      if (paramContext == null) {
        throw new c(m);
      }
      throw new d(m, "Google Play Services not available", paramContext);
    }
  }
  
  static boolean f(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  @Deprecated
  public static boolean g(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean g(Context paramContext)
  {
    b(paramContext);
    return j;
  }
  
  public static boolean h(Context paramContext)
  {
    return (g(paramContext)) || (!a());
  }
  
  @Deprecated
  public static void i(Context paramContext)
  {
    if (k.getAndSet(true)) {}
    for (;;)
    {
      return;
      try
      {
        paramContext = (NotificationManager)paramContext.getSystemService("notification");
        if (paramContext != null)
        {
          paramContext.cancel(10436);
          return;
        }
      }
      catch (SecurityException paramContext) {}
    }
  }
  
  @Deprecated
  public static String j(Context paramContext)
  {
    Object localObject = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("raw").appendPath("oss_notice").build();
    try
    {
      InputStream localInputStream = paramContext.getContentResolver().openInputStream((Uri)localObject);
      try
      {
        paramContext = new Scanner(localInputStream).useDelimiter("\\A").next();
        localObject = paramContext;
        if (localInputStream != null)
        {
          localInputStream.close();
          return paramContext;
        }
      }
      catch (NoSuchElementException paramContext)
      {
        paramContext = paramContext;
        if (localInputStream == null) {
          break label101;
        }
        localInputStream.close();
        break label101;
      }
      finally
      {
        paramContext = finally;
        if (localInputStream != null) {
          localInputStream.close();
        }
        throw paramContext;
      }
      return (String)localObject;
    }
    catch (Exception paramContext)
    {
      localObject = null;
    }
    label101:
    return null;
  }
  
  public static Resources k(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static Context l(Context paramContext)
  {
    try
    {
      paramContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  @Deprecated
  public static int m(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return paramContext.versionCode;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
    }
    return 0;
  }
  
  @TargetApi(18)
  public static boolean n(Context paramContext)
  {
    if (s.g())
    {
      paramContext = ((UserManager)paramContext.getSystemService("user")).getApplicationRestrictions(paramContext.getPackageName());
      if ((paramContext != null) && ("true".equals(paramContext.getString("restricted_profile")))) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */