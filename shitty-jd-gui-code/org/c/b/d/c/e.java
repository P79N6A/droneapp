package org.c.b.d.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.c.f.a.d;
import org.c.f.a.f;
import org.c.f.a.j;

public class e
  extends j
{
  private final j a;
  private final Object b;
  private final List<d> c;
  
  public e(j paramj, List<d> paramList, Object paramObject)
  {
    this.a = paramj;
    this.c = paramList;
    this.b = paramObject;
  }
  
  public void a()
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      this.a.a();
      Iterator localIterator1 = this.c.iterator();
      while (localIterator1.hasNext())
      {
        d locald1 = (d)localIterator1.next();
        try
        {
          locald1.a(this.b, new Object[0]);
        }
        catch (Throwable localThrowable2)
        {
          localArrayList.add(localThrowable2);
        }
      }
      Iterator localIterator2;
      d locald2;
      Iterator localIterator3;
      d locald3;
      f.a(localArrayList);
    }
    catch (Throwable localThrowable1)
    {
      localArrayList.add(localThrowable1);
    }
    finally
    {
      localIterator3 = this.c.iterator();
      while (localIterator3.hasNext())
      {
        locald3 = (d)localIterator3.next();
        try
        {
          locald3.a(this.b, new Object[0]);
        }
        catch (Throwable localThrowable4)
        {
          localArrayList.add(localThrowable4);
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/d/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */