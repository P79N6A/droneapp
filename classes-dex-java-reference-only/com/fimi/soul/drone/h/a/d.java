package com.fimi.soul.drone.h.a;

public abstract class d
  implements Comparable<d>
{
  protected c a;
  
  public d(c paramc)
  {
    this.a = paramc;
  }
  
  public d(d paramd)
  {
    this(paramd.a);
  }
  
  public c a()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */