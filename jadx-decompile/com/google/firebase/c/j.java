package com.google.firebase.c;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.g.c;
import com.google.android.gms.g.d;
import com.google.android.gms.g.e;
import com.google.android.gms.g.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

public abstract class j<TResult extends a> extends b<TResult> {
    private static final HashMap<Integer, HashSet<Integer>> b = new HashMap();
    private static final HashMap<Integer, HashSet<Integer>> c = new HashMap();
    protected final Object a = new Object();
    private final q<d<? super TResult>, TResult> d = new q(this, 128, new com.google.firebase.c.q.a<d<? super TResult>, TResult>(this) {
        final /* synthetic */ j a;

        {
            this.a = r1;
        }

        public void a(@NonNull d<? super TResult> dVar, @NonNull TResult tResult) {
            o.a().b(this.a);
            dVar.a(tResult);
        }

        public /* synthetic */ void a(@NonNull Object obj, @NonNull Object obj2) {
            a((d) obj, (a) obj2);
        }
    });
    private final q<c, TResult> e = new q(this, 320, new com.google.firebase.c.q.a<c, TResult>(this) {
        final /* synthetic */ j a;

        {
            this.a = r1;
        }

        public void a(@NonNull c cVar, @NonNull TResult tResult) {
            o.a().b(this.a);
            cVar.a(tResult.c());
        }

        public /* synthetic */ void a(@NonNull Object obj, @NonNull Object obj2) {
            a((c) obj, (a) obj2);
        }
    });
    private final q<f<? super TResult>, TResult> f = new q(this, -465, new com.google.firebase.c.q.a<f<? super TResult>, TResult>(this) {
        final /* synthetic */ j a;

        {
            this.a = r1;
        }

        public void a(@NonNull f<? super TResult> fVar, @NonNull TResult tResult) {
            fVar.a(tResult);
        }

        public /* synthetic */ void a(@NonNull Object obj, @NonNull Object obj2) {
            a((f) obj, (a) obj2);
        }
    });
    private final q<e<? super TResult>, TResult> g = new q(this, 16, new com.google.firebase.c.q.a<e<? super TResult>, TResult>(this) {
        final /* synthetic */ j a;

        {
            this.a = r1;
        }

        public void a(@NonNull e<? super TResult> eVar, @NonNull TResult tResult) {
            eVar.a(tResult);
        }

        public /* synthetic */ void a(@NonNull Object obj, @NonNull Object obj2) {
            a((e) obj, (a) obj2);
        }
    });
    private int h = 1;
    private TResult i;

    protected interface a {
        Exception c();
    }

    class b implements a {
        private final Exception a;
        final /* synthetic */ j b;

        public b(j jVar, Exception exception) {
            this.b = jVar;
            this.a = exception;
        }

        @Nullable
        public Exception c() {
            return this.a;
        }

        @NonNull
        public i d() {
            return e().l();
        }

        @NonNull
        public j<TResult> e() {
            return this.b;
        }
    }

    static {
        b.put(Integer.valueOf(1), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(16), Integer.valueOf(256)})));
        b.put(Integer.valueOf(2), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(8), Integer.valueOf(32)})));
        b.put(Integer.valueOf(4), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(8), Integer.valueOf(32)})));
        b.put(Integer.valueOf(16), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(2), Integer.valueOf(256)})));
        b.put(Integer.valueOf(64), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(2), Integer.valueOf(256)})));
        c.put(Integer.valueOf(1), new HashSet(Collections.singletonList(Integer.valueOf(2))));
        c.put(Integer.valueOf(2), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(4), Integer.valueOf(64), Integer.valueOf(128)})));
        c.put(Integer.valueOf(4), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(4), Integer.valueOf(64), Integer.valueOf(128)})));
        c.put(Integer.valueOf(8), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(16), Integer.valueOf(64), Integer.valueOf(128)})));
        c.put(Integer.valueOf(32), new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(256), Integer.valueOf(64), Integer.valueOf(128)})));
    }

    protected j() {
    }

    private String a(int i) {
        switch (i) {
            case 1:
                return "INTERNAL_STATE_NOT_STARTED";
            case 2:
                return "INTERNAL_STATE_QUEUED";
            case 4:
                return "INTERNAL_STATE_IN_PROGRESS";
            case 8:
                return "INTERNAL_STATE_PAUSING";
            case 16:
                return "INTERNAL_STATE_PAUSED";
            case 32:
                return "INTERNAL_STATE_CANCELING";
            case 64:
                return "INTERNAL_STATE_FAILURE";
            case 128:
                return "INTERNAL_STATE_SUCCESS";
            case 256:
                return "INTERNAL_STATE_CANCELED";
            default:
                return "Unknown Internal State!";
        }
    }

    private TResult k() {
        if (this.i != null) {
            return this.i;
        }
        if (!a()) {
            return null;
        }
        if (this.i == null) {
            this.i = x();
        }
        return this.i;
    }

    protected void A() {
    }

    protected void B() {
    }

    protected void C() {
    }

    Runnable D() {
        return new Runnable(this) {
            final /* synthetic */ j a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.o();
            }
        };
    }

    @NonNull
    public /* synthetic */ f a(@NonNull Activity activity, @NonNull c cVar) {
        return b(activity, cVar);
    }

    @NonNull
    public /* synthetic */ f a(@NonNull Activity activity, @NonNull d dVar) {
        return b(activity, dVar);
    }

    @NonNull
    public /* synthetic */ f a(@NonNull c cVar) {
        return b(cVar);
    }

    @NonNull
    public /* synthetic */ f a(@NonNull d dVar) {
        return b(dVar);
    }

    @NonNull
    public /* synthetic */ f a(@NonNull Executor executor, @NonNull c cVar) {
        return b(executor, cVar);
    }

    @NonNull
    public /* synthetic */ f a(@NonNull Executor executor, @NonNull d dVar) {
        return b(executor, dVar);
    }

    public /* synthetic */ a a(@NonNull Activity activity, @NonNull f fVar) {
        return b(activity, fVar);
    }

    public /* synthetic */ a a(@NonNull f fVar) {
        return b(fVar);
    }

    public /* synthetic */ a a(@NonNull Executor executor, @NonNull f fVar) {
        return b(executor, fVar);
    }

    public /* synthetic */ b a(@NonNull Activity activity, @NonNull e eVar) {
        return b(activity, eVar);
    }

    public /* synthetic */ b a(@NonNull e eVar) {
        return b(eVar);
    }

    public /* synthetic */ b a(@NonNull Executor executor, @NonNull e eVar) {
        return b(executor, eVar);
    }

    public /* synthetic */ Object a(@NonNull Class cls) {
        return b(cls);
    }

    public boolean a() {
        return ((v() & 128) == 0 && (v() & 320) == 0) ? false : true;
    }

    boolean a(int i, boolean z) {
        boolean z2;
        if (Log.isLoggable("StorageTask", 3)) {
            String valueOf = String.valueOf(a(i));
            String valueOf2 = String.valueOf(a(this.h));
            Log.d("StorageTask", new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(valueOf2).length()).append("changing internal state to: ").append(valueOf).append(" isUser: ").append(z).append(" from state:").append(valueOf2).toString());
        }
        synchronized (this.a) {
            HashSet hashSet = (HashSet) (z ? b : c).get(Integer.valueOf(v()));
            if (hashSet == null || !hashSet.contains(Integer.valueOf(i))) {
                valueOf2 = String.valueOf(a(i));
                String valueOf3 = String.valueOf(a(this.h));
                Log.w("StorageTask", new StringBuilder((String.valueOf(valueOf2).length() + 62) + String.valueOf(valueOf3).length()).append("unable to change internal state to: ").append(valueOf2).append(" isUser: ").append(z).append(" from state:").append(valueOf3).toString());
                z2 = false;
            } else {
                this.h = i;
                switch (this.h) {
                    case 2:
                        o.a().a(this);
                        y();
                        break;
                    case 4:
                        z();
                        break;
                    case 16:
                        A();
                        break;
                    case 64:
                        B();
                        break;
                    case 128:
                        C();
                        break;
                    case 256:
                        p();
                        break;
                }
                this.d.a();
                this.e.a();
                this.g.a();
                this.f.a();
                z2 = true;
            }
        }
        return z2;
    }

    public <X extends Throwable> TResult b(@NonNull Class<X> cls) {
        if (k() == null) {
            throw new IllegalStateException();
        } else if (cls.isInstance(k().c())) {
            throw ((Throwable) cls.cast(k().c()));
        } else {
            Throwable c = k().c();
            if (c == null) {
                return k();
            }
            throw new e(c);
        }
    }

    @NonNull
    public j<TResult> b(@NonNull Activity activity, @NonNull c cVar) {
        com.google.android.gms.common.internal.d.a(cVar);
        com.google.android.gms.common.internal.d.a(activity);
        this.e.a(activity, null, cVar);
        return this;
    }

    @NonNull
    public j<TResult> b(@NonNull Activity activity, @NonNull d<? super TResult> dVar) {
        com.google.android.gms.common.internal.d.a(activity);
        com.google.android.gms.common.internal.d.a(dVar);
        this.d.a(activity, null, dVar);
        return this;
    }

    public j<TResult> b(@NonNull Activity activity, @NonNull e<? super TResult> eVar) {
        com.google.android.gms.common.internal.d.a(eVar);
        com.google.android.gms.common.internal.d.a(activity);
        this.g.a(activity, null, eVar);
        return this;
    }

    public j<TResult> b(@NonNull Activity activity, @NonNull f<? super TResult> fVar) {
        com.google.android.gms.common.internal.d.a(fVar);
        com.google.android.gms.common.internal.d.a(activity);
        this.f.a(activity, null, fVar);
        return this;
    }

    @NonNull
    public j<TResult> b(@NonNull c cVar) {
        com.google.android.gms.common.internal.d.a(cVar);
        this.e.a(null, null, cVar);
        return this;
    }

    @NonNull
    public j<TResult> b(@NonNull d<? super TResult> dVar) {
        com.google.android.gms.common.internal.d.a(dVar);
        this.d.a(null, null, dVar);
        return this;
    }

    public j<TResult> b(@NonNull e<? super TResult> eVar) {
        com.google.android.gms.common.internal.d.a(eVar);
        this.g.a(null, null, eVar);
        return this;
    }

    public j<TResult> b(@NonNull f<? super TResult> fVar) {
        com.google.android.gms.common.internal.d.a(fVar);
        this.f.a(null, null, fVar);
        return this;
    }

    @NonNull
    public j<TResult> b(@NonNull Executor executor, @NonNull c cVar) {
        com.google.android.gms.common.internal.d.a(cVar);
        com.google.android.gms.common.internal.d.a(executor);
        this.e.a(null, executor, cVar);
        return this;
    }

    @NonNull
    public j<TResult> b(@NonNull Executor executor, @NonNull d<? super TResult> dVar) {
        com.google.android.gms.common.internal.d.a(executor);
        com.google.android.gms.common.internal.d.a(dVar);
        this.d.a(null, executor, dVar);
        return this;
    }

    public j<TResult> b(@NonNull Executor executor, @NonNull e<? super TResult> eVar) {
        com.google.android.gms.common.internal.d.a(eVar);
        com.google.android.gms.common.internal.d.a(executor);
        this.g.a(null, executor, eVar);
        return this;
    }

    public j<TResult> b(@NonNull Executor executor, @NonNull f<? super TResult> fVar) {
        com.google.android.gms.common.internal.d.a(fVar);
        com.google.android.gms.common.internal.d.a(executor);
        this.f.a(null, executor, fVar);
        return this;
    }

    public boolean b() {
        return (v() & 128) != 0;
    }

    public j<TResult> c(@NonNull c cVar) {
        com.google.android.gms.common.internal.d.a(cVar);
        this.e.a((Object) cVar);
        return this;
    }

    public j<TResult> c(@NonNull d<? super TResult> dVar) {
        com.google.android.gms.common.internal.d.a(dVar);
        this.d.a((Object) dVar);
        return this;
    }

    public j<TResult> c(@NonNull e<? super TResult> eVar) {
        com.google.android.gms.common.internal.d.a(eVar);
        this.g.a((Object) eVar);
        return this;
    }

    public j<TResult> c(@NonNull f<? super TResult> fVar) {
        com.google.android.gms.common.internal.d.a(fVar);
        this.f.a((Object) fVar);
        return this;
    }

    public /* synthetic */ Object c() {
        return t();
    }

    @Nullable
    public Exception d() {
        return k() == null ? null : k().c();
    }

    public boolean e() {
        return a(256, true) || a(32, true);
    }

    public boolean f() {
        return v() == 256;
    }

    public boolean g() {
        return (v() & -465) != 0;
    }

    public boolean h() {
        return a(16, true) || a(8, true);
    }

    public boolean i() {
        if (!a(2, true)) {
            return false;
        }
        s();
        m();
        return true;
    }

    public boolean j() {
        return (v() & 16) != 0;
    }

    abstract i l();

    abstract void m();

    abstract void o();

    protected void p() {
    }

    @NonNull
    abstract TResult q();

    boolean r() {
        if (!a(2, false)) {
            return false;
        }
        m();
        return true;
    }

    void s() {
    }

    public TResult t() {
        if (k() == null) {
            throw new IllegalStateException();
        }
        Throwable c = k().c();
        if (c == null) {
            return k();
        }
        throw new e(c);
    }

    public TResult u() {
        return x();
    }

    int v() {
        return this.h;
    }

    Object w() {
        return this.a;
    }

    @NonNull
    TResult x() {
        TResult q;
        synchronized (this.a) {
            q = q();
        }
        return q;
    }

    protected void y() {
    }

    protected void z() {
    }
}
