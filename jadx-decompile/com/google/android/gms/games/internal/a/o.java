package com.google.android.gms.games.internal.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.internal.d;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.c;
import com.google.android.gms.internal.ahl.b;

public final class o implements c {

    private static abstract class a extends c$a<com.google.android.gms.games.stats.c.a> {
        private a(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.stats.c.a a(final Status status) {
            return new com.google.android.gms.games.stats.c.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public PlayerStats c() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public i<com.google.android.gms.games.stats.c.a> a(g gVar, final boolean z) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ o b;

            protected void a(d dVar) {
                dVar.e((b) this, z);
            }
        });
    }
}
