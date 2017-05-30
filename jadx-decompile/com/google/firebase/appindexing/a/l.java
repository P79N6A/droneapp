package com.google.firebase.appindexing.a;

import android.support.annotation.NonNull;
import com.google.android.gms.common.f;

public final class l extends e<l> {
    l() {
        super("Person");
    }

    public l a(@NonNull String str) {
        return (l) put(f.b, str);
    }

    public l a(@NonNull boolean z) {
        return (l) put("isSelf", z);
    }

    public l b(@NonNull String str) {
        return (l) put("telephone", str);
    }
}
