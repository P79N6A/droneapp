package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

public class u extends a {
    private String a;
    private String b;

    u(@NonNull String str, @NonNull String str2) {
        this.a = d.a(str);
        this.b = d.a(str2);
    }

    public static VerifyAssertionRequest a(@NonNull u uVar) {
        d.a(uVar);
        return new VerifyAssertionRequest(null, uVar.b(), uVar.a(), null, uVar.c());
    }

    public String a() {
        return v.a;
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
