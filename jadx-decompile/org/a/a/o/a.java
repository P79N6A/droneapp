package org.a.a.o;

import java.util.Collection;

public class a {
    public static int a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " may not be negative or zero");
    }

    public static long a(long j, String str) {
        if (j > 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " may not be negative or zero");
    }

    public static <T extends CharSequence> T a(T t, String str) {
        if (t == null) {
            throw new IllegalArgumentException(str + " may not be null");
        } else if (!f.a(t)) {
            return t;
        } else {
            throw new IllegalArgumentException(str + " may not be empty");
        }
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str + " may not be null");
    }

    public static <E, T extends Collection<E>> T a(T t, String str) {
        if (t == null) {
            throw new IllegalArgumentException(str + " may not be null");
        } else if (!t.isEmpty()) {
            return t;
        } else {
            throw new IllegalArgumentException(str + " may not be empty");
        }
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static int b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " may not be negative");
    }

    public static long b(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " may not be negative");
    }

    public static <T extends CharSequence> T b(T t, String str) {
        if (t == null) {
            throw new IllegalArgumentException(str + " may not be null");
        } else if (!f.b(t)) {
            return t;
        } else {
            throw new IllegalArgumentException(str + " may not be blank");
        }
    }
}
