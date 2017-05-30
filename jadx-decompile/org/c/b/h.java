package org.c.b;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import org.c.j;

public class h {
    public static final Comparator<Method> a = new Comparator<Method>() {
        public int a(Method method, Method method2) {
            int hashCode = method.getName().hashCode();
            int hashCode2 = method2.getName().hashCode();
            return hashCode != hashCode2 ? hashCode < hashCode2 ? -1 : 1 : h.b.compare(method, method2);
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((Method) obj, (Method) obj2);
        }
    };
    public static final Comparator<Method> b = new Comparator<Method>() {
        public int a(Method method, Method method2) {
            int compareTo = method.getName().compareTo(method2.getName());
            return compareTo != 0 ? compareTo : method.toString().compareTo(method2.toString());
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((Method) obj, (Method) obj2);
        }
    };

    private h() {
    }

    private static Comparator<Method> a(j jVar) {
        return jVar == null ? a : jVar.a().a();
    }

    public static Method[] a(Class<?> cls) {
        Comparator a = a((j) cls.getAnnotation(j.class));
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (a != null) {
            Arrays.sort(declaredMethods, a);
        }
        return declaredMethods;
    }
}
