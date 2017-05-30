package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.util.Log;

public abstract class o<R extends m> implements n<R> {
    public abstract void a(@NonNull Status status);

    public final void a(@NonNull R r) {
        Status a = r.a();
        if (a.f()) {
            b(r);
            return;
        }
        a(a);
        if (r instanceof k) {
            try {
                ((k) r).b();
            } catch (Throwable e) {
                String valueOf = String.valueOf(r);
                Log.w("ResultCallbacks", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    public abstract void b(@NonNull R r);
}
