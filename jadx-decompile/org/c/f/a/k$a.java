package org.c.f.a;

import java.lang.reflect.Field;
import java.util.Comparator;

class k$a implements Comparator<Field> {
    private k$a() {
    }

    public int a(Field field, Field field2) {
        return field.getName().compareTo(field2.getName());
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((Field) obj, (Field) obj2);
    }
}
