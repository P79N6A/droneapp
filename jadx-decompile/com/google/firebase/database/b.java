package com.google.firebase.database;

import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.lc;
import com.google.android.gms.internal.lg;
import com.google.android.gms.internal.ml;
import com.google.android.gms.internal.mm;
import java.util.Iterator;

public class b {
    private final lc a;
    private final e b;

    b(e eVar, lc lcVar) {
        this.a = lcVar;
        this.b = eVar;
    }

    public b a(String str) {
        return new b(this.b.a(str), lc.a(this.a.a().a(new ij(str))));
    }

    public <T> T a(h<T> hVar) {
        return mm.a(this.a.a().a(), (h) hVar);
    }

    public <T> T a(Class<T> cls) {
        return mm.a(this.a.a().a(), (Class) cls);
    }

    public Object a(boolean z) {
        return this.a.a().a(z);
    }

    public boolean a() {
        return this.a.a().c() > 0;
    }

    public boolean b() {
        return !this.a.a().b();
    }

    public boolean b(String str) {
        if (this.b.g() == null) {
            ml.b(str);
        } else {
            ml.a(str);
        }
        return !this.a.a().a(new ij(str)).b();
    }

    public Object c() {
        return this.a.a().a();
    }

    public long d() {
        return (long) this.a.a().c();
    }

    public e e() {
        return this.b;
    }

    public String f() {
        return this.b.i();
    }

    public Iterable<b> g() {
        final Iterator it = this.a.iterator();
        return new Iterable<b>(this) {
            final /* synthetic */ b b;

            public Iterator<b> iterator() {
                return new Iterator<b>(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public b a() {
                        lg lgVar = (lg) it.next();
                        return new b(this.a.b.b.a(lgVar.c().e()), lc.a(lgVar.d()));
                    }

                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public /* synthetic */ Object next() {
                        return a();
                    }

                    public void remove() {
                        throw new UnsupportedOperationException("remove called on immutable collection");
                    }
                };
            }
        };
    }

    public Object h() {
        Object a = this.a.a().f().a();
        return a instanceof Long ? Double.valueOf((double) ((Long) a).longValue()) : a;
    }

    public String toString() {
        String valueOf = String.valueOf(this.b.i());
        String valueOf2 = String.valueOf(this.a.a().a(true));
        return new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("DataSnapshot { key = ").append(valueOf).append(", value = ").append(valueOf2).append(" }").toString();
    }
}
