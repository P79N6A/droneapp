package org.b;

public class l {
    public static <T> void a(T t, k<? super T> kVar) {
        a("", t, kVar);
    }

    public static <T> void a(String str, T t, k<? super T> kVar) {
        if (!kVar.a(t)) {
            g nVar = new n();
            nVar.a(str).a("\nExpected: ").a((m) kVar).a("\n     but: ");
            kVar.a(t, nVar);
            throw new AssertionError(nVar.toString());
        }
    }

    public static void a(String str, boolean z) {
        if (!z) {
            throw new AssertionError(str);
        }
    }
}
