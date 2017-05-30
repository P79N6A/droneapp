package com.google.android.gms.auth.api.credentials.internal;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.a;
import com.google.android.gms.common.api.Status;

public final class d implements a {
    private final Status a;
    private final Credential b;

    public d(Status status, Credential credential) {
        this.a = status;
        this.b = credential;
    }

    public static d a(Status status) {
        return new d(status, null);
    }

    public Status a() {
        return this.a;
    }

    public Credential b() {
        return this.b;
    }
}
