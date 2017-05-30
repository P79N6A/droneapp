package com.google.android.gms.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

abstract class c$f extends c$a<c$g> {
    public c$g a(final Status status) {
        return new c$g(this) {
            final /* synthetic */ c$f b;

            public Status a() {
                return status;
            }
        };
    }

    public /* synthetic */ m b(Status status) {
        return a(status);
    }
}
