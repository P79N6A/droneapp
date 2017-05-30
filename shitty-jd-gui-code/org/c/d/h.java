package org.c.d;

import java.util.Iterator;
import org.c.e.c;
import org.c.f.a.j;

public class h
  extends j
{
  private final j a;
  
  public h(j paramj, Iterable<l> paramIterable, c paramc)
  {
    this.a = a(paramj, paramIterable, paramc);
  }
  
  private static j a(j paramj, Iterable<l> paramIterable, c paramc)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      paramj = ((l)paramIterable.next()).a(paramj, paramc);
    }
    return paramj;
  }
  
  public void a()
  {
    this.a.a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */