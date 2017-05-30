package org.c.b;

public final class k {
    private k() {
    }

    public static Exception a(Throwable th) {
        b(th);
        return null;
    }

    private static <T extends Throwable> void b(Throwable th) {
        throw th;
    }
}
