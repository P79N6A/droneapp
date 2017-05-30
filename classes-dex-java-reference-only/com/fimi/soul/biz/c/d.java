package com.fimi.soul.biz.c;

import com.fimi.soul.entity.FlyActionBean;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.c;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d
{
  private int a = 5;
  private int b = 1;
  private int c = 4;
  private c d;
  private volatile List<LatLng> e = new ArrayList();
  private volatile List<LatLng> f = new ArrayList();
  private i g;
  private volatile FlyActionBean h;
  private volatile int i = 30;
  private g j;
  private boolean k;
  private List<g> l = new ArrayList();
  private volatile List<FlyActionBean> m = new ArrayList();
  
  public static d k()
  {
    return a.a;
  }
  
  public c a()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    int n = paramInt;
    if (paramInt < this.a) {
      n = this.a;
    }
    this.i = n;
  }
  
  public void a(FlyActionBean paramFlyActionBean)
  {
    this.h = paramFlyActionBean;
  }
  
  public void a(c paramc)
  {
    this.d = paramc;
  }
  
  public void a(g paramg)
  {
    this.j = paramg;
  }
  
  public void a(i parami)
  {
    this.g = parami;
  }
  
  public void a(List<FlyActionBean> paramList)
  {
    this.m = paramList;
  }
  
  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public List<LatLng> b()
  {
    return this.e;
  }
  
  public void b(int paramInt)
  {
    int n = paramInt;
    if (paramInt < this.c) {
      n = this.c;
    }
    this.b = n;
  }
  
  public g c()
  {
    return this.j;
  }
  
  public boolean d()
  {
    return this.k;
  }
  
  public List<g> e()
  {
    return this.l;
  }
  
  public List<FlyActionBean> f()
  {
    return this.m;
  }
  
  public int g()
  {
    return this.i;
  }
  
  public List<LatLng> h()
  {
    return this.f;
  }
  
  public i i()
  {
    return this.g;
  }
  
  public FlyActionBean j()
  {
    return this.h;
  }
  
  public int l()
  {
    return this.b;
  }
  
  public void m()
  {
    if (this.l != null)
    {
      Iterator localIterator = this.l.iterator();
      while (localIterator.hasNext()) {
        ((g)localIterator.next()).a();
      }
      this.l.clear();
    }
    if (this.g != null)
    {
      this.g.a();
      this.g = null;
    }
    this.f.clear();
    this.m.clear();
    this.e.clear();
  }
  
  static class a
  {
    static final d a = new d();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */