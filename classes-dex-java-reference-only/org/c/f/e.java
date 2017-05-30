package org.c.f;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.c.e.l;
import org.c.f.a.k;
import org.c.f.b.b;
import org.c.f.b.c;

public class e
  extends g
{
  private static final c a = new b();
  private static final List<l> b = Collections.emptyList();
  private final List<l> c;
  
  public e(Class<?> paramClass)
  {
    super(paramClass, b);
    paramClass = b(paramClass);
    b localb = (b)j().a(b.class);
    this.c = Collections.unmodifiableList(a(b(), localb.a(), paramClass));
  }
  
  private List<org.c.f.b.d> a(Iterable<Object> paramIterable, String paramString)
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      localArrayList.add(a(paramString, i, paramIterable.next()));
      i += 1;
    }
    return localArrayList;
  }
  
  private List<l> a(Iterable<Object> paramIterable, String paramString, c paramc)
  {
    try
    {
      paramString = a(paramIterable, paramString);
      paramIterable = new ArrayList();
      paramString = paramString.iterator();
      while (paramString.hasNext()) {
        paramIterable.add(paramc.a((org.c.f.b.d)paramString.next()));
      }
      return paramIterable;
    }
    catch (ClassCastException paramIterable)
    {
      throw k();
    }
  }
  
  private org.c.f.b.d a(String paramString, int paramInt, Object paramObject)
  {
    if ((paramObject instanceof Object[])) {}
    for (paramObject = (Object[])paramObject;; paramObject = new Object[] { paramObject }) {
      return a(g(), paramString, paramInt, (Object[])paramObject);
    }
  }
  
  private static org.c.f.b.d a(k paramk, String paramString, int paramInt, Object[] paramArrayOfObject)
  {
    paramString = MessageFormat.format(paramString.replaceAll("\\{index\\}", Integer.toString(paramInt)), paramArrayOfObject);
    return new org.c.f.b.d("[" + paramString + "]", paramk, Arrays.asList(paramArrayOfObject));
  }
  
  private Iterable<Object> b()
  {
    Object localObject = j().a(null, new Object[0]);
    if ((localObject instanceof Iterable)) {
      return (Iterable)localObject;
    }
    if ((localObject instanceof Object[])) {
      return Arrays.asList((Object[])localObject);
    }
    throw k();
  }
  
  private c b(Class<?> paramClass)
  {
    paramClass = (c)paramClass.getAnnotation(c.class);
    if (paramClass == null) {
      return a;
    }
    return (c)paramClass.a().newInstance();
  }
  
  private org.c.f.a.d j()
  {
    Iterator localIterator = g().b(b.class).iterator();
    while (localIterator.hasNext())
    {
      org.c.f.a.d locald = (org.c.f.a.d)localIterator.next();
      if ((locald.g()) && (locald.h())) {
        return locald;
      }
    }
    throw new Exception("No public static parameters method on class " + g().e());
  }
  
  private Exception k()
  {
    return new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", new Object[] { g().e(), j().b() }));
  }
  
  protected List<l> c()
  {
    return this.c;
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.FIELD})
  public static @interface a
  {
    int a() default 0;
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.METHOD})
  public static @interface b
  {
    String a() default "{index}";
  }
  
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface c
  {
    Class<? extends c> a() default b.class;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */