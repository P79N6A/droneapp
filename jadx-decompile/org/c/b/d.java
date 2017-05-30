package org.c.b;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.c.c;

public abstract class d {
    private int a(Object obj, Object obj2, String str) {
        if (obj == null) {
            c.a(str + "expected array was null");
        }
        if (obj2 == null) {
            c.a(str + "actual array was null");
        }
        int length = Array.getLength(obj2);
        int length2 = Array.getLength(obj);
        if (length != length2) {
            c.a(str + "array lengths differed, expected.length=" + length2 + " actual.length=" + length);
        }
        return length2;
    }

    private boolean a(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    protected abstract void a(Object obj, Object obj2);

    public void a(String str, Object obj, Object obj2) {
        int i = 0;
        if (obj != obj2) {
            if (!Arrays.deepEquals(new Object[]{obj}, new Object[]{obj2})) {
                String str2 = str == null ? "" : str + ": ";
                int a = a(obj, obj2, str2);
                while (i < a) {
                    Object obj3 = Array.get(obj, i);
                    Object obj4 = Array.get(obj2, i);
                    if (a(obj3) && a(obj4)) {
                        try {
                            a(str, obj3, obj4);
                        } catch (a e) {
                            e.a(i);
                            throw e;
                        }
                    }
                    try {
                        a(obj3, obj4);
                    } catch (AssertionError e2) {
                        throw new a(str2, e2, i);
                    }
                    i++;
                }
            }
        }
    }
}
