package com.google.firebase.c;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.google.android.gms.g.f;
import java.util.concurrent.Executor;

public abstract class a<TState> extends f<TState> {
    public abstract a<TState> a(@NonNull Activity activity, @NonNull f<? super TState> fVar);

    public abstract a<TState> a(@NonNull f<? super TState> fVar);

    public abstract a<TState> a(@NonNull Executor executor, @NonNull f<? super TState> fVar);

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();
}
