package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public class q
  extends t
{
  protected String a;
  protected String b;
  protected int c;
  protected boolean d;
  protected int e;
  protected boolean f;
  protected boolean g;
  
  public q(v paramv)
  {
    super(paramv);
  }
  
  private static int a(String paramString)
  {
    paramString = paramString.toLowerCase();
    if ("verbose".equals(paramString)) {
      return 0;
    }
    if ("info".equals(paramString)) {
      return 1;
    }
    if ("warning".equals(paramString)) {
      return 2;
    }
    if ("error".equals(paramString)) {
      return 3;
    }
    return -1;
  }
  
  protected void a()
  {
    j();
  }
  
  void a(b paramb)
  {
    q("Loading global XML config values");
    String str;
    if (paramb.a())
    {
      str = paramb.b();
      this.b = str;
      b("XML config - app name", str);
    }
    if (paramb.c())
    {
      str = paramb.d();
      this.a = str;
      b("XML config - app version", str);
    }
    int i;
    if (paramb.e())
    {
      i = a(paramb.f());
      if (i >= 0)
      {
        this.c = i;
        a("XML config - log level", Integer.valueOf(i));
      }
    }
    if (paramb.g())
    {
      i = paramb.h();
      this.e = i;
      this.d = true;
      b("XML config - dispatch period (sec)", Integer.valueOf(i));
    }
    if (paramb.i())
    {
      boolean bool = paramb.j();
      this.g = bool;
      this.f = true;
      b("XML config - dry run", Boolean.valueOf(bool));
    }
  }
  
  public String b()
  {
    D();
    return this.a;
  }
  
  public String c()
  {
    D();
    return this.b;
  }
  
  public boolean d()
  {
    D();
    return false;
  }
  
  public int e()
  {
    D();
    return this.c;
  }
  
  public boolean f()
  {
    D();
    return this.d;
  }
  
  public int g()
  {
    D();
    return this.e;
  }
  
  public boolean h()
  {
    D();
    return this.f;
  }
  
  public boolean i()
  {
    D();
    return this.g;
  }
  
  protected void j()
  {
    Object localObject1 = o();
    try
    {
      localObject1 = ((Context)localObject1).getPackageManager().getApplicationInfo(((Context)localObject1).getPackageName(), 129);
      if (localObject1 == null)
      {
        t("Couldn't get ApplicationInfo to load global config");
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject2;
      do
      {
        int i;
        do
        {
          do
          {
            for (;;)
            {
              d("PackageManager doesn't know about the app package", localNameNotFoundException);
              localObject2 = null;
            }
            localObject2 = ((ApplicationInfo)localObject2).metaData;
          } while (localObject2 == null);
          i = ((Bundle)localObject2).getInt("com.google.android.gms.analytics.globalConfigResource");
        } while (i <= 0);
        localObject2 = (b)new ap(k()).a(i);
      } while (localObject2 == null);
      a((b)localObject2);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */