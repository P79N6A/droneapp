package com.google.android.gms.cast.framework;

import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.internal.d;

public class k {
    private static final m a = new m("SessionManager");
    private final aa b;

    public k(aa aaVar) {
        this.b = aaVar;
    }

    public j a() {
        try {
            return (j) f.a(this.b.a());
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", aa.class.getSimpleName());
            return null;
        }
    }

    public void a(f fVar) {
        d.a((Object) fVar);
        try {
            this.b.a(new p(fVar));
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "addCastStateListener", aa.class.getSimpleName());
        }
    }

    public void a(l<j> lVar) {
        a(lVar, j.class);
    }

    public <T extends j> void a(l<T> lVar, Class<T> cls) {
        d.a((Object) lVar);
        d.a((Object) cls);
        try {
            this.b.a(new ae(lVar, cls));
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "addSessionManagerListener", aa.class.getSimpleName());
        }
    }

    public void a(boolean z) {
        try {
            this.b.a(true, z);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "endCurrentSession", aa.class.getSimpleName());
        }
    }

    public d b() {
        j a = a();
        return (a == null || !(a instanceof d)) ? null : (d) a;
    }

    public void b(f fVar) {
        if (fVar != null) {
            try {
                this.b.b(new p(fVar));
            } catch (Throwable e) {
                a.a(e, "Unable to call %s on %s.", "removeCastStateListener", aa.class.getSimpleName());
            }
        }
    }

    public void b(l<j> lVar) {
        b(lVar, j.class);
    }

    public <T extends j> void b(l<T> lVar, Class cls) {
        d.a((Object) cls);
        if (lVar != null) {
            try {
                this.b.b(new ae(lVar, cls));
            } catch (Throwable e) {
                a.a(e, "Unable to call %s on %s.", "removeSessionManagerListener", aa.class.getSimpleName());
            }
        }
    }

    public e c() {
        try {
            return this.b.b();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedThis", aa.class.getSimpleName());
            return null;
        }
    }
}
