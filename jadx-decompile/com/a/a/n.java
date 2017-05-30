package com.a.a;

import android.util.Log;
import com.a.b.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class n implements Cloneable {
    private static final p i = new h();
    private static final p j = new f();
    private static Class[] k = new Class[]{Float.TYPE, Float.class, Double.TYPE, Integer.TYPE, Double.class, Integer.class};
    private static Class[] l = new Class[]{Integer.TYPE, Integer.class, Float.TYPE, Double.TYPE, Float.class, Double.class};
    private static Class[] m = new Class[]{Double.TYPE, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class};
    private static final HashMap<Class, HashMap<String, Method>> n = new HashMap();
    private static final HashMap<Class, HashMap<String, Method>> o = new HashMap();
    String a;
    protected d b;
    Method c;
    Class d;
    k e;
    final ReentrantReadWriteLock f;
    final Object[] g;
    private Method h;
    private p p;
    private Object q;

    static class a extends n {
        g h;
        float i;
        private com.a.b.a j;

        public a(d dVar, g gVar) {
            super(dVar);
            this.d = Float.TYPE;
            this.e = gVar;
            this.h = (g) this.e;
            if (dVar instanceof com.a.b.a) {
                this.j = (com.a.b.a) this.b;
            }
        }

        public a(d dVar, float... fArr) {
            super(dVar);
            a(fArr);
            if (dVar instanceof com.a.b.a) {
                this.j = (com.a.b.a) this.b;
            }
        }

        public a(String str, g gVar) {
            super(str);
            this.d = Float.TYPE;
            this.e = gVar;
            this.h = (g) this.e;
        }

        public a(String str, float... fArr) {
            super(str);
            a(fArr);
        }

        public /* synthetic */ n a() {
            return e();
        }

        void a(float f) {
            this.i = this.h.b(f);
        }

        void a(Class cls) {
            if (this.b == null) {
                super.a(cls);
            }
        }

        public void a(float... fArr) {
            super.a(fArr);
            this.h = (g) this.e;
        }

        public /* synthetic */ Object clone() {
            return e();
        }

        Object d() {
            return Float.valueOf(this.i);
        }

        void d(Object obj) {
            if (this.j != null) {
                this.j.a(obj, this.i);
            } else if (this.b != null) {
                this.b.a(obj, Float.valueOf(this.i));
            } else if (this.c != null) {
                try {
                    this.g[0] = Float.valueOf(this.i);
                    this.c.invoke(obj, this.g);
                } catch (InvocationTargetException e) {
                    Log.e("PropertyValuesHolder", e.toString());
                } catch (IllegalAccessException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        public a e() {
            a aVar = (a) super.a();
            aVar.h = (g) aVar.e;
            return aVar;
        }
    }

    static class b extends n {
        i h;
        int i;
        private com.a.b.b j;

        public b(d dVar, i iVar) {
            super(dVar);
            this.d = Integer.TYPE;
            this.e = iVar;
            this.h = (i) this.e;
            if (dVar instanceof com.a.b.b) {
                this.j = (com.a.b.b) this.b;
            }
        }

        public b(d dVar, int... iArr) {
            super(dVar);
            a(iArr);
            if (dVar instanceof com.a.b.b) {
                this.j = (com.a.b.b) this.b;
            }
        }

        public b(String str, i iVar) {
            super(str);
            this.d = Integer.TYPE;
            this.e = iVar;
            this.h = (i) this.e;
        }

        public b(String str, int... iArr) {
            super(str);
            a(iArr);
        }

        public /* synthetic */ n a() {
            return e();
        }

        void a(float f) {
            this.i = this.h.b(f);
        }

        void a(Class cls) {
            if (this.b == null) {
                super.a(cls);
            }
        }

        public void a(int... iArr) {
            super.a(iArr);
            this.h = (i) this.e;
        }

        public /* synthetic */ Object clone() {
            return e();
        }

        Object d() {
            return Integer.valueOf(this.i);
        }

        void d(Object obj) {
            if (this.j != null) {
                this.j.a(obj, this.i);
            } else if (this.b != null) {
                this.b.a(obj, Integer.valueOf(this.i));
            } else if (this.c != null) {
                try {
                    this.g[0] = Integer.valueOf(this.i);
                    this.c.invoke(obj, this.g);
                } catch (InvocationTargetException e) {
                    Log.e("PropertyValuesHolder", e.toString());
                } catch (IllegalAccessException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        public b e() {
            b bVar = (b) super.a();
            bVar.h = (i) bVar.e;
            return bVar;
        }
    }

    private n(d dVar) {
        this.c = null;
        this.h = null;
        this.e = null;
        this.f = new ReentrantReadWriteLock();
        this.g = new Object[1];
        this.b = dVar;
        if (dVar != null) {
            this.a = dVar.b();
        }
    }

    private n(String str) {
        this.c = null;
        this.h = null;
        this.e = null;
        this.f = new ReentrantReadWriteLock();
        this.g = new Object[1];
        this.a = str;
    }

    public static <V> n a(d dVar, p<V> pVar, V... vArr) {
        n nVar = new n(dVar);
        nVar.a((Object[]) vArr);
        nVar.a((p) pVar);
        return nVar;
    }

    public static n a(d<?, Float> dVar, float... fArr) {
        return new a((d) dVar, fArr);
    }

    public static n a(d<?, Integer> dVar, int... iArr) {
        return new b((d) dVar, iArr);
    }

    public static n a(d dVar, j... jVarArr) {
        k a = k.a(jVarArr);
        if (a instanceof i) {
            return new b(dVar, (i) a);
        }
        if (a instanceof g) {
            return new a(dVar, (g) a);
        }
        n nVar = new n(dVar);
        nVar.e = a;
        nVar.d = jVarArr[0].e();
        return nVar;
    }

    public static n a(String str, p pVar, Object... objArr) {
        n nVar = new n(str);
        nVar.a(objArr);
        nVar.a(pVar);
        return nVar;
    }

    public static n a(String str, float... fArr) {
        return new a(str, fArr);
    }

    public static n a(String str, int... iArr) {
        return new b(str, iArr);
    }

    public static n a(String str, j... jVarArr) {
        k a = k.a(jVarArr);
        if (a instanceof i) {
            return new b(str, (i) a);
        }
        if (a instanceof g) {
            return new a(str, (g) a);
        }
        n nVar = new n(str);
        nVar.e = a;
        nVar.d = jVarArr[0].e();
        return nVar;
    }

    static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        char toUpperCase = Character.toUpperCase(str2.charAt(0));
        return str + toUpperCase + str2.substring(1);
    }

    private Method a(Class cls, String str, Class cls2) {
        Method method = null;
        String a = a(str, this.a);
        Class[] clsArr = null;
        if (cls2 == null) {
            try {
                return cls.getMethod(a, clsArr);
            } catch (NoSuchMethodException e) {
                Method declaredMethod;
                try {
                    declaredMethod = cls.getDeclaredMethod(a, clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        return declaredMethod;
                    } catch (NoSuchMethodException e2) {
                        Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.a + ": " + e);
                        return declaredMethod;
                    }
                } catch (NoSuchMethodException e3) {
                    declaredMethod = null;
                    Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.a + ": " + e);
                    return declaredMethod;
                }
            }
        }
        Class[] clsArr2 = new Class[1];
        clsArr = this.d.equals(Float.class) ? k : this.d.equals(Integer.class) ? l : this.d.equals(Double.class) ? m : new Class[]{this.d};
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            Class cls3 = clsArr[i];
            clsArr2[0] = cls3;
            try {
                method = cls.getMethod(a, clsArr2);
                this.d = cls3;
                return method;
            } catch (NoSuchMethodException e4) {
                try {
                    method = cls.getDeclaredMethod(a, clsArr2);
                    method.setAccessible(true);
                    this.d = cls3;
                    return method;
                } catch (NoSuchMethodException e5) {
                    i++;
                }
            }
        }
        Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.a + " with value type " + this.d);
        return method;
    }

    private Method a(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        Method method = null;
        try {
            this.f.writeLock().lock();
            HashMap hashMap2 = (HashMap) hashMap.get(cls);
            if (hashMap2 != null) {
                method = (Method) hashMap2.get(this.a);
            }
            if (method == null) {
                method = a(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.a, method);
            }
            Method method2 = method;
            this.f.writeLock().unlock();
            return method2;
        } catch (Throwable th) {
            this.f.writeLock().unlock();
        }
    }

    private void a(Object obj, j jVar) {
        if (this.b != null) {
            jVar.a(this.b.a(obj));
        }
        try {
            if (this.h == null) {
                b(obj.getClass());
            }
            jVar.a(this.h.invoke(obj, new Object[0]));
        } catch (InvocationTargetException e) {
            Log.e("PropertyValuesHolder", e.toString());
        } catch (IllegalAccessException e2) {
            Log.e("PropertyValuesHolder", e2.toString());
        }
    }

    private void b(Class cls) {
        this.h = a(cls, o, "get", null);
    }

    public n a() {
        try {
            n nVar = (n) super.clone();
            nVar.a = this.a;
            nVar.b = this.b;
            nVar.e = this.e.b();
            nVar.p = this.p;
            return nVar;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    void a(float f) {
        this.q = this.e.a(f);
    }

    public void a(p pVar) {
        this.p = pVar;
        this.e.a(pVar);
    }

    public void a(d dVar) {
        this.b = dVar;
    }

    void a(Class cls) {
        this.c = a(cls, n, "set", this.d);
    }

    void a(Object obj) {
        j jVar;
        if (this.b != null) {
            try {
                this.b.a(obj);
                Iterator it = this.e.e.iterator();
                while (it.hasNext()) {
                    jVar = (j) it.next();
                    if (!jVar.a()) {
                        jVar.a(this.b.a(obj));
                    }
                }
                return;
            } catch (ClassCastException e) {
                Log.e("PropertyValuesHolder", "No such property (" + this.b.b() + ") on target object " + obj + ". Trying reflection instead");
                this.b = null;
            }
        }
        Class cls = obj.getClass();
        if (this.c == null) {
            a(cls);
        }
        Iterator it2 = this.e.e.iterator();
        while (it2.hasNext()) {
            jVar = (j) it2.next();
            if (!jVar.a()) {
                if (this.h == null) {
                    b(cls);
                }
                try {
                    jVar.a(this.h.invoke(obj, new Object[0]));
                } catch (InvocationTargetException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                } catch (IllegalAccessException e3) {
                    Log.e("PropertyValuesHolder", e3.toString());
                }
            }
        }
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(float... fArr) {
        this.d = Float.TYPE;
        this.e = k.a(fArr);
    }

    public void a(int... iArr) {
        this.d = Integer.TYPE;
        this.e = k.a(iArr);
    }

    public void a(j... jVarArr) {
        int i = 0;
        int length = jVarArr.length;
        j[] jVarArr2 = new j[Math.max(length, 2)];
        this.d = jVarArr[0].e();
        while (i < length) {
            jVarArr2[i] = jVarArr[i];
            i++;
        }
        this.e = new k(jVarArr2);
    }

    public void a(Object... objArr) {
        this.d = objArr[0].getClass();
        this.e = k.a(objArr);
    }

    void b() {
        if (this.p == null) {
            p pVar = this.d == Integer.class ? i : this.d == Float.class ? j : null;
            this.p = pVar;
        }
        if (this.p != null) {
            this.e.a(this.p);
        }
    }

    void b(Object obj) {
        a(obj, (j) this.e.e.get(0));
    }

    public String c() {
        return this.a;
    }

    void c(Object obj) {
        a(obj, (j) this.e.e.get(this.e.e.size() - 1));
    }

    public /* synthetic */ Object clone() {
        return a();
    }

    Object d() {
        return this.q;
    }

    void d(Object obj) {
        if (this.b != null) {
            this.b.a(obj, d());
        }
        if (this.c != null) {
            try {
                this.g[0] = d();
                this.c.invoke(obj, this.g);
            } catch (InvocationTargetException e) {
                Log.e("PropertyValuesHolder", e.toString());
            } catch (IllegalAccessException e2) {
                Log.e("PropertyValuesHolder", e2.toString());
            }
        }
    }

    public String toString() {
        return this.a + ": " + this.e.toString();
    }
}
