package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;

public class c extends a {
    private String a;
    private String b;

    c(@NonNull String str, @NonNull String str2) {
        this.a = d.a(str);
        this.b = d.a(str2);
    }

    @NonNull
    public String a() {
        return d.a;
    }

    @NonNull
    public String b() {
        return this.a;
    }

    @NonNull
    public String c() {
        return this.b;
    }
}
