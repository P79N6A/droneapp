package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.e.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.l;

public class h extends a {
    private final Context a;

    public h(Context context) {
        this.a = context;
    }

    private void b() {
        if (!l.c(this.a, Binder.getCallingUid())) {
            throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
        }
    }

    private void c() {
        j a = j.a(this.a);
        GoogleSignInAccount a2 = a.a();
        com.google.android.gms.common.api.a.a.a aVar = GoogleSignInOptions.d;
        if (a2 != null) {
            aVar = a.b();
        }
        g c = new g.a(this.a).a(com.google.android.gms.auth.api.a.f, aVar).c();
        try {
            if (c.f().b()) {
                if (a2 != null) {
                    com.google.android.gms.auth.api.a.k.d(c);
                } else {
                    c.i();
                }
            }
            c.g();
        } catch (Throwable th) {
            c.g();
        }
    }

    public void a() {
        b();
        c();
    }
}
