package org.c.e;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c implements Serializable {
    public static final c a = new c(null, "No Tests", new Annotation[0]);
    public static final c b = new c(null, "Test mechanism", new Annotation[0]);
    private static final Pattern c = Pattern.compile("([\\s\\S]*)\\((.*)\\)");
    private static final long serialVersionUID = 1;
    private final Collection<c> d;
    private final String e;
    private final Serializable f;
    private final Annotation[] g;
    private volatile Class<?> h;

    private c(Class<?> cls, String str, Serializable serializable, Annotation... annotationArr) {
        this.d = new ConcurrentLinkedQueue();
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("The display name must not be empty.");
        } else if (serializable == null) {
            throw new IllegalArgumentException("The unique id must not be null.");
        } else {
            this.h = cls;
            this.e = str;
            this.f = serializable;
            this.g = annotationArr;
        }
    }

    private c(Class<?> cls, String str, Annotation... annotationArr) {
        this(cls, str, str, annotationArr);
    }

    private String a(int i, String str) {
        Matcher matcher = c.matcher(toString());
        return matcher.matches() ? matcher.group(i) : str;
    }

    private static String a(String str, String str2) {
        return String.format("%s(%s)", new Object[]{str, str2});
    }

    public static c a(Class<?> cls) {
        return new c(cls, cls.getName(), cls.getAnnotations());
    }

    public static c a(Class<?> cls, String str) {
        return new c(cls, a(str, cls.getName()), new Annotation[0]);
    }

    public static c a(Class<?> cls, String str, Annotation... annotationArr) {
        return new c(cls, a(str, cls.getName()), annotationArr);
    }

    public static c a(String str, Serializable serializable, Annotation... annotationArr) {
        return new c(null, str, serializable, annotationArr);
    }

    public static c a(String str, String str2, Serializable serializable) {
        return new c(null, a(str2, str), serializable, new Annotation[0]);
    }

    public static c a(String str, String str2, Annotation... annotationArr) {
        return new c(null, a(str2, str), annotationArr);
    }

    public static c a(String str, Annotation... annotationArr) {
        return new c(null, str, annotationArr);
    }

    public String a() {
        return this.e;
    }

    public void a(c cVar) {
        this.d.add(cVar);
    }

    public <T extends Annotation> T b(Class<T> cls) {
        for (Annotation annotation : this.g) {
            if (annotation.annotationType().equals(cls)) {
                return (Annotation) cls.cast(annotation);
            }
        }
        return null;
    }

    public ArrayList<c> b() {
        return new ArrayList(this.d);
    }

    public boolean c() {
        return !d();
    }

    public boolean d() {
        return this.d.isEmpty();
    }

    public int e() {
        if (d()) {
            return 1;
        }
        int i = 0;
        for (c e : this.d) {
            i = e.e() + i;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f.equals(((c) obj).f);
    }

    public boolean f() {
        return equals(a);
    }

    public c g() {
        return new c(this.h, this.e, this.g);
    }

    public Collection<Annotation> h() {
        return Arrays.asList(this.g);
    }

    public int hashCode() {
        return this.f.hashCode();
    }

    public Class<?> i() {
        Class<?> cls = null;
        if (this.h != null) {
            return this.h;
        }
        String j = j();
        if (j == null) {
            return cls;
        }
        try {
            this.h = Class.forName(j, false, getClass().getClassLoader());
            return this.h;
        } catch (ClassNotFoundException e) {
            return cls;
        }
    }

    public String j() {
        return this.h != null ? this.h.getName() : a(2, toString());
    }

    public String k() {
        return a(1, null);
    }

    public String toString() {
        return a();
    }
}
