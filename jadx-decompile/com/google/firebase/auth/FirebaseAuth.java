package com.google.firebase.auth;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.g.f;
import com.google.android.gms.g.i;
import com.google.android.gms.internal.ft;
import com.google.android.gms.internal.fw;
import com.google.android.gms.internal.fy;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gj;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.gs;
import com.google.android.gms.internal.gt;
import com.google.android.gms.internal.mq;
import com.google.android.gms.internal.mr;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class FirebaseAuth implements mq {
    private static Map<String, FirebaseAuth> g = new ArrayMap();
    private static FirebaseAuth h;
    private com.google.firebase.b a;
    private List<a> b;
    private ft c;
    private n d;
    private gs e;
    private gt f;

    public interface a {
        void a(@NonNull FirebaseAuth firebaseAuth);
    }

    class b implements gj {
        final /* synthetic */ FirebaseAuth a;

        b(FirebaseAuth firebaseAuth) {
            this.a = firebaseAuth;
        }

        public void a(@NonNull GetTokenResponse getTokenResponse, @NonNull n nVar) {
            d.a(getTokenResponse);
            d.a(nVar);
            nVar.a(getTokenResponse);
            this.a.a(nVar, getTokenResponse, true);
            this.a.a(nVar, true, true);
        }
    }

    public FirebaseAuth(com.google.firebase.b bVar) {
        this(bVar, a(bVar), new gs(bVar.a(), bVar.f(), fy.a()));
    }

    FirebaseAuth(com.google.firebase.b bVar, ft ftVar, gs gsVar) {
        this.a = (com.google.firebase.b) d.a(bVar);
        this.c = (ft) d.a(ftVar);
        this.e = (gs) d.a(gsVar);
        this.b = new CopyOnWriteArrayList();
        this.f = gt.a();
        f();
    }

    static ft a(com.google.firebase.b bVar) {
        return gb.a(bVar.a(), new com.google.android.gms.internal.gb.a.a(bVar.c().a()).a());
    }

    public static FirebaseAuth a() {
        return b(com.google.firebase.b.d());
    }

    private static FirebaseAuth b(@NonNull com.google.firebase.b bVar) {
        return c(bVar);
    }

    private static synchronized FirebaseAuth c(@NonNull com.google.firebase.b bVar) {
        FirebaseAuth firebaseAuth;
        synchronized (FirebaseAuth.class) {
            firebaseAuth = (FirebaseAuth) g.get(bVar.f());
            if (firebaseAuth == null) {
                firebaseAuth = new gn(bVar);
                bVar.a(firebaseAuth);
                if (h == null) {
                    h = firebaseAuth;
                }
                g.put(bVar.f(), firebaseAuth);
            }
        }
        return firebaseAuth;
    }

    @Keep
    public static FirebaseAuth getInstance(@NonNull com.google.firebase.b bVar) {
        return b(bVar);
    }

    @NonNull
    public f<b> a(@NonNull a aVar) {
        d.a(aVar);
        if (!c.class.isAssignableFrom(aVar.getClass())) {
            return this.c.a(this.a, aVar, new b(this));
        }
        c cVar = (c) aVar;
        return this.c.b(this.a, cVar.b(), cVar.c(), new b(this));
    }

    @NonNull
    public f<Void> a(@NonNull n nVar, @NonNull UserProfileChangeRequest userProfileChangeRequest) {
        d.a(nVar);
        d.a(userProfileChangeRequest);
        return this.c.a(this.a, nVar, userProfileChangeRequest, new b(this));
    }

    @NonNull
    public f<Void> a(@NonNull n nVar, @NonNull a aVar) {
        d.a(nVar);
        d.a(aVar);
        if (!c.class.isAssignableFrom(aVar.getClass())) {
            return this.c.a(this.a, nVar, aVar, new b(this));
        }
        c cVar = (c) aVar;
        return this.c.a(this.a, nVar, cVar.b(), cVar.c(), new b(this));
    }

    @NonNull
    public f<b> a(@NonNull n nVar, @NonNull String str) {
        d.a(str);
        d.a(nVar);
        return this.c.d(this.a, nVar, str, new b(this));
    }

    @NonNull
    public f<o> a(@Nullable n nVar, boolean z) {
        if (nVar == null) {
            return i.a(fw.a(new Status(17495)));
        }
        GetTokenResponse l = this.d.l();
        return (!l.a() || z) ? this.c.a(this.a, nVar, l.b(), new gj(this) {
            final /* synthetic */ FirebaseAuth a;

            {
                this.a = r1;
            }

            public void a(@NonNull GetTokenResponse getTokenResponse, @NonNull n nVar) {
                this.a.a(nVar, getTokenResponse, true);
            }
        }) : i.a(new o(l.c()));
    }

    @NonNull
    public f<b> a(@NonNull String str) {
        d.a(str);
        return this.c.a(this.a, str, new b(this));
    }

    @NonNull
    public f<b> a(@NonNull String str, @NonNull String str2) {
        d.a(str);
        d.a(str2);
        return this.c.b(this.a, str, str2, new b(this));
    }

    @NonNull
    public f<o> a(boolean z) {
        return a(this.d, z);
    }

    public void a(@NonNull final a aVar) {
        this.b.add(aVar);
        this.f.execute(new Runnable(this) {
            final /* synthetic */ FirebaseAuth b;

            public void run() {
                aVar.a(this.b);
            }
        });
    }

    public void a(@Nullable n nVar) {
        if (nVar != null) {
            String valueOf = String.valueOf(nVar.a());
            Log.d("FirebaseAuth", new StringBuilder(String.valueOf(valueOf).length() + 36).append("Notifying listeners about user ( ").append(valueOf).append(" ).").toString());
        } else {
            Log.d("FirebaseAuth", "Notifying listeners about a sign-out event.");
        }
        final mr mrVar = new mr(nVar != null ? nVar.m() : null);
        this.f.execute(new Runnable(this) {
            final /* synthetic */ FirebaseAuth b;

            public void run() {
                this.b.a.a(mrVar);
                for (a a : this.b.b) {
                    a.a(this.b);
                }
            }
        });
    }

    public void a(@NonNull n nVar, @NonNull GetTokenResponse getTokenResponse, boolean z) {
        Object obj = 1;
        d.a(nVar);
        d.a(getTokenResponse);
        if (this.d != null) {
            String c = this.d.l().c();
            String c2 = getTokenResponse.c();
            if (!this.d.a().equalsIgnoreCase(nVar.a()) || c == null || c.equals(c2)) {
                obj = null;
            }
        }
        if (obj != null) {
            if (this.d != null) {
                this.d.a(getTokenResponse);
            }
            a(this.d);
        }
        if (z) {
            this.e.a(nVar, getTokenResponse);
        }
    }

    public void a(@NonNull n nVar, boolean z, boolean z2) {
        d.a(nVar);
        if (this.d == null) {
            this.d = nVar;
        } else {
            this.d.b(nVar.i());
            this.d.a(nVar.k());
        }
        if (z) {
            this.e.a(this.d);
        }
        if (z2) {
            a(this.d);
        }
    }

    @NonNull
    public f<Void> b(@NonNull n nVar) {
        d.a(nVar);
        return this.c.a(this.a, nVar, new b(this));
    }

    @NonNull
    public f<b> b(@NonNull n nVar, @NonNull a aVar) {
        d.a(aVar);
        d.a(nVar);
        return this.c.b(this.a, nVar, aVar, new b(this));
    }

    @NonNull
    public f<Void> b(@NonNull n nVar, @NonNull String str) {
        d.a(nVar);
        d.a(str);
        return this.c.b(this.a, nVar, str, new b(this));
    }

    @NonNull
    public f<t> b(@NonNull String str) {
        d.a(str);
        return this.c.a(this.a, str);
    }

    @NonNull
    public f<b> b(@NonNull String str, @NonNull String str2) {
        d.a(str);
        d.a(str2);
        return this.c.a(this.a, str, str2, new b(this));
    }

    @Nullable
    public n b() {
        return this.d;
    }

    public void b(@NonNull a aVar) {
        this.b.remove(aVar);
    }

    @NonNull
    public f<Void> c(@NonNull final n nVar) {
        d.a(nVar);
        return this.c.a(nVar, new gr(this) {
            final /* synthetic */ FirebaseAuth b;

            public void a() {
                if (this.b.d.a().equalsIgnoreCase(nVar.a())) {
                    this.b.c();
                }
            }
        });
    }

    @NonNull
    public f<Void> c(@NonNull n nVar, @NonNull String str) {
        d.a(nVar);
        d.a(str);
        return this.c.c(this.a, nVar, str, new b(this));
    }

    @NonNull
    public f<Void> c(@NonNull String str) {
        d.a(str);
        return this.c.b(this.a, str);
    }

    public void c() {
        if (this.d != null) {
            this.e.c(this.d);
            this.d = null;
        }
        this.e.b();
        a(null);
    }

    @NonNull
    public f<b> d() {
        return (this.d == null || !this.d.i()) ? this.c.a(this.a, new b(this)) : i.a(new gl((go) this.d));
    }

    @NonNull
    public f<Void> d(@NonNull String str) {
        d.a(str);
        return this.c.c(this.a, str);
    }

    public void e() {
        c();
    }

    protected void f() {
        this.d = this.e.a();
        if (this.d != null) {
            a(this.d, false, true);
            GetTokenResponse b = this.e.b(this.d);
            if (b != null) {
                a(this.d, b, false);
            }
        }
    }
}
