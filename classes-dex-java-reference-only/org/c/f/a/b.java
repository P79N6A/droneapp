package org.c.f.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class b
  extends c<b>
{
  private final Field a;
  
  b(Field paramField)
  {
    if (paramField == null) {
      throw new NullPointerException("FrameworkField cannot be created without an underlying field.");
    }
    this.a = paramField;
  }
  
  public Object a(Object paramObject)
  {
    return this.a.get(paramObject);
  }
  
  public <T extends Annotation> T a(Class<T> paramClass)
  {
    return this.a.getAnnotation(paramClass);
  }
  
  public boolean a(b paramb)
  {
    return paramb.b().equals(b());
  }
  
  public Annotation[] a()
  {
    return this.a.getAnnotations();
  }
  
  public String b()
  {
    return d().getName();
  }
  
  protected int c()
  {
    return this.a.getModifiers();
  }
  
  public Field d()
  {
    return this.a;
  }
  
  public Class<?> e()
  {
    return this.a.getType();
  }
  
  public Class<?> f()
  {
    return this.a.getDeclaringClass();
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/f/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */