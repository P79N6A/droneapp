package com.google.firebase.database;

import com.google.android.gms.g.f;
import com.google.android.gms.internal.ia;
import com.google.android.gms.internal.ic;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.im;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.kv;
import com.google.android.gms.internal.lh;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.ll;
import com.google.android.gms.internal.mh;
import com.google.android.gms.internal.mj;
import com.google.android.gms.internal.mk;
import com.google.android.gms.internal.ml;
import com.google.android.gms.internal.mm;
import java.net.URLEncoder;
import java.util.Map;

public class e extends n {
    private static id e;

    public interface a {
        void a(c cVar, e eVar);
    }

    e(im imVar, ij ijVar) {
        super(imVar, ijVar);
    }

    private f<Void> a(final lh lhVar, a aVar) {
        ml.a(n());
        final mh a = mk.a(aVar);
        this.a.a(new Runnable(this) {
            final /* synthetic */ e c;

            public void run() {
                this.c.a.a(this.c.n().a(kv.c()), lhVar, (a) a.b());
            }
        });
        return (f) a.a();
    }

    private f<Void> a(Object obj, lh lhVar, a aVar) {
        ml.a(n());
        iz.a(n(), obj);
        Object a = mm.a(obj);
        ml.a(a);
        final lh a2 = li.a(a, lhVar);
        final mh a3 = mk.a(aVar);
        this.a.a(new Runnable(this) {
            final /* synthetic */ e c;

            public void run() {
                this.c.a.a(this.c.n(), a2, (a) a3.b());
            }
        });
        return (f) a3.a();
    }

    static void a(id idVar) {
        io.a((ic) idVar);
    }

    private f<Void> b(Map<String, Object> map, a aVar) {
        if (map == null) {
            throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
        }
        final Map a = mm.a((Map) map);
        final ia b = ia.b(ml.a(n(), a));
        final mh a2 = mk.a(aVar);
        this.a.a(new Runnable(this) {
            final /* synthetic */ e d;

            public void run() {
                this.d.a.a(this.d.n(), b, (a) a2.b(), a);
            }
        });
        return (f) a2.a();
    }

    static void b(id idVar) {
        io.b((ic) idVar);
    }

    public static void d() {
        a(p());
    }

    public static void e() {
        b(p());
    }

    private static synchronized id p() {
        id idVar;
        synchronized (e.class) {
            if (e == null) {
                e = new id();
            }
            idVar = e;
        }
        return idVar;
    }

    public f<Void> a(Object obj) {
        return a(obj, ll.a(null), null);
    }

    public f<Void> a(Object obj, Object obj2) {
        return a(obj, ll.a(obj2), null);
    }

    public f<Void> a(Map<String, Object> map) {
        return b((Map) map, null);
    }

    public e a() {
        return new e(this.a, n().a(kv.a(mj.a(this.a.e()))));
    }

    public e a(String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        if (n().h()) {
            ml.b(str);
        } else {
            ml.a(str);
        }
        return new e(this.a, n().a(new ij(str)));
    }

    public void a(a aVar) {
        a(null, aVar);
    }

    public void a(com.google.firebase.database.q.a aVar) {
        a(aVar, true);
    }

    public void a(final com.google.firebase.database.q.a aVar, final boolean z) {
        if (aVar == null) {
            throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
        }
        ml.a(n());
        this.a.a(new Runnable(this) {
            final /* synthetic */ e c;

            public void run() {
                this.c.a.a(this.c.n(), aVar, z);
            }
        });
    }

    public void a(Object obj, a aVar) {
        a(obj, ll.a(null), aVar);
    }

    public void a(Object obj, Object obj2, a aVar) {
        a(obj, ll.a(obj2), aVar);
    }

    public void a(Map<String, Object> map, a aVar) {
        b((Map) map, aVar);
    }

    public f<Void> b() {
        return a(null);
    }

    public f<Void> b(Object obj) {
        return a(ll.a(obj), null);
    }

    public void b(Object obj, a aVar) {
        a(ll.a(obj), aVar);
    }

    public l c() {
        ml.a(n());
        return new l(this.a, n());
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && toString().equals(obj.toString());
    }

    public g f() {
        return this.a.c();
    }

    public e g() {
        ij f = n().f();
        return f != null ? new e(this.a, f) : null;
    }

    public e h() {
        return new e(this.a, new ij(""));
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String i() {
        return n().h() ? null : n().g().e();
    }

    public String toString() {
        String valueOf;
        e g = g();
        if (g == null) {
            return this.a.toString();
        }
        try {
            valueOf = String.valueOf(g.toString());
            String valueOf2 = String.valueOf(URLEncoder.encode(i(), "UTF-8").replace("+", "%20"));
            return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("/").append(valueOf2).toString();
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Failed to URLEncode key: ";
            valueOf = String.valueOf(i());
            throw new d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }
}
