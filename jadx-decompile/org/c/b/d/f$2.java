package org.c.b.d;

import java.lang.reflect.Method;
import java.util.Comparator;
import org.c.e.a.e;

class f$2 implements Comparator<Method> {
    final /* synthetic */ e a;
    final /* synthetic */ f b;

    f$2(f fVar, e eVar) {
        this.b = fVar;
        this.a = eVar;
    }

    public int a(Method method, Method method2) {
        return this.a.a(this.b.c(method), this.b.c(method2));
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((Method) obj, (Method) obj2);
    }
}
