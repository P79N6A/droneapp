package com.google.firebase.iid;

import android.support.annotation.Nullable;

public class b {
    private final FirebaseInstanceId a;

    private b(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    public static b a() {
        return new b(FirebaseInstanceId.a());
    }

    public String b() {
        return this.a.c();
    }

    @Nullable
    public String c() {
        return this.a.f();
    }
}
