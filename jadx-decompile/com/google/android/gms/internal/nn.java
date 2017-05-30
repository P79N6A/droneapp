package com.google.android.gms.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public final class nn {
    private final Field a;

    public nn(Field field) {
        op.a((Object) field);
        this.a = field;
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return this.a.getAnnotation(cls);
    }
}
