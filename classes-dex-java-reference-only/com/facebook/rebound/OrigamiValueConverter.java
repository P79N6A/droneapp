package com.facebook.rebound;

public class OrigamiValueConverter
{
  public static double frictionFromOrigamiValue(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    return (paramDouble - 8.0D) * 3.0D + 25.0D;
  }
  
  public static double origamiValueFromFriction(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    return (paramDouble - 25.0D) / 3.0D + 8.0D;
  }
  
  public static double origamiValueFromTension(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    return (paramDouble - 194.0D) / 3.62D + 30.0D;
  }
  
  public static double tensionFromOrigamiValue(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    return (paramDouble - 30.0D) * 3.62D + 194.0D;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/OrigamiValueConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */