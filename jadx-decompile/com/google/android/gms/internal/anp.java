package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.b;
import com.google.android.gms.plus.c;
import com.google.android.gms.plus.c$b;
import com.google.android.gms.plus.internal.e;

public final class anp implements com.google.android.gms.plus.a {

    private static abstract class a extends c$b<Status> {
        private a(g gVar) {
            super(gVar);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    @SuppressLint({"MissingRemoteException"})
    public i<Status> a(g gVar) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ anp a;

            protected void a(e eVar) {
                eVar.b((b) this);
            }
        });
    }

    public void b(g gVar) {
        e a = c.a(gVar, false);
        if (a != null) {
            a.j();
        }
    }

    public String c(g gVar) {
        return c.a(gVar, true).h();
    }
}
