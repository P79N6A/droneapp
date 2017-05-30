package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.internal.ais;

public abstract class p<R extends m, S extends m> {
    @NonNull
    public Status a(@NonNull Status status) {
        return status;
    }

    @Nullable
    @WorkerThread
    public abstract i<S> a(@NonNull R r);

    @NonNull
    public final i<S> b(@NonNull Status status) {
        return new ais(status);
    }
}
