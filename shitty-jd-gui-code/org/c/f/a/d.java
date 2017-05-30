package org.c.f.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

public class d
  extends c<d>
{
  private final Method a;
  
  public d(Method paramMethod)
  {
    if (paramMethod == null) {
      throw new NullPointerException("FrameworkMethod cannot be created without an underlying method.");
    }
    this.a = paramMethod;
  }
  
  private Class<?>[] j()
  {
    return this.a.getParameterTypes();
  }
  
  public Object a(Object paramObject, Object... paramVarArgs)
  {
    return new d.1(this, paramObject, paramVarArgs).a();
  }
  
  public <T extends Annotation> T a(Class<T> paramClass)
  {
    return this.a.getAnnotation(paramClass);
  }
  
  public void a(boolean paramBoolean, List<Throwable> paramList)
  {
    b(paramBoolean, paramList);
    if (this.a.getParameterTypes().length != 0) {
      paramList.add(new Exception("Method " + this.a.getName() + " should have no parameters"));
    }
  }
  
  @Deprecated
  public boolean a(Type paramType)
  {
    return (j().length == 0) && ((paramType instanceof Class)) && (((Class)paramType).isAssignableFrom(this.a.getReturnType()));
  }
  
  public boolean a(d paramd)
  {
    if (!paramd.b().equals(b())) {}
    while (paramd.j().length != j().length) {
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramd.j().length) {
        break label65;
      }
      if (!paramd.j()[i].equals(j()[i])) {
        break;
      }
      i += 1;
    }
    label65:
    return true;
  }
  
  public Annotation[] a()
  {
    return this.a.getAnnotations();
  }
  
  public String b()
  {
    return this.a.getName();
  }
  
  public void b(List<Throwable> paramList)
  {
    new g(this.a).a(paramList);
  }
  
  public void b(boolean paramBoolean, List<Throwable> paramList)
  {
    if (g() != paramBoolean) {
      if (!paramBoolean) {
        break label177;
      }
    }
    label177:
    for (String str = "should";; str = "should not")
    {
      paramList.add(new Exception("Method " + this.a.getName() + "() " + str + " be static"));
      if (!h()) {
        paramList.add(new Exception("Method " + this.a.getName() + "() should be public"));
      }
      if (this.a.getReturnType() != Void.TYPE) {
        paramList.add(new Exception("Method " + this.a.getName() + "() should be void"));
      }
      return;
    }
  }
  
  protected int c()
  {
    return this.a.getModifiers();
  }
  
  public Method d()
  {
    return this.a;
  }
  
  public Class<?> e()
  {
    return i();
  }
  
  public boolean equals(Object paramObject)
  {
    if (!d.class.isInstance(paramObject)) {
      return false;
    }
    return ((d)paramObject).a.equals(this.a);
  }
  
  public Class<?> f()
  {
    return this.a.getDeclaringClass();
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public Class<?> i()
  {
    return this.a.getReturnType();
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */