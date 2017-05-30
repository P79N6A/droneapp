package com.google.android.gms.auth.api.signin;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

public class b implements m {
    private Status a;
    private GoogleSignInAccount b;

    public b(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    @NonNull
    public Status a() {
        return this.a;
    }

    @Nullable
    public GoogleSignInAccount b() {
        return this.b;
    }

    public boolean c() {
        return this.a.f();
    }
}
