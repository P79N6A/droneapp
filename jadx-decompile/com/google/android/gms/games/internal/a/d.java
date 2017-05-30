package com.google.android.gms.games.internal.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.e;

public final class d implements e {

    private static abstract class c extends c$a<com.google.android.gms.games.e.c> {
        private c(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.e.c a(final Status status) {
            return new com.google.android.gms.games.e.c(this) {
                final /* synthetic */ c b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public com.google.android.gms.games.a c() {
                    return new com.google.android.gms.games.a(DataHolder.b(14));
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class a extends c$a<com.google.android.gms.games.e.a> {
        public com.google.android.gms.games.e.a a(final Status status) {
            return new com.google.android.gms.games.e.a(this) {
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

    class AnonymousClass2 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.j((com.google.android.gms.internal.ahl.b) this, null);
        }
    }

    private static abstract class b extends c$a<com.google.android.gms.games.e.b> {
        public com.google.android.gms.games.e.b a(final Status status) {
            return new com.google.android.gms.games.e.b(this) {
                final /* synthetic */ b b;

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

    class AnonymousClass3 extends b {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.k((com.google.android.gms.internal.ahl.b) this, null);
        }
    }

    public Game a(g gVar) {
        return com.google.android.gms.games.c.a(gVar).j();
    }

    public i<com.google.android.gms.games.e.c> b(g gVar) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ d a;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.b((com.google.android.gms.internal.ahl.b) this);
            }
        });
    }
}
