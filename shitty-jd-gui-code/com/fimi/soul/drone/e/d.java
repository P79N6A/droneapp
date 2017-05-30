package com.fimi.soul.drone.e;

import java.io.Serializable;

public class d
  implements Serializable
{
  private double a;
  private double b;
  
  public double a()
  {
    return this.a;
  }
  
  public void a(double paramDouble)
  {
    this.a = paramDouble;
  }
  
  public double b()
  {
    return this.b;
  }
  
  public void b(double paramDouble)
  {
    this.b = paramDouble;
  }
  
  public String toString()
  {
    return "GPSBean [lat=" + this.a + ", lon=" + this.b + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */