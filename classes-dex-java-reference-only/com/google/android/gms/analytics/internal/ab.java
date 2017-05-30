package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adp;
import com.google.android.gms.internal.ads;
import com.google.android.gms.internal.adx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ab
  extends t
{
  private boolean a;
  private final z b;
  private final i c;
  private final h d;
  private final y e;
  private long f;
  private final aj g;
  private final aj h;
  private final m i;
  private long j;
  private boolean k;
  
  protected ab(v paramv, w paramw)
  {
    super(paramv);
    d.a(paramw);
    this.f = Long.MIN_VALUE;
    this.d = paramw.k(paramv);
    this.b = paramw.m(paramv);
    this.c = paramw.n(paramv);
    this.e = paramw.o(paramv);
    this.i = new m(n());
    this.g = new aj(paramv)
    {
      public void a()
      {
        ab.a(ab.this);
      }
    };
    this.h = new aj(paramv)
    {
      public void a()
      {
        ab.b(ab.this);
      }
    };
  }
  
  private void K()
  {
    m();
    Context localContext = k().b();
    if (!k.a(localContext)) {
      t("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
    }
    do
    {
      while (!CampaignTrackingReceiver.a(localContext))
      {
        t("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        return;
        if (!l.a(localContext)) {
          u("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
      }
    } while (CampaignTrackingService.a(localContext));
    t("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
  }
  
  private void L()
  {
    a(new am()
    {
      public void a(Throwable paramAnonymousThrowable)
      {
        ab.this.H();
      }
    });
  }
  
  private void M()
  {
    try
    {
      this.b.i();
      H();
      this.h.a(q().C());
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        d("Failed to delete stale hits", localSQLiteException);
      }
    }
  }
  
  private boolean N()
  {
    if (this.k) {}
    while (((q().a()) && (!q().b())) || (I() <= 0L)) {
      return false;
    }
    return true;
  }
  
  private void O()
  {
    al localal = u();
    if (!localal.b()) {}
    long l;
    do
    {
      do
      {
        return;
      } while (localal.c());
      l = G();
    } while ((l == 0L) || (Math.abs(n().a() - l) > q().k()));
    a("Dispatch alarm scheduled (ms)", Long.valueOf(q().j()));
    localal.d();
  }
  
  private void P()
  {
    O();
    long l2 = I();
    long l1 = w().d();
    if (l1 != 0L)
    {
      l1 = l2 - Math.abs(n().a() - l1);
      if (l1 <= 0L) {}
    }
    for (;;)
    {
      a("Dispatch scheduled (ms)", Long.valueOf(l1));
      if (!this.g.c()) {
        break;
      }
      l1 = Math.max(1L, l1 + this.g.b());
      this.g.b(l1);
      return;
      l1 = Math.min(q().h(), l2);
      continue;
      l1 = Math.min(q().h(), l2);
    }
    this.g.a(l1);
  }
  
  private void Q()
  {
    R();
    S();
  }
  
  private void R()
  {
    if (this.g.c()) {
      q("All hits dispatched or no network/service. Going to power save mode");
    }
    this.g.d();
  }
  
  private void S()
  {
    al localal = u();
    if (localal.c()) {
      localal.e();
    }
  }
  
  private void a(x paramx, adp paramadp)
  {
    d.a(paramx);
    d.a(paramadp);
    Object localObject1 = new com.google.android.gms.analytics.h(k());
    ((com.google.android.gms.analytics.h)localObject1).b(paramx.c());
    ((com.google.android.gms.analytics.h)localObject1).c(paramx.d());
    localObject1 = ((com.google.android.gms.analytics.h)localObject1).l();
    adx localadx = (adx)((com.google.android.gms.analytics.l)localObject1).b(adx.class);
    localadx.a("data");
    localadx.b(true);
    ((com.google.android.gms.analytics.l)localObject1).a(paramadp);
    ads localads = (ads)((com.google.android.gms.analytics.l)localObject1).b(ads.class);
    ado localado = (ado)((com.google.android.gms.analytics.l)localObject1).b(ado.class);
    Iterator localIterator = paramx.f().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (String)((Map.Entry)localObject2).getValue();
      if ("an".equals(str)) {
        localado.a((String)localObject2);
      } else if ("av".equals(str)) {
        localado.b((String)localObject2);
      } else if ("aid".equals(str)) {
        localado.c((String)localObject2);
      } else if ("aiid".equals(str)) {
        localado.d((String)localObject2);
      } else if ("uid".equals(str)) {
        localadx.c((String)localObject2);
      } else {
        localads.a(str, (String)localObject2);
      }
    }
    b("Sending installation campaign to", paramx.c(), paramadp);
    ((com.google.android.gms.analytics.l)localObject1).a(w().b());
    ((com.google.android.gms.analytics.l)localObject1).e();
  }
  
  private boolean b(String paramString)
  {
    return o().checkCallingOrSelfPermission(paramString) == 0;
  }
  
  public void F()
  {
    com.google.android.gms.analytics.p.d();
    D();
    r("Sync dispatching local hits");
    long l = this.j;
    if (!q().a()) {
      g();
    }
    try
    {
      while (j()) {}
      w().e();
      H();
      if (this.j != l) {
        this.d.c();
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      e("Sync local dispatch failed", localThrowable);
      H();
    }
  }
  
  public long G()
  {
    com.google.android.gms.analytics.p.d();
    D();
    try
    {
      long l = this.b.j();
      return l;
    }
    catch (SQLiteException localSQLiteException)
    {
      e("Failed to get min/max hit times from local store", localSQLiteException);
    }
    return 0L;
  }
  
  public void H()
  {
    k().s();
    D();
    if (!N())
    {
      this.d.b();
      Q();
      return;
    }
    if (this.b.h())
    {
      this.d.b();
      Q();
      return;
    }
    if (!((Boolean)ao.J.a()).booleanValue()) {
      this.d.a();
    }
    for (boolean bool = this.d.e(); bool; bool = true)
    {
      P();
      return;
    }
    Q();
    O();
  }
  
  public long I()
  {
    long l;
    if (this.f != Long.MIN_VALUE) {
      l = this.f;
    }
    do
    {
      return l;
      l = q().i();
    } while (!v().f());
    return v().g() * 1000L;
  }
  
  public void J()
  {
    D();
    m();
    this.k = true;
    this.e.e();
    H();
  }
  
  /* Error */
  public long a(x paramx, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 43	com/google/android/gms/common/internal/d:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 388	com/google/android/gms/analytics/internal/ab:D	()V
    //   9: aload_0
    //   10: invokevirtual 95	com/google/android/gms/analytics/internal/ab:m	()V
    //   13: aload_0
    //   14: getfield 60	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/z;
    //   17: invokevirtual 461	com/google/android/gms/analytics/internal/z:b	()V
    //   20: aload_0
    //   21: getfield 60	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/z;
    //   24: aload_1
    //   25: invokevirtual 462	com/google/android/gms/analytics/internal/x:a	()J
    //   28: aload_1
    //   29: invokevirtual 464	com/google/android/gms/analytics/internal/x:b	()Ljava/lang/String;
    //   32: invokevirtual 467	com/google/android/gms/analytics/internal/z:a	(JLjava/lang/String;)V
    //   35: aload_0
    //   36: getfield 60	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/z;
    //   39: aload_1
    //   40: invokevirtual 462	com/google/android/gms/analytics/internal/x:a	()J
    //   43: aload_1
    //   44: invokevirtual 464	com/google/android/gms/analytics/internal/x:b	()Ljava/lang/String;
    //   47: aload_1
    //   48: invokevirtual 271	com/google/android/gms/analytics/internal/x:c	()Ljava/lang/String;
    //   51: invokevirtual 470	com/google/android/gms/analytics/internal/z:a	(JLjava/lang/String;Ljava/lang/String;)J
    //   54: lstore_3
    //   55: iload_2
    //   56: ifne +32 -> 88
    //   59: aload_1
    //   60: lload_3
    //   61: invokevirtual 471	com/google/android/gms/analytics/internal/x:a	(J)V
    //   64: aload_0
    //   65: getfield 60	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/z;
    //   68: aload_1
    //   69: invokevirtual 474	com/google/android/gms/analytics/internal/z:a	(Lcom/google/android/gms/analytics/internal/x;)V
    //   72: aload_0
    //   73: getfield 60	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/z;
    //   76: invokevirtual 475	com/google/android/gms/analytics/internal/z:c	()V
    //   79: aload_0
    //   80: getfield 60	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/z;
    //   83: invokevirtual 476	com/google/android/gms/analytics/internal/z:d	()V
    //   86: lload_3
    //   87: lreturn
    //   88: aload_1
    //   89: lconst_1
    //   90: lload_3
    //   91: ladd
    //   92: invokevirtual 471	com/google/android/gms/analytics/internal/x:a	(J)V
    //   95: goto -31 -> 64
    //   98: astore_1
    //   99: aload_0
    //   100: ldc_w 478
    //   103: aload_1
    //   104: invokevirtual 408	com/google/android/gms/analytics/internal/ab:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   107: aload_0
    //   108: getfield 60	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/z;
    //   111: invokevirtual 476	com/google/android/gms/analytics/internal/z:d	()V
    //   114: ldc2_w 479
    //   117: lreturn
    //   118: astore_1
    //   119: aload_0
    //   120: ldc_w 482
    //   123: aload_1
    //   124: invokevirtual 408	com/google/android/gms/analytics/internal/ab:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   127: lload_3
    //   128: lreturn
    //   129: astore_1
    //   130: aload_0
    //   131: ldc_w 482
    //   134: aload_1
    //   135: invokevirtual 408	com/google/android/gms/analytics/internal/ab:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   138: goto -24 -> 114
    //   141: astore_1
    //   142: aload_0
    //   143: getfield 60	com/google/android/gms/analytics/internal/ab:b	Lcom/google/android/gms/analytics/internal/z;
    //   146: invokevirtual 476	com/google/android/gms/analytics/internal/z:d	()V
    //   149: aload_1
    //   150: athrow
    //   151: astore 5
    //   153: aload_0
    //   154: ldc_w 482
    //   157: aload 5
    //   159: invokevirtual 408	com/google/android/gms/analytics/internal/ab:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   162: goto -13 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	ab
    //   0	165	1	paramx	x
    //   0	165	2	paramBoolean	boolean
    //   54	74	3	l	long
    //   151	7	5	localSQLiteException	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   13	55	98	android/database/sqlite/SQLiteException
    //   59	64	98	android/database/sqlite/SQLiteException
    //   64	79	98	android/database/sqlite/SQLiteException
    //   88	95	98	android/database/sqlite/SQLiteException
    //   79	86	118	android/database/sqlite/SQLiteException
    //   107	114	129	android/database/sqlite/SQLiteException
    //   13	55	141	finally
    //   59	64	141	finally
    //   64	79	141	finally
    //   88	95	141	finally
    //   99	107	141	finally
    //   142	149	151	android/database/sqlite/SQLiteException
  }
  
  protected void a()
  {
    this.b.E();
    this.c.E();
    this.e.E();
  }
  
  public void a(long paramLong)
  {
    com.google.android.gms.analytics.p.d();
    D();
    long l = paramLong;
    if (paramLong < 0L) {
      l = 0L;
    }
    this.f = l;
    H();
  }
  
  public void a(am paramam)
  {
    a(paramam, this.j);
  }
  
  public void a(final am paramam, final long paramLong)
  {
    com.google.android.gms.analytics.p.d();
    D();
    long l1 = -1L;
    long l2 = w().d();
    if (l2 != 0L) {
      l1 = Math.abs(n().a() - l2);
    }
    b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(l1));
    if (!q().a()) {
      g();
    }
    try
    {
      if (j())
      {
        r().a(new Runnable()
        {
          public void run()
          {
            ab.this.a(paramam, paramLong);
          }
        });
        return;
      }
      w().e();
      H();
      if (paramam != null) {
        paramam.a(null);
      }
      if (this.j != paramLong)
      {
        this.d.c();
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      e("Local dispatch failed", localThrowable);
      w().e();
      H();
      if (paramam != null) {
        paramam.a(localThrowable);
      }
    }
  }
  
  public void a(c paramc)
  {
    d.a(paramc);
    com.google.android.gms.analytics.p.d();
    D();
    if (this.k) {
      r("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
    }
    for (;;)
    {
      paramc = b(paramc);
      g();
      if (!this.e.a(paramc)) {
        break;
      }
      r("Hit sent to the device AnalyticsService for delivery");
      return;
      a("Delivering hit", paramc);
    }
    if (q().a())
    {
      p().a(paramc, "Service unavailable on package side");
      return;
    }
    try
    {
      this.b.a(paramc);
      H();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      e("Delivery failed to save hit to a database", localSQLiteException);
      p().a(paramc, "deliver: failed to insert hit to database");
    }
  }
  
  protected void a(x paramx)
  {
    m();
    b("Sending first hit to property", paramx.c());
    if (w().c().a(q().F())) {}
    do
    {
      return;
      localObject = w().f();
    } while (TextUtils.isEmpty((CharSequence)localObject));
    Object localObject = p.a(p(), (String)localObject);
    b("Found relevant installation campaign", localObject);
    a(paramx, (adp)localObject);
  }
  
  public void a(String paramString)
  {
    d.a(paramString);
    m();
    l();
    adp localadp = p.a(p(), paramString);
    if (localadp == null) {
      d("Parsing failed. Ignoring invalid campaign data", paramString);
    }
    for (;;)
    {
      return;
      String str = w().f();
      if (paramString.equals(str))
      {
        t("Ignoring duplicate install campaign");
        return;
      }
      if (!TextUtils.isEmpty(str))
      {
        d("Ignoring multiple install campaigns. original, new", str, paramString);
        return;
      }
      w().a(paramString);
      if (w().c().a(q().F()))
      {
        d("Campaign received too late, ignoring", localadp);
        return;
      }
      b("Received installation campaign", localadp);
      paramString = this.b.d(0L).iterator();
      while (paramString.hasNext()) {
        a((x)paramString.next(), localadp);
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    H();
  }
  
  c b(c paramc)
  {
    if (!TextUtils.isEmpty(paramc.h())) {}
    do
    {
      return paramc;
      localObject2 = w().g().a();
    } while (localObject2 == null);
    Object localObject1 = (Long)((Pair)localObject2).second;
    Object localObject2 = (String)((Pair)localObject2).first;
    localObject1 = String.valueOf(localObject1);
    localObject1 = String.valueOf(localObject1).length() + 1 + String.valueOf(localObject2).length() + (String)localObject1 + ":" + (String)localObject2;
    localObject2 = new HashMap(paramc.b());
    ((Map)localObject2).put("_m", localObject1);
    return c.a(this, paramc, (Map)localObject2);
  }
  
  void b()
  {
    D();
    if (!this.a) {}
    for (boolean bool = true;; bool = false)
    {
      d.a(bool, "Analytics backend already started");
      this.a = true;
      r().a(new Runnable()
      {
        public void run()
        {
          ab.this.c();
        }
      });
      return;
    }
  }
  
  protected void c()
  {
    D();
    if (!q().a()) {
      K();
    }
    w().b();
    if (!b("android.permission.ACCESS_NETWORK_STATE"))
    {
      u("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      J();
    }
    if (!b("android.permission.INTERNET"))
    {
      u("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      J();
    }
    if (l.a(o())) {
      q("AnalyticsService registered in the app manifest and enabled");
    }
    for (;;)
    {
      if ((!this.k) && (!q().a()) && (!this.b.h())) {
        g();
      }
      H();
      return;
      if (q().a()) {
        u("Device AnalyticsService not registered! Hits will not be delivered reliably.");
      } else {
        t("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
  
  void d()
  {
    m();
    this.j = n().a();
  }
  
  protected void e()
  {
    m();
    if (!q().a()) {
      i();
    }
  }
  
  public void f()
  {
    com.google.android.gms.analytics.p.d();
    D();
    q("Service disconnected");
  }
  
  protected void g()
  {
    if (this.k) {}
    do
    {
      long l;
      do
      {
        do
        {
          return;
        } while ((!q().c()) || (this.e.b()));
        l = q().x();
      } while (!this.i.a(l));
      this.i.a();
      q("Connecting to service");
    } while (!this.e.d());
    q("Connected to service");
    this.i.b();
    e();
  }
  
  public void h()
  {
    com.google.android.gms.analytics.p.d();
    D();
    if (!q().a()) {
      q("Delete all hits from local store");
    }
    try
    {
      this.b.e();
      this.b.f();
      H();
      g();
      if (this.e.c()) {
        q("Device service unavailable. Can't clear hits stored on the device service.");
      }
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        d("Failed to delete hits from store", localSQLiteException);
      }
    }
  }
  
  public void i()
  {
    com.google.android.gms.analytics.p.d();
    D();
    l();
    if (!q().c()) {
      t("Service client disabled. Can't dispatch local hits to device AnalyticsService");
    }
    if (!this.e.b()) {
      q("Service not connected");
    }
    while (this.b.h()) {
      return;
    }
    q("Dispatching local hits to device AnalyticsService");
    for (;;)
    {
      try
      {
        List localList = this.b.b(q().l());
        if (!localList.isEmpty()) {
          break label126;
        }
        H();
        return;
      }
      catch (SQLiteException localSQLiteException1)
      {
        e("Failed to read hits from store", localSQLiteException1);
        Q();
        return;
      }
      label107:
      Object localObject;
      localSQLiteException1.remove(localObject);
      try
      {
        this.b.c(((c)localObject).c());
        label126:
        if (!localSQLiteException1.isEmpty())
        {
          localObject = (c)localSQLiteException1.get(0);
          if (this.e.a((c)localObject)) {
            break label107;
          }
          H();
          return;
        }
      }
      catch (SQLiteException localSQLiteException2)
      {
        e("Failed to remove hit that was send for delivery", localSQLiteException2);
        Q();
      }
    }
  }
  
  protected boolean j()
  {
    int n = 1;
    com.google.android.gms.analytics.p.d();
    D();
    q("Dispatching a batch of local hits");
    int m;
    if ((!this.e.b()) && (!q().a()))
    {
      m = 1;
      if (this.c.b()) {
        break label70;
      }
    }
    for (;;)
    {
      if ((m == 0) || (n == 0)) {
        break label75;
      }
      q("No network or service available. Will retry later");
      return false;
      m = 0;
      break;
      label70:
      n = 0;
    }
    label75:
    long l3 = Math.max(q().l(), q().m());
    ArrayList localArrayList = new ArrayList();
    l1 = 0L;
    for (;;)
    {
      try
      {
        this.b.b();
        localArrayList.clear();
        try
        {
          localList = this.b.b(l3);
          if (localList.isEmpty())
          {
            q("Store is empty, nothing to dispatch");
            Q();
            try
            {
              this.b.c();
              this.b.d();
              return false;
            }
            catch (SQLiteException localSQLiteException1)
            {
              e("Failed to commit local dispatch transaction", localSQLiteException1);
              Q();
              return false;
            }
          }
          a("Hits loaded from store. count", Integer.valueOf(localList.size()));
          localObject2 = localList.iterator();
          if (((Iterator)localObject2).hasNext())
          {
            if (((c)((Iterator)localObject2).next()).c() != l1) {
              continue;
            }
            d("Database contains successfully uploaded hit", Long.valueOf(l1), Integer.valueOf(localList.size()));
            Q();
            try
            {
              this.b.c();
              this.b.d();
              return false;
            }
            catch (SQLiteException localSQLiteException2)
            {
              e("Failed to commit local dispatch transaction", localSQLiteException2);
              Q();
              return false;
            }
          }
          l2 = l1;
        }
        catch (SQLiteException localSQLiteException3)
        {
          d("Failed to read hits from persisted store", localSQLiteException3);
          Q();
          try
          {
            this.b.c();
            this.b.d();
            return false;
          }
          catch (SQLiteException localSQLiteException4)
          {
            e("Failed to commit local dispatch transaction", localSQLiteException4);
            Q();
            return false;
          }
          l2 = l1;
          if (!this.e.b()) {
            continue;
          }
        }
        if (q().a()) {
          continue;
        }
        q("Service connected, sending hits to the service");
        l2 = l1;
        if (localList.isEmpty()) {
          continue;
        }
        localObject2 = (c)localList.get(0);
        if (this.e.a((c)localObject2)) {
          continue;
        }
      }
      finally
      {
        long l2;
        try
        {
          List localList;
          Object localObject2;
          this.b.c();
          this.b.d();
          throw ((Throwable)localObject1);
        }
        catch (SQLiteException localSQLiteException11)
        {
          e("Failed to commit local dispatch transaction", localSQLiteException11);
          Q();
          return false;
        }
        l1 = l2;
        continue;
      }
      l2 = l1;
      if (this.c.b())
      {
        localList = this.c.a(localList);
        localObject2 = localList.iterator();
        if (((Iterator)localObject2).hasNext())
        {
          l1 = Math.max(l1, ((Long)((Iterator)localObject2).next()).longValue());
          continue;
          l1 = Math.max(l1, ((c)localObject2).c());
          localList.remove(localObject2);
          b("Hit sent do device AnalyticsService for delivery", localObject2);
          try
          {
            this.b.c(((c)localObject2).c());
            localSQLiteException4.add(Long.valueOf(((c)localObject2).c()));
          }
          catch (SQLiteException localSQLiteException5)
          {
            e("Failed to remove hit that was send for delivery", localSQLiteException5);
            Q();
            try
            {
              this.b.c();
              this.b.d();
              return false;
            }
            catch (SQLiteException localSQLiteException6)
            {
              e("Failed to commit local dispatch transaction", localSQLiteException6);
              Q();
              return false;
            }
          }
        }
      }
      try
      {
        this.b.a(localList);
        localSQLiteException6.addAll(localList);
        l2 = l1;
        boolean bool = localSQLiteException6.isEmpty();
        if (bool) {
          try
          {
            this.b.c();
            this.b.d();
            return false;
          }
          catch (SQLiteException localSQLiteException7)
          {
            e("Failed to commit local dispatch transaction", localSQLiteException7);
            Q();
            return false;
          }
        }
      }
      catch (SQLiteException localSQLiteException8)
      {
        e("Failed to remove successfully uploaded hits", localSQLiteException8);
        Q();
        try
        {
          this.b.c();
          this.b.d();
          return false;
        }
        catch (SQLiteException localSQLiteException9)
        {
          e("Failed to commit local dispatch transaction", localSQLiteException9);
          Q();
          return false;
        }
        try
        {
          this.b.c();
          this.b.d();
          l1 = l2;
        }
        catch (SQLiteException localSQLiteException10)
        {
          e("Failed to commit local dispatch transaction", localSQLiteException10);
          Q();
          return false;
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */