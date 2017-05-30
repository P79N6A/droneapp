package b.c;

import b.b.b;
import b.b.i;
import b.b.l;
import b.b.n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Properties;

public abstract class a implements l {
    public static final String a = "suite";
    static int b;
    static boolean c = true;
    private static Properties e;
    boolean d = true;

    static {
        b = 500;
        b = a("maxmessage", b);
    }

    public static int a(String str, int i) {
        String h = h(str);
        if (h != null) {
            try {
                i = Integer.parseInt(h);
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    public static String a(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return i(stringWriter.toString());
    }

    protected static Properties a() {
        if (e == null) {
            e = new Properties();
            e.put("loading", "true");
            e.put("filterstack", "true");
            g();
        }
        return e;
    }

    public static void a(String str, String str2) {
        a().put(str, str2);
    }

    protected static void a(Properties properties) {
        e = properties;
    }

    public static void b() {
        OutputStream fileOutputStream = new FileOutputStream(f());
        try {
            a().store(fileOutputStream, "");
        } finally {
            fileOutputStream.close();
        }
    }

    public static String e(String str) {
        return (b == -1 || str.length() <= b) ? str : str.substring(0, b) + "...";
    }

    protected static boolean e() {
        return (h("filterstack").equals("true") && c) ? false : true;
    }

    private static File f() {
        return new File(System.getProperty("user.home"), "junit.properties");
    }

    private static void g() {
        InputStream fileInputStream;
        Throwable th;
        InputStream inputStream = null;
        try {
            fileInputStream = new FileInputStream(f());
            try {
                a(new Properties(a()));
                a().load(fileInputStream);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                    }
                }
            } catch (IOException e2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                inputStream = fileInputStream;
                th = th3;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (Throwable th4) {
            th = th4;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static String h(String str) {
        return a().getProperty(str);
    }

    public static String i(String str) {
        if (e()) {
            return str;
        }
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return stringWriter.toString();
                }
                if (!j(readLine)) {
                    printWriter.println(readLine);
                }
            } catch (Exception e) {
                return str;
            }
        }
    }

    static boolean j(String str) {
        String[] strArr = new String[]{"junit.framework.TestCase", "junit.framework.TestResult", "junit.framework.TestSuite", "junit.framework.Assert.", "junit.swingui.TestRunner", "junit.awtui.TestRunner", "junit.textui.TestRunner", "java.lang.reflect.Method.invoke("};
        for (String indexOf : strArr) {
            if (str.indexOf(indexOf) > 0) {
                return true;
            }
        }
        return false;
    }

    public String a(long j) {
        return NumberFormat.getInstance().format(((double) j) / 1000.0d);
    }

    protected String a(String[] strArr) {
        String str = null;
        int i = 0;
        while (i < strArr.length) {
            int i2;
            String str2;
            int i3;
            if (strArr[i].equals("-noloading")) {
                a(false);
                i2 = i;
                str2 = str;
                i3 = i2;
            } else if (strArr[i].equals("-nofilterstack")) {
                c = false;
                i2 = i;
                str2 = str;
                i3 = i2;
            } else if (strArr[i].equals("-c")) {
                if (strArr.length > i + 1) {
                    str = d(strArr[i + 1]);
                } else {
                    System.out.println("Missing Test class name");
                }
                i2 = i + 1;
                str2 = str;
                i3 = i2;
            } else {
                i2 = i;
                str2 = strArr[i];
                i3 = i2;
            }
            i2 = i3 + 1;
            str = str2;
            i = i2;
        }
        return str;
    }

    public abstract void a(int i, i iVar, Throwable th);

    public synchronized void a(i iVar) {
        b(iVar.toString());
    }

    public synchronized void a(i iVar, b bVar) {
        a(2, iVar, bVar);
    }

    public synchronized void a(i iVar, Throwable th) {
        a(1, iVar, th);
    }

    public abstract void a(String str);

    public void a(boolean z) {
        this.d = z;
    }

    public synchronized void b(i iVar) {
        a(iVar.toString());
    }

    public abstract void b(String str);

    public i c(String str) {
        if (str.length() <= 0) {
            c();
            return null;
        }
        try {
            Class g = g(str);
            try {
                Method method = g.getMethod(a, new Class[0]);
                if (Modifier.isStatic(method.getModifiers())) {
                    try {
                        i iVar = (i) method.invoke(null, new Object[0]);
                        if (iVar == null) {
                            return iVar;
                        }
                        c();
                        return iVar;
                    } catch (InvocationTargetException e) {
                        f("Failed to invoke suite():" + e.getTargetException().toString());
                        return null;
                    } catch (IllegalAccessException e2) {
                        f("Failed to invoke suite():" + e2.toString());
                        return null;
                    }
                }
                f("Suite() method must be static");
                return null;
            } catch (Exception e3) {
                c();
                return new n(g);
            }
        } catch (ClassNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null) {
                str = message;
            }
            f("Class not found \"" + str + "\"");
            return null;
        } catch (Exception e5) {
            f("Error: " + e5.toString());
            return null;
        }
    }

    protected void c() {
    }

    public String d(String str) {
        return str.startsWith("Default package for") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    protected boolean d() {
        return h("loading").equals("true") && this.d;
    }

    protected abstract void f(String str);

    protected Class<?> g(String str) {
        return Class.forName(str);
    }
}
