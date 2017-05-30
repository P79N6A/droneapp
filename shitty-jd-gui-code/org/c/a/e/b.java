package org.c.a.e;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
public @interface b
{
  String[] a() default {};
  
  Class<? extends Throwable>[] b() default {};
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/a/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */