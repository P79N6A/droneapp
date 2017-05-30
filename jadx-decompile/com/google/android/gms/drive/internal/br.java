package com.google.android.gms.drive.internal;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.c$a;
import com.google.android.gms.drive.c$b;
import com.google.android.gms.drive.c$c;
import com.google.android.gms.drive.o;
import com.google.android.gms.drive.query.Query;
import java.util.List;

public class br implements com.google.android.gms.drive.c {

    static abstract class h extends bs<c$c> {
        h(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public c$c a(Status status) {
            return new g(status, null, false);
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    static abstract class c extends bs<c$a> {
        c(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public c$a a(Status status) {
            return new b(status, null);
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    static abstract class f extends bs<c$b> {
        f(com.google.android.gms.common.api.g gVar) {
            super(gVar);
        }

        public c$b a(Status status) {
            return new e(status, null);
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static class a extends bc {
        private final com.google.android.gms.internal.ahl.b<c$a> a;

        public a(com.google.android.gms.internal.ahl.b<c$a> bVar) {
            this.a = bVar;
        }

        public void a(Status status) {
            this.a.a(new b(status, null));
        }

        public void a(OnContentsResponse onContentsResponse) {
            this.a.a(new b(Status.a, new bu(onContentsResponse.a())));
        }
    }

    static class b implements k, c$a {
        private final Status a;
        private final com.google.android.gms.drive.d b;

        public b(Status status, com.google.android.gms.drive.d dVar) {
            this.a = status;
            this.b = dVar;
        }

        public Status a() {
            return this.a;
        }

        public void b() {
            if (this.b != null) {
                this.b.g();
            }
        }

        public com.google.android.gms.drive.d c() {
            return this.b;
        }
    }

    static class d extends bc {
        private final com.google.android.gms.internal.ahl.b<c$b> a;

        public d(com.google.android.gms.internal.ahl.b<c$b> bVar) {
            this.a = bVar;
        }

        public void a(Status status) {
            this.a.a(new e(status, null));
        }

        public void a(OnDriveIdResponse onDriveIdResponse) {
            this.a.a(new e(Status.a, onDriveIdResponse.a()));
        }

        public void a(OnMetadataResponse onMetadataResponse) {
            this.a.a(new e(Status.a, new bo(onMetadataResponse.a()).h()));
        }
    }

    private static class e implements c$b {
        private final Status a;
        private final DriveId b;

        public e(Status status, DriveId driveId) {
            this.a = status;
            this.b = driveId;
        }

        public Status a() {
            return this.a;
        }

        public DriveId b() {
            return this.b;
        }
    }

    static class g implements c$c {
        private final Status a;
        private final com.google.android.gms.drive.m b;
        private final boolean c;

        public g(Status status, com.google.android.gms.drive.m mVar, boolean z) {
            this.a = status;
            this.b = mVar;
            this.c = z;
        }

        public Status a() {
            return this.a;
        }

        public void b() {
            if (this.b != null) {
                this.b.b();
            }
        }

        public com.google.android.gms.drive.m c() {
            return this.b;
        }
    }

    private static class i extends bc {
        private final com.google.android.gms.internal.ahl.b<c$c> a;

        public i(com.google.android.gms.internal.ahl.b<c$c> bVar) {
            this.a = bVar;
        }

        public void a(Status status) {
            this.a.a(new g(status, null, false));
        }

        public void a(OnListEntriesResponse onListEntriesResponse) {
            this.a.a(new g(Status.a, new com.google.android.gms.drive.m(onListEntriesResponse.b()), onListEntriesResponse.c()));
        }
    }

    @SuppressLint({"MissingRemoteException"})
    static class j extends com.google.android.gms.drive.internal.bs.a {
        j(com.google.android.gms.common.api.g gVar, Status status) {
            super(gVar);
            b(status);
        }

        protected void a(bt btVar) {
        }
    }

    public com.google.android.gms.common.api.i<c$a> a(com.google.android.gms.common.api.g gVar) {
        return a(gVar, (int) com.google.android.gms.drive.e.c);
    }

    public com.google.android.gms.common.api.i<c$a> a(com.google.android.gms.common.api.g gVar, final int i) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ br b;

            protected void a(bt btVar) {
                btVar.i().a(new CreateContentsRequest(i), new a(this));
            }
        });
    }

    public com.google.android.gms.common.api.i<c$c> a(com.google.android.gms.common.api.g gVar, final Query query) {
        if (query != null) {
            return gVar.a(new h(this, gVar) {
                final /* synthetic */ br b;

                protected void a(bt btVar) {
                    btVar.i().a(new QueryRequest(query), new i(this));
                }
            });
        }
        throw new IllegalArgumentException("Query must be provided.");
    }

    public com.google.android.gms.common.api.i<c$b> a(com.google.android.gms.common.api.g gVar, final String str) {
        return gVar.a(new f(this, gVar) {
            final /* synthetic */ br b;

            protected void a(bt btVar) {
                btVar.i().a(new GetMetadataRequest(DriveId.a(str), false), new d(this));
            }
        });
    }

    public com.google.android.gms.common.api.i<Status> a(com.google.android.gms.common.api.g gVar, List<String> list) {
        return ((bt) gVar.a(com.google.android.gms.drive.b.a)).a(gVar, (List) list);
    }

    public com.google.android.gms.drive.e a(com.google.android.gms.common.api.g gVar, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (gVar.j()) {
            return new bv(driveId);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public o a() {
        return new o();
    }

    public com.google.android.gms.drive.a b() {
        return new com.google.android.gms.drive.a();
    }

    public com.google.android.gms.drive.f b(com.google.android.gms.common.api.g gVar) {
        bt btVar = (bt) gVar.a(com.google.android.gms.drive.b.a);
        if (btVar.l()) {
            DriveId j = btVar.j();
            return j != null ? new bx(j) : null;
        } else {
            throw new IllegalStateException("Client is not yet connected");
        }
    }

    public com.google.android.gms.drive.f b(com.google.android.gms.common.api.g gVar, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (gVar.j()) {
            return new bx(driveId);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public com.google.android.gms.drive.f c(com.google.android.gms.common.api.g gVar) {
        bt btVar = (bt) gVar.a(com.google.android.gms.drive.b.a);
        if (btVar.l()) {
            DriveId k = btVar.k();
            return k != null ? new bx(k) : null;
        } else {
            throw new IllegalStateException("Client is not yet connected");
        }
    }

    public com.google.android.gms.common.api.i<Status> d(com.google.android.gms.common.api.g gVar) {
        return gVar.b(new com.google.android.gms.drive.internal.bs.a(this, gVar) {
            final /* synthetic */ br a;

            protected void a(bt btVar) {
                btVar.i().a(new at(this));
            }
        });
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.common.api.e> e(com.google.android.gms.common.api.g gVar) {
        return gVar.a(new bs<com.google.android.gms.common.api.e>(this, gVar) {
            final /* synthetic */ br a;

            protected com.google.android.gms.common.api.e a(Status status) {
                return new com.google.android.gms.common.api.e(status, false);
            }

            protected void a(bt btVar) {
                btVar.i().e(new bc(this) {
                    final /* synthetic */ AnonymousClass5 b;

                    public void a(boolean z) {
                        this.b(new com.google.android.gms.common.api.e(Status.a, z));
                    }
                });
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }
}
