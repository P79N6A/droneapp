package org.c.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.c.b.c;
import org.c.f.a.e;

class g {
    private final List<String> a = new ArrayList();
    private final List<Class<?>> b = new ArrayList();
    private final List<Throwable> c = new ArrayList();

    public static class a extends Exception {
        private static final long serialVersionUID = 1;

        public a(String str) {
            super(str);
        }
    }

    g() {
    }

    public static g a(String[] strArr) {
        g gVar = new g();
        gVar.d(strArr);
        return gVar;
    }

    private i a(Throwable th) {
        return i.a(g.class, th);
    }

    private i a(i iVar) {
        try {
            i iVar2 = iVar;
            for (String a : this.a) {
                iVar2 = iVar2.a(d.a(iVar2, a));
            }
            return iVar2;
        } catch (Throwable e) {
            return a(e);
        }
    }

    private String[] a(String[] strArr, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i != i2) {
            arrayList.add(strArr[i]);
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private void d(String[] strArr) {
        c(b(strArr));
    }

    public List<String> a() {
        return Collections.unmodifiableList(this.a);
    }

    public i a(a aVar) {
        return this.c.isEmpty() ? a(i.a(aVar, (Class[]) this.b.toArray(new Class[this.b.size()]))) : a(new e(this.c));
    }

    public List<Class<?>> b() {
        return Collections.unmodifiableList(this.b);
    }

    String[] b(String... strArr) {
        int i = 0;
        while (i != strArr.length) {
            String str = strArr[i];
            if (str.equals("--")) {
                return a(strArr, i + 1, strArr.length);
            }
            if (!str.startsWith("--")) {
                return a(strArr, i, strArr.length);
            }
            if (str.startsWith("--filter=") || str.equals("--filter")) {
                int i2;
                Object obj;
                if (str.equals("--filter")) {
                    i2 = i + 1;
                    if (i2 >= strArr.length) {
                        this.c.add(new a(str + " value not specified"));
                        break;
                    }
                    obj = strArr[i2];
                } else {
                    i2 = i;
                    String substring = str.substring(str.indexOf(61) + 1);
                }
                this.a.add(obj);
                i = i2;
            } else {
                this.c.add(new a("JUnit knows nothing about the " + str + " option"));
            }
            i++;
        }
        return new String[0];
    }

    void c(String[] strArr) {
        for (String str : strArr) {
            try {
                this.b.add(c.a(str));
            } catch (Throwable e) {
                this.c.add(new IllegalArgumentException("Could not find class [" + str + "]", e));
            }
        }
    }
}
