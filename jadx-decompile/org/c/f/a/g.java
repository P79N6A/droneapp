package org.c.f.a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

class g {
    private final Method a;

    g(Method method) {
        this.a = method;
    }

    private void a(GenericArrayType genericArrayType, List<Throwable> list) {
        a(genericArrayType.getGenericComponentType(), (List) list);
    }

    private void a(ParameterizedType parameterizedType, List<Throwable> list) {
        for (Type a : parameterizedType.getActualTypeArguments()) {
            a(a, (List) list);
        }
    }

    private void a(Type type, List<Throwable> list) {
        if (type instanceof TypeVariable) {
            list.add(new Exception("Method " + this.a.getName() + "() contains unresolved type variable " + type));
        } else if (type instanceof ParameterizedType) {
            a((ParameterizedType) type, (List) list);
        } else if (type instanceof WildcardType) {
            a((WildcardType) type, (List) list);
        } else if (type instanceof GenericArrayType) {
            a((GenericArrayType) type, (List) list);
        }
    }

    private void a(WildcardType wildcardType, List<Throwable> list) {
        int i = 0;
        for (Type a : wildcardType.getUpperBounds()) {
            a(a, (List) list);
        }
        Type[] lowerBounds = wildcardType.getLowerBounds();
        int length = lowerBounds.length;
        while (i < length) {
            a(lowerBounds[i], (List) list);
            i++;
        }
    }

    void a(List<Throwable> list) {
        for (Type a : this.a.getGenericParameterTypes()) {
            a(a, (List) list);
        }
    }
}
