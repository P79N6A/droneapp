package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.c$c;
import com.google.android.gms.drive.j;
import com.google.android.gms.drive.metadata.internal.i;
import com.google.android.gms.drive.n;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.w;
import com.google.android.gms.internal.ajw;

public class bx extends c implements com.google.android.gms.drive.f {

    static abstract class d extends bs<com.google.android.gms.drive.f.a> {
        d(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.drive.f.a a(Status status) {
            return new c(status, null);
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    static abstract class f extends bs<com.google.android.gms.drive.f.b> {
        f(g gVar) {
            super(gVar);
        }

        public com.google.android.gms.drive.f.b a(Status status) {
            return new e(status, null);
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static class a extends bc {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.drive.f.a> a;

        public a(com.google.android.gms.internal.ahl.b<com.google.android.gms.drive.f.a> bVar) {
            this.a = bVar;
        }

        public void a(Status status) {
            this.a.a(new c(status, null));
        }

        public void a(OnDriveIdResponse onDriveIdResponse) {
            this.a.a(new c(Status.a, new bv(onDriveIdResponse.a())));
        }
    }

    private static class b extends bc {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.drive.f.b> a;

        public b(com.google.android.gms.internal.ahl.b<com.google.android.gms.drive.f.b> bVar) {
            this.a = bVar;
        }

        public void a(Status status) {
            this.a.a(new e(status, null));
        }

        public void a(OnDriveIdResponse onDriveIdResponse) {
            this.a.a(new e(Status.a, new bx(onDriveIdResponse.a())));
        }
    }

    private static class c implements com.google.android.gms.drive.f.a {
        private final Status a;
        private final com.google.android.gms.drive.e b;

        public c(Status status, com.google.android.gms.drive.e eVar) {
            this.a = status;
            this.b = eVar;
        }

        public Status a() {
            return this.a;
        }

        public com.google.android.gms.drive.e b() {
            return this.b;
        }
    }

    private static class e implements com.google.android.gms.drive.f.b {
        private final Status a;
        private final com.google.android.gms.drive.f b;

        public e(Status status, com.google.android.gms.drive.f fVar) {
            this.a = status;
            this.b = fVar;
        }

        public Status a() {
            return this.a;
        }

        public com.google.android.gms.drive.f b() {
            return this.b;
        }
    }

    public bx(DriveId driveId) {
        super(driveId);
    }

    private int a(com.google.android.gms.drive.d dVar, i iVar) {
        if (dVar == null) {
            return (iVar == null || !iVar.c()) ? 1 : 0;
        } else {
            int f = dVar.f().f();
            dVar.g();
            return f;
        }
    }

    private com.google.android.gms.common.api.i<com.google.android.gms.drive.f.a> a(g gVar, n nVar, int i, w wVar) {
        i a = i.a(nVar.e());
        final int i2 = (a == null || !a.c()) ? 0 : 1;
        final n nVar2 = nVar;
        final int i3 = i;
        final w wVar2 = wVar;
        return gVar.b(new d(this, gVar) {
            final /* synthetic */ bx e;

            protected void a(bt btVar) {
                nVar2.j().a(btVar.B());
                btVar.i().a(new CreateFileRequest(this.e.a(), nVar2.j(), i3, i2, wVar2), new a(this));
            }
        });
    }

    private n a(n nVar, String str) {
        return nVar.a(ajw.K, str);
    }

    private Query a(Query query) {
        com.google.android.gms.drive.query.Query.a a = new com.google.android.gms.drive.query.Query.a().a(com.google.android.gms.drive.query.a.a(com.google.android.gms.drive.query.b.d, a()));
        if (query != null) {
            if (query.a() != null) {
                a.a(query.a());
            }
            a.a(query.b());
            a.a(query.c());
        }
        return a.a();
    }

    private void a(n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        i a = i.a(nVar.e());
        if (a != null && !a.b()) {
            throw new IllegalArgumentException("May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead.");
        }
    }

    private void b(g gVar, n nVar, com.google.android.gms.drive.d dVar, w wVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        i a = i.a(nVar.e());
        if (a == null || !a.a()) {
            wVar.a(gVar);
            if (dVar != null) {
                if (!(dVar instanceof bu)) {
                    throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
                } else if (dVar.a() != null) {
                    throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
                } else if (dVar.h()) {
                    throw new IllegalArgumentException("DriveContents are already closed.");
                } else {
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder");
    }

    public com.google.android.gms.common.api.i<c$c> a(g gVar) {
        return a(gVar, null);
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.drive.f.b> a(g gVar, final n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        } else if (nVar.e() == null || nVar.e().equals(com.google.android.gms.drive.f.b_)) {
            return gVar.b(new f(this, gVar) {
                final /* synthetic */ bx b;

                protected void a(bt btVar) {
                    nVar.j().a(btVar.B());
                    btVar.i().a(new CreateFolderRequest(this.b.a(), nVar.j()), new b(this));
                }
            });
        } else {
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        }
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.drive.f.a> a(g gVar, n nVar, com.google.android.gms.drive.d dVar) {
        a(nVar);
        return a(gVar, nVar, dVar, null);
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.drive.f.a> a(g gVar, n nVar, com.google.android.gms.drive.d dVar, j jVar) {
        a(nVar);
        return a(gVar, nVar, dVar, w.a(jVar));
    }

    public com.google.android.gms.common.api.i<com.google.android.gms.drive.f.a> a(g gVar, n nVar, com.google.android.gms.drive.d dVar, w wVar) {
        w wVar2 = wVar == null ? (w) new com.google.android.gms.drive.w.a().b() : wVar;
        b(gVar, nVar, dVar, wVar2);
        int a = a(dVar, i.a(nVar.e()));
        String e = wVar2.e();
        if (e != null) {
            nVar = a(nVar, e);
        }
        return a(gVar, nVar, a, wVar2);
    }

    public com.google.android.gms.common.api.i<c$c> a(g gVar, Query query) {
        return new br().a(gVar, a(query));
    }
}
