package com.a.a;

import android.view.View;
import com.a.b.d;
import com.a.c.a.a;
import java.util.HashMap;
import java.util.Map;

public final class l extends q {
    private static final boolean p = false;
    private static final Map<String, d> q = new HashMap();
    private Object r;
    private String s;
    private d t;

    static {
        q.put("alpha", m.a);
        q.put("pivotX", m.b);
        q.put("pivotY", m.c);
        q.put("translationX", m.d);
        q.put("translationY", m.e);
        q.put("rotation", m.f);
        q.put("rotationX", m.g);
        q.put("rotationY", m.h);
        q.put("scaleX", m.i);
        q.put("scaleY", m.j);
        q.put("scrollX", m.k);
        q.put("scrollY", m.l);
        q.put("x", m.m);
        q.put("y", m.n);
    }

    private <T> l(T t, d<T, ?> dVar) {
        this.r = t;
        a((d) dVar);
    }

    private l(Object obj, String str) {
        this.r = obj;
        a(str);
    }

    public static <T, V> l a(T t, d<T, V> dVar, p<V> pVar, V... vArr) {
        l lVar = new l((Object) t, (d) dVar);
        lVar.a((Object[]) vArr);
        lVar.a((p) pVar);
        return lVar;
    }

    public static <T> l a(T t, d<T, Float> dVar, float... fArr) {
        l lVar = new l((Object) t, (d) dVar);
        lVar.a(fArr);
        return lVar;
    }

    public static <T> l a(T t, d<T, Integer> dVar, int... iArr) {
        l lVar = new l((Object) t, (d) dVar);
        lVar.a(iArr);
        return lVar;
    }

    public static l a(Object obj, String str, p pVar, Object... objArr) {
        l lVar = new l(obj, str);
        lVar.a(objArr);
        lVar.a(pVar);
        return lVar;
    }

    public static l a(Object obj, String str, float... fArr) {
        l lVar = new l(obj, str);
        lVar.a(fArr);
        return lVar;
    }

    public static l a(Object obj, String str, int... iArr) {
        l lVar = new l(obj, str);
        lVar.a(iArr);
        return lVar;
    }

    public static l a(Object obj, n... nVarArr) {
        l lVar = new l();
        lVar.r = obj;
        lVar.b(nVarArr);
        return lVar;
    }

    public void a() {
        super.a();
    }

    void a(float f) {
        super.a(f);
        for (n d : this.k) {
            d.d(this.r);
        }
    }

    public void a(d dVar) {
        if (this.k != null) {
            n nVar = this.k[0];
            String c = nVar.c();
            nVar.a(dVar);
            this.l.remove(c);
            this.l.put(this.s, nVar);
        }
        if (this.t != null) {
            this.s = dVar.b();
        }
        this.t = dVar;
        this.j = false;
    }

    public void a(Object obj) {
        if (this.r != obj) {
            Object obj2 = this.r;
            this.r = obj;
            if (obj2 == null || obj == null || obj2.getClass() != obj.getClass()) {
                this.j = false;
            }
        }
    }

    public void a(String str) {
        if (this.k != null) {
            n nVar = this.k[0];
            String c = nVar.c();
            nVar.a(str);
            this.l.remove(c);
            this.l.put(str, nVar);
        }
        this.s = str;
        this.j = false;
    }

    public void a(float... fArr) {
        if (this.k != null && this.k.length != 0) {
            super.a(fArr);
        } else if (this.t != null) {
            b(n.a(this.t, fArr));
        } else {
            b(n.a(this.s, fArr));
        }
    }

    public void a(int... iArr) {
        if (this.k != null && this.k.length != 0) {
            super.a(iArr);
        } else if (this.t != null) {
            b(n.a(this.t, iArr));
        } else {
            b(n.a(this.s, iArr));
        }
    }

    public void a(Object... objArr) {
        if (this.k != null && this.k.length != 0) {
            super.a(objArr);
        } else if (this.t != null) {
            b(n.a(this.t, (p) null, objArr));
        } else {
            b(n.a(this.s, (p) null, objArr));
        }
    }

    public l a_(long j) {
        super.d(j);
        return this;
    }

    public /* synthetic */ a b(long j) {
        return a_(j);
    }

    public /* synthetic */ Object clone() {
        return p();
    }

    public /* synthetic */ q d(long j) {
        return a_(j);
    }

    public /* synthetic */ a j() {
        return p();
    }

    public void k() {
        n();
        for (n b : this.k) {
            b.b(this.r);
        }
    }

    public void l() {
        n();
        for (n c : this.k) {
            c.c(this.r);
        }
    }

    public String m() {
        return this.s;
    }

    void n() {
        if (!this.j) {
            if (this.t == null && a.a && (this.r instanceof View) && q.containsKey(this.s)) {
                a((d) q.get(this.s));
            }
            for (n a : this.k) {
                a.a(this.r);
            }
            super.n();
        }
    }

    public Object o() {
        return this.r;
    }

    public l p() {
        return (l) super.q();
    }

    public /* synthetic */ q q() {
        return p();
    }

    public String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.r;
        if (this.k != null) {
            for (n nVar : this.k) {
                str = str + "\n    " + nVar.toString();
            }
        }
        return str;
    }
}
