package com.google.firebase;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;

public class c extends Exception {
    @Deprecated
    protected c() {
    }

    public c(@NonNull String str) {
        super(d.a(str, (Object) "Detail message must not be empty"));
    }

    public c(@NonNull String str, Throwable th) {
        super(d.a(str, (Object) "Detail message must not be empty"), th);
    }
}
