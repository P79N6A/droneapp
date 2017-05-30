package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class l {
    private final o a;
    private final e b;
    private boolean c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private final Map<Class<? extends n>, n> j;
    private final List<r> k;

    l(l lVar) {
        this.a = lVar.a;
        this.b = lVar.b;
        this.d = lVar.d;
        this.e = lVar.e;
        this.f = lVar.f;
        this.g = lVar.g;
        this.h = lVar.h;
        this.k = new ArrayList(lVar.k);
        this.j = new HashMap(lVar.j.size());
        for (Entry entry : lVar.j.entrySet()) {
            n c = c((Class) entry.getKey());
            ((n) entry.getValue()).a(c);
            this.j.put((Class) entry.getKey(), c);
        }
    }

    l(o oVar, e eVar) {
        d.a((Object) oVar);
        d.a((Object) eVar);
        this.a = oVar;
        this.b = eVar;
        this.g = 1800000;
        this.h = 3024000000L;
        this.j = new HashMap();
        this.k = new ArrayList();
    }

    private static <T extends n> T c(Class<T> cls) {
        try {
            return (n) cls.newInstance();
        } catch (Throwable e) {
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        } catch (Throwable e2) {
            throw new IllegalArgumentException("dataType default constructor is not accessible", e2);
        }
    }

    public l a() {
        return new l(this);
    }

    public <T extends n> T a(Class<T> cls) {
        return (n) this.j.get(cls);
    }

    public void a(long j) {
        this.e = j;
    }

    public void a(n nVar) {
        d.a((Object) nVar);
        Class cls = nVar.getClass();
        if (cls.getSuperclass() != n.class) {
            throw new IllegalArgumentException();
        }
        nVar.a(b(cls));
    }

    public <T extends n> T b(Class<T> cls) {
        n nVar = (n) this.j.get(cls);
        if (nVar != null) {
            return nVar;
        }
        T c = c(cls);
        this.j.put(cls, c);
        return c;
    }

    public Collection<n> b() {
        return this.j.values();
    }

    public List<r> c() {
        return this.k;
    }

    public long d() {
        return this.d;
    }

    public void e() {
        i().a(this);
    }

    public boolean f() {
        return this.c;
    }

    void g() {
        this.f = this.b.b();
        if (this.e != 0) {
            this.d = this.e;
        } else {
            this.d = this.b.a();
        }
        this.c = true;
    }

    o h() {
        return this.a;
    }

    p i() {
        return this.a.o();
    }

    boolean j() {
        return this.i;
    }

    void k() {
        this.i = true;
    }
}
