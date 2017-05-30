package com.google.android.gms.common.api;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.internal.d;

public abstract class l<R extends m> extends o<R> {
    private final Activity a;
    private final int b;

    protected l(@NonNull Activity activity, int i) {
        this.a = (Activity) d.a((Object) activity, (Object) "Activity must not be null");
        this.b = i;
    }

    public final void a(@NonNull Status status) {
        if (status.e()) {
            try {
                status.a(this.a, this.b);
                return;
            } catch (Throwable e) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", e);
                b(new Status(8));
                return;
            }
        }
        b(status);
    }

    public abstract void b(@NonNull Status status);

    public abstract void b(@NonNull R r);
}
