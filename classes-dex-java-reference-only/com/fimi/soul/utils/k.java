package com.fimi.soul.utils;

public class k
{
  private static double a(double paramDouble)
  {
    return 3.141592653589793D * paramDouble / 180.0D;
  }
  
  public static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    if ((paramDouble1 == paramDouble3) && (paramDouble2 == paramDouble4)) {
      return 0.0D;
    }
    return a(paramDouble1, paramDouble2, paramDouble3, paramDouble4, 'K');
  }
  
  public static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, char paramChar)
  {
    double d1 = Math.sin(a(paramDouble1));
    double d2 = Math.sin(a(paramDouble3));
    paramDouble1 = Math.cos(a(paramDouble1));
    paramDouble3 = Math.cos(a(paramDouble3));
    paramDouble2 = b(Math.acos(Math.cos(a(paramDouble2 - paramDouble4)) * (paramDouble1 * paramDouble3) + d1 * d2)) * 60.0D * 1.1515D;
    if (paramChar == 'K') {
      paramDouble1 = paramDouble2 * 1.609344D;
    }
    do
    {
      return paramDouble1;
      paramDouble1 = paramDouble2;
    } while (paramChar != 'N');
    return paramDouble2 * 0.8684D;
  }
  
  private static double b(double paramDouble)
  {
    return 180.0D * paramDouble / 3.141592653589793D;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */