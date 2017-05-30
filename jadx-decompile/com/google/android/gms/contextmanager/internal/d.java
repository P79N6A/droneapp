package com.google.android.gms.contextmanager.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.awareness.b;
import com.google.android.gms.awareness.fence.i;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.awareness.snapshot.internal.m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.e;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.st.a;
import com.google.android.gms.internal.sx;

public class d extends w<i> {
    private static a a = a.a;
    private final Looper e;
    private final ContextManagerClientInfo f;
    private sx<i, e> g;

    public d(Context context, Looper looper, s sVar, b bVar, g.b bVar2, c cVar) {
        super(context, looper, 47, sVar, bVar2, cVar);
        this.e = looper;
        String str = sVar.b() == null ? "@@ContextManagerNullAccount@@" : sVar.b().name;
        this.f = bVar == null ? ContextManagerClientInfo.a(context, str) : ContextManagerClientInfo.a(context, str, bVar);
    }

    public static Handler a(Looper looper) {
        return a == null ? a.a.a(looper) : a.a(looper);
    }

    private sx<i, e> h() {
        if (this.g == null) {
            this.g = new sx(this.e, e.a);
        }
        return this.g;
    }

    public boolean H() {
        return false;
    }

    protected i a(IBinder iBinder) {
        return i.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.contextmanager.service.ContextManagerService.START";
    }

    public void a(ahl.b<m> bVar, SnapshotRequest snapshotRequest) {
        F();
        ((i) G()).a(f.a((ahl.b) bVar), this.f.d(), this.f.b(), this.f.f(), snapshotRequest);
    }

    public void a(ahl.b<com.google.android.gms.awareness.fence.c> bVar, FenceQueryRequestImpl fenceQueryRequestImpl) {
        F();
        ((i) G()).a(f.b(bVar), this.f.d(), this.f.b(), this.f.f(), fenceQueryRequestImpl);
    }

    public void a(ahl.b<Status> bVar, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        F();
        fenceUpdateRequestImpl.a(h());
        ((i) G()).a(f.a((ahl.b) bVar, null), this.f.d(), this.f.b(), this.f.f(), fenceUpdateRequestImpl);
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.contextmanager.internal.IContextManagerService";
    }

    protected Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.google.android.contextmanager.service.args", this.f.m());
        return bundle;
    }
}
