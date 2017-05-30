package org.c.b;

public class c {
    public static Class<?> a(String str) {
        return Class.forName(str, true, Thread.currentThread().getContextClassLoader());
    }
}
