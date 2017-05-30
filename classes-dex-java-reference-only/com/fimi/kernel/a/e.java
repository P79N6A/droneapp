package com.fimi.kernel.a;

public class e
{
  public double a;
  public double b;
  
  public e() {}
  
  public e(double paramDouble1, double paramDouble2)
  {
    this.a = paramDouble1;
    this.b = paramDouble2;
  }
  
  public boolean equals(Object paramObject)
  {
    paramObject = (e)paramObject;
    return (this.a == ((e)paramObject).a) && (this.b == ((e)paramObject).b);
  }
  
  public int hashCode()
  {
    return (int)(this.a * this.b) ^ 0x8;
  }
  
  public String toString()
  {
    return "(" + this.a + "," + this.b + ")";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */