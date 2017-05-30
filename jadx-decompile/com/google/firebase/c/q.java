package com.google.firebase.c;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.na;
import com.google.android.gms.internal.nf;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

class q<TListenerType, TResult extends a> {
    private final Queue<TListenerType> a = new ConcurrentLinkedQueue();
    private final HashMap<TListenerType, nf> b = new HashMap();
    private j<TResult> c;
    private int d;
    private a<TListenerType, TResult> e;

    public interface a<TListenerType, TResult> {
        void a(@NonNull TListenerType tListenerType, @NonNull TResult tResult);
    }

    public q(@NonNull j<TResult> jVar, int i, @NonNull a<TListenerType, TResult> aVar) {
        this.c = jVar;
        this.d = i;
        this.e = aVar;
    }

    public void a() {
        if ((this.c.v() & this.d) != 0) {
            final a x = this.c.x();
            for (final Object next : this.a) {
                nf nfVar = (nf) this.b.get(next);
                if (nfVar != null) {
                    nfVar.a(new Runnable(this) {
                        final /* synthetic */ q c;

                        public void run() {
                            this.c.e.a(next, x);
                        }
                    });
                }
            }
        }
    }

    public void a(@Nullable Activity activity, @Nullable Executor executor, @NonNull final TListenerType tListenerType) {
        boolean z = true;
        d.a(tListenerType);
        synchronized (this.c.w()) {
            boolean z2 = (this.c.v() & this.d) != 0;
            this.a.add(tListenerType);
            this.b.put(tListenerType, new nf(executor));
            if (activity != null) {
                if (VERSION.SDK_INT >= 17) {
                    if (activity.isDestroyed()) {
                        z = false;
                    }
                    d.b(z, "Activity is already destroyed!");
                }
                na.a().a(activity, tListenerType, new Runnable(this) {
                    final /* synthetic */ q b;

                    public void run() {
                        this.b.a(tListenerType);
                    }
                });
            }
        }
        if (z2) {
            this.e.a(tListenerType, this.c.x());
        }
    }

    public void a(@NonNull TListenerType tListenerType) {
        d.a(tListenerType);
        synchronized (this.c.w()) {
            this.b.remove(tListenerType);
            this.a.remove(tListenerType);
            na.a().a(tListenerType);
        }
    }
}
