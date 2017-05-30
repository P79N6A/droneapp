package com.google.android.gms.g;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

public abstract class f<TResult> {
    @NonNull
    public f<TResult> a(@NonNull Activity activity, @NonNull b<TResult> bVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public abstract f<TResult> a(@NonNull Activity activity, @NonNull c cVar);

    @NonNull
    public abstract f<TResult> a(@NonNull Activity activity, @NonNull d<? super TResult> dVar);

    @NonNull
    public <TContinuationResult> f<TContinuationResult> a(@NonNull a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    public f<TResult> a(@NonNull b<TResult> bVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public abstract f<TResult> a(@NonNull c cVar);

    @NonNull
    public abstract f<TResult> a(@NonNull d<? super TResult> dVar);

    @NonNull
    public <TContinuationResult> f<TContinuationResult> a(@NonNull Executor executor, @NonNull a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    public f<TResult> a(@NonNull Executor executor, @NonNull b<TResult> bVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public abstract f<TResult> a(@NonNull Executor executor, @NonNull c cVar);

    @NonNull
    public abstract f<TResult> a(@NonNull Executor executor, @NonNull d<? super TResult> dVar);

    public abstract <X extends Throwable> TResult a(@NonNull Class<X> cls);

    public abstract boolean a();

    @NonNull
    public <TContinuationResult> f<TContinuationResult> b(@NonNull a<TResult, f<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @NonNull
    public <TContinuationResult> f<TContinuationResult> b(@NonNull Executor executor, @NonNull a<TResult, f<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract boolean b();

    public abstract TResult c();

    @Nullable
    public abstract Exception d();
}
