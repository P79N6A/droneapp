package com.fimi.soul.module.dronemanage;

import android.graphics.Point;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.h;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e
{
  private c a;
  private List<i> b = new ArrayList();
  private i c;
  
  public e(c paramc)
  {
    this.a = paramc;
  }
  
  public void a()
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).a();
    }
  }
  
  public void a(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    a();
    int i = this.a.n().a(paramLatLng1).x;
    int j = this.a.n().a(paramLatLng1).y;
    int k = this.a.n().a(paramLatLng2).x;
    int m = this.a.n().a(paramLatLng2).y;
    double d1 = Math.atan(10.0D / 20.0D);
    double d2 = Math.sqrt(20.0D * 20.0D + 10.0D * 10.0D);
    paramLatLng1 = a(k - i, m - j, d1, d2);
    Object localObject = a(k - i, m - j, -d1, d2);
    d1 = k;
    d2 = paramLatLng1[0];
    double d3 = m;
    double d4 = paramLatLng1[1];
    double d5 = k;
    double d6 = localObject[0];
    double d7 = m;
    double d8 = localObject[1];
    localObject = new Point((int)(d1 - d2), (int)(d3 - d4));
    paramLatLng1 = new Point((int)(d5 - d6), (int)(d7 - d8));
    localObject = this.a.n().a((Point)localObject);
    paramLatLng1 = this.a.n().a(paramLatLng1);
    this.c = this.a.a(new PolylineOptions().a(new LatLng[] { paramLatLng2, localObject }).a(65280).a(5.0F));
    if (!this.b.contains(this.c)) {
      this.b.add(this.c);
    }
    this.c = this.a.a(new PolylineOptions().a(new LatLng[] { paramLatLng2, paramLatLng1 }).a(65280).a(5.0F));
    if (!this.b.contains(this.c)) {
      this.b.add(this.c);
    }
  }
  
  public double[] a(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
  {
    double d1 = paramInt1 * Math.cos(paramDouble1) - paramInt2 * Math.sin(paramDouble1);
    paramDouble1 = paramInt1 * Math.sin(paramDouble1) + paramInt2 * Math.cos(paramDouble1);
    double d2 = Math.sqrt(d1 * d1 + paramDouble1 * paramDouble1);
    return new double[] { d1 / d2 * paramDouble2, paramDouble1 / d2 * paramDouble2 };
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/dronemanage/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */