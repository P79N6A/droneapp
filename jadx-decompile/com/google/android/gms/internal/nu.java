package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class nu extends nx implements Iterable<nx> {
    private final List<nx> a = new ArrayList();

    public int a() {
        return this.a.size();
    }

    public nx a(int i) {
        return (nx) this.a.get(i);
    }

    public void a(nx nxVar) {
        Object obj;
        if (nxVar == null) {
            obj = nz.a;
        }
        this.a.add(obj);
    }

    public Number b() {
        if (this.a.size() == 1) {
            return ((nx) this.a.get(0)).b();
        }
        throw new IllegalStateException();
    }

    public String c() {
        if (this.a.size() == 1) {
            return ((nx) this.a.get(0)).c();
        }
        throw new IllegalStateException();
    }

    public double d() {
        if (this.a.size() == 1) {
            return ((nx) this.a.get(0)).d();
        }
        throw new IllegalStateException();
    }

    public long e() {
        if (this.a.size() == 1) {
            return ((nx) this.a.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof nu) && ((nu) obj).a.equals(this.a));
    }

    public int f() {
        if (this.a.size() == 1) {
            return ((nx) this.a.get(0)).f();
        }
        throw new IllegalStateException();
    }

    public boolean g() {
        if (this.a.size() == 1) {
            return ((nx) this.a.get(0)).g();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Iterator<nx> iterator() {
        return this.a.iterator();
    }
}
