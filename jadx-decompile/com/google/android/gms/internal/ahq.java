package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

final class ahq implements aig {
    private final Context a;
    private final ahy b;
    private final Looper c;
    private final aia d;
    private final aia e;
    private final Map<d<?>, aia> f;
    private final Set<ait> g = Collections.newSetFromMap(new WeakHashMap());
    private final f h;
    private Bundle i;
    private ConnectionResult j = null;
    private ConnectionResult k = null;
    private boolean l = false;
    private final Lock m;
    private int n = 0;

    private class a implements com.google.android.gms.internal.aig.a {
        final /* synthetic */ ahq a;

        private a(ahq com_google_android_gms_internal_ahq) {
            this.a = com_google_android_gms_internal_ahq;
        }

        public void a(int i, boolean z) {
            this.a.m.lock();
            try {
                if (this.a.l || this.a.k == null || !this.a.k.b()) {
                    this.a.l = false;
                    this.a.a(i, z);
                    return;
                }
                this.a.l = true;
                this.a.e.a(i);
                this.a.m.unlock();
            } finally {
                this.a.m.unlock();
            }
        }

        public void a(@Nullable Bundle bundle) {
            this.a.m.lock();
            try {
                this.a.a(bundle);
                this.a.j = ConnectionResult.v;
                this.a.j();
            } finally {
                this.a.m.unlock();
            }
        }

        public void a(@NonNull ConnectionResult connectionResult) {
            this.a.m.lock();
            try {
                this.a.j = connectionResult;
                this.a.j();
            } finally {
                this.a.m.unlock();
            }
        }
    }

    private class b implements com.google.android.gms.internal.aig.a {
        final /* synthetic */ ahq a;

        private b(ahq com_google_android_gms_internal_ahq) {
            this.a = com_google_android_gms_internal_ahq;
        }

        public void a(int i, boolean z) {
            this.a.m.lock();
            try {
                if (this.a.l) {
                    this.a.l = false;
                    this.a.a(i, z);
                    return;
                }
                this.a.l = true;
                this.a.d.a(i);
                this.a.m.unlock();
            } finally {
                this.a.m.unlock();
            }
        }

        public void a(@Nullable Bundle bundle) {
            this.a.m.lock();
            try {
                this.a.k = ConnectionResult.v;
                this.a.j();
            } finally {
                this.a.m.unlock();
            }
        }

        public void a(@NonNull ConnectionResult connectionResult) {
            this.a.m.lock();
            try {
                this.a.k = connectionResult;
                this.a.j();
            } finally {
                this.a.m.unlock();
            }
        }
    }

    private ahq(Context context, ahy com_google_android_gms_internal_ahy, Lock lock, Looper looper, j jVar, Map<d<?>, f> map, Map<d<?>, f> map2, s sVar, com.google.android.gms.common.api.a.b<? extends aok, aom> bVar, f fVar, ArrayList<aho> arrayList, ArrayList<aho> arrayList2, Map<com.google.android.gms.common.api.a<?>, Integer> map3, Map<com.google.android.gms.common.api.a<?>, Integer> map4) {
        this.a = context;
        this.b = com_google_android_gms_internal_ahy;
        this.m = lock;
        this.c = looper;
        this.h = fVar;
        this.d = new aia(context, this.b, lock, looper, jVar, map2, null, map4, null, arrayList2, new a());
        this.e = new aia(context, this.b, lock, looper, jVar, map, sVar, map3, bVar, arrayList, new b());
        Map arrayMap = new ArrayMap();
        for (d put : map2.keySet()) {
            arrayMap.put(put, this.d);
        }
        for (d put2 : map.keySet()) {
            arrayMap.put(put2, this.e);
        }
        this.f = Collections.unmodifiableMap(arrayMap);
    }

    public static ahq a(Context context, ahy com_google_android_gms_internal_ahy, Lock lock, Looper looper, j jVar, Map<d<?>, f> map, s sVar, Map<com.google.android.gms.common.api.a<?>, Integer> map2, com.google.android.gms.common.api.a.b<? extends aok, aom> bVar, ArrayList<aho> arrayList) {
        f fVar = null;
        Map arrayMap = new ArrayMap();
        Map arrayMap2 = new ArrayMap();
        for (Entry entry : map.entrySet()) {
            f fVar2 = (f) entry.getValue();
            if (fVar2.h_()) {
                fVar = fVar2;
            }
            if (fVar2.v()) {
                arrayMap.put((d) entry.getKey(), fVar2);
            } else {
                arrayMap2.put((d) entry.getKey(), fVar2);
            }
        }
        com.google.android.gms.common.internal.d.a(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        Map arrayMap3 = new ArrayMap();
        Map arrayMap4 = new ArrayMap();
        for (com.google.android.gms.common.api.a aVar : map2.keySet()) {
            d d = aVar.d();
            if (arrayMap.containsKey(d)) {
                arrayMap3.put(aVar, (Integer) map2.get(aVar));
            } else if (arrayMap2.containsKey(d)) {
                arrayMap4.put(aVar, (Integer) map2.get(aVar));
            } else {
                throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aho com_google_android_gms_internal_aho = (aho) it.next();
            if (arrayMap3.containsKey(com_google_android_gms_internal_aho.a)) {
                arrayList2.add(com_google_android_gms_internal_aho);
            } else if (arrayMap4.containsKey(com_google_android_gms_internal_aho.a)) {
                arrayList3.add(com_google_android_gms_internal_aho);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
            }
        }
        return new ahq(context, com_google_android_gms_internal_ahy, lock, looper, jVar, arrayMap, arrayMap2, sVar, bVar, fVar, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    private void a(int i, boolean z) {
        this.b.a(i, z);
        this.k = null;
        this.j = null;
    }

    private void a(Bundle bundle) {
        if (this.i == null) {
            this.i = bundle;
        } else if (bundle != null) {
            this.i.putAll(bundle);
        }
    }

    private void a(ConnectionResult connectionResult) {
        switch (this.n) {
            case 1:
                break;
            case 2:
                this.b.a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        l();
        this.n = 0;
    }

    private static boolean b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.b();
    }

    private boolean c(com.google.android.gms.internal.ahl.a<? extends m, ? extends c> aVar) {
        d g = aVar.g();
        com.google.android.gms.common.internal.d.b(this.f.containsKey(g), "GoogleApiClient is not configured to use the API required for this call.");
        return ((aia) this.f.get(g)).equals(this.e);
    }

    private void i() {
        this.k = null;
        this.j = null;
        this.d.a();
        this.e.a();
    }

    private void j() {
        if (b(this.j)) {
            if (b(this.k) || m()) {
                k();
            } else if (this.k == null) {
            } else {
                if (this.n == 1) {
                    l();
                    return;
                }
                a(this.k);
                this.d.c();
            }
        } else if (this.j != null && b(this.k)) {
            this.e.c();
            a(this.j);
        } else if (this.j != null && this.k != null) {
            ConnectionResult connectionResult = this.j;
            if (this.e.h < this.d.h) {
                connectionResult = this.k;
            }
            a(connectionResult);
        }
    }

    private void k() {
        switch (this.n) {
            case 1:
                break;
            case 2:
                this.b.a(this.i);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                break;
        }
        l();
        this.n = 0;
    }

    private void l() {
        for (ait b : this.g) {
            b.b();
        }
        this.g.clear();
    }

    private boolean m() {
        return this.k != null && this.k.c() == 4;
    }

    @Nullable
    private PendingIntent n() {
        return this.h == null ? null : PendingIntent.getActivity(this.a, this.b.r(), this.h.e(), 134217728);
    }

    public ConnectionResult a(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Nullable
    public ConnectionResult a(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        return ((aia) this.f.get(aVar.d())).equals(this.e) ? m() ? new ConnectionResult(4, n()) : this.e.a((com.google.android.gms.common.api.a) aVar) : this.d.a((com.google.android.gms.common.api.a) aVar);
    }

    public <A extends c, R extends m, T extends com.google.android.gms.internal.ahl.a<R, A>> T a(@NonNull T t) {
        if (!c((com.google.android.gms.internal.ahl.a) t)) {
            return this.d.a((com.google.android.gms.internal.ahl.a) t);
        }
        if (!m()) {
            return this.e.a((com.google.android.gms.internal.ahl.a) t);
        }
        t.c(new Status(4, null, n()));
        return t;
    }

    public void a() {
        this.n = 2;
        this.l = false;
        i();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.e.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.d.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public boolean a(ait com_google_android_gms_internal_ait) {
        this.m.lock();
        try {
            if ((e() || d()) && !h()) {
                this.g.add(com_google_android_gms_internal_ait);
                if (this.n == 0) {
                    this.n = 1;
                }
                this.k = null;
                this.e.a();
                return true;
            }
            this.m.unlock();
            return false;
        } finally {
            this.m.unlock();
        }
    }

    public ConnectionResult b() {
        throw new UnsupportedOperationException();
    }

    public <A extends c, T extends com.google.android.gms.internal.ahl.a<? extends m, A>> T b(@NonNull T t) {
        if (!c((com.google.android.gms.internal.ahl.a) t)) {
            return this.d.b((com.google.android.gms.internal.ahl.a) t);
        }
        if (!m()) {
            return this.e.b((com.google.android.gms.internal.ahl.a) t);
        }
        t.c(new Status(4, null, n()));
        return t;
    }

    public void c() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.c();
        this.e.c();
        l();
    }

    public boolean d() {
        boolean z = true;
        this.m.lock();
        try {
            if (!(this.d.d() && (h() || m() || this.n == 1))) {
                z = false;
            }
            this.m.unlock();
            return z;
        } catch (Throwable th) {
            this.m.unlock();
        }
    }

    public boolean e() {
        this.m.lock();
        try {
            boolean z = this.n == 2;
            this.m.unlock();
            return z;
        } catch (Throwable th) {
            this.m.unlock();
        }
    }

    public void f() {
        this.d.f();
        this.e.f();
    }

    public void g() {
        this.m.lock();
        try {
            boolean e = e();
            this.e.c();
            this.k = new ConnectionResult(4);
            if (e) {
                new Handler(this.c).post(new Runnable(this) {
                    final /* synthetic */ ahq a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.m.lock();
                        try {
                            this.a.j();
                        } finally {
                            this.a.m.unlock();
                        }
                    }
                });
            } else {
                l();
            }
            this.m.unlock();
        } catch (Throwable th) {
            this.m.unlock();
        }
    }

    public boolean h() {
        return this.e.d();
    }
}
