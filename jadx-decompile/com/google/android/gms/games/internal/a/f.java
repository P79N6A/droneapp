package com.google.android.gms.games.internal.a;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.a.e;
import com.google.android.gms.games.a.m;
import com.google.android.gms.games.a.n;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.internal.h;

public final class f implements m {

    private static abstract class a extends c$a<com.google.android.gms.games.a.m.a> {
        private a(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.a.m.a a(final Status status) {
            return new com.google.android.gms.games.a.m.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public com.google.android.gms.games.a.b c() {
                    return new com.google.android.gms.games.a.b(DataHolder.b(14));
                }
            };
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass10 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.d((com.google.android.gms.internal.ahl.b) this, null, false);
        }
    }

    class AnonymousClass11 extends a {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null, null, false);
        }
    }

    private static abstract class c extends c$a<com.google.android.gms.games.a.m.c> {
        private c(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.a.m.c a(final Status status) {
            return new com.google.android.gms.games.a.m.c(this) {
                final /* synthetic */ c b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public com.google.android.gms.games.a.a c() {
                    return null;
                }

                public com.google.android.gms.games.a.f d() {
                    return new com.google.android.gms.games.a.f(DataHolder.b(14));
                }
            };
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass2 extends c {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a(this, null, null, 0, 0, 0, false);
        }
    }

    class AnonymousClass3 extends c {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.b(this, null, null, 0, 0, 0, false);
        }
    }

    private static abstract class b extends c$a<com.google.android.gms.games.a.m.b> {
        private b(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.a.m.b a(final Status status) {
            return new com.google.android.gms.games.a.m.b(this) {
                final /* synthetic */ b b;

                public Status a() {
                    return status;
                }

                public e c() {
                    return null;
                }
            };
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    protected static abstract class d extends c$a<com.google.android.gms.games.a.m.d> {
        protected d(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.a.m.d a(final Status status) {
            return new com.google.android.gms.games.a.m.d(this) {
                final /* synthetic */ d b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public n c() {
                    return new n(DataHolder.b(14));
                }
            };
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    public Intent a(g gVar) {
        return com.google.android.gms.games.c.a(gVar).k();
    }

    public Intent a(g gVar, String str) {
        return a(gVar, str, -1);
    }

    public Intent a(g gVar, String str, int i) {
        return a(gVar, str, i, -1);
    }

    public Intent a(g gVar, String str, int i, int i2) {
        return com.google.android.gms.games.c.a(gVar).a(str, i, i2);
    }

    public i<com.google.android.gms.games.a.m.c> a(g gVar, com.google.android.gms.games.a.f fVar, int i, int i2) {
        final com.google.android.gms.games.a.f fVar2 = fVar;
        final int i3 = i;
        final int i4 = i2;
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ f d;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, fVar2, i3, i4);
            }
        });
    }

    public i<com.google.android.gms.games.a.m.c> a(g gVar, String str, int i, int i2, int i3) {
        return a(gVar, str, i, i2, i3, false);
    }

    public i<com.google.android.gms.games.a.m.c> a(g gVar, String str, int i, int i2, int i3, boolean z) {
        final String str2 = str;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final boolean z2 = z;
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ f f;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str2, i4, i5, i6, z2);
            }
        });
    }

    public i<com.google.android.gms.games.a.m.a> a(g gVar, final String str, final boolean z) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ f c;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.b((com.google.android.gms.internal.ahl.b) this, str, z);
            }
        });
    }

    public i<com.google.android.gms.games.a.m.a> a(g gVar, final boolean z) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ f b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.b((com.google.android.gms.internal.ahl.b) this, z);
            }
        });
    }

    public void a(g gVar, String str, long j) {
        a(gVar, str, j, null);
    }

    public void a(g gVar, String str, long j, String str2) {
        com.google.android.gms.games.internal.d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            try {
                a.a(null, str, j, str2);
            } catch (RemoteException e) {
                h.a("LeaderboardsImpl", "service died");
            }
        }
    }

    public i<com.google.android.gms.games.a.m.b> b(g gVar, String str, int i, int i2) {
        final String str2 = str;
        final int i3 = i;
        final int i4 = i2;
        return gVar.a(new b(this, gVar) {
            final /* synthetic */ f d;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, null, str2, i3, i4);
            }
        });
    }

    public i<com.google.android.gms.games.a.m.c> b(g gVar, String str, int i, int i2, int i3) {
        return b(gVar, str, i, i2, i3, false);
    }

    public i<com.google.android.gms.games.a.m.c> b(g gVar, String str, int i, int i2, int i3, boolean z) {
        final String str2 = str;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final boolean z2 = z;
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ f f;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.b((com.google.android.gms.internal.ahl.b) this, str2, i4, i5, i6, z2);
            }
        });
    }

    public i<com.google.android.gms.games.a.m.d> b(g gVar, String str, long j) {
        return b(gVar, str, j, null);
    }

    public i<com.google.android.gms.games.a.m.d> b(g gVar, String str, long j, String str2) {
        final String str3 = str;
        final long j2 = j;
        final String str4 = str2;
        return gVar.b(new d(this, gVar) {
            final /* synthetic */ f d;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str3, j2, str4);
            }
        });
    }
}
