package org.c.d;

import java.util.List;
import org.c.b.b;
import org.c.e;
import org.c.e.c;
import org.c.f.a.j;

public abstract class m
  implements l
{
  private void a(Throwable paramThrowable, c paramc, List<Throwable> paramList)
  {
    try
    {
      a(paramThrowable, paramc);
      return;
    }
    catch (Throwable paramThrowable)
    {
      paramList.add(paramThrowable);
    }
  }
  
  private void a(b paramb, c paramc, List<Throwable> paramList)
  {
    try
    {
      if ((paramb instanceof e))
      {
        a((e)paramb, paramc);
        return;
      }
      a(paramb, paramc);
      return;
    }
    catch (Throwable paramb)
    {
      paramList.add(paramb);
    }
  }
  
  private void a(c paramc, List<Throwable> paramList)
  {
    try
    {
      c(paramc);
      return;
    }
    catch (Throwable paramc)
    {
      paramList.add(paramc);
    }
  }
  
  private void b(c paramc, List<Throwable> paramList)
  {
    try
    {
      a(paramc);
      return;
    }
    catch (Throwable paramc)
    {
      paramList.add(paramc);
    }
  }
  
  private void c(c paramc, List<Throwable> paramList)
  {
    try
    {
      b(paramc);
      return;
    }
    catch (Throwable paramc)
    {
      paramList.add(paramc);
    }
  }
  
  public j a(j paramj, c paramc)
  {
    return new m.1(this, paramc, paramj);
  }
  
  protected void a(Throwable paramThrowable, c paramc) {}
  
  @Deprecated
  protected void a(b paramb, c paramc) {}
  
  protected void a(c paramc) {}
  
  protected void a(e parame, c paramc)
  {
    a(parame, paramc);
  }
  
  protected void b(c paramc) {}
  
  protected void c(c paramc) {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/d/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */