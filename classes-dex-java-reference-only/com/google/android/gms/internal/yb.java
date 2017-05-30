package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.a.a;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@aaa
public class yb
  extends xv.a
{
  private final k a;
  
  public yb(k paramk)
  {
    this.a = paramk;
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
        localArrayList.add(new c(locala.a(), locala.b(), locala.c()));
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
      return new c(locala.a(), locala.b(), locala.c());
    }
    return null;
  }
  
  public String e()
  {
    return this.a.i();
  }
  
  public String f()
  {
    return this.a.j();
  }
  
  public void g()
  {
    this.a.d();
  }
  
  public boolean h()
  {
    return this.a.a();
  }
  
  public boolean i()
  {
    return this.a.b();
  }
  
  public Bundle j()
  {
    return this.a.c();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */