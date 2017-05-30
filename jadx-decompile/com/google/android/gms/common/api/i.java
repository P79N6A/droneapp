package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.TimeUnit;

public abstract class i<R extends m> {

    public interface a {
        void a(Status status);
    }

    @NonNull
    public abstract R a(long j, @NonNull TimeUnit timeUnit);

    @NonNull
    public <S extends m> q<S> a(@NonNull p<? super R, ? extends S> pVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void a();

    public void a(@NonNull a aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(@NonNull n<? super R> nVar);

    public abstract void a(@NonNull n<? super R> nVar, long j, @NonNull TimeUnit timeUnit);

    @NonNull
    public abstract R d();

    public abstract boolean e();

    @Nullable
    public Integer f() {
        throw new UnsupportedOperationException();
    }
}
