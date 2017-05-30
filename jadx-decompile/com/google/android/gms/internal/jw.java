package com.google.android.gms.internal;

import java.util.Map.Entry;

public class jw<T> {
    static final /* synthetic */ boolean a = (!jw.class.desiredAssertionStatus());
    private kv b;
    private jw<T> c;
    private jx<T> d;

    public interface b<T> {
        void a(jw<T> jwVar);
    }

    public interface a<T> {
        boolean a(jw<T> jwVar);
    }

    public jw() {
        this(null, null, new jx());
    }

    public jw(kv kvVar, jw<T> jwVar, jx<T> jxVar) {
        this.b = kvVar;
        this.c = jwVar;
        this.d = jxVar;
    }

    private void a(kv kvVar, jw<T> jwVar) {
        boolean d = jwVar.d();
        boolean containsKey = this.d.a.containsKey(kvVar);
        if (d && containsKey) {
            this.d.a.remove(kvVar);
            e();
        } else if (!d && !containsKey) {
            this.d.a.put(kvVar, jwVar.d);
            e();
        }
    }

    private void e() {
        if (this.c != null) {
            this.c.a(this.b, this);
        }
    }

    public jw<T> a(ij ijVar) {
        jw<T> jwVar;
        kv d = ijVar.d();
        while (d != null) {
            jw<T> jwVar2 = new jw(d, jwVar, jwVar.d.a.containsKey(d) ? (jx) jwVar.d.a.get(d) : new jx());
            ijVar = ijVar.e();
            d = ijVar.d();
            jwVar = jwVar2;
        }
        return jwVar;
    }

    public T a() {
        return this.d.b;
    }

    String a(String str) {
        String e = this.b == null ? "<anon>" : this.b.e();
        String valueOf = String.valueOf(this.d.a(String.valueOf(str).concat("\t")));
        return new StringBuilder(((String.valueOf(str).length() + 1) + String.valueOf(e).length()) + String.valueOf(valueOf).length()).append(str).append(e).append("\n").append(valueOf).toString();
    }

    public void a(b<T> bVar) {
        a(bVar, false, false);
    }

    public void a(final b<T> bVar, boolean z, final boolean z2) {
        if (z && !z2) {
            bVar.a(this);
        }
        b(new b<T>(this) {
            final /* synthetic */ jw c;

            public void a(jw<T> jwVar) {
                jwVar.a(bVar, true, z2);
            }
        });
        if (z && z2) {
            bVar.a(this);
        }
    }

    public void a(T t) {
        this.d.b = t;
        e();
    }

    public boolean a(a<T> aVar) {
        return a((a) aVar, false);
    }

    public boolean a(a<T> aVar, boolean z) {
        if (!z) {
            this = this.c;
        }
        while (this != null) {
            if (aVar.a(this)) {
                return true;
            }
            this = this.c;
        }
        return false;
    }

    public ij b() {
        if (this.c != null) {
            if (a || this.b != null) {
                return this.c.b().a(this.b);
            }
            throw new AssertionError();
        } else if (this.b == null) {
            return ij.a();
        } else {
            return new ij(this.b);
        }
    }

    public void b(b<T> bVar) {
        Object[] toArray = this.d.a.entrySet().toArray();
        for (Object obj : toArray) {
            Entry entry = (Entry) obj;
            bVar.a(new jw((kv) entry.getKey(), this, (jx) entry.getValue()));
        }
    }

    public boolean c() {
        return !this.d.a.isEmpty();
    }

    public boolean d() {
        return this.d.b == null && this.d.a.isEmpty();
    }

    public String toString() {
        return a("");
    }
}
