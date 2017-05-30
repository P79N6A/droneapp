package org.codehaus.jackson.annotate;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
@JacksonAnnotation
public @interface JsonContentClass
{
  Class<?> value();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/codehaus/jackson/annotate/JsonContentClass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */