package com.google.android.gms.games.internal.a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.c$a;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.g;

public final class m implements g {

    private static abstract class c extends c$a<com.google.android.gms.games.snapshot.g.c> {
        private c(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.snapshot.g.c a(final Status status) {
            return new com.google.android.gms.games.snapshot.g.c(this) {
                final /* synthetic */ c b;

                public Status a() {
                    return status;
                }

                public void b() {
                }

                public com.google.android.gms.games.snapshot.c c() {
                    return new com.google.android.gms.games.snapshot.c(DataHolder.b(14));
                }
            };
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    private static abstract class d extends c$a<com.google.android.gms.games.snapshot.g.d> {
        private d(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.snapshot.g.d a(final Status status) {
            return new com.google.android.gms.games.snapshot.g.d(this) {
                final /* synthetic */ d b;

                public Status a() {
                    return status;
                }

                public Snapshot c() {
                    return null;
                }

                public String d() {
                    return null;
                }

                public Snapshot e() {
                    return null;
                }

                public SnapshotContents f() {
                    return null;
                }
            };
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    private static abstract class a extends c$a<com.google.android.gms.games.snapshot.g.a> {
        private a(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.snapshot.g.a a(final Status status) {
            return new com.google.android.gms.games.snapshot.g.a(this) {
                final /* synthetic */ a b;

                public Status a() {
                    return status;
                }

                public SnapshotMetadata c() {
                    return null;
                }
            };
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    private static abstract class b extends c$a<com.google.android.gms.games.snapshot.g.b> {
        private b(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public com.google.android.gms.games.snapshot.g.b a(final Status status) {
            return new com.google.android.gms.games.snapshot.g.b(this) {
                final /* synthetic */ b b;

                public Status a() {
                    return status;
                }

                public String b() {
                    return null;
                }
            };
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass6 extends c {
        protected void a(com.google.android.gms.games.internal.d dVar) {
            dVar.c((com.google.android.gms.internal.ahl.b) this, null, null, false);
        }
    }

    public int a(com.google.android.gms.common.api.g gVar) {
        return com.google.android.gms.games.c.a(gVar).R();
    }

    public Intent a(com.google.android.gms.common.api.g gVar, String str, boolean z, boolean z2, int i) {
        return com.google.android.gms.games.c.a(gVar).a(str, z, z2, i);
    }

    public i<com.google.android.gms.games.snapshot.g.a> a(com.google.android.gms.common.api.g gVar, final Snapshot snapshot, final com.google.android.gms.games.snapshot.d dVar) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ m c;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, snapshot, dVar);
            }
        });
    }

    public i<com.google.android.gms.games.snapshot.g.d> a(com.google.android.gms.common.api.g gVar, SnapshotMetadata snapshotMetadata) {
        return a(gVar, snapshotMetadata.h(), false);
    }

    public i<com.google.android.gms.games.snapshot.g.d> a(com.google.android.gms.common.api.g gVar, SnapshotMetadata snapshotMetadata, int i) {
        return a(gVar, snapshotMetadata.h(), false, i);
    }

    public i<com.google.android.gms.games.snapshot.g.d> a(com.google.android.gms.common.api.g gVar, String str, Snapshot snapshot) {
        SnapshotMetadata c = snapshot.c();
        com.google.android.gms.games.snapshot.d a = new com.google.android.gms.games.snapshot.d.a().a(c).a();
        return a(gVar, str, c.e(), a, snapshot.d());
    }

    public i<com.google.android.gms.games.snapshot.g.d> a(com.google.android.gms.common.api.g gVar, String str, String str2, com.google.android.gms.games.snapshot.d dVar, SnapshotContents snapshotContents) {
        final String str3 = str;
        final String str4 = str2;
        final com.google.android.gms.games.snapshot.d dVar2 = dVar;
        final SnapshotContents snapshotContents2 = snapshotContents;
        return gVar.b(new d(this, gVar) {
            final /* synthetic */ m e;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str3, str4, dVar2, snapshotContents2);
            }
        });
    }

    public i<com.google.android.gms.games.snapshot.g.d> a(com.google.android.gms.common.api.g gVar, String str, boolean z) {
        return a(gVar, str, z, -1);
    }

    public i<com.google.android.gms.games.snapshot.g.d> a(com.google.android.gms.common.api.g gVar, String str, boolean z, int i) {
        final String str2 = str;
        final boolean z2 = z;
        final int i2 = i;
        return gVar.b(new d(this, gVar) {
            final /* synthetic */ m d;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.a((com.google.android.gms.internal.ahl.b) this, str2, z2, i2);
            }
        });
    }

    public i<com.google.android.gms.games.snapshot.g.c> a(com.google.android.gms.common.api.g gVar, final boolean z) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ m b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.f((com.google.android.gms.internal.ahl.b) this, z);
            }
        });
    }

    public SnapshotMetadata a(Bundle bundle) {
        return (bundle == null || !bundle.containsKey(g.a)) ? null : (SnapshotMetadata) bundle.getParcelable(g.a);
    }

    public void a(com.google.android.gms.common.api.g gVar, Snapshot snapshot) {
        com.google.android.gms.games.c.a(gVar).a(snapshot);
    }

    public int b(com.google.android.gms.common.api.g gVar) {
        return com.google.android.gms.games.c.a(gVar).S();
    }

    public i<com.google.android.gms.games.snapshot.g.b> b(com.google.android.gms.common.api.g gVar, final SnapshotMetadata snapshotMetadata) {
        return gVar.b(new b(this, gVar) {
            final /* synthetic */ m b;

            protected void a(com.google.android.gms.games.internal.d dVar) {
                dVar.i((com.google.android.gms.internal.ahl.b) this, snapshotMetadata.e());
            }
        });
    }
}
