package org.b.a;

import java.lang.reflect.Array;
import org.b.b;
import org.b.g;
import org.b.k;

public class i<T> extends b<T> {
    private final Object a;

    public i(T t) {
        this.a = t;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : (obj2 == null || !c(obj)) ? obj.equals(obj2) : c(obj2) && b(obj, obj2);
    }

    @org.b.i
    public static <T> k<T> b(T t) {
        return new i(t);
    }

    private static boolean b(Object obj, Object obj2) {
        return c(obj, obj2) && d(obj, obj2);
    }

    private static boolean c(Object obj) {
        return obj.getClass().isArray();
    }

    private static boolean c(Object obj, Object obj2) {
        return Array.getLength(obj) == Array.getLength(obj2);
    }

    private static boolean d(Object obj, Object obj2) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            if (!a(Array.get(obj, i), Array.get(obj2, i))) {
                return false;
            }
        }
        return true;
    }

    public void a(g gVar) {
        gVar.a(this.a);
    }

    public boolean a(Object obj) {
        return a(obj, this.a);
    }
}
