package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;
import com.google.firebase.auth.t;
import java.util.List;

public class gp implements t {
    private List<String> a;

    public gp(@NonNull CreateAuthUriResponse createAuthUriResponse) {
        d.a(createAuthUriResponse);
        this.a = createAuthUriResponse.f();
    }

    @Nullable
    public List<String> a() {
        return this.a;
    }
}
