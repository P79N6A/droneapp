package com.fimi.soul.utils;

public class z
{
  static final double a = 3.141592653589793D;
  static final double b = 6378245.0D;
  static final double c = 0.006693421622965943D;
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    float f = (float)Math.cos((float)(Math.abs(paramDouble2) * 0.0174532925D));
    paramDouble1 = (float)(paramDouble1 - paramDouble3) * f;
    paramDouble2 = (float)(paramDouble2 - paramDouble4);
    return Math.sqrt((paramDouble2 * 1.0E7D * (1.0E7D * paramDouble2) + paramDouble1 * 1.0E7D * (1.0E7D * paramDouble1)) * 1.2392029762268066D);
  }
  
  public static af a(double paramDouble1, double paramDouble2)
  {
    af localaf = new af();
    double d3 = d(paramDouble2 - 105.0D, paramDouble1 - 35.0D);
    double d1 = e(paramDouble2 - 105.0D, paramDouble1 - 35.0D);
    double d2 = paramDouble1 / 180.0D * 3.141592653589793D;
    double d4 = Math.sin(d2);
    double d5 = 1.0D - d4 * (0.006693421622965943D * d4);
    d4 = Math.sqrt(d5);
    d3 = d3 * 180.0D / (6335552.717000426D / (d5 * d4) * 3.141592653589793D);
    d4 = 6378245.0D / d4;
    d1 = d1 * 180.0D / (Math.cos(d2) * d4 * 3.141592653589793D);
    localaf.a(d3 + paramDouble1);
    localaf.b(d1 + paramDouble2);
    return localaf;
  }
  
  public static af a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    new af();
    af localaf1 = new af();
    af localaf2 = new af();
    localaf1.a(paramDouble2);
    localaf1.b(paramDouble3);
    af localaf3 = b(localaf1.a(), localaf1.b());
    localaf1 = a(localaf3.a(), localaf3.b());
    for (;;)
    {
      double d1 = localaf1.b();
      double d2 = localaf1.a();
      localaf2.b(paramDouble3 - d1 + localaf3.b());
      localaf2.a(paramDouble2 - d2 + localaf3.a());
      localaf3.b(localaf2.b());
      localaf3.a(localaf2.a());
      localaf1 = a(localaf3.a(), localaf3.b());
      if (paramDouble1 >= a(paramDouble3, paramDouble2, localaf1.b(), localaf1.a())) {
        return localaf2;
      }
    }
  }
  
  public static void a(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble)
  {
    if (c(paramDouble1, paramDouble2))
    {
      paramArrayOfDouble[0] = paramDouble1;
      paramArrayOfDouble[1] = paramDouble2;
      return;
    }
    double d3 = d(paramDouble2 - 105.0D, paramDouble1 - 35.0D);
    double d1 = e(paramDouble2 - 105.0D, paramDouble1 - 35.0D);
    double d2 = paramDouble1 / 180.0D * 3.141592653589793D;
    double d4 = Math.sin(d2);
    double d5 = 1.0D - d4 * (0.006693421622965943D * d4);
    d4 = Math.sqrt(d5);
    d3 = d3 * 180.0D / (6335552.717000426D / (d5 * d4) * 3.141592653589793D);
    d4 = 6378245.0D / d4;
    d1 = d1 * 180.0D / (Math.cos(d2) * d4 * 3.141592653589793D);
    paramArrayOfDouble[0] = (d3 + paramDouble1);
    paramArrayOfDouble[1] = (d1 + paramDouble2);
  }
  
  public static af b(double paramDouble1, double paramDouble2)
  {
    af localaf = new af();
    double d3 = d(paramDouble2 - 105.0D, paramDouble1 - 35.0D);
    double d1 = e(paramDouble2 - 105.0D, paramDouble1 - 35.0D);
    double d2 = paramDouble1 / 180.0D * 3.141592653589793D;
    double d4 = Math.sin(d2);
    double d5 = 1.0D - d4 * (0.006693421622965943D * d4);
    d4 = Math.sqrt(d5);
    d3 = d3 * 180.0D / (6335552.717000426D / (d5 * d4) * 3.141592653589793D);
    d4 = 6378245.0D / d4;
    d1 = d1 * 180.0D / (Math.cos(d2) * d4 * 3.141592653589793D);
    localaf.a(paramDouble1 - d3);
    localaf.b(paramDouble2 - d1);
    return localaf;
  }
  
  private static boolean c(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble2 < 72.004D) || (paramDouble2 > 137.8347D)) {}
    while ((paramDouble1 < 0.8293D) || (paramDouble1 > 55.8271D)) {
      return true;
    }
    return false;
  }
  
  private static double d(double paramDouble1, double paramDouble2)
  {
    return -100.0D + 2.0D * paramDouble1 + 3.0D * paramDouble2 + 0.2D * paramDouble2 * paramDouble2 + 0.1D * paramDouble1 * paramDouble2 + 0.2D * Math.sqrt(Math.abs(paramDouble1)) + (20.0D * Math.sin(6.0D * paramDouble1 * 3.141592653589793D) + 20.0D * Math.sin(2.0D * paramDouble1 * 3.141592653589793D)) * 2.0D / 3.0D + (20.0D * Math.sin(3.141592653589793D * paramDouble2) + 40.0D * Math.sin(paramDouble2 / 3.0D * 3.141592653589793D)) * 2.0D / 3.0D + (160.0D * Math.sin(paramDouble2 / 12.0D * 3.141592653589793D) + 320.0D * Math.sin(3.141592653589793D * paramDouble2 / 30.0D)) * 2.0D / 3.0D;
  }
  
  private static double e(double paramDouble1, double paramDouble2)
  {
    return 300.0D + paramDouble1 + 2.0D * paramDouble2 + 0.1D * paramDouble1 * paramDouble1 + 0.1D * paramDouble1 * paramDouble2 + 0.1D * Math.sqrt(Math.abs(paramDouble1)) + (20.0D * Math.sin(6.0D * paramDouble1 * 3.141592653589793D) + 20.0D * Math.sin(2.0D * paramDouble1 * 3.141592653589793D)) * 2.0D / 3.0D + (20.0D * Math.sin(3.141592653589793D * paramDouble1) + 40.0D * Math.sin(paramDouble1 / 3.0D * 3.141592653589793D)) * 2.0D / 3.0D + (150.0D * Math.sin(paramDouble1 / 12.0D * 3.141592653589793D) + 300.0D * Math.sin(paramDouble1 / 30.0D * 3.141592653589793D)) * 2.0D / 3.0D;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */