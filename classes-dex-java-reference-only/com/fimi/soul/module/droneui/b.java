package com.fimi.soul.module.droneui;

public class b
{
  static double a = 6378137.0D;
  static double b = 6356725.0D;
  double c;
  double d;
  double e;
  double f;
  double g;
  double h;
  double i;
  double j;
  double k;
  double l;
  double m;
  double n;
  
  public b(double paramDouble1, double paramDouble2)
  {
    this.c = ((int)paramDouble1);
    this.d = ((int)((paramDouble1 - this.c) * 60.0D));
    this.e = ((paramDouble1 - this.c - this.d / 60.0D) * 3600.0D);
    this.f = ((int)paramDouble2);
    this.g = ((int)((paramDouble2 - this.f) * 60.0D));
    this.h = ((paramDouble2 - this.f - this.g / 60.0D) * 3600.0D);
    this.i = paramDouble1;
    this.j = paramDouble2;
    this.k = (3.141592653589793D * paramDouble1 / 180.0D);
    this.l = (3.141592653589793D * paramDouble2 / 180.0D);
    this.m = (b + (a - b) * (90.0D - this.j) / 90.0D);
    this.n = (this.m * Math.cos(this.l));
  }
  
  public static double a(b paramb1, b paramb2)
  {
    double d2 = Math.atan(Math.abs((paramb2.k - paramb1.k) * paramb1.n / ((paramb2.l - paramb1.l) * paramb1.m))) * 180.0D / 3.141592653589793D;
    double d3 = paramb2.i - paramb1.i;
    double d4 = paramb2.j - paramb1.j;
    double d1;
    if ((d3 > 0.0D) && (d4 <= 0.0D)) {
      d1 = 90.0D - d2 + 90.0D;
    }
    do
    {
      do
      {
        return d1;
        if ((d3 <= 0.0D) && (d4 < 0.0D)) {
          return d2 + 180.0D;
        }
        d1 = d2;
      } while (d3 >= 0.0D);
      d1 = d2;
    } while (d4 < 0.0D);
    return 90.0D - d2 + 270.0D;
  }
  
  public static b a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    return a(new b(paramDouble1, paramDouble2), paramDouble3, paramDouble4);
  }
  
  public static b a(b paramb, double paramDouble1, double paramDouble2)
  {
    double d1 = Math.sin(paramDouble2 * 3.141592653589793D / 180.0D);
    paramDouble2 = Math.cos(paramDouble2 * 3.141592653589793D / 180.0D);
    return new b((paramDouble1 * 1000.0D * d1 / paramb.n + paramb.k) * 180.0D / 3.141592653589793D, (paramDouble1 * 1000.0D * paramDouble2 / paramb.m + paramb.l) * 180.0D / 3.141592653589793D);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */