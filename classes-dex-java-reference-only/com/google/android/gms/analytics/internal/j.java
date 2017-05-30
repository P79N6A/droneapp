package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import java.util.UUID;

public class j
  extends t
{
  private SharedPreferences a;
  private long b;
  private long c = -1L;
  private final a d = new a("monitoring", q().G(), null);
  
  protected j(v paramv)
  {
    super(paramv);
  }
  
  protected void a()
  {
    this.a = o().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
  }
  
  public void a(String paramString)
  {
    m();
    D();
    SharedPreferences.Editor localEditor = this.a.edit();
    if (TextUtils.isEmpty(paramString)) {
      localEditor.remove("installation_campaign");
    }
    for (;;)
    {
      if (!localEditor.commit()) {
        t("Failed to commit campaign data");
      }
      return;
      localEditor.putString("installation_campaign", paramString);
    }
  }
  
  public long b()
  {
    m();
    D();
    long l;
    if (this.b == 0L)
    {
      l = this.a.getLong("first_run", 0L);
      if (l == 0L) {
        break label46;
      }
    }
    for (this.b = l;; this.b = l)
    {
      return this.b;
      label46:
      l = n().a();
      SharedPreferences.Editor localEditor = this.a.edit();
      localEditor.putLong("first_run", l);
      if (!localEditor.commit()) {
        t("Failed to commit first run time");
      }
    }
  }
  
  public m c()
  {
    return new m(n(), b());
  }
  
  public long d()
  {
    m();
    D();
    if (this.c == -1L) {
      this.c = this.a.getLong("last_dispatch", 0L);
    }
    return this.c;
  }
  
  public void e()
  {
    m();
    D();
    long l = n().a();
    SharedPreferences.Editor localEditor = this.a.edit();
    localEditor.putLong("last_dispatch", l);
    localEditor.apply();
    this.c = l;
  }
  
  public String f()
  {
    m();
    D();
    String str = this.a.getString("installation_campaign", null);
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    return str;
  }
  
  public a g()
  {
    return this.d;
  }
  
  public final class a
  {
    private final String b;
    private final long c;
    
    private a(String paramString, long paramLong)
    {
      d.a(paramString);
      if (paramLong > 0L) {}
      for (boolean bool = true;; bool = false)
      {
        d.b(bool);
        this.b = paramString;
        this.c = paramLong;
        return;
      }
    }
    
    private void c()
    {
      long l = j.this.n().a();
      SharedPreferences.Editor localEditor = j.a(j.this).edit();
      localEditor.remove(g());
      localEditor.remove(b());
      localEditor.putLong(f(), l);
      localEditor.commit();
    }
    
    private long d()
    {
      long l = e();
      if (l == 0L) {
        return 0L;
      }
      return Math.abs(l - j.this.n().a());
    }
    
    private long e()
    {
      return j.a(j.this).getLong(f(), 0L);
    }
    
    private String f()
    {
      return String.valueOf(this.b).concat(":start");
    }
    
    private String g()
    {
      return String.valueOf(this.b).concat(":count");
    }
    
    public Pair<String, Long> a()
    {
      long l = d();
      if (l < this.c) {}
      String str;
      do
      {
        return null;
        if (l > this.c * 2L)
        {
          c();
          return null;
        }
        str = j.a(j.this).getString(b(), null);
        l = j.a(j.this).getLong(g(), 0L);
        c();
      } while ((str == null) || (l <= 0L));
      return new Pair(str, Long.valueOf(l));
    }
    
    public void a(String paramString)
    {
      if (e() == 0L) {
        c();
      }
      String str = paramString;
      if (paramString == null) {
        str = "";
      }
      for (;;)
      {
        try
        {
          long l = j.a(j.this).getLong(g(), 0L);
          if (l <= 0L)
          {
            paramString = j.a(j.this).edit();
            paramString.putString(b(), str);
            paramString.putLong(g(), 1L);
            paramString.apply();
            return;
          }
          if ((UUID.randomUUID().getLeastSignificantBits() & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / (l + 1L))
          {
            i = 1;
            paramString = j.a(j.this).edit();
            if (i != 0) {
              paramString.putString(b(), str);
            }
            paramString.putLong(g(), l + 1L);
            paramString.apply();
            return;
          }
        }
        finally {}
        int i = 0;
      }
    }
    
    protected String b()
    {
      return String.valueOf(this.b).concat(":value");
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */