package com.google.android.gms.internal;

final class oi<T> extends oj<T> {
    private final of<T> a;
    private final nw<T> b;
    private final nr c;
    private final po<T> d;
    private final ok e;
    private oj<T> f;

    private static class a implements ok {
        private final po<?> a;
        private final boolean b;
        private final Class<?> c;
        private final of<?> d;
        private final nw<?> e;

        private a(Object obj, po<?> poVar, boolean z, Class<?> cls) {
            this.d = obj instanceof of ? (of) obj : null;
            this.e = obj instanceof nw ? (nw) obj : null;
            boolean z2 = (this.d == null && this.e == null) ? false : true;
            op.a(z2);
            this.a = poVar;
            this.b = z;
            this.c = cls;
        }

        public <T> oj<T> a(nr nrVar, po<T> poVar) {
            boolean isAssignableFrom = this.a != null ? this.a.equals(poVar) || (this.b && this.a.b() == poVar.a()) : this.c.isAssignableFrom(poVar.a());
            return isAssignableFrom ? new oi(this.d, this.e, nrVar, poVar, this) : null;
        }
    }

    private oi(of<T> ofVar, nw<T> nwVar, nr nrVar, po<T> poVar, ok okVar) {
        this.a = ofVar;
        this.b = nwVar;
        this.c = nrVar;
        this.d = poVar;
        this.e = okVar;
    }

    private oj<T> a() {
        oj<T> ojVar = this.f;
        if (ojVar != null) {
            return ojVar;
        }
        ojVar = this.c.a(this.e, this.d);
        this.f = ojVar;
        return ojVar;
    }

    public static ok a(po<?> poVar, Object obj) {
        return new a(obj, poVar, false, null);
    }

    public static ok b(po<?> poVar, Object obj) {
        return new a(obj, poVar, poVar.b() == poVar.a(), null);
    }

    public void a(ps psVar, T t) {
        if (this.a == null) {
            a().a(psVar, t);
        } else if (t == null) {
            psVar.f();
        } else {
            oz.a(this.a.a(t, this.d.b(), this.c.b), psVar);
        }
    }

    public T b(pp ppVar) {
        if (this.b == null) {
            return a().b(ppVar);
        }
        nx a = oz.a(ppVar);
        if (a.k()) {
            return null;
        }
        try {
            return this.b.b(a, this.d.b(), this.c.a);
        } catch (ob e) {
            throw e;
        } catch (Throwable e2) {
            throw new ob(e2);
        }
    }
}
