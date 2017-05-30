package b.b;

@Deprecated
public class a {
    protected a() {
    }

    public static void a(byte b, byte b2) {
        a(null, b, b2);
    }

    public static void a(char c, char c2) {
        a(null, c, c2);
    }

    public static void a(double d, double d2, double d3) {
        a(null, d, d2, d3);
    }

    public static void a(float f, float f2, float f3) {
        a(null, f, f2, f3);
    }

    public static void a(int i, int i2) {
        a(null, i, i2);
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

    public static void a(String str) {
        if (str == null) {
            throw new b();
        }
        throw new b(str);
    }

    public static void a(String str, byte b, byte b2) {
        a(str, Byte.valueOf(b), Byte.valueOf(b2));
    }

    public static void a(String str, char c, char c2) {
        a(str, Character.valueOf(c), Character.valueOf(c2));
    }

    public static void a(String str, double d, double d2, double d3) {
        if (Double.compare(d, d2) != 0 && Math.abs(d - d2) > d3) {
            e(str, new Double(d), new Double(d2));
        }
    }

    public static void a(String str, float f, float f2, float f3) {
        if (Float.compare(f, f2) != 0 && Math.abs(f - f2) > f3) {
            e(str, new Float(f), new Float(f2));
        }
    }

    public static void a(String str, int i, int i2) {
        a(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void a(String str, long j, long j2) {
        a(str, Long.valueOf(j), Long.valueOf(j2));
    }

    public static void a(String str, Object obj) {
        a(str, obj != null);
    }

    public static void a(String str, Object obj, Object obj2) {
        if (obj != null || obj2 != null) {
            if (obj == null || !obj.equals(obj2)) {
                e(str, obj, obj2);
            }
        }
    }

    public static void a(String str, String str2) {
        a(null, str, str2);
    }

    public static void a(String str, String str2, String str3) {
        if (str2 != null || str3 != null) {
            if (str2 == null || !str2.equals(str3)) {
                if (str == null) {
                    str = "";
                }
                throw new d(str, str2, str3);
            }
        }
    }

    public static void a(String str, short s, short s2) {
        a(str, Short.valueOf(s), Short.valueOf(s2));
    }

    public static void a(String str, boolean z) {
        if (!z) {
            a(str);
        }
    }

    public static void a(String str, boolean z, boolean z2) {
        a(str, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public static void a(short s, short s2) {
        a(null, s, s2);
    }

    public static void a(boolean z) {
        a(null, z);
    }

    public static void a(boolean z, boolean z2) {
        a(null, z, z2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            b("Expected: <null> but was: " + obj.toString(), obj);
        }
    }

    public static void b(Object obj, Object obj2) {
        b(null, obj, obj2);
    }

    public static void b(String str) {
        a((str != null ? str + " " : "") + "expected not same");
    }

    public static void b(String str, Object obj) {
        a(str, obj == null);
    }

    public static void b(String str, Object obj, Object obj2) {
        if (obj != obj2) {
            d(str, obj, obj2);
        }
    }

    public static void b(String str, boolean z) {
        a(str, !z);
    }

    public static void b(boolean z) {
        b(null, z);
    }

    public static void c(Object obj, Object obj2) {
        c(null, obj, obj2);
    }

    public static void c(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            b(str);
        }
    }

    public static void d(String str, Object obj, Object obj2) {
        a((str != null ? str + " " : "") + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    public static void e() {
        a(null);
    }

    public static void e(String str, Object obj, Object obj2) {
        a(f(str, obj, obj2));
    }

    public static String f(String str, Object obj, Object obj2) {
        String str2 = "";
        if (str != null && str.length() > 0) {
            str2 = str + " ";
        }
        return str2 + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }
}
