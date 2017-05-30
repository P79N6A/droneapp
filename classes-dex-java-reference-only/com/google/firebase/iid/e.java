package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;
import java.security.KeyPair;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class e
{
  static String a = null;
  static int b = 0;
  static int c = 0;
  static int d = 0;
  Context e;
  Map<String, Object> f = new HashMap();
  Messenger g;
  Messenger h;
  MessengerCompat i;
  PendingIntent j;
  long k;
  long l;
  int m;
  int n;
  long o;
  
  public e(Context paramContext)
  {
    this.e = paramContext;
  }
  
  public static String a(Context paramContext)
  {
    if (a != null) {
      return a;
    }
    b = Process.myUid();
    paramContext = paramContext.getPackageManager();
    Object localObject1 = paramContext.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
    for (;;)
    {
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ResolveInfo)((Iterator)localObject1).next();
        if (paramContext.checkPermission("com.google.android.c2dm.permission.RECEIVE", ((ResolveInfo)localObject2).serviceInfo.packageName) != 0) {}
      }
      try
      {
        localObject3 = paramContext.getApplicationInfo(((ResolveInfo)localObject2).serviceInfo.packageName, 0);
        int i1 = ((ApplicationInfo)localObject3).uid;
        Log.w("InstanceID/Rpc", 17 + "Found " + i1);
        c = ((ApplicationInfo)localObject3).uid;
        a = ((ResolveInfo)localObject2).serviceInfo.packageName;
        localObject2 = a;
        return (String)localObject2;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2) {}
      Object localObject2 = String.valueOf(((ResolveInfo)localObject2).serviceInfo.packageName);
      Object localObject3 = String.valueOf("com.google.android.c2dm.intent.REGISTER");
      Log.w("InstanceID/Rpc", String.valueOf(localObject2).length() + 56 + String.valueOf(localObject3).length() + "Possible malicious package " + (String)localObject2 + " declares " + (String)localObject3 + " without permission");
      continue;
      Log.w("InstanceID/Rpc", "Failed to resolve REGISTER intent, falling back");
      try
      {
        localObject1 = paramContext.getApplicationInfo("com.google.android.gms", 0);
        a = ((ApplicationInfo)localObject1).packageName;
        c = ((ApplicationInfo)localObject1).uid;
        localObject1 = a;
        return (String)localObject1;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        try
        {
          paramContext = paramContext.getApplicationInfo("com.google.android.gsf", 0);
          a = paramContext.packageName;
          c = paramContext.uid;
          paramContext = a;
          return paramContext;
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          Log.w("InstanceID/Rpc", "Both Google Play Services and legacy GSF package are missing");
          return null;
        }
      }
    }
  }
  
  /* Error */
  static String a(KeyPair paramKeyPair, String... paramVarArgs)
  {
    // Byte code:
    //   0: ldc -80
    //   2: aload_1
    //   3: invokestatic 182	android/text/TextUtils:join	(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
    //   6: ldc -72
    //   8: invokevirtual 188	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   11: astore_1
    //   12: aload_0
    //   13: invokevirtual 194	java/security/KeyPair:getPrivate	()Ljava/security/PrivateKey;
    //   16: astore_2
    //   17: aload_2
    //   18: instanceof 196
    //   21: ifeq +43 -> 64
    //   24: ldc -58
    //   26: astore_0
    //   27: aload_0
    //   28: invokestatic 204	java/security/Signature:getInstance	(Ljava/lang/String;)Ljava/security/Signature;
    //   31: astore_0
    //   32: aload_0
    //   33: aload_2
    //   34: invokevirtual 208	java/security/Signature:initSign	(Ljava/security/PrivateKey;)V
    //   37: aload_0
    //   38: aload_1
    //   39: invokevirtual 212	java/security/Signature:update	([B)V
    //   42: aload_0
    //   43: invokevirtual 216	java/security/Signature:sign	()[B
    //   46: invokestatic 221	com/google/firebase/iid/FirebaseInstanceId:a	([B)Ljava/lang/String;
    //   49: astore_0
    //   50: aload_0
    //   51: areturn
    //   52: astore_0
    //   53: ldc 122
    //   55: ldc -33
    //   57: aload_0
    //   58: invokestatic 226	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   61: pop
    //   62: aconst_null
    //   63: areturn
    //   64: ldc -28
    //   66: astore_0
    //   67: goto -40 -> 27
    //   70: astore_0
    //   71: ldc 122
    //   73: ldc -26
    //   75: aload_0
    //   76: invokestatic 226	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   79: pop
    //   80: aconst_null
    //   81: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	paramKeyPair	KeyPair
    //   0	82	1	paramVarArgs	String[]
    //   16	18	2	localPrivateKey	java.security.PrivateKey
    // Exception table:
    //   from	to	target	type
    //   0	12	52	java/io/UnsupportedEncodingException
    //   12	24	70	java/security/GeneralSecurityException
    //   27	50	70	java/security/GeneralSecurityException
  }
  
  private void a(Object paramObject)
  {
    synchronized (getClass())
    {
      Iterator localIterator = this.f.keySet().iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = this.f.get(str);
        this.f.put(str, paramObject);
        a(localObject, paramObject);
      }
    }
  }
  
  private void a(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 instanceof ConditionVariable)) {
      ((ConditionVariable)paramObject1).open();
    }
    Message localMessage;
    if ((paramObject1 instanceof Messenger))
    {
      paramObject1 = (Messenger)paramObject1;
      localMessage = Message.obtain();
      localMessage.obj = paramObject2;
    }
    try
    {
      ((Messenger)paramObject1).send(localMessage);
      return;
    }
    catch (RemoteException paramObject1)
    {
      paramObject1 = String.valueOf(paramObject1);
      Log.w("InstanceID/Rpc", String.valueOf(paramObject1).length() + 24 + "Failed to send response " + (String)paramObject1);
    }
  }
  
  private void a(String paramString)
  {
    if (!"com.google.android.gsf".equals(a)) {}
    do
    {
      return;
      this.m += 1;
    } while (this.m < 3);
    if (this.m == 3) {
      this.n = (new Random().nextInt(1000) + 1000);
    }
    this.n *= 2;
    this.o = (SystemClock.elapsedRealtime() + this.n);
    int i1 = this.n;
    Log.w("InstanceID/Rpc", String.valueOf(paramString).length() + 31 + "Backoff due to " + paramString + " for " + i1);
  }
  
  private void a(String paramString, Object paramObject)
  {
    synchronized (getClass())
    {
      Object localObject = this.f.get(paramString);
      this.f.put(paramString, paramObject);
      a(localObject, paramObject);
      return;
    }
  }
  
  private static int b(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      int i1 = localPackageManager.getPackageInfo(a(paramContext), 0).versionCode;
      return i1;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return -1;
  }
  
  private Intent b(Bundle arg1, KeyPair paramKeyPair)
  {
    ConditionVariable localConditionVariable = new ConditionVariable();
    String str = b();
    synchronized (getClass())
    {
      this.f.put(str, localConditionVariable);
      a(???, paramKeyPair, str);
      localConditionVariable.block(30000L);
    }
    synchronized (getClass())
    {
      paramKeyPair = this.f.remove(str);
      if ((paramKeyPair instanceof Intent))
      {
        paramKeyPair = (Intent)paramKeyPair;
        return paramKeyPair;
        ??? = finally;
        throw ???;
      }
      if ((paramKeyPair instanceof String)) {
        throw new IOException((String)paramKeyPair);
      }
    }
    paramKeyPair = String.valueOf(paramKeyPair);
    Log.w("InstanceID/Rpc", String.valueOf(paramKeyPair).length() + 12 + "No response " + paramKeyPair);
    throw new IOException("TIMEOUT");
  }
  
  public static String b()
  {
    try
    {
      int i1 = d;
      d = i1 + 1;
      String str = Integer.toString(i1);
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  Intent a(Bundle paramBundle, KeyPair paramKeyPair)
  {
    Intent localIntent2 = b(paramBundle, paramKeyPair);
    Intent localIntent1 = localIntent2;
    if (localIntent2 != null)
    {
      localIntent1 = localIntent2;
      if (localIntent2.hasExtra("google.messenger")) {
        localIntent1 = b(paramBundle, paramKeyPair);
      }
    }
    return localIntent1;
  }
  
  void a()
  {
    if (this.g != null) {
      return;
    }
    a(this.e);
    this.g = new Messenger(new e.1(this, Looper.getMainLooper()));
  }
  
  void a(Intent paramIntent)
  {
    try
    {
      if (this.j == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.j = PendingIntent.getBroadcast(this.e, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.j);
      return;
    }
    finally {}
  }
  
  protected void a(Intent paramIntent, String paramString)
  {
    this.k = SystemClock.elapsedRealtime();
    paramIntent.putExtra("kid", String.valueOf(paramString).length() + 5 + "|ID|" + paramString + "|");
    paramIntent.putExtra("X-kid", String.valueOf(paramString).length() + 5 + "|ID|" + paramString + "|");
    boolean bool = "com.google.android.gsf".equals(a);
    if (Log.isLoggable("InstanceID/Rpc", 3))
    {
      paramString = String.valueOf(paramIntent.getExtras());
      Log.d("InstanceID/Rpc", String.valueOf(paramString).length() + 8 + "Sending " + paramString);
    }
    if (bool)
    {
      this.e.startService(paramIntent);
      return;
    }
    paramIntent.putExtra("google.messenger", this.g);
    if ((this.h != null) || (this.i != null))
    {
      paramString = Message.obtain();
      paramString.obj = paramIntent;
      try
      {
        if (this.h == null) {
          break label249;
        }
        this.h.send(paramString);
        return;
      }
      catch (RemoteException paramString)
      {
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
          Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
        }
      }
    }
    else
    {
      this.e.startService(paramIntent);
      return;
    }
    label249:
    this.i.b(paramString);
  }
  
  public void a(Bundle paramBundle, KeyPair paramKeyPair, String paramString)
  {
    long l1 = SystemClock.elapsedRealtime();
    if ((this.o != 0L) && (l1 <= this.o))
    {
      long l2 = this.o;
      int i1 = this.n;
      Log.w("InstanceID/Rpc", 78 + "Backoff mode, next request attempt: " + (l2 - l1) + " interval: " + i1);
      throw new IOException("RETRY_LATER");
    }
    a();
    if (a == null) {
      throw new IOException("MISSING_INSTANCEID_SERVICE");
    }
    this.k = SystemClock.elapsedRealtime();
    Intent localIntent = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent.setPackage(a);
    paramBundle.putString("gmsv", Integer.toString(b(this.e)));
    paramBundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
    paramBundle.putString("app_ver", Integer.toString(FirebaseInstanceId.b(this.e)));
    paramBundle.putString("app_ver_name", FirebaseInstanceId.c(this.e));
    paramBundle.putString("cliv", "fiid-9683000");
    paramBundle.putString("appid", FirebaseInstanceId.a(paramKeyPair));
    String str = FirebaseInstanceId.a(this.e);
    if (str != null) {
      paramBundle.putString("gmp_app_id", str);
    }
    str = FirebaseInstanceId.a(paramKeyPair.getPublic().getEncoded());
    paramBundle.putString("pub2", str);
    paramBundle.putString("sig", a(paramKeyPair, new String[] { this.e.getPackageName(), str }));
    localIntent.putExtras(paramBundle);
    a(localIntent);
    a(localIntent, paramString);
  }
  
  public void a(Message paramMessage)
  {
    if (paramMessage == null) {
      return;
    }
    if ((paramMessage.obj instanceof Intent))
    {
      Object localObject = (Intent)paramMessage.obj;
      ((Intent)localObject).setExtrasClassLoader(MessengerCompat.class.getClassLoader());
      if (((Intent)localObject).hasExtra("google.messenger"))
      {
        localObject = ((Intent)localObject).getParcelableExtra("google.messenger");
        if ((localObject instanceof MessengerCompat)) {
          this.i = ((MessengerCompat)localObject);
        }
        if ((localObject instanceof Messenger)) {
          this.h = ((Messenger)localObject);
        }
      }
      d((Intent)paramMessage.obj);
      return;
    }
    Log.w("InstanceID/Rpc", "Dropping invalid message");
  }
  
  String b(Intent paramIntent)
  {
    if (paramIntent == null) {
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    String str2 = paramIntent.getStringExtra("registration_id");
    String str1 = str2;
    if (str2 == null) {
      str1 = paramIntent.getStringExtra("unregistered");
    }
    if (str1 == null)
    {
      str1 = paramIntent.getStringExtra("error");
      if (str1 != null) {
        throw new IOException(str1);
      }
      paramIntent = String.valueOf(paramIntent.getExtras());
      Log.w("InstanceID/Rpc", String.valueOf(paramIntent).length() + 29 + "Unexpected response from GCM " + paramIntent, new Throwable());
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    return str1;
  }
  
  void c(Intent paramIntent)
  {
    Object localObject2 = paramIntent.getStringExtra("error");
    if (localObject2 == null)
    {
      paramIntent = String.valueOf(paramIntent.getExtras());
      Log.w("InstanceID/Rpc", String.valueOf(paramIntent).length() + 49 + "Unexpected response, no error or registration id " + paramIntent);
      return;
    }
    Object localObject1;
    label160:
    Object localObject3;
    if (Log.isLoggable("InstanceID/Rpc", 3))
    {
      localObject1 = String.valueOf(localObject2);
      if (((String)localObject1).length() != 0)
      {
        localObject1 = "Received InstanceID error ".concat((String)localObject1);
        Log.d("InstanceID/Rpc", (String)localObject1);
      }
    }
    else
    {
      if (!((String)localObject2).startsWith("|")) {
        break label399;
      }
      Object localObject4 = ((String)localObject2).split("\\|");
      if (!"ID".equals(localObject4[1]))
      {
        localObject1 = String.valueOf(localObject2);
        if (((String)localObject1).length() == 0) {
          break label333;
        }
        localObject1 = "Unexpected structured response ".concat((String)localObject1);
        Log.w("InstanceID/Rpc", (String)localObject1);
      }
      if (localObject4.length <= 2) {
        break label348;
      }
      localObject3 = localObject4[2];
      localObject4 = localObject4[3];
      localObject2 = localObject3;
      localObject1 = localObject4;
      if (((String)localObject4).startsWith(":"))
      {
        localObject1 = ((String)localObject4).substring(1);
        localObject2 = localObject3;
      }
      label218:
      paramIntent.putExtra("error", (String)localObject1);
    }
    for (;;)
    {
      if (localObject2 == null) {
        a(localObject1);
      }
      for (;;)
      {
        long l1 = paramIntent.getLongExtra("Retry-After", 0L);
        if (l1 <= 0L) {
          break label370;
        }
        this.l = SystemClock.elapsedRealtime();
        this.n = ((int)l1 * 1000);
        this.o = (SystemClock.elapsedRealtime() + this.n);
        int i1 = this.n;
        Log.w("InstanceID/Rpc", 52 + "Explicit request from server to backoff: " + i1);
        return;
        localObject1 = new String("Received InstanceID error ");
        break;
        label333:
        localObject1 = new String("Unexpected structured response ");
        break label160;
        label348:
        localObject1 = "UNKNOWN";
        localObject2 = null;
        break label218;
        a((String)localObject2, localObject1);
      }
      label370:
      if ((!"SERVICE_NOT_AVAILABLE".equals(localObject1)) && (!"AUTHENTICATION_FAILED".equals(localObject1))) {
        break;
      }
      a((String)localObject1);
      return;
      label399:
      localObject3 = null;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }
  
  void d(Intent paramIntent)
  {
    if (paramIntent == null) {
      if (Log.isLoggable("InstanceID/Rpc", 3)) {
        Log.d("InstanceID/Rpc", "Unexpected response: null");
      }
    }
    do
    {
      return;
      if ("com.google.android.c2dm.intent.REGISTRATION".equals(paramIntent.getAction())) {
        break;
      }
    } while (!Log.isLoggable("InstanceID/Rpc", 3));
    paramIntent = String.valueOf(paramIntent.getAction());
    if (paramIntent.length() != 0) {}
    for (paramIntent = "Unexpected response ".concat(paramIntent);; paramIntent = new String("Unexpected response "))
    {
      Log.d("InstanceID/Rpc", paramIntent);
      return;
    }
    String str = paramIntent.getStringExtra("registration_id");
    Object localObject1 = str;
    if (str == null) {
      localObject1 = paramIntent.getStringExtra("unregistered");
    }
    if (localObject1 == null)
    {
      c(paramIntent);
      return;
    }
    this.k = SystemClock.elapsedRealtime();
    this.o = 0L;
    this.m = 0;
    this.n = 0;
    if (Log.isLoggable("InstanceID/Rpc", 3))
    {
      str = String.valueOf(paramIntent.getExtras());
      Log.d("InstanceID/Rpc", String.valueOf(localObject1).length() + 16 + String.valueOf(str).length() + "AppIDResponse: " + (String)localObject1 + " " + str);
    }
    Object localObject2;
    if (((String)localObject1).startsWith("|"))
    {
      localObject2 = ((String)localObject1).split("\\|");
      if (!"ID".equals(localObject2[1]))
      {
        localObject1 = String.valueOf(localObject1);
        if (((String)localObject1).length() != 0)
        {
          localObject1 = "Unexpected structured response ".concat((String)localObject1);
          Log.w("InstanceID/Rpc", (String)localObject1);
        }
      }
      else
      {
        str = localObject2[2];
        if (localObject2.length > 4)
        {
          if (!"SYNC".equals(localObject2[3])) {
            break label372;
          }
          FirebaseInstanceId.d(this.e);
        }
        label306:
        localObject2 = localObject2[(localObject2.length - 1)];
        localObject1 = localObject2;
        if (((String)localObject2).startsWith(":")) {
          localObject1 = ((String)localObject2).substring(1);
        }
        paramIntent.putExtra("registration_id", (String)localObject1);
      }
    }
    for (localObject1 = str;; localObject1 = null)
    {
      if (localObject1 == null)
      {
        a(paramIntent);
        return;
        localObject1 = new String("Unexpected structured response ");
        break;
        label372:
        if (!"RST".equals(localObject2[3])) {
          break label306;
        }
        FirebaseInstanceId.a(this.e, c.a(this.e, null).d());
        paramIntent.removeExtra("registration_id");
        a(str, paramIntent);
        return;
      }
      a((String)localObject1, paramIntent);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/iid/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */