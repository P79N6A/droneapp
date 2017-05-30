package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.g;
import com.google.android.gms.internal.ahl.b;

class f$2 extends f$a {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ f b;

    f$2(f fVar, g gVar, PendingIntent pendingIntent) {
        this.b = fVar;
        this.a = pendingIntent;
        super(gVar);
    }

    protected void a(l lVar) {
        lVar.a(this.a, (b) this);
    }
}
