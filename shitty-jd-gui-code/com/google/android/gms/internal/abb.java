package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

@aaa
public class abb
  extends abq
  implements aba
{
  private final abi.a a;
  private final Context b;
  private final ArrayList<Future> c = new ArrayList();
  private final ArrayList<String> d = new ArrayList();
  private final HashMap<String, aav> e = new HashMap();
  private final List<aaw> f = new ArrayList();
  private final HashSet<String> g = new HashSet();
  private final Object h = new Object();
  private final aau i;
  private final long j;
  
  public abb(Context paramContext, abi.a parama, aau paramaau)
  {
    this(paramContext, parama, paramaau, ((Long)uf.an.c()).longValue());
  }
  
  abb(Context paramContext, abi.a parama, aau paramaau, long paramLong)
  {
    this.b = paramContext;
    this.a = parama;
    this.i = paramaau;
    this.j = paramLong;
  }
  
  private static int a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 6;
    case 6: 
      return 0;
    case 3: 
      return 1;
    case 4: 
      return 2;
    case 7: 
      return 3;
    }
    return 4;
  }
  
  private abi a(int paramInt, @Nullable String paramString, @Nullable xg paramxg)
  {
    return new abi(this.a.a.c, null, this.a.b.d, paramInt, this.a.b.f, this.a.b.j, this.a.b.l, this.a.b.k, this.a.a.i, this.a.b.h, paramxg, null, paramString, this.a.c, null, this.a.b.i, this.a.d, this.a.b.g, this.a.f, this.a.b.n, this.a.b.o, this.a.h, null, this.a.b.C, this.a.b.D, this.a.b.E, this.a.b.F, this.a.b.G, f(), this.a.b.J, this.a.b.N);
  }
  
  private abi a(String paramString, xg paramxg)
  {
    return a(-2, paramString, paramxg);
  }
  
  private static String a(aaw paramaaw)
  {
    String str = paramaaw.b;
    int k = a(paramaaw.c);
    long l = paramaaw.d;
    return String.valueOf(str).length() + 33 + str + "." + k + "." + l;
  }
  
  private void a(String paramString1, String paramString2, xg paramxg)
  {
    synchronized (this.h)
    {
      abc localabc = this.i.c(paramString1);
      if ((localabc == null) || (localabc.b() == null) || (localabc.a() == null))
      {
        this.f.add(new aaw.a().b(paramxg.d).a(paramString1).a(0L).a(7).a());
        return;
      }
      paramString2 = a(paramString1, paramString2, paramxg, localabc);
      this.c.add((Future)paramString2.e());
      this.d.add(paramString1);
      this.e.put(paramString1, paramString2);
      return;
    }
  }
  
  private abi c()
  {
    return a(3, null, null);
  }
  
  private String f()
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    if (this.f == null) {
      return localStringBuilder.toString();
    }
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      aaw localaaw = (aaw)localIterator.next();
      if ((localaaw != null) && (!TextUtils.isEmpty(localaaw.b))) {
        localStringBuilder.append(String.valueOf(a(localaaw)).concat("_"));
      }
    }
    return localStringBuilder.substring(0, Math.max(0, localStringBuilder.length() - 1));
  }
  
  protected aav a(String paramString1, String paramString2, xg paramxg, abc paramabc)
  {
    return new aav(this.b, paramString1, paramString2, paramxg, this.a, paramabc, this, this.j);
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 85	com/google/android/gms/internal/abb:a	Lcom/google/android/gms/internal/abi$a;
    //   4: getfield 131	com/google/android/gms/internal/abi$a:c	Lcom/google/android/gms/internal/xh;
    //   7: getfield 334	com/google/android/gms/internal/xh:a	Ljava/util/List;
    //   10: invokeinterface 285 1 0
    //   15: astore 4
    //   17: aload 4
    //   19: invokeinterface 291 1 0
    //   24: ifeq +116 -> 140
    //   27: aload 4
    //   29: invokeinterface 294 1 0
    //   34: checkcast 241	com/google/android/gms/internal/xg
    //   37: astore 5
    //   39: aload 5
    //   41: getfield 335	com/google/android/gms/internal/xg:i	Ljava/lang/String;
    //   44: astore 6
    //   46: aload 5
    //   48: getfield 337	com/google/android/gms/internal/xg:c	Ljava/util/List;
    //   51: invokeinterface 285 1 0
    //   56: astore 7
    //   58: aload 7
    //   60: invokeinterface 291 1 0
    //   65: ifeq -48 -> 17
    //   68: aload 7
    //   70: invokeinterface 294 1 0
    //   75: checkcast 196	java/lang/String
    //   78: astore_3
    //   79: ldc_w 339
    //   82: aload_3
    //   83: invokevirtual 342	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   86: ifne +15 -> 101
    //   89: aload_3
    //   90: astore_2
    //   91: ldc_w 344
    //   94: aload_3
    //   95: invokevirtual 342	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   98: ifeq +19 -> 117
    //   101: new 346	org/json/JSONObject
    //   104: dup
    //   105: aload 6
    //   107: invokespecial 347	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   110: ldc_w 349
    //   113: invokevirtual 352	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   116: astore_2
    //   117: aload_0
    //   118: aload_2
    //   119: aload 6
    //   121: aload 5
    //   123: invokespecial 354	com/google/android/gms/internal/abb:a	(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/xg;)V
    //   126: goto -68 -> 58
    //   129: astore_2
    //   130: ldc_w 356
    //   133: aload_2
    //   134: invokestatic 361	com/google/android/gms/internal/abr:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   137: goto -79 -> 58
    //   140: iconst_0
    //   141: istore_1
    //   142: iload_1
    //   143: aload_0
    //   144: getfield 62	com/google/android/gms/internal/abb:c	Ljava/util/ArrayList;
    //   147: invokevirtual 364	java/util/ArrayList:size	()I
    //   150: if_icmpge +241 -> 391
    //   153: aload_0
    //   154: getfield 62	com/google/android/gms/internal/abb:c	Ljava/util/ArrayList;
    //   157: iload_1
    //   158: invokevirtual 368	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   161: checkcast 270	java/util/concurrent/Future
    //   164: invokeinterface 370 1 0
    //   169: pop
    //   170: aload_0
    //   171: getfield 81	com/google/android/gms/internal/abb:h	Ljava/lang/Object;
    //   174: astore_2
    //   175: aload_2
    //   176: monitorenter
    //   177: aload_0
    //   178: getfield 64	com/google/android/gms/internal/abb:d	Ljava/util/ArrayList;
    //   181: iload_1
    //   182: invokevirtual 368	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   185: checkcast 196	java/lang/String
    //   188: astore_3
    //   189: aload_3
    //   190: invokestatic 300	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   193: ifne +33 -> 226
    //   196: aload_0
    //   197: getfield 69	com/google/android/gms/internal/abb:e	Ljava/util/HashMap;
    //   200: aload_3
    //   201: invokevirtual 373	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   204: checkcast 321	com/google/android/gms/internal/aav
    //   207: astore_3
    //   208: aload_3
    //   209: ifnull +17 -> 226
    //   212: aload_0
    //   213: getfield 71	com/google/android/gms/internal/abb:f	Ljava/util/List;
    //   216: aload_3
    //   217: invokevirtual 375	com/google/android/gms/internal/aav:c	()Lcom/google/android/gms/internal/aaw;
    //   220: invokeinterface 263 2 0
    //   225: pop
    //   226: aload_2
    //   227: monitorexit
    //   228: aload_0
    //   229: getfield 81	com/google/android/gms/internal/abb:h	Ljava/lang/Object;
    //   232: astore_3
    //   233: aload_3
    //   234: monitorenter
    //   235: aload_0
    //   236: getfield 76	com/google/android/gms/internal/abb:g	Ljava/util/HashSet;
    //   239: aload_0
    //   240: getfield 64	com/google/android/gms/internal/abb:d	Ljava/util/ArrayList;
    //   243: iload_1
    //   244: invokevirtual 368	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   247: invokevirtual 378	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   250: ifeq +319 -> 569
    //   253: aload_0
    //   254: getfield 64	com/google/android/gms/internal/abb:d	Ljava/util/ArrayList;
    //   257: iload_1
    //   258: invokevirtual 368	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   261: checkcast 196	java/lang/String
    //   264: astore 4
    //   266: aload_0
    //   267: getfield 69	com/google/android/gms/internal/abb:e	Ljava/util/HashMap;
    //   270: aload 4
    //   272: invokevirtual 373	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   275: ifnull +289 -> 564
    //   278: aload_0
    //   279: getfield 69	com/google/android/gms/internal/abb:e	Ljava/util/HashMap;
    //   282: aload 4
    //   284: invokevirtual 373	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   287: checkcast 321	com/google/android/gms/internal/aav
    //   290: invokevirtual 381	com/google/android/gms/internal/aav:f	()Lcom/google/android/gms/internal/xg;
    //   293: astore_2
    //   294: aload_0
    //   295: aload 4
    //   297: aload_2
    //   298: invokespecial 383	com/google/android/gms/internal/abb:a	(Ljava/lang/String;Lcom/google/android/gms/internal/xg;)Lcom/google/android/gms/internal/abi;
    //   301: astore_2
    //   302: getstatic 388	com/google/android/gms/ads/internal/util/client/a:a	Landroid/os/Handler;
    //   305: new 390	com/google/android/gms/internal/abb$1
    //   308: dup
    //   309: aload_0
    //   310: aload_2
    //   311: invokespecial 393	com/google/android/gms/internal/abb$1:<init>	(Lcom/google/android/gms/internal/abb;Lcom/google/android/gms/internal/abi;)V
    //   314: invokevirtual 399	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   317: pop
    //   318: aload_3
    //   319: monitorexit
    //   320: return
    //   321: astore_3
    //   322: aload_2
    //   323: monitorexit
    //   324: aload_3
    //   325: athrow
    //   326: astore_2
    //   327: invokestatic 405	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   330: invokevirtual 408	java/lang/Thread:interrupt	()V
    //   333: aload_0
    //   334: getfield 81	com/google/android/gms/internal/abb:h	Ljava/lang/Object;
    //   337: astore_2
    //   338: aload_2
    //   339: monitorenter
    //   340: aload_0
    //   341: getfield 64	com/google/android/gms/internal/abb:d	Ljava/util/ArrayList;
    //   344: iload_1
    //   345: invokevirtual 368	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   348: checkcast 196	java/lang/String
    //   351: astore_3
    //   352: aload_3
    //   353: invokestatic 300	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   356: ifne +33 -> 389
    //   359: aload_0
    //   360: getfield 69	com/google/android/gms/internal/abb:e	Ljava/util/HashMap;
    //   363: aload_3
    //   364: invokevirtual 373	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   367: checkcast 321	com/google/android/gms/internal/aav
    //   370: astore_3
    //   371: aload_3
    //   372: ifnull +17 -> 389
    //   375: aload_0
    //   376: getfield 71	com/google/android/gms/internal/abb:f	Ljava/util/List;
    //   379: aload_3
    //   380: invokevirtual 375	com/google/android/gms/internal/aav:c	()Lcom/google/android/gms/internal/aaw;
    //   383: invokeinterface 263 2 0
    //   388: pop
    //   389: aload_2
    //   390: monitorexit
    //   391: aload_0
    //   392: invokespecial 410	com/google/android/gms/internal/abb:c	()Lcom/google/android/gms/internal/abi;
    //   395: astore_2
    //   396: getstatic 388	com/google/android/gms/ads/internal/util/client/a:a	Landroid/os/Handler;
    //   399: new 412	com/google/android/gms/internal/abb$2
    //   402: dup
    //   403: aload_0
    //   404: aload_2
    //   405: invokespecial 413	com/google/android/gms/internal/abb$2:<init>	(Lcom/google/android/gms/internal/abb;Lcom/google/android/gms/internal/abi;)V
    //   408: invokevirtual 399	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   411: pop
    //   412: return
    //   413: astore_3
    //   414: aload_2
    //   415: monitorexit
    //   416: aload_3
    //   417: athrow
    //   418: astore_2
    //   419: ldc_w 415
    //   422: aload_2
    //   423: invokestatic 417	com/google/android/gms/internal/abr:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   426: aload_0
    //   427: getfield 81	com/google/android/gms/internal/abb:h	Ljava/lang/Object;
    //   430: astore_2
    //   431: aload_2
    //   432: monitorenter
    //   433: aload_0
    //   434: getfield 64	com/google/android/gms/internal/abb:d	Ljava/util/ArrayList;
    //   437: iload_1
    //   438: invokevirtual 368	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   441: checkcast 196	java/lang/String
    //   444: astore_3
    //   445: aload_3
    //   446: invokestatic 300	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   449: ifne +33 -> 482
    //   452: aload_0
    //   453: getfield 69	com/google/android/gms/internal/abb:e	Ljava/util/HashMap;
    //   456: aload_3
    //   457: invokevirtual 373	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   460: checkcast 321	com/google/android/gms/internal/aav
    //   463: astore_3
    //   464: aload_3
    //   465: ifnull +17 -> 482
    //   468: aload_0
    //   469: getfield 71	com/google/android/gms/internal/abb:f	Ljava/util/List;
    //   472: aload_3
    //   473: invokevirtual 375	com/google/android/gms/internal/aav:c	()Lcom/google/android/gms/internal/aaw;
    //   476: invokeinterface 263 2 0
    //   481: pop
    //   482: aload_2
    //   483: monitorexit
    //   484: goto +95 -> 579
    //   487: astore_3
    //   488: aload_2
    //   489: monitorexit
    //   490: aload_3
    //   491: athrow
    //   492: astore_3
    //   493: aload_0
    //   494: getfield 81	com/google/android/gms/internal/abb:h	Ljava/lang/Object;
    //   497: astore_2
    //   498: aload_2
    //   499: monitorenter
    //   500: aload_0
    //   501: getfield 64	com/google/android/gms/internal/abb:d	Ljava/util/ArrayList;
    //   504: iload_1
    //   505: invokevirtual 368	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   508: checkcast 196	java/lang/String
    //   511: astore 4
    //   513: aload 4
    //   515: invokestatic 300	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   518: ifne +37 -> 555
    //   521: aload_0
    //   522: getfield 69	com/google/android/gms/internal/abb:e	Ljava/util/HashMap;
    //   525: aload 4
    //   527: invokevirtual 373	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   530: checkcast 321	com/google/android/gms/internal/aav
    //   533: astore 4
    //   535: aload 4
    //   537: ifnull +18 -> 555
    //   540: aload_0
    //   541: getfield 71	com/google/android/gms/internal/abb:f	Ljava/util/List;
    //   544: aload 4
    //   546: invokevirtual 375	com/google/android/gms/internal/aav:c	()Lcom/google/android/gms/internal/aaw;
    //   549: invokeinterface 263 2 0
    //   554: pop
    //   555: aload_2
    //   556: monitorexit
    //   557: aload_3
    //   558: athrow
    //   559: astore_3
    //   560: aload_2
    //   561: monitorexit
    //   562: aload_3
    //   563: athrow
    //   564: aconst_null
    //   565: astore_2
    //   566: goto -272 -> 294
    //   569: aload_3
    //   570: monitorexit
    //   571: goto +8 -> 579
    //   574: astore_2
    //   575: aload_3
    //   576: monitorexit
    //   577: aload_2
    //   578: athrow
    //   579: iload_1
    //   580: iconst_1
    //   581: iadd
    //   582: istore_1
    //   583: goto -441 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	586	0	this	abb
    //   141	442	1	k	int
    //   90	29	2	localObject1	Object
    //   129	5	2	localJSONException	org.json.JSONException
    //   326	1	2	localInterruptedException	InterruptedException
    //   418	5	2	localException	Exception
    //   574	4	2	localObject5	Object
    //   321	4	3	localObject7	Object
    //   351	29	3	localObject8	Object
    //   413	4	3	localObject9	Object
    //   444	29	3	localObject10	Object
    //   487	4	3	localObject11	Object
    //   492	66	3	localObject12	Object
    //   559	17	3	localObject13	Object
    //   15	530	4	localObject14	Object
    //   37	85	5	localxg	xg
    //   44	76	6	str	String
    //   56	13	7	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   101	117	129	org/json/JSONException
    //   177	208	321	finally
    //   212	226	321	finally
    //   226	228	321	finally
    //   322	324	321	finally
    //   153	170	326	java/lang/InterruptedException
    //   340	371	413	finally
    //   375	389	413	finally
    //   389	391	413	finally
    //   414	416	413	finally
    //   153	170	418	java/lang/Exception
    //   433	464	487	finally
    //   468	482	487	finally
    //   482	484	487	finally
    //   488	490	487	finally
    //   153	170	492	finally
    //   327	333	492	finally
    //   419	426	492	finally
    //   500	535	559	finally
    //   540	555	559	finally
    //   555	557	559	finally
    //   560	562	559	finally
    //   235	294	574	finally
    //   294	320	574	finally
    //   569	571	574	finally
    //   575	577	574	finally
  }
  
  public void a(String paramString)
  {
    synchronized (this.h)
    {
      this.g.add(paramString);
      return;
    }
  }
  
  public void a(String paramString, int paramInt) {}
  
  public void b() {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/abb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */