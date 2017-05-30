package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;

abstract class ajh<R extends m> extends com.google.android.gms.internal.ahl.a<R, aji> {

    static abstract class a extends ajh<Status> {
        public a(g gVar) {
            super(gVar);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public ajh(g gVar) {
        super(ajd.b, gVar);
    }
}
