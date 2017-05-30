package org.c.a.e.b;

import java.util.ArrayList;
import java.util.List;
import org.c.a.e.d;
import org.c.a.e.e;
import org.c.a.e.g;

public class b
  extends e
{
  public List<g> a(d paramd)
  {
    ArrayList localArrayList = new ArrayList();
    paramd = ((a)paramd.e(a.class)).a();
    int j = paramd.length;
    int i = 0;
    while (i < j)
    {
      localArrayList.add(g.a("ints", Integer.valueOf(paramd[i])));
      i += 1;
    }
    return localArrayList;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/a/e/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */