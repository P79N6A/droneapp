package com.google.firebase.database;

import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.ir;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.kv;
import com.google.android.gms.internal.lc;
import com.google.android.gms.internal.lg;
import com.google.android.gms.internal.lh;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.ll;
import com.google.android.gms.internal.ml;
import com.google.android.gms.internal.mm;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class k {
    private final ir a;
    private final ij b;

    private k(ir irVar, ij ijVar) {
        this.a = irVar;
        this.b = ijVar;
        iz.a(this.b, f());
    }

    k(lh lhVar) {
        this(new ir(lhVar), new ij(""));
    }

    lh a() {
        return this.a.a(this.b);
    }

    public <T> T a(h<T> hVar) {
        return mm.a(a().a(), (h) hVar);
    }

    public <T> T a(Class<T> cls) {
        return mm.a(a().a(), (Class) cls);
    }

    public void a(Object obj) {
        iz.a(this.b, obj);
        Object a = mm.a(obj);
        ml.a(a);
        this.a.a(this.b, li.a(a));
    }

    public boolean a(String str) {
        return !a().a(new ij(str)).b();
    }

    public k b(String str) {
        ml.a(str);
        return new k(this.a, this.b.a(new ij(str)));
    }

    public void b(Object obj) {
        this.a.a(this.b, a().b(ll.a(obj)));
    }

    public boolean b() {
        lh a = a();
        return (a.e() || a.b()) ? false : true;
    }

    public long c() {
        return (long) a().c();
    }

    public Iterable<k> d() {
        lh a = a();
        if (a.b() || a.e()) {
            return new Iterable<k>(this) {
                final /* synthetic */ k a;

                {
                    this.a = r1;
                }

                public Iterator<k> iterator() {
                    return new Iterator<k>(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public k a() {
                            throw new NoSuchElementException();
                        }

                        public boolean hasNext() {
                            return false;
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
        final Iterator it = lc.a(a).iterator();
        return new Iterable<k>(this) {
            final /* synthetic */ k b;

            public Iterator<k> iterator() {
                return new Iterator<k>(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public k a() {
                        return new k(this.a.b.a, this.a.b.b.a(((lg) it.next()).c()));
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

    public String e() {
        return this.b.g() != null ? this.b.g().e() : null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && this.a.equals(((k) obj).a) && this.b.equals(((k) obj).b);
    }

    public Object f() {
        return a().a();
    }

    public Object g() {
        return a().f().a();
    }

    public String toString() {
        kv d = this.b.d();
        String e = d != null ? d.e() : "<none>";
        String valueOf = String.valueOf(this.a.a().a(true));
        return new StringBuilder((String.valueOf(e).length() + 32) + String.valueOf(valueOf).length()).append("MutableData { key = ").append(e).append(", value = ").append(valueOf).append(" }").toString();
    }
}
