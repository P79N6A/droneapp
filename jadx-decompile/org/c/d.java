package org.c;

import java.util.Arrays;
import org.b.k;

public class d {
    public static <T> void a(T t, k<T> kVar) {
        if (!kVar.a(t)) {
            throw new e((Object) t, (k) kVar);
        }
    }

    public static <T> void a(String str, T t, k<T> kVar) {
        if (!kVar.a(t)) {
            throw new e(str, t, kVar);
        }
    }

    public static void a(String str, Throwable th) {
        a(str, th, org.b.d.b());
    }

    public static void a(String str, boolean z) {
        if (!z) {
            throw new e(str);
        }
    }

    public static void a(Throwable th) {
        a((Object) th, org.b.d.b());
    }

    public static void a(boolean z) {
        a(Boolean.valueOf(z), org.b.d.a(Boolean.valueOf(true)));
    }

    public static void a(Object... objArr) {
        a(Arrays.asList(objArr), org.b.d.c(org.b.d.c()));
    }

    public static void b(String str, boolean z) {
        a(str, !z);
    }

    public static void b(boolean z) {
        a(!z);
    }
}
