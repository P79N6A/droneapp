package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import java.util.concurrent.TimeUnit;

public abstract class su<T1 extends m, T2 extends m> extends i<T1> {
    private i<T2> a = null;

    protected su(i<T2> iVar) {
        this.a = iVar;
    }

    @NonNull
    public T1 a(long j, @NonNull TimeUnit timeUnit) {
        return a(this.a.a(j, timeUnit));
    }

    protected abstract T1 a(T2 t2);

    public void a() {
        this.a.a();
    }

    public void a(@NonNull final n<? super T1> nVar) {
        this.a.a(new n<T2>(this) {
            final /* synthetic */ su b;

            public void a(@NonNull T2 t2) {
                nVar.a(this.b.a((m) t2));
            }
        });
    }

    public void a(@NonNull final n<? super T1> nVar, long j, @NonNull TimeUnit timeUnit) {
        this.a.a(new n<T2>(this) {
            final /* synthetic */ su b;

            public void a(@NonNull T2 t2) {
                nVar.a(this.b.a((m) t2));
            }
        }, j, timeUnit);
    }

    @NonNull
    public T1 d() {
        return a(this.a.d());
    }

    public boolean e() {
        return this.a.e();
    }
}
