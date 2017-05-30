package b.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.c.e.a.a;
import org.c.e.a.d;
import org.c.e.c;
import org.c.e.l;
import org.c.k;

public class e
  implements i, org.c.e.a.b, d, org.c.e.b
{
  private final Class<?> a;
  private final l b;
  private final f c;
  
  public e(Class<?> paramClass)
  {
    this(paramClass, f.a());
  }
  
  public e(Class<?> paramClass, f paramf)
  {
    this.c = paramf;
    this.a = paramClass;
    this.b = org.c.e.i.b(paramClass).a();
  }
  
  private c a(c paramc)
  {
    if (b(paramc)) {
      return c.a;
    }
    c localc1 = paramc.g();
    paramc = paramc.b().iterator();
    while (paramc.hasNext())
    {
      c localc2 = a((c)paramc.next());
      if (!localc2.f()) {
        localc1.a(localc2);
      }
    }
    return localc1;
  }
  
  private boolean b(c paramc)
  {
    return paramc.b(k.class) != null;
  }
  
  public int a()
  {
    return this.b.h();
  }
  
  public void a(m paramm)
  {
    this.b.a(this.c.a(paramm, this));
  }
  
  public void a(a parama)
  {
    parama.a(this.b);
  }
  
  public void a(org.c.e.a.e parame)
  {
    parame.a(this.b);
  }
  
  public List<i> b()
  {
    return this.c.c(d());
  }
  
  public Class<?> c()
  {
    return this.a;
  }
  
  public c d()
  {
    return a(this.b.d());
  }
  
  public String toString()
  {
    return this.a.getName();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */