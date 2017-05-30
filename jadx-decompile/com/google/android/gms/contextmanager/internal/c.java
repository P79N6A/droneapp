package com.google.android.gms.contextmanager.internal;

import com.google.android.gms.awareness.fence.d;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;

public class c {

    public static abstract class c extends com.google.android.gms.internal.ahl.a<Status, d> {
        public c(g gVar) {
            super(com.google.android.gms.contextmanager.c.d, gVar);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public static abstract class a extends com.google.android.gms.internal.ahl.a<com.google.android.gms.awareness.fence.c, d> {
        public a(g gVar) {
            super(com.google.android.gms.contextmanager.c.d, gVar);
        }

        public com.google.android.gms.awareness.fence.c a(final Status status) {
            return new com.google.android.gms.awareness.fence.c(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public d b() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public static abstract class b extends com.google.android.gms.internal.ahl.a<com.google.android.gms.awareness.snapshot.internal.m, d> {
        public b(g gVar) {
            super(com.google.android.gms.contextmanager.c.d, gVar);
        }

        public com.google.android.gms.awareness.snapshot.internal.m a(final Status status) {
            return new com.google.android.gms.awareness.snapshot.internal.m(this) {
                final /* synthetic */ b b;

                public Status a() {
                    return status;
                }

                public Snapshot b() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }
}
