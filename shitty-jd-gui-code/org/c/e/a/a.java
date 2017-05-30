package org.c.e.a;

import org.c.e.c;

public abstract class a
{
  public static final a a = new a.1();
  
  public static a b(c paramc)
  {
    return new a.2(paramc);
  }
  
  public abstract String a();
  
  public a a(a parama)
  {
    if ((parama == this) || (parama == a)) {
      return this;
    }
    return new a.3(this, this, parama);
  }
  
  public void a(Object paramObject)
  {
    if (!(paramObject instanceof b)) {
      return;
    }
    ((b)paramObject).a(this);
  }
  
  public abstract boolean a(c paramc);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/e/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */