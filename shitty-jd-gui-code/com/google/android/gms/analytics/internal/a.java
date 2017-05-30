package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.a.a.a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public class a
  extends t
{
  public static boolean a;
  private a.a b;
  private final m c;
  private String d;
  private boolean e = false;
  private Object f = new Object();
  
  a(v paramv)
  {
    super(paramv);
    this.c = new m(paramv.d());
  }
  
  private static String a(String paramString)
  {
    MessageDigest localMessageDigest = p.d("MD5");
    if (localMessageDigest == null) {
      return null;
    }
    return String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, localMessageDigest.digest(paramString.getBytes())) });
  }
  
  private boolean a(a.a parama1, a.a parama2)
  {
    String str2 = null;
    if (parama2 == null) {}
    for (parama2 = null; TextUtils.isEmpty(parama2); parama2 = parama2.a()) {
      return true;
    }
    String str1 = x().b();
    boolean bool;
    for (;;)
    {
      synchronized (this.f)
      {
        if (!this.e)
        {
          this.d = e();
          this.e = true;
          parama1 = String.valueOf(parama2);
          str2 = String.valueOf(str1);
          if (str2.length() == 0) {
            break label240;
          }
          parama1 = parama1.concat(str2);
          parama1 = a(parama1);
          if (!TextUtils.isEmpty(parama1)) {
            break;
          }
          return false;
        }
      }
      if (TextUtils.isEmpty(this.d))
      {
        if (parama1 == null)
        {
          parama1 = str2;
          if (parama1 != null) {
            break label190;
          }
          parama1 = String.valueOf(parama2);
          parama2 = String.valueOf(str1);
          if (parama2.length() == 0) {
            break label178;
          }
        }
        label178:
        for (parama1 = parama1.concat(parama2);; parama1 = new String(parama1))
        {
          bool = b(parama1);
          return bool;
          parama1 = parama1.a();
          break;
        }
        label190:
        parama1 = String.valueOf(parama1);
        str2 = String.valueOf(str1);
        if (str2.length() != 0) {}
        for (parama1 = parama1.concat(str2);; parama1 = new String(parama1))
        {
          this.d = a(parama1);
          break;
        }
        label240:
        parama1 = new String(parama1);
      }
    }
    if (parama1.equals(this.d)) {
      return true;
    }
    if (!TextUtils.isEmpty(this.d))
    {
      q("Resetting the client id because Advertising Id changed.");
      parama1 = x().c();
      a("New client Id", parama1);
    }
    for (;;)
    {
      parama2 = String.valueOf(parama2);
      parama1 = String.valueOf(parama1);
      if (parama1.length() != 0) {}
      for (parama1 = parama2.concat(parama1);; parama1 = new String(parama2))
      {
        bool = b(parama1);
        return bool;
      }
      parama1 = str1;
    }
  }
  
  private boolean b(String paramString)
  {
    try
    {
      paramString = a(paramString);
      q("Storing hashed adid.");
      FileOutputStream localFileOutputStream = o().openFileOutput("gaClientIdData", 0);
      localFileOutputStream.write(paramString.getBytes());
      localFileOutputStream.close();
      this.d = paramString;
      return true;
    }
    catch (IOException paramString)
    {
      e("Error creating hash file", paramString);
    }
    return false;
  }
  
  /* Error */
  private a.a f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	com/google/android/gms/analytics/internal/a:c	Lcom/google/android/gms/analytics/internal/m;
    //   6: ldc2_w 168
    //   9: invokevirtual 172	com/google/android/gms/analytics/internal/m:a	(J)Z
    //   12: ifeq +32 -> 44
    //   15: aload_0
    //   16: getfield 40	com/google/android/gms/analytics/internal/a:c	Lcom/google/android/gms/analytics/internal/m;
    //   19: invokevirtual 174	com/google/android/gms/analytics/internal/m:a	()V
    //   22: aload_0
    //   23: invokevirtual 176	com/google/android/gms/analytics/internal/a:d	()Lcom/google/android/gms/ads/a/a$a;
    //   26: astore_1
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 178	com/google/android/gms/analytics/internal/a:b	Lcom/google/android/gms/ads/a/a$a;
    //   32: aload_1
    //   33: invokespecial 180	com/google/android/gms/analytics/internal/a:a	(Lcom/google/android/gms/ads/a/a$a;Lcom/google/android/gms/ads/a/a$a;)Z
    //   36: ifeq +17 -> 53
    //   39: aload_0
    //   40: aload_1
    //   41: putfield 178	com/google/android/gms/analytics/internal/a:b	Lcom/google/android/gms/ads/a/a$a;
    //   44: aload_0
    //   45: getfield 178	com/google/android/gms/analytics/internal/a:b	Lcom/google/android/gms/ads/a/a$a;
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: areturn
    //   53: aload_0
    //   54: ldc -74
    //   56: invokevirtual 185	com/google/android/gms/analytics/internal/a:u	(Ljava/lang/String;)V
    //   59: aload_0
    //   60: new 87	com/google/android/gms/ads/a/a$a
    //   63: dup
    //   64: ldc -69
    //   66: iconst_0
    //   67: invokespecial 190	com/google/android/gms/ads/a/a$a:<init>	(Ljava/lang/String;Z)V
    //   70: putfield 178	com/google/android/gms/analytics/internal/a:b	Lcom/google/android/gms/ads/a/a$a;
    //   73: goto -29 -> 44
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	a
    //   26	26	1	locala	a.a
    //   76	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	44	76	finally
    //   44	49	76	finally
    //   53	73	76	finally
  }
  
  protected void a() {}
  
  public boolean b()
  {
    boolean bool2 = false;
    D();
    a.a locala = f();
    boolean bool1 = bool2;
    if (locala != null)
    {
      bool1 = bool2;
      if (!locala.b()) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public String c()
  {
    D();
    Object localObject = f();
    if (localObject != null) {}
    for (localObject = ((a.a)localObject).a();; localObject = null)
    {
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        return null;
      }
      return (String)localObject;
    }
  }
  
  protected a.a d()
  {
    Object localObject = null;
    try
    {
      a.a locala = com.google.android.gms.ads.a.a.b(o());
      localObject = locala;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      t("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
      return null;
    }
    catch (Throwable localThrowable)
    {
      while (a) {}
      a = true;
      d("Error getting advertiser id", localThrowable);
    }
    return (a.a)localObject;
    return null;
  }
  
  protected String e()
  {
    Object localObject1 = null;
    try
    {
      FileInputStream localFileInputStream = o().openFileInput("gaClientIdData");
      Object localObject2 = new byte[''];
      int i = localFileInputStream.read((byte[])localObject2, 0, 128);
      if (localFileInputStream.available() > 0)
      {
        t("Hash file seems corrupted, deleting it.");
        localFileInputStream.close();
        o().deleteFile("gaClientIdData");
        return null;
      }
      if (i <= 0)
      {
        q("Hash file is empty.");
        localFileInputStream.close();
        return null;
      }
      localObject2 = new String((byte[])localObject2, 0, i);
      IOException localIOException2;
      return null;
    }
    catch (IOException localIOException1)
    {
      try
      {
        localFileInputStream.close();
        return (String)localObject2;
      }
      catch (IOException localIOException3)
      {
        for (;;)
        {
          localObject1 = localIOException1;
          localIOException2 = localIOException3;
        }
      }
      catch (FileNotFoundException localFileNotFoundException1)
      {
        return localIOException2;
      }
      localIOException1 = localIOException1;
      d("Error reading Hash file, deleting it", localIOException1);
      o().deleteFile("gaClientIdData");
      return (String)localObject1;
    }
    catch (FileNotFoundException localFileNotFoundException2) {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */