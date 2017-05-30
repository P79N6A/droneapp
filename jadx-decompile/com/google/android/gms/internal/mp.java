package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.firebase.b;
import com.google.firebase.e;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class mp {
    private static final AtomicReference<mp> a = new AtomicReference();

    mp(Context context) {
    }

    @Nullable
    public static mp a() {
        return (mp) a.get();
    }

    public static mp a(Context context) {
        a.compareAndSet(null, new mp(context));
        return (mp) a.get();
    }

    public e a(@NonNull String str) {
        return null;
    }

    public void a(@NonNull b bVar) {
    }

    public Set<String> b() {
        return Collections.emptySet();
    }
}
