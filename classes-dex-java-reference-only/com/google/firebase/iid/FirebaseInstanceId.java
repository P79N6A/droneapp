package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.b;
import com.google.firebase.e;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Map;

public class FirebaseInstanceId
{
  private static Map<String, FirebaseInstanceId> a = new ArrayMap();
  private static d b;
  private final b c;
  private final c d;
  private final String e;
  
  private FirebaseInstanceId(b paramb, c paramc)
  {
    this.c = paramb;
    this.d = paramc;
    this.e = b();
    if (this.e == null) {
      throw new IllegalStateException("IID failing to initialize, FirebaseApp is missing project ID");
    }
    FirebaseInstanceIdService.a(this.c.a(), this);
  }
  
  public static FirebaseInstanceId a()
  {
    return getInstance(b.d());
  }
  
  static String a(Context paramContext)
  {
    return a().c.c().b();
  }
  
  static String a(KeyPair paramKeyPair)
  {
    paramKeyPair = paramKeyPair.getPublic().getEncoded();
    try
    {
      paramKeyPair = MessageDigest.getInstance("SHA1").digest(paramKeyPair);
      paramKeyPair[0] = ((byte)((paramKeyPair[0] & 0xF) + 112 & 0xFF));
      paramKeyPair = Base64.encodeToString(paramKeyPair, 0, 8, 11);
      return paramKeyPair;
    }
    catch (NoSuchAlgorithmException paramKeyPair)
    {
      Log.w("FirebaseInstanceId", "Unexpected error, device missing required alghorithms");
    }
    return null;
  }
  
  static String a(byte[] paramArrayOfByte)
  {
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
  
  static void a(Context paramContext, f paramf)
  {
    paramf.c();
    paramf = new Intent();
    paramf.putExtra("CMD", "RST");
    paramContext.sendBroadcast(FirebaseInstanceIdInternalReceiver.a(paramContext, paramf));
  }
  
  static int b(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = String.valueOf(paramContext);
      Log.w("FirebaseInstanceId", String.valueOf(paramContext).length() + 38 + "Never happens: can't find own package " + paramContext);
    }
    return 0;
  }
  
  static String c(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = String.valueOf(paramContext);
      Log.w("FirebaseInstanceId", String.valueOf(paramContext).length() + 38 + "Never happens: can't find own package " + paramContext);
    }
    return null;
  }
  
  static void d(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.putExtra("CMD", "SYNC");
    paramContext.sendBroadcast(FirebaseInstanceIdInternalReceiver.a(paramContext, localIntent));
  }
  
  @Keep
  public static FirebaseInstanceId getInstance(@NonNull b paramb)
  {
    try
    {
      FirebaseInstanceId localFirebaseInstanceId = (FirebaseInstanceId)a.get(paramb.c().b());
      Object localObject = localFirebaseInstanceId;
      if (localFirebaseInstanceId == null)
      {
        localObject = c.a(paramb.a(), null);
        if (b == null) {
          b = new d(((c)localObject).d());
        }
        localObject = new FirebaseInstanceId(paramb, (c)localObject);
        a.put(paramb.c().b(), localObject);
      }
      return (FirebaseInstanceId)localObject;
    }
    finally {}
  }
  
  @WorkerThread
  public String a(String paramString1, String paramString2)
  {
    return this.d.b(paramString1, paramString2, null);
  }
  
  public void a(String paramString)
  {
    b.a(paramString);
    FirebaseInstanceIdService.a(this.c.a());
  }
  
  String b()
  {
    Object localObject = this.c.c().d();
    if (localObject != null) {}
    String str;
    do
    {
      do
      {
        return (String)localObject;
        str = this.c.c().b();
        localObject = str;
      } while (!str.startsWith("1:"));
      localObject = str.split(":");
      if (localObject.length < 2) {
        return null;
      }
      str = localObject[1];
      localObject = str;
    } while (!str.isEmpty());
    return null;
  }
  
  void b(String paramString)
  {
    if (f() == null) {
      throw new IOException("token not available");
    }
    Bundle localBundle = new Bundle();
    Object localObject = String.valueOf("/topics/");
    String str1 = String.valueOf(paramString);
    String str2;
    if (str1.length() != 0)
    {
      localObject = ((String)localObject).concat(str1);
      localBundle.putString("gcm.topic", (String)localObject);
      localObject = this.d;
      str1 = f();
      str2 = String.valueOf("/topics/");
      paramString = String.valueOf(paramString);
      if (paramString.length() == 0) {
        break label122;
      }
    }
    label122:
    for (paramString = str2.concat(paramString);; paramString = new String(str2))
    {
      ((c)localObject).b(str1, paramString, localBundle);
      return;
      localObject = new String((String)localObject);
      break;
    }
  }
  
  @WorkerThread
  public void b(String paramString1, String paramString2)
  {
    this.d.a(paramString1, paramString2, null);
  }
  
  public String c()
  {
    return a(this.d.a());
  }
  
  void c(String paramString)
  {
    if (f() == null) {
      throw new IOException("token not available");
    }
    Bundle localBundle = new Bundle();
    Object localObject = String.valueOf("/topics/");
    String str1 = String.valueOf(paramString);
    String str2;
    if (str1.length() != 0)
    {
      localObject = ((String)localObject).concat(str1);
      localBundle.putString("gcm.topic", (String)localObject);
      localObject = this.d;
      str1 = f();
      str2 = String.valueOf("/topics/");
      paramString = String.valueOf(paramString);
      if (paramString.length() == 0) {
        break label121;
      }
    }
    label121:
    for (paramString = str2.concat(paramString);; paramString = new String(str2))
    {
      ((c)localObject).a(str1, paramString, localBundle);
      return;
      localObject = new String((String)localObject);
      break;
    }
  }
  
  public long d()
  {
    return this.d.b();
  }
  
  public void e()
  {
    this.d.a("*", "*", null);
    this.d.c();
  }
  
  @Nullable
  public String f()
  {
    f.a locala = g();
    if ((locala == null) || (locala.b(c.e))) {
      FirebaseInstanceIdService.a(this.c.a());
    }
    if (locala != null) {
      return locala.a;
    }
    return null;
  }
  
  @Nullable
  f.a g()
  {
    return this.d.d().a("", this.e, "*");
  }
  
  String h()
  {
    return a(this.e, "*");
  }
  
  d i()
  {
    return b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/iid/FirebaseInstanceId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */