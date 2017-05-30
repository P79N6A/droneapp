package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

public class e extends a {
    private final String a;

    e(@NonNull String str) {
        this.a = d.a(str);
    }

    public static VerifyAssertionRequest a(@NonNull e eVar) {
        d.a(eVar);
        return new VerifyAssertionRequest(null, eVar.b(), eVar.a(), null, null);
    }

    public String a() {
        return f.a;
    }

    public String b() {
        return this.a;
    }
}
