package com.google.firebase.auth;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public final class m extends h {
    private final String a;

    public m(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        super(str, str2);
        this.a = str3;
    }

    @Nullable
    public String b() {
        return this.a;
    }
}
