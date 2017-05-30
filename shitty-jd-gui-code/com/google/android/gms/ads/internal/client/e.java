package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.internal.aaa;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@aaa
public final class e
{
  public static final String a = ac.a().a("emulator");
  private final Date b;
  private final String c;
  private final int d;
  private final Set<String> e;
  private final Location f;
  private final boolean g;
  private final Bundle h;
  private final Map<Class<? extends m>, m> i;
  private final String j;
  private final String k;
  private final com.google.android.gms.ads.search.b l;
  private final int m;
  private final Set<String> n;
  private final Bundle o;
  private final Set<String> p;
  private final boolean q;
  
  public e(a parama)
  {
    this(parama, null);
  }
  
  public e(a parama, com.google.android.gms.ads.search.b paramb)
  {
    this.b = a.a(parama);
    this.c = a.b(parama);
    this.d = a.c(parama);
    this.e = Collections.unmodifiableSet(a.d(parama));
    this.f = a.e(parama);
    this.g = a.f(parama);
    this.h = a.g(parama);
    this.i = Collections.unmodifiableMap(a.h(parama));
    this.j = a.i(parama);
    this.k = a.j(parama);
    this.l = paramb;
    this.m = a.k(parama);
    this.n = Collections.unmodifiableSet(a.l(parama));
    this.o = a.m(parama);
    this.p = Collections.unmodifiableSet(a.n(parama));
    this.q = a.o(parama);
  }
  
  @Deprecated
  public <T extends m> T a(Class<T> paramClass)
  {
    return (m)this.i.get(paramClass);
  }
  
  public Date a()
  {
    return this.b;
  }
  
  public boolean a(Context paramContext)
  {
    return this.n.contains(ac.a().a(paramContext));
  }
  
  public Bundle b(Class<? extends com.google.android.gms.ads.mediation.b> paramClass)
  {
    return this.h.getBundle(paramClass.getName());
  }
  
  public String b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public Bundle c(Class<? extends com.google.android.gms.ads.mediation.customevent.a> paramClass)
  {
    Bundle localBundle = this.h.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
    if (localBundle != null) {
      return localBundle.getBundle(paramClass.getName());
    }
    return null;
  }
  
  public Set<String> d()
  {
    return this.e;
  }
  
  public Location e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.g;
  }
  
  public String g()
  {
    return this.j;
  }
  
  public String h()
  {
    return this.k;
  }
  
  public com.google.android.gms.ads.search.b i()
  {
    return this.l;
  }
  
  public Map<Class<? extends m>, m> j()
  {
    return this.i;
  }
  
  public Bundle k()
  {
    return this.h;
  }
  
  public int l()
  {
    return this.m;
  }
  
  public Bundle m()
  {
    return this.o;
  }
  
  public Set<String> n()
  {
    return this.p;
  }
  
  public boolean o()
  {
    return this.q;
  }
  
  public static final class a
  {
    private final HashSet<String> a = new HashSet();
    private final Bundle b = new Bundle();
    private final HashMap<Class<? extends m>, m> c = new HashMap();
    private final HashSet<String> d = new HashSet();
    private final Bundle e = new Bundle();
    private final HashSet<String> f = new HashSet();
    private Date g;
    private String h;
    private int i = -1;
    private Location j;
    private boolean k = false;
    private String l;
    private String m;
    private int n = -1;
    private boolean o;
    
    public void a(int paramInt)
    {
      this.i = paramInt;
    }
    
    public void a(Location paramLocation)
    {
      this.j = paramLocation;
    }
    
    @Deprecated
    public void a(m paramm)
    {
      if ((paramm instanceof com.google.android.gms.ads.mediation.a.a))
      {
        a(AdMobAdapter.class, ((com.google.android.gms.ads.mediation.a.a)paramm).a());
        return;
      }
      this.c.put(paramm.getClass(), paramm);
    }
    
    public void a(Class<? extends com.google.android.gms.ads.mediation.b> paramClass, Bundle paramBundle)
    {
      this.b.putBundle(paramClass.getName(), paramBundle);
    }
    
    public void a(String paramString)
    {
      this.a.add(paramString);
    }
    
    public void a(String paramString1, String paramString2)
    {
      this.e.putString(paramString1, paramString2);
    }
    
    public void a(Date paramDate)
    {
      this.g = paramDate;
    }
    
    public void a(boolean paramBoolean)
    {
      this.k = paramBoolean;
    }
    
    public void b(Class<? extends com.google.android.gms.ads.mediation.customevent.a> paramClass, Bundle paramBundle)
    {
      if (this.b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
        this.b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
      }
      this.b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(paramClass.getName(), paramBundle);
    }
    
    public void b(String paramString)
    {
      this.d.add(paramString);
    }
    
    public void b(boolean paramBoolean)
    {
      if (paramBoolean) {}
      for (int i1 = 1;; i1 = 0)
      {
        this.n = i1;
        return;
      }
    }
    
    public void c(String paramString)
    {
      this.d.remove(paramString);
    }
    
    public void c(boolean paramBoolean)
    {
      this.o = paramBoolean;
    }
    
    public void d(String paramString)
    {
      this.h = paramString;
    }
    
    public void e(String paramString)
    {
      this.l = paramString;
    }
    
    public void f(String paramString)
    {
      this.m = paramString;
    }
    
    public void g(String paramString)
    {
      this.f.add(paramString);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */