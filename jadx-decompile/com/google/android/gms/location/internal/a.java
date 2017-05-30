package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.location.b;

public class a implements b {

    private static abstract class a extends com.google.android.gms.location.a.a<Status> {
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

    public i<Status> a(g gVar, long j, PendingIntent pendingIntent) {
        final long j2 = j;
        final PendingIntent pendingIntent2 = pendingIntent;
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ a c;

            protected void a(l lVar) {
                lVar.a(j2, pendingIntent2);
                b(Status.a);
            }
        });
    }

    public i<Status> a(g gVar, final PendingIntent pendingIntent) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ a b;

            protected void a(l lVar) {
                lVar.a(pendingIntent);
                b(Status.a);
            }
        });
    }
}
