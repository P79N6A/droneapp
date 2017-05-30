package com.fimi.soul.utils;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.List;

public class al
{
  public static double a(Point paramPoint1, Point paramPoint2, Point paramPoint3)
  {
    double d3 = paramPoint1.x;
    double d1 = paramPoint1.y;
    double d2 = paramPoint2.x;
    double d4 = paramPoint2.y;
    double d6 = paramPoint3.x;
    double d5 = paramPoint3.y;
    double d9 = d2 - d3;
    double d7 = d4 - d1;
    double d8;
    if ((d9 != 0.0D) || (d7 != 0.0D))
    {
      d8 = ((d6 - d3) * d9 + (d5 - d1) * d7) / (d9 * d9 + d7 * d7);
      if (d8 > 1.0D) {
        d1 = d4;
      }
    }
    for (;;)
    {
      d2 = d6 - d2;
      d1 = d5 - d1;
      return d1 * d1 + d2 * d2;
      if (d8 > 0.0D)
      {
        d2 = d9 * d8 + d3;
        d1 += d7 * d8;
      }
      else
      {
        d2 = d3;
      }
    }
  }
  
  public static List<Point> a(List<Point> paramList, double paramDouble)
  {
    int k = paramList.size() - 1;
    double d1 = 0.0D;
    int j = 0;
    int i = 1;
    if (i < paramList.size() - 1)
    {
      double d2 = a((Point)paramList.get(0), (Point)paramList.get(k), (Point)paramList.get(i));
      if (d2 <= d1) {
        break label215;
      }
      d1 = d2;
      j = i;
    }
    label215:
    for (;;)
    {
      i += 1;
      break;
      ArrayList localArrayList = new ArrayList();
      if (d1 > paramDouble * paramDouble)
      {
        List localList = a(paramList.subList(0, j + 1), paramDouble);
        paramList = a(paramList.subList(j, k + 1), paramDouble);
        localList.remove(localList.size() - 1);
        localArrayList.addAll(localList);
        localArrayList.addAll(paramList);
        return localArrayList;
      }
      localArrayList.add(paramList.get(0));
      localArrayList.add(paramList.get(k));
      return localArrayList;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */