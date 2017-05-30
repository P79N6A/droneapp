package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.BinderThread;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.j;
import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public class ahw implements ahz {
    private final aia a;
    private final Lock b;
    private final Context c;
    private final j d;
    private ConnectionResult e;
    private int f;
    private int g = 0;
    private int h;
    private final Bundle i = new Bundle();
    private final Set<com.google.android.gms.common.api.a.d> j = new HashSet();
    private aok k;
    private int l;
    private boolean m;
    private boolean n;
    private ac o;
    private boolean p;
    private boolean q;
    private final s r;
    private final Map<com.google.android.gms.common.api.a<?>, Integer> s;
    private final com.google.android.gms.common.api.a.b<? extends aok, aom> t;
    private ArrayList<Future<?>> u = new ArrayList();

    private static class a implements com.google.android.gms.common.internal.p.f {
        private final WeakReference<ahw> a;
        private final com.google.android.gms.common.api.a<?> b;
        private final int c;

        public a(ahw com_google_android_gms_internal_ahw, com.google.android.gms.common.api.a<?> aVar, int i) {
            this.a = new WeakReference(com_google_android_gms_internal_ahw);
            this.b = aVar;
            this.c = i;
        }

        public void a(@NonNull ConnectionResult connectionResult) {
            boolean z = false;
            ahw com_google_android_gms_internal_ahw = (ahw) this.a.get();
            if (com_google_android_gms_internal_ahw != null) {
                if (Looper.myLooper() == com_google_android_gms_internal_ahw.a.i.c()) {
                    z = true;
                }
                com.google.android.gms.common.internal.d.a(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
                com_google_android_gms_internal_ahw.b.lock();
                try {
                    if (com_google_android_gms_internal_ahw.b(0)) {
                        if (!connectionResult.b()) {
                            com_google_android_gms_internal_ahw.b(connectionResult, this.b, this.c);
                        }
                        if (com_google_android_gms_internal_ahw.d()) {
                            com_google_android_gms_internal_ahw.e();
                        }
                        com_google_android_gms_internal_ahw.b.unlock();
                    }
                } finally {
                    com_google_android_gms_internal_ahw.b.unlock();
                }
            }
        }
    }

    private abstract class f implements Runnable {
        final /* synthetic */ ahw b;

        private f(ahw com_google_android_gms_internal_ahw) {
            this.b = com_google_android_gms_internal_ahw;
        }

        @WorkerThread
        protected abstract void a();

        @WorkerThread
        public void run() {
            this.b.b.lock();
            try {
                if (!Thread.interrupted()) {
                    a();
                    this.b.b.unlock();
                }
            } catch (RuntimeException e) {
                this.b.a.a(e);
            } finally {
                this.b.b.unlock();
            }
        }
    }

    private class b extends f {
        final /* synthetic */ ahw a;
        private final Map<com.google.android.gms.common.api.a.f, a> c;

        public b(ahw com_google_android_gms_internal_ahw, Map<com.google.android.gms.common.api.a.f, a> map) {
            this.a = com_google_android_gms_internal_ahw;
            super();
            this.c = map;
        }

        @WorkerThread
        public void a() {
            int i;
            int i2 = 1;
            int i3 = 0;
            int i4 = 1;
            int i5 = 0;
            for (com.google.android.gms.common.api.a.f fVar : this.c.keySet()) {
                if (!fVar.w()) {
                    i = 0;
                    i4 = i5;
                } else if (((a) this.c.get(fVar)).c == 0) {
                    i = 1;
                    break;
                } else {
                    i = i4;
                    i4 = 1;
                }
                i5 = i4;
                i4 = i;
            }
            i2 = i5;
            i = 0;
            if (i2 != 0) {
                i3 = this.a.d.a(this.a.c);
            }
            if (i3 == 0 || (r0 == 0 && i4 == 0)) {
                if (this.a.m) {
                    this.a.k.h();
                }
                for (com.google.android.gms.common.api.a.f fVar2 : this.c.keySet()) {
                    final com.google.android.gms.common.internal.p.f fVar3 = (com.google.android.gms.common.internal.p.f) this.c.get(fVar2);
                    if (!fVar2.w() || i3 == 0) {
                        fVar2.a(fVar3);
                    } else {
                        this.a.a.a(new a(this, this.a) {
                            final /* synthetic */ b b;

                            public void a() {
                                fVar3.a(new ConnectionResult(16, null));
                            }
                        });
                    }
                }
                return;
            }
            final ConnectionResult connectionResult = new ConnectionResult(i3, null);
            this.a.a.a(new a(this, this.a) {
                final /* synthetic */ b b;

                public void a() {
                    this.b.a.c(connectionResult);
                }
            });
        }
    }

    private class c extends f {
        final /* synthetic */ ahw a;
        private final ArrayList<com.google.android.gms.common.api.a.f> c;

        public c(ahw com_google_android_gms_internal_ahw, ArrayList<com.google.android.gms.common.api.a.f> arrayList) {
            this.a = com_google_android_gms_internal_ahw;
            super();
            this.c = arrayList;
        }

        @WorkerThread
        public void a() {
            this.a.a.i.f = this.a.j();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.common.api.a.f) it.next()).a(this.a.o, this.a.a.i.f);
            }
        }
    }

    private static class d extends com.google.android.gms.signin.internal.b {
        private final WeakReference<ahw> a;

        d(ahw com_google_android_gms_internal_ahw) {
            this.a = new WeakReference(com_google_android_gms_internal_ahw);
        }

        @BinderThread
        public void a(final SignInResponse signInResponse) {
            final ahw com_google_android_gms_internal_ahw = (ahw) this.a.get();
            if (com_google_android_gms_internal_ahw != null) {
                com_google_android_gms_internal_ahw.a.a(new a(this, com_google_android_gms_internal_ahw) {
                    final /* synthetic */ d c;

                    public void a() {
                        com_google_android_gms_internal_ahw.a(signInResponse);
                    }
                });
            }
        }
    }

    private class e implements com.google.android.gms.common.api.g.b, com.google.android.gms.common.api.g.c {
        final /* synthetic */ ahw a;

        private e(ahw com_google_android_gms_internal_ahw) {
            this.a = com_google_android_gms_internal_ahw;
        }

        public void a(int i) {
        }

        public void a(Bundle bundle) {
            this.a.k.a(new d(this.a));
        }

        public void a(@NonNull ConnectionResult connectionResult) {
            this.a.b.lock();
            try {
                if (this.a.b(connectionResult)) {
                    this.a.h();
                    this.a.e();
                } else {
                    this.a.c(connectionResult);
                }
                this.a.b.unlock();
            } catch (Throwable th) {
                this.a.b.unlock();
            }
        }
    }

    public ahw(aia com_google_android_gms_internal_aia, s sVar, Map<com.google.android.gms.common.api.a<?>, Integer> map, j jVar, com.google.android.gms.common.api.a.b<? extends aok, aom> bVar, Lock lock, Context context) {
        this.a = com_google_android_gms_internal_aia;
        this.r = sVar;
        this.s = map;
        this.d = jVar;
        this.t = bVar;
        this.b = lock;
        this.c = context;
    }

    private void a(SignInResponse signInResponse) {
        if (b(0)) {
            ConnectionResult a = signInResponse.a();
            if (a.b()) {
                ResolveAccountResponse b = signInResponse.b();
                ConnectionResult b2 = b.b();
                if (b2.b()) {
                    this.n = true;
                    this.o = b.a();
                    this.p = b.c();
                    this.q = b.d();
                    e();
                    return;
                }
                String valueOf = String.valueOf(b2);
                Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                c(b2);
            } else if (b(a)) {
                h();
                e();
            } else {
                c(a);
            }
        }
    }

    private void a(boolean z) {
        if (this.k != null) {
            if (this.k.t() && z) {
                this.k.t_();
            }
            this.k.f();
            this.o = null;
        }
    }

    private boolean a(int i, int i2, ConnectionResult connectionResult) {
        return (i2 != 1 || a(connectionResult)) ? this.e == null || i < this.f : false;
    }

    private boolean a(ConnectionResult connectionResult) {
        return connectionResult.a() || this.d.b(connectionResult.c()) != null;
    }

    private void b(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, int i) {
        if (i != 2) {
            int a = aVar.a().a();
            if (a(a, i, connectionResult)) {
                this.e = connectionResult;
                this.f = a;
            }
        }
        this.a.d.put(aVar.d(), connectionResult);
    }

    private boolean b(int i) {
        if (this.g == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.a.i.q());
        String valueOf = String.valueOf(this);
        Log.w("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Unexpected callback in ").append(valueOf).toString());
        Log.w("GoogleApiClientConnecting", "mRemainingConnections=" + this.h);
        valueOf = String.valueOf(c(this.g));
        String valueOf2 = String.valueOf(c(i));
        Log.wtf("GoogleApiClientConnecting", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("GoogleApiClient connecting is in step ").append(valueOf).append(" but received callback for step ").append(valueOf2).toString(), new Exception());
        c(new ConnectionResult(8, null));
        return false;
    }

    private boolean b(ConnectionResult connectionResult) {
        return this.l != 2 ? this.l == 1 && !connectionResult.a() : true;
    }

    private String c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    private void c(ConnectionResult connectionResult) {
        i();
        a(!connectionResult.a());
        this.a.a(connectionResult);
        this.a.j.a(connectionResult);
    }

    private boolean d() {
        this.h--;
        if (this.h > 0) {
            return false;
        }
        if (this.h < 0) {
            Log.w("GoogleApiClientConnecting", this.a.i.q());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            c(new ConnectionResult(8, null));
            return false;
        } else if (this.e == null) {
            return true;
        } else {
            this.a.h = this.f;
            c(this.e);
            return false;
        }
    }

    private void e() {
        if (this.h == 0) {
            if (!this.m || this.n) {
                f();
            }
        }
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        this.g = 1;
        this.h = this.a.a.size();
        for (com.google.android.gms.common.api.a.d dVar : this.a.a.keySet()) {
            if (!this.a.d.containsKey(dVar)) {
                arrayList.add((com.google.android.gms.common.api.a.f) this.a.a.get(dVar));
            } else if (d()) {
                g();
            }
        }
        if (!arrayList.isEmpty()) {
            this.u.add(aib.a().submit(new c(this, arrayList)));
        }
    }

    private void g() {
        this.a.i();
        aib.a().execute(new Runnable(this) {
            final /* synthetic */ ahw a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.d.e(this.a.c);
            }
        });
        if (this.k != null) {
            if (this.p) {
                this.k.a(this.o, this.q);
            }
            a(false);
        }
        for (com.google.android.gms.common.api.a.d dVar : this.a.d.keySet()) {
            ((com.google.android.gms.common.api.a.f) this.a.a.get(dVar)).f();
        }
        this.a.j.a(this.i.isEmpty() ? null : this.i);
    }

    private void h() {
        this.m = false;
        this.a.i.f = Collections.emptySet();
        for (com.google.android.gms.common.api.a.d dVar : this.j) {
            if (!this.a.d.containsKey(dVar)) {
                this.a.d.put(dVar, new ConnectionResult(17, null));
            }
        }
    }

    private void i() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.u.clear();
    }

    private Set<Scope> j() {
        if (this.r == null) {
            return Collections.emptySet();
        }
        Set<Scope> hashSet = new HashSet(this.r.e());
        Map g = this.r.g();
        for (com.google.android.gms.common.api.a aVar : g.keySet()) {
            if (!this.a.d.containsKey(aVar.d())) {
                hashSet.addAll(((com.google.android.gms.common.internal.s.a) g.get(aVar)).a);
            }
        }
        return hashSet;
    }

    public <A extends com.google.android.gms.common.api.a.c, R extends m, T extends com.google.android.gms.internal.ahl.a<R, A>> T a(T t) {
        this.a.i.c.add(t);
        return t;
    }

    public void a() {
        this.a.d.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = 2;
        this.n = false;
        this.p = false;
        Map hashMap = new HashMap();
        int i = 0;
        for (com.google.android.gms.common.api.a aVar : this.s.keySet()) {
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) this.a.a.get(aVar.d());
            int intValue = ((Integer) this.s.get(aVar)).intValue();
            int i2 = (aVar.a().a() == 1 ? 1 : 0) | i;
            if (fVar.v()) {
                this.m = true;
                if (intValue < this.l) {
                    this.l = intValue;
                }
                if (intValue != 0) {
                    this.j.add(aVar.d());
                }
            }
            hashMap.put(fVar, new a(this, aVar, intValue));
            i = i2;
        }
        if (i != 0) {
            this.m = false;
        }
        if (this.m) {
            this.r.a(Integer.valueOf(this.a.i.r()));
            com.google.android.gms.common.api.g.b eVar = new e();
            this.k = (aok) this.t.a(this.c, this.a.i.c(), this.r, this.r.k(), eVar, eVar);
        }
        this.h = this.a.a.size();
        this.u.add(aib.a().submit(new b(this, hashMap)));
    }

    public void a(int i) {
        c(new ConnectionResult(8, null));
    }

    public void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    public void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, int i) {
        if (b(1)) {
            b(connectionResult, aVar, i);
            if (d()) {
                g();
            }
        }
    }

    public <A extends com.google.android.gms.common.api.a.c, T extends com.google.android.gms.internal.ahl.a<? extends m, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public boolean b() {
        i();
        a(true);
        this.a.a(null);
        return true;
    }

    public void c() {
    }
}
