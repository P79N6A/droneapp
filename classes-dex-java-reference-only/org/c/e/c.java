package org.c.e;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c
  implements Serializable
{
  public static final c a = new c(null, "No Tests", new Annotation[0]);
  public static final c b = new c(null, "Test mechanism", new Annotation[0]);
  private static final Pattern c = Pattern.compile("([\\s\\S]*)\\((.*)\\)");
  private static final long serialVersionUID = 1L;
  private final Collection<c> d = new ConcurrentLinkedQueue();
  private final String e;
  private final Serializable f;
  private final Annotation[] g;
  private volatile Class<?> h;
  
  private c(Class<?> paramClass, String paramString, Serializable paramSerializable, Annotation... paramVarArgs)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new IllegalArgumentException("The display name must not be empty.");
    }
    if (paramSerializable == null) {
      throw new IllegalArgumentException("The unique id must not be null.");
    }
    this.h = paramClass;
    this.e = paramString;
    this.f = paramSerializable;
    this.g = paramVarArgs;
  }
  
  private c(Class<?> paramClass, String paramString, Annotation... paramVarArgs)
  {
    this(paramClass, paramString, paramString, paramVarArgs);
  }
  
  private String a(int paramInt, String paramString)
  {
    Matcher localMatcher = c.matcher(toString());
    if (localMatcher.matches()) {
      paramString = localMatcher.group(paramInt);
    }
    return paramString;
  }
  
  private static String a(String paramString1, String paramString2)
  {
    return String.format("%s(%s)", new Object[] { paramString1, paramString2 });
  }
  
  public static c a(Class<?> paramClass)
  {
    return new c(paramClass, paramClass.getName(), paramClass.getAnnotations());
  }
  
  public static c a(Class<?> paramClass, String paramString)
  {
    return new c(paramClass, a(paramString, paramClass.getName()), new Annotation[0]);
  }
  
  public static c a(Class<?> paramClass, String paramString, Annotation... paramVarArgs)
  {
    return new c(paramClass, a(paramString, paramClass.getName()), paramVarArgs);
  }
  
  public static c a(String paramString, Serializable paramSerializable, Annotation... paramVarArgs)
  {
    return new c(null, paramString, paramSerializable, paramVarArgs);
  }
  
  public static c a(String paramString1, String paramString2, Serializable paramSerializable)
  {
    return new c(null, a(paramString2, paramString1), paramSerializable, new Annotation[0]);
  }
  
  public static c a(String paramString1, String paramString2, Annotation... paramVarArgs)
  {
    return new c(null, a(paramString2, paramString1), paramVarArgs);
  }
  
  public static c a(String paramString, Annotation... paramVarArgs)
  {
    return new c(null, paramString, paramVarArgs);
  }
  
  public String a()
  {
    return this.e;
  }
  
  public void a(c paramc)
  {
    this.d.add(paramc);
  }
  
  public <T extends Annotation> T b(Class<T> paramClass)
  {
    Annotation[] arrayOfAnnotation = this.g;
    int j = arrayOfAnnotation.length;
    int i = 0;
    while (i < j)
    {
      Annotation localAnnotation = arrayOfAnnotation[i];
      if (localAnnotation.annotationType().equals(paramClass)) {
        return (Annotation)paramClass.cast(localAnnotation);
      }
      i += 1;
    }
    return null;
  }
  
  public ArrayList<c> b()
  {
    return new ArrayList(this.d);
  }
  
  public boolean c()
  {
    return !d();
  }
  
  public boolean d()
  {
    return this.d.isEmpty();
  }
  
  public int e()
  {
    int j;
    if (d())
    {
      j = 1;
      return j;
    }
    Iterator localIterator = this.d.iterator();
    for (int i = 0;; i = ((c)localIterator.next()).e() + i)
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    return this.f.equals(((c)paramObject).f);
  }
  
  public boolean f()
  {
    return equals(a);
  }
  
  public c g()
  {
    return new c(this.h, this.e, this.g);
  }
  
  public Collection<Annotation> h()
  {
    return Arrays.asList(this.g);
  }
  
  public int hashCode()
  {
    return this.f.hashCode();
  }
  
  public Class<?> i()
  {
    Class localClass = null;
    if (this.h != null) {
      localClass = this.h;
    }
    String str;
    do
    {
      return localClass;
      str = j();
    } while (str == null);
    try
    {
      this.h = Class.forName(str, false, getClass().getClassLoader());
      localClass = this.h;
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
  
  public String j()
  {
    if (this.h != null) {
      return this.h.getName();
    }
    return a(2, toString());
  }
  
  public String k()
  {
    return a(1, null);
  }
  
  public String toString()
  {
    return a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */