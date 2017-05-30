package org.c.a.e.a;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.c.a.e.b;
import org.c.a.e.c;
import org.c.f.a.k;

public class f
  extends a
{
  public f(k paramk)
  {
    super(paramk);
  }
  
  protected Collection<org.c.f.a.d> b(org.c.a.e.d paramd)
  {
    Object localObject = super.b(paramd);
    paramd = ((c)paramd.e(c.class)).a();
    ArrayList localArrayList = new ArrayList();
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      org.c.f.a.d locald = (org.c.f.a.d)((Iterator)localObject).next();
      if (Arrays.asList(((b)locald.a(b.class)).a()).contains(paramd)) {
        localArrayList.add(locald);
      }
    }
    return localArrayList;
  }
  
  protected Collection<Field> c(org.c.a.e.d paramd)
  {
    Object localObject = super.c(paramd);
    paramd = ((c)paramd.e(c.class)).a();
    ArrayList localArrayList = new ArrayList();
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Field localField = (Field)((Iterator)localObject).next();
      if (Arrays.asList(((org.c.a.e.a)localField.getAnnotation(org.c.a.e.a.class)).a()).contains(paramd)) {
        localArrayList.add(localField);
      }
    }
    return localArrayList;
  }
  
  protected Collection<Field> d(org.c.a.e.d paramd)
  {
    Object localObject = super.d(paramd);
    paramd = ((c)paramd.e(c.class)).a();
    ArrayList localArrayList = new ArrayList();
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Field localField = (Field)((Iterator)localObject).next();
      if (Arrays.asList(((b)localField.getAnnotation(b.class)).a()).contains(paramd)) {
        localArrayList.add(localField);
      }
    }
    return localArrayList;
  }
  
  protected Collection<org.c.f.a.d> e(org.c.a.e.d paramd)
  {
    Object localObject = super.e(paramd);
    paramd = ((c)paramd.e(c.class)).a();
    ArrayList localArrayList = new ArrayList();
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      org.c.f.a.d locald = (org.c.f.a.d)((Iterator)localObject).next();
      if (Arrays.asList(((org.c.a.e.a)locald.a(org.c.a.e.a.class)).a()).contains(paramd)) {
        localArrayList.add(locald);
      }
    }
    return localArrayList;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/a/e/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */