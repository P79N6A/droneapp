package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.ad;
import com.google.android.gms.analytics.internal.ak;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.analytics.internal.u;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.x;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class g
  extends t
{
  private boolean a;
  private final Map<String, String> b = new HashMap();
  private final Map<String, String> c = new HashMap();
  private final com.google.android.gms.analytics.internal.e d;
  private final a e;
  private b f;
  private o g;
  
  g(v paramv, String paramString, com.google.android.gms.analytics.internal.e parame)
  {
    super(paramv);
    if (paramString != null) {
      this.b.put("&tid", paramString);
    }
    this.b.put("useSecure", "1");
    this.b.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
    if (parame == null) {}
    for (this.d = new com.google.android.gms.analytics.internal.e("tracking", n());; this.d = parame)
    {
      this.e = new a(paramv);
      return;
    }
  }
  
  static String a(Activity paramActivity)
  {
    d.a(paramActivity);
    paramActivity = paramActivity.getIntent();
    if (paramActivity == null) {}
    do
    {
      return null;
      paramActivity = paramActivity.getStringExtra("android.intent.extra.REFERRER_NAME");
    } while (TextUtils.isEmpty(paramActivity));
    return paramActivity;
  }
  
  private static void a(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    d.a(paramMap2);
    if (paramMap1 == null) {}
    for (;;)
    {
      return;
      paramMap1 = paramMap1.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap1.next();
        String str = b(localEntry);
        if (str != null) {
          paramMap2.put(str, (String)localEntry.getValue());
        }
      }
    }
  }
  
  private static boolean a(Map.Entry<String, String> paramEntry)
  {
    String str = (String)paramEntry.getKey();
    paramEntry = (String)paramEntry.getValue();
    return (str.startsWith("&")) && (str.length() >= 2);
  }
  
  private static String b(Map.Entry<String, String> paramEntry)
  {
    if (!a(paramEntry)) {
      return null;
    }
    return ((String)paramEntry.getKey()).substring(1);
  }
  
  private static void b(Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    d.a(paramMap2);
    if (paramMap1 == null) {}
    for (;;)
    {
      return;
      paramMap1 = paramMap1.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap1.next();
        String str = b(localEntry);
        if ((str != null) && (!paramMap2.containsKey(str))) {
          paramMap2.put(str, (String)localEntry.getValue());
        }
      }
    }
  }
  
  private boolean c()
  {
    return this.f != null;
  }
  
  public String a(String paramString)
  {
    D();
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return null;
      if (this.b.containsKey(paramString)) {
        return (String)this.b.get(paramString);
      }
      if (paramString.equals("&ul")) {
        return com.google.android.gms.analytics.internal.p.a(Locale.getDefault());
      }
      if (paramString.equals("&cid")) {
        return x().b();
      }
      if (paramString.equals("&sr")) {
        return A().c();
      }
      if (paramString.equals("&aid")) {
        return z().c().c();
      }
      if (paramString.equals("&an")) {
        return z().c().a();
      }
      if (paramString.equals("&av")) {
        return z().c().b();
      }
    } while (!paramString.equals("&aiid"));
    return z().c().d();
  }
  
  protected void a()
  {
    this.e.E();
    String str = v().c();
    if (str != null) {
      a("&an", str);
    }
    str = v().b();
    if (str != null) {
      a("&av", str);
    }
  }
  
  public void a(double paramDouble)
  {
    a("&sf", Double.toString(paramDouble));
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) && (paramInt2 < 0))
    {
      t("Invalid width or height. The values should be non-negative.");
      return;
    }
    a("&sr", 23 + paramInt1 + "x" + paramInt2);
  }
  
  public void a(long paramLong)
  {
    this.e.a(1000L * paramLong);
  }
  
  public void a(Uri paramUri)
  {
    if ((paramUri == null) || (paramUri.isOpaque())) {}
    do
    {
      return;
      paramUri = paramUri.getQueryParameter("referrer");
    } while (TextUtils.isEmpty(paramUri));
    paramUri = String.valueOf(paramUri);
    if (paramUri.length() != 0) {}
    for (paramUri = "http://hostname/?".concat(paramUri);; paramUri = new String("http://hostname/?"))
    {
      paramUri = Uri.parse(paramUri);
      String str = paramUri.getQueryParameter("utm_id");
      if (str != null) {
        this.c.put("&ci", str);
      }
      str = paramUri.getQueryParameter("anid");
      if (str != null) {
        this.c.put("&anid", str);
      }
      str = paramUri.getQueryParameter("utm_campaign");
      if (str != null) {
        this.c.put("&cn", str);
      }
      str = paramUri.getQueryParameter("utm_content");
      if (str != null) {
        this.c.put("&cc", str);
      }
      str = paramUri.getQueryParameter("utm_medium");
      if (str != null) {
        this.c.put("&cm", str);
      }
      str = paramUri.getQueryParameter("utm_source");
      if (str != null) {
        this.c.put("&cs", str);
      }
      str = paramUri.getQueryParameter("utm_term");
      if (str != null) {
        this.c.put("&ck", str);
      }
      str = paramUri.getQueryParameter("dclid");
      if (str != null) {
        this.c.put("&dclid", str);
      }
      str = paramUri.getQueryParameter("gclid");
      if (str != null) {
        this.c.put("&gclid", str);
      }
      paramUri = paramUri.getQueryParameter("aclid");
      if (paramUri == null) {
        break;
      }
      this.c.put("&aclid", paramUri);
      return;
    }
  }
  
  void a(o paramo)
  {
    q("Loading Tracker config values");
    this.g = paramo;
    if (this.g.a())
    {
      paramo = this.g.b();
      a("&tid", paramo);
      a("trackingId loaded", paramo);
    }
    if (this.g.c())
    {
      paramo = Double.toString(this.g.d());
      a("&sf", paramo);
      a("Sample frequency loaded", paramo);
    }
    if (this.g.e())
    {
      int i = this.g.f();
      a(i);
      a("Session timeout loaded", Integer.valueOf(i));
    }
    boolean bool;
    if (this.g.g())
    {
      bool = this.g.h();
      b(bool);
      a("Auto activity tracking loaded", Boolean.valueOf(bool));
    }
    if (this.g.i())
    {
      bool = this.g.j();
      if (bool) {
        a("&aip", "1");
      }
      a("Anonymize ip loaded", Boolean.valueOf(bool));
    }
    a(this.g.k());
  }
  
  public void a(String paramString1, String paramString2)
  {
    d.a(paramString1, "Key should be non-null");
    if (TextUtils.isEmpty(paramString1)) {
      return;
    }
    this.b.put(paramString1, paramString2);
  }
  
  public void a(final Map<String, String> paramMap)
  {
    final long l = n().a();
    if (s().f())
    {
      r("AppOptOut is set to true. Not sending Google Analytics hit");
      return;
    }
    boolean bool1 = s().e();
    final HashMap localHashMap = new HashMap();
    a(this.b, localHashMap);
    a(paramMap, localHashMap);
    final boolean bool2 = com.google.android.gms.analytics.internal.p.a((String)this.b.get("useSecure"), true);
    b(this.c, localHashMap);
    this.c.clear();
    paramMap = (String)localHashMap.get("t");
    if (TextUtils.isEmpty(paramMap))
    {
      p().a(localHashMap, "Missing hit type parameter");
      return;
    }
    final String str = (String)localHashMap.get("tid");
    if (TextUtils.isEmpty(str))
    {
      p().a(localHashMap, "Missing tracking id parameter");
      return;
    }
    final boolean bool3 = b();
    try
    {
      if (("screenview".equalsIgnoreCase(paramMap)) || ("pageview".equalsIgnoreCase(paramMap)) || ("appview".equalsIgnoreCase(paramMap)) || (TextUtils.isEmpty(paramMap)))
      {
        int j = Integer.parseInt((String)this.b.get("&a")) + 1;
        int i = j;
        if (j >= Integer.MAX_VALUE) {
          i = 1;
        }
        this.b.put("&a", Integer.toString(i));
      }
      r().a(new Runnable()
      {
        public void run()
        {
          boolean bool = true;
          if (g.a(g.this).b()) {
            localHashMap.put("sc", "start");
          }
          com.google.android.gms.analytics.internal.p.b(localHashMap, "cid", g.this.s().h());
          Object localObject = (String)localHashMap.get("sf");
          if (localObject != null)
          {
            double d1 = com.google.android.gms.analytics.internal.p.a((String)localObject, 100.0D);
            if (com.google.android.gms.analytics.internal.p.a(d1, (String)localHashMap.get("cid")))
            {
              g.this.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
              return;
            }
          }
          localObject = g.b(g.this);
          if (bool3)
          {
            com.google.android.gms.analytics.internal.p.a(localHashMap, "ate", ((a)localObject).b());
            com.google.android.gms.analytics.internal.p.a(localHashMap, "adid", ((a)localObject).c());
            localObject = g.c(g.this).c();
            com.google.android.gms.analytics.internal.p.a(localHashMap, "an", ((ado)localObject).a());
            com.google.android.gms.analytics.internal.p.a(localHashMap, "av", ((ado)localObject).b());
            com.google.android.gms.analytics.internal.p.a(localHashMap, "aid", ((ado)localObject).c());
            com.google.android.gms.analytics.internal.p.a(localHashMap, "aiid", ((ado)localObject).d());
            localHashMap.put("v", "1");
            localHashMap.put("_v", u.b);
            com.google.android.gms.analytics.internal.p.a(localHashMap, "ul", g.d(g.this).b().f());
            com.google.android.gms.analytics.internal.p.a(localHashMap, "sr", g.e(g.this).c());
            if ((!paramMap.equals("transaction")) && (!paramMap.equals("item"))) {
              break label383;
            }
          }
          label383:
          for (int i = 1;; i = 0)
          {
            if ((i != 0) || (g.f(g.this).a())) {
              break label388;
            }
            g.g(g.this).a(localHashMap, "Too many hits sent too quickly, rate limiting invoked");
            return;
            localHashMap.remove("ate");
            localHashMap.remove("adid");
            break;
          }
          label388:
          long l2 = com.google.android.gms.analytics.internal.p.b((String)localHashMap.get("ht"));
          long l1 = l2;
          if (l2 == 0L) {
            l1 = l;
          }
          if (bool2)
          {
            localObject = new com.google.android.gms.analytics.internal.c(g.this, localHashMap, l1, str);
            g.h(g.this).c("Dry run enabled. Would have sent hit", localObject);
            return;
          }
          localObject = (String)localHashMap.get("cid");
          HashMap localHashMap = new HashMap();
          com.google.android.gms.analytics.internal.p.a(localHashMap, "uid", localHashMap);
          com.google.android.gms.analytics.internal.p.a(localHashMap, "an", localHashMap);
          com.google.android.gms.analytics.internal.p.a(localHashMap, "aid", localHashMap);
          com.google.android.gms.analytics.internal.p.a(localHashMap, "av", localHashMap);
          com.google.android.gms.analytics.internal.p.a(localHashMap, "aiid", localHashMap);
          String str = this.g;
          if (!TextUtils.isEmpty((CharSequence)localHashMap.get("adid"))) {}
          for (;;)
          {
            localObject = new x(0L, (String)localObject, str, bool, 0L, localHashMap);
            l2 = g.i(g.this).a((x)localObject);
            localHashMap.put("_s", String.valueOf(l2));
            localObject = new com.google.android.gms.analytics.internal.c(g.this, localHashMap, l1, str);
            g.j(g.this).a((com.google.android.gms.analytics.internal.c)localObject);
            return;
            bool = false;
          }
        }
      });
      return;
    }
    finally {}
  }
  
  public void a(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (c() == paramBoolean) {
          return;
        }
        if (paramBoolean)
        {
          Context localContext = o();
          this.f = new b(this, Thread.getDefaultUncaughtExceptionHandler(), localContext);
          Thread.setDefaultUncaughtExceptionHandler(this.f);
          q("Uncaught exceptions will be reported to Google Analytics");
          return;
        }
      }
      finally {}
      Thread.setDefaultUncaughtExceptionHandler(this.f.c());
      q("Uncaught exceptions will not be reported to Google Analytics");
    }
  }
  
  public void b(String paramString)
  {
    a("&cd", paramString);
  }
  
  public void b(boolean paramBoolean)
  {
    this.e.a(paramBoolean);
  }
  
  boolean b()
  {
    return this.a;
  }
  
  public void c(String paramString)
  {
    a("&dl", paramString);
  }
  
  public void c(boolean paramBoolean)
  {
    a("useSecure", com.google.android.gms.analytics.internal.p.a(paramBoolean));
  }
  
  public void d(String paramString)
  {
    a("&dr", paramString);
  }
  
  public void d(boolean paramBoolean)
  {
    a("&aip", com.google.android.gms.analytics.internal.p.a(paramBoolean));
  }
  
  public void e(String paramString)
  {
    a("&dp", paramString);
  }
  
  public void e(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public void f(String paramString)
  {
    a("&dh", paramString);
  }
  
  public void g(String paramString)
  {
    a("&dt", paramString);
  }
  
  public void h(String paramString)
  {
    a("&ul", paramString);
  }
  
  public void i(String paramString)
  {
    a("&de", paramString);
  }
  
  public void j(String paramString)
  {
    a("&sd", paramString);
  }
  
  public void k(String paramString)
  {
    a("&vp", paramString);
  }
  
  public void l(String paramString)
  {
    a("&cid", paramString);
  }
  
  public void m(String paramString)
  {
    a("&an", paramString);
  }
  
  public void n(String paramString)
  {
    a("&aid", paramString);
  }
  
  public void o(String paramString)
  {
    a("&aiid", paramString);
  }
  
  public void p(String paramString)
  {
    a("&av", paramString);
  }
  
  private class a
    extends t
    implements c.a
  {
    private boolean b;
    private int c;
    private long d = -1L;
    private boolean e;
    private long f;
    
    protected a(v paramv)
    {
      super();
    }
    
    private void d()
    {
      if ((this.d >= 0L) || (this.b))
      {
        s().a(g.a(g.this));
        return;
      }
      s().b(g.a(g.this));
    }
    
    protected void a() {}
    
    public void a(long paramLong)
    {
      this.d = paramLong;
      d();
    }
    
    public void a(Activity paramActivity)
    {
      if ((this.c == 0) && (c())) {
        this.e = true;
      }
      this.c += 1;
      HashMap localHashMap;
      g localg;
      if (this.b)
      {
        localObject = paramActivity.getIntent();
        if (localObject != null) {
          g.this.a(((Intent)localObject).getData());
        }
        localHashMap = new HashMap();
        localHashMap.put("&t", "screenview");
        localg = g.this;
        if (g.k(g.this) == null) {
          break label159;
        }
      }
      label159:
      for (Object localObject = g.k(g.this).a(paramActivity);; localObject = paramActivity.getClass().getCanonicalName())
      {
        localg.a("&cd", (String)localObject);
        if (TextUtils.isEmpty((CharSequence)localHashMap.get("&dr")))
        {
          paramActivity = g.a(paramActivity);
          if (!TextUtils.isEmpty(paramActivity)) {
            localHashMap.put("&dr", paramActivity);
          }
        }
        g.this.a(localHashMap);
        return;
      }
    }
    
    public void a(boolean paramBoolean)
    {
      this.b = paramBoolean;
      d();
    }
    
    public void b(Activity paramActivity)
    {
      this.c -= 1;
      this.c = Math.max(0, this.c);
      if (this.c == 0) {
        this.f = n().b();
      }
    }
    
    public boolean b()
    {
      try
      {
        boolean bool = this.e;
        this.e = false;
        return bool;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    boolean c()
    {
      return n().b() >= this.f + Math.max(1000L, this.d);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */