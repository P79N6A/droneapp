package org.c.a.e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d {
    private static final Map<Class<?>, Class<?>> a = c();
    private final Class<?> b;
    private final Annotation[] c;

    private d(Class<?> cls, Annotation[] annotationArr) {
        this.b = cls;
        this.c = annotationArr;
    }

    private <T extends Annotation> T a(Annotation[] annotationArr, Class<T> cls, int i) {
        if (i == 0) {
            return null;
        }
        for (Annotation annotation : annotationArr) {
            Annotation annotation2;
            if (cls.isInstance(annotation2)) {
                return (Annotation) cls.cast(annotation2);
            }
            annotation2 = a(annotation2.annotationType().getAnnotations(), (Class) cls, i - 1);
            if (annotation2 != null) {
                return (Annotation) cls.cast(annotation2);
            }
        }
        return null;
    }

    public static ArrayList<d> a(Method method) {
        return a(method.getParameterTypes(), method.getParameterAnnotations());
    }

    private static ArrayList<d> a(Class<?>[] clsArr, Annotation[][] annotationArr) {
        ArrayList<d> arrayList = new ArrayList();
        for (int i = 0; i < clsArr.length; i++) {
            arrayList.add(new d(clsArr[i], annotationArr[i]));
        }
        return arrayList;
    }

    public static List<d> a(Constructor<?> constructor) {
        return a(constructor.getParameterTypes(), constructor.getParameterAnnotations());
    }

    private static <T> void a(Map<T, T> map, T t, T t2) {
        map.put(t, t2);
        map.put(t2, t);
    }

    private boolean a(Class<?> cls, Class<?> cls2) {
        return a.containsKey(cls2) ? cls.isAssignableFrom((Class) a.get(cls2)) : false;
    }

    private static Map<Class<?>, Class<?>> c() {
        Map hashMap = new HashMap();
        a(hashMap, Boolean.TYPE, (Object) Boolean.class);
        a(hashMap, Byte.TYPE, (Object) Byte.class);
        a(hashMap, Short.TYPE, (Object) Short.class);
        a(hashMap, Character.TYPE, (Object) Character.class);
        a(hashMap, Integer.TYPE, (Object) Integer.class);
        a(hashMap, Long.TYPE, (Object) Long.class);
        a(hashMap, Float.TYPE, (Object) Float.class);
        a(hashMap, Double.TYPE, (Object) Double.class);
        return Collections.unmodifiableMap(hashMap);
    }

    public Class<?> a() {
        return this.b;
    }

    public boolean a(Class<?> cls) {
        return this.b.isAssignableFrom(cls) || a(this.b, (Class) cls);
    }

    public boolean a(Object obj) {
        return obj == null ? !this.b.isPrimitive() : a(obj.getClass());
    }

    public List<Annotation> b() {
        return Arrays.asList(this.c);
    }

    public boolean b(Class<?> cls) {
        return cls.isAssignableFrom(this.b) || a((Class) cls, this.b) || a((Class) cls);
    }

    public boolean c(Class<? extends Annotation> cls) {
        return e(cls) != null;
    }

    public <T extends Annotation> T d(Class<T> cls) {
        return a(this.c, (Class) cls, 3);
    }

    public <T extends Annotation> T e(Class<T> cls) {
        for (Annotation annotation : b()) {
            if (cls.isInstance(annotation)) {
                return (Annotation) cls.cast(annotation);
            }
        }
        return null;
    }
}
