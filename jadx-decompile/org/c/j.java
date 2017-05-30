package org.c;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.c.f.d;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface j {
    d a() default d.DEFAULT;
}
