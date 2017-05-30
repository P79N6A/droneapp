package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ahl.a;

public class ahv implements ahz {
    private final aia a;
    private boolean b = false;

    public ahv(aia com_google_android_gms_internal_aia) {
        this.a = com_google_android_gms_internal_aia;
    }

    private <A extends c> void c(a<? extends m, A> aVar) {
        this.a.i.k.a((ahn) aVar);
        c b = this.a.i.b(aVar.g());
        if (b.t() || !this.a.d.containsKey(aVar.g())) {
            if (b instanceof i) {
                b = ((i) b).h();
            }
            aVar.b(b);
            return;
        }
        aVar.c(new Status(17));
    }

    public <A extends c, R extends m, T extends a<R, A>> T a(T t) {
        return b(t);
    }

    public void a() {
    }

    public void a(int i) {
        this.a.a(null);
        this.a.j.a(i, this.b);
    }

    public void a(Bundle bundle) {
    }

    public void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, int i) {
    }

    public <A extends c, T extends a<? extends m, A>> T b(T t) {
        try {
            c(t);
        } catch (DeadObjectException e) {
            this.a.a(new a(this, this) {
                final /* synthetic */ ahv a;

                public void a() {
                    this.a.a(1);
                }
            });
        }
        return t;
    }

    public boolean b() {
        if (this.b) {
            return false;
        }
        if (this.a.i.p()) {
            this.b = true;
            for (aiw a : this.a.i.j) {
                a.a();
            }
            return false;
        }
        this.a.a(null);
        return true;
    }

    public void c() {
        if (this.b) {
            this.b = false;
            this.a.a(new a(this, this) {
                final /* synthetic */ ahv a;

                public void a() {
                    this.a.a.j.a(null);
                }
            });
        }
    }

    void d() {
        if (this.b) {
            this.b = false;
            this.a.i.k.a();
            b();
        }
    }
}
