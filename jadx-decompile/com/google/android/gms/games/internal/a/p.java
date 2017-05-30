package com.google.android.gms.games.internal.a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.g;
import java.util.List;

public final class p implements g {

    private static abstract class c extends c$a<com.google.android.gms.games.multiplayer.turnbased.g.c> {
        private c(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.multiplayer.turnbased.g.c a(final Status status) {
            return new com.google.android.gms.games.multiplayer.turnbased.g.c(this) {
                final /* synthetic */ c b;

                public Status a() {
                    return status;
                }

                public TurnBasedMatch c() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class a extends c$a<com.google.android.gms.games.multiplayer.turnbased.g.a> {
        private final String a;

        public a(String str, com.google.android.gms.common.api.g gVar) {
            super(gVar);
            this.a = str;
        }

        public com.google.android.gms.games.multiplayer.turnbased.g.a a(final Status status) {
            return new com.google.android.gms.games.multiplayer.turnbased.g.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public String b() {
                    return this.b.a;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class e extends c$a<com.google.android.gms.games.multiplayer.turnbased.g.e> {
        private e(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.multiplayer.turnbased.g.e a(final Status status) {
            return new com.google.android.gms.games.multiplayer.turnbased.g.e(this) {
                final /* synthetic */ e b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public com.google.android.gms.games.multiplayer.turnbased.a c() {
                    return new com.google.android.gms.games.multiplayer.turnbased.a(new Bundle());
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class b extends c$a<com.google.android.gms.games.multiplayer.turnbased.g.b> {
        private b(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.multiplayer.turnbased.g.b a(final Status status) {
            return new com.google.android.gms.games.multiplayer.turnbased.g.b(this) {
                final /* synthetic */ b b;

                public Status a() {
                    return status;
                }

                public TurnBasedMatch c() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class d extends c$a<com.google.android.gms.games.multiplayer.turnbased.g.d> {
        private d(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.multiplayer.turnbased.g.d a(final Status status) {
            return new com.google.android.gms.games.multiplayer.turnbased.g.d(this) {
                final /* synthetic */ d b;

                public Status a() {
                    return status;
                }

                public TurnBasedMatch c() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass3 extends b {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.c((com.google.android.gms.internal.ahl.b) this, null, null);
        }
    }

    class AnonymousClass4 extends b {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.d((com.google.android.gms.internal.ahl.b) this, null, null);
        }
    }

    class AnonymousClass5 extends e {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null, 0, null);
        }
    }

    private static abstract class f extends c$a<com.google.android.gms.games.multiplayer.turnbased.g.f> {
        private f(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.multiplayer.turnbased.g.f a(final Status status) {
            return new com.google.android.gms.games.multiplayer.turnbased.g.f(this) {
                final /* synthetic */ f b;

                public Status a() {
                    return status;
                }

                public TurnBasedMatch c() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public Intent a(com.google.android.gms.common.api.g gVar) {
        return com.google.android.gms.games.c.a(gVar).m();
    }

    public Intent a(com.google.android.gms.common.api.g gVar, int i, int i2) {
        return com.google.android.gms.games.c.a(gVar).a(i, i2, true);
    }

    public Intent a(com.google.android.gms.common.api.g gVar, int i, int i2, boolean z) {
        return com.google.android.gms.games.c.a(gVar).a(i, i2, z);
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.e> a(com.google.android.gms.common.api.g gVar, final int i, final int[] iArr) {
        return gVar.a(new e(this, gVar) {
            final /* synthetic */ p c;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, i, iArr);
            }
        });
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.b> a(com.google.android.gms.common.api.g gVar, final com.google.android.gms.games.multiplayer.turnbased.d dVar) {
        return gVar.b(new b(this, gVar) {
            final /* synthetic */ p b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, dVar);
            }
        });
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.b> a(com.google.android.gms.common.api.g gVar, final String str) {
        return gVar.b(new b(this, gVar) {
            final /* synthetic */ p b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.c((com.google.android.gms.internal.ahl.b) this, str);
            }
        });
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.c> a(com.google.android.gms.common.api.g gVar, final String str, final String str2) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ p c;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str, str2);
            }
        });
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.f> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, String str2) {
        return a(gVar, str, bArr, str2, null);
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.f> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, String str2, List<ParticipantResult> list) {
        return a(gVar, str, bArr, str2, list == null ? null : (ParticipantResult[]) list.toArray(new ParticipantResult[list.size()]));
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.f> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, String str2, ParticipantResult... participantResultArr) {
        final String str3 = str;
        final byte[] bArr2 = bArr;
        final String str4 = str2;
        final ParticipantResult[] participantResultArr2 = participantResultArr;
        return gVar.b(new f(this, gVar) {
            final /* synthetic */ p e;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str3, bArr2, str4, participantResultArr2);
            }
        });
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.f> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, List<ParticipantResult> list) {
        return a(gVar, str, bArr, list == null ? null : (ParticipantResult[]) list.toArray(new ParticipantResult[list.size()]));
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.f> a(com.google.android.gms.common.api.g gVar, String str, byte[] bArr, ParticipantResult... participantResultArr) {
        final String str2 = str;
        final byte[] bArr2 = bArr;
        final ParticipantResult[] participantResultArr2 = participantResultArr;
        return gVar.b(new f(this, gVar) {
            final /* synthetic */ p d;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str2, bArr2, participantResultArr2);
            }
        });
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.e> a(com.google.android.gms.common.api.g gVar, int[] iArr) {
        return a(gVar, 0, iArr);
    }

    public void a(com.google.android.gms.common.api.g gVar, com.google.android.gms.games.multiplayer.turnbased.b bVar) {
        com.google.android.gms.games.internal.d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.b(gVar.a(bVar));
        }
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.b> b(com.google.android.gms.common.api.g gVar, final String str) {
        return gVar.b(new b(this, gVar) {
            final /* synthetic */ p b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.d((com.google.android.gms.internal.ahl.b) this, str);
            }
        });
    }

    public void b(com.google.android.gms.common.api.g gVar) {
        com.google.android.gms.games.internal.d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.p();
        }
    }

    public int c(com.google.android.gms.common.api.g gVar) {
        return com.google.android.gms.games.c.a(gVar).N();
    }

    public void c(com.google.android.gms.common.api.g gVar, String str) {
        com.google.android.gms.games.internal.d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.c(str, 1);
        }
    }

    public void d(com.google.android.gms.common.api.g gVar, String str) {
        com.google.android.gms.games.internal.d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.b(str, 1);
        }
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.f> e(com.google.android.gms.common.api.g gVar, String str) {
        return a(gVar, str, null, null);
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.c> f(com.google.android.gms.common.api.g gVar, final String str) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ p b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.e((com.google.android.gms.internal.ahl.b) this, str);
            }
        });
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.a> g(com.google.android.gms.common.api.g gVar, final String str) {
        return gVar.b(new a(this, gVar, str) {
            final /* synthetic */ p b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.f((com.google.android.gms.internal.ahl.b) this, str);
            }
        });
    }

    public void h(com.google.android.gms.common.api.g gVar, String str) {
        com.google.android.gms.games.internal.d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.a(str);
        }
    }

    public i<com.google.android.gms.games.multiplayer.turnbased.g.d> i(com.google.android.gms.common.api.g gVar, final String str) {
        return gVar.a(new d(this, gVar) {
            final /* synthetic */ p b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.g((com.google.android.gms.internal.ahl.b) this, str);
            }
        });
    }
}
