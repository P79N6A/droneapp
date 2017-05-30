package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.g.f;
import com.google.android.gms.g.g;
import java.util.concurrent.CancellationException;

public class ain extends ahm {
    private g<Void> e = new g();

    private ain(aik com_google_android_gms_internal_aik) {
        super(com_google_android_gms_internal_aik);
        this.d.a("GmsAvailabilityHelper", (aij) this);
    }

    public static ain a(Activity activity) {
        aik b = aij.b(activity);
        ain com_google_android_gms_internal_ain = (ain) b.a("GmsAvailabilityHelper", ain.class);
        if (com_google_android_gms_internal_ain == null) {
            return new ain(b);
        }
        if (!com_google_android_gms_internal_ain.e.a().a()) {
            return com_google_android_gms_internal_ain;
        }
        com_google_android_gms_internal_ain.e = new g();
        return com_google_android_gms_internal_ain;
    }

    public void a(ConnectionResult connectionResult) {
        b(connectionResult, 0);
    }

    protected void a(ConnectionResult connectionResult, int i) {
        this.e.a(m.a(connectionResult));
    }

    protected void c() {
        int a = this.c.a(this.d.a());
        if (a == 0) {
            this.e.a(null);
        } else {
            a(new ConnectionResult(a, null));
        }
    }

    public void f() {
        super.f();
        this.e.a(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public f<Void> g() {
        return this.e.a();
    }
}
