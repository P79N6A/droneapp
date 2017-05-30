package com.google.android.gms.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.games.c.e;

abstract class c$d extends c$a<e> {
    private c$d(g gVar) {
        super(gVar);
    }

    public e a(final Status status) {
        return new e(this) {
            final /* synthetic */ c$d b;

            public Status a() {
                return status;
            }

            public String b() {
                return null;
            }
        };
    }

    public /* synthetic */ m b(Status status) {
        return a(status);
    }
}
