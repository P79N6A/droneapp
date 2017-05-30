package com.google.android.gms.games.internal.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.games.appcontent.i;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.internal.d;

public final class b implements i {

    private static abstract class a extends c$a<com.google.android.gms.games.appcontent.i.a> {
        public com.google.android.gms.games.appcontent.i.a a(final Status status) {
            return new com.google.android.gms.games.appcontent.i.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public void b() {
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass1 extends a {
        protected void a(d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, 0, null, null, false);
        }
    }
}
