package com.google.android.gms.games.internal.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.g;
import com.google.android.gms.games.internal.d;

public final class h implements g {

    class AnonymousClass1 extends c$a<com.google.android.gms.games.g.b> {
        public com.google.android.gms.games.g.b a(final Status status) {
            return new com.google.android.gms.games.g.b(this) {
                final /* synthetic */ AnonymousClass1 b;

                public Status a() {
                    return status;
                }
            };
        }

        protected void a(d dVar) {
            dVar.e((com.google.android.gms.internal.ahl.b) this, null, true);
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass2 extends c$a<com.google.android.gms.games.g.b> {
        public com.google.android.gms.games.g.b a(final Status status) {
            return new com.google.android.gms.games.g.b(this) {
                final /* synthetic */ AnonymousClass2 b;

                public Status a() {
                    return status;
                }
            };
        }

        protected void a(d dVar) {
            dVar.e((com.google.android.gms.internal.ahl.b) this, null, false);
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass3 extends c$a<com.google.android.gms.games.g.c> {
        public com.google.android.gms.games.g.c a(final Status status) {
            return new com.google.android.gms.games.g.c(this) {
                final /* synthetic */ AnonymousClass3 b;

                public Status a() {
                    return status;
                }
            };
        }

        protected void a(d dVar) {
            dVar.n(this, null);
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class a extends c$a<com.google.android.gms.games.g.a> {
        public com.google.android.gms.games.g.a a(final Status status) {
            return new com.google.android.gms.games.g.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass4 extends a {
        protected void a(d dVar) {
            dVar.l((com.google.android.gms.internal.ahl.b) this, false);
        }
    }

    private static abstract class b extends c$a<Status> {
        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass5 extends b {
        protected void a(d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, false, false, null);
        }
    }

    private static abstract class c extends c$a<g.d> {
        public g.d a(final Status status) {
            return new g.d(this) {
                final /* synthetic */ c b;

                public Status a() {
                    return status;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass6 extends c {
        protected void a(d dVar) {
            dVar.n(this);
        }
    }

    public void a(com.google.android.gms.common.api.g gVar) {
        a(gVar, 63);
    }

    public void a(com.google.android.gms.common.api.g gVar, int i) {
        d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.d(i);
        }
    }
}
