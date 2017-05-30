package com.google.android.gms.games.internal.a;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.c;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.internal.d;

public final class a implements c {

    private static abstract class b extends c$a<com.google.android.gms.games.achievement.c.b> {
        private final String a;

        public b(String str, g gVar) {
            super(gVar);
            this.a = str;
        }

        public com.google.android.gms.games.achievement.c.b a(final Status status) {
            return new com.google.android.gms.games.achievement.c.b(this) {
                final /* synthetic */ b b;

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

    private static abstract class a extends c$a<com.google.android.gms.games.achievement.c.a> {
        private a(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.achievement.c.a a(final Status status) {
            return new com.google.android.gms.games.achievement.c.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public com.google.android.gms.games.achievement.a c() {
                    return new com.google.android.gms.games.achievement.a(DataHolder.b(14));
                }
            };
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass2 extends a {
        public void a(d dVar) {
            dVar.b((com.google.android.gms.internal.ahl.b) this, null, null, false);
        }
    }

    public Intent a(g gVar) {
        return com.google.android.gms.games.c.a(gVar).l();
    }

    public i<com.google.android.gms.games.achievement.c.a> a(g gVar, final boolean z) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ a b;

            public void a(d dVar) {
                dVar.c((com.google.android.gms.internal.ahl.b) this, z);
            }
        });
    }

    public void a(g gVar, final String str) {
        gVar.b(new b(this, gVar, str) {
            final /* synthetic */ a b;

            public void a(d dVar) {
                dVar.a(null, str);
            }
        });
    }

    public void a(g gVar, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        gVar.b(new b(this, str, gVar) {
            final /* synthetic */ a c;

            public void a(d dVar) {
                dVar.a(null, str2, i2);
            }
        });
    }

    public i<com.google.android.gms.games.achievement.c.b> b(g gVar, final String str) {
        return gVar.b(new b(this, gVar, str) {
            final /* synthetic */ a b;

            public void a(d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str);
            }
        });
    }

    public i<com.google.android.gms.games.achievement.c.b> b(g gVar, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        return gVar.b(new b(this, str, gVar) {
            final /* synthetic */ a c;

            public void a(d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str2, i2);
            }
        });
    }

    public void c(g gVar, final String str) {
        gVar.b(new b(this, gVar, str) {
            final /* synthetic */ a b;

            public void a(d dVar) {
                dVar.b(null, str);
            }
        });
    }

    public void c(g gVar, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        gVar.b(new b(this, str, gVar) {
            final /* synthetic */ a c;

            public void a(d dVar) {
                dVar.b(null, str2, i2);
            }
        });
    }

    public i<com.google.android.gms.games.achievement.c.b> d(g gVar, final String str) {
        return gVar.b(new b(this, gVar, str) {
            final /* synthetic */ a b;

            public void a(d dVar) {
                dVar.b((com.google.android.gms.internal.ahl.b) this, str);
            }
        });
    }

    public i<com.google.android.gms.games.achievement.c.b> d(g gVar, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        return gVar.b(new b(this, str, gVar) {
            final /* synthetic */ a c;

            public void a(d dVar) {
                dVar.b((com.google.android.gms.internal.ahl.b) this, str2, i2);
            }
        });
    }
}
