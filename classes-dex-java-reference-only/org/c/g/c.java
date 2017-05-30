package org.c.g;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.c.f.a.d;
import org.c.f.a.k;

public final class c
  implements e
{
  private static final List<a<?>> a = Arrays.asList(new a[] { new b(null), new d(null), new c(null) });
  
  public List<Exception> a(k paramk)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      localArrayList.addAll(((a)localIterator.next()).b(paramk));
    }
    return localArrayList;
  }
  
  private static abstract class a<T extends org.c.f.a.a>
  {
    private static final b a = new b();
    
    private List<Exception> a(T paramT)
    {
      ArrayList localArrayList = new ArrayList();
      Annotation[] arrayOfAnnotation = paramT.a();
      int j = arrayOfAnnotation.length;
      int i = 0;
      while (i < j)
      {
        f localf = (f)arrayOfAnnotation[i].annotationType().getAnnotation(f.class);
        if (localf != null) {
          localArrayList.addAll(a(a.a(localf), paramT));
        }
        i += 1;
      }
      return localArrayList;
    }
    
    abstract Iterable<T> a(k paramk);
    
    abstract List<Exception> a(a parama, T paramT);
    
    public List<Exception> b(k paramk)
    {
      ArrayList localArrayList = new ArrayList();
      paramk = a(paramk).iterator();
      while (paramk.hasNext()) {
        localArrayList.addAll(a((org.c.f.a.a)paramk.next()));
      }
      return localArrayList;
    }
  }
  
  private static class b
    extends c.a<k>
  {
    private b()
    {
      super();
    }
    
    Iterable<k> a(k paramk)
    {
      return Collections.singletonList(paramk);
    }
    
    List<Exception> a(a parama, k paramk)
    {
      return parama.a(paramk);
    }
  }
  
  private static class c
    extends c.a<org.c.f.a.b>
  {
    private c()
    {
      super();
    }
    
    Iterable<org.c.f.a.b> a(k paramk)
    {
      return paramk.c();
    }
    
    List<Exception> a(a parama, org.c.f.a.b paramb)
    {
      return parama.a(paramb);
    }
  }
  
  private static class d
    extends c.a<d>
  {
    private d()
    {
      super();
    }
    
    Iterable<d> a(k paramk)
    {
      return paramk.b();
    }
    
    List<Exception> a(a parama, d paramd)
    {
      return parama.a(paramd);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */