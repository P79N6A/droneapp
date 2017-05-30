package org.c.f.a;

import java.lang.annotation.Annotation;

public interface a {
    <T extends Annotation> T a(Class<T> cls);

    Annotation[] a();
}
