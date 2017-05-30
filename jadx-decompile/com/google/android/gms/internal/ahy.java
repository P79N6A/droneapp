package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class ahy extends g implements com.google.android.gms.internal.aig.a {
    final Queue<com.google.android.gms.internal.ahl.a<?, ?>> c = new LinkedList();
    zzqv d;
    final Map<d<?>, f> e;
    Set<Scope> f = new HashSet();
    final s g;
    final Map<com.google.android.gms.common.api.a<?>, Integer> h;
    final com.google.android.gms.common.api.a.b<? extends aok, aom> i;
    Set<aiw> j = null;
    final aix k;
    private final Lock l;
    private final x m;
    private aig n = null;
    private final int o;
    private final Context p;
    private final Looper q;
    private volatile boolean r;
    private long s = 120000;
    private long t = 5000;
    private final a u;
    private final com.google.android.gms.common.b v;
    private final aim w = new aim();
    private final ArrayList<aho> x;
    private Integer y = null;
    private final com.google.android.gms.common.internal.x.a z = new com.google.android.gms.common.internal.x.a(this) {
        final /* synthetic */ ahy a;

        {
            this.a = r1;
        }

        public Bundle g() {
            return null;
        }

        public boolean t() {
            return this.a.j();
        }
    };

    final class a extends Handler {
        final /* synthetic */ ahy a;

        a(ahy com_google_android_gms_internal_ahy, Looper looper) {
            this.a = com_google_android_gms_internal_ahy;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.a.u();
                    return;
                case 2:
                    this.a.t();
                    return;
                default:
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
                    return;
            }
        }
    }

    static class b extends com.google.android.gms.internal.zzqv.a {
        private WeakReference<ahy> a;

        b(ahy com_google_android_gms_internal_ahy) {
            this.a = new WeakReference(com_google_android_gms_internal_ahy);
        }

        public void a() {
            ahy com_google_android_gms_internal_ahy = (ahy) this.a.get();
            if (com_google_android_gms_internal_ahy != null) {
                com_google_android_gms_internal_ahy.t();
            }
        }
    }

    public ahy(Context context, Lock lock, Looper looper, s sVar, com.google.android.gms.common.b bVar, com.google.android.gms.common.api.a.b<? extends aok, aom> bVar2, Map<com.google.android.gms.common.api.a<?>, Integer> map, List<com.google.android.gms.common.api.g.b> list, List<c> list2, Map<d<?>, f> map2, int i, int i2, ArrayList<aho> arrayList) {
        this.p = context;
        this.l = lock;
        this.m = new x(looper, this.z);
        this.q = looper;
        this.u = new a(this, looper);
        this.v = bVar;
        this.o = i;
        if (this.o >= 0) {
            this.y = Integer.valueOf(i2);
        }
        this.h = map;
        this.e = map2;
        this.x = arrayList;
        this.k = new aix(this.e);
        for (com.google.android.gms.common.api.g.b a : list) {
            this.m.a(a);
        }
        for (c a2 : list2) {
            this.m.a(a2);
        }
        this.g = sVar;
        this.i = bVar2;
    }

    public static int a(Iterable<f> iterable, boolean z) {
        int i = 0;
        int i2 = 0;
        for (f fVar : iterable) {
            if (fVar.v()) {
                i2 = 1;
            }
            i = fVar.h_() ? 1 : i;
        }
        return i2 != 0 ? (i == 0 || !z) ? 1 : 2 : 3;
    }

    private void a(final g gVar, final aiu com_google_android_gms_internal_aiu, final boolean z) {
        ajd.c.a(gVar).a(new n<Status>(this) {
            final /* synthetic */ ahy d;

            public void a(@NonNull Status status) {
                j.a(this.d.p).c();
                if (status.f() && this.d.j()) {
                    this.d.h();
                }
                com_google_android_gms_internal_aiu.b(status);
                if (z) {
                    gVar.g();
                }
            }

            public /* synthetic */ void a(@NonNull m mVar) {
                a((Status) mVar);
            }
        });
    }

    private void a(@NonNull aih com_google_android_gms_internal_aih) {
        if (this.o >= 0) {
            ahj.a(com_google_android_gms_internal_aih).a(this.o);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    static String b(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    private void c(int i) {
        if (this.y == null) {
            this.y = Integer.valueOf(i);
        } else if (this.y.intValue() != i) {
            String valueOf = String.valueOf(b(i));
            String valueOf2 = String.valueOf(b(this.y.intValue()));
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("Cannot use sign-in mode: ").append(valueOf).append(". Mode was already set to ").append(valueOf2).toString());
        }
        if (this.n == null) {
            Object obj = null;
            Object obj2 = null;
            for (f fVar : this.e.values()) {
                if (fVar.v()) {
                    obj2 = 1;
                }
                obj = fVar.h_() ? 1 : obj;
            }
            switch (this.y.intValue()) {
                case 1:
                    if (obj2 == null) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (obj != null) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (obj2 != null) {
                        this.n = ahq.a(this.p, this, this.l, this.q, this.v, this.e, this.g, this.h, this.i, this.x);
                        return;
                    }
                    break;
            }
            this.n = new aia(this.p, this, this.l, this.q, this.v, this.e, this.g, this.h, this.i, this.x, this);
        }
    }

    private void s() {
        this.m.b();
        this.n.a();
    }

    private void t() {
        this.l.lock();
        try {
            if (m()) {
                s();
            }
            this.l.unlock();
        } catch (Throwable th) {
            this.l.unlock();
        }
    }

    private void u() {
        this.l.lock();
        try {
            if (o()) {
                s();
            }
            this.l.unlock();
        } catch (Throwable th) {
            this.l.unlock();
        }
    }

    public ConnectionResult a(long j, @NonNull TimeUnit timeUnit) {
        boolean z = false;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        }
        com.google.android.gms.common.internal.d.a(z, "blockingConnect must not be called on the UI thread");
        com.google.android.gms.common.internal.d.a(timeUnit, "TimeUnit must not be null");
        this.l.lock();
        try {
            if (this.y == null) {
                this.y = Integer.valueOf(a(this.e.values(), false));
            } else if (this.y.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            c(this.y.intValue());
            this.m.b();
            ConnectionResult a = this.n.a(j, timeUnit);
            return a;
        } finally {
            this.l.unlock();
        }
    }

    @NonNull
    public <C extends f> C a(@NonNull d<C> dVar) {
        f fVar = (f) this.e.get(dVar);
        com.google.android.gms.common.internal.d.a(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    public <A extends com.google.android.gms.common.api.a.c, R extends m, T extends com.google.android.gms.internal.ahl.a<R, A>> T a(@NonNull T t) {
        com.google.android.gms.common.internal.d.b(t.g() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.e.containsKey(t.g());
        String f = t.h() != null ? t.h().f() : "the API";
        com.google.android.gms.common.internal.d.b(containsKey, new StringBuilder(String.valueOf(f).length() + 65).append("GoogleApiClient is not configured to use ").append(f).append(" required for this call.").toString());
        this.l.lock();
        try {
            if (this.n == null) {
                this.c.add(t);
            } else {
                t = this.n.a((com.google.android.gms.internal.ahl.a) t);
                this.l.unlock();
            }
            return t;
        } finally {
            this.l.unlock();
        }
    }

    public <L> ail<L> a(@NonNull L l) {
        this.l.lock();
        try {
            ail<L> a = this.w.a(l, this.q);
            return a;
        } finally {
            this.l.unlock();
        }
    }

    public void a(int i) {
        boolean z = true;
        this.l.lock();
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            com.google.android.gms.common.internal.d.b(z, "Illegal sign-in mode: " + i);
            c(i);
            s();
        } finally {
            this.l.unlock();
        }
    }

    public void a(int i, boolean z) {
        if (i == 1 && !z) {
            n();
        }
        this.k.b();
        this.m.a(i);
        this.m.a();
        if (i == 2) {
            s();
        }
    }

    public void a(Bundle bundle) {
        while (!this.c.isEmpty()) {
            b((com.google.android.gms.internal.ahl.a) this.c.remove());
        }
        this.m.a(bundle);
    }

    public void a(@NonNull FragmentActivity fragmentActivity) {
        a(new aih(fragmentActivity));
    }

    public void a(ConnectionResult connectionResult) {
        if (!this.v.b(this.p, connectionResult.c())) {
            o();
        }
        if (!m()) {
            this.m.a(connectionResult);
            this.m.a();
        }
    }

    public void a(@NonNull com.google.android.gms.common.api.g.b bVar) {
        this.m.a(bVar);
    }

    public void a(@NonNull c cVar) {
        this.m.a(cVar);
    }

    public void a(aiw com_google_android_gms_internal_aiw) {
        this.l.lock();
        try {
            if (this.j == null) {
                this.j = new HashSet();
            }
            this.j.add(com_google_android_gms_internal_aiw);
        } finally {
            this.l.unlock();
        }
    }

    public boolean a(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        return this.e.containsKey(aVar.d());
    }

    public boolean a(ait com_google_android_gms_internal_ait) {
        return this.n != null && this.n.a(com_google_android_gms_internal_ait);
    }

    public Context b() {
        return this.p;
    }

    <C extends f> C b(d<?> dVar) {
        f fVar = (f) this.e.get(dVar);
        com.google.android.gms.common.internal.d.a(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    public <A extends com.google.android.gms.common.api.a.c, T extends com.google.android.gms.internal.ahl.a<? extends m, A>> T b(@NonNull T t) {
        com.google.android.gms.common.internal.d.b(t.g() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.e.containsKey(t.g());
        String f = t.h() != null ? t.h().f() : "the API";
        com.google.android.gms.common.internal.d.b(containsKey, new StringBuilder(String.valueOf(f).length() + 65).append("GoogleApiClient is not configured to use ").append(f).append(" required for this call.").toString());
        this.l.lock();
        try {
            if (this.n == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (m()) {
                this.c.add(t);
                while (!this.c.isEmpty()) {
                    ahn com_google_android_gms_internal_ahn = (com.google.android.gms.internal.ahl.a) this.c.remove();
                    this.k.a(com_google_android_gms_internal_ahn);
                    com_google_android_gms_internal_ahn.c(Status.c);
                }
            } else {
                t = this.n.b(t);
                this.l.unlock();
            }
            return t;
        } finally {
            this.l.unlock();
        }
    }

    public void b(aiw com_google_android_gms_internal_aiw) {
        this.l.lock();
        try {
            if (this.j == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.j.remove(com_google_android_gms_internal_aiw)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!p()) {
                this.n.f();
            }
            this.l.unlock();
        } catch (Throwable th) {
            this.l.unlock();
        }
    }

    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.p);
        printWriter.append(str).append("mResuming=").print(this.r);
        printWriter.append(" mWorkQueue.size()=").print(this.c.size());
        this.k.a(printWriter);
        if (this.n != null) {
            this.n.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public boolean b(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        f fVar = (f) this.e.get(aVar.d());
        return fVar != null && fVar.t();
    }

    public boolean b(@NonNull com.google.android.gms.common.api.g.b bVar) {
        return this.m.b(bVar);
    }

    public boolean b(@NonNull c cVar) {
        return this.m.b(cVar);
    }

    public Looper c() {
        return this.q;
    }

    @NonNull
    public ConnectionResult c(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        this.l.lock();
        try {
            if (!j() && !m()) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            } else if (this.e.containsKey(aVar.d())) {
                ConnectionResult a = this.n.a((com.google.android.gms.common.api.a) aVar);
                if (a != null) {
                    this.l.unlock();
                } else if (m()) {
                    a = ConnectionResult.v;
                } else {
                    Log.w("GoogleApiClientImpl", q());
                    Log.wtf("GoogleApiClientImpl", String.valueOf(aVar.f()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                    a = new ConnectionResult(8, null);
                    this.l.unlock();
                }
                return a;
            } else {
                throw new IllegalArgumentException(String.valueOf(aVar.f()).concat(" was never registered with GoogleApiClient"));
            }
        } finally {
            this.l.unlock();
        }
    }

    public void c(@NonNull com.google.android.gms.common.api.g.b bVar) {
        this.m.c(bVar);
    }

    public void c(@NonNull c cVar) {
        this.m.c(cVar);
    }

    public void d() {
        if (this.n != null) {
            this.n.g();
        }
    }

    public void e() {
        boolean z = false;
        this.l.lock();
        try {
            if (this.o >= 0) {
                if (this.y != null) {
                    z = true;
                }
                com.google.android.gms.common.internal.d.a(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.y == null) {
                this.y = Integer.valueOf(a(this.e.values(), false));
            } else if (this.y.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            a(this.y.intValue());
        } finally {
            this.l.unlock();
        }
    }

    public ConnectionResult f() {
        boolean z = true;
        com.google.android.gms.common.internal.d.a(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.l.lock();
        try {
            if (this.o >= 0) {
                if (this.y == null) {
                    z = false;
                }
                com.google.android.gms.common.internal.d.a(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.y == null) {
                this.y = Integer.valueOf(a(this.e.values(), false));
            } else if (this.y.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            c(this.y.intValue());
            this.m.b();
            ConnectionResult b = this.n.b();
            return b;
        } finally {
            this.l.unlock();
        }
    }

    public void g() {
        this.l.lock();
        try {
            this.k.a();
            if (this.n != null) {
                this.n.c();
            }
            this.w.a();
            for (com.google.android.gms.internal.ahl.a aVar : this.c) {
                aVar.a(null);
                aVar.a();
            }
            this.c.clear();
            if (this.n != null) {
                o();
                this.m.a();
                this.l.unlock();
            }
        } finally {
            this.l.unlock();
        }
    }

    public void h() {
        g();
        e();
    }

    public i<Status> i() {
        com.google.android.gms.common.internal.d.a(j(), "GoogleApiClient is not connected yet.");
        com.google.android.gms.common.internal.d.a(this.y.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        final i com_google_android_gms_internal_aiu = new aiu(this);
        if (this.e.containsKey(ajd.a)) {
            a(this, com_google_android_gms_internal_aiu, false);
        } else {
            final AtomicReference atomicReference = new AtomicReference();
            g c = new com.google.android.gms.common.api.g.a(this.p).a(ajd.b).a(new com.google.android.gms.common.api.g.b(this) {
                final /* synthetic */ ahy e;

                public void a(int i) {
                }

                public void a(Bundle bundle) {
                    this.e.a((g) atomicReference.get(), com_google_android_gms_internal_aiu, true);
                }
            }).a(new c(this) {
                final /* synthetic */ ahy b;

                public void a(@NonNull ConnectionResult connectionResult) {
                    com_google_android_gms_internal_aiu.b(new Status(8));
                }
            }).a(this.u).c();
            atomicReference.set(c);
            c.e();
        }
        return com_google_android_gms_internal_aiu;
    }

    public boolean j() {
        return this.n != null && this.n.d();
    }

    public boolean k() {
        return this.n != null && this.n.e();
    }

    boolean m() {
        return this.r;
    }

    void n() {
        if (!m()) {
            this.r = true;
            if (this.d == null) {
                this.d = this.v.a(this.p.getApplicationContext(), new b(this));
            }
            this.u.sendMessageDelayed(this.u.obtainMessage(1), this.s);
            this.u.sendMessageDelayed(this.u.obtainMessage(2), this.t);
        }
    }

    boolean o() {
        if (!m()) {
            return false;
        }
        this.r = false;
        this.u.removeMessages(2);
        this.u.removeMessages(1);
        if (this.d != null) {
            this.d.a();
            this.d = null;
        }
        return true;
    }

    boolean p() {
        boolean z = false;
        this.l.lock();
        try {
            if (this.j != null) {
                if (!this.j.isEmpty()) {
                    z = true;
                }
                this.l.unlock();
            }
            return z;
        } finally {
            this.l.unlock();
        }
    }

    String q() {
        Writer stringWriter = new StringWriter();
        b("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public int r() {
        return System.identityHashCode(this);
    }
}
