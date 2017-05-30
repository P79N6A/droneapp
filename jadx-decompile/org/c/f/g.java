package org.c.f;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import org.c.e.c;
import org.c.e.l;
import org.c.f.a.e;
import org.c.f.a.h;

public class g extends f<l> {
    private final List<l> a;

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        Class<?>[] a();
    }

    protected g(Class<?> cls, List<l> list) {
        super(cls);
        this.a = Collections.unmodifiableList(list);
    }

    public g(Class<?> cls, h hVar) {
        this(hVar, cls, b(cls));
    }

    protected g(Class<?> cls, Class<?>[] clsArr) {
        this(new org.c.b.a.a(true), cls, clsArr);
    }

    protected g(h hVar, Class<?> cls, Class<?>[] clsArr) {
        this((Class) cls, hVar.a((Class) cls, (Class[]) clsArr));
    }

    public g(h hVar, Class<?>[] clsArr) {
        this(null, hVar.a(null, (Class[]) clsArr));
    }

    public static l a() {
        try {
            return new g((Class) null, new Class[0]);
        } catch (e e) {
            throw new RuntimeException("This shouldn't be possible");
        }
    }

    private static Class<?>[] b(Class<?> cls) {
        a aVar = (a) cls.getAnnotation(a.class);
        if (aVar != null) {
            return aVar.a();
        }
        throw new e(String.format("class '%s' must have a SuiteClasses annotation", new Object[]{cls.getName()}));
    }

    protected c a(l lVar) {
        return lVar.d();
    }

    protected void a(l lVar, org.c.e.b.c cVar) {
        lVar.a(cVar);
    }

    protected List<l> c() {
        return this.a;
    }

    protected /* synthetic */ c d(Object obj) {
        return a((l) obj);
    }
}
