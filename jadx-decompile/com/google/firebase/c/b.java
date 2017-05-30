package com.google.firebase.c;

import android.app.Activity;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

public abstract class b<TState> extends a<TState> {
    public abstract b<TState> a(@NonNull Activity activity, @NonNull e<? super TState> eVar);

    public abstract b<TState> a(@NonNull e<? super TState> eVar);

    public abstract b<TState> a(@NonNull Executor executor, @NonNull e<? super TState> eVar);

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();
}
