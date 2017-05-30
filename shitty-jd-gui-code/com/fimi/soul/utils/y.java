package com.fimi.soul.utils;

import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.i;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class y
{
  private static final double b = 6372797.560856D;
  public List<LatLng> a;
  
  public static LatLng a(LatLng paramLatLng, double paramDouble1, double paramDouble2)
  {
    double d1 = paramLatLng.a;
    double d2 = paramLatLng.b;
    d1 = Math.toRadians(d1);
    d2 = Math.toRadians(d2);
    paramDouble1 = Math.toRadians(paramDouble1);
    double d3 = paramDouble2 / 6372797.560856D;
    paramDouble2 = Math.asin(Math.sin(d1) * Math.cos(d3) + Math.cos(d1) * Math.sin(d3) * Math.cos(paramDouble1));
    paramDouble1 = Math.atan2(Math.sin(paramDouble1) * Math.sin(d3) * Math.cos(d1), Math.cos(d3) - Math.sin(d1) * Math.sin(paramDouble2));
    return new LatLng(Math.toDegrees(paramDouble2), Math.toDegrees(paramDouble1 + d2));
  }
  
  public static Double a(double paramDouble)
  {
    return Double.valueOf(Math.toDegrees(paramDouble / 6378100.0D));
  }
  
  public static Double a(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    return Double.valueOf(Math.hypot(paramLatLng1.a - paramLatLng2.a, paramLatLng1.b - paramLatLng2.b));
  }
  
  public static List<i> a(c paramc, ArrayList<LatLng> paramArrayList, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    int k = 0;
    int i = 0;
    if (k < paramArrayList.size() - 1)
    {
      double d1 = e((LatLng)paramArrayList.get(k), (LatLng)paramArrayList.get(k + 1));
      if (d1 < 0.02D) {
        if (i == 0)
        {
          localArrayList.add(paramc.a(new PolylineOptions().a((LatLng)paramArrayList.get(k)).a((LatLng)paramArrayList.get(k + 1)).a(paramInt)));
          i = 1;
        }
      }
      int n;
      double d2;
      Object localObject;
      int m;
      do
      {
        for (;;)
        {
          k += 1;
          break;
          i = 0;
        }
        n = (int)(d1 / 0.02D);
        d1 = (((LatLng)paramArrayList.get(k + 1)).a - ((LatLng)paramArrayList.get(k)).a) / n;
        d2 = (((LatLng)paramArrayList.get(k + 1)).b - ((LatLng)paramArrayList.get(k)).b) / n;
        localObject = new LatLng(((LatLng)paramArrayList.get(k)).a, ((LatLng)paramArrayList.get(k)).b);
        m = 0;
        j = i;
        i = j;
      } while (m >= n);
      LatLng localLatLng = new LatLng(((LatLng)localObject).a + d1, ((LatLng)localObject).b + d2);
      if (j == 0) {
        localArrayList.add(paramc.a(new PolylineOptions().a((LatLng)localObject).a(localLatLng).a(paramInt)));
      }
      for (int j = 1;; j = 0)
      {
        m += 1;
        localObject = localLatLng;
        break;
      }
    }
    return localArrayList;
  }
  
  public static double b(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    double d2 = Math.toRadians(paramLatLng1.a - paramLatLng2.a);
    double d1 = Math.toRadians(paramLatLng1.b - paramLatLng2.b);
    d2 = Math.sin(d2 * 0.5D);
    d1 = Math.sin(d1 * 0.5D);
    return Math.toDegrees(Math.asin(Math.sqrt(d2 * d2 + d1 * d1 * (Math.cos(Math.toRadians(paramLatLng1.a)) * Math.cos(Math.toRadians(paramLatLng2.a))))) * 2.0D);
  }
  
  public static Double b(double paramDouble)
  {
    return Double.valueOf(6378100.0D * Math.toRadians(paramDouble));
  }
  
  public static ag c(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    return new ag(6372797.560856D * Math.toRadians(b(paramLatLng1, paramLatLng2)));
  }
  
  public static double d(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    double d1 = Math.toRadians(paramLatLng1.a);
    double d2 = Math.toRadians(paramLatLng1.b);
    double d3 = Math.toRadians(paramLatLng2.a);
    double d4 = Math.toRadians(paramLatLng2.b);
    d1 = Math.toDegrees(Math.atan2(Math.sin(d4 - d2) * Math.cos(d3), Math.cos(d1) * Math.sin(d3) - Math.sin(d1) * Math.cos(d3) * Math.cos(d4 - d2)));
    if (d1 >= 0.0D) {
      return d1;
    }
    return d1 + 360.0D;
  }
  
  private static double e(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    return new BigDecimal(c(paramLatLng1, paramLatLng2).a()).setScale(3, RoundingMode.DOWN).doubleValue();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */