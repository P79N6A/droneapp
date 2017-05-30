package com.google.android.gms.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import java.util.Set;

public interface h {

    public interface a extends m {
        l b();
    }

    i<Status> a(g gVar, com.google.android.gms.drive.events.a aVar);

    i<Status> a(g gVar, Set<DriveId> set);

    DriveId a();

    i<a> b(g gVar);

    i<Status> b(g gVar, com.google.android.gms.drive.events.a aVar);

    i<a> b(g gVar, n nVar);

    i<c$c> c(g gVar);

    i<Status> d(g gVar);

    i<Status> e(g gVar);

    i<Status> f(g gVar);

    i<Status> g(g gVar);

    i<Status> h(g gVar);
}
