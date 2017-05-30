package org.c.e.a;

import java.util.Comparator;
import org.c.e.c;

public class e
  implements Comparator<c>
{
  public static final e a = new e(new e.1());
  private final Comparator<c> b;
  
  public e(Comparator<c> paramComparator)
  {
    this.b = paramComparator;
  }
  
  public int a(c paramc1, c paramc2)
  {
    return this.b.compare(paramc1, paramc2);
  }
  
  public void a(Object paramObject)
  {
    if ((paramObject instanceof d)) {
      ((d)paramObject).a(this);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/e/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */