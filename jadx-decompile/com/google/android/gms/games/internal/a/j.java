package com.google.android.gms.games.internal.a;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.internal.d;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.e;
import com.google.android.gms.games.quest.f;

public final class j implements f {

    private static abstract class a extends c$a<com.google.android.gms.games.quest.f.a> {
        private a(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.quest.f.a a(final Status status) {
            return new com.google.android.gms.games.quest.f.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public Quest c() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class b extends c$a<com.google.android.gms.games.quest.f.b> {
        private b(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.quest.f.b a(final Status status) {
            return new com.google.android.gms.games.quest.f.b(this) {
                final /* synthetic */ b b;

                public Status a() {
                    return status;
                }

                public Milestone c() {
                    return null;
                }

                public Quest d() {
                    return null;
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static abstract class c extends c$a<com.google.android.gms.games.quest.f.c> {
        private c(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.quest.f.c a(final Status status) {
            return new com.google.android.gms.games.quest.f.c(this) {
                final /* synthetic */ c b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public com.google.android.gms.games.quest.c c() {
                    return new com.google.android.gms.games.quest.c(DataHolder.b(status.i()));
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass5 extends c {
        protected void a(d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null, null, null, 0, false);
        }
    }

    class AnonymousClass6 extends c {
        protected void a(d dVar) {
            dVar.a((com.google.android.gms.internal.ahl.b) this, null, null, false, null);
        }
    }

    public Intent a(g gVar, String str) {
        return com.google.android.gms.games.c.a(gVar).b(str);
    }

    public Intent a(g gVar, int[] iArr) {
        return com.google.android.gms.games.c.a(gVar).a(iArr);
    }

    public i<com.google.android.gms.games.quest.f.b> a(g gVar, final String str, final String str2) {
        return gVar.b(new b(this, gVar) {
            final /* synthetic */ j c;

            protected void a(d dVar) {
                dVar.b((com.google.android.gms.internal.ahl.b) this, str, str2);
            }
        });
    }

    public i<com.google.android.gms.games.quest.f.c> a(g gVar, final boolean z, final String... strArr) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ j c;

            protected void a(d dVar) {
                dVar.b((com.google.android.gms.internal.ahl.b) this, z, strArr);
            }
        });
    }

    public i<com.google.android.gms.games.quest.f.c> a(g gVar, int[] iArr, int i, boolean z) {
        final int[] iArr2 = iArr;
        final int i2 = i;
        final boolean z2 = z;
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ j d;

            protected void a(d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, iArr2, i2, z2);
            }
        });
    }

    public void a(g gVar) {
        d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.q();
        }
    }

    public void a(g gVar, e eVar) {
        d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.c(gVar.a(eVar));
        }
    }

    public i<com.google.android.gms.games.quest.f.a> b(g gVar, final String str) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ j b;

            protected void a(d dVar) {
                dVar.h((com.google.android.gms.internal.ahl.b) this, str);
            }
        });
    }

    public void c(g gVar, String str) {
        d a = com.google.android.gms.games.c.a(gVar, false);
        if (a != null) {
            a.c(str);
        }
    }
}
