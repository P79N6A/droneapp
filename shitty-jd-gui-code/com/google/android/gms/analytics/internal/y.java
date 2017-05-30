package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.analytics.p;
import com.google.android.gms.common.stats.b;
import java.util.Collections;
import java.util.List;

public class y
  extends t
{
  private final a a;
  private d b;
  private final aj c;
  private m d;
  
  protected y(v paramv)
  {
    super(paramv);
    this.d = new m(paramv.d());
    this.a = new a();
    this.c = new aj(paramv)
    {
      public void a()
      {
        y.b(y.this);
      }
    };
  }
  
  private void a(ComponentName paramComponentName)
  {
    m();
    if (this.b != null)
    {
      this.b = null;
      a("Disconnected from device AnalyticsService", paramComponentName);
      h();
    }
  }
  
  private void a(d paramd)
  {
    m();
    this.b = paramd;
    f();
    t().h();
  }
  
  private void f()
  {
    this.d.a();
    this.c.a(q().v());
  }
  
  private void g()
  {
    m();
    if (!b()) {
      return;
    }
    q("Inactivity, disconnecting from device AnalyticsService");
    e();
  }
  
  private void h()
  {
    t().f();
  }
  
  protected void a() {}
  
  public boolean a(c paramc)
  {
    com.google.android.gms.common.internal.d.a(paramc);
    m();
    D();
    d locald = this.b;
    if (locald == null) {
      return false;
    }
    if (paramc.f()) {}
    for (String str = q().o();; str = q().p())
    {
      List localList = Collections.emptyList();
      try
      {
        locald.a(paramc.b(), paramc.d(), str, localList);
        f();
        return true;
      }
      catch (RemoteException paramc)
      {
        q("Failed to send hits to AnalyticsService");
      }
    }
    return false;
  }
  
  public boolean b()
  {
    m();
    D();
    return this.b != null;
  }
  
  public boolean c()
  {
    m();
    D();
    d locald = this.b;
    if (locald == null) {
      return false;
    }
    try
    {
      locald.a();
      f();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      q("Failed to clear hits from AnalyticsService");
    }
    return false;
  }
  
  public boolean d()
  {
    m();
    D();
    if (this.b != null) {
      return true;
    }
    d locald = this.a.a();
    if (locald != null)
    {
      this.b = locald;
      f();
      return true;
    }
    return false;
  }
  
  public void e()
  {
    m();
    D();
    try
    {
      b.a().a(o(), this.a);
      if (this.b != null)
      {
        this.b = null;
        h();
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
  }
  
  protected class a
    implements ServiceConnection
  {
    private volatile d b;
    private volatile boolean c;
    
    protected a() {}
    
    /* Error */
    public d a()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   4: invokevirtual 32	com/google/android/gms/analytics/internal/y:m	()V
      //   7: new 34	android/content/Intent
      //   10: dup
      //   11: ldc 36
      //   13: invokespecial 39	android/content/Intent:<init>	(Ljava/lang/String;)V
      //   16: astore_2
      //   17: aload_2
      //   18: new 41	android/content/ComponentName
      //   21: dup
      //   22: ldc 43
      //   24: ldc 45
      //   26: invokespecial 48	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   29: invokevirtual 52	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
      //   32: pop
      //   33: aload_0
      //   34: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   37: invokevirtual 56	com/google/android/gms/analytics/internal/y:o	()Landroid/content/Context;
      //   40: astore_3
      //   41: aload_2
      //   42: ldc 58
      //   44: aload_3
      //   45: invokevirtual 64	android/content/Context:getPackageName	()Ljava/lang/String;
      //   48: invokevirtual 68	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
      //   51: pop
      //   52: invokestatic 73	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
      //   55: astore 4
      //   57: aload_0
      //   58: monitorenter
      //   59: aload_0
      //   60: aconst_null
      //   61: putfield 75	com/google/android/gms/analytics/internal/y$a:b	Lcom/google/android/gms/analytics/internal/d;
      //   64: aload_0
      //   65: iconst_1
      //   66: putfield 77	com/google/android/gms/analytics/internal/y$a:c	Z
      //   69: aload 4
      //   71: aload_3
      //   72: aload_2
      //   73: aload_0
      //   74: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   77: invokestatic 80	com/google/android/gms/analytics/internal/y:a	(Lcom/google/android/gms/analytics/internal/y;)Lcom/google/android/gms/analytics/internal/y$a;
      //   80: sipush 129
      //   83: invokevirtual 83	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
      //   86: istore_1
      //   87: aload_0
      //   88: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   91: ldc 85
      //   93: iload_1
      //   94: invokestatic 91	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   97: invokevirtual 94	com/google/android/gms/analytics/internal/y:a	(Ljava/lang/String;Ljava/lang/Object;)V
      //   100: iload_1
      //   101: ifne +12 -> 113
      //   104: aload_0
      //   105: iconst_0
      //   106: putfield 77	com/google/android/gms/analytics/internal/y$a:c	Z
      //   109: aload_0
      //   110: monitorexit
      //   111: aconst_null
      //   112: areturn
      //   113: aload_0
      //   114: aload_0
      //   115: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   118: invokevirtual 98	com/google/android/gms/analytics/internal/y:q	()Lcom/google/android/gms/analytics/internal/ah;
      //   121: invokevirtual 104	com/google/android/gms/analytics/internal/ah:w	()J
      //   124: invokevirtual 108	java/lang/Object:wait	(J)V
      //   127: aload_0
      //   128: iconst_0
      //   129: putfield 77	com/google/android/gms/analytics/internal/y$a:c	Z
      //   132: aload_0
      //   133: getfield 75	com/google/android/gms/analytics/internal/y$a:b	Lcom/google/android/gms/analytics/internal/d;
      //   136: astore_2
      //   137: aload_0
      //   138: aconst_null
      //   139: putfield 75	com/google/android/gms/analytics/internal/y$a:b	Lcom/google/android/gms/analytics/internal/d;
      //   142: aload_2
      //   143: ifnonnull +12 -> 155
      //   146: aload_0
      //   147: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   150: ldc 110
      //   152: invokevirtual 113	com/google/android/gms/analytics/internal/y:u	(Ljava/lang/String;)V
      //   155: aload_0
      //   156: monitorexit
      //   157: aload_2
      //   158: areturn
      //   159: astore_2
      //   160: aload_0
      //   161: monitorexit
      //   162: aload_2
      //   163: athrow
      //   164: astore_2
      //   165: aload_0
      //   166: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   169: ldc 115
      //   171: invokevirtual 118	com/google/android/gms/analytics/internal/y:t	(Ljava/lang/String;)V
      //   174: goto -47 -> 127
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	177	0	this	a
      //   86	15	1	bool	boolean
      //   16	142	2	localObject1	Object
      //   159	4	2	localObject2	Object
      //   164	1	2	localInterruptedException	InterruptedException
      //   40	32	3	localContext	android.content.Context
      //   55	15	4	localb	b
      // Exception table:
      //   from	to	target	type
      //   59	100	159	finally
      //   104	111	159	finally
      //   113	127	159	finally
      //   127	142	159	finally
      //   146	155	159	finally
      //   155	157	159	finally
      //   160	162	159	finally
      //   165	174	159	finally
      //   113	127	164	java/lang/InterruptedException
    }
    
    /* Error */
    public void onServiceConnected(final ComponentName paramComponentName, android.os.IBinder paramIBinder)
    {
      // Byte code:
      //   0: ldc 126
      //   2: invokestatic 130	com/google/android/gms/common/internal/d:b	(Ljava/lang/String;)V
      //   5: aload_0
      //   6: monitorenter
      //   7: aload_2
      //   8: ifnonnull +19 -> 27
      //   11: aload_0
      //   12: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   15: ldc -124
      //   17: invokevirtual 113	com/google/android/gms/analytics/internal/y:u	(Ljava/lang/String;)V
      //   20: aload_0
      //   21: invokevirtual 135	java/lang/Object:notifyAll	()V
      //   24: aload_0
      //   25: monitorexit
      //   26: return
      //   27: aconst_null
      //   28: astore 4
      //   30: aconst_null
      //   31: astore_3
      //   32: aload 4
      //   34: astore_1
      //   35: aload_2
      //   36: invokeinterface 140 1 0
      //   41: astore 5
      //   43: aload 4
      //   45: astore_1
      //   46: ldc -114
      //   48: aload 5
      //   50: invokevirtual 148	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   53: ifeq +60 -> 113
      //   56: aload 4
      //   58: astore_1
      //   59: aload_2
      //   60: invokestatic 153	com/google/android/gms/analytics/internal/d$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/analytics/internal/d;
      //   63: astore_2
      //   64: aload_2
      //   65: astore_1
      //   66: aload_0
      //   67: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   70: ldc -101
      //   72: invokevirtual 157	com/google/android/gms/analytics/internal/y:q	(Ljava/lang/String;)V
      //   75: aload_2
      //   76: astore_1
      //   77: aload_1
      //   78: ifnonnull +74 -> 152
      //   81: invokestatic 73	com/google/android/gms/common/stats/b:a	()Lcom/google/android/gms/common/stats/b;
      //   84: aload_0
      //   85: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   88: invokevirtual 56	com/google/android/gms/analytics/internal/y:o	()Landroid/content/Context;
      //   91: aload_0
      //   92: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   95: invokestatic 80	com/google/android/gms/analytics/internal/y:a	(Lcom/google/android/gms/analytics/internal/y;)Lcom/google/android/gms/analytics/internal/y$a;
      //   98: invokevirtual 160	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
      //   101: aload_0
      //   102: invokevirtual 135	java/lang/Object:notifyAll	()V
      //   105: aload_0
      //   106: monitorexit
      //   107: return
      //   108: astore_1
      //   109: aload_0
      //   110: monitorexit
      //   111: aload_1
      //   112: athrow
      //   113: aload 4
      //   115: astore_1
      //   116: aload_0
      //   117: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   120: ldc -94
      //   122: aload 5
      //   124: invokevirtual 165	com/google/android/gms/analytics/internal/y:e	(Ljava/lang/String;Ljava/lang/Object;)V
      //   127: aload_3
      //   128: astore_1
      //   129: goto -52 -> 77
      //   132: astore_2
      //   133: aload_0
      //   134: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   137: ldc -89
      //   139: invokevirtual 113	com/google/android/gms/analytics/internal/y:u	(Ljava/lang/String;)V
      //   142: goto -65 -> 77
      //   145: astore_1
      //   146: aload_0
      //   147: invokevirtual 135	java/lang/Object:notifyAll	()V
      //   150: aload_1
      //   151: athrow
      //   152: aload_0
      //   153: getfield 77	com/google/android/gms/analytics/internal/y$a:c	Z
      //   156: ifne +34 -> 190
      //   159: aload_0
      //   160: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   163: ldc -87
      //   165: invokevirtual 118	com/google/android/gms/analytics/internal/y:t	(Ljava/lang/String;)V
      //   168: aload_0
      //   169: getfield 22	com/google/android/gms/analytics/internal/y$a:a	Lcom/google/android/gms/analytics/internal/y;
      //   172: invokevirtual 173	com/google/android/gms/analytics/internal/y:r	()Lcom/google/android/gms/analytics/p;
      //   175: new 11	com/google/android/gms/analytics/internal/y$a$1
      //   178: dup
      //   179: aload_0
      //   180: aload_1
      //   181: invokespecial 176	com/google/android/gms/analytics/internal/y$a$1:<init>	(Lcom/google/android/gms/analytics/internal/y$a;Lcom/google/android/gms/analytics/internal/d;)V
      //   184: invokevirtual 181	com/google/android/gms/analytics/p:a	(Ljava/lang/Runnable;)V
      //   187: goto -86 -> 101
      //   190: aload_0
      //   191: aload_1
      //   192: putfield 75	com/google/android/gms/analytics/internal/y$a:b	Lcom/google/android/gms/analytics/internal/d;
      //   195: goto -94 -> 101
      //   198: astore_1
      //   199: goto -98 -> 101
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	202	0	this	a
      //   0	202	1	paramComponentName	ComponentName
      //   0	202	2	paramIBinder	android.os.IBinder
      //   31	97	3	localObject1	Object
      //   28	86	4	localObject2	Object
      //   41	82	5	str	String
      // Exception table:
      //   from	to	target	type
      //   20	26	108	finally
      //   101	107	108	finally
      //   109	111	108	finally
      //   146	152	108	finally
      //   35	43	132	android/os/RemoteException
      //   46	56	132	android/os/RemoteException
      //   59	64	132	android/os/RemoteException
      //   66	75	132	android/os/RemoteException
      //   116	127	132	android/os/RemoteException
      //   11	20	145	finally
      //   35	43	145	finally
      //   46	56	145	finally
      //   59	64	145	finally
      //   66	75	145	finally
      //   81	101	145	finally
      //   116	127	145	finally
      //   133	142	145	finally
      //   152	187	145	finally
      //   190	195	145	finally
      //   81	101	198	java/lang/IllegalArgumentException
    }
    
    public void onServiceDisconnected(final ComponentName paramComponentName)
    {
      com.google.android.gms.common.internal.d.b("AnalyticsServiceConnection.onServiceDisconnected");
      y.this.r().a(new Runnable()
      {
        public void run()
        {
          y.a(y.this, paramComponentName);
        }
      });
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */