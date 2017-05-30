package com.google.android.gms.games.internal.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.internal.d;
import com.google.android.gms.games.social.b.c;

public class n implements com.google.android.gms.games.social.b {

    private static abstract class b extends c$a<c> {
        public c a(final Status status) {
            return new c(this) {
                final /* synthetic */ b b;

                public Status a() {
                    return status;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass1 extends b {
        protected void a(d dVar) {
            dVar.o(this, null);
        }
    }

    class AnonymousClass2 extends b {
        protected void a(d dVar) {
            dVar.p(this, null);
        }
    }

    class AnonymousClass3 extends b {
        protected void a(d dVar) {
            dVar.r(this, null);
        }
    }

    class AnonymousClass4 extends b {
        protected void a(d dVar) {
            dVar.q(this, null);
        }
    }

    private static abstract class a extends c$a<com.google.android.gms.games.social.b.d> {
        public com.google.android.gms.games.social.b.d a(final Status status) {
            return new com.google.android.gms.games.social.b.d(this) {
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

    class AnonymousClass5 extends a {
        protected void a(d dVar) {
            dVar.c((com.google.android.gms.internal.ahl.b) this, 0);
        }
    }

    class AnonymousClass6 extends a {
        protected void a(d dVar) {
            dVar.e(this, 0, false, false);
        }
    }

    class AnonymousClass7 extends a {
        protected void a(d dVar) {
            dVar.e(this, 0, true, false);
        }
    }

    class AnonymousClass8 extends a {
        protected void a(d dVar) {
            dVar.s(this, null);
        }
    }

    class AnonymousClass9 extends a {
        protected void a(d dVar) {
            dVar.f((com.google.android.gms.internal.ahl.b) this, null, false);
        }
    }
}
