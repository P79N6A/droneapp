package com.google.android.gms.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class aim {
    private final Set<ail<?>> a = Collections.newSetFromMap(new WeakHashMap());

    public <L> ail<L> a(@NonNull L l, Looper looper) {
        return a(l, looper, "NO_TYPE");
    }

    public <L> ail<L> a(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        d.a(l, "Listener must not be null");
        d.a(looper, "Looper must not be null");
        d.a(str, "Listener type must not be null");
        ail<L> com_google_android_gms_internal_ail = new ail(looper, l, str);
        this.a.add(com_google_android_gms_internal_ail);
        return com_google_android_gms_internal_ail;
    }

    public void a() {
        for (ail a : this.a) {
            a.a();
        }
        this.a.clear();
    }
}
