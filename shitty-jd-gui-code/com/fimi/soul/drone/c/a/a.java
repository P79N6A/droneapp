package com.fimi.soul.drone.c.a;

public class a
{
  private static final int a = 0;
  private int b;
  
  public a()
  {
    a();
  }
  
  public void a()
  {
    this.b = 0;
  }
  
  public void a(int paramInt)
  {
    this.b = (((paramInt & 0xFF) + this.b) % 65535);
  }
  
  public int b()
  {
    return this.b >> 8 & 0xFF;
  }
  
  public void b(int paramInt)
  {
    paramInt = paramInt & 0xFF ^ this.b & 0xFF;
    paramInt ^= paramInt << 4 & 0xFF;
    this.b = (paramInt >> 4 & 0xF ^ this.b >> 8 & 0xFF ^ paramInt << 8 ^ paramInt << 3);
  }
  
  public int c()
  {
    return this.b & 0xFF;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */