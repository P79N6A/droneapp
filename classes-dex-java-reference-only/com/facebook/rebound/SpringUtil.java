package com.facebook.rebound;

public class SpringUtil
{
  public static double clamp(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return Math.min(Math.max(paramDouble1, paramDouble2), paramDouble3);
  }
  
  public static double mapValueFromRangeToRange(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    return (paramDouble1 - paramDouble2) / (paramDouble3 - paramDouble2) * (paramDouble5 - paramDouble4) + paramDouble4;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/SpringUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */