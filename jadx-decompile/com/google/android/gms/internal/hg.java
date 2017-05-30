package com.google.android.gms.internal;

import com.google.android.gms.internal.he.a;
import com.google.android.gms.internal.he.b;
import java.util.Comparator;

public abstract class hg<K, V> implements he<K, V> {
    private final K a;
    private final V b;
    private he<K, V> c;
    private final he<K, V> d;

    hg(K k, V v, he<K, V> heVar, he<K, V> heVar2) {
        he a;
        he a2;
        this.a = k;
        this.b = v;
        if (heVar == null) {
            a = hd.a();
        }
        this.c = a;
        if (heVar2 == null) {
            a2 = hd.a();
        }
        this.d = a2;
    }

    private static a b(he heVar) {
        return heVar.b() ? a.BLACK : a.RED;
    }

    private he<K, V> k() {
        if (this.c.c()) {
            return hd.a();
        }
        if (!(f().b() || f().f().b())) {
            this = l();
        }
        return a(null, null, ((hg) this.c).k(), null).n();
    }

    private hg<K, V> l() {
        hg<K, V> q = q();
        return q.g().f().b() ? q.a(null, null, null, ((hg) q.g()).p()).o().q() : q;
    }

    private hg<K, V> m() {
        hg<K, V> q = q();
        return q.f().f().b() ? q.p().q() : q;
    }

    private hg<K, V> n() {
        hg<K, V> o;
        if (this.d.b() && !this.c.b()) {
            o = o();
        }
        if (o.c.b() && ((hg) o.c).c.b()) {
            o = o.p();
        }
        return (o.c.b() && o.d.b()) ? o.q() : o;
    }

    private hg<K, V> o() {
        return (hg) this.d.a(null, null, a(), (hg) a(null, null, a.RED, null, ((hg) this.d).c), null);
    }

    private hg<K, V> p() {
        return (hg) this.c.a(null, null, a(), null, (hg) a(null, null, a.RED, ((hg) this.c).d, null));
    }

    private hg<K, V> q() {
        return (hg) a(null, null, b(this), this.c.a(null, null, b(this.c), null, null), this.d.a(null, null, b(this.d), null, null));
    }

    protected abstract a a();

    public /* synthetic */ he a(Object obj, Object obj2, a aVar, he heVar, he heVar2) {
        return b(obj, obj2, aVar, heVar, heVar2);
    }

    public he<K, V> a(K k, V v, Comparator<K> comparator) {
        int compare = comparator.compare(k, this.a);
        hg a = compare < 0 ? a(null, null, this.c.a(k, v, comparator), null) : compare == 0 ? a(k, v, null, null) : a(null, null, null, this.d.a(k, v, comparator));
        return a.n();
    }

    public he<K, V> a(K k, Comparator<K> comparator) {
        hg a;
        if (comparator.compare(k, this.a) < 0) {
            if (!(this.c.c() || this.c.b() || ((hg) this.c).c.b())) {
                this = l();
            }
            a = a(null, null, this.c.a(k, comparator), null);
        } else {
            if (this.c.b()) {
                this = p();
            }
            if (!(this.d.c() || this.d.b() || ((hg) this.d).c.b())) {
                this = m();
            }
            if (comparator.compare(k, this.a) == 0) {
                if (this.d.c()) {
                    return hd.a();
                }
                he h = this.d.h();
                this = a(h.d(), h.e(), null, ((hg) this.d).k());
            }
            a = a(null, null, null, this.d.a(k, comparator));
        }
        return a.n();
    }

    protected abstract hg<K, V> a(K k, V v, he<K, V> heVar, he<K, V> heVar2);

    public void a(b<K, V> bVar) {
        this.c.a(bVar);
        bVar.a(this.a, this.b);
        this.d.a(bVar);
    }

    void a(he<K, V> heVar) {
        this.c = heVar;
    }

    public hg<K, V> b(K k, V v, a aVar, he<K, V> heVar, he<K, V> heVar2) {
        Object obj;
        Object obj2;
        he heVar3;
        he heVar4;
        if (k == null) {
            obj = this.a;
        }
        if (v == null) {
            obj2 = this.b;
        }
        if (heVar == null) {
            heVar3 = this.c;
        }
        if (heVar2 == null) {
            heVar4 = this.d;
        }
        return aVar == a.RED ? new hf(obj, obj2, heVar3, heVar4) : new hc(obj, obj2, heVar3, heVar4);
    }

    public boolean c() {
        return false;
    }

    public K d() {
        return this.a;
    }

    public V e() {
        return this.b;
    }

    public he<K, V> f() {
        return this.c;
    }

    public he<K, V> g() {
        return this.d;
    }

    public he<K, V> h() {
        return this.c.c() ? this : this.c.h();
    }

    public he<K, V> i() {
        return this.d.c() ? this : this.d.i();
    }

    public int j() {
        return (this.c.j() + 1) + this.d.j();
    }
}
