package org.c.a.a;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.c.b;
import org.c.f;
import org.c.g;

public final class d
  extends org.c.g.a
{
  private static final Set<Class<? extends Annotation>> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Class[] { g.class, b.class, f.class, org.c.a.class })));
  
  private void a(List<Exception> paramList, Class<?> paramClass)
  {
    paramList.add(new Exception(String.format("@%s can not be combined with @Category", new Object[] { paramClass.getSimpleName() })));
  }
  
  public List<Exception> a(org.c.f.a.d paramd)
  {
    ArrayList localArrayList = new ArrayList();
    paramd = paramd.a();
    int j = paramd.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramd[i];
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext())
      {
        Class localClass = (Class)localIterator.next();
        if (((Annotation)localObject).annotationType().isAssignableFrom(localClass)) {
          a(localArrayList, localClass);
        }
      }
      i += 1;
    }
    return Collections.unmodifiableList(localArrayList);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */