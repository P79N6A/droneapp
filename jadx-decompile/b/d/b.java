package b.d;

import b.b.i;
import b.b.j;
import b.b.m;
import b.b.n;
import b.c.a;
import b.c.c;
import java.io.PrintStream;

public class b extends a {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    private a h;

    public b() {
        this(System.out);
    }

    public b(a aVar) {
        this.h = aVar;
    }

    public b(PrintStream printStream) {
        this(new a(printStream));
    }

    public static void a(Class<? extends j> cls) {
        c(new n((Class) cls));
    }

    public static void b(String[] strArr) {
        try {
            if (!new b().c(strArr).h()) {
                System.exit(1);
            }
            System.exit(0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(2);
        }
    }

    public static m c(i iVar) {
        return new b().e(iVar);
    }

    public static void d(i iVar) {
        new b().a(iVar, true);
    }

    public m a(i iVar, boolean z) {
        m f = f();
        f.a(this.h);
        long currentTimeMillis = System.currentTimeMillis();
        iVar.a(f);
        this.h.a(f, System.currentTimeMillis() - currentTimeMillis);
        b(z);
        return f;
    }

    protected m a(String str, String str2, boolean z) {
        return a(n.a(g(str).asSubclass(j.class), str2), z);
    }

    public void a(int i, i iVar, Throwable th) {
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    public void a(String str) {
    }

    public void b(String str) {
    }

    protected void b(boolean z) {
        if (z) {
            this.h.a();
            try {
                System.in.read();
            } catch (Exception e) {
            }
        }
    }

    public m c(String[] strArr) {
        String str = "";
        String str2 = "";
        int i = 0;
        boolean z = false;
        while (i < strArr.length) {
            if (strArr[i].equals("-wait")) {
                z = true;
            } else if (strArr[i].equals("-c")) {
                i++;
                str = d(strArr[i]);
            } else if (strArr[i].equals("-m")) {
                i++;
                str2 = strArr[i];
                int lastIndexOf = str2.lastIndexOf(46);
                str = str2.substring(0, lastIndexOf);
                str2 = str2.substring(lastIndexOf + 1);
            } else if (strArr[i].equals("-v")) {
                System.err.println("JUnit " + c.a() + " by Kent Beck and Erich Gamma");
            } else {
                str = strArr[i];
            }
            i++;
        }
        if (str.equals("")) {
            throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
        }
        try {
            return !str2.equals("") ? a(str, str2, z) : a(c(str), z);
        } catch (Exception e) {
            throw new Exception("Could not create and run test suite: " + e);
        }
    }

    public m e(i iVar) {
        return a(iVar, false);
    }

    protected m f() {
        return new m();
    }

    protected void f(String str) {
        System.err.println(str);
        System.exit(1);
    }
}
