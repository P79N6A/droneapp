package org.c;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface m
{
  Class<? extends Throwable> a() default a.class;
  
  long b() default 0L;
  
  public static class a
    extends Throwable
  {
    private static final long serialVersionUID = 1L;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */