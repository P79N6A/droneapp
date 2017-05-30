package org.c.f;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import org.c.b.a.a;
import org.c.e.l;
import org.c.f.a.e;
import org.c.f.a.h;

public class g
  extends f<l>
{
  private final List<l> a;
  
  protected g(Class<?> paramClass, List<l> paramList)
  {
    super(paramClass);
    this.a = Collections.unmodifiableList(paramList);
  }
  
  public g(Class<?> paramClass, h paramh)
  {
    this(paramh, paramClass, b(paramClass));
  }
  
  protected g(Class<?> paramClass, Class<?>[] paramArrayOfClass)
  {
    this(new a(true), paramClass, paramArrayOfClass);
  }
  
  protected g(h paramh, Class<?> paramClass, Class<?>[] paramArrayOfClass)
  {
    this(paramClass, paramh.a(paramClass, paramArrayOfClass));
  }
  
  public g(h paramh, Class<?>[] paramArrayOfClass)
  {
    this(null, paramh.a(null, paramArrayOfClass));
  }
  
  public static l a()
  {
    try
    {
      g localg = new g((Class)null, new Class[0]);
      return localg;
    }
    catch (e locale)
    {
      throw new RuntimeException("This shouldn't be possible");
    }
  }
  
  private static Class<?>[] b(Class<?> paramClass)
  {
    a locala = (a)paramClass.getAnnotation(a.class);
    if (locala == null) {
      throw new e(String.format("class '%s' must have a SuiteClasses annotation", new Object[] { paramClass.getName() }));
    }
    return locala.a();
  }
  
  protected org.c.e.c a(l paraml)
  {
    return paraml.d();
  }
  
  protected void a(l paraml, org.c.e.b.c paramc)
  {
    paraml.a(paramc);
  }
  
  protected List<l> c()
  {
    return this.a;
  }
  
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface a
  {
    Class<?>[] a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */