package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl.b;
import com.google.android.gms.nearby.messages.internal.k.a;

final class v extends a {
    private final b<Status> a;
    private boolean b;

    private v(b<Status> bVar) {
        this.a = bVar;
    }

    static v a(b<Status> bVar) {
        return new v(bVar);
    }

    public void a(Status status) {
        if (!this.b) {
            this.a.a(status);
            this.b = true;
        }
    }
}
