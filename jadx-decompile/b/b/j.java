package b.b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class j extends a implements i {
    private String a;

    public j() {
        this.a = null;
    }

    public j(String str) {
        this.a = str;
    }

    public static void b(byte b, byte b2) {
        a.a(b, b2);
    }

    public static void b(char c, char c2) {
        a.a(c, c2);
    }

    public static void b(double d, double d2, double d3) {
        a.a(d, d2, d3);
    }

    public static void b(float f, float f2, float f3) {
        a.a(f, f2, f3);
    }

    public static void b(int i, int i2) {
        a.a(i, i2);
    }

    public static void b(long j, long j2) {
        a.a(j, j2);
    }

    public static void b(String str, byte b, byte b2) {
        a.a(str, b, b2);
    }

    public static void b(String str, char c, char c2) {
        a.a(str, c, c2);
    }

    public static void b(String str, double d, double d2, double d3) {
        a.a(str, d, d2, d3);
    }

    public static void b(String str, float f, float f2, float f3) {
        a.a(str, f, f2, f3);
    }

    public static void b(String str, int i, int i2) {
        a.a(str, i, i2);
    }

    public static void b(String str, long j, long j2) {
        a.a(str, j, j2);
    }

    public static void b(String str, String str2) {
        a.a(str, str2);
    }

    public static void b(String str, String str2, String str3) {
        a.a(str, str2, str3);
    }

    public static void b(String str, short s, short s2) {
        a.a(str, s, s2);
    }

    public static void b(String str, boolean z, boolean z2) {
        a.a(str, z, z2);
    }

    public static void b(short s, short s2) {
        a.a(s, s2);
    }

    public static void b(boolean z, boolean z2) {
        a.a(z, z2);
    }

    public static void c(Object obj) {
        a.a(obj);
    }

    public static void c(String str) {
        a.a(str);
    }

    public static void c(String str, Object obj) {
        a.a(str, obj);
    }

    public static void c(String str, boolean z) {
        a.a(str, z);
    }

    public static void c(boolean z) {
        a.a(z);
    }

    public static void d(Object obj) {
        a.b(obj);
    }

    public static void d(Object obj, Object obj2) {
        a.a(obj, obj2);
    }

    public static void d(String str) {
        a.b(str);
    }

    public static void d(String str, Object obj) {
        a.b(str, obj);
    }

    public static void d(String str, boolean z) {
        a.b(str, z);
    }

    public static void d(boolean z) {
        a.b(z);
    }

    public static void e(Object obj, Object obj2) {
        a.b(obj, obj2);
    }

    public static void f(Object obj, Object obj2) {
        a.c(obj, obj2);
    }

    public static void g() {
        a.e();
    }

    public static void g(String str, Object obj, Object obj2) {
        a.a(str, obj, obj2);
    }

    public static void h(String str, Object obj, Object obj2) {
        a.b(str, obj, obj2);
    }

    public static void i(String str, Object obj, Object obj2) {
        a.c(str, obj, obj2);
    }

    public static void j(String str, Object obj, Object obj2) {
        a.d(str, obj, obj2);
    }

    public static void k(String str, Object obj, Object obj2) {
        a.e(str, obj, obj2);
    }

    public static String l(String str, Object obj, Object obj2) {
        return a.f(str, obj, obj2);
    }

    public int a() {
        return 1;
    }

    public void a(m mVar) {
        mVar.a(this);
    }

    protected m b() {
        return new m();
    }

    public m c() {
        m b = b();
        a(b);
        return b;
    }

    public void d() {
        Throwable th;
        Throwable th2 = null;
        h();
        try {
            f();
            try {
                i();
            } catch (Throwable th3) {
                th = th3;
                if (null != null) {
                    th = null;
                }
                th2 = th;
            }
        } catch (Throwable th4) {
            if (null == null) {
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }

    public void e(String str) {
        this.a = str;
    }

    protected void f() {
        Method method;
        c("TestCase.fName cannot be null", this.a);
        try {
            method = getClass().getMethod(this.a, (Class[]) null);
        } catch (NoSuchMethodException e) {
            c("Method \"" + this.a + "\" not found");
            method = null;
        }
        if (!Modifier.isPublic(method.getModifiers())) {
            c("Method \"" + this.a + "\" should be public");
        }
        try {
            method.invoke(this, new Object[0]);
        } catch (InvocationTargetException e2) {
            e2.fillInStackTrace();
            throw e2.getTargetException();
        } catch (IllegalAccessException e3) {
            e3.fillInStackTrace();
            throw e3;
        }
    }

    protected void h() {
    }

    protected void i() {
    }

    public String j() {
        return this.a;
    }

    public String toString() {
        return j() + "(" + getClass().getName() + ")";
    }
}
