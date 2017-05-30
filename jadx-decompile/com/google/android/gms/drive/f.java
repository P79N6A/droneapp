package com.google.android.gms.drive;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.drive.query.Query;

public interface f extends h {
    public static final String b_ = "application/vnd.google-apps.folder";

    public interface a extends m {
        e b();
    }

    public interface b extends m {
        f b();
    }

    i<c$c> a(g gVar);

    i<b> a(g gVar, n nVar);

    i<a> a(g gVar, n nVar, d dVar);

    i<a> a(g gVar, n nVar, d dVar, j jVar);

    i<c$c> a(g gVar, Query query);
}
