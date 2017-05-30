package org.c.a.e.b;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.c.a.e.f;

@Target({ElementType.PARAMETER})
@f(a = b.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface a {
    int[] a();
}
