package org.b.a;

import org.b.g;
import org.b.h;
import org.b.i;
import org.b.k;

public class j extends h<Object> {
    private final Class<?> a;
    private final Class<?> b;

    public j(Class<?> cls) {
        this.a = cls;
        this.b = c(cls);
    }

    @i
    public static <T> k<T> a(Class<?> cls) {
        return new j(cls);
    }

    @i
    public static <T> k<T> b(Class<T> cls) {
        return new j(cls);
    }

    private static Class<?> c(Class<?> cls) {
        return Boolean.TYPE.equals(cls) ? Boolean.class : Byte.TYPE.equals(cls) ? Byte.class : Character.TYPE.equals(cls) ? Character.class : Double.TYPE.equals(cls) ? Double.class : Float.TYPE.equals(cls) ? Float.class : Integer.TYPE.equals(cls) ? Integer.class : Long.TYPE.equals(cls) ? Long.class : Short.TYPE.equals(cls) ? Short.class : cls;
    }

    public void a(g gVar) {
        gVar.a("an instance of ").a(this.a.getName());
    }

    protected boolean b(Object obj, g gVar) {
        if (obj == null) {
            gVar.a("null");
            return false;
        } else if (this.b.isInstance(obj)) {
            return true;
        } else {
            gVar.a(obj).a(" is a " + obj.getClass().getName());
            return false;
        }
    }
}
