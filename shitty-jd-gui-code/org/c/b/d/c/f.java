package org.c.b.d.c;

import java.util.Iterator;
import java.util.List;
import org.c.f.a.d;
import org.c.f.a.j;

public class f
  extends j
{
  private final j a;
  private final Object b;
  private final List<d> c;
  
  public f(j paramj, List<d> paramList, Object paramObject)
  {
    this.a = paramj;
    this.c = paramList;
    this.b = paramObject;
  }
  
  public void a()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((d)localIterator.next()).a(this.b, new Object[0]);
    }
    this.a.a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/b/d/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */