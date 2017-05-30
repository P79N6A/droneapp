package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public interface b {
    public static final int a = 1000;
    public static final int b = 1001;
    public static final int c = 2000;

    PendingIntent a(g gVar, HintRequest hintRequest);

    i<Status> a(g gVar);

    i<Status> a(g gVar, Credential credential);

    i<a> a(g gVar, CredentialRequest credentialRequest);

    i<Status> b(g gVar, Credential credential);
}
