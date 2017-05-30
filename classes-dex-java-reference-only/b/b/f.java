package b.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.c.e.b.a;
import org.c.e.b.b;

public class f
  extends HashMap<org.c.e.c, i>
{
  private static final f a = new f();
  private static final long serialVersionUID = 1L;
  
  public static f a()
  {
    return a;
  }
  
  public i a(org.c.e.c paramc)
  {
    if (paramc.c()) {
      return b(paramc);
    }
    if (!containsKey(paramc)) {
      put(paramc, b(paramc));
    }
    return (i)get(paramc);
  }
  
  public org.c.e.b.c a(final m paramm, e parame)
  {
    parame = new org.c.e.b.c();
    parame.a(new b()
    {
      public void a(a paramAnonymousa)
      {
        paramm.a(f.this.a(paramAnonymousa.b()), paramAnonymousa.c());
      }
      
      public void a(org.c.e.c paramAnonymousc)
      {
        paramm.a(f.this.a(paramAnonymousc));
      }
      
      public void b(org.c.e.c paramAnonymousc)
      {
        paramm.b(f.this.a(paramAnonymousc));
      }
    });
    return parame;
  }
  
  i b(org.c.e.c paramc)
  {
    if (paramc.d()) {
      return new g(paramc);
    }
    n localn = new n(paramc.a());
    paramc = paramc.b().iterator();
    while (paramc.hasNext()) {
      localn.a(a((org.c.e.c)paramc.next()));
    }
    return localn;
  }
  
  public List<i> c(org.c.e.c paramc)
  {
    if (paramc.d()) {
      return Arrays.asList(new i[] { a(paramc) });
    }
    ArrayList localArrayList = new ArrayList();
    paramc = paramc.b().iterator();
    while (paramc.hasNext()) {
      localArrayList.add(a((org.c.e.c)paramc.next()));
    }
    return localArrayList;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */