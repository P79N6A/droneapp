package org.c;

import org.b.k;
import org.b.l;
import org.c.b.e;
import org.c.b.f;

public class c {
    protected c() {
    }

    private static String a(Object obj, String str) {
        return (obj == null ? "null" : obj.getClass().getName()) + "<" + str + ">";
    }

    public static void a() {
        a(null);
    }

    @Deprecated
    public static void a(double d, double d2) {
        a(null, d, d2);
    }

    public static void a(double d, double d2, double d3) {
        a(null, d, d2, d3);
    }

    public static void a(float f, float f2, float f3) {
        b(null, f, f2, f3);
    }

    public static void a(long j, long j2) {
        a(null, j, j2);
    }

    public static void a(Object obj) {
        a(null, obj);
    }

    public static void a(Object obj, Object obj2) {
        a(null, obj, obj2);
    }

    public static <T> void a(T t, k<? super T> kVar) {
        a("", (Object) t, (k) kVar);
    }

    public static void a(String str) {
        if (str == null) {
            throw new AssertionError();
        }
        throw new AssertionError(str);
    }

    @Deprecated
    public static void a(String str, double d, double d2) {
        a("Use assertEquals(expected, actual, delta) to compare floating-point numbers");
    }

    public static void a(String str, double d, double d2, double d3) {
        if (!c(d, d2, d3)) {
            c(str, Double.valueOf(d2));
        }
    }

    public static void a(String str, float f, float f2, float f3) {
        if (c(f, f2, f3)) {
            h(str, Float.valueOf(f), Float.valueOf(f2));
        }
    }

    public static void a(String str, long j, long j2) {
        if (j == j2) {
            c(str, Long.valueOf(j2));
        }
    }

    public static void a(String str, Object obj) {
        a(str, obj != null);
    }

    public static void a(String str, Object obj, Object obj2) {
        if (!e(obj, obj2)) {
            if ((obj instanceof String) && (obj2 instanceof String)) {
                if (str == null) {
                    str = "";
                }
                throw new i(str, (String) obj, (String) obj2);
            }
            h(str, obj, obj2);
        }
    }

    public static <T> void a(String str, T t, k<? super T> kVar) {
        l.a(str, t, kVar);
    }

    public static void a(String str, boolean z) {
        if (!z) {
            a(str);
        }
    }

    public static void a(String str, byte[] bArr, byte[] bArr2) {
        f(str, bArr, bArr2);
    }

    public static void a(String str, char[] cArr, char[] cArr2) {
        f(str, cArr, cArr2);
    }

    public static void a(String str, double[] dArr, double[] dArr2, double d) {
        new f(d).a(str, dArr, dArr2);
    }

    public static void a(String str, float[] fArr, float[] fArr2, float f) {
        new f(f).a(str, fArr, fArr2);
    }

    public static void a(String str, int[] iArr, int[] iArr2) {
        f(str, iArr, iArr2);
    }

    public static void a(String str, long[] jArr, long[] jArr2) {
        f(str, jArr, jArr2);
    }

    public static void a(String str, Object[] objArr, Object[] objArr2) {
        f(str, objArr, objArr2);
    }

    public static void a(String str, short[] sArr, short[] sArr2) {
        f(str, sArr, sArr2);
    }

    public static void a(String str, boolean[] zArr, boolean[] zArr2) {
        f(str, zArr, zArr2);
    }

    public static void a(boolean z) {
        a(null, z);
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        a(null, bArr, bArr2);
    }

    public static void a(char[] cArr, char[] cArr2) {
        a(null, cArr, cArr2);
    }

    public static void a(double[] dArr, double[] dArr2, double d) {
        a(null, dArr, dArr2, d);
    }

    public static void a(float[] fArr, float[] fArr2, float f) {
        a(null, fArr, fArr2, f);
    }

    public static void a(int[] iArr, int[] iArr2) {
        a(null, iArr, iArr2);
    }

    public static void a(long[] jArr, long[] jArr2) {
        a(null, jArr, jArr2);
    }

    public static void a(Object[] objArr, Object[] objArr2) {
        a(null, objArr, objArr2);
    }

    public static void a(short[] sArr, short[] sArr2) {
        a(null, sArr, sArr2);
    }

    public static void a(boolean[] zArr, boolean[] zArr2) {
        a(null, zArr, zArr2);
    }

    public static void b(double d, double d2, double d3) {
        b(null, d, d2, d3);
    }

    public static void b(float f, float f2, float f3) {
        a(null, f, f2, f3);
    }

    public static void b(long j, long j2) {
        b(null, j, j2);
    }

    public static void b(Object obj) {
        b(null, obj);
    }

    public static void b(Object obj, Object obj2) {
        b(null, obj, obj2);
    }

    private static void b(String str) {
        String str2 = "";
        if (str != null) {
            str2 = str + " ";
        }
        a(str2 + "expected not same");
    }

    public static void b(String str, double d, double d2, double d3) {
        if (c(d, d2, d3)) {
            h(str, Double.valueOf(d), Double.valueOf(d2));
        }
    }

    public static void b(String str, float f, float f2, float f3) {
        if (!c(f, f2, f3)) {
            c(str, Float.valueOf(f2));
        }
    }

    public static void b(String str, long j, long j2) {
        if (j != j2) {
            h(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    public static void b(String str, Object obj) {
        if (obj != null) {
            d(str, obj);
        }
    }

    public static void b(String str, Object obj, Object obj2) {
        if (e(obj, obj2)) {
            c(str, obj2);
        }
    }

    public static void b(String str, boolean z) {
        a(str, !z);
    }

    @Deprecated
    public static void b(String str, Object[] objArr, Object[] objArr2) {
        a(str, objArr, objArr2);
    }

    public static void b(boolean z) {
        b(null, z);
    }

    @Deprecated
    public static void b(Object[] objArr, Object[] objArr2) {
        a(objArr, objArr2);
    }

    public static void c(Object obj, Object obj2) {
        c(null, obj, obj2);
    }

    private static void c(String str, Object obj) {
        String str2 = "Values should be different. ";
        if (str != null) {
            str2 = str + ". ";
        }
        a(str2 + "Actual: " + obj);
    }

    public static void c(String str, Object obj, Object obj2) {
        if (obj != obj2) {
            g(str, obj, obj2);
        }
    }

    private static boolean c(double d, double d2, double d3) {
        return Double.compare(d, d2) != 0 && Math.abs(d - d2) > d3;
    }

    private static boolean c(float f, float f2, float f3) {
        return Float.compare(f, f2) != 0 && Math.abs(f - f2) > f3;
    }

    public static void d(Object obj, Object obj2) {
        d(null, obj, obj2);
    }

    private static void d(String str, Object obj) {
        String str2 = "";
        if (str != null) {
            str2 = str + " ";
        }
        a(str2 + "expected null, but was:<" + obj + ">");
    }

    public static void d(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            b(str);
        }
    }

    static String e(String str, Object obj, Object obj2) {
        String str2 = "";
        if (!(str == null || str.equals(""))) {
            str2 = str + " ";
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        return valueOf.equals(valueOf2) ? str2 + "expected: " + a(obj, valueOf) + " but was: " + a(obj2, valueOf2) : str2 + "expected:<" + valueOf + "> but was:<" + valueOf2 + ">";
    }

    private static boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : f(obj, obj2);
    }

    private static void f(String str, Object obj, Object obj2) {
        new e().a(str, obj, obj2);
    }

    private static boolean f(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    private static void g(String str, Object obj, Object obj2) {
        String str2 = "";
        if (str != null) {
            str2 = str + " ";
        }
        a(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    private static void h(String str, Object obj, Object obj2) {
        a(e(str, obj, obj2));
    }
}
