package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.a;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import com.google.firebase.auth.e;
import com.google.firebase.auth.p;
import com.google.firebase.auth.r;
import com.google.firebase.auth.u;

public class gk {
    @NonNull
    public static VerifyAssertionRequest a(@NonNull a aVar) {
        d.a(aVar);
        if (r.class.isAssignableFrom(aVar.getClass())) {
            return r.a((r) aVar);
        }
        if (e.class.isAssignableFrom(aVar.getClass())) {
            return e.a((e) aVar);
        }
        if (u.class.isAssignableFrom(aVar.getClass())) {
            return u.a((u) aVar);
        }
        if (p.class.isAssignableFrom(aVar.getClass())) {
            return p.a((p) aVar);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
