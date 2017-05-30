package org.c.b.d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.c.b.b;
import org.c.e.b.a;

@Deprecated
public class g
{
  private final Object a;
  private final org.c.e.b.c b;
  private final org.c.e.c c;
  private k d;
  
  public g(Object paramObject, k paramk, org.c.e.b.c paramc, org.c.e.c paramc1)
  {
    this.a = paramObject;
    this.b = paramc;
    this.c = paramc1;
    this.d = paramk;
  }
  
  private void a(long paramLong)
  {
    a(new g.1(this, paramLong));
  }
  
  private void d()
  {
    try
    {
      Iterator localIterator = this.d.e().iterator();
      while (localIterator.hasNext()) {
        ((Method)localIterator.next()).invoke(this.a, new Object[0]);
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
  
  private void e()
  {
    Iterator localIterator = this.d.f().iterator();
    while (localIterator.hasNext())
    {
      Method localMethod = (Method)localIterator.next();
      try
      {
        localMethod.invoke(this.a, new Object[0]);
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
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	org/c/b/d/g:d	Lorg/c/b/d/k;
    //   4: invokevirtual 85	org/c/b/d/k:a	()Z
    //   7: ifeq +15 -> 22
    //   10: aload_0
    //   11: getfield 22	org/c/b/d/g:b	Lorg/c/e/b/c;
    //   14: aload_0
    //   15: getfield 24	org/c/b/d/g:c	Lorg/c/e/c;
    //   18: invokevirtual 90	org/c/e/b/c:c	(Lorg/c/e/c;)V
    //   21: return
    //   22: aload_0
    //   23: getfield 22	org/c/b/d/g:b	Lorg/c/e/b/c;
    //   26: aload_0
    //   27: getfield 24	org/c/b/d/g:c	Lorg/c/e/c;
    //   30: invokevirtual 92	org/c/e/b/c:b	(Lorg/c/e/c;)V
    //   33: aload_0
    //   34: getfield 26	org/c/b/d/g:d	Lorg/c/b/d/k;
    //   37: invokevirtual 95	org/c/b/d/k:b	()J
    //   40: lstore_1
    //   41: lload_1
    //   42: lconst_0
    //   43: lcmp
    //   44: ifle +20 -> 64
    //   47: aload_0
    //   48: lload_1
    //   49: invokespecial 97	org/c/b/d/g:a	(J)V
    //   52: aload_0
    //   53: getfield 22	org/c/b/d/g:b	Lorg/c/e/b/c;
    //   56: aload_0
    //   57: getfield 24	org/c/b/d/g:c	Lorg/c/e/c;
    //   60: invokevirtual 99	org/c/e/b/c:d	(Lorg/c/e/c;)V
    //   63: return
    //   64: aload_0
    //   65: invokevirtual 101	org/c/b/d/g:b	()V
    //   68: goto -16 -> 52
    //   71: astore_3
    //   72: aload_0
    //   73: getfield 22	org/c/b/d/g:b	Lorg/c/e/b/c;
    //   76: aload_0
    //   77: getfield 24	org/c/b/d/g:c	Lorg/c/e/c;
    //   80: invokevirtual 99	org/c/e/b/c:d	(Lorg/c/e/c;)V
    //   83: aload_3
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	g
    //   40	9	1	l	long
    //   71	13	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   33	41	71	finally
    //   47	52	71	finally
    //   64	68	71	finally
  }
  
  public void a(Runnable paramRunnable)
  {
    try
    {
      d();
      paramRunnable.run();
      return;
    }
    catch (c paramRunnable) {}catch (Exception paramRunnable)
    {
      throw new RuntimeException("test should never throw an exception to this level");
    }
    finally
    {
      e();
    }
  }
  
  protected void a(Throwable paramThrowable)
  {
    this.b.a(new a(this.c, paramThrowable));
  }
  
  public void b()
  {
    a(new g.2(this));
  }
  
  protected void c()
  {
    try
    {
      this.d.a(this.a);
      if (this.d.d()) {
        a(new AssertionError("Expected exception: " + this.d.c().getName()));
      }
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Throwable localThrowable1;
      do
      {
        do
        {
          localThrowable1 = localInvocationTargetException.getTargetException();
        } while ((localThrowable1 instanceof b));
        if (!this.d.d())
        {
          a(localThrowable1);
          return;
        }
      } while (!this.d.a(localThrowable1));
      a(new Exception("Unexpected exception, expected<" + this.d.c().getName() + "> but was<" + localThrowable1.getClass().getName() + ">", localThrowable1));
      return;
    }
    catch (Throwable localThrowable2)
    {
      a(localThrowable2);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */