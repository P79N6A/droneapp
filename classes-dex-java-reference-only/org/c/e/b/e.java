package org.c.e.b;

import org.c.e.c;
import org.c.e.j;

@b.a
final class e
  extends b
{
  private final b a;
  private final Object b;
  
  e(b paramb, Object paramObject)
  {
    this.a = paramb;
    this.b = paramObject;
  }
  
  public void a(a parama)
  {
    synchronized (this.b)
    {
      this.a.a(parama);
      return;
    }
  }
  
  public void a(c paramc)
  {
    synchronized (this.b)
    {
      this.a.a(paramc);
      return;
    }
  }
  
  public void a(j paramj)
  {
    synchronized (this.b)
    {
      this.a.a(paramj);
      return;
    }
  }
  
  public void b(a parama)
  {
    synchronized (this.b)
    {
      this.a.b(parama);
      return;
    }
  }
  
  public void b(c paramc)
  {
    synchronized (this.b)
    {
      this.a.b(paramc);
      return;
    }
  }
  
  public void c(c paramc)
  {
    synchronized (this.b)
    {
      this.a.c(paramc);
      return;
    }
  }
  
  public void d(c paramc)
  {
    synchronized (this.b)
    {
      this.a.d(paramc);
      return;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    return this.a.equals(((e)paramObject).a);
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    return this.a.toString() + " (with synchronization wrapper)";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/e/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */