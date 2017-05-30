package org.c.b.d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.c.b.b;

@Deprecated
public class a
{
  private org.c.e.b.c a;
  private j b;
  private org.c.e.c c;
  private final Runnable d;
  
  public a(org.c.e.b.c paramc, j paramj, org.c.e.c paramc1, Runnable paramRunnable)
  {
    this.a = paramc;
    this.b = paramj;
    this.c = paramc1;
    this.d = paramRunnable;
  }
  
  private void c()
  {
    try
    {
      Iterator localIterator = this.b.b().iterator();
      while (localIterator.hasNext()) {
        ((Method)localIterator.next()).invoke(null, new Object[0]);
      }
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw localInvocationTargetException.getTargetException();
    }
    catch (b localb)
    {
      throw new c();
    }
    catch (Throwable localThrowable)
    {
      a(localThrowable);
      throw new c();
    }
  }
  
  private void d()
  {
    Iterator localIterator = this.b.c().iterator();
    while (localIterator.hasNext())
    {
      Method localMethod = (Method)localIterator.next();
      try
      {
        localMethod.invoke(null, new Object[0]);
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        a(localInvocationTargetException.getTargetException());
      }
      catch (Throwable localThrowable)
      {
        a(localThrowable);
      }
    }
  }
  
  protected void a()
  {
    this.d.run();
  }
  
  protected void a(Throwable paramThrowable)
  {
    this.a.a(new org.c.e.b.a(this.c, paramThrowable));
  }
  
  public void b()
  {
    try
    {
      c();
      a();
      d();
      return;
    }
    catch (c localc)
    {
      localc = localc;
      d();
      return;
    }
    finally
    {
      localObject = finally;
      d();
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */