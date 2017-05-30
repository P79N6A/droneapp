package com.facebook.rebound;

public class BouncyConversion
{
  private final double mBounciness;
  private final double mBouncyFriction;
  private final double mBouncyTension;
  private final double mSpeed;
  
  static
  {
    if (!BouncyConversion.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  public BouncyConversion(double paramDouble1, double paramDouble2)
  {
    this.mSpeed = paramDouble1;
    this.mBounciness = paramDouble2;
    paramDouble2 = project_normal(normalize(paramDouble2 / 1.7D, 0.0D, 20.0D), 0.0D, 0.8D);
    this.mBouncyTension = project_normal(normalize(paramDouble1 / 1.7D, 0.0D, 20.0D), 0.5D, 200.0D);
    this.mBouncyFriction = quadratic_out_interpolation(paramDouble2, b3_nobounce(this.mBouncyTension), 0.01D);
  }
  
  private double b3_friction1(double paramDouble)
  {
    return 7.0E-4D * Math.pow(paramDouble, 3.0D) - 0.031D * Math.pow(paramDouble, 2.0D) + 0.64D * paramDouble + 1.28D;
  }
  
  private double b3_friction2(double paramDouble)
  {
    return 4.4E-5D * Math.pow(paramDouble, 3.0D) - 0.006D * Math.pow(paramDouble, 2.0D) + 0.36D * paramDouble + 2.0D;
  }
  
  private double b3_friction3(double paramDouble)
  {
    return 4.5E-7D * Math.pow(paramDouble, 3.0D) - 3.32E-4D * Math.pow(paramDouble, 2.0D) + 0.1078D * paramDouble + 5.84D;
  }
  
  private double b3_nobounce(double paramDouble)
  {
    double d = 0.0D;
    if (paramDouble <= 18.0D) {
      paramDouble = b3_friction1(paramDouble);
    }
    do
    {
      return paramDouble;
      if ((paramDouble > 18.0D) && (paramDouble <= 44.0D)) {
        return b3_friction2(paramDouble);
      }
      if (paramDouble > 44.0D) {
        return b3_friction3(paramDouble);
      }
      paramDouble = d;
    } while ($assertionsDisabled);
    throw new AssertionError();
  }
  
  private double linear_interpolation(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return paramDouble1 * paramDouble3 + (1.0D - paramDouble1) * paramDouble2;
  }
  
  private double normalize(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return (paramDouble1 - paramDouble2) / (paramDouble3 - paramDouble2);
  }
  
  private double project_normal(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return (paramDouble3 - paramDouble2) * paramDouble1 + paramDouble2;
  }
  
  private double quadratic_out_interpolation(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return linear_interpolation(2.0D * paramDouble1 - paramDouble1 * paramDouble1, paramDouble2, paramDouble3);
  }
  
  public double getBounciness()
  {
    return this.mBounciness;
  }
  
  public double getBouncyFriction()
  {
    return this.mBouncyFriction;
  }
  
  public double getBouncyTension()
  {
    return this.mBouncyTension;
  }
  
  public double getSpeed()
  {
    return this.mSpeed;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/BouncyConversion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */