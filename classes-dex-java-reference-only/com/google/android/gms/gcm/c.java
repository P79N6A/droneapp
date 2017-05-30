package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.iid.a;
import com.google.android.gms.iid.d;
import com.google.android.gms.iid.e;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class c
{
  public static int a = 5000000;
  public static int b = 6500000;
  public static int c = 7000000;
  public static final String d = "SERVICE_NOT_AVAILABLE";
  public static final String e = "MAIN_THREAD";
  @Deprecated
  public static final String f = "deleted_messages";
  @Deprecated
  public static final String g = "gcm";
  @Deprecated
  public static final String h = "send_event";
  @Deprecated
  public static final String i = "send_error";
  public static final String j = "GCM";
  static c k;
  private static final AtomicInteger p = new AtomicInteger(1);
  final Messenger l = new Messenger(new c.1(this, Looper.getMainLooper()));
  private Context m;
  private PendingIntent n;
  private Map<String, Handler> o = Collections.synchronizedMap(new HashMap());
  private final BlockingQueue<Intent> q = new LinkedBlockingQueue();
  
  public static c a(Context paramContext)
  {
    try
    {
      if (k == null)
      {
        k = new c();
        k.m = paramContext.getApplicationContext();
      }
      paramContext = k;
      return paramContext;
    }
    finally {}
  }
  
  static String a(Intent paramIntent, String paramString)
  {
    if (paramIntent == null) {
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    paramString = paramIntent.getStringExtra(paramString);
    if (paramString != null) {
      return paramString;
    }
    paramIntent = paramIntent.getStringExtra("error");
    if (paramIntent != null) {
      throw new IOException(paramIntent);
    }
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
  
  private String a(String paramString)
  {
    int i1 = paramString.indexOf('@');
    String str = paramString;
    if (i1 > 0) {
      str = paramString.substring(0, i1);
    }
    return a.c(this.m).f().a("", str, "GCM");
  }
  
  private void a(String paramString1, String paramString2, long paramLong, int paramInt, Bundle paramBundle)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("Missing 'to'");
    }
    String str = b(this.m);
    if (str == null) {
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    Object localObject1 = new Intent("com.google.android.gcm.intent.SEND");
    if (paramBundle != null) {
      ((Intent)localObject1).putExtras(paramBundle);
    }
    b((Intent)localObject1);
    ((Intent)localObject1).setPackage(str);
    ((Intent)localObject1).putExtra("google.to", paramString1);
    ((Intent)localObject1).putExtra("google.message_id", paramString2);
    ((Intent)localObject1).putExtra("google.ttl", Long.toString(paramLong));
    ((Intent)localObject1).putExtra("google.delay", Integer.toString(paramInt));
    ((Intent)localObject1).putExtra("google.from", a(paramString1));
    if (str.contains(".gsf"))
    {
      localObject1 = new Bundle();
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        Object localObject2 = paramBundle.get(str);
        if ((localObject2 instanceof String))
        {
          str = String.valueOf(str);
          if (str.length() != 0) {}
          for (str = "gcm.".concat(str);; str = new String("gcm."))
          {
            ((Bundle)localObject1).putString(str, (String)localObject2);
            break;
          }
        }
      }
      ((Bundle)localObject1).putString("google.to", paramString1);
      ((Bundle)localObject1).putString("google.message_id", paramString2);
      a.c(this.m).c("GCM", "upstream", (Bundle)localObject1);
      return;
    }
    this.m.sendOrderedBroadcast((Intent)localObject1, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
  }
  
  public static String b(Context paramContext)
  {
    return d.a(paramContext);
  }
  
  public static int c(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    paramContext = b(paramContext);
    if (paramContext != null) {
      try
      {
        paramContext = localPackageManager.getPackageInfo(paramContext, 0);
        if (paramContext != null)
        {
          int i1 = paramContext.versionCode;
          return i1;
        }
      }
      catch (PackageManager.NameNotFoundException paramContext) {}
    }
    return -1;
  }
  
  private boolean c(Intent paramIntent)
  {
    Object localObject2 = paramIntent.getStringExtra("In-Reply-To");
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = localObject2;
      if (paramIntent.hasExtra("error")) {
        localObject1 = paramIntent.getStringExtra("google.message_id");
      }
    }
    if (localObject1 != null)
    {
      localObject1 = (Handler)this.o.remove(localObject1);
      if (localObject1 != null)
      {
        localObject2 = Message.obtain();
        ((Message)localObject2).obj = paramIntent;
        return ((Handler)localObject1).sendMessage((Message)localObject2);
      }
    }
    return false;
  }
  
  private String d()
  {
    String str1 = String.valueOf("google.rpc");
    String str2 = String.valueOf(String.valueOf(p.getAndIncrement()));
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  @Deprecated
  Intent a(Bundle paramBundle)
  {
    if (Looper.getMainLooper() == Looper.myLooper()) {
      throw new IOException("MAIN_THREAD");
    }
    if (c(this.m) < 0) {
      throw new IOException("Google Play Services missing");
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    paramBundle = new Intent("com.google.android.c2dm.intent.REGISTER");
    paramBundle.setPackage(b(this.m));
    b(paramBundle);
    paramBundle.putExtra("google.message_id", d());
    paramBundle.putExtras(localBundle);
    paramBundle.putExtra("google.messenger", this.l);
    this.m.startService(paramBundle);
    try
    {
      paramBundle = (Intent)this.q.poll(30000L, TimeUnit.MILLISECONDS);
      return paramBundle;
    }
    catch (InterruptedException paramBundle)
    {
      throw new IOException(paramBundle.getMessage());
    }
  }
  
  public String a(Intent paramIntent)
  {
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction())) {
      paramIntent = null;
    }
    String str;
    do
    {
      return paramIntent;
      str = paramIntent.getStringExtra("message_type");
      paramIntent = str;
    } while (str != null);
    return "gcm";
  }
  
  @Deprecated
  @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
  public String a(String... paramVarArgs)
  {
    String str;
    try
    {
      str = b(this.m);
      if (str == null) {
        throw new IOException("SERVICE_NOT_AVAILABLE");
      }
    }
    finally {}
    paramVarArgs = b(paramVarArgs);
    Bundle localBundle = new Bundle();
    if (str.contains(".gsf")) {
      localBundle.putString("legacy.sender", paramVarArgs);
    }
    for (paramVarArgs = a.c(this.m).b(paramVarArgs, "GCM", localBundle);; paramVarArgs = a(a(localBundle), "registration_id"))
    {
      return paramVarArgs;
      localBundle.putString("sender", paramVarArgs);
    }
  }
  
  public void a()
  {
    k = null;
    e.a = null;
    c();
  }
  
  @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
  public void a(String paramString1, String paramString2, long paramLong, Bundle paramBundle)
  {
    a(paramString1, paramString2, paramLong, -1, paramBundle);
  }
  
  @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
  public void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    a(paramString1, paramString2, -1L, paramBundle);
  }
  
  String b(String... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      throw new IllegalArgumentException("No senderIds");
    }
    StringBuilder localStringBuilder = new StringBuilder(paramVarArgs[0]);
    int i1 = 1;
    while (i1 < paramVarArgs.length)
    {
      localStringBuilder.append(',').append(paramVarArgs[i1]);
      i1 += 1;
    }
    return localStringBuilder.toString();
  }
  
  @Deprecated
  @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
  public void b()
  {
    try
    {
      if (Looper.getMainLooper() == Looper.myLooper()) {
        throw new IOException("MAIN_THREAD");
      }
    }
    finally {}
    a.c(this.m).d();
  }
  
  void b(Intent paramIntent)
  {
    try
    {
      if (this.n == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.n = PendingIntent.getBroadcast(this.m, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.n);
      return;
    }
    finally {}
  }
  
  void c()
  {
    try
    {
      if (this.n != null)
      {
        this.n.cancel();
        this.n = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/gcm/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */