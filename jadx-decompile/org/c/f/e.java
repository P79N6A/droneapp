package org.c.f;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.c.e.l;
import org.c.f.a.k;
import org.c.f.b.d;

public class e extends g {
    private static final org.c.f.b.c a = new org.c.f.b.b();
    private static final List<l> b = Collections.emptyList();
    private final List<l> c;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        int a() default 0;
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String a() default "{index}";
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class<? extends org.c.f.b.c> a() default org.c.f.b.b.class;
    }

    public e(Class<?> cls) {
        super((Class) cls, b);
        this.c = Collections.unmodifiableList(a(b(), ((b) j().a(b.class)).a(), b(cls)));
    }

    private List<d> a(Iterable<Object> iterable, String str) {
        int i = 0;
        List<d> arrayList = new ArrayList();
        for (Object a : iterable) {
            int i2 = i + 1;
            arrayList.add(a(str, i, a));
            i = i2;
        }
        return arrayList;
    }

    private List<l> a(Iterable<Object> iterable, String str, org.c.f.b.c cVar) {
        try {
            List<d> a = a(iterable, str);
            List<l> arrayList = new ArrayList();
            for (d a2 : a) {
                arrayList.add(cVar.a(a2));
            }
            return arrayList;
        } catch (ClassCastException e) {
            throw k();
        }
    }

    private d a(String str, int i, Object obj) {
        Object[] objArr;
        if (obj instanceof Object[]) {
            objArr = (Object[]) obj;
        } else {
            objArr = new Object[]{obj};
        }
        return a(g(), str, i, objArr);
    }

    private static d a(k kVar, String str, int i, Object[] objArr) {
        return new d("[" + MessageFormat.format(str.replaceAll("\\{index\\}", Integer.toString(i)), objArr) + "]", kVar, Arrays.asList(objArr));
    }

    private Iterable<Object> b() {
        Object a = j().a(null, new Object[0]);
        if (a instanceof Iterable) {
            return (Iterable) a;
        }
        if (a instanceof Object[]) {
            return Arrays.asList((Object[]) a);
        }
        throw k();
    }

    private org.c.f.b.c b(Class<?> cls) {
        c cVar = (c) cls.getAnnotation(c.class);
        return cVar == null ? a : (org.c.f.b.c) cVar.a().newInstance();
    }

    private org.c.f.a.d j() {
        for (org.c.f.a.d dVar : g().b(b.class)) {
            if (dVar.g() && dVar.h()) {
                return dVar;
            }
        }
        throw new Exception("No public static parameters method on class " + g().e());
    }

    private Exception k() {
        String e = g().e();
        String b = j().b();
        return new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", new Object[]{e, b}));
    }

    protected List<l> c() {
        return this.c;
    }
}
