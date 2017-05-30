package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.awareness.d;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.awareness.fence.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.contextmanager.internal.c.a;
import com.google.android.gms.internal.ahl.b;

public class c implements d {
    public i<com.google.android.gms.awareness.fence.c> a(g gVar, final FenceQueryRequest fenceQueryRequest) {
        return gVar.a(new a(this, gVar) {
            final /* synthetic */ c b;

            protected void a(com.google.android.gms.contextmanager.internal.d dVar) {
                dVar.a((b) this, (FenceQueryRequestImpl) fenceQueryRequest);
            }
        });
    }

    public i<Status> a(g gVar, final e eVar) {
        return gVar.a(new com.google.android.gms.contextmanager.internal.c.c(this, gVar) {
            final /* synthetic */ c b;

            protected void a(com.google.android.gms.contextmanager.internal.d dVar) {
                dVar.a((b) this, (FenceUpdateRequestImpl) eVar);
            }
        });
    }
}
