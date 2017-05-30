package org.a.a.c.f;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.a.a.a.b;

@b
public class e implements d {
    private final Method a;

    public e() {
        try {
            this.a = Class.forName("java.net.IDN").getMethod("toUnicode", new Class[]{String.class});
        } catch (Throwable e) {
            throw new IllegalStateException(e.getMessage(), e);
        } catch (Throwable e2) {
            throw new IllegalStateException(e2.getMessage(), e2);
        }
    }

    public String a(String str) {
        Throwable e;
        try {
            return (String) this.a.invoke(null, new Object[]{str});
        } catch (Throwable e2) {
            throw new IllegalStateException(e2.getMessage(), e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }
}
