package org.c.a.e.a;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.c.a.e.e;
import org.c.a.e.g;
import org.c.a.e.g.a;
import org.c.f.a.k;

public class a
  extends e
{
  private final k a;
  
  public a(k paramk)
  {
    this.a = paramk;
  }
  
  private Object a(Field paramField)
  {
    try
    {
      paramField = paramField.get(null);
      return paramField;
    }
    catch (IllegalArgumentException paramField)
    {
      throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
    }
    catch (IllegalAccessException paramField)
    {
      throw new RuntimeException("unexpected: getFields returned an inaccessible field");
    }
  }
  
  private void a(Class<?> paramClass, org.c.a.e.d paramd, String paramString, List<g> paramList, Object paramObject)
  {
    if (paramClass.isArray()) {
      a(paramd, paramString, paramList, paramObject);
    }
    while (!Iterable.class.isAssignableFrom(paramClass)) {
      return;
    }
    a(paramd, paramString, paramList, (Iterable)paramObject);
  }
  
  private void a(org.c.a.e.d paramd, String paramString, List<g> paramList, Iterable<?> paramIterable)
  {
    paramIterable = paramIterable.iterator();
    int i = 0;
    while (paramIterable.hasNext())
    {
      Object localObject = paramIterable.next();
      if (paramd.a(localObject)) {
        paramList.add(g.a(paramString + "[" + i + "]", localObject));
      }
      i += 1;
    }
  }
  
  private void a(org.c.a.e.d paramd, String paramString, List<g> paramList, Object paramObject)
  {
    int i = 0;
    while (i < Array.getLength(paramObject))
    {
      Object localObject = Array.get(paramObject, i);
      if (paramd.a(localObject)) {
        paramList.add(g.a(paramString + "[" + i + "]", localObject));
      }
      i += 1;
    }
  }
  
  private void a(org.c.a.e.d paramd, List<g> paramList)
  {
    Iterator localIterator = b(paramd).iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label121;
      }
      org.c.f.a.d locald = (org.c.f.a.d)localIterator.next();
      Class localClass = locald.i();
      if (((localClass.isArray()) && (paramd.b(localClass.getComponentType()))) || (Iterable.class.isAssignableFrom(localClass))) {
        try
        {
          a(localClass, paramd, locald.b(), paramList, locald.a(null, new Object[0]));
        }
        catch (Throwable paramd)
        {
          paramList = (org.c.a.e.b)locald.a(org.c.a.e.b.class);
          if (paramList == null) {
            break label122;
          }
        }
      }
    }
    if (b(paramList.b(), paramd)) {
      label121:
      return;
    }
    label122:
    throw paramd;
  }
  
  private void b(org.c.a.e.d paramd, List<g> paramList)
  {
    Iterator localIterator = e(paramd).iterator();
    while (localIterator.hasNext())
    {
      org.c.f.a.d locald = (org.c.f.a.d)localIterator.next();
      if (paramd.a(locald.e())) {
        paramList.add(new a(locald, null));
      }
    }
  }
  
  private static boolean b(Class<?>[] paramArrayOfClass, Object paramObject)
  {
    boolean bool2 = false;
    int j = paramArrayOfClass.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (paramArrayOfClass[i].isAssignableFrom(paramObject.getClass())) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  private void c(org.c.a.e.d paramd, List<g> paramList)
  {
    Iterator localIterator = d(paramd).iterator();
    while (localIterator.hasNext())
    {
      Field localField = (Field)localIterator.next();
      a(localField.getType(), paramd, localField.getName(), paramList, a(localField));
    }
  }
  
  private void d(org.c.a.e.d paramd, List<g> paramList)
  {
    Iterator localIterator = c(paramd).iterator();
    while (localIterator.hasNext())
    {
      Field localField = (Field)localIterator.next();
      Object localObject = a(localField);
      if (paramd.a(localObject)) {
        paramList.add(g.a(localField.getName(), localObject));
      }
    }
  }
  
  public List<g> a(org.c.a.e.d paramd)
  {
    ArrayList localArrayList = new ArrayList();
    d(paramd, localArrayList);
    c(paramd, localArrayList);
    b(paramd, localArrayList);
    a(paramd, localArrayList);
    return localArrayList;
  }
  
  protected Collection<org.c.f.a.d> b(org.c.a.e.d paramd)
  {
    return this.a.b(org.c.a.e.b.class);
  }
  
  protected Collection<Field> c(org.c.a.e.d paramd)
  {
    Object localObject = this.a.c(org.c.a.e.a.class);
    paramd = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramd.add(((org.c.f.a.b)((Iterator)localObject).next()).d());
    }
    return paramd;
  }
  
  protected Collection<Field> d(org.c.a.e.d paramd)
  {
    Object localObject = this.a.c(org.c.a.e.b.class);
    paramd = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramd.add(((org.c.f.a.b)((Iterator)localObject).next()).d());
    }
    return paramd;
  }
  
  protected Collection<org.c.f.a.d> e(org.c.a.e.d paramd)
  {
    return this.a.b(org.c.a.e.a.class);
  }
  
  static class a
    extends g
  {
    private final org.c.f.a.d a;
    
    private a(org.c.f.a.d paramd)
    {
      this.a = paramd;
    }
    
    public Object a()
    {
      org.c.a.e.a locala;
      try
      {
        Object localObject = this.a.a(null, new Object[0]);
        return localObject;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw new RuntimeException("unexpected: argument length is checked");
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
      }
      catch (Throwable localThrowable)
      {
        locala = (org.c.a.e.a)this.a.a(org.c.a.e.a.class);
        if (locala == null) {
          break label68;
        }
      }
      if (!a.a(locala.b(), localThrowable)) {}
      label68:
      for (boolean bool = true;; bool = false)
      {
        org.c.d.a(bool);
        throw new g.a(localThrowable);
      }
    }
    
    public String b()
    {
      return this.a.b();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/a/e/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */