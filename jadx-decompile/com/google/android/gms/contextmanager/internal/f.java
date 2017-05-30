package com.google.android.gms.contextmanager.internal;

import com.google.android.gms.awareness.fence.c;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.d;
import com.google.android.gms.contextmanager.e;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.internal.ahl.b;
import com.google.android.gms.internal.sw;

public class f extends com.google.android.gms.contextmanager.internal.h.a {
    private final a a;
    private b<Status> b;
    private b<e> c;
    private b<t> d;
    private b<d> e;
    private b<m> f;
    private b<c> g;

    public interface a {
        void a(Status status);
    }

    private f(b<Status> bVar, b<e> bVar2, b<t> bVar3, b<d> bVar4, b<m> bVar5, b<c> bVar6, a aVar) {
        this.b = bVar;
        this.c = bVar2;
        this.d = bVar3;
        this.e = bVar4;
        this.f = bVar5;
        this.g = bVar6;
        this.a = aVar;
    }

    public static f a(b<m> bVar) {
        return new f(null, null, null, null, bVar, null, null);
    }

    public static f a(b<Status> bVar, a aVar) {
        return new f(bVar, null, null, null, null, null, aVar);
    }

    public static f b(b<c> bVar) {
        return new f(null, null, null, null, null, bVar, null);
    }

    public void a(Status status) {
        if (this.b == null) {
            sw.b("ContextManagerPendingResult", "Unexpected callback to onStatusResult.");
            return;
        }
        this.b.a(status);
        this.b = null;
        if (this.a != null) {
            this.a.a(status);
        }
    }

    public void a(final Status status, final Snapshot snapshot) {
        if (this.f == null) {
            sw.b("ContextManagerPendingResult", "Unexpected callback to onSnapshotResult");
            return;
        }
        this.f.a(new m(this) {
            final /* synthetic */ f c;

            public Status a() {
                return status;
            }

            public Snapshot b() {
                return snapshot;
            }
        });
        this.f = null;
    }

    public void a(final Status status, final DataHolder dataHolder) {
        if (this.e == null) {
            sw.b("ContextManagerPendingResult", "Unexpected callback to onStateResult");
            return;
        }
        this.e.a(new d(this) {
            final /* synthetic */ f c;
            private final com.google.android.gms.contextmanager.a d;

            public Status a() {
                return status;
            }
        });
        this.e = null;
    }

    public void a(final Status status, final DataHolder dataHolder, final DataHolder dataHolder2) {
        if (this.c == null) {
            sw.b("ContextManagerPendingResult", "Unexpected callback to onReadResult.");
            return;
        }
        this.c.a(new e(this) {
            final /* synthetic */ f d;
            private final com.google.android.gms.contextmanager.a e;
            private final com.google.android.gms.contextmanager.f f;

            public Status a() {
                return status;
            }
        });
        this.c = null;
    }

    public void a(final Status status, final FenceStateMapImpl fenceStateMapImpl) {
        if (this.g == null) {
            sw.b("ContextManagerPendingResult", "Unexpected callback to onFenceQueryResult");
        } else {
            this.g.a(new c(this) {
                final /* synthetic */ f c;

                public Status a() {
                    return status;
                }

                public com.google.android.gms.awareness.fence.d b() {
                    return fenceStateMapImpl;
                }
            });
        }
    }

    public void a(final Status status, final WriteBatchImpl writeBatchImpl) {
        if (this.d == null) {
            sw.b("ContextManagerPendingResult", "Unexpected callback to onWriteBatchResult");
            return;
        }
        this.d.a(new t(this) {
            final /* synthetic */ f c;

            public Status a() {
                return status;
            }
        });
        this.d = null;
    }
}
