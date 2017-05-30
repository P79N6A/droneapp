package com.google.android.gms.ads.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.c;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.j;
import com.google.android.gms.common.stats.b;
import com.google.android.gms.internal.te;
import com.google.android.gms.internal.te.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class a
{
  h a;
  te b;
  boolean c;
  Object d = new Object();
  b e;
  final long f;
  private final Context g;
  
  public a(Context paramContext)
  {
    this(paramContext, 30000L);
  }
  
  public a(Context paramContext, long paramLong)
  {
    d.a(paramContext);
    this.g = paramContext;
    this.c = false;
    this.f = paramLong;
  }
  
  static h a(Context paramContext)
  {
    try
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      switch (j.b().a(paramContext))
      {
      case 1: 
      default: 
        throw new IOException("Google Play services not available");
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      throw new c(9);
    }
    h localh = new h();
    Intent localIntent = new Intent("com.google.android.gms.ads.identifier.service.START");
    localIntent.setPackage("com.google.android.gms");
    try
    {
      boolean bool = b.a().a(paramContext, localIntent, localh, 1);
      if (bool) {
        return localh;
      }
    }
    catch (Throwable paramContext)
    {
      throw new IOException(paramContext);
    }
    throw new IOException("Connection failure");
  }
  
  static te a(Context paramContext, h paramh)
  {
    try
    {
      paramContext = te.a.a(paramh.a(10000L, TimeUnit.MILLISECONDS));
      return paramContext;
    }
    catch (InterruptedException paramContext)
    {
      throw new IOException("Interrupted exception");
    }
    catch (Throwable paramContext)
    {
      throw new IOException(paramContext);
    }
  }
  
  public static a b(Context paramContext)
  {
    paramContext = new a(paramContext, -1L);
    try
    {
      paramContext.a(false);
      a locala = paramContext.b();
      return locala;
    }
    finally
    {
      paramContext.c();
    }
  }
  
  public static void b(boolean paramBoolean) {}
  
  private void d()
  {
    synchronized (this.d)
    {
      if (this.e != null) {
        this.e.a();
      }
    }
    try
    {
      this.e.join();
      if (this.f > 0L) {
        this.e = new b(this, this.f);
      }
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public void a()
  {
    a(true);
  }
  
  protected void a(boolean paramBoolean)
  {
    d.c("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.c) {
        c();
      }
      this.a = a(this.g);
      this.b = a(this.g, this.a);
      this.c = true;
      if (paramBoolean) {
        d();
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public a b()
  {
    // Byte code:
    //   0: ldc -100
    //   2: invokestatic 158	com/google/android/gms/common/internal/d:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 44	com/google/android/gms/ads/a/a:c	Z
    //   11: ifne +83 -> 94
    //   14: aload_0
    //   15: getfield 35	com/google/android/gms/ads/a/a:d	Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 146	com/google/android/gms/ads/a/a:e	Lcom/google/android/gms/ads/a/a$b;
    //   25: ifnull +13 -> 38
    //   28: aload_0
    //   29: getfield 146	com/google/android/gms/ads/a/a:e	Lcom/google/android/gms/ads/a/a$b;
    //   32: invokevirtual 175	com/google/android/gms/ads/a/a$b:b	()Z
    //   35: ifne +23 -> 58
    //   38: new 75	java/io/IOException
    //   41: dup
    //   42: ldc -79
    //   44: invokespecial 80	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   47: athrow
    //   48: astore_2
    //   49: aload_1
    //   50: monitorexit
    //   51: aload_2
    //   52: athrow
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    //   58: aload_1
    //   59: monitorexit
    //   60: aload_0
    //   61: iconst_0
    //   62: invokevirtual 139	com/google/android/gms/ads/a/a:a	(Z)V
    //   65: aload_0
    //   66: getfield 44	com/google/android/gms/ads/a/a:c	Z
    //   69: ifne +25 -> 94
    //   72: new 75	java/io/IOException
    //   75: dup
    //   76: ldc -77
    //   78: invokespecial 80	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   81: athrow
    //   82: astore_1
    //   83: new 75	java/io/IOException
    //   86: dup
    //   87: ldc -77
    //   89: aload_1
    //   90: invokespecial 182	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   93: athrow
    //   94: aload_0
    //   95: getfield 162	com/google/android/gms/ads/a/a:a	Lcom/google/android/gms/common/h;
    //   98: invokestatic 40	com/google/android/gms/common/internal/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   101: pop
    //   102: aload_0
    //   103: getfield 166	com/google/android/gms/ads/a/a:b	Lcom/google/android/gms/internal/te;
    //   106: invokestatic 40	com/google/android/gms/common/internal/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   109: pop
    //   110: new 6	com/google/android/gms/ads/a/a$a
    //   113: dup
    //   114: aload_0
    //   115: getfield 166	com/google/android/gms/ads/a/a:b	Lcom/google/android/gms/internal/te;
    //   118: invokeinterface 187 1 0
    //   123: aload_0
    //   124: getfield 166	com/google/android/gms/ads/a/a:b	Lcom/google/android/gms/internal/te;
    //   127: iconst_1
    //   128: invokeinterface 190 2 0
    //   133: invokespecial 193	com/google/android/gms/ads/a/a$a:<init>	(Ljava/lang/String;Z)V
    //   136: astore_1
    //   137: aload_0
    //   138: monitorexit
    //   139: aload_0
    //   140: invokespecial 168	com/google/android/gms/ads/a/a:d	()V
    //   143: aload_1
    //   144: areturn
    //   145: astore_1
    //   146: ldc -61
    //   148: ldc -59
    //   150: aload_1
    //   151: invokestatic 203	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   154: pop
    //   155: new 75	java/io/IOException
    //   158: dup
    //   159: ldc -51
    //   161: invokespecial 80	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	a
    //   53	6	1	localObject2	Object
    //   82	8	1	localException	Exception
    //   136	8	1	locala	a
    //   145	6	1	localRemoteException	android.os.RemoteException
    //   48	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   21	38	48	finally
    //   38	48	48	finally
    //   49	51	48	finally
    //   58	60	48	finally
    //   7	21	53	finally
    //   51	53	53	finally
    //   54	56	53	finally
    //   60	65	53	finally
    //   65	82	53	finally
    //   83	94	53	finally
    //   94	110	53	finally
    //   110	137	53	finally
    //   137	139	53	finally
    //   146	165	53	finally
    //   60	65	82	java/lang/Exception
    //   110	137	145	android/os/RemoteException
  }
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: ldc -100
    //   2: invokestatic 158	com/google/android/gms/common/internal/d:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 42	com/google/android/gms/ads/a/a:g	Landroid/content/Context;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: getfield 162	com/google/android/gms/ads/a/a:a	Lcom/google/android/gms/common/h;
    //   18: ifnonnull +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 44	com/google/android/gms/ads/a/a:c	Z
    //   28: ifeq +17 -> 45
    //   31: invokestatic 104	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
    //   34: aload_0
    //   35: getfield 42	com/google/android/gms/ads/a/a:g	Landroid/content/Context;
    //   38: aload_0
    //   39: getfield 162	com/google/android/gms/ads/a/a:a	Lcom/google/android/gms/common/h;
    //   42: invokevirtual 210	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield 44	com/google/android/gms/ads/a/a:c	Z
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield 166	com/google/android/gms/ads/a/a:b	Lcom/google/android/gms/internal/te;
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 162	com/google/android/gms/ads/a/a:a	Lcom/google/android/gms/common/h;
    //   60: aload_0
    //   61: monitorexit
    //   62: return
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    //   68: astore_1
    //   69: ldc -61
    //   71: ldc -44
    //   73: aload_1
    //   74: invokestatic 203	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   77: pop
    //   78: goto -33 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	a
    //   63	4	1	localObject	Object
    //   68	6	1	localIllegalArgumentException	IllegalArgumentException
    // Exception table:
    //   from	to	target	type
    //   7	21	63	finally
    //   21	23	63	finally
    //   24	45	63	finally
    //   45	62	63	finally
    //   64	66	63	finally
    //   69	78	63	finally
    //   24	45	68	java/lang/IllegalArgumentException
  }
  
  protected void finalize()
  {
    c();
    super.finalize();
  }
  
  public static final class a
  {
    private final String a;
    private final boolean b;
    
    public a(String paramString, boolean paramBoolean)
    {
      this.a = paramString;
      this.b = paramBoolean;
    }
    
    public String a()
    {
      return this.a;
    }
    
    public boolean b()
    {
      return this.b;
    }
    
    public String toString()
    {
      String str = this.a;
      boolean bool = this.b;
      return String.valueOf(str).length() + 7 + "{" + str + "}" + bool;
    }
  }
  
  static class b
    extends Thread
  {
    CountDownLatch a;
    boolean b;
    private WeakReference<a> c;
    private long d;
    
    public b(a parama, long paramLong)
    {
      this.c = new WeakReference(parama);
      this.d = paramLong;
      this.a = new CountDownLatch(1);
      this.b = false;
      start();
    }
    
    private void c()
    {
      a locala = (a)this.c.get();
      if (locala != null)
      {
        locala.c();
        this.b = true;
      }
    }
    
    public void a()
    {
      this.a.countDown();
    }
    
    public boolean b()
    {
      return this.b;
    }
    
    public void run()
    {
      try
      {
        if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
          c();
        }
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        c();
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */