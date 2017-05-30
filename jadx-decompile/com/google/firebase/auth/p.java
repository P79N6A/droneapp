package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

public class p extends a {
    private String a;

    p(@NonNull String str) {
        this.a = d.a(str);
    }

    public static VerifyAssertionRequest a(@NonNull p pVar) {
        d.a(pVar);
        return new VerifyAssertionRequest(null, pVar.b(), pVar.a(), null, null);
    }

    public String a() {
        return q.a;
    }

    public String b() {
        return this.a;
    }
}
