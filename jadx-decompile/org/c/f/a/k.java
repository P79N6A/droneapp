package org.c.f.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.c.b.h;
import org.c.c;
import org.c.f;
import org.c.g;

public class k implements a {
    private static final a a = new a(null);
    private static final b b = new b(null);
    private final Class<?> c;
    private final Map<Class<? extends Annotation>, List<d>> d;
    private final Map<Class<? extends Annotation>, List<b>> e;

    public k(Class<?> cls) {
        this.c = cls;
        if (cls == null || cls.getConstructors().length <= 1) {
            Map linkedHashMap = new LinkedHashMap();
            Map linkedHashMap2 = new LinkedHashMap();
            a(linkedHashMap, linkedHashMap2);
            this.d = a(linkedHashMap);
            this.e = a(linkedHashMap2);
            return;
        }
        throw new IllegalArgumentException("Test class can only have one constructor");
    }

    private static <T> List<T> a(Map<Class<? extends Annotation>, List<T>> map, Class<? extends Annotation> cls, boolean z) {
        if (!map.containsKey(cls) && z) {
            map.put(cls, new ArrayList());
        }
        List<T> list = (List) map.get(cls);
        return list == null ? Collections.emptyList() : list;
    }

    private static <T extends c<T>> Map<Class<? extends Annotation>, List<T>> a(Map<Class<? extends Annotation>, List<T>> map) {
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Collections.unmodifiableList((List) entry.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    protected static <T extends c<T>> void a(T t, Map<Class<? extends Annotation>, List<T>> map) {
        Annotation[] a = t.a();
        int length = a.length;
        int i = 0;
        while (i < length) {
            Class annotationType = a[i].annotationType();
            List a2 = a((Map) map, annotationType, true);
            if (!t.a(a2)) {
                if (e(annotationType)) {
                    a2.add(0, t);
                } else {
                    a2.add(t);
                }
                i++;
            } else {
                return;
            }
        }
    }

    private <T> List<T> b(Map<?, List<T>> map) {
        Collection linkedHashSet = new LinkedHashSet();
        for (List addAll : map.values()) {
            linkedHashSet.addAll(addAll);
        }
        return new ArrayList(linkedHashSet);
    }

    private static Field[] d(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.sort(declaredFields, a);
        return declaredFields;
    }

    private static boolean e(Class<? extends Annotation> cls) {
        return cls.equals(f.class) || cls.equals(g.class);
    }

    private static List<Class<?>> f(Class<?> cls) {
        List arrayList = new ArrayList();
        Class superclass;
        while (superclass != null) {
            arrayList.add(superclass);
            superclass = superclass.getSuperclass();
        }
        return arrayList;
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return this.c == null ? null : this.c.getAnnotation(cls);
    }

    public <T> List<T> a(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        List<T> arrayList = new ArrayList();
        for (b a : c(cls)) {
            try {
                Object a2 = a.a(obj);
                if (cls2.isInstance(a2)) {
                    arrayList.add(cls2.cast(a2));
                }
            } catch (Throwable e) {
                throw new RuntimeException("How did getFields return a field we couldn't access?", e);
            }
        }
        return arrayList;
    }

    protected void a(Map<Class<? extends Annotation>, List<d>> map, Map<Class<? extends Annotation>, List<b>> map2) {
        for (Class cls : f(this.c)) {
            for (Method dVar : h.a(cls)) {
                a(new d(dVar), (Map) map);
            }
            for (Field bVar : d(cls)) {
                a(new b(bVar), (Map) map2);
            }
        }
    }

    public Annotation[] a() {
        return this.c == null ? new Annotation[0] : this.c.getAnnotations();
    }

    public List<d> b() {
        List<d> b = b(this.d);
        Collections.sort(b, b);
        return b;
    }

    public List<d> b(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(a(this.d, (Class) cls, false));
    }

    public <T> List<T> b(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        List<T> arrayList = new ArrayList();
        for (d dVar : b((Class) cls)) {
            try {
                if (cls2.isAssignableFrom(dVar.i())) {
                    arrayList.add(cls2.cast(dVar.a(obj, new Object[0])));
                }
            } catch (Throwable th) {
                RuntimeException runtimeException = new RuntimeException("Exception in " + dVar.b(), th);
            }
        }
        return arrayList;
    }

    public List<b> c() {
        return b(this.e);
    }

    public List<b> c(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(a(this.e, (Class) cls, false));
    }

    public Class<?> d() {
        return this.c;
    }

    public String e() {
        return this.c == null ? "null" : this.c.getName();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return this.c == ((k) obj).c;
    }

    public Constructor<?> f() {
        Constructor[] constructors = this.c.getConstructors();
        c.b(1, (long) constructors.length);
        return constructors[0];
    }

    public boolean g() {
        return Modifier.isPublic(this.c.getModifiers());
    }

    public boolean h() {
        return this.c.isMemberClass() && !Modifier.isStatic(this.c.getModifiers());
    }

    public int hashCode() {
        return this.c == null ? 0 : this.c.hashCode();
    }
}
