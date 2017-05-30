package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import java.util.HashSet;
import java.util.Set;

public class ah
{
  private final v a;
  private volatile Boolean b;
  private String c;
  private Set<Integer> d;
  
  protected ah(v paramv)
  {
    d.a(paramv);
    this.a = paramv;
  }
  
  public String A()
  {
    return "google_analytics_v4.db";
  }
  
  public String B()
  {
    return "google_analytics2_v4.db";
  }
  
  public long C()
  {
    return 86400000L;
  }
  
  public int D()
  {
    return ((Integer)ao.E.a()).intValue();
  }
  
  public int E()
  {
    return ((Integer)ao.F.a()).intValue();
  }
  
  public long F()
  {
    return ((Long)ao.G.a()).longValue();
  }
  
  public long G()
  {
    return ((Long)ao.P.a()).longValue();
  }
  
  public boolean a()
  {
    return false;
  }
  
  /* Error */
  public boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 72	com/google/android/gms/analytics/internal/ah:b	Ljava/lang/Boolean;
    //   4: ifnonnull +119 -> 123
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 72	com/google/android/gms/analytics/internal/ah:b	Ljava/lang/Boolean;
    //   13: ifnonnull +108 -> 121
    //   16: aload_0
    //   17: getfield 25	com/google/android/gms/analytics/internal/ah:a	Lcom/google/android/gms/analytics/internal/v;
    //   20: invokevirtual 77	com/google/android/gms/analytics/internal/v:b	()Landroid/content/Context;
    //   23: invokevirtual 83	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   26: astore_3
    //   27: invokestatic 87	com/google/android/gms/common/util/t:b	()Ljava/lang/String;
    //   30: astore_2
    //   31: aload_3
    //   32: ifnull +30 -> 62
    //   35: aload_3
    //   36: getfield 92	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   39: astore_3
    //   40: aload_3
    //   41: ifnull +90 -> 131
    //   44: aload_3
    //   45: aload_2
    //   46: invokevirtual 98	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   49: ifeq +82 -> 131
    //   52: iconst_1
    //   53: istore_1
    //   54: aload_0
    //   55: iload_1
    //   56: invokestatic 104	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   59: putfield 72	com/google/android/gms/analytics/internal/ah:b	Ljava/lang/Boolean;
    //   62: aload_0
    //   63: getfield 72	com/google/android/gms/analytics/internal/ah:b	Ljava/lang/Boolean;
    //   66: ifnull +13 -> 79
    //   69: aload_0
    //   70: getfield 72	com/google/android/gms/analytics/internal/ah:b	Ljava/lang/Boolean;
    //   73: invokevirtual 107	java/lang/Boolean:booleanValue	()Z
    //   76: ifne +19 -> 95
    //   79: ldc 109
    //   81: aload_2
    //   82: invokevirtual 98	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   85: ifeq +10 -> 95
    //   88: aload_0
    //   89: getstatic 112	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   92: putfield 72	com/google/android/gms/analytics/internal/ah:b	Ljava/lang/Boolean;
    //   95: aload_0
    //   96: getfield 72	com/google/android/gms/analytics/internal/ah:b	Ljava/lang/Boolean;
    //   99: ifnonnull +22 -> 121
    //   102: aload_0
    //   103: getstatic 112	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   106: putfield 72	com/google/android/gms/analytics/internal/ah:b	Ljava/lang/Boolean;
    //   109: aload_0
    //   110: getfield 25	com/google/android/gms/analytics/internal/ah:a	Lcom/google/android/gms/analytics/internal/v;
    //   113: invokevirtual 116	com/google/android/gms/analytics/internal/v:f	()Lcom/google/android/gms/analytics/internal/g;
    //   116: ldc 118
    //   118: invokevirtual 124	com/google/android/gms/analytics/internal/g:u	(Ljava/lang/String;)V
    //   121: aload_0
    //   122: monitorexit
    //   123: aload_0
    //   124: getfield 72	com/google/android/gms/analytics/internal/ah:b	Ljava/lang/Boolean;
    //   127: invokevirtual 107	java/lang/Boolean:booleanValue	()Z
    //   130: ireturn
    //   131: iconst_0
    //   132: istore_1
    //   133: goto -79 -> 54
    //   136: astore_2
    //   137: aload_0
    //   138: monitorexit
    //   139: aload_2
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	ah
    //   53	80	1	bool	boolean
    //   30	52	2	str	String
    //   136	4	2	localObject1	Object
    //   26	19	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   9	31	136	finally
    //   35	40	136	finally
    //   44	52	136	finally
    //   54	62	136	finally
    //   62	79	136	finally
    //   79	95	136	finally
    //   95	121	136	finally
    //   121	123	136	finally
    //   137	139	136	finally
  }
  
  public boolean c()
  {
    return ((Boolean)ao.b.a()).booleanValue();
  }
  
  public int d()
  {
    return ((Integer)ao.u.a()).intValue();
  }
  
  public int e()
  {
    return ((Integer)ao.y.a()).intValue();
  }
  
  public int f()
  {
    return ((Integer)ao.z.a()).intValue();
  }
  
  public int g()
  {
    return ((Integer)ao.A.a()).intValue();
  }
  
  public long h()
  {
    return ((Long)ao.j.a()).longValue();
  }
  
  public long i()
  {
    return ((Long)ao.i.a()).longValue();
  }
  
  public long j()
  {
    return ((Long)ao.m.a()).longValue();
  }
  
  public long k()
  {
    return ((Long)ao.n.a()).longValue();
  }
  
  public int l()
  {
    return ((Integer)ao.o.a()).intValue();
  }
  
  public int m()
  {
    return ((Integer)ao.p.a()).intValue();
  }
  
  public long n()
  {
    return ((Integer)ao.C.a()).intValue();
  }
  
  public String o()
  {
    return (String)ao.r.a();
  }
  
  public String p()
  {
    return (String)ao.q.a();
  }
  
  public String q()
  {
    return (String)ao.s.a();
  }
  
  public String r()
  {
    return (String)ao.t.a();
  }
  
  public ac s()
  {
    return ac.a((String)ao.v.a());
  }
  
  public ae t()
  {
    return ae.a((String)ao.w.a());
  }
  
  public Set<Integer> u()
  {
    String str1 = (String)ao.B.a();
    String[] arrayOfString;
    HashSet localHashSet;
    int j;
    int i;
    if ((this.d == null) || (this.c == null) || (!this.c.equals(str1)))
    {
      arrayOfString = TextUtils.split(str1, ",");
      localHashSet = new HashSet();
      j = arrayOfString.length;
      i = 0;
    }
    for (;;)
    {
      String str2;
      if (i < j) {
        str2 = arrayOfString[i];
      }
      try
      {
        localHashSet.add(Integer.valueOf(Integer.parseInt(str2)));
        i += 1;
        continue;
        this.c = str1;
        this.d = localHashSet;
        return this.d;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
    }
  }
  
  public long v()
  {
    return ((Long)ao.K.a()).longValue();
  }
  
  public long w()
  {
    return ((Long)ao.L.a()).longValue();
  }
  
  public long x()
  {
    return ((Long)ao.O.a()).longValue();
  }
  
  public int y()
  {
    return ((Integer)ao.f.a()).intValue();
  }
  
  public int z()
  {
    return ((Integer)ao.h.a()).intValue();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */