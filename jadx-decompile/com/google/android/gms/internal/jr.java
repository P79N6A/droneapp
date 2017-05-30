package com.google.android.gms.internal;

import com.google.android.gms.internal.ju.a;

public class jr {
    private static final jv<Boolean> b = new jv<Boolean>() {
        public boolean a(Boolean bool) {
            return !bool.booleanValue();
        }

        public /* synthetic */ boolean a(Object obj) {
            return a((Boolean) obj);
        }
    };
    private static final jv<Boolean> c = new jv<Boolean>() {
        public boolean a(Boolean bool) {
            return bool.booleanValue();
        }

        public /* synthetic */ boolean a(Object obj) {
            return a((Boolean) obj);
        }
    };
    private static final ju<Boolean> d = new ju(Boolean.valueOf(true));
    private static final ju<Boolean> e = new ju(Boolean.valueOf(false));
    private final ju<Boolean> a;

    public jr() {
        this.a = ju.a();
    }

    private jr(ju<Boolean> juVar) {
        this.a = juVar;
    }

    public jr a(kv kvVar) {
        ju a = this.a.a(kvVar);
        ju juVar = a == null ? new ju((Boolean) this.a.b()) : (a.b() != null || this.a.b() == null) ? a : a.a(ij.a(), (Boolean) this.a.b());
        return new jr(juVar);
    }

    public <T> T a(T t, final a<Void, T> aVar) {
        return this.a.a((Object) t, new a<Boolean, T>(this) {
            final /* synthetic */ jr b;

            public T a(ij ijVar, Boolean bool, T t) {
                return !bool.booleanValue() ? aVar.a(ijVar, null, t) : t;
            }
        });
    }

    public boolean a() {
        return this.a.a(c);
    }

    public boolean a(ij ijVar) {
        Boolean bool = (Boolean) this.a.b(ijVar);
        return bool != null && bool.booleanValue();
    }

    public boolean b(ij ijVar) {
        Boolean bool = (Boolean) this.a.b(ijVar);
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    public jr c(ij ijVar) {
        if (this.a.b(ijVar, b) == null) {
            return this.a.b(ijVar, c) != null ? this : new jr(this.a.a(ijVar, d));
        } else {
            throw new IllegalArgumentException("Can't prune path that was kept previously!");
        }
    }

    public jr d(ij ijVar) {
        return this.a.b(ijVar, b) != null ? this : new jr(this.a.a(ijVar, e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr)) {
            return false;
        }
        return this.a.equals(((jr) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 14).append("{PruneForest:").append(valueOf).append("}").toString();
    }
}
