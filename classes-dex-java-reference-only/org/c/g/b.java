package org.c.g;

import java.util.concurrent.ConcurrentHashMap;

public class b
{
  private static final ConcurrentHashMap<f, a> a = new ConcurrentHashMap();
  
  public a a(f paramf)
  {
    Object localObject = (a)a.get(paramf);
    if (localObject != null) {
      return (a)localObject;
    }
    localObject = paramf.a();
    if (localObject == null) {
      throw new IllegalArgumentException("Can't create validator, value is null in annotation " + paramf.getClass().getName());
    }
    try
    {
      a locala = (a)((Class)localObject).newInstance();
      a.putIfAbsent(paramf, locala);
      paramf = (a)a.get(paramf);
      return paramf;
    }
    catch (Exception paramf)
    {
      throw new RuntimeException("Exception received when creating AnnotationValidator class " + ((Class)localObject).getName(), paramf);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */