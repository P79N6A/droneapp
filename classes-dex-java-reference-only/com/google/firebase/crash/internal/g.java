package com.google.firebase.crash.internal;

import com.google.android.gms.internal.akb;
import com.google.android.gms.internal.akb.a;

public class g
{
  private static g b;
  private akb a;
  
  public static g a()
  {
    try
    {
      if (b != null)
      {
        localg = b;
        return localg;
      }
      b = new g();
      g localg = b;
      return localg;
    }
    finally {}
  }
  
  /* Error */
  public void a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: getfield 24	com/google/firebase/crash/internal/g:a	Lcom/google/android/gms/internal/akb;
    //   7: ifnull +7 -> 14
    //   10: ldc 2
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: aload_1
    //   16: getstatic 30	com/google/android/gms/internal/akb:c	Lcom/google/android/gms/internal/akb$b;
    //   19: ldc 32
    //   21: invokestatic 35	com/google/android/gms/internal/akb:a	(Landroid/content/Context;Lcom/google/android/gms/internal/akb$b;Ljava/lang/String;)Lcom/google/android/gms/internal/akb;
    //   24: putfield 24	com/google/firebase/crash/internal/g:a	Lcom/google/android/gms/internal/akb;
    //   27: ldc 2
    //   29: monitorexit
    //   30: return
    //   31: astore_1
    //   32: ldc 2
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    //   37: astore_1
    //   38: new 6	com/google/firebase/crash/internal/g$a
    //   41: dup
    //   42: aload_1
    //   43: aconst_null
    //   44: invokespecial 38	com/google/firebase/crash/internal/g$a:<init>	(Ljava/lang/Throwable;Lcom/google/firebase/crash/internal/g$1;)V
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	g
    //   0	48	1	paramContext	android.content.Context
    // Exception table:
    //   from	to	target	type
    //   3	13	31	finally
    //   14	27	31	finally
    //   27	30	31	finally
    //   32	35	31	finally
    //   38	48	31	finally
    //   14	27	37	com/google/android/gms/internal/akb$a
  }
  
  public d b()
  {
    com.google.android.gms.common.internal.d.a(this.a);
    try
    {
      d locald = d.a.a(this.a.a("com.google.firebase.crash.internal.api.FirebaseCrashApiImpl"));
      return locald;
    }
    catch (akb.a locala)
    {
      throw new a(locala, null);
    }
  }
  
  public e c()
  {
    com.google.android.gms.common.internal.d.a(this.a);
    try
    {
      e locale = e.a.a(this.a.a("com.google.firebase.crash.internal.service.FirebaseCrashReceiverServiceImpl"));
      return locale;
    }
    catch (akb.a locala)
    {
      throw new a(locala, null);
    }
  }
  
  public f d()
  {
    com.google.android.gms.common.internal.d.a(this.a);
    try
    {
      f localf = f.a.a(this.a.a("com.google.firebase.crash.internal.service.FirebaseCrashSenderServiceImpl"));
      return localf;
    }
    catch (akb.a locala)
    {
      throw new a(locala, null);
    }
  }
  
  public static class a
    extends Exception
  {
    private a(Throwable paramThrowable)
    {
      super();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/crash/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */