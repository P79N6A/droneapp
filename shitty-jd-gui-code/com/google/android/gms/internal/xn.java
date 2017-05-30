package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@aaa
public class xn
  implements xf
{
  private final AdRequestInfoParcel a;
  private final xq b;
  private final Context c;
  private final xh d;
  private final boolean e;
  private final long f;
  private final long g;
  private final int h;
  private final Object i = new Object();
  private boolean j = false;
  private final Map<aco<xl>, xk> k = new HashMap();
  private final boolean l;
  private List<xl> m = new ArrayList();
  
  public xn(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, xq paramxq, xh paramxh, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, int paramInt)
  {
    this.c = paramContext;
    this.a = paramAdRequestInfoParcel;
    this.b = paramxq;
    this.d = paramxh;
    this.e = paramBoolean1;
    this.l = paramBoolean2;
    this.f = paramLong1;
    this.g = paramLong2;
    this.h = paramInt;
  }
  
  private void a(aco<xl> paramaco)
  {
    abv.a.post(new xn.2(this, paramaco));
  }
  
  private xl b(List<aco<xl>> paramList)
  {
    for (;;)
    {
      synchronized (this.i)
      {
        if (this.j)
        {
          paramList = new xl(-1);
          return paramList;
        }
        ??? = paramList.iterator();
        if (((Iterator)???).hasNext()) {
          paramList = (aco)((Iterator)???).next();
        }
      }
      try
      {
        xl localxl = (xl)paramList.get();
        this.m.add(localxl);
        if ((localxl == null) || (localxl.a != 0)) {
          continue;
        }
        a(paramList);
        return localxl;
      }
      catch (InterruptedException paramList)
      {
        abr.d("Exception while processing an adapter; continuing with other adapters", paramList);
        continue;
        paramList = finally;
        throw paramList;
        a(null);
        return new xl(1);
      }
      catch (ExecutionException paramList)
      {
        for (;;) {}
      }
    }
  }
  
  /* Error */
  private xl c(List<aco<xl>> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 39	com/google/android/gms/internal/xn:i	Ljava/lang/Object;
    //   4: astore 8
    //   6: aload 8
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 41	com/google/android/gms/internal/xn:j	Z
    //   13: ifeq +17 -> 30
    //   16: new 97	com/google/android/gms/internal/xl
    //   19: dup
    //   20: iconst_m1
    //   21: invokespecial 100	com/google/android/gms/internal/xl:<init>	(I)V
    //   24: astore_1
    //   25: aload 8
    //   27: monitorexit
    //   28: aload_1
    //   29: areturn
    //   30: aload 8
    //   32: monitorexit
    //   33: iconst_m1
    //   34: istore_2
    //   35: aconst_null
    //   36: astore 8
    //   38: aconst_null
    //   39: astore 9
    //   41: aload_0
    //   42: getfield 59	com/google/android/gms/internal/xn:d	Lcom/google/android/gms/internal/xh;
    //   45: getfield 147	com/google/android/gms/internal/xh:m	J
    //   48: ldc2_w 148
    //   51: lcmp
    //   52: ifeq +170 -> 222
    //   55: aload_0
    //   56: getfield 59	com/google/android/gms/internal/xn:d	Lcom/google/android/gms/internal/xh;
    //   59: getfield 147	com/google/android/gms/internal/xh:m	J
    //   62: lstore 4
    //   64: aload_1
    //   65: invokeinterface 106 1 0
    //   70: astore 11
    //   72: aload 11
    //   74: invokeinterface 112 1 0
    //   79: ifeq +225 -> 304
    //   82: aload 11
    //   84: invokeinterface 116 1 0
    //   89: checkcast 118	com/google/android/gms/internal/aco
    //   92: astore 10
    //   94: invokestatic 154	com/google/android/gms/ads/internal/u:k	()Lcom/google/android/gms/common/util/e;
    //   97: invokeinterface 159 1 0
    //   102: lstore 6
    //   104: lload 4
    //   106: lconst_0
    //   107: lcmp
    //   108: ifne +122 -> 230
    //   111: aload 10
    //   113: invokeinterface 162 1 0
    //   118: ifeq +112 -> 230
    //   121: aload 10
    //   123: invokeinterface 121 1 0
    //   128: checkcast 97	com/google/android/gms/internal/xl
    //   131: astore_1
    //   132: aload_0
    //   133: getfield 51	com/google/android/gms/internal/xn:m	Ljava/util/List;
    //   136: aload_1
    //   137: invokeinterface 125 2 0
    //   142: pop
    //   143: aload_1
    //   144: ifnull +192 -> 336
    //   147: aload_1
    //   148: getfield 127	com/google/android/gms/internal/xl:a	I
    //   151: ifne +185 -> 336
    //   154: aload_1
    //   155: getfield 165	com/google/android/gms/internal/xl:f	Lcom/google/android/gms/internal/xt;
    //   158: astore 12
    //   160: aload 12
    //   162: ifnull +174 -> 336
    //   165: aload 12
    //   167: invokeinterface 170 1 0
    //   172: iload_2
    //   173: if_icmple +163 -> 336
    //   176: aload 12
    //   178: invokeinterface 170 1 0
    //   183: istore_3
    //   184: iload_3
    //   185: istore_2
    //   186: aload 10
    //   188: astore 8
    //   190: lload 4
    //   192: invokestatic 154	com/google/android/gms/ads/internal/u:k	()Lcom/google/android/gms/common/util/e;
    //   195: invokeinterface 159 1 0
    //   200: lload 6
    //   202: lsub
    //   203: lsub
    //   204: lconst_0
    //   205: invokestatic 176	java/lang/Math:max	(JJ)J
    //   208: lstore 4
    //   210: aload_1
    //   211: astore 9
    //   213: goto -141 -> 72
    //   216: astore_1
    //   217: aload 8
    //   219: monitorexit
    //   220: aload_1
    //   221: athrow
    //   222: ldc2_w 177
    //   225: lstore 4
    //   227: goto -163 -> 64
    //   230: aload 10
    //   232: lload 4
    //   234: getstatic 184	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   237: invokeinterface 187 4 0
    //   242: checkcast 97	com/google/android/gms/internal/xl
    //   245: astore_1
    //   246: goto -114 -> 132
    //   249: astore_1
    //   250: ldc -125
    //   252: aload_1
    //   253: invokestatic 136	com/google/android/gms/internal/abr:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   256: lload 4
    //   258: invokestatic 154	com/google/android/gms/ads/internal/u:k	()Lcom/google/android/gms/common/util/e;
    //   261: invokeinterface 159 1 0
    //   266: lload 6
    //   268: lsub
    //   269: lsub
    //   270: lconst_0
    //   271: invokestatic 176	java/lang/Math:max	(JJ)J
    //   274: lstore 4
    //   276: aload 9
    //   278: astore_1
    //   279: goto -69 -> 210
    //   282: astore_1
    //   283: lload 4
    //   285: invokestatic 154	com/google/android/gms/ads/internal/u:k	()Lcom/google/android/gms/common/util/e;
    //   288: invokeinterface 159 1 0
    //   293: lload 6
    //   295: lsub
    //   296: lsub
    //   297: lconst_0
    //   298: invokestatic 176	java/lang/Math:max	(JJ)J
    //   301: pop2
    //   302: aload_1
    //   303: athrow
    //   304: aload_0
    //   305: aload 8
    //   307: invokespecial 129	com/google/android/gms/internal/xn:a	(Lcom/google/android/gms/internal/aco;)V
    //   310: aload 9
    //   312: ifnonnull +30 -> 342
    //   315: new 97	com/google/android/gms/internal/xl
    //   318: dup
    //   319: iconst_1
    //   320: invokespecial 100	com/google/android/gms/internal/xl:<init>	(I)V
    //   323: areturn
    //   324: astore_1
    //   325: goto -75 -> 250
    //   328: astore_1
    //   329: goto -79 -> 250
    //   332: astore_1
    //   333: goto -83 -> 250
    //   336: aload 9
    //   338: astore_1
    //   339: goto -149 -> 190
    //   342: aload 9
    //   344: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	this	xn
    //   0	345	1	paramList	List<aco<xl>>
    //   34	152	2	n	int
    //   183	2	3	i1	int
    //   62	222	4	l1	long
    //   102	192	6	l2	long
    //   4	302	8	localObject	Object
    //   39	304	9	localList	List<aco<xl>>
    //   92	139	10	localaco	aco
    //   70	13	11	localIterator	Iterator
    //   158	19	12	localxt	xt
    // Exception table:
    //   from	to	target	type
    //   9	28	216	finally
    //   30	33	216	finally
    //   217	220	216	finally
    //   111	132	249	android/os/RemoteException
    //   132	143	249	android/os/RemoteException
    //   147	160	249	android/os/RemoteException
    //   165	184	249	android/os/RemoteException
    //   230	246	249	android/os/RemoteException
    //   111	132	282	finally
    //   132	143	282	finally
    //   147	160	282	finally
    //   165	184	282	finally
    //   230	246	282	finally
    //   250	256	282	finally
    //   111	132	324	java/lang/InterruptedException
    //   132	143	324	java/lang/InterruptedException
    //   147	160	324	java/lang/InterruptedException
    //   165	184	324	java/lang/InterruptedException
    //   230	246	324	java/lang/InterruptedException
    //   111	132	328	java/util/concurrent/ExecutionException
    //   132	143	328	java/util/concurrent/ExecutionException
    //   147	160	328	java/util/concurrent/ExecutionException
    //   165	184	328	java/util/concurrent/ExecutionException
    //   230	246	328	java/util/concurrent/ExecutionException
    //   111	132	332	java/util/concurrent/TimeoutException
    //   132	143	332	java/util/concurrent/TimeoutException
    //   147	160	332	java/util/concurrent/TimeoutException
    //   165	184	332	java/util/concurrent/TimeoutException
    //   230	246	332	java/util/concurrent/TimeoutException
  }
  
  public xl a(List<xg> paramList)
  {
    abr.a("Starting mediation.");
    ExecutorService localExecutorService = Executors.newCachedThreadPool();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      xg localxg = (xg)localIterator.next();
      paramList = String.valueOf(localxg.b);
      if (paramList.length() != 0) {}
      for (paramList = "Trying mediation network: ".concat(paramList);; paramList = new String("Trying mediation network: "))
      {
        abr.c(paramList);
        paramList = localxg.c.iterator();
        while (paramList.hasNext())
        {
          Object localObject = (String)paramList.next();
          localObject = new xk(this.c, (String)localObject, this.b, this.d, localxg, this.a.c, this.a.d, this.a.k, this.e, this.l, this.a.z, this.a.n);
          aco localaco = abu.a(localExecutorService, new xn.1(this, (xk)localObject));
          this.k.put(localaco, localObject);
          localArrayList.add(localaco);
        }
        break;
      }
    }
    switch (this.h)
    {
    default: 
      return b(localArrayList);
    }
    return c(localArrayList);
  }
  
  public void a()
  {
    synchronized (this.i)
    {
      this.j = true;
      Iterator localIterator = this.k.values().iterator();
      if (localIterator.hasNext()) {
        ((xk)localIterator.next()).a();
      }
    }
  }
  
  public List<xl> b()
  {
    return this.m;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */