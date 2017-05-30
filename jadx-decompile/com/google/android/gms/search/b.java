package com.google.android.gms.search;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;

public interface b {

    public interface a extends m {
        GoogleNowAuthState b();
    }

    i<a> a(g gVar, String str);

    i<Status> b(g gVar, String str);
}
