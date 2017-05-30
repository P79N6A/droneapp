package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.drive.b;

public abstract class bs<R extends m> extends com.google.android.gms.internal.ahl.a<R, bt> {

    public static abstract class a extends bs<Status> {
        public a(g gVar) {
            super(gVar);
        }

        protected Status a(Status status) {
            return status;
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public bs(g gVar) {
        super(b.a, gVar);
    }
}
