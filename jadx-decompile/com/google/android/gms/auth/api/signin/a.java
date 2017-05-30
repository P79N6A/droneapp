package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;

public interface a {
    public static final String a = "signInAccount";

    Intent a(g gVar);

    b a(Intent intent);

    h<b> b(g gVar);

    i<Status> c(g gVar);

    i<Status> d(g gVar);
}
