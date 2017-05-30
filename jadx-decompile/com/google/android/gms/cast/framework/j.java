package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.internal.afc;

public abstract class j {
    private static final m a = new m("Session");
    private final z b;
    private final a c = new a();

    private class a extends com.google.android.gms.cast.framework.ad.a {
        final /* synthetic */ j a;

        private a(j jVar) {
            this.a = jVar;
        }

        public int a() {
            return 9683208;
        }

        public void a(Bundle bundle) {
            this.a.a(bundle);
        }

        public void a(boolean z) {
            this.a.a(z);
        }

        public e b() {
            return f.a(this.a);
        }

        public void b(Bundle bundle) {
            this.a.b(bundle);
        }

        public long c() {
            return this.a.k();
        }
    }

    protected j(Context context, String str, String str2) {
        this.b = afc.a(context, str, str2, this.c);
    }

    protected final void a(int i) {
        try {
            this.b.a(i);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "notifyFailedToStartSession", z.class.getSimpleName());
        }
    }

    protected abstract void a(Bundle bundle);

    protected abstract void a(boolean z);

    protected final void b(int i) {
        try {
            this.b.b(i);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "notifySessionEnded", z.class.getSimpleName());
        }
    }

    protected abstract void b(Bundle bundle);

    protected final void b(String str) {
        try {
            this.b.a(str);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "notifySessionStarted", z.class.getSimpleName());
        }
    }

    protected final void c(int i) {
        try {
            this.b.c(i);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", z.class.getSimpleName());
        }
    }

    protected final void c(boolean z) {
        try {
            this.b.a(z);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "notifySessionResumed", z.class.getSimpleName());
        }
    }

    protected final void d(int i) {
        try {
            this.b.d(i);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "notifySessionSuspended", z.class.getSimpleName());
        }
    }

    public long k() {
        return 0;
    }

    public final String m() {
        try {
            return this.b.b();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "getCategory", z.class.getSimpleName());
            return null;
        }
    }

    public final String n() {
        try {
            return this.b.c();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "getSessionId", z.class.getSimpleName());
            return null;
        }
    }

    public boolean o() {
        boolean z = false;
        try {
            z = this.b.e();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "isConnected", z.class.getSimpleName());
        }
        return z;
    }

    public boolean p() {
        boolean z = false;
        try {
            z = this.b.f();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "isConnecting", z.class.getSimpleName());
        }
        return z;
    }

    public boolean q() {
        boolean z = false;
        try {
            z = this.b.g();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "isDisconnecting", z.class.getSimpleName());
        }
        return z;
    }

    public boolean r() {
        boolean z = true;
        try {
            z = this.b.h();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "isDisconnected", z.class.getSimpleName());
        }
        return z;
    }

    public boolean s() {
        boolean z = false;
        try {
            z = this.b.i();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "isResuming", z.class.getSimpleName());
        }
        return z;
    }

    public boolean t() {
        boolean z = false;
        try {
            z = this.b.j();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "isSuspended", z.class.getSimpleName());
        }
        return z;
    }

    public final e u() {
        try {
            return this.b.a();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedObject", z.class.getSimpleName());
            return null;
        }
    }
}
