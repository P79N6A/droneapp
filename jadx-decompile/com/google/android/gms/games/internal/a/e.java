package com.google.android.gms.games.internal.a;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.internal.d;
import com.google.android.gms.games.multiplayer.c;
import com.google.android.gms.internal.ahl.b;

public final class e implements c {

    private static abstract class a extends c$a<com.google.android.gms.games.multiplayer.c.a> {
        private a(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.multiplayer.c.a a(final Status status) {
            return new com.google.android.gms.games.multiplayer.c.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public com.google.android.gms.games.multiplayer.a c() {
                    return new com.google.android.gms.games.multiplayer.a(DataHolder.b(14));
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass2 extends a {
        protected void a(d dVar) {
            dVar.f((b) this, null, 0);
        }
    }

    class AnonymousClass3 extends a {
        protected void a(d dVar) {
            dVar.m(this, null);
        }
    }

    public Intent a(g gVar) {
        return com.google.android.gms.games.c.a(gVar).n();
    }

    public i<com.google.android.gms.games.multiplayer.c.a> a(g gVar, final int i) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ e b;

            protected void a(d dVar) {
                dVar.a((b) this, i);
            }
        });
    }

    public void a(g gVar, com.google.android.gms.games.multiplayer.e eVar) {
        d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.a(gVar.a(eVar));
        }
    }

    public void b(g gVar) {
        d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.o();
        }
    }

    public i<com.google.android.gms.games.multiplayer.c.a> c(g gVar) {
        return a(gVar, 0);
    }
}
