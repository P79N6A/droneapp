package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.a.e;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.n;
import com.google.android.gms.internal.afc;
import com.google.android.gms.internal.afe;
import com.google.android.gms.internal.afq;
import java.util.HashSet;
import java.util.Set;

public class d extends j {
    private static final m a = new m("CastSession");
    private final Context b;
    private final Set<com.google.android.gms.cast.a.d> c = new HashSet();
    private final u d;
    private final com.google.android.gms.cast.a.b e;
    private final afe f;
    private final afq g;
    private g h;
    private com.google.android.gms.cast.framework.media.c i;
    private CastDevice j;
    private com.google.android.gms.cast.a.a k;

    private class a implements n<com.google.android.gms.cast.a.a> {
        String a;
        final /* synthetic */ d b;

        a(d dVar, String str) {
            this.b = dVar;
            this.a = str;
        }

        public void a(@NonNull com.google.android.gms.cast.a.a aVar) {
            this.b.k = aVar;
            try {
                if (aVar.a().f()) {
                    d.a.b("%s() -> success result", this.a);
                    this.b.i = new com.google.android.gms.cast.framework.media.c(new com.google.android.gms.cast.internal.n(null), this.b.e);
                    try {
                        this.b.i.a(this.b.h);
                        this.b.i.d();
                        this.b.g.a(this.b.i, this.b.b());
                    } catch (Throwable e) {
                        d.a.c(e, "Exception when setting GoogleApiClient.", new Object[0]);
                        this.b.i = null;
                    }
                    this.b.d.a(aVar.b(), aVar.c(), aVar.d(), aVar.e());
                    return;
                }
                d.a.b("%s() -> failure result", this.a);
                this.b.d.b(aVar.a().i());
            } catch (Throwable e2) {
                d.a.a(e2, "Unable to call %s on %s.", "methods", u.class.getSimpleName());
            }
        }

        public /* synthetic */ void a(@NonNull com.google.android.gms.common.api.m mVar) {
            a((com.google.android.gms.cast.a.a) mVar);
        }
    }

    private class b extends com.google.android.gms.cast.framework.s.a {
        final /* synthetic */ d a;

        private b(d dVar) {
            this.a = dVar;
        }

        public int a() {
            return 9683208;
        }

        public void a(int i) {
            this.a.e(i);
        }

        public void a(String str) {
            this.a.e.c(this.a.h, str);
        }

        public void a(String str, LaunchOptions launchOptions) {
            this.a.e.a(this.a.h, str, launchOptions).a(new a(this.a, "launchApplication"));
        }

        public void a(String str, String str2) {
            this.a.e.b(this.a.h, str, str2).a(new a(this.a, "joinApplication"));
        }
    }

    private class c extends com.google.android.gms.cast.a.d {
        final /* synthetic */ d a;

        private c(d dVar) {
            this.a = dVar;
        }

        public void a() {
            for (com.google.android.gms.cast.a.d a : new HashSet(this.a.c)) {
                a.a();
            }
        }

        public void a(int i) {
            this.a.e(i);
            this.a.b(i);
            for (com.google.android.gms.cast.a.d a : new HashSet(this.a.c)) {
                a.a(i);
            }
        }

        public void a(ApplicationMetadata applicationMetadata) {
            for (com.google.android.gms.cast.a.d a : new HashSet(this.a.c)) {
                a.a(applicationMetadata);
            }
        }

        public void b() {
            for (com.google.android.gms.cast.a.d b : new HashSet(this.a.c)) {
                b.b();
            }
        }

        public void b(int i) {
            for (com.google.android.gms.cast.a.d b : new HashSet(this.a.c)) {
                b.b(i);
            }
        }

        public void c(int i) {
            for (com.google.android.gms.cast.a.d c : new HashSet(this.a.c)) {
                c.c(i);
            }
        }
    }

    private class d implements com.google.android.gms.common.api.g.b, com.google.android.gms.common.api.g.c {
        final /* synthetic */ d a;

        private d(d dVar) {
            this.a = dVar;
        }

        public void a(int i) {
            try {
                this.a.d.a(i);
            } catch (Throwable e) {
                d.a.a(e, "Unable to call %s on %s.", "onConnectionSuspended", u.class.getSimpleName());
            }
        }

        public void a(Bundle bundle) {
            try {
                this.a.d.a(bundle);
            } catch (Throwable e) {
                d.a.a(e, "Unable to call %s on %s.", "onConnected", u.class.getSimpleName());
            }
        }

        public void a(@NonNull ConnectionResult connectionResult) {
            try {
                this.a.d.a(connectionResult);
            } catch (Throwable e) {
                d.a.a(e, "Unable to call %s on %s.", "onConnectionFailed", u.class.getSimpleName());
            }
        }
    }

    public d(Context context, String str, String str2, CastOptions castOptions, com.google.android.gms.cast.a.b bVar, afe com_google_android_gms_internal_afe, afq com_google_android_gms_internal_afq) {
        super(context, str, str2);
        this.b = context.getApplicationContext();
        this.e = bVar;
        this.f = com_google_android_gms_internal_afe;
        this.g = com_google_android_gms_internal_afq;
        this.d = afc.a(context, castOptions, u(), new b());
    }

    private void c(Bundle bundle) {
        this.j = CastDevice.b(bundle);
        if (this.j != null) {
            if (this.h != null) {
                this.h.g();
                this.h = null;
            }
            a.b("Acquiring a connection to Google Play Services for %s", this.j);
            com.google.android.gms.common.api.g.b dVar = new d();
            this.h = this.f.a(this.b, this.j, new c(), dVar, dVar);
            this.h.e();
        } else if (s()) {
            c(8);
        } else {
            a(8);
        }
    }

    private void e(int i) {
        this.g.a(i);
        if (this.h != null) {
            this.h.g();
            this.h = null;
        }
        this.j = null;
        if (this.i != null) {
            try {
                this.i.a(null);
            } catch (Throwable e) {
                a.c(e, "Exception when setting GoogleApiClient.", new Object[0]);
            }
            this.i = null;
        }
        this.k = null;
    }

    public com.google.android.gms.cast.framework.media.c a() {
        return this.i;
    }

    public i<Status> a(String str, String str2) {
        return this.h != null ? this.e.a(this.h, str, str2) : null;
    }

    public void a(double d) {
        if (this.h != null) {
            this.e.a(this.h, d);
        }
    }

    protected void a(Bundle bundle) {
        c(bundle);
    }

    public void a(com.google.android.gms.cast.a.d dVar) {
        if (dVar != null) {
            this.c.add(dVar);
        }
    }

    public void a(String str) {
        if (this.h != null) {
            this.e.d(this.h, str);
        }
    }

    public void a(String str, e eVar) {
        if (this.h != null) {
            this.e.a(this.h, str, eVar);
        }
    }

    protected void a(boolean z) {
        try {
            this.d.a(z, 0);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "disconnectFromDevice", u.class.getSimpleName());
        }
        b(0);
    }

    public CastDevice b() {
        return this.j;
    }

    protected void b(Bundle bundle) {
        c(bundle);
    }

    public void b(com.google.android.gms.cast.a.d dVar) {
        if (dVar != null) {
            this.c.remove(dVar);
        }
    }

    public void b(boolean z) {
        if (this.h != null) {
            this.e.a(this.h, z);
        }
    }

    public void c() {
        if (this.h != null) {
            this.e.a(this.h);
        }
    }

    public int d() {
        return this.h != null ? this.e.g(this.h) : -1;
    }

    public int e() {
        return this.h != null ? this.e.h(this.h) : -1;
    }

    public ApplicationMetadata f() {
        return this.h != null ? this.e.i(this.h) : null;
    }

    public String g() {
        return this.h != null ? this.e.j(this.h) : null;
    }

    public double h() {
        return this.h != null ? this.e.e(this.h) : 0.0d;
    }

    public boolean i() {
        return this.h != null ? this.e.f(this.h) : false;
    }

    public com.google.android.gms.cast.a.a j() {
        return this.k;
    }

    public long k() {
        return this.i == null ? 0 : this.i.f() - this.i.e();
    }
}
