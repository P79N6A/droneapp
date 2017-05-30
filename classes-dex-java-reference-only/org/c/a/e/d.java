package org.c.a.e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class d
{
  private static final Map<Class<?>, Class<?>> a = ;
  private final Class<?> b;
  private final Annotation[] c;
  
  private d(Class<?> paramClass, Annotation[] paramArrayOfAnnotation)
  {
    this.b = paramClass;
    this.c = paramArrayOfAnnotation;
  }
  
  private <T extends Annotation> T a(Annotation[] paramArrayOfAnnotation, Class<T> paramClass, int paramInt)
  {
    if (paramInt == 0) {}
    for (;;)
    {
      return null;
      int j = paramArrayOfAnnotation.length;
      int i = 0;
      while (i < j)
      {
        Annotation localAnnotation = paramArrayOfAnnotation[i];
        if (paramClass.isInstance(localAnnotation)) {
          return (Annotation)paramClass.cast(localAnnotation);
        }
        localAnnotation = a(localAnnotation.annotationType().getAnnotations(), paramClass, paramInt - 1);
        if (localAnnotation != null) {
          return (Annotation)paramClass.cast(localAnnotation);
        }
        i += 1;
      }
    }
  }
  
  public static ArrayList<d> a(Method paramMethod)
  {
    return a(paramMethod.getParameterTypes(), paramMethod.getParameterAnnotations());
  }
  
  private static ArrayList<d> a(Class<?>[] paramArrayOfClass, Annotation[][] paramArrayOfAnnotation)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramArrayOfClass.length)
    {
      localArrayList.add(new d(paramArrayOfClass[i], paramArrayOfAnnotation[i]));
      i += 1;
    }
    return localArrayList;
  }
  
  public static List<d> a(Constructor<?> paramConstructor)
  {
    return a(paramConstructor.getParameterTypes(), paramConstructor.getParameterAnnotations());
  }
  
  private static <T> void a(Map<T, T> paramMap, T paramT1, T paramT2)
  {
    paramMap.put(paramT1, paramT2);
    paramMap.put(paramT2, paramT1);
  }
  
  private boolean a(Class<?> paramClass1, Class<?> paramClass2)
  {
    if (a.containsKey(paramClass2)) {
      return paramClass1.isAssignableFrom((Class)a.get(paramClass2));
    }
    return false;
  }
  
  private static Map<Class<?>, Class<?>> c()
  {
    HashMap localHashMap = new HashMap();
    a(localHashMap, Boolean.TYPE, Boolean.class);
    a(localHashMap, Byte.TYPE, Byte.class);
    a(localHashMap, Short.TYPE, Short.class);
    a(localHashMap, Character.TYPE, Character.class);
    a(localHashMap, Integer.TYPE, Integer.class);
    a(localHashMap, Long.TYPE, Long.class);
    a(localHashMap, Float.TYPE, Float.class);
    a(localHashMap, Double.TYPE, Double.class);
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public Class<?> a()
  {
    return this.b;
  }
  
  public boolean a(Class<?> paramClass)
  {
    return (this.b.isAssignableFrom(paramClass)) || (a(this.b, paramClass));
  }
  
  public boolean a(Object paramObject)
  {
    if (paramObject == null) {
      return !this.b.isPrimitive();
    }
    return a(paramObject.getClass());
  }
  
  public List<Annotation> b()
  {
    return Arrays.asList(this.c);
  }
  
  public boolean b(Class<?> paramClass)
  {
    return (paramClass.isAssignableFrom(this.b)) || (a(paramClass, this.b)) || (a(paramClass));
  }
  
  public boolean c(Class<? extends Annotation> paramClass)
  {
    return e(paramClass) != null;
  }
  
  public <T extends Annotation> T d(Class<T> paramClass)
  {
    return a(this.c, paramClass, 3);
  }
  
  public <T extends Annotation> T e(Class<T> paramClass)
  {
    Iterator localIterator = b().iterator();
    while (localIterator.hasNext())
    {
      Annotation localAnnotation = (Annotation)localIterator.next();
      if (paramClass.isInstance(localAnnotation)) {
        return (Annotation)paramClass.cast(localAnnotation);
      }
    }
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/a/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */