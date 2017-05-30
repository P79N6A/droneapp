package b.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class m
{
  protected List<k> a = new ArrayList();
  protected List<k> b = new ArrayList();
  protected List<l> c = new ArrayList();
  protected int d = 0;
  private boolean e = false;
  
  private List<l> i()
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(this.c);
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int a()
  {
    try
    {
      int i = this.b.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(i parami)
  {
    Iterator localIterator = i().iterator();
    while (localIterator.hasNext()) {
      ((l)localIterator.next()).a(parami);
    }
  }
  
  public void a(i parami, b paramb)
  {
    try
    {
      this.a.add(new k(parami, paramb));
      Iterator localIterator = i().iterator();
      while (localIterator.hasNext()) {
        ((l)localIterator.next()).a(parami, paramb);
      }
    }
    finally {}
  }
  
  public void a(i parami, h paramh)
  {
    try
    {
      paramh.a();
      return;
    }
    catch (b paramh)
    {
      a(parami, paramh);
      return;
    }
    catch (ThreadDeath parami)
    {
      throw parami;
    }
    catch (Throwable paramh)
    {
      a(parami, paramh);
    }
  }
  
  public void a(i parami, Throwable paramThrowable)
  {
    try
    {
      this.b.add(new k(parami, paramThrowable));
      Iterator localIterator = i().iterator();
      while (localIterator.hasNext()) {
        ((l)localIterator.next()).a(parami, paramThrowable);
      }
    }
    finally {}
  }
  
  protected void a(final j paramj)
  {
    b(paramj);
    a(paramj, new h()
    {
      public void a()
      {
        paramj.d();
      }
    });
    a(paramj);
  }
  
  public void a(l paraml)
  {
    try
    {
      this.c.add(paraml);
      return;
    }
    finally
    {
      paraml = finally;
      throw paraml;
    }
  }
  
  public Enumeration<k> b()
  {
    try
    {
      Enumeration localEnumeration = Collections.enumeration(this.b);
      return localEnumeration;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void b(i parami)
  {
    int i = parami.a();
    try
    {
      this.d = (i + this.d);
      Iterator localIterator = i().iterator();
      while (localIterator.hasNext()) {
        ((l)localIterator.next()).b(parami);
      }
      return;
    }
    finally {}
  }
  
  public void b(l paraml)
  {
    try
    {
      this.c.remove(paraml);
      return;
    }
    finally
    {
      paraml = finally;
      throw paraml;
    }
  }
  
  public int c()
  {
    try
    {
      int i = this.a.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public Enumeration<k> d()
  {
    try
    {
      Enumeration localEnumeration = Collections.enumeration(this.a);
      return localEnumeration;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int e()
  {
    try
    {
      int i = this.d;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean f()
  {
    try
    {
      boolean bool = this.e;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void g()
  {
    try
    {
      this.e = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean h()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 127	b/b/m:c	()I
    //   6: ifne +18 -> 24
    //   9: aload_0
    //   10: invokevirtual 128	b/b/m:a	()I
    //   13: istore_1
    //   14: iload_1
    //   15: ifne +9 -> 24
    //   18: iconst_1
    //   19: istore_2
    //   20: aload_0
    //   21: monitorexit
    //   22: iload_2
    //   23: ireturn
    //   24: iconst_0
    //   25: istore_2
    //   26: goto -6 -> 20
    //   29: astore_3
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_3
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	m
    //   13	2	1	i	int
    //   19	7	2	bool	boolean
    //   29	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	29	finally
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */