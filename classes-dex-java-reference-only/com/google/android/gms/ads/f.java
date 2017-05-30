package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.internal.client.g;
import com.google.android.gms.ads.purchase.b;
import com.google.android.gms.ads.purchase.d;

public final class f
{
  private final g a;
  
  public f(Context paramContext)
  {
    this.a = new g(paramContext);
  }
  
  public a a()
  {
    return this.a.a();
  }
  
  public void a(a parama)
  {
    this.a.a(parama);
    if ((parama != null) && ((parama instanceof com.google.android.gms.ads.internal.client.a))) {
      this.a.a((com.google.android.gms.ads.internal.client.a)parama);
    }
    while (parama != null) {
      return;
    }
    this.a.a(null);
  }
  
  public void a(com.google.android.gms.ads.b.c paramc)
  {
    this.a.a(paramc);
  }
  
  @RequiresPermission("android.permission.INTERNET")
  public void a(c paramc)
  {
    this.a.a(paramc.f());
  }
  
  public void a(b paramb)
  {
    this.a.a(paramb);
  }
  
  public void a(d paramd, String paramString)
  {
    this.a.a(paramd, paramString);
  }
  
  public void a(String paramString)
  {
    this.a.a(paramString);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public String b()
  {
    return this.a.b();
  }
  
  public b c()
  {
    return this.a.d();
  }
  
  public boolean d()
  {
    return this.a.f();
  }
  
  public boolean e()
  {
    return this.a.g();
  }
  
  public String f()
  {
    return this.a.h();
  }
  
  public void g()
  {
    this.a.i();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */