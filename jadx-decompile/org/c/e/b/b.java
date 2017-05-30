package org.c.e.b;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.c.e.c;
import org.c.e.j;

public class b {

    @Documented
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
    }

    public void a(a aVar) {
    }

    public void a(c cVar) {
    }

    public void a(j jVar) {
    }

    public void b(a aVar) {
    }

    public void b(c cVar) {
    }

    public void c(c cVar) {
    }

    public void d(c cVar) {
    }
}
