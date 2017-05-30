package org.c.a.e;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.c.a.e.a.f;

@Target({ElementType.PARAMETER})
@f(a = f.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface c {
    String a();
}
