package com.fimi.soul.module.droneTrack;

import java.io.Serializable;

public class b
  implements Serializable
{
  private int a;
  private int b;
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public String toString()
  {
    return this.a + ",           " + this.b + ",           ";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneTrack/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */