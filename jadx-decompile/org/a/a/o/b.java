package org.a.a.o;

public class b {
    public static void a(CharSequence charSequence, String str) {
        if (f.a(charSequence)) {
            throw new IllegalStateException(str + " is empty");
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str + " is null");
        }
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void b(CharSequence charSequence, String str) {
        if (f.b(charSequence)) {
            throw new IllegalStateException(str + " is blank");
        }
    }
}
