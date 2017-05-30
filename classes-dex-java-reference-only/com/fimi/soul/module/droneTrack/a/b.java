package com.fimi.soul.module.droneTrack.a;

import com.fimi.soul.drone.h.c;
import com.fimi.soul.drone.h.e;
import com.google.android.gms.maps.model.LatLng;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class b
{
  public static b a;
  e b = new e();
  c c = new c();
  private volatile LinkedHashMap<Integer, List<Object>> d = new LinkedHashMap();
  private volatile List<LatLng> e = new LinkedList();
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private double[] j = { 3.15D, 3.47D, 3.64D, 3.79D, 4.1D };
  private double[] k = { 3.43D, 3.73D, 3.88D, 4.02D, 4.16D };
  
  public static b a()
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new b();
      }
      return a;
    }
    finally {}
  }
  
  private void a(boolean... paramVarArgs)
  {
    int n = paramVarArgs.length;
    int m = 0;
    while (m < n)
    {
      int i1 = paramVarArgs[m];
      m += 1;
    }
  }
  
  public void a(c paramc)
  {
    this.c = paramc;
  }
  
  public void a(e parame)
  {
    this.b = parame;
  }
  
  public void a(List<LatLng> paramList)
  {
    this.e = paramList;
  }
  
  public void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void a(double[] paramArrayOfDouble)
  {
    this.k = paramArrayOfDouble;
  }
  
  public LinkedHashMap<Integer, List<Object>> b()
  {
    return this.d;
  }
  
  public void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void b(double[] paramArrayOfDouble)
  {
    this.j = paramArrayOfDouble;
  }
  
  public List<LatLng> c()
  {
    return this.e;
  }
  
  public void c(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void d()
  {
    this.d.clear();
    this.e.clear();
    a(new boolean[] { this.f, this.g, this.h, this.i });
  }
  
  public void d(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public boolean e()
  {
    return this.i;
  }
  
  public boolean f()
  {
    return this.h;
  }
  
  public boolean g()
  {
    return this.g;
  }
  
  public boolean h()
  {
    return this.f;
  }
  
  public double[] i()
  {
    return this.k;
  }
  
  public double[] j()
  {
    return this.j;
  }
  
  public c k()
  {
    return this.c;
  }
  
  public e l()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneTrack/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */