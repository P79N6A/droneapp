package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.concurrent.Future;

@aaa
public class zs
  extends abq
{
  private final zn.a a;
  private final AdResponseParcel b;
  private final abi.a c;
  private final zu d;
  private final Object e = new Object();
  private Future<abi> f;
  
  public zs(Context paramContext, q paramq, abi.a parama, ro paramro, zn.a parama1, un paramun)
  {
    this(parama, parama1, new zu(paramContext, paramq, new acc(paramContext), paramro, parama, paramun));
  }
  
  zs(abi.a parama, zn.a parama1, zu paramzu)
  {
    this.c = parama;
    this.b = parama.b;
    this.a = parama1;
    this.d = paramzu;
  }
  
  private abi a(int paramInt)
  {
    return new abi(this.c.a.c, null, null, paramInt, null, null, this.b.l, this.b.k, this.c.a.i, false, null, null, null, null, null, this.b.i, this.c.d, this.b.g, this.c.f, this.b.n, this.b.o, this.c.h, null, null, null, null, this.c.b.F, this.c.b.G, null, null, this.b.N);
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 42	com/google/android/gms/internal/zs:e	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 53	com/google/android/gms/internal/zs:d	Lcom/google/android/gms/internal/zu;
    //   12: invokestatic 126	com/google/android/gms/internal/abu:a	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/aco;
    //   15: putfield 128	com/google/android/gms/internal/zs:f	Ljava/util/concurrent/Future;
    //   18: aload_2
    //   19: monitorexit
    //   20: aload_0
    //   21: getfield 128	com/google/android/gms/internal/zs:f	Ljava/util/concurrent/Future;
    //   24: ldc2_w 129
    //   27: getstatic 136	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   30: invokeinterface 142 4 0
    //   35: checkcast 56	com/google/android/gms/internal/abi
    //   38: astore_2
    //   39: bipush -2
    //   41: istore_1
    //   42: aload_2
    //   43: ifnull +73 -> 116
    //   46: getstatic 147	com/google/android/gms/internal/abv:a	Landroid/os/Handler;
    //   49: new 149	com/google/android/gms/internal/zs$1
    //   52: dup
    //   53: aload_0
    //   54: aload_2
    //   55: invokespecial 152	com/google/android/gms/internal/zs$1:<init>	(Lcom/google/android/gms/internal/zs;Lcom/google/android/gms/internal/abi;)V
    //   58: invokevirtual 158	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   61: pop
    //   62: return
    //   63: astore_3
    //   64: aload_2
    //   65: monitorexit
    //   66: aload_3
    //   67: athrow
    //   68: astore_2
    //   69: ldc -96
    //   71: invokestatic 165	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   74: aload_0
    //   75: getfield 128	com/google/android/gms/internal/zs:f	Ljava/util/concurrent/Future;
    //   78: iconst_1
    //   79: invokeinterface 169 2 0
    //   84: pop
    //   85: iconst_2
    //   86: istore_1
    //   87: aconst_null
    //   88: astore_2
    //   89: goto -47 -> 42
    //   92: astore_2
    //   93: aconst_null
    //   94: astore_2
    //   95: iconst_0
    //   96: istore_1
    //   97: goto -55 -> 42
    //   100: astore_2
    //   101: aconst_null
    //   102: astore_2
    //   103: iconst_0
    //   104: istore_1
    //   105: goto -63 -> 42
    //   108: astore_2
    //   109: aconst_null
    //   110: astore_2
    //   111: iconst_0
    //   112: istore_1
    //   113: goto -71 -> 42
    //   116: aload_0
    //   117: iload_1
    //   118: invokespecial 171	com/google/android/gms/internal/zs:a	(I)Lcom/google/android/gms/internal/abi;
    //   121: astore_2
    //   122: goto -76 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	zs
    //   41	77	1	i	int
    //   68	1	2	localTimeoutException	java.util.concurrent.TimeoutException
    //   88	1	2	localObject2	Object
    //   92	1	2	localExecutionException	java.util.concurrent.ExecutionException
    //   94	1	2	localObject3	Object
    //   100	1	2	localInterruptedException	InterruptedException
    //   102	1	2	localObject4	Object
    //   108	1	2	localCancellationException	java.util.concurrent.CancellationException
    //   110	12	2	localabi	abi
    //   63	4	3	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   7	20	63	finally
    //   64	66	63	finally
    //   0	7	68	java/util/concurrent/TimeoutException
    //   20	39	68	java/util/concurrent/TimeoutException
    //   66	68	68	java/util/concurrent/TimeoutException
    //   0	7	92	java/util/concurrent/ExecutionException
    //   20	39	92	java/util/concurrent/ExecutionException
    //   66	68	92	java/util/concurrent/ExecutionException
    //   0	7	100	java/lang/InterruptedException
    //   20	39	100	java/lang/InterruptedException
    //   66	68	100	java/lang/InterruptedException
    //   0	7	108	java/util/concurrent/CancellationException
    //   20	39	108	java/util/concurrent/CancellationException
    //   66	68	108	java/util/concurrent/CancellationException
  }
  
  public void b()
  {
    synchronized (this.e)
    {
      if (this.f != null) {
        this.f.cancel(true);
      }
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */