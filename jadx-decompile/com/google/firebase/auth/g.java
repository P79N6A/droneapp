package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.c;

public class g extends c {
    private final String a;

    public g(@NonNull String str, @NonNull String str2) {
        super(str2);
        this.a = d.a(str);
    }

    @NonNull
    public String a() {
        return this.a;
    }
}
