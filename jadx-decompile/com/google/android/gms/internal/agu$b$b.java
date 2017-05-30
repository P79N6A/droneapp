package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.agu.a;
import com.google.android.gms.internal.agu.b;
import com.google.android.gms.internal.agu.c;

protected final class agu$b$b extends a {
    final /* synthetic */ b b;

    protected agu$b$b(b bVar) {
        this.b = bVar;
        super(bVar.c);
    }

    public void a() {
        agu.a().b("onDisconnected", new Object[0]);
        agu.a(this.b.c);
        this.b.b(new c(Status.a));
    }

    public void a(int i) {
        agu.a().b("onError: %d", new Object[]{Integer.valueOf(i)});
        agu.a(this.b.c);
        this.b.b(new c(Status.c));
    }
}
