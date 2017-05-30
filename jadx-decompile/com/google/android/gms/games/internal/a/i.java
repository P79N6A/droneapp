package com.google.android.gms.games.internal.a;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.c$i;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.j;
import com.google.android.gms.games.n;
import com.google.android.gms.games.n$b;
import com.google.android.gms.games.n$c;
import com.google.android.gms.games.n$d;
import com.google.android.gms.games.n$f;
import com.google.android.gms.games.n$g;

public final class i implements n {

    static abstract class a extends c$a<com.google.android.gms.games.n.a> {
        a(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.n.a a(final Status status) {
            return new com.google.android.gms.games.n.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public j c() {
                    return new j(DataHolder.b(14));
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass10 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.d(this, 0, true, false);
        }
    }

    class AnonymousClass11 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.b(this, null, 0, false, false);
        }
    }

    class AnonymousClass13 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.b(this, null, 0, true, false);
        }
    }

    class AnonymousClass14 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.b((com.google.android.gms.internal.ahl.b) this, null, null, 0, false, false);
        }
    }

    class AnonymousClass15 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.b((com.google.android.gms.internal.ahl.b) this, null, null, 0, true, false);
        }
    }

    private static abstract class d extends c$a<n$d> {
        public n$d a(final Status status) {
            return new n$d(this) {
                final /* synthetic */ d b;

                public Status a() {
                    return status;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass16 extends d {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.l((com.google.android.gms.internal.ahl.b) this, null);
        }
    }

    private static abstract class e extends c$a<n$f> {
        public n$f a(final Status status) {
            return new n$f(this) {
                final /* synthetic */ e b;

                public Status a() {
                    return status;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass17 extends e {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.d((com.google.android.gms.internal.ahl.b) this, null, 0);
        }
    }

    class AnonymousClass18 extends e {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.e((com.google.android.gms.internal.ahl.b) this, null, 0);
        }
    }

    private static abstract class b extends c$a<n$b> {
        protected n$b a(Status status) {
            return new ProfileSettingsEntity(DataHolder.b(status.i()));
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass19 extends b {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, false, false);
        }
    }

    class AnonymousClass20 extends b {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, false, true);
        }
    }

    private static abstract class g extends c$a<Status> {
        protected Status a(Status status) {
            return status;
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass21 extends g {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.h((com.google.android.gms.internal.ahl.b) this, false);
        }
    }

    class AnonymousClass22 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null);
        }
    }

    class AnonymousClass23 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null);
        }
    }

    private static abstract class c extends c$a<n$c> {
        protected n$c a(final Status status) {
            return new n$c(this) {
                final /* synthetic */ c b;

                public Status a() {
                    return status;
                }

                public void b() {
                }
            };
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass24 extends c {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.m(this);
        }
    }

    private static abstract class f extends c$a<n$g> {
        protected n$g a(final Status status) {
            return new n$g(this) {
                final /* synthetic */ f b;

                public Status a() {
                    return status;
                }
            };
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass25 extends f {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null, false, null, false, false);
        }
    }

    class AnonymousClass26 extends c$i {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.i((com.google.android.gms.internal.ahl.b) this, false);
        }
    }

    class AnonymousClass27 extends c$i {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.j((com.google.android.gms.internal.ahl.b) this, false);
        }
    }

    class AnonymousClass28 extends c$i {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.k((com.google.android.gms.internal.ahl.b) this, false);
        }
    }

    class AnonymousClass2 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, "nearby", null, 0, true, false);
        }
    }

    class AnonymousClass34 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, "nearby", null, 0, false, false);
        }
    }

    class AnonymousClass3 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, "played_with", null, 0, false, false);
        }
    }

    class AnonymousClass4 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, "played_with", null, 0, true, false);
        }
    }

    class AnonymousClass5 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.b((com.google.android.gms.internal.ahl.b) this, 0, false, false);
        }
    }

    class AnonymousClass6 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.b((com.google.android.gms.internal.ahl.b) this, 0, true, false);
        }
    }

    class AnonymousClass7 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.c((com.google.android.gms.internal.ahl.b) this, 0, false, false);
        }
    }

    class AnonymousClass8 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.c((com.google.android.gms.internal.ahl.b) this, 0, true, false);
        }
    }

    class AnonymousClass9 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.d(this, 0, false, false);
        }
    }

    public Intent a(com.google.android.gms.common.api.g gVar, Player player) {
        return com.google.android.gms.games.c.a(gVar).a(new PlayerEntity(player));
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.games.n.a> a(com.google.android.gms.common.api.g gVar, final int i) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ i b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, i, true, false);
            }
        });
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.games.n.a> a(com.google.android.gms.common.api.g gVar, final int i, final boolean z) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ i c;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, i, false, z);
            }
        });
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.games.n.a> a(com.google.android.gms.common.api.g gVar, final String str) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ i b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str, false);
            }
        });
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.games.n.a> a(com.google.android.gms.common.api.g gVar, final String str, final boolean z) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ i c;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str, z);
            }
        });
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.games.n.a> a(com.google.android.gms.common.api.g gVar, final boolean z) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ i b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, z);
            }
        });
    }

    public String a(com.google.android.gms.common.api.g gVar) {
        return com.google.android.gms.games.c.a(gVar).a(true);
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.games.n.a> b(com.google.android.gms.common.api.g gVar, final int i) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ i b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, "played_with", i, true, false);
            }
        });
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.games.n.a> b(com.google.android.gms.common.api.g gVar, final int i, final boolean z) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ i c;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, "played_with", i, false, z);
            }
        });
    }

    public Player b(com.google.android.gms.common.api.g gVar) {
        return com.google.android.gms.games.c.a(gVar).i();
    }

    public Intent c(com.google.android.gms.common.api.g gVar) {
        return com.google.android.gms.games.c.a(gVar).s();
    }
}
