package b.b;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.c.b.h;

public class n implements i {
    private String a;
    private Vector<i> b;

    public n() {
        this.b = new Vector(10);
    }

    public n(Class<?> cls) {
        this.b = new Vector(10);
        c(cls);
    }

    public n(Class<? extends j> cls, String str) {
        this((Class) cls);
        b(str);
    }

    public n(String str) {
        this.b = new Vector(10);
        b(str);
    }

    public n(Class<?>... clsArr) {
        this.b = new Vector(10);
        for (Class d : clsArr) {
            a(d(d));
        }
    }

    public n(Class<? extends j>[] clsArr, String str) {
        this((Class[]) clsArr);
        b(str);
    }

    public static i a(Class<?> cls, String str) {
        try {
            Constructor a = a((Class) cls);
            try {
                Object obj;
                if (a.getParameterTypes().length == 0) {
                    Object newInstance = a.newInstance(new Object[0]);
                    if (newInstance instanceof j) {
                        ((j) newInstance).e(str);
                        obj = newInstance;
                    } else {
                        obj = newInstance;
                    }
                } else {
                    obj = a.newInstance(new Object[]{str});
                }
                return (i) obj;
            } catch (Throwable e) {
                return a("Cannot instantiate test case: " + str + " (" + a(e) + ")");
            } catch (InvocationTargetException e2) {
                return a("Exception in constructor: " + str + " (" + a(e2.getTargetException()) + ")");
            } catch (Throwable e3) {
                return a("Cannot access test case: " + str + " (" + a(e3) + ")");
            }
        } catch (NoSuchMethodException e4) {
            return a("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    public static i a(final String str) {
        return new j("warning") {
            protected void f() {
                j.c(str);
            }
        };
    }

    private static String a(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Constructor<?> a(Class<?> cls) {
        try {
            return cls.getConstructor(new Class[]{String.class});
        } catch (NoSuchMethodException e) {
            return cls.getConstructor(new Class[0]);
        }
    }

    private void a(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (!list.contains(name)) {
            if (a(method)) {
                list.add(name);
                a(a((Class) cls, name));
            } else if (b(method)) {
                a(a("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
            }
        }
    }

    private boolean a(Method method) {
        return b(method) && Modifier.isPublic(method.getModifiers());
    }

    private boolean b(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE);
    }

    private void c(Class<?> cls) {
        this.a = cls.getName();
        try {
            a((Class) cls);
            if (Modifier.isPublic(cls.getModifiers())) {
                List arrayList = new ArrayList();
                for (Class cls2 = cls; i.class.isAssignableFrom(cls2); cls2 = cls2.getSuperclass()) {
                    for (Method a : h.a(cls2)) {
                        a(a, arrayList, cls);
                    }
                }
                if (this.b.size() == 0) {
                    a(a("No tests found in " + cls.getName()));
                    return;
                }
                return;
            }
            a(a("Class " + cls.getName() + " is not public"));
        } catch (NoSuchMethodException e) {
            a(a("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    private i d(Class<?> cls) {
        return j.class.isAssignableFrom(cls) ? new n(cls.asSubclass(j.class)) : a(cls.getCanonicalName() + " does not extend TestCase");
    }

    public int a() {
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = ((i) it.next()).a() + i;
        }
        return i;
    }

    public i a(int i) {
        return (i) this.b.get(i);
    }

    public void a(i iVar) {
        this.b.add(iVar);
    }

    public void a(i iVar, m mVar) {
        iVar.a(mVar);
    }

    public void a(m mVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!mVar.f()) {
                a(iVar, mVar);
            } else {
                return;
            }
        }
    }

    public void b(Class<? extends j> cls) {
        a(new n((Class) cls));
    }

    public void b(String str) {
        this.a = str;
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.b.size();
    }

    public Enumeration<i> e() {
        return this.b.elements();
    }

    public String toString() {
        return c() != null ? c() : super.toString();
    }
}
