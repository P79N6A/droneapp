package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.util.o;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.c$a;
import com.google.android.gms.drive.d;
import com.google.android.gms.drive.e;
import com.google.android.gms.drive.j;
import com.google.android.gms.drive.n;
import com.google.android.gms.drive.x;
import com.google.android.gms.drive.x.a;
import java.io.InputStream;
import java.io.OutputStream;

public class bu implements d {
    private final Contents a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;

    public bu(Contents contents) {
        this.a = (Contents) com.google.android.gms.common.internal.d.a(contents);
    }

    public i<c$a> a(g gVar) {
        if (h()) {
            throw new IllegalStateException("DriveContents already closed.");
        } else if (this.a.e() != e.a_) {
            throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        } else {
            g();
            return gVar.a(new c(this, gVar) {
                final /* synthetic */ bu a;

                protected void a(bt btVar) {
                    btVar.i().a(new OpenContentsRequest(this.a.a(), e.c, this.a.a.f()), new ak(this, null));
                }
            });
        }
    }

    public i<Status> a(g gVar, n nVar) {
        return a(gVar, nVar, null);
    }

    public i<Status> a(g gVar, n nVar, j jVar) {
        return a(gVar, nVar, jVar == null ? null : x.a(jVar));
    }

    public i<Status> a(g gVar, n nVar, x xVar) {
        final x xVar2 = xVar == null ? (x) new a().b() : xVar;
        if (this.a.e() == e.a_) {
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        } else if (!j.a(xVar2.c()) || this.a.g()) {
            xVar2.a(gVar);
            if (h()) {
                throw new IllegalStateException("DriveContents already closed.");
            } else if (a() == null) {
                throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
            } else {
                if (nVar == null) {
                    nVar = n.f;
                }
                g();
                return gVar.b(new bs.a(this, gVar) {
                    final /* synthetic */ bu c;

                    protected void a(bt btVar) {
                        nVar.j().a(btVar.B());
                        btVar.i().a(new CloseContentsAndUpdateMetadataRequest(this.c.a.b(), nVar.j(), this.c.a.f(), this.c.a.g(), xVar2), new at(this));
                    }
                });
            }
        } else {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
    }

    public DriveId a() {
        return this.a.b();
    }

    public int b() {
        return this.a.e();
    }

    public void b(g gVar) {
        if (h()) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        g();
        ((AnonymousClass4) gVar.b(new bs.a(this, gVar) {
            final /* synthetic */ bu a;

            protected void a(bt btVar) {
                btVar.i().a(new CloseContentsRequest(this.a.a.f(), false), new at(this));
            }
        })).a(new com.google.android.gms.common.api.n<Status>(this) {
            final /* synthetic */ bu a;

            {
                this.a = r1;
            }

            public void a(Status status) {
                if (status.f()) {
                    by.a("DriveContentsImpl", "Contents discarded");
                } else {
                    by.c("DriveContentsImpl", "Error discarding contents");
                }
            }

            public /* synthetic */ void a(m mVar) {
                a((Status) mVar);
            }
        });
    }

    public ParcelFileDescriptor c() {
        if (!h()) {
            return this.a.a();
        }
        throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
    }

    public InputStream d() {
        if (h()) {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        } else if (this.a.e() != e.a_) {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        } else if (this.c) {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else {
            this.c = true;
            return this.a.c();
        }
    }

    public OutputStream e() {
        if (h()) {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else if (this.a.e() != e.c) {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        } else if (this.d) {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else {
            this.d = true;
            return this.a.d();
        }
    }

    public Contents f() {
        return this.a;
    }

    public void g() {
        o.a(this.a.a());
        this.b = true;
    }

    public boolean h() {
        return this.b;
    }
}
