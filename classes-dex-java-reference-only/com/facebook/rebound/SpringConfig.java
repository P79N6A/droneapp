package com.facebook.rebound;

public class SpringConfig
{
  public static SpringConfig defaultConfig = fromOrigamiTensionAndFriction(40.0D, 7.0D);
  public double friction;
  public double tension;
  
  public SpringConfig(double paramDouble1, double paramDouble2)
  {
    this.tension = paramDouble1;
    this.friction = paramDouble2;
  }
  
  public static SpringConfig fromBouncinessAndSpeed(double paramDouble1, double paramDouble2)
  {
    BouncyConversion localBouncyConversion = new BouncyConversion(paramDouble2, paramDouble1);
    return fromOrigamiTensionAndFriction(localBouncyConversion.getBouncyTension(), localBouncyConversion.getBouncyFriction());
  }
  
  public static SpringConfig fromOrigamiTensionAndFriction(double paramDouble1, double paramDouble2)
  {
    return new SpringConfig(OrigamiValueConverter.tensionFromOrigamiValue(paramDouble1), OrigamiValueConverter.frictionFromOrigamiValue(paramDouble2));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/SpringConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */