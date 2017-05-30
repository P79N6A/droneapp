package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.c$c;
import com.google.android.gms.drive.h;
import com.google.android.gms.drive.l;
import com.google.android.gms.drive.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c implements h {
    protected final DriveId a;

    private abstract class d extends bs<com.google.android.gms.drive.h.a> {
        final /* synthetic */ c c;

        private d(c cVar, g gVar) {
            this.c = cVar;
            super(gVar);
        }

        public com.google.android.gms.drive.h.a a(Status status) {
            return new c(status, null);
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static class a extends bc {
        private final com.google.android.gms.internal.ahl.b<c$c> a;

        public a(com.google.android.gms.internal.ahl.b<c$c> bVar) {
            this.a = bVar;
        }

        public void a(Status status) {
            this.a.a(new g(status, null, false));
        }

        public void a(OnListParentsResponse onListParentsResponse) {
            this.a.a(new g(Status.a, new com.google.android.gms.drive.m(onListParentsResponse.b()), false));
        }
    }

    private static class b extends bc {
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.drive.h.a> a;

        public b(com.google.android.gms.internal.ahl.b<com.google.android.gms.drive.h.a> bVar) {
            this.a = bVar;
        }

        public void a(Status status) {
            this.a.a(new c(status, null));
        }

        public void a(OnMetadataResponse onMetadataResponse) {
            this.a.a(new c(Status.a, new bo(onMetadataResponse.a())));
        }
    }

    private static class c implements com.google.android.gms.drive.h.a {
        private final Status a;
        private final l b;

        public c(Status status, l lVar) {
            this.a = status;
            this.b = lVar;
        }

        public Status a() {
            return this.a;
        }

        public l b() {
            return this.b;
        }
    }

    public c(DriveId driveId) {
        this.a = driveId;
    }

    private i<com.google.android.gms.drive.h.a> a(g gVar, final boolean z) {
        return gVar.a(new d(this, gVar) {
            final /* synthetic */ c b;

            protected void a(bt btVar) {
                btVar.i().a(new GetMetadataRequest(this.b.a, z), new b(this));
            }
        });
    }

    public i<Status> a(g gVar, com.google.android.gms.drive.events.a aVar) {
        return ((bt) gVar.a(com.google.android.gms.drive.b.a)).a(gVar, this.a, aVar);
    }

    public i<Status> a(g gVar, Set<DriveId> set) {
        if (set == null) {
            throw new IllegalArgumentException("ParentIds must be provided.");
        }
        final List arrayList = new ArrayList(set);
        return gVar.b(new com.google.android.gms.drive.internal.bs.a(this, gVar) {
            final /* synthetic */ c b;

            protected void a(bt btVar) {
                btVar.i().a(new SetResourceParentsRequest(this.b.a, arrayList), new at(this));
            }
        });
    }

    public DriveId a() {
        return this.a;
    }

    public i<com.google.android.gms.drive.h.a> b(g gVar) {
        return a(gVar, false);
    }

    public i<Status> b(g gVar, com.google.android.gms.drive.events.a aVar) {
        return ((bt) gVar.a(com.google.android.gms.drive.b.a)).b(gVar, this.a, aVar);
    }

    public i<com.google.android.gms.drive.h.a> b(g gVar, final n nVar) {
        if (nVar != null) {
            return gVar.b(new d(this, gVar) {
                final /* synthetic */ c b;

                protected void a(bt btVar) {
                    nVar.j().a(btVar.B());
                    btVar.i().a(new UpdateMetadataRequest(this.b.a, nVar.j()), new b(this));
                }
            });
        }
        throw new IllegalArgumentException("ChangeSet must be provided.");
    }

    public i<c$c> c(g gVar) {
        return gVar.a(new h(this, gVar) {
            final /* synthetic */ c a;

            protected void a(bt btVar) {
                btVar.i().a(new ListParentsRequest(this.a.a), new a(this));
            }
        });
    }

    public i<Status> d(g gVar) {
        return gVar.b(new com.google.android.gms.drive.internal.bs.a(this, gVar) {
            final /* synthetic */ c a;

            protected void a(bt btVar) {
                btVar.i().a(new DeleteResourceRequest(this.a.a), new at(this));
            }
        });
    }

    public i<Status> e(g gVar) {
        return ((bt) gVar.a(com.google.android.gms.drive.b.a)).a(gVar, this.a);
    }

    public i<Status> f(g gVar) {
        return ((bt) gVar.a(com.google.android.gms.drive.b.a)).b(gVar, this.a);
    }

    public i<Status> g(g gVar) {
        return gVar.b(new com.google.android.gms.drive.internal.bs.a(this, gVar) {
            final /* synthetic */ c a;

            protected void a(bt btVar) {
                btVar.i().a(new TrashResourceRequest(this.a.a), new at(this));
            }
        });
    }

    public i<Status> h(g gVar) {
        return gVar.b(new com.google.android.gms.drive.internal.bs.a(this, gVar) {
            final /* synthetic */ c a;

            protected void a(bt btVar) {
                btVar.i().a(new UntrashResourceRequest(this.a.a), new at(this));
            }
        });
    }
}
