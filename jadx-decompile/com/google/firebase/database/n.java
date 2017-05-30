package com.google.firebase.database;

import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.im;
import com.google.android.gms.internal.ja;
import com.google.android.gms.internal.jd;
import com.google.android.gms.internal.kf;
import com.google.android.gms.internal.kg;
import com.google.android.gms.internal.ku;
import com.google.android.gms.internal.kv;
import com.google.android.gms.internal.kz;
import com.google.android.gms.internal.la;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lh;
import com.google.android.gms.internal.lj;
import com.google.android.gms.internal.lk;
import com.google.android.gms.internal.ll;
import com.google.android.gms.internal.lo;
import com.google.android.gms.internal.lp;
import com.google.android.gms.internal.mk;
import com.google.android.gms.internal.ml;

public class n {
    static final /* synthetic */ boolean d = (!n.class.desiredAssertionStatus());
    protected final im a;
    protected final ij b;
    protected final kf c;
    private final boolean e;

    n(im imVar, ij ijVar) {
        this.a = imVar;
        this.b = ijVar;
        this.c = kf.a;
        this.e = false;
    }

    n(im imVar, ij ijVar, kf kfVar, boolean z) {
        this.a = imVar;
        this.b = ijVar;
        this.c = kfVar;
        this.e = z;
        mk.a(kfVar.o(), "Validation of queries failed.");
    }

    private n a(lh lhVar, String str) {
        ml.c(str);
        if (!lhVar.e() && !lhVar.b()) {
            throw new IllegalArgumentException("Can only use simple values for startAt()");
        } else if (this.c.a()) {
            throw new IllegalArgumentException("Can't call startAt() or equalTo() multiple times");
        } else {
            kf a = this.c.a(lhVar, str != null ? kv.a(str) : null);
            b(a);
            a(a);
            if (d || a.o()) {
                return new n(this.a, this.b, a, this.e);
            }
            throw new AssertionError();
        }
    }

    private void a() {
        if (this.c.a()) {
            throw new IllegalArgumentException("Can't call equalTo() and startAt() combined");
        } else if (this.c.d()) {
            throw new IllegalArgumentException("Can't call equalTo() and endAt() combined");
        }
    }

    private void a(final ie ieVar) {
        jd.a().c(ieVar);
        this.a.a(new Runnable(this) {
            final /* synthetic */ n b;

            public void run() {
                this.b.a.a(ieVar);
            }
        });
    }

    private void a(kf kfVar) {
        if (kfVar.j().equals(ld.d())) {
            lh b;
            String str = "You must use startAt(String value), endAt(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported";
            if (kfVar.a()) {
                b = kfVar.b();
                if (!(kfVar.c() == kv.a() && (b instanceof lo))) {
                    throw new IllegalArgumentException(str);
                }
            }
            if (kfVar.d()) {
                b = kfVar.e();
                if (kfVar.f() != kv.b() || !(b instanceof lo)) {
                    throw new IllegalArgumentException(str);
                }
            }
        } else if (!kfVar.j().equals(lk.d())) {
        } else {
            if ((kfVar.a() && !ll.a(kfVar.b())) || (kfVar.d() && !ll.a(kfVar.e()))) {
                throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), endAt(), or equalTo() must be valid priorities.");
            }
        }
    }

    private n b(lh lhVar, String str) {
        ml.c(str);
        if (lhVar.e() || lhVar.b()) {
            kv a = str != null ? kv.a(str) : null;
            if (this.c.d()) {
                throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
            }
            kf b = this.c.b(lhVar, a);
            b(b);
            a(b);
            if (d || b.o()) {
                return new n(this.a, this.b, b, this.e);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("Can only use simple values for endAt()");
    }

    private void b() {
        if (this.e) {
            throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
        }
    }

    private void b(final ie ieVar) {
        jd.a().b(ieVar);
        this.a.a(new Runnable(this) {
            final /* synthetic */ n b;

            public void run() {
                this.b.a.b(ieVar);
            }
        });
    }

    private void b(kf kfVar) {
        if (kfVar.a() && kfVar.d() && kfVar.g() && !kfVar.h()) {
            throw new IllegalArgumentException("Can't combine startAt(), endAt() and limit(). Use limitToFirst() or limitToLast() instead");
        }
    }

    public a a(a aVar) {
        b(new hz(this.a, aVar, o()));
        return aVar;
    }

    public n a(double d) {
        return a(d, null);
    }

    public n a(double d, String str) {
        return a(new kz(Double.valueOf(d), ll.a()), str);
    }

    public n a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        } else if (!this.c.g()) {
            return new n(this.a, this.b, this.c.a(i), this.e);
        } else {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
    }

    public n a(String str, String str2) {
        return a(str != null ? new lo(str, ll.a()) : la.j(), str2);
    }

    public n a(boolean z, String str) {
        return a(new ku(Boolean.valueOf(z), ll.a()), str);
    }

    public r a(r rVar) {
        b(new ja(this.a, rVar, o()));
        return rVar;
    }

    public void a(final boolean z) {
        if (this.b.h() || !this.b.d().equals(kv.d())) {
            this.a.a(new Runnable(this) {
                final /* synthetic */ n b;

                public void run() {
                    this.b.a.a(this.b.o(), z);
                }
            });
            return;
        }
        throw new d("Can't call keepSynced() on .info paths.");
    }

    public n b(double d) {
        return b(d, null);
    }

    public n b(double d, String str) {
        return b(new kz(Double.valueOf(d), ll.a()), str);
    }

    public n b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        } else if (!this.c.g()) {
            return new n(this.a, this.b, this.c.b(i), this.e);
        } else {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
    }

    public n b(String str) {
        return a(str, null);
    }

    public n b(String str, String str2) {
        return b(str != null ? new lo(str, ll.a()) : la.j(), str2);
    }

    public n b(boolean z) {
        return a(z, null);
    }

    public n b(boolean z, String str) {
        return b(new ku(Boolean.valueOf(z), ll.a()), str);
    }

    public void b(a aVar) {
        if (aVar == null) {
            throw new NullPointerException("listener must not be null");
        }
        a(new hz(this.a, aVar, o()));
    }

    public void b(final r rVar) {
        b(new ja(this.a, new r(this) {
            final /* synthetic */ n b;

            public void a(b bVar) {
                this.b.c((r) this);
                rVar.a(bVar);
            }

            public void a(c cVar) {
                rVar.a(cVar);
            }
        }, o()));
    }

    public n c(double d) {
        a();
        return a(d).b(d);
    }

    public n c(double d, String str) {
        a();
        return a(d, str).b(d, str);
    }

    public n c(String str) {
        return b(str, null);
    }

    public n c(String str, String str2) {
        a();
        return a(str, str2).b(str, str2);
    }

    public n c(boolean z) {
        return b(z, null);
    }

    public n c(boolean z, String str) {
        a();
        return a(z, str).b(z, str);
    }

    public void c(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("listener must not be null");
        }
        a(new ja(this.a, rVar, o()));
    }

    public n d(String str) {
        a();
        return b(str).c(str);
    }

    public n d(boolean z) {
        a();
        return b(z).c(z);
    }

    public n e(String str) {
        if (str == null) {
            throw new NullPointerException("Key can't be null");
        } else if (str.equals("$key") || str.equals(".key")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 54).append("Can't use '").append(str).append("' as path, please use orderByKey() instead!").toString());
        } else if (str.equals("$priority") || str.equals(".priority")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("Can't use '").append(str).append("' as path, please use orderByPriority() instead!").toString());
        } else if (str.equals("$value") || str.equals(".value")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 56).append("Can't use '").append(str).append("' as path, please use orderByValue() instead!").toString());
        } else {
            ml.a(str);
            b();
            ij ijVar = new ij(str);
            if (ijVar.i() == 0) {
                throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
            }
            return new n(this.a, this.b, this.c.a(new lj(ijVar)), true);
        }
    }

    public n j() {
        b();
        kf a = this.c.a(lk.d());
        a(a);
        return new n(this.a, this.b, a, true);
    }

    public n k() {
        b();
        kf a = this.c.a(ld.d());
        a(a);
        return new n(this.a, this.b, a, true);
    }

    public n l() {
        b();
        return new n(this.a, this.b, this.c.a(lp.d()), true);
    }

    public e m() {
        return new e(this.a, n());
    }

    public ij n() {
        return this.b;
    }

    public kg o() {
        return new kg(this.b, this.c);
    }
}
