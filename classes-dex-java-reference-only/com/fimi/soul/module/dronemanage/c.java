package com.fimi.soul.module.dronemanage;

public class c
{
  private static c a = null;
  private a b = a.b;
  
  public static c a()
  {
    if (a == null) {
      a = new c();
    }
    return a;
  }
  
  public void a(a parama)
  {
    this.b = parama;
  }
  
  public a b()
  {
    return this.b;
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/dronemanage/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */