package com.fimi.soul.module.droneFragment;

import android.annotation.TargetApi;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.a;
import com.google.android.gms.maps.model.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@TargetApi(19)
public class g
{
  private static g d;
  com.google.android.gms.maps.model.g a;
  private c b;
  private HashMap<String, com.google.android.gms.maps.model.g> c = new HashMap();
  private com.google.android.gms.maps.model.g e;
  private LatLng f;
  private a g;
  private a h;
  
  public static g a()
  {
    if (d == null) {
      d = new g();
    }
    return d;
  }
  
  private MarkerOptions d(String paramString)
  {
    return new MarkerOptions().a(this.f).a(c(paramString));
  }
  
  public void a(c paramc, LatLng paramLatLng)
  {
    this.b = paramc;
    this.f = paramLatLng;
  }
  
  public void a(String paramString)
  {
    if (!this.c.containsKey(paramString))
    {
      this.a = this.b.a(d(paramString));
      this.a.a(paramString);
      if ("homename".equals(paramString))
      {
        this.a.a(0.15F, 1.0F);
        this.a.a(80.0F);
      }
      for (;;)
      {
        this.c.put(paramString, this.a);
        return;
        this.a.a(0.5F, 0.5F);
        this.a.a(100.0F);
      }
    }
    ((com.google.android.gms.maps.model.g)this.c.get(paramString)).a(this.f);
  }
  
  public void b()
  {
    Iterator localIterator = this.c.keySet().iterator();
    while (localIterator.hasNext()) {
      ((com.google.android.gms.maps.model.g)this.c.get(localIterator.next())).a();
    }
    this.c.clear();
  }
  
  public void b(String paramString)
  {
    if (this.c.containsKey(paramString))
    {
      this.e = ((com.google.android.gms.maps.model.g)this.c.get(paramString));
      this.c.remove(paramString);
      this.e.a();
    }
  }
  
  protected a c(String paramString)
  {
    if ("dronename".equals(paramString))
    {
      if (this.h == null) {
        this.h = b.a(2130837957);
      }
      return this.h;
    }
    if (this.g == null) {
      this.g = b.a(2130837978);
    }
    return this.g;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */