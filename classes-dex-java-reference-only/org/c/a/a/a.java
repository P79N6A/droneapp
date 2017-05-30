package org.c.a.a;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.c.f.a.e;
import org.c.f.a.h;
import org.c.f.g;

public class a
  extends g
{
  public a(Class<?> paramClass, h paramh)
  {
    super(paramClass, paramh);
    try
    {
      paramh = b(paramClass);
      Set localSet = d(paramClass);
      a(a.a(c(paramClass), paramh, e(paramClass), localSet));
      a(d());
      return;
    }
    catch (org.c.e.a.c paramClass)
    {
      throw new e(paramClass);
    }
  }
  
  private static void a(org.c.e.c paramc)
  {
    if (!c(paramc)) {
      b(paramc);
    }
    paramc = paramc.b().iterator();
    while (paramc.hasNext()) {
      a((org.c.e.c)paramc.next());
    }
  }
  
  private static Set<Class<?>> b(Class<?> paramClass)
  {
    paramClass = (c)paramClass.getAnnotation(c.class);
    if (paramClass == null) {}
    for (paramClass = null;; paramClass = paramClass.a()) {
      return b(paramClass);
    }
  }
  
  private static Set<Class<?>> b(Class<?>... paramVarArgs)
  {
    HashSet localHashSet = new HashSet();
    if (paramVarArgs != null) {
      Collections.addAll(localHashSet, paramVarArgs);
    }
    return localHashSet;
  }
  
  private static void b(org.c.e.c paramc)
  {
    paramc = paramc.b().iterator();
    while (paramc.hasNext())
    {
      org.c.e.c localc = (org.c.e.c)paramc.next();
      if (localc.b(b.class) != null) {
        throw new e("Category annotations on Parameterized classes are not supported on individual methods.");
      }
      b(localc);
    }
  }
  
  private static boolean b(Set<Class<?>> paramSet, Class<?> paramClass)
  {
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      if (paramClass.isAssignableFrom((Class)paramSet.next())) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean c(Class<?> paramClass)
  {
    paramClass = (c)paramClass.getAnnotation(c.class);
    return (paramClass == null) || (paramClass.b());
  }
  
  private static boolean c(org.c.e.c paramc)
  {
    paramc = paramc.b().iterator();
    while (paramc.hasNext()) {
      if (((org.c.e.c)paramc.next()).i() == null) {
        return false;
      }
    }
    return true;
  }
  
  private static Set<Class<?>> d(Class<?> paramClass)
  {
    paramClass = (b)paramClass.getAnnotation(b.class);
    if (paramClass == null) {}
    for (paramClass = null;; paramClass = paramClass.a()) {
      return b(paramClass);
    }
  }
  
  private static boolean e(Class<?> paramClass)
  {
    paramClass = (b)paramClass.getAnnotation(b.class);
    return (paramClass == null) || (paramClass.b());
  }
  
  public static class a
    extends org.c.e.a.a
  {
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final boolean d;
    private final boolean e;
    
    protected a(boolean paramBoolean1, Set<Class<?>> paramSet1, boolean paramBoolean2, Set<Class<?>> paramSet2)
    {
      this.d = paramBoolean1;
      this.e = paramBoolean2;
      this.b = a(paramSet1);
      this.c = a(paramSet2);
    }
    
    private static Set<Class<?>> a(Set<Class<?>> paramSet)
    {
      HashSet localHashSet = new HashSet();
      if (paramSet != null) {
        localHashSet.addAll(paramSet);
      }
      localHashSet.remove(null);
      return localHashSet;
    }
    
    public static a a(Class<?> paramClass)
    {
      return a(true, new Class[] { paramClass });
    }
    
    public static a a(boolean paramBoolean1, Set<Class<?>> paramSet1, boolean paramBoolean2, Set<Class<?>> paramSet2)
    {
      return new a(paramBoolean1, paramSet1, paramBoolean2, paramSet2);
    }
    
    public static a a(boolean paramBoolean, Class<?>... paramVarArgs)
    {
      if (c(paramVarArgs)) {
        throw new NullPointerException("has null category");
      }
      return a(paramBoolean, a.a(paramVarArgs), true, null);
    }
    
    public static a a(Class<?>... paramVarArgs)
    {
      return a(true, paramVarArgs);
    }
    
    private boolean a(Set<Class<?>> paramSet1, Set<Class<?>> paramSet2)
    {
      paramSet2 = paramSet2.iterator();
      while (paramSet2.hasNext()) {
        if (a.a(paramSet1, (Class)paramSet2.next())) {
          return true;
        }
      }
      return false;
    }
    
    public static a b(Class<?> paramClass)
    {
      return b(true, new Class[] { paramClass });
    }
    
    public static a b(boolean paramBoolean, Class<?>... paramVarArgs)
    {
      if (c(paramVarArgs)) {
        throw new NullPointerException("has null category");
      }
      return a(true, null, paramBoolean, a.a(paramVarArgs));
    }
    
    public static a b(Class<?>... paramVarArgs)
    {
      return b(true, paramVarArgs);
    }
    
    private boolean b(Set<Class<?>> paramSet1, Set<Class<?>> paramSet2)
    {
      paramSet2 = paramSet2.iterator();
      while (paramSet2.hasNext()) {
        if (!a.a(paramSet1, (Class)paramSet2.next())) {
          return false;
        }
      }
      return true;
    }
    
    private boolean c(org.c.e.c paramc)
    {
      boolean bool = false;
      paramc = d(paramc);
      if (paramc.isEmpty()) {
        bool = this.b.isEmpty();
      }
      do
      {
        return bool;
        if (this.c.isEmpty()) {
          break;
        }
        if (!this.e) {
          break label73;
        }
      } while (a(paramc, this.c));
      while (this.b.isEmpty())
      {
        return true;
        label73:
        if (b(paramc, this.c)) {
          return false;
        }
      }
      if (this.d) {
        return a(paramc, this.b);
      }
      return b(paramc, this.b);
    }
    
    private static boolean c(Class<?>... paramVarArgs)
    {
      if (paramVarArgs == null) {}
      for (;;)
      {
        return false;
        int j = paramVarArgs.length;
        int i = 0;
        while (i < j)
        {
          if (paramVarArgs[i] == null) {
            return true;
          }
          i += 1;
        }
      }
    }
    
    private static Set<Class<?>> d(org.c.e.c paramc)
    {
      HashSet localHashSet = new HashSet();
      Collections.addAll(localHashSet, f(paramc));
      Collections.addAll(localHashSet, f(e(paramc)));
      return localHashSet;
    }
    
    private static org.c.e.c e(org.c.e.c paramc)
    {
      paramc = paramc.i();
      if (paramc == null) {
        return null;
      }
      return org.c.e.c.a(paramc);
    }
    
    private static Class<?>[] f(org.c.e.c paramc)
    {
      if (paramc == null) {
        return new Class[0];
      }
      paramc = (b)paramc.b(b.class);
      if (paramc == null) {
        return new Class[0];
      }
      return paramc.a();
    }
    
    public String a()
    {
      return toString();
    }
    
    public boolean a(org.c.e.c paramc)
    {
      if (c(paramc)) {
        return true;
      }
      paramc = paramc.b().iterator();
      while (paramc.hasNext()) {
        if (a((org.c.e.c)paramc.next())) {
          return true;
        }
      }
      return false;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("categories ");
      if (this.b.isEmpty()) {}
      for (Object localObject = "[all]";; localObject = this.b)
      {
        localObject = localStringBuilder.append(localObject);
        if (!this.c.isEmpty()) {
          ((StringBuilder)localObject).append(" - ").append(this.c);
        }
        return ((StringBuilder)localObject).toString();
      }
    }
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  public static @interface b
  {
    Class<?>[] a() default {};
    
    boolean b() default true;
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  public static @interface c
  {
    Class<?>[] a() default {};
    
    boolean b() default true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */