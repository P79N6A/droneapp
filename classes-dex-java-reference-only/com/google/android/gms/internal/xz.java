package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.a.a;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@aaa
public class xz
  extends xu.a
{
  private final j a;
  
  public xz(j paramj)
  {
    this.a = paramj;
  }
  
  public String a()
  {
    return this.a.e();
  }
  
  public void a(e parame)
  {
    this.a.c((View)f.a(parame));
  }
  
  public List b()
  {
    Object localObject = this.a.f();
    if (localObject != null)
    {
      ArrayList localArrayList = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        a.a locala = (a.a)((Iterator)localObject).next();
        localArrayList.add(new com.google.android.gms.ads.internal.formats.c(locala.a(), locala.b(), locala.c()));
      }
      return localArrayList;
    }
    return null;
  }
  
  public void b(e parame)
  {
    this.a.a((View)f.a(parame));
  }
  
  public String c()
  {
    return this.a.g();
  }
  
  public void c(e parame)
  {
    this.a.b((View)f.a(parame));
  }
  
  public uu d()
  {
    a.a locala = this.a.h();
    if (locala != null) {
      return new com.google.android.gms.ads.internal.formats.c(locala.a(), locala.b(), locala.c());
    }
    return null;
  }
  
  public String e()
  {
    return this.a.i();
  }
  
  public double f()
  {
    return this.a.j();
  }
  
  public String g()
  {
    return this.a.k();
  }
  
  public String h()
  {
    return this.a.l();
  }
  
  public void i()
  {
    this.a.d();
  }
  
  public boolean j()
  {
    return this.a.a();
  }
  
  public boolean k()
  {
    return this.a.b();
  }
  
  public Bundle l()
  {
    return this.a.c();
  }
  
  public com.google.android.gms.ads.internal.client.c m()
  {
    if (this.a.m() != null) {
      return this.a.m().a();
    }
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */