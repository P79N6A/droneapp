package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import com.google.android.gms.common.api.g;
import com.google.android.gms.internal.ait;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class zzb extends AsyncTaskLoader<Void> implements ait {
    private Semaphore a = new Semaphore(0);
    private Set<g> b;

    public zzb(Context context, Set<g> set) {
        super(context);
        this.b = set;
    }

    public Void a() {
        int i = 0;
        for (g a : this.b) {
            i = a.a((ait) this) ? i + 1 : i;
        }
        try {
            this.a.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (Throwable e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    public void b() {
        this.a.release();
    }

    public /* synthetic */ Object loadInBackground() {
        return a();
    }

    protected void onStartLoading() {
        this.a.drainPermits();
        forceLoad();
    }
}
