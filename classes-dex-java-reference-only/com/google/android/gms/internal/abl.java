package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.purchase.i;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.s;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;

@aaa
public class abl
  implements abt.b, tp.b
{
  private long A = 0L;
  private int B = -1;
  private final Object a = new Object();
  private final String b;
  private final abm c;
  private ti d;
  private BigInteger e = BigInteger.ONE;
  private final HashSet<abj> f = new HashSet();
  private final HashMap<String, abo> g = new HashMap();
  private boolean h = false;
  private boolean i = true;
  private int j = 0;
  private boolean k = false;
  private Context l;
  private VersionInfoParcel m;
  private uh n = null;
  private boolean o = true;
  private tq p = null;
  private to q = null;
  private String r;
  private Boolean s = null;
  private String t;
  private boolean u = false;
  private boolean v = false;
  private boolean w = false;
  private boolean x = false;
  private String y = "";
  private long z = 0L;
  
  public abl(abv paramabv)
  {
    this.b = paramabv.d();
    this.c = new abm(this.b);
  }
  
  public Bundle a(Context paramContext, abn paramabn, String paramString)
  {
    Bundle localBundle;
    synchronized (this.a)
    {
      localBundle = new Bundle();
      localBundle.putBundle("app", this.c.a(paramContext, paramString));
      paramContext = new Bundle();
      paramString = this.g.keySet().iterator();
      if (paramString.hasNext())
      {
        String str = (String)paramString.next();
        paramContext.putBundle(str, ((abo)this.g.get(str)).a());
      }
    }
    localBundle.putBundle("slots", paramContext);
    paramContext = new ArrayList();
    paramString = this.f.iterator();
    while (paramString.hasNext()) {
      paramContext.add(((abj)paramString.next()).d());
    }
    localBundle.putParcelableArrayList("ads", paramContext);
    paramabn.a(this.f);
    this.f.clear();
    return localBundle;
  }
  
  public tq a(Context paramContext)
  {
    if ((!((Boolean)uf.Q.c()).booleanValue()) || (!s.d()) || (b())) {
      return null;
    }
    synchronized (this.a)
    {
      if ((Looper.getMainLooper() == null) || (paramContext == null)) {
        return null;
      }
      if (this.q == null) {
        this.q = new to();
      }
      if (this.p == null) {
        this.p = new tq(this.q, new zz(this.l, this.m, null, null));
      }
      this.p.a();
      paramContext = this.p;
      return paramContext;
    }
  }
  
  public String a()
  {
    return this.b;
  }
  
  public Future a(int paramInt)
  {
    synchronized (this.a)
    {
      this.B = paramInt;
      Future localFuture = abt.a(this.l, paramInt);
      return localFuture;
    }
  }
  
  public Future a(long paramLong)
  {
    synchronized (this.a)
    {
      if (this.A < paramLong)
      {
        this.A = paramLong;
        Future localFuture = abt.a(this.l, paramLong);
        return localFuture;
      }
      return null;
    }
  }
  
  public Future a(Context paramContext, String paramString)
  {
    this.z = u.k().a();
    Object localObject = this.a;
    if (paramString != null) {}
    try
    {
      if (!paramString.equals(this.y))
      {
        this.y = paramString;
        paramContext = abt.a(paramContext, paramString, this.z);
        return paramContext;
      }
      return null;
    }
    finally {}
  }
  
  public Future a(Context paramContext, boolean paramBoolean)
  {
    synchronized (this.a)
    {
      if (paramBoolean != this.i)
      {
        this.i = paramBoolean;
        paramContext = abt.a(paramContext, paramBoolean);
        return paramContext;
      }
      return null;
    }
  }
  
  public Future a(String paramString)
  {
    Object localObject = this.a;
    if (paramString != null) {}
    try
    {
      if (!paramString.equals(this.r))
      {
        this.r = paramString;
        paramString = abt.a(this.l, paramString);
        return paramString;
      }
      return null;
    }
    finally {}
  }
  
  @TargetApi(23)
  public void a(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    synchronized (this.a)
    {
      if (!this.k)
      {
        this.l = paramContext.getApplicationContext();
        this.m = paramVersionInfoParcel;
        u.h().a(this);
        abt.a(paramContext, this);
        abt.b(paramContext, this);
        abt.c(paramContext, this);
        abt.d(paramContext, this);
        abt.e(paramContext, this);
        abt.f(paramContext, this);
        abt.g(paramContext, this);
        a(Thread.currentThread());
        this.t = u.e().a(paramContext, paramVersionInfoParcel.b);
        if ((s.l()) && (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted())) {
          this.v = true;
        }
        this.d = new ti(paramContext.getApplicationContext(), this.m, u.e().a(paramContext, paramVersionInfoParcel));
        s();
        u.s().a(this.l);
        this.k = true;
      }
      return;
    }
  }
  
  public void a(Bundle paramBundle)
  {
    synchronized (this.a)
    {
      this.i = paramBundle.getBoolean("use_https", this.i);
      this.j = paramBundle.getInt("webview_cache_version", this.j);
      if (paramBundle.containsKey("content_url_opted_out")) {
        b(paramBundle.getBoolean("content_url_opted_out"));
      }
      if (paramBundle.containsKey("content_url_hashes")) {
        this.r = paramBundle.getString("content_url_hashes");
      }
      this.w = paramBundle.getBoolean("auto_collect_location", this.w);
      if (paramBundle.containsKey("app_settings_json"))
      {
        str = paramBundle.getString("app_settings_json");
        this.y = str;
        this.z = paramBundle.getLong("app_settings_last_update_ms", this.z);
        this.A = paramBundle.getLong("app_last_background_time_ms", this.A);
        this.B = paramBundle.getInt("request_in_session_count", this.B);
        return;
      }
      String str = this.y;
    }
  }
  
  public void a(abj paramabj)
  {
    synchronized (this.a)
    {
      this.f.add(paramabj);
      return;
    }
  }
  
  public void a(Boolean paramBoolean)
  {
    synchronized (this.a)
    {
      this.s = paramBoolean;
      return;
    }
  }
  
  public void a(String paramString, abo paramabo)
  {
    synchronized (this.a)
    {
      this.g.put(paramString, paramabo);
      return;
    }
  }
  
  public void a(Thread paramThread)
  {
    zz.a(this.l, paramThread, this.m);
  }
  
  public void a(Throwable paramThrowable, String paramString)
  {
    new zz(this.l, this.m, null, null).a(paramThrowable, paramString);
  }
  
  public void a(HashSet<abj> paramHashSet)
  {
    synchronized (this.a)
    {
      this.f.addAll(paramHashSet);
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (u.k().a() - this.A > ((Long)uf.aq.c()).longValue())
      {
        this.c.a(-1);
        return;
      }
      this.c.a(this.B);
      return;
    }
    a(u.k().a());
    a(this.c.d());
  }
  
  public Future b(Context paramContext, boolean paramBoolean)
  {
    synchronized (this.a)
    {
      if (paramBoolean != this.w)
      {
        this.w = paramBoolean;
        paramContext = abt.c(paramContext, paramBoolean);
        return paramContext;
      }
      return null;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    synchronized (this.a)
    {
      if (this.o != paramBoolean) {
        abt.b(this.l, paramBoolean);
      }
      this.o = paramBoolean;
      tq localtq = a(this.l);
      if ((localtq != null) && (!localtq.isAlive()))
      {
        abr.c("start fetching content...");
        localtq.a();
      }
      return;
    }
  }
  
  public boolean b()
  {
    synchronized (this.a)
    {
      boolean bool = this.o;
      return bool;
    }
  }
  
  public String c()
  {
    synchronized (this.a)
    {
      String str = this.e.toString();
      this.e = this.e.add(BigInteger.ONE);
      return str;
    }
  }
  
  public void c(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }
  
  public abm d()
  {
    synchronized (this.a)
    {
      abm localabm = this.c;
      return localabm;
    }
  }
  
  public void d(boolean paramBoolean)
  {
    synchronized (this.a)
    {
      this.u = paramBoolean;
      return;
    }
  }
  
  public uh e()
  {
    synchronized (this.a)
    {
      uh localuh = this.n;
      return localuh;
    }
  }
  
  public boolean f()
  {
    synchronized (this.a)
    {
      boolean bool = this.h;
      this.h = true;
      return bool;
    }
  }
  
  public boolean g()
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (!this.i)
        {
          if (!this.v) {
            break label38;
          }
          break label33;
          return bool;
        }
      }
      label33:
      boolean bool = true;
      continue;
      label38:
      bool = false;
    }
  }
  
  public String h()
  {
    synchronized (this.a)
    {
      String str = this.t;
      return str;
    }
  }
  
  public String i()
  {
    synchronized (this.a)
    {
      String str = this.r;
      return str;
    }
  }
  
  public Boolean j()
  {
    synchronized (this.a)
    {
      Boolean localBoolean = this.s;
      return localBoolean;
    }
  }
  
  public boolean k()
  {
    synchronized (this.a)
    {
      boolean bool = this.w;
      return bool;
    }
  }
  
  public long l()
  {
    synchronized (this.a)
    {
      long l1 = this.A;
      return l1;
    }
  }
  
  public int m()
  {
    synchronized (this.a)
    {
      int i1 = this.B;
      return i1;
    }
  }
  
  public boolean n()
  {
    return this.x;
  }
  
  public abk o()
  {
    synchronized (this.a)
    {
      abk localabk = new abk(this.y, this.z);
      return localabk;
    }
  }
  
  public ti p()
  {
    return this.d;
  }
  
  public Resources q()
  {
    Resources localResources = null;
    if (this.m.e) {
      localResources = this.l.getResources();
    }
    for (;;)
    {
      return localResources;
      try
      {
        akb localakb = akb.a(this.l, akb.a, "com.google.android.gms.ads.dynamite");
        if (localakb != null)
        {
          localResources = localakb.a().getResources();
          return localResources;
        }
      }
      catch (akb.a locala)
      {
        abr.d("Cannot load resource from dynamite apk or local jar", locala);
      }
    }
    return null;
  }
  
  public boolean r()
  {
    synchronized (this.a)
    {
      boolean bool = this.u;
      return bool;
    }
  }
  
  void s()
  {
    ug localug = new ug(this.l, this.m.b);
    try
    {
      this.n = u.l().a(localug);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      abr.d("Cannot initialize CSI reporter.", localIllegalArgumentException);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/abl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */